# Introduction to Loops

> **Module 18 – Loops**

---

# Introduction

Imagine you need to print:

```
Hello
```

100 times.

One approach is to write:

```java
System.out.println("Hello");
System.out.println("Hello");
System.out.println("Hello");
...
```

100 times.

This is repetitive, time-consuming, and difficult to maintain.

Java provides **loops** to solve this problem by allowing a block of code to execute repeatedly until a specified condition becomes false.

Loops are one of the fundamental control structures in programming and are widely used in software development for processing collections, reading files, performing calculations, handling user input, and automating repetitive tasks.

---

# History

The idea of repetition in programming dates back to early programming languages like **FORTRAN (1957)** and **ALGOL (1958)**. These languages introduced loop constructs to avoid writing the same instructions repeatedly.

Java inherited structured looping concepts from **C** and **C++**, while later versions introduced the **Enhanced for Loop (Java 5)** for easier collection traversal.

---

# Evolution

### Early Programming

- Repeated statements written manually.
- Difficult to maintain.

↓

### Structured Programming

Languages introduced:

- while
- do-while
- for

↓

### Modern Java

Introduced:

- Enhanced for Loop
- Improved iteration over arrays and collections
- Better readability

---

# Why Do We Need Loops?

Without loops:

- Code duplication increases.
- Programs become longer.
- Maintenance becomes difficult.
- Chances of mistakes increase.

With loops:

- Less code
- Better readability
- Easier maintenance
- Improved productivity

---

# Problem Statement

Suppose a bank needs to calculate monthly interest for **10,000 customer accounts**.

Writing the calculation manually for every account is impossible.

A loop processes each account one after another automatically.

---

# Real-Life Analogy

Imagine a teacher taking attendance.

Instead of calling only one student, the teacher repeats the same process until every student has been marked present or absent.

The repeated action is similar to a loop.

---

# Daily Life Examples

- Alarm ringing every morning until you wake up.
- Washing every dish after dinner.
- Counting money one note at a time.
- Checking every email in your inbox.
- Scanning every file in a folder.

---

# Industry Applications

Loops are used in almost every software application.

Examples include:

- Processing employee records
- Reading database results
- Generating reports
- Searching arrays
- Processing customer orders
- Game development
- AI and Machine Learning data processing
- Web servers handling requests
- Log file analysis

---

# Definition

A **loop** is a control structure that repeatedly executes a block of code while a specified condition remains true or until a defined sequence is completed.

---

# Types of Loops in Java

Java provides four commonly used looping constructs:

1. while Loop
2. do-while Loop
3. for Loop
4. Enhanced for Loop

Each serves different use cases and choosing the right one improves code readability and maintainability.

---

# How a Loop Works

```
Start

↓

Initialization

↓

Condition

↓

True?

↙         ↘

Yes        No

↓

Execute Body

↓

Update

↓

Condition Again

↓

End
```

---

# Internal Working

A typical loop performs four steps:

1. **Initialization** – Set the starting value.
2. **Condition Check** – Decide whether the loop should continue.
3. **Execution** – Run the loop body.
4. **Update** – Change the loop variable and repeat.

This cycle continues until the condition becomes false.

---

# Example

```java
for(int i = 1; i <= 5; i++) {
    System.out.println("Hello");
}
```

**Output**

```
Hello
Hello
Hello
Hello
Hello
```

---

# Advantages

- Reduces code duplication.
- Improves readability.
- Simplifies repetitive tasks.
- Makes programs easier to maintain.
- Supports automation.
- Improves developer productivity.

---

# Limitations

- Incorrect conditions may cause infinite loops.
- Poorly designed loops reduce readability.
- Nested loops can affect performance if overused.

---

# Best Practices

- Choose the appropriate loop type.
- Keep loop conditions simple.
- Use meaningful loop variable names.
- Avoid unnecessary nested loops.
- Ensure the loop eventually terminates.
- Write readable loop bodies.

---

# Common Mistakes

- Forgetting to update the loop variable.
- Writing incorrect conditions.
- Creating infinite loops unintentionally.
- Modifying the loop variable unexpectedly inside the loop.
- Using the wrong loop type for the problem.

---

# Interview Questions

### What is a loop?

A control structure that executes a block of code repeatedly based on a condition.

---

### Why are loops used?

To avoid code repetition and automate repetitive tasks.

---

### Name the loop types in Java.

- while
- do-while
- for
- Enhanced for

---

### Which loop guarantees at least one execution?

The **do-while** loop.

---

# Quick Revision

| Concept | Summary |
|---------|---------|
| Loop | Repeats a block of code |
| Purpose | Avoid repetition |
| Types | while, do-while, for, enhanced for |
| Benefit | Cleaner and maintainable code |

---

# Bootcamp Insight 💡

Loops are the backbone of programming. Every major software system—from banking applications to AI models—relies on loops to process data efficiently. Before learning arrays, collections, or algorithms, develop a strong understanding of loop fundamentals. This knowledge will make advanced topics significantly easier.

---

# Connection Map

```
Control Statements
        │
        ▼
Decision Making
        │
        ▼
Loops
        │
        ▼
Arrays
        │
        ▼
Collections
        │
        ▼
Algorithms
```

---

# Future Topic

Next, you'll learn **Why Loops?**, where we'll compare looping with manual repetition, discuss efficiency, and understand when each loop type should be used.

---

# Key Takeaways

- Loops automate repetitive tasks.
- Java provides four primary looping constructs.
- Every loop follows: Initialize → Check → Execute → Update.
- Choosing the right loop improves readability and maintainability.
- Loops are essential for software engineering and DSA.

---

# References

- Oracle Java Documentation
- Java Language Specification (JLS)
- Effective Java – Joshua Bloch
- Head First Java