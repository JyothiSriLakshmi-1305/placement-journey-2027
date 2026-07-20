# Why Control Statements?

> **Module 17 – Control Statements (Decision Making)**

---

# Introduction

Computers are incredibly fast at executing instructions, but they do not think like humans.

A computer simply follows the instructions given by the programmer.

Without control statements, every Java program would execute every statement from top to bottom, regardless of the situation.

Control Statements allow a program to make decisions based on conditions, just like humans do in daily life.

---

# Why Do We Need Control Statements?

Imagine a college management system.

A student is eligible for an exam only if attendance is **75% or above**.

Without control statements, the program would print:

```
Eligible for Exam

Not Eligible for Exam
```

Both statements would execute, producing incorrect results.

Instead, the program should check the attendance and print only the appropriate message.

This is where control statements become essential.

---

# Problem Without Control Statements

Suppose we write:

```java
System.out.println("Eligible");
System.out.println("Not Eligible");
```

Output

```
Eligible
Not Eligible
```

The computer has no idea which statement is correct.

---

# Solution Using Control Statements

```java
if(attendance >= 75){
    System.out.println("Eligible");
}
```

Now the program checks the condition before executing the statement.

---

# Human Thinking vs Computer Execution

### Human

```
Is it raining?

↓

Yes

↓

Take Umbrella

↓

No

↓

Go Normally
```

Humans naturally make decisions.

---

### Computer Without Control Statements

```
Take Umbrella

Go Normally
```

It executes everything.

---

### Computer With Control Statements

```
Check Condition

↓

True?

↙      ↘

Yes     No

↓        ↓

Take     Go
Umbrella Normally
```

---

# Real-Life Examples

## Example 1 – ATM

```
PIN Correct?

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

## Example 2 – Online Shopping

```
Cart > ₹1000

↓

Discount

↓

Else

↓

No Discount
```

---

## Example 3 – Driving

```
Traffic Light

↓

Green?

↓

Drive

↓

Else

↓

Stop
```

---

## Example 4 – College

```
Marks >= 40

↓

Pass

↓

Else

↓

Fail
```

---

# Daily Applications

Control statements are used in:

- ATM Machines
- Banking Applications
- Mobile Apps
- Food Delivery Apps
- Online Shopping
- Railway Reservation
- Hospital Software
- School Management Systems
- AI Applications
- IoT Devices

---

# Industry Applications

Every enterprise application depends on decision-making.

Examples include:

### Banking

- Validate PIN
- Check account balance
- Verify transaction limits

---

### E-Commerce

- Apply discounts
- Check product availability
- Verify payment

---

### Healthcare

- Determine patient priority
- Validate prescriptions
- Check insurance eligibility

---

### Social Media

- Login authentication
- Privacy settings
- Content recommendations

---

### Spring Boot Applications

- User authentication
- Role-based access
- Input validation
- Business rules

---

# How Control Statements Work

```
Input

↓

Condition

↓

Decision

↓

Execute Required Block

↓

Continue Program
```

---

# Sequential Execution vs Decision Making

### Without Control Statements

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

Everything executes.

---

### With Control Statements

```
Start

↓

Condition

↓

True?

↙       ↘

Yes      No

↓         ↓

Block A  Block B

↓

End
```

Only one path executes.

---

# Java Decision-Making Statements

Java provides several ways to make decisions.

| Statement | Purpose |
|-----------|----------|
| if | Executes code when a condition is true |
| if-else | Chooses between two blocks |
| if-else-if | Chooses from multiple conditions |
| Nested if | Decision inside another decision |
| switch | Selects one option from many |
| Ternary Operator | Short form of if-else |

---

# Benefits of Control Statements

- Make programs intelligent.
- Reduce unnecessary execution.
- Improve efficiency.
- Implement business logic.
- Increase readability.
- Simplify complex decisions.

---

# Common Mistakes

❌ Writing unnecessary nested conditions.

❌ Forgetting braces for multiple statements.

❌ Writing overly complex logical expressions.

❌ Choosing `if` instead of `switch` when multiple fixed values are involved.

---

# Best Practices

✔ Keep conditions simple.

✔ Use meaningful variable names.

✔ Avoid deep nesting.

✔ Choose the right control statement for the problem.

✔ Format code consistently.

---

# Interview Questions

### Q1. Why do we need control statements?

They allow a program to make decisions based on conditions instead of executing every statement sequentially.

---

### Q2. What problem do control statements solve?

They enable selective execution of code based on conditions.

---

### Q3. Can Java work without control statements?

Yes, but programs would only execute sequentially and could not implement real-world decision-making.

---

### Q4. Give real-life examples of control statements.

- ATM PIN verification
- Login authentication
- Traffic signals
- Online shopping discounts
- Exam eligibility

---

### Q5. Which Java statements are used for decision making?

- if
- if-else
- if-else-if
- nested if
- switch
- ternary operator

---

# Revision Notes

✅ Computers execute instructions exactly as written.

✅ Control statements introduce decision-making.

✅ Only the required block executes.

✅ They are essential for real-world software development.

---

# Bootcamp Insight 💡

Every software application you use—from WhatsApp and Google Maps to banking apps and e-commerce platforms—relies on control statements. They transform a simple sequence of instructions into intelligent, interactive software capable of responding to user input and business rules.

---

# Connection Map

```
Variables

↓

Operators

↓

Relational Operators

↓

Logical Operators

↓

Control Statements

↓

Loops

↓

Methods

↓

Object-Oriented Programming
```

---

# Future Topic Connection

Now that you understand **why** control statements are needed, the next topic is **`if` Statement**, the simplest and most fundamental decision-making statement in Java.

---

# Key Takeaways

- Computers do not make decisions automatically.
- Control statements enable intelligent program flow.
- They execute code conditionally.
- Decision-making is fundamental to all Java applications.
- Choosing the right control statement improves readability and maintainability.

---

# References

- Oracle Java Documentation
- Java Language Specification (JLS)
- Effective Java – Joshua Bloch
- Head First Java