# Advanced Interview Patterns

> **Module 19 – Pattern Programming**

---

## 1. Introduction

Advanced pattern problems combine the concepts learned in the previous chapters.

They may involve:

- Nested loops
- Multiple sections
- Spaces
- Numbers
- Characters
- Conditions
- Mathematical formulas
- Symmetry
- Counters

The goal is not to memorize these patterns.

The goal is to learn how to **derive the logic of an unseen pattern**.

---

## 2. Why Advanced Patterns?

Basic patterns teach:

```text
Loops
```

Intermediate patterns teach:

```text
Loops + Formulas
```

Advanced patterns teach:

```text
Loops
+
Formulas
+
Conditions
+
Decomposition
+
Problem Solving
```

This is much closer to the thinking required in DSA and coding interviews.

---

## 3. Pattern-Solving Framework ⭐

Whenever an interviewer gives you a new pattern:

```text
Step 1 → Observe the pattern

Step 2 → Count rows

Step 3 → Identify spaces

Step 4 → Identify symbols

Step 5 → Find row-column relationship

Step 6 → Find mathematical formula

Step 7 → Divide into sections if necessary

Step 8 → Write loops

Step 9 → Dry run

Step 10 → Verify complexity
```

---

## 4. Golden Rule

Never start coding immediately.

First write:

```text
Rows = ?

Spaces = ?

Symbols = ?

Symbol Value = ?

Condition = ?
```

Then convert each observation into a loop or condition.

---

# 5. Pattern 1 – Floyd's Triangle

Output:

```text
1
2 3
4 5 6
7 8 9 10
```

This pattern uses a **counter**.

### Logic

```text
Rows = n
Columns = row
Value = counter
```

The counter continues across rows.

### Code

```java
public class FloydTriangle {

    public static void main(String[] args) {

        int n = 4;
        int num = 1;

        for(int row = 1; row <= n; row++) {

            for(int col = 1; col <= row; col++) {

                System.out.print(num + " ");
                num++;
            }

            System.out.println();
        }
    }
}
```

---

## 6. Pattern Thinking

Notice:

```text
Row 1 → 1 number
Row 2 → 2 numbers
Row 3 → 3 numbers
Row 4 → 4 numbers
```

Therefore:

```text
Columns = row
```

The value does not restart at every row.

Instead:

```text
1 → 2 → 3 → 4 → 5 → ...
```

This requires a counter.

---

# 7. Pattern 2 – Palindromic Number Pyramid

Output:

```text
   1
  121
 12321
1234321
```

This pattern combines:

- Spaces
- Increasing numbers
- Decreasing numbers

### Formula

```text
Spaces = n - row
```

First half:

```text
1 → row
```

Second half:

```text
row - 1 → 1
```

### Code

```java
int n = 4;

for(int row = 1; row <= n; row++) {

    // Spaces
    for(int space = 1; space <= n - row; space++) {
        System.out.print(" ");
    }

    // Increasing numbers
    for(int col = 1; col <= row; col++) {
        System.out.print(col);
    }

    // Decreasing numbers
    for(int col = row - 1; col >= 1; col--) {
        System.out.print(col);
    }

    System.out.println();
}
```

---

## 8. Dry Run

For:

```text
row = 3
```

Increasing:

```text
123
```

Decreasing:

```text
21
```

Combined:

```text
12321
```

---

# 9. Pattern 3 – Number Diamond

Output:

```text
   1
  123
 12345
1234567
 12345
  123
   1
```

This is a combination of:

```text
Full Pyramid
+
Inverted Pyramid
```

### Formula

```text
Spaces = n - row
Numbers = 2 * row - 1
```

Upper:

```text
row = 1 → n
```

Lower:

```text
row = n - 1 → 1
```

---

# 10. Pattern 4 – Hollow Diamond

Output:

```text
   *
  * *
 *   *
*     *
 *   *
  * *
   *
```

The diamond has:

```text
Upper Hollow Pyramid
+
Lower Hollow Pyramid
```

The important idea is to identify:

```text
Left Boundary
Right Boundary
```

and print stars only on those boundaries.

---

# 11. Pattern 5 – Number Palindrome Diamond

Example:

```text
   1
  121
 12321
1234321
 12321
  121
   1
```

This combines:

```text
Spaces
+
Increasing Numbers
+
Decreasing Numbers
+
Upper/Lower Halves
```

This is a good placement-level problem because several formulas must work together.

---

# 12. Pattern 6 – Alternating Star Pattern

Example:

```text
*
**
***
****
*****
```

A variation may use:

```text
*
**
*
**
*
```

The important part is recognizing that the output depends on a condition.

Example:

```java
if(row % 2 == 1) {
    // odd row
}
```

---

# 13. Pattern 7 – 0-1 Triangle

Output:

```text
1
01
101
0101
10101
```

The value depends on the relationship between row and column.

One common formula is:

```text
(row + col) % 2
```

### Code

```java
int n = 5;

for(int row = 1; row <= n; row++) {

    for(int col = 1; col <= row; col++) {

        System.out.print((row + col) % 2);

    }

    System.out.println();
}
```

Depending on whether you want the pattern to start with `1` or `0`, adjust the formula accordingly.

---

# 14. Pattern 8 – Character Progression

Output:

```text
A
BC
DEF
GHIJ
```

This requires a character counter.

### Code

```java
char ch = 'A';

for(int row = 1; row <= 4; row++) {

    for(int col = 1; col <= row; col++) {

        System.out.print(ch);
        ch++;
    }

    System.out.println();
}
```

---

# 15. Pattern 9 – Repeated Character Pyramid

Output:

```text
A
BB
CCC
DDDD
EEEEE
```

Here the character depends on the row.

Formula:

```text
Character = row
```

Example:

```java
System.out.print((char)('A' + row - 1));
```

---

# 16. Pattern 10 – Alternating Character Pattern

Example:

```text
A
BA
ABA
BABA
ABABA
```

The character can depend on:

```text
(row + col) % 2
```

This is an example of a pattern where a **condition determines the printed value**.

---

# 17. Advanced Pattern Thinking ⭐

At this level, don't ask:

> "Which pattern is this?"

Instead ask:

```text
What changes?

What stays constant?

What depends on row?

What depends on column?

What depends on row + column?

What needs a counter?

What needs a condition?
```

---

# 18. Important Formula Collection

## Half Pyramid

```text
Stars = row
```

## Inverted Pyramid

```text
Stars = n - row + 1
```

## Full Pyramid

```text
Spaces = n - row
Stars = 2 * row - 1
```

## Butterfly

```text
Stars = row
Spaces = 2 * (n - row)
```

## Floyd's Triangle

```text
Columns = row
Value = counter
```

## 0-1 Pattern

```text
Value depends on:
(row + col) % 2
```

## Palindrome Pyramid

```text
Increasing
+
Decreasing
```

---

# 19. Pattern Decomposition ⭐

Complex patterns should be divided.

For example:

### Diamond

```text
Upper Pyramid
+
Lower Pyramid
```

### Palindrome Pyramid

```text
Spaces
+
Increasing Numbers
+
Decreasing Numbers
```

### Butterfly

```text
Left Stars
+
Middle Spaces
+
Right Stars
```

This is called **problem decomposition**.

---

# 20. Interview Strategy

If the interviewer gives an unfamiliar pattern:

### Step 1

Ask for the number of rows if it is not specified.

### Step 2

Write the expected output for a small value such as:

```text
n = 3
```

### Step 3

Create a row table:

```text
Row | Spaces | Symbols | Value
```

### Step 4

Find the formulas.

### Step 5

Explain your approach before coding.

### Step 6

Write the simplest correct solution.

### Step 7

Dry run your code.

---

# 21. Example Interview Analysis

Suppose the interviewer gives:

```text
   1
  123
 12345
1234567
```

Don't immediately code.

Analyze:

```text
Rows = 4
```

Spaces:

```text
3, 2, 1, 0
```

Formula:

```text
n - row
```

Numbers:

```text
1, 3, 5, 7
```

Formula:

```text
2 * row - 1
```

Now the code becomes obvious.

---

# 22. Common Interview Mistakes

### ❌ Memorizing patterns

You may forget the code when the interviewer changes the pattern.

### ❌ Coding immediately

You may miss the formula.

### ❌ Ignoring spaces

Spaces are often the main difficulty.

### ❌ Not explaining the logic

Interviewers want to understand your thought process.

### ❌ Not dry-running

Small mistakes in loop boundaries can change the entire output.

---

# 23. Complexity Analysis

Most pattern programs use nested loops.

Typical complexity:

```text
Time = O(n²)
Space = O(1)
```

However, always analyze the actual loops rather than blindly stating `O(n²)`.

---

# 24. Optimization

For normal pattern-printing problems, optimization is rarely the main goal.

Focus on:

```text
Correctness
↓
Readable Logic
↓
Proper Complexity
```

Do not make the code unnecessarily complicated.

---

# 25. Pattern Interview Checklist ⭐

Before submitting your solution:

```text
☐ Correct number of rows
☐ Correct number of spaces
☐ Correct number of symbols
☐ Correct symbol/value
☐ Correct conditions
☐ Correct newline
☐ No duplicate rows
☐ Dry run completed
☐ Complexity understood
```

---

# 26. Placement-Level Practice

Try solving these without looking at the solution.

### Problem 1

```text
1
12
123
1234
12345
```

### Problem 2

```text
12345
1234
123
12
1
```

### Problem 3

```text
   *
  ***
 *****
*******
```

### Problem 4

```text
   1
  121
 12321
1234321
```

### Problem 5

```text
*      *
**    **
***  ***
********
***  ***
**    **
*      *
```

### Problem 6

```text
1
01
101
0101
10101
```

---

# 27. Connection with DSA

Pattern Programming teaches skills that transfer to DSA:

```text
Pattern
   ↓
Nested Loops
   ↓
Conditions
   ↓
Row/Column Relationships
   ↓
2D Arrays
   ↓
Matrices
   ↓
Algorithmic Thinking
```

The formulas themselves are less important than the **problem-solving process**.

---

# 28. Bootcamp Insight 💡

At the placement level, your goal is not:

> "I know 50 patterns."

Your goal is:

> "Give me a new pattern and I can derive the logic."

That is the real skill.

---

# 29. Quick Revision

```text
1. Observe
      ↓
2. Count Rows
      ↓
3. Count Spaces
      ↓
4. Count Symbols
      ↓
5. Identify Value
      ↓
6. Find Formula
      ↓
7. Divide Pattern
      ↓
8. Write Loops
      ↓
9. Add Conditions
      ↓
10. Dry Run
```

---

# 30. Key Takeaways

- Advanced patterns combine multiple concepts.
- Use decomposition for complex patterns.
- Identify row, column, space, and value relationships.
- Use counters when values continue across rows.
- Use conditions when output depends on a rule.
- Never rely only on memorization.
- Explain your logic during interviews.
- Pattern thinking prepares you for DSA.

---

# 31. Final Advanced Pattern Formula Sheet

```text
HALF PYRAMID
Columns = row
```

```text
INVERTED PYRAMID
Columns = n - row + 1
```

```text
FULL PYRAMID
Spaces = n - row
Stars = 2 * row - 1
```

```text
BUTTERFLY
Stars = row
Spaces = 2 * (n - row)
```

```text
DIAMOND
Upper = increasing pyramid
Lower = decreasing pyramid
```

```text
HOLLOW RECTANGLE
Top/Bottom/Left/Right boundary
```

```text
FLOYD'S TRIANGLE
Columns = row
Value = counter
```

```text
0-1 PATTERN
Value based on (row + col) % 2
```

---

# 32. References

- Oracle Java Documentation
- Java Language Specification
- Effective Java – Joshua Bloch
- Head First Java

---

## Module 19 Progress

```text
✅ 01_Introduction.md
✅ 02_WhyPatternProgramming.md
✅ 03_PatternThinking.md
✅ 04_RectangleAndSquarePatterns.md
✅ 05_StarPatterns.md
✅ 06_HalfPyramidPatterns.md
✅ 07_InvertedPatterns.md
✅ 08_NumberPatterns.md
✅ 09_AlphabetPatterns.md
✅ 10_FullPyramidPatterns.md
✅ 11_DiamondPatterns.md
✅ 12_ButterflyPatterns.md
✅ 13_HollowPatterns.md
✅ 14_AdvancedInterviewPatterns.md

⏳ 15_PatternCheatSheet.md
```