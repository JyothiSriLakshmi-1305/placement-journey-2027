# Rectangle and Square Patterns

> **Module 19 – Pattern Programming**

---

# 1. Introduction

Rectangle and Square patterns are the simplest patterns in Java.

They help us understand:

- Nested loops
- Rows
- Columns
- Pattern observation
- Pattern logic

Almost every complex pattern is built using the same concepts learned here.

---

# 2. History

Rectangle patterns were among the first exercises introduced in programming education because they clearly demonstrate how nested loops work.

These patterns are still used today in:

- Universities
- Coding interviews
- Bootcamps
- Competitive programming

---

# 3. Evolution

```
Single Loop

↓

Nested Loop

↓

Rectangle Pattern

↓

Square Pattern

↓

Triangle Patterns

↓

Pyramid Patterns

↓

Advanced Patterns
```

---

# 4. Why Learn Rectangle Patterns?

Rectangle patterns teach us:

- How nested loops execute
- Difference between rows and columns
- Printing logic
- Dry running programs
- Pattern thinking

---

# 5. Pattern Thinking ⭐

Whenever you see any rectangle pattern, ask:

```
How many rows?

↓

How many columns?

↓

What should I print?
```

Rectangle patterns never require spaces.

---

# 6. Formula

```
Outer Loop

↓

Rows

Inner Loop

↓

Columns

Print

↓

Symbol
```

---

# 7. Pattern 1 – Solid Rectangle

Output

```
*****
*****
*****
*****
```

Rows = 4

Columns = 5

---

### Dry Run

| Row | Columns Printed |
|-----|-----------------|
|1|*****|
|2|*****|
|3|*****|
|4|*****|

---

### Logic

Outer loop

```
4 times
```

Inner loop

```
5 times
```

---

### Code

```java
public class RectanglePattern {

    public static void main(String[] args) {

        for(int row = 1; row <= 4; row++) {

            for(int col = 1; col <= 5; col++) {

                System.out.print("*");

            }

            System.out.println();

        }

    }

}
```

---

### Time Complexity

```
O(rows × columns)
```

Example

```
4 × 5

↓

20 iterations
```

---

### Space Complexity

```
O(1)
```

---

# 8. Pattern 2 – Square Pattern

Output

```
****
****
****
****
```

Rows = 4

Columns = 4

---

### Code

```java
public class SquarePattern {

    public static void main(String[] args) {

        for(int row = 1; row <= 4; row++) {

            for(int col = 1; col <= 4; col++) {

                System.out.print("*");

            }

            System.out.println();

        }

    }

}
```

---

# 9. Pattern 3 – Number Rectangle

Output

```
11111
11111
11111
11111
```

---

### Code

```java
public class NumberRectangle {

    public static void main(String[] args) {

        for(int row = 1; row <= 4; row++) {

            for(int col = 1; col <= 5; col++) {

                System.out.print("1");

            }

            System.out.println();

        }

    }

}
```

---

# 10. Pattern 4 – Alphabet Rectangle

Output

```
AAAA
AAAA
AAAA
AAAA
```

---

### Code

```java
public class AlphabetRectangle {

    public static void main(String[] args) {

        for(int row = 1; row <= 4; row++) {

            for(int col = 1; col <= 4; col++) {

                System.out.print("A");

            }

            System.out.println();

        }

    }

}
```

---

# 11. Pattern Formula Sheet ⭐

| Pattern | Rows | Columns | Print |
|----------|------|----------|-------|
| Rectangle | Fixed | Fixed | * |
| Square | Fixed | Fixed | * |
| Number Rectangle | Fixed | Fixed | Number |
| Alphabet Rectangle | Fixed | Fixed | Character |

---

# 12. Internal Working

```
Row = 1

↓

Column = 1

↓

Print

↓

Column++

↓

Column Ends

↓

New Line

↓

Next Row
```

---

# 13. Memory Representation

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

Next Row
```

---

# 14. Common Mistakes

❌ Forgetting `println()` after each row.

❌ Using one loop instead of nested loops.

❌ Confusing row and column limits.

❌ Printing in the wrong place.

---

# 15. Best Practices

- Draw the pattern first.
- Count rows.
- Count columns.
- Write outer loop first.
- Write inner loop second.
- Dry run every pattern.

---

# 16. Interview Questions

### Why do rectangle patterns use nested loops?

Because one loop controls rows and another controls columns.

---

### Which loop controls rows?

Outer loop.

---

### Which loop controls columns?

Inner loop.

---

### Time Complexity?

```
O(rows × columns)
```

---

# 17. Coding Exercises

### Beginner

1. Print a 3 × 3 rectangle.
2. Print a 6 × 4 rectangle.
3. Print a 7 × 7 square.
4. Print a rectangle of '#'.
5. Print a rectangle of '$'.

---

### Intermediate

6. Take rows and columns from the user.
7. Print using a character entered by the user.
8. Print a rectangle using a number entered by the user.

---

# 18. Pattern Recognition ⭐

```
Rectangle

↓

Rows Fixed

↓

Columns Fixed

↓

Print Same Symbol
```

Whenever both rows and columns are constant, think **Rectangle Pattern**.

---

# 19. Bootcamp Insight 💡

Every advanced pattern—triangle, pyramid, diamond, butterfly, and hollow patterns—starts with the same nested loop structure used in rectangle patterns.

Master this chapter, and you'll find the remaining patterns much easier.

---

# 20. Quick Revision

```
Rows

↓

Outer Loop

Columns

↓

Inner Loop

Print

↓

Symbol

↓

New Line
```

---

# 21. Key Takeaways

- Rectangle patterns use nested loops.
- Outer loop controls rows.
- Inner loop controls columns.
- Both rows and columns remain constant.
- Rectangle patterns are the foundation of all pattern programming.

---

# 22. References

- Oracle Java Documentation
- Java Language Specification
- Effective Java – Joshua Bloch
- Head First Java