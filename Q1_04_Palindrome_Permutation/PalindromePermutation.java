import java.util.HashMap;

public class PalindromePermutation {
    public static boolean isPalindromePermutation(String s) {
        // Normalize the string: remove spaces and convert to lowercase
        s = s.replaceAll("\\s", "").toLowerCase();

        // Count frequency of each character
        HashMap<Character, Integer> freq = new HashMap<>();

        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        // Count how many characters have odd frequency
        int oddCount = 0;
        for (int count : freq.values()) {
            if (count % 2 != 0) {
                oddCount++;
                if (oddCount > 1) {
                    return false;
                }
            }
        }

        return true;
    }

    // Example usage
    public static void main(String[] args) {
        System.out.println(isPalindromePermutation("taco cat"));  // true
        System.out.println(isPalindromePermutation("racecar"));   // true
        System.out.println(isPalindromePermutation("hello"));     // false
    }
}

