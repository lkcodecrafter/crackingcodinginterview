public class URLify {

    public static void replaceSpaces(char[] str, int trueLength) {
        int spaceCount = 0;

        // 1️⃣ Count the number of spaces
        for (int i = 0; i < trueLength; i++) {
            if (str[i] == ' ') {
                spaceCount++;
            }
        }

        // 2️⃣ Calculate new length
        int index = trueLength + spaceCount * 2;

        // ⚠️ Check to avoid overflow
        if (index > str.length) {
            throw new IllegalArgumentException("Insufficient space in array to perform URLify.");
        }

        // 3️⃣ Modify the array from end
        for (int i = trueLength - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index -= 3;
            } else {
                str[index - 1] = str[i];
                index--;
            }
        }
    }

    public static void main(String[] args) {
        String input = "Mr John Smith    "; // total length = 17
        int trueLength = 13;

        char[] charArray = input.toCharArray();
        replaceSpaces(charArray, trueLength);

        System.out.println("URLified String: " + new String(charArray));
    }
}

