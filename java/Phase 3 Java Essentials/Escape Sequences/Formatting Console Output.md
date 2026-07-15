# Java Formatting Console Output

## What is Formatting Console Output?

Formatting Console Output is the process of displaying information on the console in a **clear, organized, and readable** manner.

Java provides several ways to format output using:

- `print()`
- `println()`
- `printf()`
- Escape Sequences (`\n`, `\t`, `\"`, `\'`, `\\`)

---

# Why Do We Need Formatting?

Imagine printing student information.

Without formatting

```
Name:JyothiAge:20CGPA:8.91College:SVEC
```

Difficult to read.

With formatting

```
Name    : Jyothi
Age     : 20
CGPA    : 8.91
College : SVEC
```

Much easier to understand.

---

# Real-Life Analogy

Think about your college marks memo.

Instead of writing everything continuously,

```
SubjectMarksJava95Python92DBMS90
```

it is organized into rows and columns.

```
Subject     Marks

Java        95
Python      92
DBMS        90
```

Formatting makes information professional and readable.

---

# Daily Applications

Formatting is used in:

- Student reports
- ATM receipts
- Bills and invoices
- Bank statements
- Employee salary slips
- Console applications

---

# Industry Applications

Formatting is widely used in:

- Banking Software
- Hospital Management Systems
- Billing Systems
- ERP Applications
- Payroll Systems
- Log Files
- Report Generation

---

# Methods Used for Formatting

Java provides three output methods.

## print()

Prints output on the same line.

```java
System.out.print("Hello ");
System.out.print("Java");
```

Output

```
Hello Java
```

---

## println()

Prints output and moves to the next line.

```java
System.out.println("Hello");
System.out.println("Java");
```

Output

```
Hello
Java
```

---

## printf()

Prints formatted output.

```java
System.out.printf("Age : %d",20);
```

Output

```
Age : 20
```

---

# Using Escape Sequences

## New Line

```java
System.out.print("Java\nProgramming");
```

Output

```
Java
Programming
```

---

## Tab Space

```java
System.out.print("Name\tAge");
```

Output

```
Name    Age
```

---

## Double Quotes

```java
System.out.println("\"Java\"");
```

Output

```
"Java"
```

---

## Single Quote

```java
System.out.println("\'");
```

Output

```
'
```

---

## Backslash

```java
System.out.println("C:\\Java");
```

Output

```
C:\Java
```

---

# Combining Everything

```java
public class StudentInfo {

    public static void main(String[] args) {

        String name = "Jyothi";
        int age = 20;
        double cgpa = 8.91;

        System.out.println("Student Information");
        System.out.println("---------------------");

        System.out.printf("Name\t: %s%n",name);
        System.out.printf("Age\t: %d%n",age);
        System.out.printf("CGPA\t: %.2f%n",cgpa);

    }

}
```

Output

```
Student Information
---------------------

Name    : Jyothi
Age     : 20
CGPA    : 8.91
```

---

# Formatting Table

```java
System.out.printf("%-15s %-10s%n","Name","Marks");

System.out.printf("%-15s %-10d%n","Jyothi",95);

System.out.printf("%-15s %-10d%n","Lakshmi",90);
```

Output

```
Name            Marks

Jyothi          95

Lakshmi         90
```

---

# Internal Working

```
Program

↓

Output Method

↓

Formatting

↓

Escape Sequence Processing

↓

Console Display
```

---

# Memory Diagram

```
Java Program

↓

System.out

↓

PrintStream

↓

Formatting

↓

Console
```

---

# Best Practices

- Use `println()` for line-by-line output.
- Use `print()` when output should remain on the same line.
- Use `printf()` for formatted reports.
- Use `\t` for simple spacing.
- Use `%n` with `printf()` for new lines.
- Keep console output neat and readable.

---

# Common Mistakes

## Mistake 1

Printing everything on one line.

Incorrect

```java
System.out.print("Name");
System.out.print("Age");
```

Correct

```java
System.out.println("Name");
System.out.println("Age");
```

---

## Mistake 2

Not using formatting for reports.

Instead of

```
Name:JyothiAge:20CGPA:8.91
```

Use

```
Name : Jyothi
Age  : 20
CGPA : 8.91
```

---

## Mistake 3

Using spaces instead of formatting.

Prefer

```java
printf()
```

for professional output.

---

# Interview Questions

### Q1

What is Formatting Console Output?

**Answer**

Formatting Console Output is the process of displaying data in a structured and readable format.

---

### Q2

Which method is best for formatted reports?

**Answer**

`printf()`

---

### Q3

Which escape sequence creates a new line?

**Answer**

`\n`

---

### Q4

Which escape sequence inserts a tab?

**Answer**

`\t`

---

### Q5

How do you print a double quote?

**Answer**

```java
\" 
```

---

# MCQs

### 1

Which method is mainly used for formatted output?

A. print()

B. println()

C. printf()

D. nextLine()

**Answer:** C

---

### 2

Which escape sequence inserts a tab?

A. `\n`

B. `\t`

C. `\\`

D. `\"`

**Answer:** B

---

### 3

Which escape sequence prints a backslash?

A. `\`

B. `\\`

C. `///`

D. `//`

**Answer:** B

---

### 4

Which method automatically moves to the next line?

A. print()

B. println()

C. printf()

D. display()

**Answer:** B

---

# Coding Exercises

1. Print student information using `println()`.
2. Print a multiplication table using `printf()`.
3. Display a formatted report card.
4. Use `\n` and `\t` together.
5. Print a Windows file path correctly.

---

# Assignment

Write a Java program that displays:

- Name
- Age
- College
- Branch
- CGPA

using:

- `print()`
- `println()`
- `printf()`
- `\n`
- `\t`

The output should be well formatted.

---

# Revision Notes

- Formatting improves readability.
- `print()` → Same line.
- `println()` → New line.
- `printf()` → Formatted output.
- `\n` → New line.
- `\t` → Tab.
- `\"` → Double quote.
- `\'` → Single quote.
- `\\` → Backslash.

---

# Connection Map

```
Escape Sequences

↓

Output Methods

↓

Formatted Console Output

↓

Scanner Input

↓

User Interaction
```

---

# Future Topic Connection

After learning how to **display information**, the next step is learning how to **accept information from the user**.

That leads to:

```
Module 14

↓

Input System

↓

Scanner Class

↓

BufferedReader

↓

Console
```

---

# Key Takeaways

- Console formatting improves readability and professionalism.
- `print()`, `println()`, and `printf()` each serve different purposes.
- Escape sequences help structure console output.
- Formatted output is widely used in real-world Java applications.
- Good formatting makes programs easier to use and debug.

---

## References

- Oracle Java Documentation
- https://docs.oracle.com/en/java/