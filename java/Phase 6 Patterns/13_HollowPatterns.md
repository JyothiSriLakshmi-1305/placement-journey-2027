# Hollow Patterns

> **Module 19 – Pattern Programming**

---

## 1. Introduction

A **Hollow Pattern** prints symbols only on the **boundary** of a shape while leaving the inside empty.

Example:

```text
*****
*   *
*   *
*****
```

Unlike a solid pattern, we don't print a symbol at every position.

We use **conditions** to decide whether a particular `(row, column)` position belongs to the boundary.

---

## 2. Why Learn Hollow Patterns?

Hollow patterns introduce an important concept:

```text
Nested Loops
     +
Conditions
```

They help us understand:

- Boundary logic
- Conditional printing
- Row-column relationships
- 2D thinking
- Matrix logic
- Problem decomposition

These concepts are directly useful later in:

- 2D Arrays
- Matrices
- Matrix Traversal
- DSA Problems

---

## 3. Pattern Thinking

For every position `(row, col)`, ask:

```text
Is this position on the boundary?
```

If YES:

```java
print("*");
```

If NO:

```java
print(" ");
```

General structure:

```java
for(rows) {

    for(columns) {

        if(boundary condition) {
            print symbol;
        }
        else {
            print space;
        }
    }

    move to next line;
}
```

---

# 4. Solid vs Hollow Pattern

## Solid Rectangle

```text
*****
*****
*****
*****
```

Every position contains `*`.

## Hollow Rectangle

```text
*****
*   *
*   *
*****
```

Only the boundary contains `*`.

---

# 5. Hollow Rectangle

Output:

```text
******
*    *
*    *
*    *
******
```

Suppose:

```text
rows = 5
cols = 6
```

The boundary consists of:

```text
Top Row
Bottom Row
Left Column
Right Column
```

---

## Boundary Condition

```java
if(row == 1 || row == rows ||
   col == 1 || col == cols)
```

If the condition is true:

```java
System.out.print("*");
```

Otherwise:

```java
System.out.print(" ");
```

---

## Code

```java
public class HollowRectangle {

    public static void main(String[] args) {

        int rows = 5;
        int cols = 6;

        for(int row = 1; row <= rows; row++) {

            for(int col = 1; col <= cols; col++) {

                if(row == 1 || row == rows ||
                   col == 1 || col == cols) {

                    System.out.print("*");

                } else {

                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
```

---

# 6. Boundary Logic

For a rectangle:

```text
Top
↓
row == 1

Bottom
↓
row == rows

Left
↓
col == 1

Right
↓
col == cols
```

Combined:

```java
row == 1 || row == rows ||
col == 1 || col == cols
```

---

# 7. Dry Run

For:

```text
rows = 4
cols = 5
```

Pattern:

```text
*****
*   *
*   *
*****
```

Consider some positions:

| Row | Column | Boundary? | Print |
|-----|--------|-----------|-------|
| 1 | 1 | Yes | `*` |
| 1 | 3 | Yes | `*` |
| 2 | 1 | Yes | `*` |
| 2 | 3 | No | space |
| 2 | 5 | Yes | `*` |
| 4 | 3 | Yes | `*` |

---

# 8. Internal Working

Each position is checked independently:

```text
(row, col)
    ↓
Boundary?
   /   \
 Yes    No
  ↓      ↓
  *    space
```

This is the main idea behind all hollow patterns.

---

# 9. Hollow Square

A square has:

```text
rows = columns
```

Example:

```text
*****
*   *
*   *
*   *
*****
```

---

## Code

```java
public class HollowSquare {

    public static void main(String[] args) {

        int n = 5;

        for(int row = 1; row <= n; row++) {

            for(int col = 1; col <= n; col++) {

                if(row == 1 || row == n ||
                   col == 1 || col == n) {

                    System.out.print("*");

                } else {

                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
```

---

# 10. Hollow Half Pyramid

Output:

```text
*
**
* *
*  *
*****
```

For this pattern, the boundary consists of:

```text
Left Side
Right Diagonal
Bottom
```

---

## Boundary Conditions

```java
col == 1
```

OR

```java
col == row
```

OR

```java
row == n
```

---

## Code

```java
public class HollowHalfPyramid {

    public static void main(String[] args) {

        int n = 5;

        for(int row = 1; row <= n; row++) {

            for(int col = 1; col <= row; col++) {

                if(col == 1 || col == row || row == n) {

                    System.out.print("*");

                } else {

                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
```

Output:

```text
*
**
* *
*  *
*****
```

---

# 11. Understanding the Half Pyramid Boundary

For:

```text
row = 4
```

The columns are:

```text
1 2 3 4
```

Boundary positions:

```text
col = 1
col = 4
```

So:

```text
*  *
```

The bottom row is completely filled:

```text
*****
```

Therefore:

```text
col == 1
OR
col == row
OR
row == n
```

---

# 12. Hollow Inverted Half Pyramid

Example:

```text
*****
*  *
* *
**
*
```

The exact boundary conditions change because the shape is inverted.

The important principle remains:

```text
Identify boundary
      ↓
Write condition
      ↓
Print symbol only there
```

---

# 13. Hollow Full Pyramid

Example:

```text
   *
  * *
 *   *
*******
```

A hollow full pyramid has:

- Left boundary
- Right boundary
- Bottom boundary

---

## Code

```java
public class HollowFullPyramid {

    public static void main(String[] args) {

        int n = 4;

        for(int row = 1; row <= n; row++) {

            // Leading spaces
            for(int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }

            // Pyramid positions
            for(int col = 1; col <= 2 * row - 1; col++) {

                if(col == 1 ||
                   col == 2 * row - 1 ||
                   row == n) {

                    System.out.print("*");

                } else {

                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
```

---

# 14. Hollow Full Pyramid Logic

For each row:

### Leading spaces

```text
n - row
```

### Total pyramid positions

```text
2 * row - 1
```

### Print star when:

```text
col == 1
```

OR

```text
col == 2 * row - 1
```

OR

```text
row == n
```

Otherwise print a space.

---

# 15. Boundary Conditions Cheat Sheet

## Hollow Rectangle

```java
row == 1 ||
row == rows ||
col == 1 ||
col == cols
```

---

## Hollow Square

```java
row == 1 ||
row == n ||
col == 1 ||
col == n
```

---

## Hollow Half Pyramid

```java
col == 1 ||
col == row ||
row == n
```

---

## Hollow Full Pyramid

```java
col == 1 ||
col == 2 * row - 1 ||
row == n
```

---

# 16. Why `||` Is Used?

`||` means **OR**.

Example:

```java
if(row == 1 || row == rows)
```

means:

```text
If it is the first row
OR
the last row
```

Either condition being true is enough.

For a rectangle:

```java
if(row == 1 || row == rows ||
   col == 1 || col == cols)
```

Any boundary condition can make the position a star.

---

# 17. Pattern Thinking: Position-Based Logic ⭐

Solid pattern:

```text
Print everything
```

Hollow pattern:

```text
Check position
      ↓
Boundary?
   /      \
 Yes       No
  ↓         ↓
Print *   Print space
```

This is an important change in thinking.

---

# 18. Connection with 2D Arrays

Hollow patterns are closely related to matrices.

Consider:

```text
1  2  3  4  5
6  7  8  9 10
11 12 13 14 15
```

Every element has a position:

```text
(row, column)
```

Similarly, pattern programming checks:

```text
(row, col)
```

This prepares us for:

- Matrix traversal
- Boundary traversal
- Spiral matrix
- Diagonal traversal
- 2D array problems

---

# 19. Common Mistakes

## Mistake 1 – Printing every position

```java
System.out.print("*");
```

This creates a solid pattern.

---

## Mistake 2 – Forgetting the interior space

You need:

```java
System.out.print(" ");
```

for non-boundary positions.

---

## Mistake 3 – Using `&&` incorrectly

For example:

```java
if(row == 1 && row == rows)
```

This usually cannot be true for a rectangle with more than one row.

Use `||` when checking alternative boundary conditions.

---

## Mistake 4 – Forgetting the bottom row

Some hollow shapes require the entire bottom row to be filled.

---

# 20. Debugging Strategy

When your hollow pattern is incorrect:

### Step 1

Draw the expected pattern.

### Step 2

Mark every boundary position.

### Step 3

Identify:

```text
Top
Bottom
Left
Right
```

### Step 4

Convert each boundary into a condition.

### Step 5

Combine conditions using `||`.

### Step 6

Dry run row by row.

---

# 21. Pattern Recognition ⭐

If you see:

```text
*****
*   *
*   *
*****
```

Think:

```text
Hollow Rectangle
```

If you see:

```text
*
**
* *
*  *
*****
```

Think:

```text
Hollow Half Pyramid
```

If you see:

```text
   *
  * *
 *   *
*******
```

Think:

```text
Hollow Full Pyramid
```

---

# 22. Connection with Previous Patterns

```text
Solid Rectangle
      ↓
Hollow Rectangle
      ↓
Solid Pyramid
      ↓
Hollow Pyramid
      ↓
Advanced Boundary Patterns
```

The major new concept is:

```text
Position + Condition
```

---

# 23. Interview Questions

### Q1. What is a hollow pattern?

A pattern where only the boundary contains symbols and the interior remains empty.

### Q2. How do you create a hollow rectangle?

Check:

```java
row == 1
row == rows
col == 1
col == cols
```

### Q3. Why are conditions required?

To distinguish boundary positions from interior positions.

### Q4. What does `||` mean?

Logical OR.

### Q5. What does `(row, col)` represent?

The position of the current element in the pattern.

### Q6. What DSA concept does hollow pattern logic prepare you for?

2D arrays and matrix boundary traversal.

### Q7. What is the usual time complexity?

```text
O(n²)
```

### Q8. What is the extra space complexity?

```text
O(1)
```

---

# 24. Coding Exercises

## Beginner

1. Print a hollow rectangle.
2. Print a hollow square.
3. Print a hollow half pyramid.
4. Print a hollow inverted half pyramid.

## Intermediate

5. Print a hollow full pyramid.
6. Print a hollow diamond.
7. Print a hollow triangle.
8. Print a hollow number rectangle.

## Placement-Level

9. Print a hollow butterfly.
10. Print a hollow diamond using numbers.
11. Print only the boundary of a matrix.
12. Print boundary elements of a 2D array.

---

# 25. Best Practices

- Think in terms of `(row, col)`.
- Identify the boundary before coding.
- Write simple conditions.
- Use `||` for alternative boundary positions.
- Test small patterns first.
- Dry run every condition.

---

# 26. Bootcamp Insight 💡

Hollow patterns are an important transition from simple pattern printing to **2D problem solving**.

You are no longer asking:

> "How many stars should I print?"

You are asking:

> "Does this position satisfy the boundary condition?"

That is exactly the type of thinking used in matrix and DSA problems.

---

# 27. Quick Revision

## General Hollow Pattern

```text
For every position:

Boundary?
   ↓
Yes → Print *
No  → Print space
```

### Rectangle

```java
row == 1 ||
row == rows ||
col == 1 ||
col == cols
```

### Half Pyramid

```java
col == 1 ||
col == row ||
row == n
```

### Full Pyramid

```java
col == 1 ||
col == 2 * row - 1 ||
row == n
```

---

# 28. Key Takeaways

- Hollow patterns print only boundaries.
- Conditions are the core of hollow patterns.
- Think using `(row, col)`.
- Rectangle boundaries have four sides.
- Pyramid boundaries have two sides and a base.
- `||` is commonly used to combine boundary conditions.
- Hollow patterns prepare you for matrix boundary problems.

---

# 29. Final Pattern Formula Sheet

```text
HOLLOW RECTANGLE

Top    → row == 1
Bottom → row == rows
Left   → col == 1
Right  → col == cols
```

```text
HOLLOW HALF PYRAMID

Left   → col == 1
Right  → col == row
Bottom → row == n
```

```text
HOLLOW FULL PYRAMID

Left   → col == 1
Right  → col == 2 * row - 1
Bottom → row == n
```

---

# 30. References

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

⏳ 14_AdvancedInterviewPatterns.md
⏳ 15_PatternCheatSheet.md
```