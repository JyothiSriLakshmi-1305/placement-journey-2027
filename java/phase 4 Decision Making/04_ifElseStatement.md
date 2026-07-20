# if-else Statement

> **Module 17 – Control Statements (Decision Making)**

---

# Introduction

The **`if-else` statement** is one of the most fundamental decision-making constructs in Java. It allows a program to choose **between two possible execution paths** based on whether a condition is `true` or `false`.

Unlike the `if` statement, which executes code only when a condition is true, the `if-else` statement guarantees that **exactly one block of code will execute**.

This makes it ideal for scenarios where there are only **two possible outcomes**, such as login success or failure, pass or fail, eligible or not eligible.

---

# History

Early computers executed instructions sequentially without making decisions.

As programming languages evolved, branching mechanisms were introduced so that programs could execute different instructions depending on specific conditions.

Java inherited the `if-else` construct from the C language and made it an essential part of structured programming.

Today, almost every Java application uses `if-else` statements.

---

# Why Do We Need if-else?

Consider an online login system.

Without `if-else`:

```java
System.out.println("Login Successful");
System.out.println("Invalid Password");
```

Output

```
Login Successful
Invalid Password
```

This is incorrect because both messages are printed.

Using `if-else`:

```java
if(passwordCorrect){
    System.out.println("Login Successful");
}
else{
    System.out.println("Invalid Password");
}
```

Now the program prints only the correct message.

---

# Problem Statement

Many real-world situations have **two possible outcomes**.

Examples:

- Pass or Fail
- Login or Logout
- Eligible or Not Eligible
- Day or Night
- Payment Success or Failure

The `if-else` statement enables the program to choose exactly one outcome.

---

# Definition

The **`if-else` statement** executes one block of code when the condition is `true` and another block when the condition is `false`.

Only one block executes during a single execution.

---

# Syntax

```java
if(condition){

    // true block

}
else{

    // false block

}
```

---

# Syntax Breakdown

```java
if(age >= 18){

    System.out.println("Eligible");

}
else{

    System.out.println("Not Eligible");

}
```

| Part | Description |
|------|-------------|
| `if` | Checks the condition |
| `condition` | Boolean expression |
| `true block` | Executes if condition is true |
| `else` | Executes when condition is false |

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
      True             False
        │                 │
        ▼                 ▼
 Execute if Block   Execute else Block
        │                 │
        └────────┬────────┘
                 ▼
                End
```

---

# Internal Working

Example

```java
int age = 16;

if(age >= 18){
    System.out.println("Eligible");
}
else{
    System.out.println("Not Eligible");
}
```

### Step 1

```
age = 16
```

### Step 2

Evaluate

```
age >=18
```

### Step 3

```
16 >=18

↓

false
```

### Step 4

Condition is false.

```
Skip if block

↓

Execute else block
```

---

# Memory Representation

```
Stack Memory

+----------------+

age = 16

+----------------+
```

Evaluation

```
age >=18

↓

false

↓

else executes
```

---

# Example 1

```java
int age = 20;

if(age >=18){
    System.out.println("Eligible to Vote");
}
else{
    System.out.println("Not Eligible");
}
```

Output

```
Eligible to Vote
```

---

# Example 2

```java
int marks = 30;

if(marks >=35){
    System.out.println("Pass");
}
else{
    System.out.println("Fail");
}
```

Output

```
Fail
```

---

# Example 3

```java
boolean loggedIn = false;

if(loggedIn){
    System.out.println("Welcome");
}
else{
    System.out.println("Please Login");
}
```

Output

```
Please Login
```

---

# Example 4

```java
int balance = 500;

if(balance >=1000){
    System.out.println("Withdrawal Allowed");
}
else{
    System.out.println("Insufficient Balance");
}
```

---

# Example 5

```java
int number = 7;

if(number % 2 == 0){
    System.out.println("Even");
}
else{
    System.out.println("Odd");
}
```

Output

```
Odd
```

---

# Dry Run

```java
int x = 5;

if(x > 10){
    System.out.println("Large");
}
else{
    System.out.println("Small");
}
```

Execution

```
x = 5

↓

5 >10

↓

false

↓

Print Small
```

---

# Real-Life Analogies

## ATM

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

## Traffic Signal

```
Green?

↓

Yes → Go

No → Stop
```

---

## Online Payment

```
Payment Successful?

↓

Yes → Order Confirmed

No → Retry Payment
```

---

## College Admission

```
Cutoff Met?

↓

Yes → Admission Granted

No → Admission Rejected
```

---

# Industry Applications

The `if-else` statement is commonly used in:

- Login authentication
- Banking systems
- Payment gateways
- Inventory management
- Hospital software
- E-commerce websites
- Spring Boot REST APIs
- User permission checks

---

# Advantages

- Provides two-way decision making.
- Ensures one block always executes.
- Improves readability.
- Easy to understand.
- Forms the basis of business logic.

---

# Limitations

- Handles only two outcomes.
- Multiple choices require `if-else-if` or `switch`.
- Excessive nesting reduces readability.

---

# Best Practices

✅ Keep conditions simple.

✅ Always use braces.

✅ Write meaningful conditions.

✅ Keep business logic readable.

---

# Common Mistakes

❌ Forgetting braces.

❌ Writing impossible conditions.

❌ Nesting too many `if-else` blocks.

❌ Using `if-else` when `switch` is more appropriate.

---

# Comparison with if Statement

| Feature | if | if-else |
|---------|----|----------|
| Executes when true | ✅ | ✅ |
| Executes when false | ❌ | ✅ |
| Number of execution paths | One | Two |
| Best for | Single condition | Two alternatives |

---

# Interview Questions

### What is an if-else statement?

It executes one block when the condition is true and another block when it is false.

---

### How many blocks execute?

Exactly one block.

---

### Is the else block mandatory?

No. If you only need to execute code when a condition is true, use `if` alone.

---

### Can an else exist without an if?

No. Every `else` must be associated with an `if`.

---

### Can we write multiple else blocks?

No. An `if` statement can have only one `else`.

---

# Quick Revision

```
Condition

↓

True?

↙      ↘

Yes      No

↓         ↓

if      else

↓

End
```

---

# Bootcamp Insight 💡

The `if-else` statement is one of the most frequently used control structures in Java applications. Whether you're validating user credentials, checking payment status, or implementing access control in a Spring Boot application, you'll encounter two-way decision making repeatedly. Writing clear and readable `if-else` logic is a key skill for software engineers.

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

if

↓

if-else

↓

if-else-if

↓

switch

↓

Loops

↓

Methods
```

---

# Future Topic

Next, you'll learn the **`if-else-if` Ladder**, which allows Java programs to choose from **multiple conditions** instead of just two.

---

# Key Takeaways

- `if-else` provides two-way decision making.
- Exactly one block executes.
- The condition must evaluate to a boolean value.
- Use `if-else` when there are only two possible outcomes.
- Keep conditions simple and readable.

---

# References

- Oracle Java Documentation
- Java Language Specification (JLS)
- Effective Java – Joshua Bloch
- Head First Java