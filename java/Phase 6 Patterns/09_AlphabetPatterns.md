# Alphabet Patterns

> **Module 19 – Pattern Programming**

---

# 1. Introduction

Alphabet Patterns are patterns where letters (A–Z) are printed instead of stars or numbers.

These patterns strengthen:

- Character handling
- ASCII/Unicode concepts
- Nested loops
- Pattern recognition
- Logical thinking

They are frequently asked in Java interviews because they combine loops with character manipulation.

---

# 2. History

Character patterns became popular after programming languages introduced character data types.

Java uses the Unicode character set, making it easy to generate alphabet patterns through arithmetic operations on characters.

---

# 3. Evolution

```text
Star Patterns

↓

Number Patterns

↓

Alphabet Patterns

↓

Character Manipulation

↓

Advanced Pattern Programming
```

---

# 4. Why Learn Alphabet Patterns?

Alphabet patterns help you understand:

- Character arithmetic
- ASCII/Unicode values
- Row-column relationships
- Dynamic printing
- Pattern logic

---

# 5. Pattern Thinking ⭐

Before coding, ask:

```text
How many rows?

↓

How many columns?

↓

Which character should I print?

↓

Does the character depend on row or column?
```

---

# 6. Character Basics

Characters in Java are stored using Unicode values.

Examples:

| Character | Value |
|-----------|------:|
| A | 65 |
| B | 66 |
| C | 67 |
| D | 68 |
| Z | 90 |

Convert integer to character:

```java
(char)(65)
```

Output

```
A
```

---

# 7. Formula Sheet ⭐

| Pattern | Formula |
|----------|---------|
| AAAAA | 'A' |
| ABCDE | (char)(64 + col) |
| AAAA / BBBB | (char)(64 + row) |
| Triangle | (char)(64 + col) |
| Repeated Triangle | (char)(64 + row) |

---

# 8. Pattern 1 – Constant Alphabet

Output

```text
AAAAA
AAAAA
AAAAA
AAAAA
```

Code

```java
for(int row = 1; row <= 4; row++){

    for(int col = 1; col <= 5; col++){

        System.out.print("A");

    }

    System.out.println();

}
```

---

# 9. Pattern 2 – Alphabet Rectangle

Output

```text
ABCDE
ABCDE
ABCDE
ABCDE
```

Formula

```
Print = (char)(64 + col)
```

Code

```java
for(int row = 1; row <= 4; row++){

    for(int col = 1; col <= 5; col++){

        System.out.print((char)(64 + col));

    }

    System.out.println();

}
```

---

# 10. Pattern 3 – Row Alphabet

Output

```text
AAAAA
BBBBB
CCCCC
DDDDD
```

Formula

```
Print = (char)(64 + row)
```

Code

```java
for(int row = 1; row <= 4; row++){

    for(int col = 1; col <= 5; col++){

        System.out.print((char)(64 + row));

    }

    System.out.println();

}
```

---

# 11. Pattern 4 – Alphabet Half Pyramid

Output

```text
A
AB
ABC
ABCD
ABCDE
```

Formula

```
Columns = Row

Print = (char)(64 + col)
```

Code

```java
for(int row = 1; row <= 5; row++){

    for(int col = 1; col <= row; col++){

        System.out.print((char)(64 + col));

    }

    System.out.println();

}
```

---

# 12. Pattern 5 – Repeated Alphabet Pyramid

Output

```text
A
BB
CCC
DDDD
EEEEE
```

Formula

```
Columns = Row

Print = (char)(64 + row)
```

Code

```java
for(int row = 1; row <= 5; row++){

    for(int col = 1; col <= row; col++){

        System.out.print((char)(64 + row));

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

Characters

A B C
```

The printed character depends on:

- Constant
- Row
- Column

---

# 14. Memory Representation

```text
Row = 1

↓

Col = 1

↓

'A'

↓

Col = 2

↓

'B'

↓

Col = 3

↓

'C'
```

---

# 15. Time Complexity

Nested loops

```
O(n²)
```

---

# 16. Space Complexity

```
O(1)
```

---

# 17. Best Practices

- Learn ASCII/Unicode basics.
- Use `(char)` casting correctly.
- Identify whether the pattern depends on the row or column.
- Dry run before coding.

---

# 18. Common Mistakes

❌ Forgetting `(char)`.

❌ Using `row` instead of `col`.

❌ Incorrect ASCII offset.

Example

Incorrect

```java
(char)(65 + col)
```

Correct

```java
(char)(64 + col)
```

---

# 19. Debugging Tips

If the output is incorrect:

- Verify the ASCII formula.
- Check loop limits.
- Print one row at a time.
- Dry run the pattern.

---

# 20. Interview Questions

### How do you print 'A' using ASCII?

```java
(char)65
```

---

### How do you print characters using the column?

```java
(char)(64 + col)
```

---

### How do you print repeated row characters?

```java
(char)(64 + row)
```

---

### Time Complexity?

```
O(n²)
```

---

# 21. Coding Exercises

## Beginner

1. Print constant alphabets.
2. Print ABCDE rectangle.
3. Print row alphabets.
4. Print alphabet half pyramid.
5. Print repeated alphabet pyramid.

## Intermediate

6. Reverse alphabet triangle.
7. Continuous alphabet pattern.
8. User-input alphabet pattern.
9. Zig-zag alphabet pattern.
10. Alphabet diamond.

---

# 22. Pattern Recognition ⭐

```text
Need Same Character?

↓

Print Constant

Need A B C D?

↓

Print Column

Need A A A?

↓

Print Row
```

---

# 23. Bootcamp Insight 💡

Alphabet patterns teach you **character arithmetic**, an important Java concept used in:

- Strings
- Encryption
- Parsing
- Compilers
- Text processing

---

# 24. Quick Revision

```text
Rows

↓

Columns

↓

Character?

↓

Constant

↓

Row

↓

Column
```

---

# 25. Key Takeaways

- Alphabet patterns use nested loops.
- Characters are generated using Unicode values.
- Common formulas:
  - `(char)(64 + col)`
  - `(char)(64 + row)`
- Character arithmetic is useful beyond pattern programming.

---

# 26. References

- Oracle Java Documentation
- Java Language Specification
- Effective Java – Joshua Bloch
- Head First Java