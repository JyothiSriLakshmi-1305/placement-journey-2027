# Module 17 Revision – Control Statements

> **Java Engineering Bootcamp (2027)**

---

# Module Overview

In this module, you learned how Java programs make decisions using different control statements.

Decision-making statements allow a program to execute different blocks of code based on conditions.

---

# Decision Making Flow

```
Program Starts

↓

Condition

↓

Decision

↓

Execute Appropriate Block

↓

Continue Program
```

---

# Topics Covered

✅ if Statement

✅ if-else Statement

✅ if-else-if Ladder

✅ Nested if

✅ Traditional switch

✅ Enhanced switch

✅ Ternary Operator

✅ Flow Control Best Practices

✅ Comparison Guide

---

# 1. if Statement

## Purpose

Execute code **only if** a condition is true.

### Syntax

```java
if(condition){
    // statements
}
```

### Example

```java
if(age >= 18){
    System.out.println("Eligible");
}
```

### Best Use

- Single condition
- Validation
- Checking flags

---

# 2. if-else Statement

## Purpose

Choose between **two possible outcomes**.

### Syntax

```java
if(condition){

}
else{

}
```

### Example

```java
if(marks >= 35){
    System.out.println("Pass");
}
else{
    System.out.println("Fail");
}
```

### Best Use

- Pass/Fail
- Login Success/Failure
- Eligible/Not Eligible

---

# 3. if-else-if Ladder

## Purpose

Choose among **multiple conditions**.

### Syntax

```java
if(condition1){

}
else if(condition2){

}
else{

}
```

### Best Use

- Grades
- Tax Slabs
- Discounts
- Salary Categories

---

# 4. Nested if

## Purpose

Use when one condition depends on another.

### Example

```java
if(pinCorrect){

    if(balance > 1000){

        System.out.println("Withdraw");

    }

}
```

### Best Use

- Authentication
- ATM
- Banking
- Multi-level Validation

---

# 5. Traditional switch

## Purpose

Compare one variable with multiple constant values.

### Syntax

```java
switch(expression){

    case value:
        break;

    default:
}
```

### Features

- Uses break
- Supports fall-through
- Cleaner than long if-else-if ladders for fixed values

---

# 6. Enhanced switch

## Purpose

Modern Java decision making (Java 14+).

### Syntax

```java
String day = switch(num){

    case 1 -> "Monday";

    default -> "Invalid";

};
```

### Advantages

- No break
- No accidental fall-through
- Returns values
- Cleaner syntax

---

# 7. Ternary Operator

## Purpose

Replace simple if-else statements.

### Syntax

```java
result = (condition) ? value1 : value2;
```

### Example

```java
String status = (age >=18) ? "Adult" : "Minor";
```

### Best Use

Simple assignments only.

---

# Decision Making Comparison

| Situation | Recommended Statement |
|------------|-----------------------|
| One condition | if |
| Two outcomes | if-else |
| Multiple conditions | if-else-if |
| Dependent conditions | Nested if |
| Fixed constant values | switch |
| Modern Java | Enhanced switch |
| Simple assignment | Ternary |

---

# Supported Data Types for switch

Traditional and Enhanced switch support:

- byte
- short
- char
- int
- enum
- String

Not supported:

- float
- double
- long
- boolean

---

# Remember

## break

Stops execution inside a traditional switch.

---

## default

Runs when no case matches.

---

## yield

Returns a value from a block inside an enhanced switch expression.

---

## Arrow (->)

Used in enhanced switch.

---

# Flowcharts

## if

```
Condition

↓

True

↓

Execute
```

---

## if-else

```
Condition

↓

True?

↙      ↘

if     else
```

---

## switch

```
Expression

↓

Compare

↓

Matching Case

↓

Execute

↓

break
```

---

## Ternary

```
Condition

↓

?

↓

True Value

:

False Value
```

---

# Common Mistakes

❌ Forgetting break in traditional switch

❌ Deep nesting

❌ Long ternary operators

❌ Duplicate conditions

❌ Missing braces

❌ Wrong ordering in if-else-if

---

# Best Practices

✔ Keep conditions simple

✔ Use braces

✔ Prefer switch for menus

✔ Prefer enhanced switch in Java 14+

✔ Use meaningful variable names

✔ Test edge cases

✔ Avoid unnecessary nesting

---

# Frequently Used Interview Points

- switch cannot evaluate ranges directly.
- Ternary operator has three operands.
- Enhanced switch returns values.
- break prevents fall-through.
- yield returns values from switch blocks.
- Nested if is used for dependent conditions.
- if-else-if is best for ranges.
- switch is best for fixed choices.

---

# Memory Trick

```
One Condition

↓

if

↓

Two Choices

↓

if-else

↓

Many Choices

↓

if-else-if

↓

Dependent Choices

↓

Nested if

↓

Fixed Values

↓

switch

↓

Simple Assignment

↓

Ternary
```

---

# Real-World Applications

| Application | Statement |
|-------------|-----------|
| Login | if |
| Pass/Fail | if-else |
| Grade System | if-else-if |
| ATM Menu | switch |
| Shopping Discount | if-else-if |
| Role Verification | Nested if |
| Temperature Status | Ternary |
| REST API Routing | Enhanced switch |

---

# Interview Revision Checklist

✅ if

✅ if-else

✅ if-else-if

✅ Nested if

✅ switch

✅ break

✅ default

✅ Enhanced switch

✅ yield

✅ Ternary

✅ Best Practices

---

# One-Line Summary

| Statement | Purpose |
|------------|---------|
| if | Execute when true |
| if-else | Two outcomes |
| if-else-if | Multiple conditions |
| Nested if | Dependent conditions |
| switch | Fixed values |
| Enhanced switch | Modern switch |
| Ternary | Short if-else |

---

# Bootcamp Insight 💡

This module forms the foundation of Java decision-making. Every Java developer uses these constructs daily—whether writing business rules, validating user input, implementing authentication, or building enterprise applications with Spring Boot. Mastering when to use each statement is more important than memorizing syntax.

---

# Module Summary

After completing this module, you should be able to:

- Choose the appropriate decision-making statement.
- Write clean and readable conditional logic.
- Understand the difference between traditional and enhanced switch.
- Use the ternary operator appropriately.
- Follow Java coding best practices.
- Solve common interview and coding problems involving decision making.

---

# What's Next?

Next, you'll move to:

- **13_InterviewQuestions.md**
- **14_MCQs.md**
- **15_CodingExercises.md**
- **16_Assignment.md**

These chapters will reinforce your understanding through interview-focused questions, placement-style MCQs, hands-on coding practice, and assignments.

---

# References

- Oracle Java Documentation
- Java Language Specification (JLS)
- Effective Java – Joshua Bloch
- Clean Code – Robert C. Martin