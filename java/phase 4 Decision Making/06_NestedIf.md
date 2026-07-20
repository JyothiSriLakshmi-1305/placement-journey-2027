# Nested if Statement

> **Module 17 – Control Statements (Decision Making)**

---

# Introduction

The **Nested if** statement is an `if` statement placed **inside another `if` statement**.

It is used when one decision depends on the result of another decision.

In real-world software, many operations require multiple validations before proceeding. For example, before allowing a user to transfer money in a banking application, the system might first verify that the user is logged in and then check whether the account has sufficient balance.

Nested `if` statements help model such dependent decisions.

---

# History

As software systems became more complex, developers needed a way to perform multiple dependent checks.

Instead of writing unrelated conditions, programming languages introduced nested decision-making, allowing one condition to be evaluated only if another condition was already satisfied.

Java inherited this concept from C and continues to support it for structured decision-making.

---

# Why Do We Need Nested if?

Consider an ATM.

Without Nested `if`

```java
System.out.println("Cash Dispensed");
```

Anyone could receive money.

Correct logic:

```
PIN Correct?

↓

Yes

↓

Sufficient Balance?

↓

Yes

↓

Dispense Cash
```

The second condition should only be checked if the first one is true.

---

# Problem Statement

Many real-world situations involve **dependent conditions**.

Examples:

- Login → OTP Verification
- ATM → PIN → Balance
- College → Attendance → Marks
- Shopping → Membership → Discount
- Company → Employee → Bonus Eligibility

Nested `if` solves this problem by evaluating one condition only after another succeeds.

---

# Definition

A **Nested if** is an `if` statement placed inside another `if` statement.

The inner `if` executes only when the outer `if` condition is true.

---

# Syntax

```java
if(condition1){

    if(condition2){

        // statements

    }

}
```

---

# Syntax Breakdown

| Part | Description |
|------|-------------|
| Outer if | First condition |
| Inner if | Executes only if the outer condition is true |
| Block | Final action after both conditions succeed |

---

# Flow Diagram

```
               Start
                 │
                 ▼
          Condition 1
             /    \
          True   False
            │       │
            ▼       ▼
      Condition 2   End
         /    \
      True   False
        │       │
        ▼       ▼
 Execute Block End
        │
        ▼
       End
```

---

# Internal Working

Example

```java
int age = 20;
boolean license = true;

if(age >= 18){

    if(license){

        System.out.println("Can Drive");

    }

}
```

### Step 1

```
age = 20
license = true
```

### Step 2

Evaluate

```
age >=18

↓

true
```

### Step 3

Since the outer condition is true, evaluate the inner condition.

```
license

↓

true
```

### Step 4

```
Print

Can Drive
```

---

# Memory Representation

```
Stack Memory

+----------------------+

age = 20

license = true

+----------------------+
```

Evaluation

```
Outer if

↓

true

↓

Inner if

↓

true

↓

Execute
```

---

# Example 1 – Driving Eligibility

```java
int age = 20;
boolean license = true;

if(age >=18){

    if(license){
        System.out.println("Can Drive");
    }

}
```

Output

```
Can Drive
```

---

# Example 2 – ATM

```java
boolean pin = true;
int balance = 5000;

if(pin){

    if(balance >=1000){

        System.out.println("Cash Dispensed");

    }

}
```

Output

```
Cash Dispensed
```

---

# Example 3 – Login System

```java
boolean username = true;
boolean password = true;

if(username){

    if(password){

        System.out.println("Login Successful");

    }

}
```

Output

```
Login Successful
```

---

# Example 4 – Student Eligibility

```java
int attendance = 85;
int marks = 70;

if(attendance >=75){

    if(marks >=35){

        System.out.println("Eligible");

    }

}
```

Output

```
Eligible
```

---

# Example 5 – Online Shopping

```java
boolean member = true;
int amount = 6000;

if(member){

    if(amount >=5000){

        System.out.println("20% Discount");

    }

}
```

Output

```
20% Discount
```

---

# Dry Run

```java
boolean loggedIn = true;
boolean otpVerified = false;

if(loggedIn){

    if(otpVerified){

        System.out.println("Dashboard");

    }

}
```

Execution

```
loggedIn = true

↓

Outer if

↓

true

↓

otpVerified = false

↓

Inner if

↓

false

↓

No Output
```

---

# Real-Life Analogies

## ATM

```
PIN Correct?

↓

Balance Available?

↓

Cash Dispensed
```

---

## Mobile Banking

```
Username Correct?

↓

Password Correct?

↓

OTP Verified?

↓

Login
```

---

## College

```
Attendance ≥75%

↓

Marks ≥35%

↓

Eligible
```

---

## Airport

```
Passport Valid?

↓

Visa Available?

↓

Board Flight
```

---

# Industry Applications

Nested `if` is commonly used in:

- Banking Systems
- User Authentication
- Multi-factor Authentication (MFA)
- Hospital Software
- Loan Approval Systems
- Online Shopping
- Spring Boot Authorization
- AI Decision Pipelines

---

# Advantages

- Handles dependent decisions.
- Easy to model multi-step validation.
- Useful for authentication and authorization.
- Improves logical grouping of conditions.

---

# Limitations

- Deep nesting reduces readability.
- Difficult to maintain if overused.
- Can often be simplified using logical operators (`&&`).

---

# Best Practices

✅ Keep nesting levels low.

✅ Use meaningful variable names.

✅ Add comments when logic is complex.

✅ Combine conditions with `&&` when appropriate.

Example

Instead of

```java
if(age >=18){

    if(license){

        System.out.println("Can Drive");

    }

}
```

You can write

```java
if(age >=18 && license){

    System.out.println("Can Drive");

}
```

Use the version that best expresses your program's logic.

---

# Common Mistakes

❌ Excessive nesting.

❌ Forgetting braces.

❌ Writing duplicate conditions.

❌ Ignoring logical operators that could simplify the code.

---

# Comparison

| Feature | if | if-else | if-else-if | Nested if |
|---------|----|----------|------------|-----------|
| Conditions | One | One | Multiple | Dependent |
| Else Block | No | Yes | Optional | Optional |
| Best Use | Single check | Two choices | Many choices | Multi-step validation |

---

# Interview Questions

### What is a Nested if?

An `if` statement placed inside another `if` statement.

---

### When should Nested if be used?

When one decision depends on another decision.

---

### Can Nested if be replaced?

Sometimes. If the conditions are independent, they can often be combined using logical operators such as `&&`.

---

### Is deep nesting recommended?

No. Deep nesting reduces readability and maintainability.

---

### Which is better?

Use Nested `if` when there is a clear dependency between conditions. Use combined conditions (`&&`, `||`) when the logic becomes simpler and easier to read.

---

# Quick Revision

```
Outer if

↓

True?

↓

Inner if

↓

True?

↓

Execute

↓

End
```

---

# Bootcamp Insight 💡

Nested `if` statements are common in enterprise applications where operations require multiple levels of validation, such as authentication, authorization, and business rule enforcement. While powerful, excessive nesting can make code difficult to understand. Prefer simpler logic when it communicates the intent more clearly.

---

# Connection Map

```
if

↓

if-else

↓

if-else-if

↓

Nested if

↓

Switch

↓

Loops

↓

Methods
```

---

# Future Topic

Next, you'll learn the **`switch` statement**, which provides a cleaner alternative to long `if-else-if` ladders when comparing a single variable against multiple constant values.

---

# Key Takeaways

- Nested `if` is an `if` inside another `if`.
- The inner `if` executes only if the outer condition is true.
- Best suited for dependent decisions.
- Avoid excessive nesting.
- Use logical operators when they improve readability.

---

# References

- Oracle Java Documentation
- Java Language Specification (JLS)
- Effective Java – Joshua Bloch
- Head First Java