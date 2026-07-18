# Java Math Class - Important Methods

> **Module 15 – Math Class**
>
> **Topic:** Commonly Used Math Methods

---

# Introduction

The `Math` class provides predefined static methods for performing mathematical calculations.

Package:

```java
java.lang
```

No import statement is required.

---

# Method Summary

| Method | Description | Return Type |
|---------|-------------|------------|
| Math.abs(x) | Returns absolute value | int, long, float, double |
| Math.max(a,b) | Returns larger value | Same as arguments |
| Math.min(a,b) | Returns smaller value | Same as arguments |
| Math.pow(a,b) | Returns a raised to power b | double |
| Math.sqrt(x) | Returns square root | double |
| Math.cbrt(x) | Returns cube root | double |
| Math.hypot(x,y) | Returns hypotenuse | double |
| Math.ceil(x) | Rounds upward | double |
| Math.floor(x) | Rounds downward | double |
| Math.round(x) | Returns nearest integer | int/long |
| Math.random() | Returns random number (0.0–1.0) | double |
| Math.PI | Value of π | double |
| Math.E | Euler's constant | double |
| Math.sin(x) | Sine of angle | double |
| Math.cos(x) | Cosine of angle | double |
| Math.tan(x) | Tangent of angle | double |
| Math.log(x) | Natural logarithm | double |
| Math.log10(x) | Base-10 logarithm | double |
| Math.exp(x) | Exponential value | double |
| Math.toRadians(x) | Degrees → Radians | double |
| Math.toDegrees(x) | Radians → Degrees | double |
| Math.signum(x) | Returns sign of number | double |

---

# 1. Math.abs()

## Purpose

Returns the positive (absolute) value of a number.

### Syntax

```java
Math.abs(number);
```

### Example

```java
System.out.println(Math.abs(-25));
System.out.println(Math.abs(25));
```

Output

```
25
25
```

Applications

- Distance calculation
- Banking transactions
- Temperature difference

---

# 2. Math.max()

Returns the larger of two values.

```java
Math.max(a,b);
```

Example

```java
System.out.println(Math.max(10,20));
```

Output

```
20
```

Applications

- Highest marks
- Maximum salary
- Highest temperature

---

# 3. Math.min()

Returns the smaller of two values.

```java
Math.min(a,b);
```

Example

```java
System.out.println(Math.min(10,20));
```

Output

```
10
```

Applications

- Lowest price
- Minimum score
- Smallest element

---

# 4. Math.pow()

Returns x raised to the power y.

```java
Math.pow(base, exponent);
```

Example

```java
System.out.println(Math.pow(2,5));
```

Output

```
32.0
```

Applications

- Compound interest
- Scientific calculations
- Geometry

---

# 5. Math.sqrt()

Returns square root.

```java
Math.sqrt(number);
```

Example

```java
System.out.println(Math.sqrt(144));
```

Output

```
12.0
```

Applications

- Geometry
- Physics
- Distance Formula

---

# 6. Math.cbrt()

Returns cube root.

```java
Math.cbrt(27);
```

Output

```
3.0
```

Applications

- Engineering
- Scientific computing

---

# 7. Math.hypot()

Returns hypotenuse.

Formula

```
√(x²+y²)
```

Example

```java
System.out.println(Math.hypot(3,4));
```

Output

```
5.0
```

Applications

- Pythagorean theorem
- Graphics
- Navigation

---

# 8. Math.ceil()

Rounds upward.

```java
Math.ceil(8.2);
```

Output

```
9.0
```

Applications

- Seat allocation
- Billing
- Page calculation

---

# 9. Math.floor()

Rounds downward.

```java
Math.floor(8.9);
```

Output

```
8.0
```

Applications

- Discounts
- Pagination
- Integer conversion

---

# 10. Math.round()

Rounds to the nearest integer.

```java
Math.round(8.5);
```

Output

```
9
```

Applications

- Marks
- Currency
- Average calculations

---

# 11. Math.random()

Returns a pseudo-random value between 0.0 (inclusive) and 1.0 (exclusive).

```java
Math.random();
```

Example

```java
System.out.println(Math.random());
```

Random integer between 1 and 100

```java
int n=(int)(Math.random()*100)+1;
```

Applications

- OTP generation
- Dice games
- Quiz applications
- Password generation

---

# 12. Math.PI

Returns π.

```java
System.out.println(Math.PI);
```

Output

```
3.141592653589793
```

Applications

- Circle
- Trigonometry
- Engineering

---

# 13. Math.E

Euler's Number

```java
System.out.println(Math.E);
```

Output

```
2.718281828459045
```

Applications

- Machine Learning
- Finance
- Statistics

---

# 14. Trigonometric Methods

```java
Math.sin(x)
Math.cos(x)
Math.tan(x)
```

Applications

- Games
- Robotics
- Graphics
- Physics

---

# 15. Logarithmic Methods

```java
Math.log(x)
Math.log10(x)
```

Applications

- Data Science
- AI
- Scientific Computing

---

# 16. Exponential Method

```java
Math.exp(x)
```

Returns

```
e^x
```

Applications

- AI
- Finance
- Probability

---

# 17. Angle Conversion

Degrees to Radians

```java
Math.toRadians(180);
```

Radians to Degrees

```java
Math.toDegrees(Math.PI);
```

Applications

- Robotics
- Games
- Graphics

---

# 18. Math.signum()

Returns the sign of a number.

```java
Math.signum(-10);
```

Output

```
-1.0
```

Applications

- Physics
- AI
- Vector calculations

---

# Complete Demo Program

```java
public class MathDemo {

    public static void main(String[] args) {

        System.out.println(Math.abs(-20));
        System.out.println(Math.max(10,20));
        System.out.println(Math.min(10,20));
        System.out.println(Math.pow(2,5));
        System.out.println(Math.sqrt(144));
        System.out.println(Math.cbrt(27));
        System.out.println(Math.hypot(3,4));
        System.out.println(Math.ceil(5.2));
        System.out.println(Math.floor(5.8));
        System.out.println(Math.round(5.5));
        System.out.println(Math.random());
        System.out.println(Math.PI);
        System.out.println(Math.E);

    }

}
```

---

# Interview Questions

1. Why are Math methods static?
2. Which package contains the Math class?
3. Difference between ceil(), floor(), and round()?
4. Difference between pow() and multiplication?
5. How does Math.random() work?
6. What is the return type of sqrt()?
7. Difference between PI and E?
8. What does hypot() calculate?

---

# Common Mistakes

- Using `Math.pow(x,2)` instead of `x*x` for simple squaring in performance-critical code.
- Forgetting that `Math.random()` returns a `double`.
- Assuming `ceil()`, `floor()`, and `round()` behave the same.
- Ignoring return types (`double`, `long`, etc.).

---

# Revision Table

| Method | Purpose |
|---------|---------|
| abs() | Absolute value |
| max() | Maximum |
| min() | Minimum |
| pow() | Power |
| sqrt() | Square root |
| cbrt() | Cube root |
| hypot() | Hypotenuse |
| ceil() | Round up |
| floor() | Round down |
| round() | Nearest integer |
| random() | Random number |
| PI | π constant |
| E | Euler's constant |

---

# Key Takeaways

- The `Math` class belongs to `java.lang`.
- All methods are **static**.
- No object creation is required.
- Most methods return `double`, so pay attention to return types.
- These methods are frequently used in coding interviews, DSA, competitive programming, AI/ML, graphics, and backend development.

---

## References

- Oracle Java SE Documentation
- Java API Documentation