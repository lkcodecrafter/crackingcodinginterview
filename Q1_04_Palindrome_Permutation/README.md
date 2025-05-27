# 🧩 Palindrome Permutation

## 📘 Problem Statement
Given a string, check if it is a permutation of a palindrome.

- A **palindrome** is a word or phrase that reads the same forwards and backwards.
- A **permutation** is a rearrangement of letters.

📝 Note: The palindrome does not need to be a real dictionary word.

---

## 🚀 Approach

To check if a string is a permutation of a palindrome, follow these steps:

1. 🔤 **Normalize the string**
   - Ignore spaces and non-letter characters.
   - Convert all letters to the same case (e.g., lowercase) for consistency.

2. 🔢 **Count character frequencies**
   - Use a hashmap or array to count how many times each character appears.

3. 🧠 **Check for odd counts**
   - A valid palindrome permutation can have:
     - **At most one** character with an odd frequency (for odd-length palindromes).
     - **All characters** with even frequencies (for even-length palindromes).

4. ✅ **Decision**
   - If the number of characters with odd frequency is `≤ 1`, return `true`.
   - Otherwise, return `false`.

---

## ⏱️ Time Complexity

- **O(n)** where `n` is the length of the input string.

---

## 📦 Example

```text
Input:  "taco cat"
Output: true  // Permutations: "tacocat", "atcocta", etc.

