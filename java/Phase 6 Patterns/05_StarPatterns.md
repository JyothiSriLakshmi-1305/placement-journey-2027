# Star Patterns

> **Module 19 – Pattern Programming**

---

# 1. Introduction

Star patterns are the most popular pattern programming problems in Java. They use the `*` (asterisk) character to build different shapes using loops.

Unlike rectangle patterns, the number of stars changes according to the row number.

Star patterns strengthen your understanding of:

- Nested loops
- Loop control
- Pattern logic
- Mathematical thinking
- Problem-solving

---

# 2. History

Star patterns have been used for decades in programming education because they provide an easy visual representation of how nested loops execute.

Today they are still asked in:

- Java Interviews
- Campus Placements
- Coding Assessments
- Competitive Programming

---

# 3. Evolution

```
Rectangle

↓

Square

↓

Star Patterns

↓

Half Pyramid

↓

Full Pyramid

↓

Diamond

↓

Advanced Patterns
```

---

# 4. Why Learn Star Patterns?

Star patterns teach you:

- Dynamic loops
- Changing column values
- Row-based logic
- Pattern observation
- Algorithmic thinking

---

# 5. Pattern Thinking ⭐

Whenever you see a star pattern, ask yourself:

```
How many rows?

↓

How many stars in each row?

↓

Is the number of stars increasing?

↓

Is the number of stars decreasing?

↓

Are spaces required?
```

---

# 6. Pattern Categories

Star patterns can be classified as:

- Fixed Star Patterns
- Increasing Star Patterns
- Decreasing Star Patterns
- Symmetric Star Patterns
- Hollow Star Patterns

---

# 7. Pattern 1 – Single Star

Output

```
*
```

Code

```java
public class SingleStar {

    public static void main(String[] args) {

        System.out.println("*");

    }

}
```

---

# 8. Pattern 2 – Horizontal Star Line

Output

```
*****
```

Logic

```
Rows = 1

Columns = 5
```

Code

```java
for(int col = 1; col <= 5; col++){

    System.out.print("*");

}
```

---

# 9. Pattern 3 – Vertical Star Line

Output

```
*
*
*
*
*
```

Logic

```
Rows = 5

Columns = 1
```

Code

```java
for(int row = 1; row <= 5; row++){

    System.out.println("*");

}
```

---

# 10. Pattern 4 – Star Rectangle

Output

```
*****
*****
*****
*****
```

Logic

```
Rows = 4

Columns = 5
```

Code

```java
for(int row = 1; row <= 4; row++){

    for(int col = 1; col <= 5; col++){

        System.out.print("*");

    }

    System.out.println();

}
```

---

# 11. Pattern Formula ⭐

| Pattern | Rows | Columns | Stars |
|----------|------|----------|--------|
| Horizontal Line | 1 | Fixed | Fixed |
| Vertical Line | Fixed | 1 | Fixed |
| Rectangle | Fixed | Fixed | Fixed |

---

# 12. Internal Working

Example

```
*****
*****
```

Execution

```
Row 1

Column 1

↓

Print *

↓

Column++

↓

Repeat

↓

New Line

↓

Row 2
```

---

# 13. Flow Diagram

```
Start

↓

Outer Loop

↓

Inner Loop

↓

Print *

↓

Next Column

↓

Next Row

↓

End
```

---

# 14. Memory Representation

```
row = 1

↓

col = 1

*

↓

col = 2

**

↓

col = 3

***

↓

New Line

↓

row = 2
```

---

# 15. Dry Run

Pattern

```
***
***
```

| Row | Column | Output |
|-----|--------|--------|
|1|1|*|
|1|2|**|
|1|3|***|
|2|1|*|
|2|2|**|
|2|3|***|

---

# 16. Time Complexity

Horizontal Line

```
O(n)
```

Vertical Line

```
O(n)
```

Rectangle

```
O(rows × columns)
```

---

# 17. Space Complexity

```
O(1)
```

---

# 18. Best Practices

✅ Draw the output first.

✅ Count rows.

✅ Count columns.

✅ Understand the pattern before coding.

✅ Dry run the logic.

---

# 19. Common Mistakes

❌ Forgetting `println()`.

❌ Incorrect loop limits.

❌ Confusing rows with columns.

❌ Printing at the wrong location.

---

# 20. Interview Questions

### Why are star patterns important?

They improve logical thinking and nested loop understanding.

---

### Which loop controls rows?

Outer loop.

---

### Which loop controls stars?

Inner loop.

---

### Why are star patterns asked in interviews?

To evaluate loop logic and problem-solving skills.

---

# 21. Coding Exercises

### Beginner

1. Print one star.
2. Print five stars horizontally.
3. Print five stars vertically.
4. Print a 3×5 rectangle.
5. Print a 6×6 square.

### Intermediate

6. Take rows from the user.
7. Print a rectangle using user input.
8. Print different symbols instead of `*`.

---

# 22. Pattern Recognition ⭐

```
Fixed Stars

↓

Fixed Rows

↓

Rectangle

↓

Foundation of Dynamic Patterns
```

---

# 23. Bootcamp Insight 💡

Rectangle and simple star patterns may look easy, but they build the nested-loop skills needed for every advanced pattern you'll solve later.

---

# 24. Quick Revision

```
Rows

↓

Outer Loop

Columns

↓

Inner Loop

↓

Print *

↓

New Line
```

---

# 25. Key Takeaways

- Star patterns use nested loops.
- Outer loop controls rows.
- Inner loop controls stars.
- Always identify row and column logic first.
- Never memorize patterns—understand the logic.

---

# 26. References

- Oracle Java Documentation
- Java Language Specification
- Effective Java
- Head First Java