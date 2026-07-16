# Java Scanner next() Method

> **Module 14 – Input System**
>
> **Topic:** Scanner Method - `next()`

---

# History

When the Scanner class was introduced in Java 5, it provided different methods to read different types of input.

One of the simplest methods is **`next()`**, which reads a single word entered by the user.

It is commonly used when the input contains **only one word**.

---

# Why Do We Need next()?

Suppose we want the user to enter a name.

Instead of hardcoding:

```java
String name = "Jyothi";
```

we can ask the user:

```
Enter your name:
```

and store whatever they type.

This makes the program dynamic.

---

# Problem Statement

Consider a login system.

Instead of writing

```java
String username = "admin";
```

we should ask

```
Enter Username:
```

Every user enters a different username.

---

# Real-Life Analogy

Think about entering your **roll number** during an exam.

```
Enter Roll Number:

22A91A0501
```

Only one value is expected.

Similarly,

`next()` reads one word/token.

---

# Daily Applications

`next()` is useful for:

- Username
- Password (basic examples)
- Roll Number
- City (single word)
- Country (single word)
- Employee ID

---

# Industry Applications

Although web applications use forms instead of Scanner, the concept is the same.

Examples:

- Login username
- Employee ID
- Product Code
- Customer ID

---

# Definition

The **`next()`** method reads **one word (token)** from the input until it encounters a whitespace such as:

- Space
- Tab
- New Line

---

# Syntax

```java
String variable = sc.next();
```

Example

```java
String name = sc.next();
```

---

# Internal Working

```
Keyboard

↓

Scanner

↓

next()

↓

Read One Word

↓

Store in String

↓

Output
```

---

# Memory Diagram

User enters

```
Jyothi
```

Memory

```
name

↓

Jyothi
```

---

# Flow Diagram

```
Start

↓

Create Scanner

↓

Ask User

↓

Read next()

↓

Store in Variable

↓

Display Output

↓

End
```

---

# Example 1

```java
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");

        String name = sc.next();

        System.out.println("Welcome " + name);

        sc.close();

    }

}
```

---

### Output

```
Enter Name:

Jyothi

Welcome Jyothi
```

---

# Example 2

Input

```
Hello Java
```

Program

```java
String text = sc.next();

System.out.println(text);
```

Output

```
Hello
```

Only the first word is read.

---

# Dry Run

Input

```
Java Programming
```

↓

Scanner reads

```
Java
```

↓

Stops at space

↓

Stores

```
Java
```

↓

Prints

```
Java
```

---

# Important Point ⭐

`next()` stops reading when it encounters:

- Space
- Tab
- New Line

It **cannot read an entire sentence**.

For sentences, use:

```java
nextLine()
```

---

# Best Practices

- Use `next()` for single-word input.
- Use meaningful variable names.
- Close the Scanner after use.
- Use `nextLine()` when reading complete sentences.

---

# Common Mistakes

## Mistake 1

Input

```
Java Programming
```

Using

```java
sc.next();
```

Output

```
Java
```

Reason:

`next()` stops at the first space.

---

## Mistake 2

Expecting a full sentence.

Incorrect

```java
String sentence = sc.next();
```

Correct

```java
String sentence = sc.nextLine();
```

---

# Interview Questions

### Q1

What does `next()` read?

**Answer**

One word (token).

---

### Q2

When does `next()` stop reading?

**Answer**

At whitespace (space, tab, or new line).

---

### Q3

Can `next()` read a full sentence?

**Answer**

No.

---

### Q4

Which method reads a full line?

**Answer**

`nextLine()`

---

# MCQs

### 1

`next()` reads:

A. Integer

B. Character

C. One Word

D. Complete Line

**Answer:** C

---

### 2

`next()` stops at:

A. Space

B. Tab

C. New Line

D. All of the Above

**Answer:** D

---

# Coding Exercises

1. Read your first name.
2. Read your college name (single word).
3. Read your favorite programming language.
4. Read your city name.
5. Display the entered value.

---

# Assignment

Write a Java program that asks the user to enter:

- First Name
- Last Name
- Department

(using `next()`)

Display all three values.

---

# Revision Notes

- `next()` reads one word.
- Returns a `String`.
- Stops at whitespace.
- Cannot read complete sentences.
- Use `nextLine()` for full-line input.

---

# 💡 Bootcamp Insight

Many beginners think `next()` and `nextLine()` are the same.

They are not.

This is one of the **most frequently asked Java interview questions**.

Always remember:

```
next()

↓

One Word

nextLine()

↓

Entire Line
```

---

# Connection Map

```
Scanner Class

↓

next()

↓

nextLine()

↓

Integer Input

↓

Decimal Input
```

---

# Future Topic Connection

Now that you've learned how to read **a single word**, the next step is learning **`nextLine()`**, which reads an **entire line**, including spaces.

Understanding the difference between `next()` and `nextLine()` is essential for Java interviews and helps avoid one of the most common beginner mistakes.

---

# Key Takeaways

- `next()` reads only one word.
- It stops at whitespace.
- It returns a `String`.
- It is useful for usernames, IDs, and other single-word input.
- Use `nextLine()` when you need to read a complete sentence.

---

## References

- Oracle Java Documentation
- https://docs.oracle.com/en/java/