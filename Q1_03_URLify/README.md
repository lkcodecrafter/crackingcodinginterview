# 🌐 URLify: Replace Spaces with `%20`

## 📘 Problem Statement
Write a method to replace **all spaces** in a string with **`%20`**.

- Assume the string has enough space at the end to hold the extra characters.
- You are given the **true length** of the string (not including extra buffer).

> 💡 If implementing in Java, use a **character array** to perform the operation **in-place**.

---

## 💡 Approach

### Step-by-Step 🪜

1. 🔢 **Count Spaces**  
   Count how many spaces are in the string within the true length.

2. 📏 **Calculate New Length**  
   Each space requires 2 extra characters (`' '` → `'%20'`):  

newLength = trueLength + 2 × numberOfSpaces


3. 🔄 **Traverse from the End**  
- Start from the **end of the true length**.
- Use a pointer at the **end of the new length**.
- Move characters **backward** in the array:
  - 🆗 If not a space → copy the character to the new end.
  - ␣ If a space → insert `'0'`, `'2'`, `'%'` in reverse order.

4. ✅ **Done** when all characters up to the true length are processed.

---

## 🛠️ Example

Input:

"Mr John Smith " (true length: 13)


Output:

"Mr%20John%20Smith"


---

## 🧠 Time & Space Complexity

- **Time**: O(n) – Every character is processed once.
- **Space**: O(1) – Operation is in-place using extra buffer already provided.

---

## 🚀 Tip

When working in **C/C++**, use a character array with enough space.  
In **Python**, strings are immutable, so simulate the in-place logic with a list if needed.

---


