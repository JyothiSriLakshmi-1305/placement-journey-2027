# Module 15 Revision - Java Math Class

> **Module 15 – Math Class**
>
> **Quick Revision Guide**

---

# Module Overview

The `Math` class is a predefined utility class in Java that provides static methods for performing mathematical calculations.

Package:

```java
java.lang
```

No import statement is required.

---

# Why Math Class?

Java introduced the `Math` class to:

- Reduce code duplication
- Provide optimized mathematical algorithms
- Improve readability
- Save development time
- Avoid writing complex calculations manually

---

# Why are all Math methods Static?

The methods in the Math class:

- Don't depend on object data
- Always produce the same result for the same input
- Don't require object creation

Example:

```java
Math.sqrt(25);
Math.max(10,20);
Math.random();
```

---

# Most Important Methods

| Method | Purpose |
|---------|----------|
| abs() | Absolute value |
| max() | Maximum value |
| min() | Minimum value |
| pow() | Power |
| sqrt() | Square root |
| cbrt() | Cube root |
| hypot() | Hypotenuse |
| ceil() | Round upward |
| floor() | Round downward |
| round() | Nearest integer |
| random() | Random number |
| PI | Circle calculations |
| E | Exponential calculations |

---

# Return Types

| Method | Return Type |
|----------|-------------|
| abs() | Same as argument |
| max() | Same as argument |
| min() | Same as argument |
| pow() | double |
| sqrt() | double |
| cbrt() | double |
| hypot() | double |
| ceil() | double |
| floor() | double |
| round() | int / long |
| random() | double |

---

# Rounding Methods

| Input | ceil() | floor() | round() |
|-------|---------|----------|----------|
| 5.2 | 6.0 | 5.0 | 5 |
| 5.5 | 6.0 | 5.0 | 6 |
| 5.8 | 6.0 | 5.0 | 6 |
| -5.2 | -5.0 | -6.0 | -5 |

Remember:

```
ceil()

↓

Up

floor()

↓

Down

round()

↓

Nearest Integer
```

---

# Frequently Used Methods

### Maximum

```java
Math.max(a,b);
```

---

### Minimum

```java
Math.min(a,b);
```

---

### Absolute Value

```java
Math.abs(x);
```

---

### Power

```java
Math.pow(a,b);
```

---

### Square Root

```java
Math.sqrt(x);
```

---

### Random Number

```java
Math.random();
```

Random integer from 1 to 100

```java
int n=(int)(Math.random()*100)+1;
```

---

# Mathematical Constants

```java
Math.PI
```

```
3.141592653589793
```

---

```java
Math.E
```

```
2.718281828459045
```

---

# Utility Class

The Math class is a **utility class**.

Characteristics:

- Static methods
- No objects
- Reusable methods

Examples of utility classes:

- Math
- Arrays
- Collections
- Objects

---

# Common Applications

- Calculator
- Banking
- AI
- Machine Learning
- Data Science
- Robotics
- Game Development
- Computer Graphics
- Competitive Programming
- Spring Boot

---

# Best Practices

✅ Use built-in Math methods whenever possible.

✅ Use multiplication (`x * x`) instead of `Math.pow(x,2)` for simple squaring.

✅ Pay attention to return types.

✅ Use descriptive method names instead of custom algorithms.

---

# Common Mistakes

❌ Creating a Math object

```java
Math m = new Math();
```

---

❌ Forgetting that `Math.random()` returns a double.

---

❌ Confusing:

- ceil()
- floor()
- round()

---

❌ Ignoring return types.

---

# Interview Revision

### Q1

Which package contains the Math class?

```
java.lang
```

---

### Q2

Do we import Math?

```
No
```

---

### Q3

Can we create a Math object?

```
No
```

---

### Q4

Why are Math methods static?

```
They don't depend on object data.
```

---

### Q5

Difference between:

- ceil()
- floor()
- round()

Must know.

---

### Q6

Difference between:

```
Math.random()

Random Class
```

Must know.

---

# One-Line Revision

```
abs()

↓

Positive Value

max()

↓

Largest Value

min()

↓

Smallest Value

pow()

↓

Exponent

sqrt()

↓

Square Root

cbrt()

↓

Cube Root

hypot()

↓

Hypotenuse

ceil()

↓

Round Up

floor()

↓

Round Down

round()

↓

Nearest Integer

random()

↓

Random Number

PI

↓

Circle

E

↓

Exponential
```

---

# Memory Tricks

## Rounding

```
ceil

↓

Ceiling

↓

Go Up
```

---

```
floor

↓

Floor

↓

Go Down
```

---

```
round

↓

Nearest
```

---

## Maximum

```
max

↓

Highest
```

---

## Minimum

```
min

↓

Lowest
```

---

## Absolute

```
abs

↓

Always Positive
```

---

# Complete Learning Flow

```
Math Class

      │
      ▼

Why Math?

      │
      ▼

Static Methods

      │
      ▼

Mathematical Methods

      │
      ▼

Comparison

      │
      ▼

Revision

      │
      ▼

Interview Questions

      │
      ▼

MCQs

      │
      ▼

Coding Exercises

      │
      ▼

Assignment
```

---

# Quick Cheat Sheet

| Method | Remember |
|---------|----------|
| abs() | Positive |
| max() | Highest |
| min() | Lowest |
| pow() | Power |
| sqrt() | Square Root |
| ceil() | Up |
| floor() | Down |
| round() | Nearest |
| random() | Random |
| PI | Circle |
| E | Exponential |

---

# Bootcamp Insight 💡

Don't try to memorize every method by heart.

Instead, remember **the problem each method solves**.

When you face a coding problem, ask yourself:

> "Which Math method makes this solution simpler?"

This habit will help you write cleaner, more professional Java code.

---

# Key Takeaways

- `Math` belongs to `java.lang`.
- No import is required.
- All methods are static.
- No object creation is needed.
- Learn the differences between similar methods.
- Understand return types.
- Practice using these methods in coding problems.

---

## References

- Oracle Java Documentation
- Java SE API Documentation