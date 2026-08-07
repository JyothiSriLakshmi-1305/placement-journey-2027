# Inverted Patterns

> **Module 19 – Pattern Programming**

---

# 1. Introduction

An **Inverted Pattern** is the opposite of a Half Pyramid.

Instead of increasing the number of symbols in each row, the number of symbols **decreases**.

This teaches us how to make the inner loop dynamic in the opposite direction.

---

# 2. History

Inverted patterns were introduced to help students understand that changing only the **inner loop condition** can completely change the output.

These patterns are frequently asked in:

- Java Interviews
- Placement Coding Rounds
- Competitive Programming
- University Exams

---

# 3. Evolution

```text
Rectangle

↓

Half Pyramid

↓

Inverted Pyramid ⭐

↓

Full Pyramid

↓

Diamond

↓

Advanced Patterns
```

---

# 4. Why Learn Inverted Patterns?

Inverted patterns teach:

- Reverse thinking
- Dynamic loop limits
- Mathematical formulas
- Observation skills
- Loop optimization

---

# 5. Pattern Thinking ⭐

Whenever you see an inverted pattern, ask:

```
How many rows?

↓

How many symbols in Row 1?

↓

How many symbols decrease?

↓

Find the formula.
```

Observation:

```
Columns = Total Rows - Current Row + 1
```

---

# 6. Formula ⭐

```
Rows = n

Columns = n - row + 1
```

Example

```
Row 1 → 5 Stars

Row 2 → 4 Stars

Row 3 → 3 Stars

Row 4 → 2 Stars

Row 5 → 1 Star
```

---

# 7. Pattern 1 – Inverted Star Pyramid

Output

```text
*****
****
***
**
*
```

---

### Dry Run

| Row | Formula | Stars |
|-----|---------|-------|
|1|5-1+1|5|
|2|5-2+1|4|
|3|5-3+1|3|
|4|5-4+1|2|
|5|5-5+1|1|

---

### Code

```java
public class InvertedStarPattern {

    public static void main(String[] args) {

        int rows = 5;

        for(int row = 1; row <= rows; row++) {

            for(int col = 1; col <= rows - row + 1; col++) {

                System.out.print("*");

            }

            System.out.println();

        }

    }

}
```

---

# 8. Internal Working

Execution

```text
Row = 1

Columns = 5

*****

↓

Row = 2

Columns = 4

****

↓

Row = 3

Columns = 3

***
```

Notice:

The number of columns **decreases** after every row.

---

# 9. Memory Representation

```text
Row = 1

Columns = 5

↓

Row = 2

Columns = 4

↓

Row = 3

Columns = 3

↓

Row = 4

Columns = 2

↓

Row = 5

Columns = 1
```

---

# 10. Pattern 2 – Inverted Number Pattern

Output

```text
12345
1234
123
12
1
```

### Logic

Print the column number.

---

### Code

```java
for(int row = 1; row <= 5; row++) {

    for(int col = 1; col <= 5 - row + 1; col++) {

        System.out.print(col);

    }

    System.out.println();

}
```

---

# 11. Pattern 3 – Inverted Alphabet Pattern

Output

```text
ABCDE
ABCD
ABC
AB
A
```

---

### Code

```java
for(int row = 1; row <= 5; row++) {

    for(int col = 1; col <= 5 - row + 1; col++) {

        System.out.print((char)(64 + col));

    }

    System.out.println();

}
```

---

# 12. Pattern Formula Sheet ⭐

| Pattern | Formula |
|----------|---------|
| Half Pyramid | Columns = Row |
| Inverted Pyramid | Columns = Total Rows - Row + 1 |
| Rectangle | Columns = Fixed |
| Square | Columns = Fixed |

---

# 13. Time Complexity

Outer Loop

```
n
```

Inner Loop

```
n + (n-1) + (n-2) + ... + 1
```

Total

```
n(n+1)/2
```

Time Complexity

```text
O(n²)
```

---

# 14. Space Complexity

```text
O(1)
```

---

# 15. Best Practices

- Draw the pattern first.
- Count rows carefully.
- Observe how columns decrease.
- Verify the formula before coding.
- Dry run each iteration.

---

# 16. Common Mistakes

❌ Using:

```java
col <= row
```

instead of

```java
col <= rows - row + 1
```

---

❌ Forgetting `println()` after each row.

---

❌ Using incorrect row limits.

---

# 17. Debugging Tips

If the pattern is wrong:

- Check the outer loop.
- Verify the formula.
- Trace one row at a time.
- Count printed symbols.

---

# 18. Interview Questions

### What is the formula for an inverted pattern?

```
Columns = Total Rows - Current Row + 1
```

---

### Why is this formula important?

It is reused in:

- Inverted triangles
- Hollow pyramids
- Diamonds
- Butterfly patterns

---

### Time Complexity?

```
O(n²)
```

---

# 19. Coding Exercises

## Beginner

1. Print an inverted star pattern.
2. Print an inverted number pattern.
3. Print an inverted alphabet pattern.
4. Print using '#'.
5. Print using '$'.

---

## Intermediate

6. Take the number of rows from the user.
7. Print inverted patterns using any symbol.
8. Modify the program to print row numbers instead of column numbers.

---

# 20. Pattern Recognition ⭐

```text
Rows Fixed

↓

Columns Decrease

↓

Formula

↓

Columns = Total Rows - Current Row + 1
```

Whenever the number of symbols decreases in every row,

think:

> **Inverted Pattern**

---

# 21. Bootcamp Insight 💡

Half Pyramid and Inverted Pyramid are complementary patterns.

Understanding both formulas allows you to solve many interview problems with only small modifications.

---

# 22. Quick Revision

```text
Rows

↓

Outer Loop

↓

Columns = Total Rows - Current Row + 1

↓

Inner Loop

↓

Print

↓

New Line
```

---

# 23. Key Takeaways

- Inverted patterns decrease symbols row by row.
- Formula: **Columns = Total Rows − Current Row + 1**.
- Outer loop controls rows.
- Inner loop controls symbols.
- This formula is used in many advanced patterns.

---

# 24. References

- Oracle Java Documentation
- Java Language Specification
- Effective Java – Joshua Bloch
- Head First Java