# Ternary Operator (?:)

> **Module 17 – Control Statements (Decision Making)**

---

# Introduction

The **Ternary Operator (`?:`)** is the only conditional operator in Java. It provides a concise way to make simple decisions by replacing short `if-else` statements.

Instead of writing multiple lines of code using `if-else`, the ternary operator allows us to write the same logic in a **single expression**.

It is widely used in Java applications for assigning values, displaying messages, and writing clean, readable code for simple conditions.

---

# History

The ternary operator originated in the C programming language and was later adopted by Java.

Its purpose was to provide a compact syntax for simple conditional expressions while maintaining readability.

Today, it is supported by almost all modern programming languages.

---

# Why Do We Need the Ternary Operator?

Suppose we want to find the larger of two numbers.

Using `if-else`

```java
int max;

if(a > b){
    max = a;
}
else{
    max = b;
}
```

Using the ternary operator

```java
int max = (a > b) ? a : b;
```

The code becomes shorter and easier to read.

---

# Problem Statement

Many programs contain simple two-way decisions where only a value needs to be selected.

Examples:

- Maximum of two numbers
- Even or Odd
- Pass or Fail
- Eligible or Not Eligible
- Login Success or Failure

Writing a full `if-else` block for such simple decisions increases code length.

The ternary operator provides a compact solution.

---

# Definition

The **Ternary Operator (`?:`)** is a conditional operator that evaluates a boolean expression and returns one of two values depending on whether the expression is `true` or `false`.

---

# Syntax

```java
result = (condition) ? value1 : value2;
```

---

# Syntax Breakdown

```java
String result = (marks >= 35) ? "Pass" : "Fail";
```

| Part | Description |
|------|-------------|
| `condition` | Boolean expression |
| `?` | Separates condition and true value |
| `value1` | Returned if condition is true |
| `:` | Separates true and false values |
| `value2` | Returned if condition is false |

---

# Flow Diagram

```
              Start
                 │
                 ▼
        Evaluate Condition
                 │
          ┌──────┴──────┐
          │             │
        True         False
          │             │
          ▼             ▼
     Return Value1  Return Value2
          │             │
          └──────┬──────┘
                 ▼
                End
```

---

# Internal Working

Example

```java
int age = 20;

String result = (age >= 18) ? "Adult" : "Minor";
```

### Step 1

```
age = 20
```

### Step 2

Evaluate

```
20 >= 18

↓

true
```

### Step 3

Since the condition is true,

```
Return "Adult"
```

### Step 4

Store

```
result = "Adult"
```

---

# Memory Representation

```
Stack Memory

+------------------+

age = 20

result = ?

+------------------+

↓

Condition True

↓

result = Adult
```

---

# Example 1 – Maximum of Two Numbers

```java
int a = 10;
int b = 25;

int max = (a > b) ? a : b;

System.out.println(max);
```

Output

```
25
```

---

# Example 2 – Even or Odd

```java
int number = 7;

String result = (number % 2 == 0) ? "Even" : "Odd";

System.out.println(result);
```

Output

```
Odd
```

---

# Example 3 – Pass or Fail

```java
int marks = 70;

String result = (marks >= 35) ? "Pass" : "Fail";

System.out.println(result);
```

Output

```
Pass
```

---

# Example 4 – Voting Eligibility

```java
int age = 16;

String status = (age >= 18) ? "Eligible" : "Not Eligible";

System.out.println(status);
```

Output

```
Not Eligible
```

---

# Example 5 – Positive or Negative

```java
int number = -5;

String result = (number >= 0) ? "Positive" : "Negative";

System.out.println(result);
```

Output

```
Negative
```

---

# Nested Ternary Operator

Example

```java
int marks = 85;

String grade = (marks >= 90) ? "A"
              : (marks >= 75) ? "B"
              : (marks >= 60) ? "C"
              : "Fail";

System.out.println(grade);
```

Output

```
B
```

> **Note:** Nested ternary operators work correctly but can become difficult to read. For multiple conditions, an `if-else-if` ladder is often clearer.

---

# Real-Life Analogies

## Movie Ticket

```
Age ≥ 18 ?

↓

Yes → Adult Ticket

No → Child Ticket
```

---

## ATM

```
Balance ≥ Amount ?

↓

Yes → Withdraw

No → Insufficient Balance
```

---

## Login

```
Password Correct?

↓

Yes → Login

No → Invalid Password
```

---

# Industry Applications

The ternary operator is commonly used in:

- Form validation
- User interfaces
- Spring Boot applications
- REST API responses
- Configuration settings
- Assigning default values

---

# Advantages

- Short and concise.
- Reduces code length.
- Easy to use for simple conditions.
- Returns a value directly.

---

# Limitations

- Suitable only for simple decisions.
- Nested ternary operators reduce readability.
- Not recommended for complex business logic.

---

# Best Practices

✅ Use it only for simple `if-else` logic.

✅ Keep expressions short and readable.

✅ Prefer `if-else` when the logic becomes complex.

---

# Common Mistakes

❌ Writing very long nested ternary expressions.

❌ Using the ternary operator for side effects instead of returning values.

❌ Forgetting that both possible results should be compatible with the target variable's type.

---

# Comparison

| Feature | if-else | Ternary Operator |
|---------|----------|------------------|
| Lines of Code | More | Fewer |
| Readability | Better for complex logic | Better for simple logic |
| Returns Value | No (directly) | Yes |
| Suitable For | Complex decisions | Simple decisions |

---

# Interview Questions

### What is the ternary operator?

It is the only conditional operator in Java that selects one of two values based on a boolean condition.

---

### Why is it called a ternary operator?

Because it works with **three operands**:

- Condition
- True value
- False value

---

### Can it replace every `if-else` statement?

No. It is best suited for simple conditions that return a value.

---

### Can ternary operators be nested?

Yes, but excessive nesting reduces readability.

---

### Is the ternary operator faster than `if-else`?

No significant performance difference. Choose based on readability and maintainability.

---

# Quick Revision

```
Condition

↓

True ?

↓

Value1

:

Value2

↓

Store Result
```

---

# Bootcamp Insight 💡

The ternary operator is frequently used in professional Java code for concise assignments and UI logic. While it can make code elegant, avoid overusing nested ternary expressions. Clear and maintainable code is generally preferred in production environments.

---

# Connection Map

```
if

↓

if-else

↓

Ternary Operator

↓

Switch

↓

Loops

↓

Methods
```

---

# Future Topic

Next, you'll learn **Flow Control Best Practices**, covering how to write clean, maintainable, and efficient decision-making code.

---

# Key Takeaways

- The ternary operator (`?:`) is Java's only conditional operator.
- It replaces simple `if-else` statements.
- It always returns one of two values.
- Use it for simple conditions.
- Prefer `if-else` for complex logic.

---

# References

- Oracle Java Documentation
- Java Language Specification (JLS)
- Effective Java – Joshua Bloch
- Head First Java