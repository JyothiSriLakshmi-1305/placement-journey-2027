# Java Formatting Output

## What is Formatting Output?

**Formatting Output** is the process of displaying data in a structured, organized, and readable format.

Instead of printing values randomly, formatting allows us to control:

- Alignment
- Width
- Decimal places
- Spacing
- Presentation

Formatting is commonly done using the **printf()** method.

---

# Why Do We Need Formatting Output?

Imagine printing student details.

Without formatting:

```
Name: Jyothi
Age:20
CGPA:8.9123456
College:SVEC
```

It is difficult to read.

Using formatting:

```
Name    : Jyothi
Age     : 20
CGPA    : 8.91
College : SVEC
```

The output becomes neat and professional.

---

# Real-World Analogy

Think about a report card.

Instead of writing values randomly,

everything is arranged properly in rows and columns.

```
Subject      Marks

Java         95

Python       92

DBMS         90
```

Formatting Output helps us achieve this.

---

# Definition

Formatting Output is the technique of controlling how data appears on the console using format specifiers and formatting options.

---

# Why Use printf()?

The `printf()` method provides complete control over output formatting.

It allows us to:

- Set field width
- Control decimal precision
- Align text
- Display multiple values neatly

---

# Basic Example

```java
String name = "Jyothi";
int age = 20;
double cgpa = 8.91234;

System.out.printf("Name : %s%n", name);
System.out.printf("Age  : %d%n", age);
System.out.printf("CGPA : %.2f%n", cgpa);
```

Output

```
Name : Jyothi
Age  : 20
CGPA : 8.91
```

---

# Field Width

Field width specifies the minimum number of spaces used to display a value.

Syntax

```java
%10d
```

Example

```java
System.out.printf("%10d",100);
```

Output

```
       100
```

The number is right-aligned in a field of width 10.

---

# Left Alignment

Use a minus sign (`-`) to align output to the left.

Example

```java
System.out.printf("%-10d",100);
```

Output

```
100
```

---

# Formatting Decimal Numbers

Example

```java
double cgpa = 8.912345;

System.out.printf("%.2f", cgpa);
```

Output

```
8.91
```

Explanation

```
%.2f

↓

Print floating-point number

↓

Show only 2 digits after decimal
```

---

# Multiple Values

```java
String name = "Jyothi";
int age = 20;
double cgpa = 8.91;

System.out.printf("%s %d %.2f", name, age, cgpa);
```

Output

```
Jyothi 20 8.91
```

---

# Creating Tables

Example

```java
System.out.printf("%-15s %-10s%n", "Name", "Marks");

System.out.printf("%-15s %-10d%n", "Jyothi", 95);

System.out.printf("%-15s %-10d%n", "Lakshmi", 90);
```

Output

```
Name            Marks

Jyothi          95

Lakshmi         90
```

---

# Example Program

```java
public class FormattingDemo {

    public static void main(String[] args) {

        String name = "Jyothi";
        int age = 20;
        double cgpa = 8.91234;

        System.out.printf("%-10s : %s%n","Name",name);
        System.out.printf("%-10s : %d%n","Age",age);
        System.out.printf("%-10s : %.2f%n","CGPA",cgpa);

    }

}
```

Output

```
Name       : Jyothi
Age        : 20
CGPA       : 8.91
```

---

# Internal Working

Example

```java
System.out.printf("%10d",100);
```

Step 1

Read

```
%10d
```

Step 2

Allocate width

```
10 spaces
```

Step 3

Place value

```
100
```

Step 4

Display aligned output.

---

# Common Mistakes

## Mistake 1

Using `%d` for String.

Incorrect

```java
System.out.printf("%d","Java");
```

Correct

```java
System.out.printf("%s","Java");
```

---

## Mistake 2

Using too many decimal places unnecessarily.

Example

```java
System.out.printf("%.10f",8.91);
```

Usually

```java
%.2f
```

is enough.

---

## Mistake 3

Ignoring alignment.

Professional output should always be aligned.

---

# Best Practices

- Use `printf()` for reports.
- Align data using field width.
- Limit decimal places when displaying floating-point values.
- Keep output neat and readable.
- Use `%n` instead of `\n`.

---

# Interview Questions

### Q1

What is Formatting Output?

Formatting Output is the process of displaying data in a structured and readable format.

---

### Q2

Which method is mainly used for formatting?

Answer

```
printf()
```

---

### Q3

What does `%10d` mean?

Print an integer using a field width of 10 characters.

---

### Q4

What does `%-10s` do?

Left-aligns a String in a field of width 10.

---

### Q5

Which format specifier limits decimal places?

```
%.2f
```

---

# MCQs

### 1

Which method is used for formatted output?

A. print()

B. println()

C. printf()

D. display()

**Answer:** C

---

### 2

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

### 3

Which specifier is used to align text?

A.

```
%-10s
```

B.

```
%d
```

C.

```
%c
```

D.

```
%b
```

**Answer:** A

---

# Coding Exercises

1. Print student details using formatting.
2. Create a marks table.
3. Print employee salary with two decimal places.
4. Display a formatted receipt.
5. Create a formatted report card.

---

# Assignment

Write a Java program that prints:

- Name
- Roll Number
- Branch
- CGPA
- Placement Status

using proper alignment and formatting.

---

# Revision Notes

- Formatting Output improves readability.
- `printf()` is used for formatting.
- Field width controls spacing.
- Precision controls decimal places.
- Alignment makes output professional.

---

# Key Takeaways

- Formatting Output makes console applications easier to read.
- Use field width to align values.
- Use precision for decimal numbers.
- `printf()` is the preferred method for formatted output.
- Professional applications rely heavily on formatted output.

---

## References

- Oracle Java Documentation
- https://docs.oracle.com/en/java/