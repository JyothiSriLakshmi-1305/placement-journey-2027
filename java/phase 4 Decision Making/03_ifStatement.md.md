# if Statement

> **Module 17 – Control Statements (Decision Making)**

---

# Introduction

The **`if` statement** is the simplest and most commonly used decision-making statement in Java.

It allows a program to execute a block of code **only when a specified condition is true**.

Without the `if` statement, every statement in a program would execute sequentially, making it impossible to implement real-world logic such as login validation, age verification, payment processing, or eligibility checks.

---

# History

The concept of conditional execution has existed since the early days of programming.

Early programming languages introduced branching instructions so that computers could make decisions instead of executing every instruction one after another.

Java inherited the structured `if` statement from the C programming language while improving readability and portability.

Today, the `if` statement is used in almost every Java application.

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

Modern Enterprise Java
```

---

# Why Do We Need the if Statement?

Suppose an ATM should dispense money only if the user enters the correct PIN.

Without an `if` statement:

```java
System.out.println("Cash Dispensed");
```

Cash would be dispensed for everyone.

Instead, the program should check the PIN first.

```java
if(pin == 1234){
    System.out.println("Cash Dispensed");
}
```

Now the ATM behaves correctly.

---

# Problem Statement

A computer cannot think or make decisions on its own.

It simply executes instructions exactly as they are written.

Programs therefore need a mechanism to decide whether a block of code should execute.

The `if` statement solves this problem.

---

# Definition

The **`if` statement** is a decision-making statement that executes a block of code **only when its condition evaluates to `true`**.

If the condition is `false`, the block is skipped.

---

# Syntax

```java
if(condition){
    // statements
}
```

---

# Syntax Breakdown

```java
if(age >= 18){
    System.out.println("Eligible");
}
```

| Part | Description |
|------|-------------|
| `if` | Java keyword |
| `(condition)` | Boolean expression |
| `{}` | Block of statements |
| Body | Executes only if the condition is true |

---

# Flow Diagram

```
            Start
               │
               ▼
      Evaluate Condition
               │
      ┌────────┴────────┐
      │                 │
    True              False
      │                 │
      ▼                 ▼
 Execute Block      Skip Block
      │                 │
      └────────┬────────┘
               ▼
              End
```

---

# Internal Working (JVM)

Consider the following code:

```java
int age = 20;

if(age >= 18){
    System.out.println("Eligible");
}
```

### Step 1

Variable is created.

```
age = 20
```

---

### Step 2

JVM evaluates

```
age >= 18
```

---

### Step 3

Result

```
20 >= 18

↓

true
```

---

### Step 4

Since condition is true,

```
Execute Block
```

---

### Step 5

Program continues.

---

# Memory Representation

```
Stack Memory

+----------------+

age = 20

+----------------+
```

Evaluation

```
age >=18

↓

true

↓

Execute statements
```

---

# Example 1

```java
public class Demo{

    public static void main(String[] args){

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

# Example 2

```java
int marks = 95;

if(marks >= 90){
    System.out.println("Excellent");
}
```

Output

```
Excellent
```

---

# Example 3

```java
int temperature = 38;

if(temperature > 37){
    System.out.println("High Temperature");
}
```

Output

```
High Temperature
```

---

# Example 4

```java
int balance = 5000;

if(balance >= 1000){
    System.out.println("Withdrawal Allowed");
}
```

Output

```
Withdrawal Allowed
```

---

# Example 5

```java
boolean loggedIn = true;

if(loggedIn){
    System.out.println("Welcome User");
}
```

Output

```
Welcome User
```

---

# Dry Run

Program

```java
int number = 15;

if(number > 10){
    System.out.println(number);
}
```

Execution

```
number = 15

↓

15 > 10

↓

true

↓

Print 15
```

Output

```
15
```

---

# Real-Life Analogies

## ATM

```
Correct PIN?

↓

Yes

↓

Dispense Cash
```

---

## College

```
Attendance ≥ 75%

↓

Eligible for Exam
```

---

## Mobile Phone

```
Fingerprint Matched?

↓

Unlock Phone
```

---

## Online Shopping

```
Coupon Valid?

↓

Apply Discount
```

---

# Industry Applications

The `if` statement is widely used in:

- Login Authentication
- Banking Applications
- Payment Verification
- Hospital Management Systems
- Student Portals
- E-Commerce Platforms
- Spring Boot APIs
- AI Decision Systems

---

# Advantages

- Easy to understand.
- Executes only required code.
- Reduces unnecessary processing.
- Foundation of decision making.
- Improves program efficiency.

---

# Limitations

- Executes code only when the condition is true.
- Cannot directly handle an alternative path.
- Multiple independent `if` statements may reduce readability if overused.

---

# Best Practices

✅ Keep conditions simple.

✅ Use braces `{}` even for a single statement.

✅ Use meaningful variable names.

✅ Write readable boolean expressions.

✅ Keep business logic clear.

---

# Common Mistakes

❌ Forgetting braces around multiple statements.

```java
if(age >=18)
    System.out.println("Eligible");
    System.out.println("Welcome");
```

Only the first statement belongs to the `if` block.

---

❌ Writing impossible conditions.

```java
if(age >18 && age <10)
```

---

❌ Using complex nested conditions unnecessarily.

---

# Interview Questions

### What is an `if` statement?

A decision-making statement that executes code only when a condition is true.

---

### What type of value must an `if` condition return?

A boolean (`true` or `false`).

---

### Can an `if` statement execute when the condition is false?

No.

---

### Can we omit braces?

Yes, for a single statement.

However, braces are recommended for readability and to avoid bugs.

---

### Can we write multiple `if` statements?

Yes.

Each `if` is evaluated independently unless connected with `else`.

---

# Quick Revision

```
if

↓

Condition

↓

True?

↓

Execute

↓

False?

↓

Skip
```

---

# Bootcamp Insight 💡

The `if` statement is one of the most frequently used constructs in Java. Whether you're building a Spring Boot REST API, validating user input, checking permissions, or solving coding interview problems, you'll rely on `if` statements extensively. Writing clear, simple conditions is more valuable than writing clever but difficult-to-read logic.

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

if Statement

↓

if-else

↓

Loops

↓

Methods

↓

OOP
```

---

# Future Topic

Next, you'll learn the **`if-else` statement**, which allows a program to choose between **two alternative execution paths** based on a condition.

---

# Key Takeaways

- `if` executes code only when a condition is `true`.
- The condition must evaluate to a boolean value.
- If the condition is `false`, the block is skipped.
- It is the simplest form of decision-making in Java.
- Use braces consistently to improve readability and prevent errors.

---

# References

- Oracle Java Documentation
- Java Language Specification (JLS)
- Effective Java – Joshua Bloch
- Head First Java