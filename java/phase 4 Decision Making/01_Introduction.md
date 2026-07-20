# Introduction to Control Statements

> **Module 17 – Control Statements (Decision Making)**

---

# Introduction

Imagine a world where every program executes every statement one after another without making any decisions.

- ATM would dispense money without checking your PIN.
- Google would show every search result without filtering.
- Netflix would recommend the same movies to everyone.
- Banking applications would approve every transaction.
- Online shopping websites would give discounts to everyone.

This is not practical.

To make intelligent decisions, every programming language provides **Control Statements**.

Control Statements help a program decide:

- Which code should execute?
- Which code should be skipped?
- How many times should a task repeat?
- When should execution stop?

They form the foundation of decision-making and program flow.

---

# History

In the early days of computing, programs executed instructions sequentially.

```
Statement 1

↓

Statement 2

↓

Statement 3

↓

Statement 4
```

There was no flexibility.

As software became more complex, programmers needed ways to execute different code depending on different situations.

Programming languages introduced **Control Flow Statements**.

Java inherited these concepts from C and C++ while improving readability and safety.

---

# Evolution

```
Machine Language

↓

Assembly Language

↓

C

↓

C++

↓

Java

↓

Modern Java
```

Java introduced structured control statements that are:

- Easy to read
- Easy to maintain
- Platform independent
- Suitable for enterprise applications

---

# Why Do We Need Control Statements?

Suppose a student gets marks.

Without control statements:

```
Marks = 95

Print Grade A

Print Grade B

Print Grade C

Print Grade D
```

Every grade would be printed.

Instead, we need:

```
If marks >= 90

↓

Print Grade A

Else

↓

Check next condition
```

Control statements allow the program to choose the correct path.

---

# Problem Statement

A computer follows instructions exactly as written.

It cannot think or make decisions on its own.

Programs therefore need a mechanism to:

- Compare values.
- Evaluate conditions.
- Execute different blocks of code.
- Repeat tasks when required.

Control statements solve this problem.

---

# Real-Life Analogy

Imagine a traffic signal.

```
Red

↓

Stop

Yellow

↓

Ready

Green

↓

Go
```

Your decision depends on the signal.

Similarly,

```
Condition

↓

Decision

↓

Action
```

---

# Daily Life Examples

### ATM

```
Correct PIN?

↓

Yes

↓

Show Menu

↓

No

↓

Access Denied
```

---

### College Attendance

```
Attendance >= 75%

↓

Eligible for Exam

↓

Else

↓

Not Eligible
```

---

### Online Shopping

```
Cart Value > ₹1000

↓

Apply Discount

↓

Else

↓

No Discount
```

---

### Mobile Unlock

```
Fingerprint Correct?

↓

Unlock Phone

↓

Else

↓

Try Again
```

---

# Industry Applications

Control Statements are used in:

- Banking Software
- Hospital Management Systems
- E-Commerce Applications
- Flight Reservation Systems
- Social Media Platforms
- AI & ML Decision Pipelines
- Robotics
- IoT Systems
- Spring Boot REST APIs
- Enterprise Applications

---

# What are Control Statements?

Control Statements are Java statements that determine the order in which program instructions are executed.

They help a program:

- Make decisions.
- Repeat tasks.
- Skip unnecessary execution.
- Control program flow.

---

# Types of Control Statements

Java provides three categories.

```
Control Statements

│

├── Decision Making

│      ├── if
│      ├── if-else
│      ├── if-else-if
│      ├── nested if
│      ├── switch
│      └── ternary operator

│

├── Looping

│      ├── for
│      ├── while
│      ├── do-while
│      └── enhanced for

│

└── Jump Statements

       ├── break
       ├── continue
       └── return
```

This module focuses on **Decision Making Statements**.

---

# Internal Working

Suppose we write:

```java
if(age >= 18)
```

Internally,

```
Expression

↓

Evaluated

↓

true?

↓

Yes

↓

Execute Block

↓

No

↓

Skip Block
```

The JVM evaluates the condition and chooses the appropriate execution path.

---

# Program Flow Without Control Statements

```
Start

↓

Statement 1

↓

Statement 2

↓

Statement 3

↓

Statement 4

↓

End
```

---

# Program Flow With Control Statements

```
Start

↓

Condition

↓

True?

↙        ↘

Yes      No

↓         ↓

Block A  Block B

↓

End
```

---

# Simple Example

```java
public class Demo {

    public static void main(String[] args) {

        int age = 20;

        if(age >= 18){

            System.out.println("Eligible to Vote");

        }

    }

}
```

Output

```
Eligible to Vote
```

---

# Advantages

- Makes programs intelligent.
- Reduces unnecessary execution.
- Improves readability.
- Supports complex business logic.
- Enables automation.
- Forms the foundation of software development.

---

# Limitations

- Deep nesting reduces readability.
- Poor condition design can introduce bugs.
- Complex logic is harder to maintain without proper structure.

---

# Best Practices

- Keep conditions simple and readable.
- Avoid deeply nested `if` statements.
- Use meaningful variable names.
- Prefer `switch` for multiple fixed choices.
- Format code consistently.

---

# Common Mistakes

❌ Forgetting braces for multiple statements.

❌ Writing overly complex conditions.

❌ Using `=` instead of `==` (where applicable).

❌ Deep nesting without refactoring.

---

# Interview Questions

### Q1. What are Control Statements?

Control Statements determine the order in which statements execute.

---

### Q2. Why are Control Statements important?

They allow programs to make decisions and control execution flow.

---

### Q3. What are the three categories of Control Statements?

- Decision Making
- Looping
- Jump Statements

---

### Q4. Which category does `if` belong to?

Decision Making.

---

### Q5. Where are Control Statements used?

Almost every software application, from web applications to embedded systems.

---

# Revision Notes

✅ Control Statements control execution flow.

✅ They make programs intelligent.

✅ Java has Decision, Looping, and Jump Statements.

✅ Decision statements evaluate conditions.

---

# Bootcamp Insight 💡

Every real-world Java application depends on control statements. Whether you're building a Spring Boot REST API, an ATM system, an e-commerce platform, or solving DSA problems, you'll use decision-making logic repeatedly. Mastering this module lays the foundation for loops, arrays, methods, object-oriented programming, and backend development.

---

# Connection Map

```
Variables
      │
      ▼
Operators
      │
      ▼
Relational Operators
      │
      ▼
Logical Operators
      │
      ▼
Control Statements
      │
      ▼
Loops
      │
      ▼
Methods
      │
      ▼
OOP
```

---

# Future Topic Connection

Next, we'll learn **Why Control Statements?**, exploring why sequential execution isn't enough and how decision-making enables real-world applications.

---

# Key Takeaways

- Control Statements manage program flow.
- They enable decision-making.
- Java provides Decision, Looping, and Jump Statements.
- Decision-making is essential for almost every Java application.
- Understanding control flow is the first step toward solving real programming problems.

---

## References

- Oracle Java Documentation
- Java Language Specification
- Effective Java – Joshua Bloch
- Head First Java