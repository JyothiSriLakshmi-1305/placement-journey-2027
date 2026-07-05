# Java Arithmetic Operators

## What are Arithmetic Operators?

Arithmetic operators are used to perform **mathematical calculations** on numeric values such as addition, subtraction, multiplication, division, and modulus.

These operators work with primitive numeric data types like:

- byte
- short
- int
- long
- float
- double
- char (based on ASCII values)

---

# Why Do We Need Arithmetic Operators?

Arithmetic operators help us perform mathematical operations in Java programs.

Common use cases include:

- Calculating total marks
- Finding average
- Computing salary
- Calculating percentage
- Performing financial calculations
- Building mathematical applications

---

# Types of Arithmetic Operators

| Operator | Name | Example |
|----------|------|---------|
| + | Addition | `a + b` |
| - | Subtraction | `a - b` |
| * | Multiplication | `a * b` |
| / | Division | `a / b` |
| % | Modulus (Remainder) | `a % b` |

---

# 1. Addition Operator (+)

Adds two operands.

### Syntax

```java
result = a + b;
```

### Example

```java
int a = 20;
int b = 10;

System.out.println(a + b);
```

### Output

```
30
```

---

# 2. Subtraction Operator (-)

Subtracts the second operand from the first.

### Syntax

```java
result = a - b;
```

### Example

```java
int a = 20;
int b = 10;

System.out.println(a - b);
```

### Output

```
10
```

---

# 3. Multiplication Operator (*)

Multiplies two operands.

### Syntax

```java
result = a * b;
```

### Example

```java
int a = 8;
int b = 5;

System.out.println(a * b);
```

### Output

```
40
```

---

# 4. Division Operator (/)

Divides the first operand by the second.

### Syntax

```java
result = a / b;
```

### Integer Division

```java
int a = 10;
int b = 3;

System.out.println(a / b);
```

Output

```
3
```

Fractional part is discarded.

### Floating Point Division

```java
double a = 10;
double b = 3;

System.out.println(a / b);
```

Output

```
3.3333333333333335
```

---

# 5. Modulus Operator (%)

Returns the remainder after division.

### Syntax

```java
result = a % b;
```

### Example

```java
int a = 10;
int b = 3;

System.out.println(a % b);
```

### Output

```
1
```

---

# Order of Evaluation

Java follows operator precedence.

```
()
↓
*  /  %
↓
+  -
```

Example

```java
int result = 10 + 5 * 2;
```

Output

```
20
```

Because multiplication is performed first.

---

# Example Program

```java
public class ArithmeticDemo {

    public static void main(String[] args) {

        int a = 20;
        int b = 6;

        System.out.println("Addition       : " + (a + b));
        System.out.println("Subtraction    : " + (a - b));
        System.out.println("Multiplication : " + (a * b));
        System.out.println("Division       : " + (a / b));
        System.out.println("Modulus        : " + (a % b));

    }
}
```

### Output

```
Addition       : 26
Subtraction    : 14
Multiplication : 120
Division       : 3
Modulus        : 2
```

---

# Common Mistakes

## Integer Division

```java
System.out.println(5 / 2);
```

Output

```
2
```

Not

```
2.5
```

---

## Division by Zero

```java
int a = 10;
int b = 0;

System.out.println(a / b);
```

Produces

```
ArithmeticException
```

---

## Forgetting Operator Precedence

```java
int result = 2 + 3 * 4;
```

Output

```
14
```

Not

```
20
```

---

# Best Practices

- Use `double` when decimal precision is required.
- Check for division by zero before dividing.
- Use meaningful variable names.
- Use parentheses to improve readability.

Example

```java
double average = (marks1 + marks2 + marks3) / 3.0;
```

---

# Interview Questions

### Q1. What are arithmetic operators?

Arithmetic operators perform mathematical operations on numeric values.

---

### Q2. What is the difference between `/` and `%`?

| `/` | `%` |
|-----|-----|
| Returns quotient | Returns remainder |

---

### Q3. What is the output?

```java
System.out.println(10 / 3);
```

Answer

```
3
```

---

### Q4. Why does integer division remove decimals?

Because both operands are integers, Java returns an integer result.

---

### Q5. What happens when dividing by zero?

- Integer division throws `ArithmeticException`.
- Floating-point division returns `Infinity` or `NaN`.

---

# MCQs

### 1. Which operator returns the remainder?

- A. /
- B. %
- C. *
- D. +

**Answer:** B

---

### 2. Output?

```java
System.out.println(20 / 6);
```

- A. 3
- B. 3.33
- C. 4
- D. Error

**Answer:** A

---

### 3. Output?

```java
System.out.println(20 % 6);
```

- A. 2
- B. 3
- C. 4
- D. 6

**Answer:** A

---

### 4. Highest precedence among arithmetic operators?

- A. +
- B. -
- C. *
- D. %

**Answer:** C

---

# Coding Exercises

1. Add two numbers.
2. Find the difference of two numbers.
3. Multiply two numbers.
4. Find quotient and remainder.
5. Calculate percentage.
6. Calculate simple interest.
7. Calculate average of three numbers.
8. Convert days into years, months, and days.

---

# Assignment

Write a Java program that:

- Reads two integers.
- Performs all arithmetic operations.
- Displays:
  - Addition
  - Subtraction
  - Multiplication
  - Division
  - Modulus

---

# Revision Notes

- `+` → Addition
- `-` → Subtraction
- `*` → Multiplication
- `/` → Division (quotient)
- `%` → Remainder
- Integer division removes decimal values.
- Division by zero causes `ArithmeticException` (for integers).
- Use `double` when decimal precision is required.

---

# Key Takeaways

- Arithmetic operators perform mathematical calculations.
- Java supports five arithmetic operators.
- Integer and floating-point division produce different results.
- `%` returns the remainder after division.
- Follow operator precedence for correct calculations.

---

## References

- Oracle Java Documentation
- https://docs.oracle.com/en/java/