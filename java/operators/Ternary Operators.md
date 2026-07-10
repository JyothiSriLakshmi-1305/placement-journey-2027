# Java Ternary Operator

## What is the Ternary Operator?

The **Ternary Operator (`?:`)** is a **conditional operator** used to make decisions in Java.

It evaluates a condition and returns one of two values depending on whether the condition is **true** or **false**.

It is the **only operator in Java that works with three operands**, which is why it is called the **Ternary Operator**.

---

# Why Do We Need the Ternary Operator?

The ternary operator is used to replace simple `if-else` statements.

It helps us:

- Write shorter code.
- Improve readability.
- Assign values based on conditions.
- Reduce unnecessary lines of code.

Example

Using `if-else`

```java
int age = 20;
String status;

if (age >= 18) {
    status = "Adult";
} else {
    status = "Minor";
}
```

Using Ternary Operator

```java
int age = 20;

String status = (age >= 18) ? "Adult" : "Minor";
```

Both programs produce the same output.

---

# Why is it Called the Ternary Operator?

Because it works with **three operands**.

```
Condition
?
True Expression
:
False Expression
```

Example

```java
int max = (a > b) ? a : b;
```

Three operands:

1. Condition
2. True Expression
3. False Expression

---

# Syntax

```java
condition ? expression1 : expression2;
```

If the condition is **true**

↓

`expression1` is executed.

If the condition is **false**

↓

`expression2` is executed.

---

# Flow Diagram

```
          Condition
             │
      ┌──────┴──────┐
      │             │
    True          False
      │             │
Expression1    Expression2
      │             │
      └──────┬──────┘
             │
           Result
```

---

# Internal Working

Example

```java
int age = 20;

String result = (age >= 18) ? "Eligible" : "Not Eligible";
```

Step 1

```
20 >= 18

↓

true
```

Step 2

Since the condition is true,

```
"Eligible"
```

is selected.

Step 3

```
result = "Eligible"
```

---

# Example 1 - Check Eligibility

```java
int age = 20;

String status = (age >= 18) ? "Eligible" : "Not Eligible";

System.out.println(status);
```

### Output

```
Eligible
```

---

# Example 2 - Find Maximum Number

```java
int a = 10;
int b = 20;

int max = (a > b) ? a : b;

System.out.println(max);
```

### Output

```
20
```

---

# Example 3 - Even or Odd

```java
int number = 7;

String result = (number % 2 == 0) ? "Even" : "Odd";

System.out.println(result);
```

### Output

```
Odd
```

---

# Example 4 - Positive or Negative

```java
int number = -5;

String result = (number >= 0) ? "Positive" : "Negative";

System.out.println(result);
```

### Output

```
Negative
```

---

# Nested Ternary Operator

A ternary operator can be used inside another ternary operator.

Example

```java
int marks = 92;

String grade = (marks >= 90)
        ? "A"
        : (marks >= 75)
            ? "B"
            : "C";

System.out.println(grade);
```

### Output

```
A
```

> **Note:** Nested ternary operators should be used carefully because they can reduce readability.

---

# Comparison with if-else

## Using if-else

```java
if (a > b) {
    max = a;
} else {
    max = b;
}
```

## Using Ternary Operator

```java
max = (a > b) ? a : b;
```

Both give the same result.

---

# Common Mistakes

## 1. Missing Colon (:)

Incorrect

```java
a > b ? a b;
```

Correct

```java
a > b ? a : b;
```

---

## 2. Writing Complex Nested Ternary Operators

Avoid writing multiple nested ternary operators when an `if-else` statement is easier to understand.

---

## 3. Using Incompatible Return Types

Incorrect

```java
true ? 100 : "Java";
```

Use compatible types whenever possible.

---

# Best Practices

- Use the ternary operator only for simple conditions.
- Prefer `if-else` for complex logic.
- Keep expressions short and readable.
- Use meaningful variable names.

---

# Interview Questions

### Q1. What is the ternary operator?

The ternary operator is a conditional operator that evaluates a condition and returns one of two values.

---

### Q2. Why is it called the ternary operator?

Because it uses **three operands**:

- Condition
- True Expression
- False Expression

---

### Q3. Which symbol represents the ternary operator?

```
? :
```

---

### Q4. Can the ternary operator replace every if-else statement?

No.

It is suitable only for simple conditions.

---

### Q5. How many operands does the ternary operator use?

Three.

---

# MCQs

### 1. Which operator is known as the conditional operator?

A. +

B. &&

C. ?:

D. ==

**Answer:** C

---

### 2. How many operands does the ternary operator use?

A. One

B. Two

C. Three

D. Four

**Answer:** C

---

### 3. Output

```java
int a = 10;
int b = 20;

System.out.println(a > b ? a : b);
```

A. 10

B. 20

C. true

D. false

**Answer:** B

---

### 4. Output

```java
int age = 16;

System.out.println(age >= 18 ? "Adult" : "Minor");
```

A. Adult

B. Minor

C. true

D. false

**Answer:** B

---

# Coding Exercises

1. Find the maximum of two numbers.
2. Find the minimum of two numbers.
3. Check whether a number is even or odd.
4. Check voting eligibility.
5. Check whether a number is positive or negative.

---

# Assignment

Write a Java program that:

- Reads two integers.
- Finds the larger number using the ternary operator.
- Checks whether a number is even or odd.
- Checks whether a person is eligible to vote.

---

# Revision Notes

- Uses **three operands**.
- Also called the **Conditional Operator**.
- Syntax:

```java
condition ? trueExpression : falseExpression;
```

- Used as a replacement for simple `if-else`.
- Returns one of two expressions based on the condition.

---

# Key Takeaways

- The ternary operator simplifies simple decision-making.
- It is the only operator in Java that uses three operands.
- It improves readability when used appropriately.
- Avoid nested ternary operators for complex logic.
- Prefer `if-else` for complicated conditions.

---

## References

- Oracle Java Documentation
- https://docs.oracle.com/en/java/
