# Java Scanner Class

> **Module 14 – Input System**
>
> **Goal:** Learn how Java programs accept input from users and understand why the Scanner class is one of the most important classes for beginners, competitive programming, and software development.

---

# History

When Java was first released (JDK 1.0), accepting keyboard input was not easy.

Developers mainly used:

- DataInputStream (Deprecated)
- BufferedReader

Although powerful, these classes required more code and manual conversion of data types.

To simplify input operations, Java introduced the **Scanner** class in **Java 5 (JDK 1.5)** as part of the `java.util` package.

Today, Scanner is the first input class learned by almost every Java programmer.

---

# Why Scanner?

Before Scanner, Java programs mostly used **hardcoded values**.

Example:

```java
int age = 20;
System.out.println(age);
```

Output

```
20
```

The program always prints **20**.

If another user wants to enter **25**, the source code must be modified and compiled again.

This is not practical.

Scanner solves this problem by allowing programs to accept **dynamic input**.

---

# Problem Statement

Imagine creating a calculator.

Without Scanner:

```java
int a = 10;
int b = 20;
```

The answer is always:

```
30
```

Real calculators never work this way.

Instead, they ask:

```
Enter First Number:
Enter Second Number:
```

Then they calculate using the values entered by the user.

This is why Scanner exists.

---

# Static Data vs Dynamic Data

## Static Data

Data written directly inside the source code.

```java
int age = 20;
```

Characteristics:

- Fixed
- Programmer controls the value
- Changes require editing the program

---

## Dynamic Data

Data entered while the program is running.

```
Enter Age:

25
```

Characteristics:

- Changes every execution
- User controls the value
- Makes applications interactive

---

# Real-Life Analogy

### Static Data

A printed wedding invitation.

```
Date

15 August 2027
```

Everyone receives the same information.

---

### Dynamic Data

An online registration form.

```
Enter Name

____________
```

Every user enters different information.

Scanner works exactly like this.

---

# Daily Applications

Scanner is useful in:

- Student Registration
- Calculator Programs
- ATM Simulation
- Banking Systems
- Quiz Applications
- Library Management
- Employee Management

---

# Industry Applications

Although desktop and web applications usually use forms instead of Scanner, the concepts learned here are fundamental.

Scanner is commonly used in:

- Competitive Programming
- Coding Interviews
- Console Applications
- Learning Java
- Utility Programs

---

# Definition

The **Scanner** class is a predefined Java class used to read input from different sources such as:

- Keyboard (`System.in`)
- Files
- Strings

For beginners, Scanner is primarily used to read **keyboard input**.

---

# Package

Scanner belongs to:

```java
java.util
```

Therefore, Java does not import it automatically.

---

# Import Statement

```java
import java.util.Scanner;
```

---

# Creating a Scanner Object

```java
Scanner sc = new Scanner(System.in);
```

---

# Understanding the Statement

```java
Scanner sc = new Scanner(System.in);
```

| Part | Meaning |
|------|---------|
| Scanner | Class Name |
| sc | Object Name |
| new | Creates a new object |
| Scanner() | Constructor |
| System.in | Standard keyboard input stream |

---

# Why System.in?

Java provides three standard streams.

| Stream | Purpose |
|---------|---------|
| System.in | Input |
| System.out | Standard Output |
| System.err | Error Output |

`System.in` tells Scanner to read data from the keyboard.

---

# Internal Working

```
User

↓

Keyboard

↓

System.in

↓

Scanner Object

↓

Java Variable

↓

Processing

↓

Output
```

---

# Memory Diagram

Before Input

```
age

↓

Empty
```

User enters

```
20
```

After Input

```
age

↓

20
```

---

# Flow Diagram

```
Start

↓

Import Scanner

↓

Create Scanner Object

↓

Ask User

↓

Read Input

↓

Store in Variable

↓

Process

↓

Display Output

↓

End
```

---

# First Scanner Program

```java
import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");

        int age = sc.nextInt();

        System.out.println("Your age is: " + age);

        sc.close();

    }

}
```

---

# Sample Output

```
Enter your age:

20

Your age is: 20
```

---

# Dry Run

User enters

```
25
```

↓

Scanner reads

```
25
```

↓

Stores it in

```java
age
```

↓

Program prints

```
Your age is: 25
```

---

# Bootcamp Insight 💡

Many beginners think **Scanner is a keyword**.

It is **not**.

Scanner is simply a **class** provided by the Java Standard Library.

This is why we must:

- Import it
- Create an object
- Call its methods

Exactly like any other class.

---

# Best Practices

- Import Scanner before using it.
- Create only one Scanner object for `System.in`.
- Use meaningful object names (`scanner`, `sc`).
- Close the Scanner when input is complete.
- Do not create multiple Scanner objects for the same input stream.

---

# Common Mistakes

## 1. Forgetting Import

```java
Scanner sc = new Scanner(System.in);
```

Compile-time Error

Correct

```java
import java.util.Scanner;
```

---

## 2. Forgetting Object Creation

Incorrect

```java
nextInt();
```

Correct

```java
sc.nextInt();
```

---

## 3. Multiple Scanner Objects

Avoid

```java
Scanner s1 = new Scanner(System.in);
Scanner s2 = new Scanner(System.in);
```

Use one Scanner object throughout the program.

---

# Interview Questions

### Q1. What is Scanner?

A predefined Java class used to accept input from users.

---

### Q2. Which package contains Scanner?

```
java.util
```

---

### Q3. Why do we import Scanner?

Because it belongs to `java.util`, not `java.lang`.

---

### Q4. What is `System.in`?

The standard input stream that reads data from the keyboard.

---

### Q5. Why do we create an object of Scanner?

Because Scanner is a class, and its methods can only be used through an object.

---

# MCQs

### 1. Scanner belongs to:

A. java.io

B. java.lang

C. java.util

D. java.net

**Answer:** C

---

### 2. Which keyword creates an object?

A. class

B. static

C. new

D. import

**Answer:** C

---

### 3. Which stream represents keyboard input?

A. System.out

B. System.err

C. System.in

D. Scanner.in

**Answer:** C

---

# Debugging

### Error

```java
Scanner sc = new Scanner(System.in);
```

without import.

Reason:

Scanner cannot be found because the compiler does not know where the class is located.

Solution:

```java
import java.util.Scanner;
```

---

# Coding Exercises

1. Read your age.
2. Read your roll number.
3. Read your favorite number.
4. Read two integers and print them.
5. Close the Scanner after use.

---

# Assignment

Write a Java program that asks the user to enter:

- Name
- Age
- College

Display all the information entered by the user.

(We'll learn `next()` and `nextLine()` in the upcoming lessons.)

---

# Revision Notes

- Scanner is used to read user input.
- It belongs to `java.util`.
- Import using `import java.util.Scanner;`
- Create an object using `new Scanner(System.in)`.
- `System.in` reads keyboard input.
- Scanner converts keyboard input into Java data types.

---

# Connection Map

```
Variables

↓

Static Data

↓

Dynamic Data

↓

Why Input?

↓

Scanner Class

↓

Scanner Methods
```

---

# Future Topic Connection

Now that you've learned **how to create a Scanner object**, the next step is learning the **Scanner methods** used to read different types of input.

We'll start with:

- `next()`
- `nextLine()`

These two methods look similar but behave differently, and understanding their differences is one of the most common Java interview questions.

---

# Key Takeaways

- Scanner makes Java programs interactive.
- It accepts dynamic input from users.
- Scanner belongs to the `java.util` package.
- `System.in` represents keyboard input.
- Create one Scanner object and reuse it throughout the program.
- Scanner is essential for coding interviews and competitive programming.

---

## References

- Oracle Java Documentation
- https://docs.oracle.com/en/java/docs/