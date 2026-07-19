# Command Line Arguments - Introduction

> **Module 16 – Command Line Arguments**
>
> **Topic:** Introduction

---

# History

In the early days of programming, many applications were executed directly from the command line (terminal). Instead of asking users for input after the program started, programmers passed data while launching the program itself.

Languages like **C** introduced this concept through the `main()` function, and Java adopted a similar approach with the `main(String[] args)` method.

Today, command line arguments are widely used in:

- Java applications
- Build tools (Maven, Gradle)
- Spring Boot applications
- DevOps scripts
- Automation tools

---

# Evolution

### Before Command Line Arguments

Programs relied on:

- Hardcoded values
- Keyboard input
- Configuration files

Example:

```java
int age = 20;
```

Changing the value required editing the source code.

---

### After Command Line Arguments

Programs became flexible.

Example:

```bash
java Student 20
```

The same program can now work with different inputs without changing the code.

---

# Why Learn Command Line Arguments?

Many real-world applications receive information when they start.

Examples include:

- File names
- User names
- Passwords
- Port numbers
- Configuration values
- Environment settings

Instead of asking users for these values later, they can be supplied during program execution.

---

# Problem Statement

Imagine you wrote a program that prints a student's name.

Without command line arguments:

```java
String name = "Rahul";
```

To print another name, you must edit the code.

With command line arguments:

```bash
java Student Lakshmi
```

The same program works for any name.

---

# Real-Life Analogy

Think of booking a train ticket.

You don't board the train first and then decide your destination.

Instead, you provide details **before** the journey begins.

Similarly:

```
Program Starts
        │
        ▼
Arguments are provided
        │
        ▼
Program executes
```

---

# Daily Life Examples

Command line arguments are used when:

- Opening files
- Running Java programs
- Starting servers
- Executing scripts
- Running database tools
- Launching applications with options

---

# Industry Applications

Command line arguments are commonly used in:

- Spring Boot
- Maven
- Gradle
- Docker containers
- Jenkins pipelines
- Linux shell scripts
- Cloud deployment tools

---

# Definition

A **command line argument** is a value passed to a Java program at the time it is executed.

These values are automatically stored in the `String[] args` parameter of the `main()` method.

---

# Java Philosophy

Java follows the principle of:

> **"Write once, run anywhere."**

Command line arguments make Java programs reusable because the same program can process different inputs without recompilation.

---

# Advantages

- Reusable programs
- No code modification required
- Easy automation
- Supports scripting
- Useful for testing
- Common in production environments

---

# Limitations

- All arguments are received as `String`.
- Order of arguments matters.
- Missing arguments can cause errors if not handled properly.

---

# Real Example

Compile:

```bash
javac Student.java
```

Run:

```bash
java Student Lakshmi
```

The program receives:

```
Lakshmi
```

---

# Learning Roadmap

```
Introduction
      │
      ▼
Why Command Line Arguments?
      │
      ▼
Syntax
      │
      ▼
Internal Working
      │
      ▼
Programs
      │
      ▼
Comparison
      │
      ▼
Revision
      │
      ▼
Interview Questions
      │
      ▼
MCQs
```

---

# Best Practices

- Use meaningful argument names.
- Validate the number of arguments.
- Convert strings to required data types safely.
- Display helpful usage messages for invalid input.

---

# Common Mistakes

❌ Thinking command line arguments are the same as `Scanner` input.

❌ Forgetting that all arguments are strings.

❌ Accessing `args[0]` without checking the array length.

---

# Interview Questions

1. What are command line arguments?
2. Where are they stored?
3. Why are they strings?
4. When are they passed to the program?
5. What is `String[] args`?

---

# Revision Notes

- Passed while running the program.
- Stored in `String[] args`.
- All values are strings.
- No user interaction is required after the program starts.
- Widely used in automation and backend applications.

---

# 💡 Bootcamp Insight

Command line arguments may seem like a small topic, but they introduce an important programming concept: **a program should receive input from outside instead of relying on hardcoded values**. This idea appears throughout software engineering, from configuration files to web APIs and cloud deployments.

---

# Connection Map

```
Input in Java
      │
      ├── Scanner
      ├── BufferedReader
      ├── Console
      └── Command Line Arguments
```

---

# Future Topic Connection

In the next chapter, we'll answer an important question:

**Why did Java introduce Command Line Arguments when Scanner already exists?**

Understanding this difference will help you choose the right input mechanism in different situations.

---

# Key Takeaways

- Command line arguments provide input before a Java program starts.
- They are stored in `String[] args`.
- They make programs reusable and configurable.
- They are widely used in industry for automation and deployment.

---

## References

- Oracle Java Documentation
- Java Language Specification
- Java SE API Documentation