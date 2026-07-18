# Scanner vs BufferedReader vs Console

> **Module 14 – Input System**
>
> **Topic:** Comparison of Java Input Classes

---

# History

Java has introduced different input mechanisms over time to solve different problems.

### Before Java 5

Developers mainly used:

- BufferedReader

### Java 5

Java introduced:

- Scanner

to make user input easier.

### Java 6

Java introduced:

- Console

to provide secure command-line input, especially for passwords.

Thus, Java now provides three commonly used input mechanisms.

---

# Why Compare These Classes?

As a Java developer, you should know **which input class is best for a given situation**.

Example:

- College programs → Scanner
- Competitive Programming → BufferedReader
- Secure Login Systems → Console

Knowing the right tool improves both code quality and performance.

---

# Real-Life Analogy

Imagine three different vehicles.

🚲 Bicycle

- Easy to use
- Good for short distances

🚗 Car

- Faster
- Better for long distances

🚓 Police Vehicle

- Special purpose
- Used for security

Similarly,

```
Scanner

↓

Easy Input

BufferedReader

↓

Fast Input

Console

↓

Secure Input
```

---

# Overview

## Scanner

- Easy to learn
- Reads primitive data types directly
- Best for beginners

---

## BufferedReader

- Reads character input efficiently
- Faster for large input
- Requires parsing for numbers

---

## Console

- Reads text
- Reads passwords securely
- Mainly used in terminal applications

---

# Package Comparison

| Class | Package |
|--------|---------|
| Scanner | java.util |
| BufferedReader | java.io |
| Console | java.io |

---

# Object Creation

## Scanner

```java
Scanner sc = new Scanner(System.in);
```

---

## BufferedReader

```java
BufferedReader br =
    new BufferedReader(
        new InputStreamReader(System.in));
```

---

## Console

```java
Console console =
        System.console();
```

---

# Main Comparison Table

| Feature | Scanner | BufferedReader | Console |
|----------|----------|----------------|----------|
| Package | java.util | java.io | java.io |
| Beginner Friendly | ⭐⭐⭐⭐⭐ | ⭐⭐⭐ | ⭐⭐⭐ |
| Reads int directly | ✅ | ❌ | ❌ |
| Reads double directly | ✅ | ❌ | ❌ |
| Reads String | ✅ | ✅ | ✅ |
| Reads Full Line | ✅ | ✅ | ✅ |
| Password Support | ❌ | ❌ | ✅ |
| Parsing Required | No | Yes | Sometimes |
| Speed | Good | Faster | Good |
| Security | Low | Low | High |
| IDE Support | Excellent | Excellent | Limited |

---

# Performance Comparison

## Scanner

Internally performs parsing while reading.

Convenient but slightly slower.

---

## BufferedReader

Reads character data through a buffer.

Faster when reading large amounts of text.

---

## Console

Performance is not its primary purpose.

Its main focus is **security**.

---

# Security Comparison

## Scanner

```
Password

↓

Visible
```

---

## BufferedReader

```
Password

↓

Visible
```

---

## Console

```
Password

↓

Hidden

↓

readPassword()
```

Winner:

```
Console
```

---

# Parsing Comparison

## Scanner

```java
int age = sc.nextInt();
```

No parsing required.

---

## BufferedReader

```java
int age =
Integer.parseInt(br.readLine());
```

Parsing required.

---

## Console

```java
int age =
Integer.parseInt(console.readLine());
```

Parsing required for numeric data.

---

# Exception Comparison

| Class | Common Exception |
|--------|------------------|
| Scanner | InputMismatchException |
| BufferedReader | IOException |
| Console | NullPointerException (if console is null) |

---

# Memory Diagram

## Scanner

```
Keyboard

↓

Scanner

↓

Primitive Data
```

---

## BufferedReader

```
Keyboard

↓

Buffer

↓

String

↓

Parsing

↓

Primitive
```

---

## Console

```
Keyboard

↓

Console

↓

readLine()

↓

String

or

↓

readPassword()

↓

char[]
```

---

# Advantages

## Scanner

- Easy syntax
- Beginner friendly
- Reads primitive types directly

---

## BufferedReader

- Faster
- Efficient
- Reads large text easily

---

## Console

- Secure password input
- Built-in password masking
- Better for authentication systems

---

# Disadvantages

## Scanner

- Slightly slower
- Not suitable for secure passwords

---

## BufferedReader

- More code
- Parsing required

---

## Console

- Doesn't work in many IDEs
- Requires terminal
- Limited methods

---

# Which One Should You Use?

### College Programs

✅ Scanner

---

### Placement Coding

✅ Scanner

or

BufferedReader

---

### Competitive Programming

✅ BufferedReader

---

### Banking Software

✅ Console

---

### Login Systems

✅ Console

---

### Password Input

✅ Console

---

# Industry Recommendation

| Situation | Recommended |
|-----------|-------------|
| Learning Java | Scanner |
| DSA Practice | Scanner |
| Competitive Programming | BufferedReader |
| Backend Development | Depends on framework |
| Secure CLI Tool | Console |

---

# Interview Questions

### Q1

Which class is easiest for beginners?

**Answer**

Scanner

---

### Q2

Which class is fastest?

**Answer**

BufferedReader

---

### Q3

Which class supports secure password input?

**Answer**

Console

---

### Q4

Why is parsing required with BufferedReader?

**Answer**

Because `readLine()` returns a String.

---

### Q5

Why does Console return `char[]` instead of String?

**Answer**

For security.

Character arrays can be cleared after use.

---

# MCQs

### 1

Which class belongs to `java.util`?

A. Console

B. BufferedReader

C. Scanner

D. InputStreamReader

**Answer:** C

---

### 2

Which class is mainly used for password input?

A. Scanner

B. Console

C. BufferedReader

D. Reader

**Answer:** B

---

### 3

Which class requires parsing for integers?

A. Scanner

B. BufferedReader

C. Both B and Console

D. None

**Answer:** C

---

# Coding Exercises

1. Read age using Scanner.
2. Read age using BufferedReader.
3. Read age using Console.
4. Compare all outputs.
5. Measure execution time (optional).

---

# Assignment

Write three Java programs:

- Scanner Input
- BufferedReader Input
- Console Input

Read:

- Name
- Age
- CGPA

Compare the code and explain which approach is easiest and why.

---

# 1-Minute Revision

| Scanner | BufferedReader | Console |
|----------|----------------|----------|
| Easy | Fast | Secure |
| Primitive Input | String Input | Password Input |
| No Parsing | Parsing | Parsing |
| Beginner | Performance | Security |

---

# Bootcamp Insight 💡

Think of these classes like tools in a toolbox.

- **Scanner** → Learning and everyday Java programs.
- **BufferedReader** → Efficient text input and competitive programming.
- **Console** → Secure command-line applications.

A good Java developer doesn't ask, *"Which one is the best?"* They ask, *"Which one is the right tool for this problem?"*

---

# Connection Map

```
Input System

        │
        ▼

   Scanner
        │
        ▼

BufferedReader
        │
        ▼

   Console
        │
        ▼

Comparison
        │
        ▼

Module 14 Revision
```

---

# Future Topic Connection

Congratulations! 🎉

You have now completed the core Java Input System.

The next module is:

```
Module 15

Math Class
```

You'll learn:

- Math.abs()
- Math.max()
- Math.min()
- Math.pow()
- Math.sqrt()
- Math.ceil()
- Math.floor()
- Math.round()
- Math.random()

These methods are heavily used in:

- DSA
- Competitive Programming
- Placement Coding
- Game Development
- Financial Applications
- Scientific Computing

---

# Key Takeaways

- Scanner is best for beginners.
- BufferedReader is faster for text input.
- Console is best for secure password input.
- Choose the input class based on the application's requirements.
- Understanding the differences is a common Java interview topic.

---

## References

- Oracle Java Documentation
- Java SE API Documentation