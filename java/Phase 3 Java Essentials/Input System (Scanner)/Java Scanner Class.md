# Java Scanner Class

## History

In the early versions of Java, taking input from the keyboard was difficult.

Programmers mainly used:

- BufferedReader
- DataInputStream

These classes required more code and manual conversion of input values.

To simplify keyboard input, Java introduced the **Scanner** class in **Java 5 (JDK 1.5)** as part of the `java.util` package.

Today, Scanner is the most commonly used class for beginners and competitive programming.

---

# Why Do We Need Scanner?

Until now, we used hardcoded values.

Example

```java
int age = 20;

System.out.println(age);
```

Output

```
20
```

Every time we want another value, we must edit the program.

Scanner solves this problem by allowing the user to enter values while the program is running.

---

# Problem Statement

Suppose we want to create a calculator.

Without Scanner

```java
int a = 10;
int b = 20;
```

Answer is always

```
30
```

Instead, we should ask

```
Enter First Number:

Enter Second Number:
```

The user decides the values.

---

# Real-Life Analogy

Think about an online registration form.

```
Enter Name

↓

Jyothi

↓

Store Name

↓

Display Welcome Message
```

Scanner behaves exactly like the registration form.

---

# Daily Applications

Scanner is used in

- Student Registration
- Login Systems
- ATM Applications
- Banking Systems
- Quiz Programs
- Calculator Applications
- Employee Management Systems

---

# Industry Applications

Scanner is mainly used for

- Learning Java
- Console Applications
- Competitive Programming
- Coding Interviews
- Small Utility Programs

Large enterprise applications usually use GUI forms, web forms, or APIs instead of Scanner.

---

# Definition

The **Scanner** class is a predefined Java class used to read input from different sources such as:

- Keyboard (`System.in`)
- Files
- Strings

For beginners, Scanner is mainly used to accept input from the keyboard.

---

# Package

Scanner belongs to

```java
java.util
```

Therefore, we must import it.

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
| new | Creates an object |
| Scanner() | Constructor |
| System.in | Standard Keyboard Input |

---

# Internal Working

```
Keyboard

↓

System.in

↓

Scanner Object

↓

Variable

↓

Processing

↓

Output
```

---

# Memory Diagram

```
Keyboard

↓

25

↓

Scanner

↓

age

↓

25
```

---

# Flow Diagram

```
Start

↓

Create Scanner Object

↓

Ask User for Input

↓

Read Input

↓

Store in Variable

↓

Process Data

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

        System.out.println("Age = " + age);

    }

}
```

---

## Sample Output

```
Enter your age: 20

Age = 20
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

Stored in

```java
age
```

↓

Program prints

```
Age = 25
```

---

# Why System.in?

```
System.out

↓

Output
```

```
System.in

↓

Input
```

`System.in` tells Java to read data from the keyboard.

---

# Why Import Scanner?

Scanner is **not** part of the `java.lang` package.

Therefore, Java does not import it automatically.

We must write

```java
import java.util.Scanner;
```

---

# Closing Scanner

After reading input, it is good practice to close the Scanner.

```java
sc.close();
```

This releases the resources associated with the input stream.

---

# Best Practices

- Import Scanner before using it.
- Create only one Scanner object for `System.in`.
- Give meaningful object names like `scanner` or `sc`.
- Close the Scanner when input is complete.

---

# Common Mistakes

## Mistake 1

Forgetting the import statement.

```java
Scanner sc = new Scanner(System.in);
```

Compile-time Error

Correct

```java
import java.util.Scanner;
```

---

## Mistake 2

Using Scanner without creating an object.

Incorrect

```java
nextInt();
```

Correct

```java
sc.nextInt();
```

---

## Mistake 3

Creating multiple Scanner objects for `System.in`.

Prefer using a single Scanner object throughout the program.

---

# Interview Questions

### Q1

What is Scanner?

**Answer**

Scanner is a predefined Java class used to accept input from the user.

---

### Q2

Which package contains Scanner?

**Answer**

```java
java.util
```

---

### Q3

Why do we import Scanner?

**Answer**

Because Scanner belongs to `java.util` and is not imported automatically.

---

### Q4

What is `System.in`?

**Answer**

It is the standard input stream used to read keyboard input.

---

### Q5

What is the purpose of `new Scanner(System.in)`?

**Answer**

It creates a Scanner object that reads input from the keyboard.

---

# MCQs

### 1

Scanner belongs to which package?

A. java.io

B. java.lang

C. java.util

D. java.net

**Answer:** C

---

### 2

Which keyword creates an object?

A. class

B. public

C. new

D. import

**Answer:** C

---

### 3

Which stream is used for keyboard input?

A. System.out

B. System.err

C. System.in

D. Scanner.out

**Answer:** C

---

### 4

Which statement creates a Scanner object?

A.

```java
Scanner sc;
```

B.

```java
Scanner sc = new Scanner(System.in);
```

C.

```java
Scanner(System.in);
```

D.

```java
new Scanner();
```

**Answer:** B

---

# Coding Exercises

1. Read your age and print it.
2. Read your roll number and print it.
3. Read your favorite number and display it.
4. Create one Scanner object and use it for multiple inputs.
5. Close the Scanner after use.

---

# Assignment

Write a Java program that asks the user to enter:

- Name
- Age
- College

Print all the entered details.

(We'll learn how to read Strings using `next()` and `nextLine()` in the upcoming lessons.)

---

# Revision Notes

- Scanner reads user input.
- It belongs to `java.util`.
- Import using `import java.util.Scanner;`
- Create an object using `new Scanner(System.in)`.
- `System.in` represents keyboard input.
- Close the Scanner after use.

---

# Connection Map

```
Why Input is Needed

↓

Scanner Class

↓

Scanner Methods

↓

Input Processing

↓

Real-world Programs
```

---

# Future Topic Connection

Now that you've learned **what the Scanner class is** and **how to create a Scanner object**, the next step is to learn **Scanner methods**.

We'll begin with:

- `next()`
- `nextLine()`

These methods are used to read **text input**, and understanding the difference between them is one of the **most frequently asked Java interview questions**.

---

# Key Takeaways

- Scanner is the most beginner-friendly input class in Java.
- It belongs to the `java.util` package.
- `System.in` reads data from the keyboard.
- A Scanner object is required before reading input.
- Learning Scanner is essential for coding interviews and competitive programming.

---

## References

- Oracle Java Documentation
- https://docs.oracle.com/en/java/