# Check Permutation

This repository contains a solution to the classic interview problem:

> **"Given two strings, write a method to decide if one is a permutation of the other."**

## 🔍 Problem Description

Two strings are considered permutations of each other if they contain the **same characters** with the **same frequencies**, but possibly in a different order.

### 🧠 Example:
```bash
Input:  s1 = "listen", s2 = "silent"
Output: true

Input:  s1 = "abc", s2 = "abz"
Output: false

## 🚀 Approaches

### ✅ Approach 1: Sort and Compare

**Logic:**

If two strings are permutations, sorting them should result in the exact same string.

**Steps:**
1. Check if lengths are equal.
2. Sort both strings.
3. Compare the sorted strings.

**Time Complexity:** O(n log n)  
**Space Complexity:** O(n) (depending on sorting implementation)

---

### ✅ Approach 2: Count Characters (Optimized)

**Logic:**

If two strings are permutations, they must have the same frequency for every character.

**Steps:**
1. Check if lengths are equal.
2. Create an integer array of size 256 (assuming ASCII character set).
3. Traverse the first string and increment the count for each character.
4. Traverse the second string and decrement the count.
5. If any count goes negative, return false.
6. If all counts are zero, the strings are permutations.

**Time Complexity:** O(n)  
**Space Complexity:** O(1) (fixed size array for ASCII characters)

