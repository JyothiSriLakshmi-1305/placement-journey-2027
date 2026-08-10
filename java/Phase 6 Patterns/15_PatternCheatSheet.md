# Pattern Programming Cheat Sheet

> **Module 19 – Java Pattern Programming**
>
> A quick-reference guide for revision, coding practice, and placement preparation.

---

# 1. Pattern Programming Mindset ⭐

Never start coding immediately.

First observe:

```text
1. How many rows?
2. How many columns?
3. How many spaces?
4. How many symbols?
5. What value is printed?
6. Does it depend on row?
7. Does it depend on column?
8. Is there a condition?
9. Does the pattern have multiple sections?
```

Then convert the observation into loops and formulas.

---

# 2. Universal Pattern Structure

Most patterns follow:

```java
for(int row = 1; row <= n; row++) {

    // spaces

    // symbols / numbers / characters

    System.out.println();
}
```

For more complex patterns:

```java
for(int row = 1; row <= n; row++) {

    // Part 1

    // Part 2

    // Part 3

    System.out.println();
}
```

---

# 3. Most Important Pattern Formulas ⭐⭐⭐

## Half Pyramid

```text
Stars = row
```

Example:

```text
*
**
***
****
*****
```

---

## Inverted Half Pyramid

```text
Stars = n - row + 1
```

Example:

```text
*****
****
***
**
*
```

---

## Full Pyramid

```text
Spaces = n - row
Stars  = 2 * row - 1
```

Example:

```text
    *
   ***
  *****
 *******
```

---

## Inverted Full Pyramid

```text
Spaces = row - 1
Stars  = 2 * (n - row) + 1
```

Example:

```text
*******
 *****
  ***
   *
```

---

## Butterfly

```text
Left Stars  = row
Spaces      = 2 * (n - row)
Right Stars = row
```

Example:

```text
*      *
**    **
***  ***
********
***  ***
**    **
*      *
```

---

## Diamond

```text
Upper Half:
row = 1 → n

Lower Half:
row = n - 1 → 1
```

Example:

```text
   *
  ***
 *****
*******
 *****
  ***
   *
```

---

# 4. Rectangle Patterns

## Solid Rectangle

```text
*****
*****
*****
*****
```

Code:

```java
for(int row = 1; row <= rows; row++) {

    for(int col = 1; col <= cols; col++) {
        System.out.print("*");
    }

    System.out.println();
}
```

---

## Hollow Rectangle

Boundary condition:

```java
if(row == 1 || row == rows ||
   col == 1 || col == cols)
```

Example:

```text
*****
*   *
*   *
*****
```

---

# 5. Square Patterns

## Solid Square

```text
****
****
****
****
```

Code:

```java
for(int row = 1; row <= n; row++) {

    for(int col = 1; col <= n; col++) {
        System.out.print("*");
    }

    System.out.println();
}
```

---

## Hollow Square

Condition:

```java
if(row == 1 || row == n ||
   col == 1 || col == n)
```

Example:

```text
****
*  *
*  *
****
```

---

# 6. Number Patterns

## Number Half Pyramid

```text
1
12
123
1234
12345
```

Logic:

```text
Numbers = row
```

Code:

```java
for(int row = 1; row <= n; row++) {

    for(int col = 1; col <= row; col++) {
        System.out.print(col);
    }

    System.out.println();
}
```

---

## Inverted Number Pyramid

```text
12345
1234
123
12
1
```

Logic:

```text
Numbers = n - row + 1
```

---

## Repeated Number Pyramid

```text
1
22
333
4444
55555
```

Logic:

```text
Print row
```

Code:

```java
for(int row = 1; row <= n; row++) {

    for(int col = 1; col <= row; col++) {
        System.out.print(row);
    }

    System.out.println();
}
```

---

# 7. Floyd's Triangle ⭐

Output:

```text
1
2 3
4 5 6
7 8 9 10
```

Important concept:

```text
Counter
```

Code:

```java
int num = 1;

for(int row = 1; row <= n; row++) {

    for(int col = 1; col <= row; col++) {

        System.out.print(num + " ");
        num++;
    }

    System.out.println();
}
```

Remember:

```text
Columns = row
Value = counter
```

---

# 8. Alphabet Patterns

## Alphabet Half Pyramid

```text
A
AB
ABC
ABCD
ABCDE
```

Code:

```java
for(int row = 1; row <= n; row++) {

    for(int col = 1; col <= row; col++) {

        System.out.print((char)('A' + col - 1));
    }

    System.out.println();
}
```

---

## Repeated Alphabet Pyramid

```text
A
BB
CCC
DDDD
EEEEE
```

Logic:

```java
System.out.print((char)('A' + row - 1));
```

---

## Continuous Alphabet Pattern

```text
A
BC
DEF
GHIJ
```

Use a character counter:

```java
char ch = 'A';

for(int row = 1; row <= n; row++) {

    for(int col = 1; col <= row; col++) {

        System.out.print(ch);
        ch++;
    }

    System.out.println();
}
```

---

# 9. Full Pyramid

Formula:

```text
Spaces = n - row
Stars  = 2 * row - 1
```

Example:

```text
   *
  ***
 *****
*******
```

Code:

```java
for(int row = 1; row <= n; row++) {

    for(int space = 1; space <= n - row; space++) {
        System.out.print(" ");
    }

    for(int star = 1; star <= 2 * row - 1; star++) {
        System.out.print("*");
    }

    System.out.println();
}
```

---

# 10. Diamond

Diamond =

```text
Full Pyramid
+
Inverted Full Pyramid
```

Upper:

```java
for(int row = 1; row <= n; row++)
```

Lower:

```java
for(int row = n - 1; row >= 1; row--)
```

Important:

```text
Start lower half from n - 1
```

Otherwise the middle row gets printed twice.

---

# 11. Butterfly

Structure:

```text
Left Stars
+
Middle Spaces
+
Right Stars
```

Formula:

```text
Stars = row
Spaces = 2 * (n - row)
```

Upper:

```java
for(int row = 1; row <= n; row++)
```

Lower:

```java
for(int row = n - 1; row >= 1; row--)
```

---

# 12. Hollow Patterns ⭐

The key idea:

```text
Boundary?
   ↓
Yes → Print *
No  → Print space
```

---

## Hollow Rectangle

```java
if(row == 1 || row == rows ||
   col == 1 || col == cols)
```

---

## Hollow Square

```java
if(row == 1 || row == n ||
   col == 1 || col == n)
```

---

## Hollow Half Pyramid

```java
if(col == 1 ||
   col == row ||
   row == n)
```

---

## Hollow Full Pyramid

```java
if(col == 1 ||
   col == 2 * row - 1 ||
   row == n)
```

---

# 13. Palindromic Number Pyramid ⭐

Output:

```text
   1
  121
 12321
1234321
```

Structure:

```text
Spaces
+
Increasing Numbers
+
Decreasing Numbers
```

Code:

```java
for(int row = 1; row <= n; row++) {

    for(int space = 1; space <= n - row; space++) {
        System.out.print(" ");
    }

    for(int col = 1; col <= row; col++) {
        System.out.print(col);
    }

    for(int col = row - 1; col >= 1; col--) {
        System.out.print(col);
    }

    System.out.println();
}
```

---

# 14. 0-1 Pattern

Example:

```text
1
01
101
0101
10101
```

A common relationship:

```text
(row + col) % 2
```

Example:

```java
System.out.print((row + col) % 2);
```

If the required starting value is different, adjust the expression.

---

# 15. Character Alternation

Example:

```text
A
BA
ABA
BABA
ABABA
```

The output depends on a condition.

A common approach:

```java
if((row + col) % 2 == 0) {
    System.out.print("A");
} else {
    System.out.print("B");
}
```

---

# 16. Row-Based vs Column-Based Values ⭐

This distinction is very important.

## Column-Based

```text
1
12
123
1234
```

Value:

```text
col
```

---

## Row-Based

```text
1
22
333
4444
```

Value:

```text
row
```

---

## Counter-Based

```text
1
23
456
78910
```

Value:

```text
counter
```

---

# 17. Counter vs Accumulator in Patterns

## Counter

Used when the value changes continuously.

Example:

```java
int num = 1;

num++;
```

Floyd's Triangle uses a counter.

---

## Accumulator

Used when you repeatedly build a result.

Example:

```java
sum += value;
```

Pattern programming mostly focuses on counters, but understanding the difference is important for later DSA.

---

# 18. Conditions in Patterns

Conditions are useful when the output depends on position.

Example:

```java
if(row == col)
```

Main position-based conditions:

```text
row == 1
row == n
col == 1
col == n
row == col
row + col == n + 1
(row + col) % 2
```

These become very useful in matrix problems.

---

# 19. Important Position Relationships ⭐

## Main Diagonal

```text
row == col
```

Example:

```text
*
 *
  *
   *
```

---

## Secondary Diagonal

For an `n × n` matrix:

```text
row + col == n + 1
```

---

## Top Boundary

```text
row == 1
```

---

## Bottom Boundary

```text
row == n
```

---

## Left Boundary

```text
col == 1
```

---

## Right Boundary

```text
col == n
```

---

# 20. Pattern Decomposition

When a pattern looks complicated, break it into sections.

### Diamond

```text
Upper
+
Lower
```

### Butterfly

```text
Left
+
Middle
+
Right
```

### Palindrome

```text
Increasing
+
Decreasing
```

### Hollow Shape

```text
Boundary
+
Interior
```

This is one of the most important problem-solving techniques in pattern programming.

---

# 21. Pattern-Solving Algorithm ⭐⭐⭐

Use this every time.

```text
Step 1
Observe the pattern
        ↓
Step 2
Count rows
        ↓
Step 3
Count spaces
        ↓
Step 4
Count symbols
        ↓
Step 5
Identify printed value
        ↓
Step 6
Find row/column relationship
        ↓
Step 7
Find formula
        ↓
Step 8
Divide into sections
        ↓
Step 9
Write loops
        ↓
Step 10
Add conditions
        ↓
Step 11
Dry run
        ↓
Step 12
Check complexity
```

---

# 22. Pattern Formula Table

| Pattern | Main Logic |
|---|---|
| Rectangle | `rows × cols` |
| Square | `n × n` |
| Half Pyramid | `stars = row` |
| Inverted Pyramid | `stars = n - row + 1` |
| Full Pyramid | `spaces = n-row`, `stars = 2*row-1` |
| Butterfly | `stars = row`, `spaces = 2*(n-row)` |
| Diamond | Upper + Lower Pyramid |
| Hollow Rectangle | Boundary condition |
| Hollow Pyramid | Boundary condition |
| Floyd Triangle | Counter |
| Palindrome Pyramid | Increasing + Decreasing |
| 0-1 Pattern | Row/column condition |
| Alphabet Pattern | Character arithmetic |

---

# 23. Common Loop Structures

## Increasing Rows

```java
for(int row = 1; row <= n; row++)
```

---

## Decreasing Rows

```java
for(int row = n; row >= 1; row--)
```

---

## Lower Half Without Duplicate Middle

```java
for(int row = n - 1; row >= 1; row--)
```

---

## Columns Based on Row

```java
for(int col = 1; col <= row; col++)
```

---

## Columns Based on Remaining Rows

```java
for(int col = 1; col <= n - row + 1; col++)
```

---

## Odd Number of Symbols

```java
for(int col = 1; col <= 2 * row - 1; col++)
```

---

# 24. Common Mistakes

### 1. Wrong loop boundary

```java
<=
```

vs

```java
<
```

can completely change the output.

---

### 2. Wrong space count

Always calculate spaces manually for the first few rows.

---

### 3. Duplicate middle row

Use:

```java
n - 1
```

for the lower half of symmetric patterns.

---

### 4. Forgetting `println()`

Every row needs:

```java
System.out.println();
```

---

### 5. Mixing row and column logic

Ask:

```text
Does the value depend on row?
OR
Does it depend on column?
```

---

### 6. Memorizing instead of understanding

Understand the formula first.

---

# 25. Debugging Checklist

If your output is wrong:

```text
☐ Check number of rows
☐ Check spaces
☐ Check symbols
☐ Check row formula
☐ Check column formula
☐ Check condition
☐ Check starting value
☐ Check ending value
☐ Check println()
☐ Dry run manually
```

---

# 26. Complexity

Most pattern programs use nested loops.

Typical:

```text
Time Complexity = O(n²)
Space Complexity = O(1)
```

But don't blindly say `O(n²)`.

Analyze the actual number of iterations.

For example:

```java
for(int i = 1; i <= n; i++) {

    for(int j = 1; j <= i; j++) {
        // work
    }
}
```

Total work:

```text
1 + 2 + 3 + ... + n
```

Therefore:

```text
n(n + 1) / 2
```

which simplifies to:

```text
O(n²)
```

---

# 27. Placement Interview Strategy

If an interviewer gives you an unfamiliar pattern:

### First explain your observation.

Example:

> "I can see that the number of spaces decreases by one on every row, while the number of stars increases by two."

Then give the formulas:

```text
Spaces = n - row
Stars = 2 * row - 1
```

Then code.

This demonstrates **problem-solving ability**, not memorization.

---

# 28. Practice Strategy

Do not solve 100 patterns blindly.

Instead:

### Level 1

Solve:

```text
Rectangle
Square
Half Pyramid
Inverted Pyramid
```

### Level 2

Solve:

```text
Full Pyramid
Diamond
Butterfly
Number Patterns
Alphabet Patterns
```

### Level 3

Solve:

```text
Hollow Patterns
Palindrome Patterns
0-1 Patterns
Floyd's Triangle
```

### Level 4

Solve unseen interview patterns.

---

# 29. Must-Know Patterns for Placements ⭐⭐⭐

Before moving fully into DSA, you should be comfortable with:

```text
✅ Rectangle
✅ Square
✅ Half Pyramid
✅ Inverted Pyramid
✅ Full Pyramid
✅ Inverted Full Pyramid
✅ Diamond
✅ Butterfly
✅ Hollow Rectangle
✅ Hollow Pyramid
✅ Number Pyramid
✅ Floyd's Triangle
✅ Palindrome Pyramid
✅ 0-1 Triangle
✅ Alphabet Patterns
```

---

# 30. Final Mental Model

Whenever you see a pattern, think:

```text
                 PATTERN
                    ↓
              Number of Rows
                    ↓
             ┌──────┴──────┐
             ↓             ↓
          Spaces         Symbols
             ↓             ↓
          Formula       Formula
             └──────┬──────┘
                    ↓
               Conditions
                    ↓
              Nested Loops
                    ↓
                 Output
```

---

# 31. One-Minute Revision ⭐⭐⭐

Remember these formulas:

```text
Half Pyramid
Stars = row
```

```text
Inverted Half Pyramid
Stars = n - row + 1
```

```text
Full Pyramid
Spaces = n - row
Stars = 2 * row - 1
```

```text
Butterfly
Stars = row
Spaces = 2 * (n - row)
```

```text
Hollow Rectangle
Top/Bottom/Left/Right
```

```text
Floyd
Value = counter
```

```text
Palindrome
Increasing + Decreasing
```

```text
0-1 Pattern
(row + col) % 2
```

---

# 32. Interview Golden Rules 💡

```text
1. Don't memorize.
2. Observe first.
3. Find the formula.
4. Divide complex patterns.
5. Use meaningful variables.
6. Dry run with n = 3 or n = 4.
7. Explain your approach.
8. Analyze complexity.
```

---

# 33. Module 19 Completion Checklist

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
✅ 15_PatternCheatSheet.md
```

---

# 34. Final Takeaway

Pattern Programming is not about memorizing shapes.

It teaches you to:

```text
Observe
   ↓
Analyze
   ↓
Find Relationships
   ↓
Create Formulas
   ↓
Write Loops
   ↓
Apply Conditions
   ↓
Solve Problems
```

This thinking will directly help when we move into:

```text
Arrays
   ↓
2D Arrays
   ↓
Strings
   ↓
DSA
   ↓
Problem Solving
   ↓
Placement Coding
```

---

# References

- Oracle Java Documentation
- Java Language Specification
- Effective Java – Joshua Bloch
- Head First Java