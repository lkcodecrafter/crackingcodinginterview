# Is Unique - Cracking the Coding Interview

This repository contains solutions and explanations for the problem:

> **"Implement an algorithm to determine if a string has all unique characters."**  
> *(Cracking the Coding Interview – Chapter 1, Question 1)*

---

## 🧠 Problem Statement

Given a string, determine if it has all unique characters.  
What if **you cannot use additional data structures**?

---

## ✅ Approaches

### **Approach 1: Using a Data Structure**

- Use a **boolean array** or **HashSet** to keep track of characters seen so far.
- Iterate through the string:
  - If the character is already in the set, return `false`.
  - Else, add it to the set.
  
#### 🕒 Time Complexity:
- O(n), where n is the length of the string

#### 💾 Space Complexity:
- O(1) if using a fixed-size array for ASCII (128)
- O(n) if using a HashSet

---

### **Approach 2: Without Using Additional Data Structures**

- Use **two nested loops** to compare every character with every other character.
- If any duplicate is found, return `false`.

#### 🕒 Time Complexity:
- O(n²)

#### 💾 Space Complexity:
- O(1)

---

### **Approach 3 (Optional - Advanced): Using Bit Manipulation**

> ⚠️ Only works if the string contains **only lowercase a–z** characters.

- Use an **integer as a bit vector** to mark seen characters.
- For each character:
  - Compute its bit index: `val = ch - 'a'`
  - Check if the bit at position `val` is already set.
  - If so, return `false`; else set it.

#### 🕒 Time Complexity:
- O(n)

#### 💾 Space Complexity:
- O(1) — only one integer used

---

## 🛠️ Language
- Java

---

## 📁 Folder Structure

