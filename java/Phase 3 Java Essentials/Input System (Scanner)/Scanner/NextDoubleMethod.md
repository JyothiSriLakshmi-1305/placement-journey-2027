# Java Scanner nextDouble() Method

> **Module 14 – Input System**
>
> **Topic:** Scanner Method - `nextDouble()`

---

# History

When the Scanner class was introduced in Java 5, it included methods for reading different data types.

While `nextInt()` reads integer values, Java introduced **`nextDouble()`** to read decimal (floating-point) numbers directly without manual conversion.

This made programs involving calculations much simpler.

---

# Why Do We Need nextDouble()?

Many real-world applications use decimal values instead of whole numbers.

Examples:

- CGPA
- Product Price
- Height
- Weight
- Salary
- Temperature
- Interest Rate

Instead of writing

```java
double cgpa = 8.75;
```

we should ask the user:

```
Enter Your CGPA:
```

This makes the program flexible and interactive.

---

# Problem Statement

Suppose we are creating a student portal.

Instead of fixing the CGPA:

```java
double cgpa = 8.5;
```

Every student has a different CGPA.

We should read it from the user using `nextDouble()`.

---

# Real-Life Analogy

Think about an online shopping website.

```
Enter Product Price:

499.99
```

The application stores the exact decimal value.

This is where `nextDouble()` is used.

---

# Daily Applications

`nextDouble()` is used in:

- Student CGPA
- Product Price
- Temperature
- Height & Weight
- Scientific Calculations
- Banking Interest
- Currency Conversion

---

# Industry Applications

Commonly used in:

- Banking Systems
- E-Commerce Applications
- Financial Software
- Medical Systems
- Engineering Calculations
- Data Analysis

---

# Definition

The **`nextDouble()`** method reads a **decimal (floating-point) number** entered by the user and stores it as a `double`.

---

# Syntax

```java
double variable = sc.nextDouble();
```

Example

```java
double cgpa = sc.nextDouble();
```

---

# Internal Working

```
Keyboard

↓

Scanner

↓

nextDouble()

↓

Read Decimal Number

↓

Store in double Variable

↓

Process

↓

Output
```

---

# Memory Diagram

User enters

```
8.75
```

Memory

```
cgpa

↓

8.75
```

---

# Flow Diagram

```
Start

↓

Create Scanner

↓

Ask User

↓

Read Decimal Value

↓

Store in Variable

↓

Process

↓

Display Output

↓

End
```

---

# Example 1

```java
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter CGPA: ");

        double cgpa = sc.nextDouble();

        System.out.println("CGPA = " + cgpa);

        sc.close();

    }

}
```

---

## Output

```
Enter CGPA:

8.91

CGPA = 8.91
```

---

# Example 2

```java
Scanner sc = new Scanner(System.in);

System.out.print("Enter Product Price: ");

double price = sc.nextDouble();

System.out.println("Price = ₹" + price);
```

Input

```
499.99
```

Output

```
Price = ₹499.99
```

---

# Dry Run

Input

```
72.5
```

↓

Scanner reads

```
72.5
```

↓

Stores in

```java
weight
```

↓

Program prints

```
Weight = 72.5
```

---

# What Happens if the User Enters Text?

Program

```java
double value = sc.nextDouble();
```

Input

```
Hello
```

Result

```
InputMismatchException
```

Reason:

`nextDouble()` expects a decimal number.

---

# Bootcamp Insight 💡

A `double` can also store whole numbers.

Example

```java
double value = sc.nextDouble();
```

Input

```
25
```

Output

```
25.0
```

Java automatically converts the integer to a `double`.

---

# nextInt() vs nextDouble()

| nextInt() | nextDouble() |
|------------|--------------|
| Reads integers | Reads decimal numbers |
| Returns `int` | Returns `double` |
| Example: 25 | Example: 25.75 |

---

# Best Practices

- Use `nextDouble()` for decimal values.
- Use meaningful variable names.
- Validate user input.
- Close the Scanner after use.

---

# Common Mistakes

## Mistake 1

Using `nextInt()` for decimal input.

Incorrect

```java
int price = sc.nextInt();
```

Input

```
99.99
```

Result

```
InputMismatchException
```

Correct

```java
double price = sc.nextDouble();
```

---

## Mistake 2

Entering text instead of a decimal number.

Input

```
Java
```

Result

```
InputMismatchException
```

---

# Interview Questions

### Q1

What does `nextDouble()` return?

**Answer**

A `double` value.

---

### Q2

Can `nextDouble()` read integer values?

**Answer**

Yes. Java converts them to `double`.

---

### Q3

Which exception occurs if text is entered?

**Answer**

`InputMismatchException`

---

### Q4

When should you use `nextDouble()` instead of `nextInt()`?

**Answer**

When reading decimal values such as price, CGPA, height, or weight.

---

# MCQs

### 1

Which method reads decimal values?

A. next()

B. nextInt()

C. nextDouble()

D. nextLine()

**Answer:** C

---

### 2

Which data type stores the result of `nextDouble()`?

A. int

B. float

C. double

D. long

**Answer:** C

---

### 3

Which exception occurs if `"ABC"` is entered?

A. IOException

B. InputMismatchException

C. ArithmeticException

D. NumberFormatException

**Answer:** B

---

# Coding Exercises

1. Read your CGPA.
2. Read product price.
3. Read temperature.
4. Read height and weight.
5. Read bank interest rate.

---

# Assignment

Write a Java program that asks the user to enter:

- CGPA
- Height
- Weight
- Product Price

Display all the entered values.

---

# Revision Notes

- `nextDouble()` reads decimal values.
- Returns a `double`.
- Accepts both integer and decimal input.
- Throws `InputMismatchException` for invalid input.
- Used in financial, scientific, and academic applications.

---

# 💡 Bootcamp Insight

Remember this simple rule:

```
Whole Number

↓

nextInt()

Decimal Number

↓

nextDouble()
```

Choosing the correct Scanner method prevents runtime errors.

---

# Connection Map

```
Scanner Class

↓

next()

↓

nextLine()

↓

nextInt()

↓

nextDouble()

↓

nextBoolean()

↓

Character Input
```

---

# Future Topic Connection

Now that you've learned how to read **integer** and **decimal** values, the next step is reading **boolean values** using `nextBoolean()`.

This is useful for applications that require **true/false** decisions, such as login status, payment success, eligibility checks, and feature flags.

---

# Key Takeaways

- `nextDouble()` reads decimal input.
- Returns a `double`.
- Accepts integer and decimal values.
- Throws `InputMismatchException` for invalid input.
- Commonly used for prices, CGPA, and scientific calculations.

---

## References

- Oracle Java Documentation
- https://docs.oracle.com/en/java/