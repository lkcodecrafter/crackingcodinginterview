# One Away

## Problem Statement

There are three types of edits that can be performed on strings:

- Insert a character  
- Remove a character  
- Replace a character  

Write a function to check if two strings are **one edit (or zero edits)** away.

## Examples

| Input         | Output |
|---------------|--------|
| pale, ple     | true   |
| pales, pale   | true   |
| pale, bale    | true   |
| pale, bae     | false  |

---

## Approach

### Step-by-step Logic

1. **Check the length difference**:
   - If the length difference between the two strings is more than 1, return `false`.

2. **Same length (Check for replacement)**:
   - Compare characters of both strings.
   - Count how many characters are different.
   - If more than 1 mismatch, return `false`.

3. **Length difference is 1 (Insert or Remove)**:
   - Identify the shorter and longer string.
   - Use two pointers to compare characters.
   - Allow **at most one mismatch** where you skip a character in the longer string.

4. **Zero edits is acceptable**:
   - If strings are identical, return `true`.

---

## Java Solution

```java
public class OneAway {

    public static boolean oneAway(String first, String second) {
        if (Math.abs(first.length() - second.length()) > 1) {
            return false;
        }

        if (first.length() == second.length()) {
            return checkReplace(first, second);
        }

        if (first.length() < second.length()) {
            return checkInsert(first, second);
        } else {
            return checkInsert(second, first);
        }
    }

    private static boolean checkReplace(String s1, String s2) {
        boolean foundDifference = false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (foundDifference) {
                    return false;
                }
                foundDifference = true;
            }
        }
        return true;
    }

    private static boolean checkInsert(String shorter, String longer) {
        int index1 = 0, index2 = 0;
        boolean foundDifference = false;

        while (index1 < shorter.length() && index2 < longer.length()) {
            if (shorter.charAt(index1) != longer.charAt(index2)) {
                if (foundDifference) {
                    return false;
                }
                foundDifference = true;
                index2++; // Skip a character in longer string
            } else {
                index1++;
                index2++;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(oneAway("pale", "ple"));   // true
        System.out.println(oneAway("pales", "pale")); // true
        System.out.println(oneAway("pale", "bale"));  // true
        System.out.println(oneAway("pale", "bae"));   // false
    }
}
```

---

## Dry Run Example: `pale` vs `ple`

- Length difference = 1 → check insert/remove
- Longer string: "pale", shorter string: "ple"
- Compare characters using two pointers:

| i (shorter) | j (longer) | Characters          | Action                  |
|-------------|------------|---------------------|-------------------------|
| 0           | 0          | p == p              | Move both pointers       |
| 1           | 1          | l != a              | First mismatch: skip longer pointer (j++) |
| 1           | 2          | l == l              | Move both pointers       |
| 2           | 3          | e == e              | Move both pointers       |

- Only one mismatch found → return `true`.

---

## Complexity

- **Time Complexity:** O(N), where N is the length of the shorter string.
- **Space Complexity:** O(1), constant extra space.
