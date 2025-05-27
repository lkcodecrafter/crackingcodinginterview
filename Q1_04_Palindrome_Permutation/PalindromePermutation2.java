public class PalindromePermutation {
    public static boolean isPalindromePermutation(String s) {
        // Normalize the string: ignore spaces, convert to lowercase
        s = s.replaceAll("\\s", "").toLowerCase();

        // Assuming only ASCII characters (or we can limit to 'a' to 'z')
        int[] count = new int[26];  // Only for lowercase a–z
        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                count[c - 'a']++;
            }
        }

        int oddCount = 0;
        for (int c : count) {
            if (c % 2 != 0) {
                oddCount++;
                if (oddCount > 1) {
                    return false; // More than one odd character count is not allowed
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindromePermutation("taco cat"));   // true
        System.out.println(isPalindromePermutation("racecar"));    // true
        System.out.println(isPalindromePermutation("hello"));      // false
    }
}

