
# Nested Loops

> **Module 18 – Loops**

---

# 1. Introduction

A **Nested Loop** is a loop inside another loop. For every iteration of the **outer loop**, the **inner loop** executes completely.

Nested loops are the foundation for **pattern printing, 2D arrays, matrices, image processing, and many DSA algorithms**.

---

# 2. History

Nested loops have existed since early structured programming languages. As programmers started solving matrix and table-based problems, nested loops became an essential programming construct.

---

# 3. Evolution

```text
Single Loop
    ↓
Nested Loop
    ↓
Pattern Printing
    ↓
2D Arrays
    ↓
Matrices
    ↓
Algorithms
```

---

# 4. Why Nested Loops?

A single loop can process one dimension.

Nested loops process two or more dimensions.

Example:

Print a rectangle:

*****
*****
*****
*****

---

# 5. Problem Statement

Print a **4 × 5** star rectangle.

---

# 6. Real-Life Analogy

```text
School
 │
 ├── Classroom 1
 │      ├── Student 1
 │      ├── Student 2
 │      └── Student 3
 │
 └── Classroom 2
        ├── Student 1
        └── Student 2
```

Outer loop → Classrooms

Inner loop → Students

---

# 7. Daily Applications

- Seating charts
- Calendars
- Timetables
- Chess boards
- Sudoku

---

# 8. Industry Applications

- Matrix multiplication
- Image processing
- Computer graphics
- Game maps
- Excel sheets
- Data analysis

---

# 9. Definition

A nested loop is a loop placed inside another loop. The inner loop finishes all iterations before the outer loop continues.

---

# 10. Syntax

```java
for(int row=1; row<=3; row++){

    for(int col=1; col<=5; col++){

        System.out.print("*");

    }

    System.out.println();

}
```

---

# 11. Syntax Breakdown

- Outer loop → Rows
- Inner loop → Columns

---

# 12. Internal Working

Execution order

1. Outer loop starts.
2. Inner loop starts.
3. Inner loop finishes completely.
4. Outer loop moves to next iteration.
5. Repeat.

---

# 13. Flow Diagram

```text
Outer Loop
     │
     ▼
Inner Loop
     │
     ▼
Execute Body
     │
     ▼
Inner Ends
     │
     ▼
Outer Continues
```

---

# 14. Memory Representation

```text
row = 1

col = 1
*
col = 2
**
col = 3
***

row = 2

col resets to 1
```

---

# 15. Execution Cycle

Outer Loop

↓

Inner Loop

↓

Body

↓

Inner Ends

↓

Outer Updates

↓

Repeat

---

# 16. Counter Pattern ⭐

Outer loop counter → counts rows

Inner loop counter → counts columns

```java
for(int row=1; row<=3; row++){

    for(int col=1; col<=4; col++){

        System.out.print("*");

    }

    System.out.println();

}
```

---

# 17. Accumulator Pattern ⭐

Example: Sum of all elements in a matrix.

```java
int[][] a={{1,2},{3,4}};

int sum=0;

for(int[] row:a){

    for(int value:row){

        sum+=value;

    }

}

System.out.println(sum);
```

---

# 18. Sentinel Pattern ⭐

Read rows until user enters 0.

Useful in menu-driven programs and matrix input.

---

# 19. Flag Pattern ⭐

Search in a matrix.

```java
boolean found=false;

for(int i=0;i<rows;i++){

    for(int j=0;j<cols;j++){

        if(matrix[i][j]==target){

            found=true;
            break;

        }

    }

    if(found) break;

}
```

---

# 20. Examples

- Rectangle
- Square
- Right Triangle
- Number Pattern
- Multiplication Table
- Matrix Traversal

---

# 21. Dry Run

| Row | Col | Output |
|----:|----:|--------|
|1|1|*|
|1|2|**|
|1|3|***|
|2|1|*|

---

# 22. Infinite Nested Loop

Incorrect update conditions can create infinite loops.

Always verify both loop variables.

---

# 23. Best Practices

- Use meaningful names (`row`, `col`)
- Avoid unnecessary deep nesting
- Extract complex logic into methods

---

# 24. Common Mistakes

- Confusing row and column
- Wrong loop boundaries
- Forgetting inner loop reset
- Infinite loops

---

# 25. Debugging Tips

- Trace both variables separately.
- Draw row-column tables.
- Test with small values.

---

# 26. Time Complexity

Single loop → O(n)

Nested loops → O(n²)

Triple nested loops → O(n³)

---

# 27. Space Complexity

O(1)

---

# 28. Comparison

| Feature | Single Loop | Nested Loop |
|---------|-------------|-------------|
| Dimensions | 1 | 2+ |
| Time | O(n) | O(n²) |
| Patterns | Limited | Excellent |
| Matrices | ❌ | ✅ |

---

# 29. Interview Questions

1. What is a nested loop?
2. Why does the inner loop restart?
3. Where are nested loops used?
4. Why are pattern problems solved using nested loops?
5. What is the typical time complexity?

---

# 30. MCQs

**Which loop prints rows?**

A. Inner Loop

B. Outer Loop

**Answer:** B

---

# 31. Coding Exercises

1. Rectangle Pattern
2. Hollow Rectangle
3. Right Triangle
4. Pyramid
5. Floyd's Triangle
6. Multiplication Table
7. Matrix Addition
8. Matrix Multiplication

---

# 32. Assignment

- Build 10 pattern programs.
- Print chessboard.
- Create multiplication table generator.
- Find matrix diagonal sum.

---

# 33. Pattern Recognition ⭐

| Problem | Pattern |
|---------|---------|
| Rectangle | Counter |
| Matrix Sum | Accumulator |
| Search Matrix | Flag |
| Read Until Exit | Sentinel |

---

# 34. Quick Revision

- Outer loop → Rows
- Inner loop → Columns
- Counter
- Accumulator
- Flag
- Sentinel

---

# 35. Bootcamp Insight 💡

Nested loops are the bridge between basic loops and advanced DSA. Almost every matrix algorithm, pattern problem, and graph traversal begins with understanding how nested loops execute.

---

# 36. Connection Map

```text
Nested Loops
      │
      ├── Pattern Printing
      ├── 2D Arrays
      ├── Matrices
      ├── Searching
      ├── Dynamic Programming
      └── Graph Algorithms
```

---

# 37. Key Takeaways

- Outer loop controls rows.
- Inner loop controls columns.
- Time complexity is often O(n²).
- Counter, accumulator, flag, and sentinel patterns are reusable in DSA.

---

# 38. References

- Oracle Java Documentation
- Java Language Specification
- Effective Java
- Head First Java
