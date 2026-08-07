# Number Patterns

> **Module 19 – Pattern Programming**

---

# 1. Introduction

Number Patterns are patterns where numbers are printed instead of stars.

These patterns strengthen:

- Nested loops
- Mathematical thinking
- Pattern recognition
- Row-column relationships
- Interview problem-solving

Unlike star patterns, here we decide **which number** to print based on the row, column, or a formula.

---

# 2. History

Number patterns became popular in programming education because they combine loops with mathematical logic.

Instead of printing a fixed symbol, programmers calculate the value to print, improving analytical thinking.

Today they are used in:

- Java Interviews
- Placement Coding Tests
- Competitive Programming
- University Practical Exams

---

# 3. Evolution

```text
Star Patterns

↓

Number Patterns

↓

Alphabet Patterns

↓

Advanced Mathematical Patterns

↓

Floyd's Triangle

↓

Pascal's Triangle
```

---

# 4. Why Learn Number Patterns?

Number patterns help you understand:

- Dynamic printing logic
- Mathematical formulas
- Row-based calculations
- Column-based calculations
- Algorithm design

---

# 5. Pattern Thinking ⭐

Before writing code, ask:

```text
How many rows?

↓

How many columns?

↓

Which number should I print?

↓

Does the number depend on row or column?
```

---

# 6. Pattern Formula Sheet ⭐

| Pattern | Formula |
|----------|---------|
| 11111 | Print = 1 |
| 12345 | Print = Column |
| 11122 | Print = Row |
| 12321 | Print = Formula |
| Floyd Triangle | Print = Counter |

---

# 7. Pattern 1 – Constant Number Pattern

Output

```text
11111
11111
11111
11111
```

### Logic

Rows = 4

Columns = 5

Print = 1

### Code

```java
for(int row = 1; row <= 4; row++){

    for(int col = 1; col <= 5; col++){

        System.out.print(1);

    }

    System.out.println();

}
```

---

# 8. Pattern 2 – Increasing Numbers

Output

```text
12345
12345
12345
12345
```

### Formula

```
Print = Column
```

### Code

```java
for(int row = 1; row <= 4; row++){

    for(int col = 1; col <= 5; col++){

        System.out.print(col);

    }

    System.out.println();

}
```

---

# 9. Pattern 3 – Row Numbers

Output

```text
11111
22222
33333
44444
```

### Formula

```
Print = Row
```

### Code

```java
for(int row = 1; row <= 4; row++){

    for(int col = 1; col <= 5; col++){

        System.out.print(row);

    }

    System.out.println();

}
```

---

# 10. Pattern 4 – Half Pyramid Numbers

Output

```text
1
12
123
1234
12345
```

### Formula

```
Columns = Row

Print = Column
```

### Code

```java
for(int row = 1; row <= 5; row++){

    for(int col = 1; col <= row; col++){

        System.out.print(col);

    }

    System.out.println();

}
```

---

# 11. Pattern 5 – Repeated Row Numbers

Output

```text
1
22
333
4444
55555
```

### Formula

```
Columns = Row

Print = Row
```

### Code

```java
for(int row = 1; row <= 5; row++){

    for(int col = 1; col <= row; col++){

        System.out.print(row);

    }

    System.out.println();

}
```

---

# 12. Pattern 6 – Floyd's Triangle

Output

```text
1
2 3
4 5 6
7 8 9 10
```

### Formula

Use a counter variable.

### Code

```java
int num = 1;

for(int row = 1; row <= 4; row++){

    for(int col = 1; col <= row; col++){

        System.out.print(num + " ");
        num++;

    }

    System.out.println();

}
```

---

# 13. Internal Working

Example

```text
Row = 3

Columns = 3

↓

Print

1 2 3
```

The printed value depends on the selected formula:

- Constant
- Row
- Column
- Counter

---

# 14. Memory Representation

```text
Row = 1

↓

Col = 1

↓

Print 1

↓

Col++

↓

Print 2

↓

Col++

↓

Print 3
```

---

# 15. Time Complexity

For all patterns using nested loops:

```text
O(n²)
```

---

# 16. Space Complexity

```text
O(1)
```

---

# 17. Best Practices

- Draw the pattern first.
- Identify the printing formula.
- Decide whether to print **row**, **column**, or **counter**.
- Dry run before coding.

---

# 18. Common Mistakes

❌ Printing `row` instead of `col`.

❌ Forgetting to increment the counter in Floyd's Triangle.

❌ Incorrect inner loop limit.

❌ Printing after `println()`.

---

# 19. Debugging Tips

If the output is incorrect:

- Check the outer loop.
- Check the inner loop.
- Verify the print formula.
- Dry run row by row.

---

# 20. Interview Questions

### Which variable prints increasing numbers?

**Answer:** Column

---

### Which variable prints repeated row numbers?

**Answer:** Row

---

### Which pattern uses a counter?

**Answer:** Floyd's Triangle

---

### Time Complexity?

```
O(n²)
```

---

# 21. Coding Exercises

## Beginner

1. Print constant numbers.
2. Print row numbers.
3. Print column numbers.
4. Print repeated row numbers.
5. Print increasing numbers.

## Intermediate

6. Floyd's Triangle.
7. Reverse number pattern.
8. User-input number pattern.
9. Continuous number rectangle.
10. Zig-zag numbers.

---

# 22. Pattern Recognition ⭐

```text
Need Same Number?

↓

Print Constant

Need Column Numbers?

↓

Print Column

Need Row Numbers?

↓

Print Row

Need Continuous Numbers?

↓

Use Counter
```

---

# 23. Bootcamp Insight 💡

Every number pattern can be solved by identifying **what controls the printed value**:

- Constant
- Row
- Column
- Counter

Master these four techniques, and most number pattern questions become straightforward.

---

# 24. Quick Revision

```text
Rows

↓

Columns

↓

Print?

↓

Constant

↓

Row

↓

Column

↓

Counter
```

---

# 25. Key Takeaways

- Number patterns use nested loops.
- The printed value follows a formula.
- Common formulas: **Constant, Row, Column, Counter**.
- Floyd's Triangle introduces the counter pattern.
- Number patterns strengthen mathematical thinking.

---

# 26. References

- Oracle Java Documentation
- Java Language Specification
- Effective Java – Joshua Bloch
- Head First Java