# Java Math Class - Coding Exercises

> **Module 15 – Math Class**
>
> **Hands-on Programming Practice**

---

# Instructions

- Solve the exercises in order.
- Try solving them yourself before looking at the solution.
- Use the `Math` class wherever appropriate.
- Test your program with multiple inputs.

---

# Level 1 - Beginner

## Exercise 1: Absolute Value

### Problem

Read an integer and print its absolute value.

### Example

Input

```
-25
```

Output

```
25
```

---

## Exercise 2: Maximum of Two Numbers

Read two integers and print the larger one using `Math.max()`.

---

## Exercise 3: Minimum of Two Numbers

Read two integers and print the smaller one using `Math.min()`.

---

## Exercise 4: Square Root

Read a positive number and print its square root.

Example

```
Input : 81
Output: 9.0
```

---

## Exercise 5: Cube Root

Read a number and print its cube root.

---

# Level 2 - Easy

## Exercise 6: Power Calculation

Read base and exponent.

Print:

```
base^exponent
```

Example

```
Input

2
5

Output

32.0
```

---

## Exercise 7: Hypotenuse

Read the lengths of two sides of a right triangle.

Calculate the hypotenuse using:

```java
Math.hypot()
```

---

## Exercise 8: Area of Circle

Read the radius.

Calculate:

```
Area = πr²
```

Use:

```java
Math.PI
```

---

## Exercise 9: Circumference of Circle

Formula

```
2πr
```

---

## Exercise 10: Round a Decimal Number

Read a decimal value.

Print:

- ceil()
- floor()
- round()

Example

```
Input

8.6

Output

Ceil  : 9.0
Floor : 8.0
Round : 9
```

---

# Level 3 - Intermediate

## Exercise 11: Random Number Generator

Generate a random number between:

```
1 to 100
```

Hint

```java
(int)(Math.random()*100)+1
```

---

## Exercise 12: Dice Simulator

Generate numbers between:

```
1 to 6
```

---

## Exercise 13: Coin Toss

Generate

```
Heads

or

Tails
```

Hint

Generate either:

```
0

or

1
```

---

## Exercise 14: OTP Generator

Generate a 6-digit OTP.

Example

```
482195
```

---

## Exercise 15: Distance Formula

Read coordinates:

```
(x1,y1)

(x2,y2)
```

Calculate the distance using the distance formula.

Hint

Use:

```java
Math.sqrt()
Math.pow()
```

---

# Level 4 - Placement Level

## Exercise 16: Largest of Three Numbers

Use nested `Math.max()`.

Example

```java
Math.max(a, Math.max(b, c))
```

---

## Exercise 17: Smallest of Three Numbers

Use nested `Math.min()`.

---

## Exercise 18: Compound Interest

Formula

```
A=P(1+r/n)^(nt)
```

Use:

```java
Math.pow()
```

---

## Exercise 19: BMI Calculator

Formula

```
BMI = weight / height²
```

Use

```java
Math.pow(height,2)
```

Display the BMI rounded to two decimal places.

---

## Exercise 20: Temperature Difference

Read two temperatures.

Print their absolute difference using:

```java
Math.abs()
```

---

# Level 5 - Challenge Problems

## Exercise 21: Random Password Generator

Generate an 8-character password using random letters and digits.

---

## Exercise 22: Lottery Number Generator

Generate:

```
6 unique random numbers

between

1 and 49
```

---

## Exercise 23: Scientific Calculator

Create a menu-driven calculator supporting:

- Square Root
- Cube Root
- Power
- Absolute Value
- Maximum
- Minimum

---

## Exercise 24: Geometry Calculator

Menu

```
1 Circle

2 Square

3 Rectangle

4 Triangle
```

Calculate areas using the appropriate `Math` methods.

---

## Exercise 25: Mini Math Toolkit

Create a program that asks the user to choose:

```
1 Absolute Value

2 Maximum

3 Minimum

4 Square Root

5 Cube Root

6 Power

7 Random Number

8 Round Number
```

Perform the selected operation and display the result.

---

# Bonus Challenges

⭐ Random OTP Generator

⭐ Lottery Ticket Generator

⭐ Dice Game

⭐ Rock-Paper-Scissors (Random Choice)

⭐ Number Guessing Game

⭐ Scientific Calculator

⭐ Banking Interest Calculator

⭐ Distance Between Two Cities

⭐ Circle Calculator

⭐ Geometry Toolkit

---

# Mini Project Ideas

## Project 1

**Scientific Calculator**

Features:

- Square Root
- Cube Root
- Power
- Absolute
- Maximum
- Minimum
- Rounding
- Random Number

---

## Project 2

**Geometry Calculator**

Calculate:

- Circle Area
- Circumference
- Square Area
- Rectangle Area
- Triangle Area

---

## Project 3

**OTP Generator**

Generate secure-looking random OTPs for practice.

---

## Project 4

**Math Utility App**

A menu-driven Java application that combines all the important `Math` class methods into a single program.

---

# Practice Checklist

| Exercise | Status |
|----------|--------|
| Absolute Value | ☐ |
| Maximum | ☐ |
| Minimum | ☐ |
| Square Root | ☐ |
| Cube Root | ☐ |
| Power | ☐ |
| Hypotenuse | ☐ |
| Circle Area | ☐ |
| Circle Circumference | ☐ |
| Rounding | ☐ |
| Random Number | ☐ |
| Dice Simulator | ☐ |
| Coin Toss | ☐ |
| OTP Generator | ☐ |
| Distance Formula | ☐ |
| Largest of Three | ☐ |
| Smallest of Three | ☐ |
| Compound Interest | ☐ |
| BMI Calculator | ☐ |
| Temperature Difference | ☐ |
| Random Password | ☐ |
| Lottery Generator | ☐ |
| Scientific Calculator | ☐ |
| Geometry Calculator | ☐ |
| Mini Math Toolkit | ☐ |

---

# Bootcamp Insight 💡

Learning the syntax of `Math` methods is only the first step. The real skill comes from recognizing **which method fits a problem**. These exercises are designed to build that habit and prepare you for coding interviews and real-world Java development.

---

# Key Takeaways

- Practice each method with multiple inputs.
- Start with simple programs and gradually tackle challenge problems.
- Focus on writing clean, readable, and reusable code.
- Many of these exercises mirror common placement coding tasks.

---

## References

- Oracle Java Documentation
- Java SE API Documentation