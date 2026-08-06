# Half Pyramid Patterns

> **Module 19 – Pattern Programming**

---

# 1. Introduction

A **Half Pyramid Pattern** is one of the simplest and most important pattern programming problems in Java.

Unlike rectangle patterns where the number of columns remains constant, the number of columns in a half pyramid **changes with every row**.

This is the first pattern where we learn how **rows control columns**.

---

# 2. History

Half Pyramid patterns have been used for decades in programming education because they introduce the concept of **dynamic nested loops**.

Most coding interviews begin with half pyramid problems before moving to advanced patterns.

---

# 3. Evolution

```text
Rectangle

↓

Square

↓

Half Pyramid ⭐

↓

Inverted Pyramid

↓

Full Pyramid

↓

Diamond

↓

Advanced Interview Patterns
```

---

# 4. Why Learn Half Pyramid?

Half Pyramid teaches:

- Dynamic nested loops
- Row-column relationship
- Incremental logic
- Pattern observation
- Mathematical thinking

Without understanding Half Pyramid, advanced patterns become difficult.

---

# 5. Pattern Thinking ⭐

Whenever you see a Half Pyramid ask:

```
How many rows?

↓

How many stars in Row 1?

↓

How many stars in Row 2?

↓

How many stars in Row n?
```

Observation:

```
Columns = Current Row Number
```

This is the golden rule.

---

# 6. Pattern Formula ⭐

```
Rows = n

Columns = Current Row
```

Example

```
Row 1 → 1 Star

Row 2 → 2 Stars

Row 3 → 3 Stars

Row 4 → 4 Stars
```

---

# 7. Pattern 1 – Half Pyramid (Stars)

Output

```text
*
**
***
****
*****
```

### Logic

Rows = 5

Columns = Current Row

---

### Dry Run

| Row | Columns | Output |
|-----|---------|--------|
|1|1|*|
|2|2|**|
|3|3|***|
|4|4|****|
|5|5|*****|

---

### Code

```java
public class HalfPyramid {

    public static void main(String[] args) {

        for(int row = 1; row <= 5; row++) {

            for(int col = 1; col <= row; col++) {

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
row = 1

↓

col = 1

↓

*

↓

Next Row

↓

row = 2

↓

col = 1

*

↓

col = 2

**

↓

Next Row
```

Notice:

The **inner loop limit changes** every iteration.

---

# 9. Memory Representation

```text
Row = 1

Columns = 1

↓

Row = 2

Columns = 2

↓

Row = 3

Columns = 3

↓

Row = 4

Columns = 4
```

---

# 10. Pattern 2 – Number Half Pyramid

Output

```text
1
12
123
1234
12345
```

### Logic

Rows = 5

Columns = Current Row

Print = Column Number

---

### Code

```java
for(int row = 1; row <= 5; row++) {

    for(int col = 1; col <= row; col++) {

        System.out.print(col);

    }

    System.out.println();

}
```

---

# 11. Pattern 3 – Alphabet Half Pyramid

Output

```text
A
AB
ABC
ABCD
ABCDE
```

### Logic

Print

```java
(char)(64 + col)
```

---

### Code

```java
for(int row = 1; row <= 5; row++) {

    for(int col = 1; col <= row; col++) {

        System.out.print((char)(64 + col));

    }

    System.out.println();

}
```

---

# 12. Pattern Formula Sheet ⭐

| Pattern | Formula |
|----------|---------|
| Rectangle | Columns = Fixed |
| Square | Columns = Fixed |
| Half Pyramid | Columns = Current Row |
| Number Pyramid | Columns = Current Row |
| Alphabet Pyramid | Columns = Current Row |

---

# 13. Time Complexity

Outer Loop

```
n
```

Inner Loop

```
1 + 2 + 3 + ... + n
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

✅ Draw the pattern first.

✅ Count rows.

✅ Observe how columns change.

✅ Find the mathematical formula.

✅ Dry run before coding.

---

# 16. Common Mistakes

❌ Using a fixed column limit.

```java
col <= 5
```

Instead use

```java
col <= row
```

---

❌ Forgetting `println()`.

---

❌ Printing outside the inner loop.

---

# 17. Debugging Tips

If your pattern is incorrect:

- Check outer loop.
- Check inner loop limit.
- Verify the print statement.
- Verify newline placement.

---

# 18. Interview Questions

### Why is Half Pyramid important?

Because it introduces **dynamic nested loops**.

---

### Which loop controls rows?

Outer loop.

---

### Which loop controls stars?

Inner loop.

---

### What is the formula?

```
Columns = Current Row
```

---

### Time Complexity?

```
O(n²)
```

---

# 19. Coding Exercises

## Beginner

1. Print Half Pyramid with stars.
2. Print Half Pyramid with numbers.
3. Print Half Pyramid with alphabets.
4. Print Half Pyramid using '#'.
5. Print Half Pyramid using '$'.

---

## Intermediate

6. Take rows from the user.
7. Print Half Pyramid using any character.
8. Print row numbers instead of column numbers.

---

# 20. Pattern Recognition ⭐

```text
Rows Fixed

↓

Columns Increase

↓

Columns = Current Row

↓

Half Pyramid
```

Whenever columns increase with every row,

think:

> **Half Pyramid**

---

# 21. Bootcamp Insight 💡

The formula

```text
Columns = Current Row
```

is one of the most important formulas in pattern programming.

It is reused in:

- Number Patterns
- Alphabet Patterns
- Floyd's Triangle
- Pascal's Triangle
- Advanced Interview Patterns

Master this formula before moving ahead.

---

# 22. Quick Revision

```text
Rows

↓

Outer Loop

↓

Columns = Current Row

↓

Inner Loop

↓

Print

↓

New Line
```

---

# 23. Key Takeaways

- Half Pyramid is the first dynamic pattern.
- Outer loop controls rows.
- Inner loop limit depends on the row.
- Formula: **Columns = Current Row**.
- This pattern is the base for many advanced interview patterns.

---

# 24. References

- Oracle Java Documentation
- Java Language Specification
- Effective Java – Joshua Bloch
- Head First Java