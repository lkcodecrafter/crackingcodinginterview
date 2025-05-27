public class PalindromePermutation {
    public static boolean isPalindromePermutation(String s) {
        s = s.replaceAll("\\s", "").toLowerCase();

        int bitVector = 0;

        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                int mask = 1 << (c - 'a');
                bitVector ^= mask; // Toggle the bit
            }
        }

        // Check if at most one bit is set in bitVector
        return bitVector == 0 || (bitVector & (bitVector - 1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPalindromePermutation("taco cat"));   // true
        System.out.println(isPalindromePermutation("racecar"));    // true
        System.out.println(isPalindromePermutation("hello"));      // false
    }
}

/*
 *
 *🧪 How It Works
We toggle each character's bit.

At the end:

bitVector == 0 → all characters had even counts.

bitVector & (bitVector - 1) == 0 → exactly one bit is set, which means only one character had an odd count.

⚡ Benefits
Feature	Value
Time	O(n)
Space	O(1) — just 1 int
Speed	Extremely fast
Cleverness	High 🤓


 * */
