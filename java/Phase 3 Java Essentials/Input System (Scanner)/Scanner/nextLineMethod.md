# Java Scanner nextLine() Method

> **Module 14 – Input System**
>
> **Topic:** Scanner Method - `nextLine()`

---

# History

When the Scanner class was introduced in Java 5, it provided multiple methods to read different types of input.

While `next()` reads only one word, Java also introduced **`nextLine()`** to read an entire line of text, including spaces.

This makes it ideal for reading:

- Full Names
- Addresses
- Sentences
- Feedback
- Messages

---

# Why Do We Need nextLine()?

Imagine asking a user to enter their full name.

Input

```
Jyothi Sri Lakshmi
```

Using

```java
sc.next();
```

Output

```
Jyothi
```

Only the first word is stored.

This is not what we want.

To read the complete input, Java provides:

```java
nextLine()
```

---

# Problem Statement

Suppose we are creating a college registration system.

We ask:

```
Enter Student Name:
```

The student enters

```
Jyothi Sri Lakshmi
```

If we use

```java
next()
```

Only

```
Jyothi
```

is stored.

To store the complete name, we use

```java
nextLine()
```

---

# Real-Life Analogy

Imagine filling an online feedback form.

```
Write your feedback:

__________________________
```

The feedback may contain many words and spaces.

`nextLine()` reads the **entire line**, just like a feedback form.

---

# Daily Applications

`nextLine()` is commonly used for:

- Full Name
- Address
- Feedback
- Comments
- Email Subject
- Chat Messages
- Book Titles

---

# Industry Applications

Used whenever multi-word text is required.

Examples:

- Customer feedback
- Employee address
- Product description
- Hospital diagnosis notes
- Email content

---

# Definition

The **`nextLine()`** method reads **the complete line of input**, including spaces, until the user presses the **Enter** key.

---

# Syntax

```java
String variable = sc.nextLine();
```

Example

```java
String name = sc.nextLine();
```

---

# Internal Working

```
Keyboard

↓

Scanner

↓

nextLine()

↓

Read Entire Line

↓

Store in String

↓

Output
```

---

# Memory Diagram

User enters

```
Jyothi Sri Lakshmi
```

Memory

```
name

↓

Jyothi Sri Lakshmi
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

Read nextLine()

↓

Store Complete Line

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

        System.out.print("Enter Full Name: ");

        String name = sc.nextLine();

        System.out.println("Welcome " + name);

        sc.close();

    }

}
```

---

## Output

```
Enter Full Name:

Jyothi Sri Lakshmi

Welcome Jyothi Sri Lakshmi
```

---

# Example 2

```java
System.out.print("Enter Address: ");

String address = sc.nextLine();

System.out.println(address);
```

Input

```
Hyderabad, Telangana
```

Output

```
Hyderabad, Telangana
```

---

# next() vs nextLine()

| next() | nextLine() |
|---------|------------|
| Reads one word | Reads complete line |
| Stops at space | Stops only when Enter is pressed |
| Ignores remaining words | Reads everything including spaces |
| Used for single-word input | Used for sentences and full text |

Example

Input

```
Java Programming Language
```

Using

```java
next();
```

Output

```
Java
```

Using

```java
nextLine();
```

Output

```
Java Programming Language
```

---

# ⭐ Most Important Interview Question

## Why does nextLine() get skipped after nextInt()?

Example

```java
Scanner sc = new Scanner(System.in);

System.out.print("Enter Age: ");

int age = sc.nextInt();

System.out.print("Enter Name: ");

String name = sc.nextLine();

System.out.println(name);
```

Input

```
20
Jyothi
```

Output

```
Enter Age:
20

Enter Name:

```

Name becomes empty.

---

# Why Does This Happen?

When the user enters

```
20↵
```

Scanner reads

```
20
```

but **does not consume the Enter key (`\n`)**.

The remaining newline stays in the input buffer.

When `nextLine()` executes, it immediately reads this leftover newline and returns an empty string.

---

# Solution

Consume the leftover newline before calling `nextLine()`.

```java
int age = sc.nextInt();

sc.nextLine();

String name = sc.nextLine();
```

Now the program works correctly.

---

# Dry Run

Input

```
20↵
Jyothi↵
```

Scanner

```
nextInt()

↓

20
```

Remaining

```
↵
```

Extra

```java
sc.nextLine();
```

Consumes

```
↵
```

Now

```java
nextLine()
```

reads

```
Jyothi
```

Perfect.

---

# Bootcamp Insight 💡

This is **one of the most common Java interview questions**.

The problem is **not with `nextLine()`**.

The real issue is the **leftover newline character (`\n`)** after methods like:

- `nextInt()`
- `nextDouble()`
- `nextFloat()`
- `nextLong()`

Remember:

```
Primitive Input

↓

Leaves newline

↓

nextLine()

↓

Consumes newline

↓

Returns Empty String
```

---

# Best Practices

- Use `next()` for single words.
- Use `nextLine()` for complete sentences.
- Always consume the leftover newline after numeric input.
- Close the Scanner after use.

---

# Common Mistakes

## Mistake 1

Using `next()` for full names.

Incorrect

```java
String name = sc.next();
```

Correct

```java
String name = sc.nextLine();
```

---

## Mistake 2

Calling `nextLine()` immediately after `nextInt()`.

Always write

```java
sc.nextLine();
```

before reading the line.

---

# Interview Questions

### Q1

What is the difference between `next()` and `nextLine()`?

---

### Q2

Why does `nextLine()` sometimes return an empty string?

---

### Q3

How do you solve the `nextInt()` + `nextLine()` issue?

---

### Q4

Which method is suitable for reading a full address?

---

### Q5

Can `nextLine()` read spaces?

---

# MCQs

### 1

Which method reads an entire line?

A. next()

B. nextLine()

C. nextInt()

D. nextDouble()

**Answer:** B

---

### 2

`nextLine()` stops reading when

A. Space

B. Tab

C. Enter Key

D. Comma

**Answer:** C

---

### 3

Which Scanner method is best for reading a full name?

A. next()

B. nextLine()

C. nextInt()

D. nextBoolean()

**Answer:** B

---

# Coding Exercises

1. Read your full name.
2. Read your address.
3. Read your favorite quote.
4. Read feedback from the user.
5. Demonstrate the `nextInt()` + `nextLine()` issue and fix it.

---

# Assignment

Create a **Student Registration Program** that asks for:

- Full Name
- Address
- College
- Branch

using `nextLine()`.

---

# Revision Notes

- `nextLine()` reads an entire line.
- It includes spaces.
- Stops when Enter is pressed.
- Ideal for names, addresses, and sentences.
- Be careful after `nextInt()` because of the leftover newline.

---

# Connection Map

```
Scanner Class

↓

next()

↓

nextLine()

↓

nextInt()

↓

nextDouble()

↓

Parsing
```

---

# Future Topic Connection

Now that you've learned how to read **text input**, the next step is reading **numeric input** using methods such as:

- `nextInt()`
- `nextDouble()`
- `nextBoolean()`

These methods allow Java programs to accept numbers and logical values from users.

---

# Key Takeaways

- `nextLine()` reads the complete line.
- It supports spaces.
- It is different from `next()`.
- Understand the `nextInt()` + `nextLine()` buffer issue.
- This is one of the most frequently asked Scanner interview topics.

---

## References

- Oracle Java Documentation
- https://docs.oracle.com/en/java/