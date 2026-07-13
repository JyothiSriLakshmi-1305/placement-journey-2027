# Java Operator Precedence

## What is Operator Precedence?

Operator Precedence determines the **order in which operators are evaluated** in an expression.

When an expression contains multiple operators, Java follows a predefined priority to decide which operation should be performed first.

---

# Why Do We Need Operator Precedence?

Without operator precedence, Java would not know which operation to perform first.

It ensures:

- Correct evaluation of expressions
- Predictable program behavior
- Mathematical correctness

Example

```java
int result = 10 + 5 * 2;
```

Without precedence, there could be multiple answers.

Java follows precedence rules and evaluates:

```
5 * 2 = 10

↓

10 + 10 = 20
```

Output

```
20
```

---

# What is Precedence?

Precedence means **priority**.

Operators with higher precedence are evaluated before operators with lower precedence.

Example

```java
10 + 5 * 2
```

Multiplication (`*`) has higher precedence than Addition (`+`).

So,

```
5 × 2

↓

10

↓

10 + 10

↓

20
```

---

# Operator Precedence Table

| Priority | Operators |
|-----------|-----------|
| Highest | `()` |
| 2 | Unary (`+`, `-`, `++`, `--`, `!`, `~`) |
| 3 | `*`, `/`, `%` |
| 4 | `+`, `-` |
| 5 | `<<`, `>>`, `>>>` |
| 6 | `<`, `<=`, `>`, `>=` |
| 7 | `==`, `!=` |
| 8 | `&` |
| 9 | `^` |
| 10 | `|` |
| 11 | `&&` |
| 12 | `||` |
| 13 | `?:` |
| Lowest | Assignment (`=`, `+=`, `-=`, `*=`, `/=`, `%=`) |

---

# Internal Working

Example

```java
int result = 8 + 4 * 2;
```

Step 1

```
4 × 2

↓

8
```

Step 2

```
8 + 8

↓

16
```

Output

```
16
```

---

# Example 1

```java
System.out.println(5 + 2 * 3);
```

Output

```
11
```

Reason

```
2 × 3

↓

6

↓

5 + 6

↓

11
```

---

# Example 2

```java
System.out.println((5 + 2) * 3);
```

Output

```
21
```

Reason

Parentheses have the highest precedence.

```
5 + 2

↓

7

↓

7 × 3

↓

21
```

---

# Example 3

```java
int a = 10;

System.out.println(a > 5 && a < 20);
```

Output

```
true
```

---

# Importance of Parentheses

Parentheses always have the highest precedence.

Example

Without Parentheses

```java
10 + 5 * 2
```

Output

```
20
```

With Parentheses

```java
(10 + 5) * 2
```

Output

```
30
```

---

# Example Program

```java
public class PrecedenceDemo {

    public static void main(String[] args) {

        System.out.println(10 + 5 * 2);

        System.out.println((10 + 5) * 2);

        System.out.println(20 / 2 + 5);

        System.out.println(20 / (2 + 3));

    }
}
```

Output

```
20
30
15
4
```

---

# Common Mistakes

## Assuming Left to Right Always Happens

Incorrect

```
10 + 5 * 2

↓

30
```

Correct

```
5 × 2

↓

10

↓

10 + 10

↓

20
```

---

## Ignoring Parentheses

Always use parentheses when expressions become complex.

---

## Memorizing the Entire Table

Instead of memorizing everything, remember:

```
()

↓

Unary

↓

* / %

↓

+ -

↓

Shift

↓

Relational

↓

Equality

↓

Bitwise

↓

Logical

↓

Ternary

↓

Assignment
```

---

# Best Practices

- Use parentheses to improve readability.
- Avoid writing overly complex expressions.
- Break long expressions into smaller parts.
- Don't depend entirely on precedence for clarity.

---

# Interview Questions

### Q1

What is Operator Precedence?

Operator precedence decides which operator is evaluated first.

---

### Q2

Which has higher precedence?

```
*

or

+
```

Answer

```
*
```

---

### Q3

Which has the highest precedence?

Answer

```
()
```

---

### Q4

Output

```java
System.out.println(10 + 2 * 5);
```

Answer

```
20
```

---

### Q5

Output

```java
System.out.println((10 + 2) * 5);
```

Answer

```
60
```

---

# MCQs

### 1

Which operator has the highest precedence?

A. +

B. *

C. ()

D. =

Answer: **C**

---

### 2

Output

```java
System.out.println(5 + 3 * 2);
```

A. 16

B. 11

C. 13

D. 10

Answer: **B**

---

### 3

Output

```java
System.out.println((5 + 3) * 2);
```

A. 11

B. 16

C. 13

D. 10

Answer: **B**

---

# Coding Exercises

1. Predict outputs of arithmetic expressions.
2. Use parentheses to change the output.
3. Compare expressions with and without parentheses.
4. Write your own precedence examples.
5. Explain each result.

---

# Assignment

Write a Java program that demonstrates:

- Arithmetic precedence
- Relational precedence
- Logical precedence
- Parentheses changing the result

Print the output with explanations.

---

# Revision Notes

- Operator precedence determines execution order.
- Parentheses have the highest precedence.
- Multiplication comes before addition.
- Logical operators are evaluated after relational operators.
- Assignment operators have the lowest precedence.
- Use parentheses to improve readability.

---

# Key Takeaways

- Operator precedence removes ambiguity in expressions.
- Java follows a fixed precedence order.
- Parentheses override normal precedence.
- Use parentheses when writing complex expressions.
- Understanding precedence helps avoid logical errors.

---

## References

- Oracle Java Documentation
- https://docs.oracle.com/en/java/