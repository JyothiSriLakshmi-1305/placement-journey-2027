# Pattern Thinking

> **Module 19 – Pattern Programming**

---

# 1. Introduction

Many beginners make one common mistake:

> They try to **memorize pattern programs**.

Professional programmers never memorize patterns.

Instead, they **analyze the pattern**, identify the logic, and then write the code.

This chapter teaches you **how to think** before writing a single line of code.

---

# 2. History

Pattern programming became popular because teachers noticed students could write loops but struggled to combine multiple loops and conditions.

Instead of teaching hundreds of patterns individually, educators started teaching **pattern thinking**.

Today this approach is used in:

- Universities
- Coding Bootcamps
- Placement Training
- Competitive Programming
- Software Engineering Interviews

---

# 3. Evolution

```text
Loops

↓

Nested Loops

↓

Pattern Thinking

↓

Pattern Programming

↓

2D Arrays

↓

Matrices

↓

Algorithms
```

---

# 4. Why Pattern Thinking?

Look at this pattern.

```
*****
*****
*****
*****
```

Most beginners ask:

> "What code should I write?"

A programmer asks:

> "How is this pattern constructed?"

That difference is called **Pattern Thinking**.

---

# 5. Pattern Solving Formula ⭐

Every pattern can be solved by answering four questions.

```
Rows?

↓

Columns?

↓

Spaces?

↓

What should I print?
```

Whenever you see a new pattern, answer these questions first.

---

# 6. Step 1 — Count Rows

Example

```
*****
*****
*****
*****
```

Rows

```
4
```

Outer loop

```java
for(int row = 1; row <= 4; row++)
```

---

# 7. Step 2 — Count Columns

```
*****
*****
*****
*****
```

Columns

```
5
```

Inner loop

```java
for(int col = 1; col <= 5; col++)
```

---

# 8. Step 3 — Decide What to Print

Examples

```
*
```

```
1
```

```
A
```

```
#
```

The printing statement changes, but the loop structure often stays the same.

---

# 9. Step 4 — Spaces

Patterns like pyramids require spaces.

Example

```
    *
   ***
  *****
```

You need to calculate:

- Leading spaces
- Printing symbols

---

# 10. Pattern Building Process

```
Observe Pattern

↓

Count Rows

↓

Count Columns

↓

Find Printing Logic

↓

Write Loops

↓

Dry Run

↓

Execute
```

---

# 11. Real-Life Analogy

Imagine arranging chairs.

```
Row 1

Chair Chair Chair

↓

Row 2

Chair Chair Chair

↓

Row 3

Chair Chair Chair
```

Outer loop

↓

Rows

Inner loop

↓

Chairs

---

# 12. Loop Analysis

Example

```
***
***
***
```

Outer Loop

```
3 times
```

Inner Loop

```
3 times
```

Logic

```java
for(row)

    for(col)

        print
```

---

# 13. Memory Representation

```
row = 1

↓

col = 1

↓

Print

↓

col++

↓

Print

↓

col++

↓

Next Row
```

---

# 14. Dry Run

Pattern

```
***
***
***
```

| Row | Col | Output |
|-----|-----|--------|
|1|1|*|
|1|2|**|
|1|3|***|
|2|1|*|
|2|2|**|
|2|3|***|

---

# 15. Pattern Recognition ⭐

Instead of remembering code, recognize the type.

| Pattern | Logic |
|----------|-------|
| Rectangle | Fixed rows + fixed columns |
| Square | Equal rows & columns |
| Half Pyramid | Columns = Row Number |
| Inverted Pyramid | Columns decrease |
| Full Pyramid | Spaces decrease, stars increase |
| Diamond | Two pyramids combined |

---

# 16. Pattern Formula Sheet ⭐

### Rectangle

```
Rows = n

Columns = n
```

---

### Half Pyramid

```
Rows = n

Columns = row
```

---

### Inverted Pyramid

```
Rows = n

Columns = n-row+1
```

---

### Full Pyramid

```
Spaces = n-row

Stars = 2*row-1
```

---

### Diamond

Upper

```
Spaces = n-row

Stars = 2*row-1
```

Lower

```
Spaces = row

Stars = 2*(n-row)-1
```

---

# 17. Common Beginner Mistakes

❌ Counting rows incorrectly.

❌ Confusing rows with columns.

❌ Memorizing code.

❌ Ignoring spaces.

❌ Writing code before understanding the pattern.

---

# 18. Best Practices

✅ Draw the pattern.

✅ Number the rows.

✅ Count the columns.

✅ Identify repeating logic.

✅ Dry run on paper.

---

# 19. Interview Perspective

Interviewers expect you to explain:

- Row logic
- Column logic
- Space logic
- Printing logic

before writing code.

This demonstrates structured problem-solving.

---

# 20. Debugging Tips

If your pattern is wrong:

1. Check outer loop.
2. Check inner loop.
3. Check printing statement.
4. Check newline.
5. Dry run row by row.

---

# 21. Connection with DSA

Pattern Thinking

↓

Nested Loops

↓

2D Arrays

↓

Matrices

↓

Graphs

↓

Dynamic Programming

---

# 22. Bootcamp Insight 💡

The biggest difference between beginners and experienced programmers is not syntax—it is **observation**.

Beginners see stars.

Experienced programmers see:

- rows
- columns
- spaces
- formulas
- conditions

---

# 23. Quick Revision

```
Observe

↓

Rows

↓

Columns

↓

Spaces

↓

Print

↓

Code
```

---

# 24. Key Takeaways

- Never memorize pattern programs.
- Always analyze rows first.
- Columns usually depend on rows.
- Spaces create alignment.
- Every pattern follows a mathematical rule.

---

# 25. References

- Oracle Java Documentation
- Head First Java
- Effective Java
- Java Language Specification