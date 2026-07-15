# Java Common Output Mistakes

## Introduction

While learning Java output methods (`print()`, `println()`, and `printf()`), beginners often make common mistakes that lead to incorrect output or runtime exceptions.

Understanding these mistakes helps you write cleaner and more reliable Java programs.

---

# Mistake 1: Confusing print() and println()

### Incorrect

```java
System.out.print("Java");
System.out.print("Course");
```

### Output

```
JavaCourse
```

Many beginners expect

```
Java
Course
```

---

### Correct

```java
System.out.println("Java");
System.out.println("Course");
```

Output

```
Java
Course
```

---

# Mistake 2: Forgetting Spaces

### Incorrect

```java
System.out.print("Hello");
System.out.print("World");
```

Output

```
HelloWorld
```

---

### Correct

```java
System.out.print("Hello ");
System.out.print("World");
```

Output

```
Hello World
```

---

# Mistake 3: Using Wrong Format Specifier

### Incorrect

```java
System.out.printf("%d","Java");
```

Result

```
IllegalFormatConversionException
```

---

### Correct

```java
System.out.printf("%s","Java");
```

Output

```
Java
```

---

# Mistake 4: Missing Arguments in printf()

### Incorrect

```java
System.out.printf("Age : %d");
```

Result

```
MissingFormatArgumentException
```

Because `%d` expects an integer argument.

---

### Correct

```java
System.out.printf("Age : %d",20);
```

Output

```
Age : 20
```

---

# Mistake 5: Wrong Decimal Formatting

### Incorrect

```java
double cgpa = 8.912345;

System.out.printf("%d",cgpa);
```

Result

```
IllegalFormatConversionException
```

---

### Correct

```java
System.out.printf("%.2f",cgpa);
```

Output

```
8.91
```

---

# Mistake 6: Forgetting %% for Percent Symbol

### Incorrect

```java
System.out.printf("100%");
```

This works because `%` is treated as a normal character when it's not starting a valid format specifier, but inside formatted patterns you should escape a literal percent.

---

### Correct

```java
System.out.printf("Success : 100%%");
```

Output

```
Success : 100%
```

---

# Mistake 7: Forgetting %n

### Incorrect

```java
System.out.printf("Java");
System.out.printf("Course");
```

Output

```
JavaCourse
```

---

### Correct

```java
System.out.printf("Java%n");
System.out.printf("Course");
```

Output

```
Java
Course
```

---

# Mistake 8: Using Too Many println()

### Poor Style

```java
System.out.println("Name");
System.out.println(":");
System.out.println("Jyothi");
```

Output

```
Name
:
Jyothi
```

---

### Better

```java
System.out.println("Name : Jyothi");
```

---

# Mistake 9: Misusing Width Formatting

### Incorrect

```java
System.out.printf("%2d",12345);
```

Output

```
12345
```

The width is a **minimum width**, not a maximum. Java will print the full value if it is longer.

---

### Better

```java
System.out.printf("%10d",12345);
```

Output

```
     12345
```

---

# Mistake 10: Ignoring Readability

### Poor Output

```
Name:JyothiAge:20CGPA:8.91
```

---

### Better Output

```
Name : Jyothi
Age  : 20
CGPA : 8.91
```

---

# Summary Table

| Mistake | Correct Solution |
|----------|------------------|
| Using `print()` instead of `println()` | Use `println()` for new lines |
| Forgetting spaces | Add spaces manually |
| Wrong format specifier | Match specifier to data type |
| Missing `printf()` arguments | Provide all required arguments |
| Wrong decimal formatting | Use `%f` or `%.2f` |
| Printing `%` | Use `%%` |
| Forgetting `%n` | Use `%n` for new lines |
| Too many `println()` | Print complete statements |
| Wrong field width | Understand minimum width |
| Poor formatting | Keep output neat and readable |

---

# Best Practices

- Choose the correct output method.
- Use meaningful labels.
- Select the correct format specifier.
- Use `%n` with `printf()`.
- Format floating-point values properly.
- Keep console output clean and readable.

---

# Interview Questions

### Q1

What is the difference between `print()` and `println()`?

**Answer**

`print()` prints on the same line.

`println()` prints and moves to the next line.

---

### Q2

Which exception occurs when the wrong format specifier is used?

**Answer**

`IllegalFormatConversionException`

---

### Q3

Which exception occurs when a format argument is missing?

**Answer**

`MissingFormatArgumentException`

---

### Q4

How do you print a percent symbol using `printf()`?

**Answer**

```java
%%
```

---

### Q5

Why is formatting important?

**Answer**

It improves readability and makes console output professional.

---

# MCQs

### 1

Which method automatically moves to the next line?

A. print()

B. printf()

C. println()

D. nextLine()

**Answer:** C

---

### 2

Which format specifier prints a String?

A. `%d`

B. `%f`

C. `%s`

D. `%c`

**Answer:** C

---

### 3

Which symbol prints a percentage sign?

A. `%`

B. `%%`

C. `%p`

D. `#`

**Answer:** B

---

### 4

Which exception occurs for:

```java
System.out.printf("%d","Java");
```

A. NullPointerException

B. IllegalFormatConversionException

C. IOException

D. ArithmeticException

**Answer:** B

---

# Coding Exercises

1. Correct a program using the wrong format specifier.
2. Print student details with proper formatting.
3. Print percentages correctly.
4. Convert poorly formatted output into professional output.
5. Create a formatted employee report.

---

# Assignment

Write a Java program that demonstrates **five common output mistakes** and then shows the corrected version of each.

---

# Revision Notes

- Choose the correct output method.
- Match format specifiers to data types.
- Use `%n` for new lines.
- Use `%%` for percent symbols.
- Keep output aligned and readable.
- Understand common formatting exceptions.

---

# Key Takeaways

- Most output errors come from incorrect formatting.
- `printf()` is powerful but requires the correct format specifiers.
- Proper formatting improves readability.
- Understanding common mistakes helps avoid runtime exceptions.
- Clean console output is an important programming skill.

---

## References

- Oracle Java Documentation
- https://docs.oracle.com/en/java/