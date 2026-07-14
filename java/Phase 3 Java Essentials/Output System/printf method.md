# Java printf() Method

## What is printf()?

The `printf()` method is used to display **formatted output** in Java.

Unlike `print()` and `println()`, `printf()` allows us to control **how data is displayed**, such as:

- Number of decimal places
- Width of output
- Text alignment
- Combination of text and variables

It belongs to the **PrintStream** class and is accessed using the **System.out** object.

---

# Why Do We Need printf()?

Sometimes normal printing is not enough.

Suppose we want to print a student's CGPA.

Using `println()`

```java
double cgpa = 8.912345;

System.out.println(cgpa);
```

Output

```
8.912345
```

But suppose we need only **2 decimal places**.

Using `printf()`

```java
System.out.printf("%.2f", cgpa);
```

Output

```
8.91
```

---

# Real-World Analogy

Imagine preparing a report card.

You don't randomly write values.

Everything is aligned.

```
Name      : Jyothi
Age       : 20
CGPA      : 8.91
```

This formatting is exactly what `printf()` helps us do.

---

# Definition

`printf()` prints formatted output using **format specifiers**.

It combines text and variables in a structured format.

---

# Syntax

```java
System.out.printf("format", values);
```

Example

```java
System.out.printf("Age = %d", 20);
```

Output

```
Age = 20
```

---

# Internal Working

Example

```java
int age = 20;

System.out.printf("Age : %d", age);
```

Step 1

```
Read Format String

↓

"Age : %d"
```

Step 2

```
Find

%d
```

Step 3

Replace

```
%d

↓

20
```

Step 4

Output

```
Age : 20
```

---

# Flow Diagram

```
Program

↓

printf()

↓

Read Format String

↓

Replace Format Specifiers

↓

Display Formatted Output
```

---

# Common Format Specifiers

| Specifier | Meaning | Example |
|-----------|----------|----------|
| `%d` | Integer | 25 |
| `%f` | Floating Point | 8.91 |
| `%.2f` | Float with 2 decimal places | 8.91 |
| `%c` | Character | A |
| `%s` | String | Java |
| `%b` | Boolean | true |
| `%n` | New Line | Line Break |
| `%%` | Percent Symbol | % |

---

# Example 1 - Integer

```java
int age = 20;

System.out.printf("Age = %d", age);
```

Output

```
Age = 20
```

---

# Example 2 - Floating Point

```java
double cgpa = 8.91234;

System.out.printf("%.2f", cgpa);
```

Output

```
8.91
```

---

# Example 3 - String

```java
String name = "Jyothi";

System.out.printf("Name : %s", name);
```

Output

```
Name : Jyothi
```

---

# Example 4 - Character

```java
char grade = 'A';

System.out.printf("Grade : %c", grade);
```

Output

```
Grade : A
```

---

# Example 5 - Boolean

```java
boolean placed = true;

System.out.printf("Placed : %b", placed);
```

Output

```
Placed : true
```

---

# Example 6 - Multiple Values

```java
String name = "Jyothi";
int age = 20;
double cgpa = 8.91;

System.out.printf(
"Name : %s%nAge : %d%nCGPA : %.2f",
name,
age,
cgpa
);
```

Output

```
Name : Jyothi
Age : 20
CGPA : 8.91
```

---

# Width Formatting

Example

```java
System.out.printf("%10d",100);
```

Output

```
       100
```

Number is right-aligned within 10 spaces.

---

# Left Alignment

```java
System.out.printf("%-10d",100);
```

Output

```
100
```

---

# Example Program

```java
public class PrintfDemo {

    public static void main(String[] args) {

        String name = "Jyothi";
        int age = 20;
        double cgpa = 8.91234;
        char grade = 'A';
        boolean placed = false;

        System.out.printf("Name   : %s%n", name);
        System.out.printf("Age    : %d%n", age);
        System.out.printf("CGPA   : %.2f%n", cgpa);
        System.out.printf("Grade  : %c%n", grade);
        System.out.printf("Placed : %b%n", placed);

    }

}
```

Output

```
Name   : Jyothi
Age    : 20
CGPA   : 8.91
Grade  : A
Placed : false
```

---

# Common Mistakes

## Mistake 1

Wrong Specifier

```java
System.out.printf("%d","Java");
```

Runtime Error

Correct

```java
System.out.printf("%s","Java");
```

---

## Mistake 2

Using `%f` for integers.

Prefer

```
%d
```

for integers.

---

## Mistake 3

Forgetting arguments.

```java
System.out.printf("Age : %d");
```

This causes an exception because `%d` expects an integer value.

---

# Best Practices

- Use `%d` for integers.
- Use `%f` for decimal numbers.
- Use `%.2f` for two decimal places.
- Use `%n` instead of `\n` for platform-independent new lines.
- Choose the correct format specifier for each data type.

---

# Interview Questions

### Q1

What is the difference between `print()`, `println()`, and `printf()`?

**Answer:**

- `print()` prints on the same line.
- `println()` prints and moves to the next line.
- `printf()` prints formatted output.

---

### Q2

Which specifier is used for integers?

**Answer**

```
%d
```

---

### Q3

Which specifier prints two decimal places?

**Answer**

```
%.2f
```

---

### Q4

Which specifier prints a String?

**Answer**

```
%s
```

---

### Q5

What does `%n` do?

**Answer**

It inserts a new line in a platform-independent way.

---

# MCQs

### 1

Which method prints formatted output?

A. print()

B. println()

C. printf()

D. display()

**Answer:** C

---

### 2

Which format specifier is used for `double`?

A. `%d`

B. `%f`

C. `%c`

D. `%b`

**Answer:** B

---

### 3

Output

```java
System.out.printf("%.2f",8.916);
```

A.

```
8.91
```

B.

```
8.92
```

C.

```
8.916
```

D.

Error

**Answer:** B

---

### 4

Which specifier prints a String?

A. `%d`

B. `%s`

C. `%c`

D. `%b`

**Answer:** B

---

# Coding Exercises

1. Print your name using `%s`.
2. Print your age using `%d`.
3. Print your CGPA with two decimal places.
4. Print all student details using one `printf()`.
5. Create a formatted report card.

---

# Assignment

Write a Java program that prints:

- Name
- Age
- Branch
- College
- CGPA (2 decimal places)
- Grade
- Placement Status

using **only `printf()`**.

---

# Revision Notes

- `printf()` prints formatted output.
- Uses format specifiers.
- `%d` → Integer
- `%f` → Floating Point
- `%.2f` → Two decimal places
- `%c` → Character
- `%s` → String
- `%b` → Boolean
- `%n` → New Line

---

# Key Takeaways

- `printf()` is used for professional and formatted output.
- It improves readability.
- It is widely used in reports, tables, and console applications.
- Use the correct format specifier for each data type.
- `%n` is preferred over `\n` for portability.

---

## References

- Oracle Java Documentation
- https://docs.oracle.com/en/java/