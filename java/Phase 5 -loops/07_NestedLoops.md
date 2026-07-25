# Nested Loops

> **Module 18 – Loops**

---

# Introduction

A **Nested Loop** is a loop inside another loop. The outer loop controls how many times the inner loop executes.

Nested loops are one of the most important concepts in Java because they are widely used in:

- Pattern printing
- Matrix operations
- Game development
- Data processing
- Algorithm design

Mastering nested loops is essential for **DSA, coding interviews, and competitive programming**.

---

# History

Nested loops have existed since the earliest programming languages. As software evolved, developers needed to solve problems involving two-dimensional data, repeated comparisons, and complex patterns.

Languages like ALGOL, C, and Java adopted nested loops as a standard programming construct.

---

# Evolution

```
Single Loop

↓

Nested Loop

↓

2D Arrays

↓

Matrices

↓

Algorithms

↓

Dynamic Programming
```

---

# Why Do We Need Nested Loops?

Suppose you want to print:

```
*****
*****
*****
*****
```

Using a single loop is difficult because each row contains multiple columns.

Nested loops solve this naturally.

---

# Problem Statement

Print a **4 × 5** rectangle of stars.

Expected Output:

```
*****
*****
*****
*****
```

---

# Real-Life Analogy

Imagine a school.

For every classroom:

```
Visit Classroom

↓

For every student

↓

Take Attendance

↓

Next Student

↓

Next Classroom
```

The classroom loop is the **outer loop**.

The student loop is the **inner loop**.

---

# Daily Life Applications

- Seating arrangements
- Timetables
- Multiplication tables
- Chess boards
- Sudoku grids
- Calendars

---

# Industry Applications

Nested loops are used in:

- Matrix multiplication
- Image processing
- Computer graphics
- Game maps
- Excel-like spreadsheets
- AI data processing
- Database joins (conceptually)

---

# Definition

A **Nested Loop** is a loop placed inside another loop. During each iteration of the outer loop, the inner loop executes completely.

---

# Syntax

```java
for(initialization; condition; update){

    for(initialization; condition; update){

        // statements

    }

}
```

---

# Syntax Breakdown

### Outer Loop

Controls rows or major iterations.

### Inner Loop

Controls columns or repeated work within each outer iteration.

---

# Flow Diagram

```
Start

↓

Outer Loop Starts

↓

Inner Loop Starts

↓

Execute Body

↓

Inner Loop Ends

↓

Outer Loop Continues

↓

Program Ends
```

---

# Internal Working

Example:

```java
for(int i = 1; i <= 3; i++){

    for(int j = 1; j <= 2; j++){

        System.out.println(i + " " + j);

    }

}
```

Execution:

```
i = 1

j = 1

j = 2

↓

i = 2

j = 1

j = 2

↓

i = 3

j = 1

j = 2
```

Notice that for every value of **i**, the inner loop runs completely.

---

# Memory Representation

Initially

```
i = 1

j = 1
```

After inner loop

```
j = 2

↓

j = 3

↓

Inner Loop Ends
```

Outer loop updates

```
i = 2

↓

j resets to 1
```

This process continues until the outer loop finishes.

---

# Dry Run

```java
for(int i = 1; i <= 2; i++){

    for(int j = 1; j <= 3; j++){

        System.out.print("*");

    }

    System.out.println();

}
```

| Outer (i) | Inner (j) | Output |
|-----------|-----------|--------|
| 1 | 1 | * |
| 1 | 2 | ** |
| 1 | 3 | *** |
| New Line | - | |
| 2 | 1 | * |
| 2 | 2 | ** |
| 2 | 3 | *** |

Final Output

```
***
***
```

---

# Example 1 – Rectangle Pattern

```java
for(int i = 1; i <= 4; i++){

    for(int j = 1; j <= 5; j++){

        System.out.print("*");

    }

    System.out.println();

}
```

Output

```
*****
*****
*****
*****
```

---

# Example 2 – Number Pattern

```java
for(int i = 1; i <= 3; i++){

    for(int j = 1; j <= 3; j++){

        System.out.print(j + " ");

    }

    System.out.println();

}
```

Output

```
1 2 3
1 2 3
1 2 3
```

---

# Example 3 – Multiplication Table

```java
for(int i = 1; i <= 5; i++){

    for(int j = 1; j <= 5; j++){

        System.out.print(i * j + "\t");

    }

    System.out.println();

}
```

Output

```
1   2   3   4   5
2   4   6   8   10
3   6   9   12  15
4   8   12  16  20
5   10  15  20  25
```

---

# Example 4 – Right Triangle Pattern

```java
for(int i = 1; i <= 5; i++){

    for(int j = 1; j <= i; j++){

        System.out.print("*");

    }

    System.out.println();

}
```

Output

```
*
**
***
****
*****
```

---

# Advantages

- Easy matrix processing
- Ideal for pattern problems
- Handles multidimensional data
- Powerful for algorithm design

---

# Limitations

- Can become difficult to read if deeply nested.
- More iterations may increase execution time.
- Incorrect conditions can create infinite loops.

---

# Time Complexity

Example

```java
for(int i = 1; i <= n; i++){

    for(int j = 1; j <= n; j++){

    }

}
```

Outer loop → **n** times

Inner loop → **n** times

Total Operations

```
n × n
```

Time Complexity

```
O(n²)
```

If three loops are nested:

```
O(n³)
```

Space Complexity

```
O(1)
```

---

# Best Practices

- Keep nesting levels as low as possible.
- Use meaningful variable names (`row`, `col` instead of only `i`, `j` where appropriate).
- Avoid unnecessary nested loops.
- Break large nested logic into methods.

---

# Common Mistakes

❌ Forgetting to reset the inner loop.

❌ Incorrect loop boundaries.

❌ Infinite nested loops.

❌ Confusing `i` and `j`.

---

# Comparison

| Single Loop | Nested Loop |
|-------------|-------------|
| One dimension | Two or more dimensions |
| Simpler | More powerful |
| O(n) | Often O(n²) |

---

# Interview Questions

### What is a nested loop?

A loop inside another loop.

---

### How many times does the inner loop execute?

It executes completely for every iteration of the outer loop.

---

### Where are nested loops commonly used?

Pattern printing, matrices, image processing, and algorithms.

---

### Why do pattern problems use nested loops?

Because one loop controls rows and another controls columns.

---

# MCQ

What is the output?

```java
for(int i = 1; i <= 2; i++){

    for(int j = 1; j <= 2; j++){

        System.out.print("*");

    }

    System.out.println();

}
```

A.

```
**
**
```

B.

```
****
```

C.

```
*
*
```

D. Compilation Error

**Answer:** A

---

# Coding Exercises

## Beginner

1. Print a rectangle pattern.
2. Print a square pattern.
3. Print a right triangle.
4. Print a number square.
5. Print an alphabet square.

## Intermediate

6. Print Floyd's Triangle.
7. Print Pascal's Triangle.
8. Print a pyramid pattern.
9. Print an inverted pyramid.
10. Print a diamond pattern.

## Placement Level

11. Matrix addition.
12. Matrix multiplication.
13. Matrix transpose.
14. Find diagonal sum.
15. Spiral matrix traversal.

---

# Debugging Tips

- Trace both loop variables separately.
- Draw row and column tables.
- Verify loop boundaries.
- Test with small values first.

---

# Quick Revision

| Feature | Nested Loop |
|---------|-------------|
| Loop inside another loop | ✅ |
| Common Use | Patterns & Matrices |
| Time Complexity | O(n²) (typical) |
| Space Complexity | O(1) |

---

# Bootcamp Insight 💡

Nested loops are the bridge between basic programming and advanced problem-solving. Nearly every beginner DSA course starts pattern printing with nested loops because it builds the thinking required for matrices, graphs, and dynamic programming.

---

# Connection Map

```
Loops

↓

Nested Loops

↓

Pattern Printing

↓

2D Arrays

↓

Matrices

↓

Algorithms

↓

Dynamic Programming
```

---

# Future Topic

Next, you'll learn the **Break Statement**, which allows you to terminate a loop immediately when a specific condition is met.

---

# Key Takeaways

- A nested loop is a loop inside another loop.
- The inner loop completes all its iterations for each outer loop iteration.
- Nested loops are essential for patterns, matrices, and many algorithms.
- Time complexity is commonly O(n²).
- Practice pattern problems to master nested loops.

---

# References

- Oracle Java Documentation
- Java Language Specification (JLS)
- Effective Java – Joshua Bloch
- Head First Java