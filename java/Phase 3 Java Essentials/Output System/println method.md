# Java println() Method

## What is println()?

The `println()` method is used to display output on the console **and automatically move the cursor to the next line** after printing.

It belongs to the **PrintStream** class and is accessed using the **System.out** object.

---

# Why Do We Need println()?

Most programs display multiple outputs.

Using `println()` makes the output:

- Easy to read
- Well organized
- User-friendly

It automatically starts the next output on a new line.

Example:

```
Name : Jyothi
Age  : 20
CGPA : 8.91
```

---

# Real-World Analogy

Imagine writing on a notebook.

You write:

```
Hello
```

Then press **Enter**.

Now the cursor moves to the next line.

```
Hello
Java
```

This is exactly how `println()` works.

---

# Definition

The `println()` method prints the given value **followed by a newline character (`\n`)**, moving the cursor to the next line.

---

# Syntax

```java
System.out.println(value);
```

where `value` can be:

- String
- int
- float
- double
- char
- boolean
- Object

---

# Internal Working

Example

```java
System.out.println("Hello");
System.out.println("Java");
```

Step 1

```
Print

Hello
```

↓

Cursor moves to next line.

Step 2

```
Print

Java
```

Output

```
Hello
Java
```

---

# Flow Diagram

```
Program

↓

System.out

↓

println()

↓

Display Output

↓

Move Cursor

↓

Next Line
```

---

# Memory Concept

```
System

↓

out

↓

PrintStream Object

↓

println()

↓

Console

↓

New Line
```

---

# Example 1

```java
public class PrintlnExample1 {

    public static void main(String[] args) {

        System.out.println("Hello");

        System.out.println("Java");

    }

}
```

### Output

```
Hello
Java
```

---

# Example 2

```java
public class PrintlnExample2 {

    public static void main(String[] args) {

        System.out.println(100);

        System.out.println(200);

    }

}
```

### Output

```
100
200
```

---

# Example 3

```java
public class PrintlnExample3 {

    public static void main(String[] args) {

        System.out.println("Name : Jyothi");

        System.out.println("Age : 20");

        System.out.println("CGPA : 8.91");

    }

}
```

### Output

```
Name : Jyothi
Age : 20
CGPA : 8.91
```

---

# Example 4

```java
public class PrintlnExample4 {

    public static void main(String[] args) {

        System.out.println(true);

        System.out.println('A');

        System.out.println(95.5);

    }

}
```

### Output

```
true
A
95.5
```

---

# Data Types Supported

```java
System.out.println("Java");

System.out.println(100);

System.out.println(95.5);

System.out.println('A');

System.out.println(true);
```

### Output

```
Java
100
95.5
A
true
```

---

# Difference Between print() and println()

| print() | println() |
|----------|------------|
| Prints on the same line | Prints on a new line |
| No newline character | Automatically adds a newline (`\n`) |
| Spaces must be added manually | Next output starts on a new line |

### Example

```java
System.out.print("Java");
System.out.print("Course");
```

Output

```
JavaCourse
```

---

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

# Common Mistakes

## Mistake 1

Using `println()` when output should remain on the same line.

Example

```java
System.out.println("Name:");
System.out.println("Jyothi");
```

Output

```
Name:
Jyothi
```

If you want:

```
Name: Jyothi
```

Use

```java
System.out.print("Name: ");
System.out.println("Jyothi");
```

---

## Mistake 2

Using too many `println()` statements unnecessarily.

Instead of

```java
System.out.println("Java");

System.out.println();

System.out.println("Course");
```

Use blank lines only when required.

---

# Best Practices

- Use `println()` for readable output.
- Use `print()` only when output should remain on the same line.
- Label values clearly.
- Keep console output organized.

---

# Interview Questions

### Q1

What is the difference between `print()` and `println()`?

**Answer:**

`print()` prints on the same line.

`println()` prints the value and moves the cursor to the next line.

---

### Q2

Which class contains `println()`?

**Answer:**

`PrintStream`

---

### Q3

What object is used to call `println()`?

**Answer:**

`System.out`

---

### Q4

Output

```java
System.out.println("A");
System.out.println("B");
```

Answer

```
A
B
```

---

### Q5

Does `println()` automatically add a newline?

**Answer:**

Yes.

---

# MCQs

### 1

Which method moves the cursor to the next line?

A. print()

B. printf()

C. println()

D. nextLine()

**Answer:** C

---

### 2

Output

```java
System.out.println("Java");
System.out.println("Course");
```

A.

```
JavaCourse
```

B.

```
Java
Course
```

C.

```
Java Course
```

D.

Error

**Answer:** B

---

### 3

`println()` belongs to which class?

A. Scanner

B. String

C. PrintStream

D. Console

**Answer:** C

---

# Coding Exercises

1. Print your name using `println()`.
2. Print your college details on separate lines.
3. Print different primitive data types.
4. Print a student information card.
5. Print a simple receipt.

---

# Assignment

Write a Java program using **only `println()`** to display:

- Name
- Age
- Branch
- College
- CGPA
- Goal

Each value should appear on a separate line.

---

# Revision Notes

- `println()` prints output and moves to the next line.
- It automatically appends a newline character.
- It belongs to the `PrintStream` class.
- It is called using `System.out`.
- Supports all primitive types, Strings, and Objects.

---

# Key Takeaways

- `println()` is the most commonly used output method in Java.
- It improves readability by printing each output on a new line.
- It automatically inserts a newline after printing.
- It is ideal for displaying structured information.
- Use `print()` and `println()` appropriately based on the desired output format.

---

## References

- Oracle Java Documentation
- https://docs.oracle.com/en/java/