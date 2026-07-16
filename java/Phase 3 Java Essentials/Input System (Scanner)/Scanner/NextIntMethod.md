# Java Scanner nextInt() Method

> **Module 14 – Input System**
>
> **Topic:** Scanner Method - `nextInt()`

---

# History

When Java introduced the **Scanner** class in Java 5, it provided different methods to read different types of input.

Instead of reading everything as text and converting it manually, Scanner introduced methods such as:

- nextInt()
- nextDouble()
- nextFloat()
- nextLong()

This made reading numeric data much easier.

---

# Why Do We Need nextInt()?

Many programs work with numbers.

Examples:

- Student Marks
- Age
- Salary
- Quantity
- Menu Selection
- Banking Amount
- Calculator

Instead of writing

```java
int age = 20;
```

we should ask

```
Enter Age:
```

This makes the program interactive.

---

# Problem Statement

Suppose we are creating a voting application.

Instead of

```java
int age = 18;
```

Every user has a different age.

We should ask

```
Enter Your Age:
```

and store the entered value.

---

# Real-Life Analogy

Imagine entering your age while creating a social media account.

```
Enter Age

↓

21
```

The application stores your age and checks whether you are eligible.

This is exactly how `nextInt()` works.

---

# Daily Applications

`nextInt()` is used in:

- Calculator Applications
- Student Marks
- ATM PIN (numeric)
- Age Verification
- Banking
- Online Forms
- Shopping Quantity

---

# Industry Applications

`nextInt()` is useful whenever integer values are required.

Examples:

- Employee ID
- Product Quantity
- Ticket Count
- Inventory Systems
- Examination Marks

---

# Definition

The **`nextInt()`** method reads an **integer value** entered by the user and stores it as an `int`.

---

# Syntax

```java
int variable = sc.nextInt();
```

Example

```java
int age = sc.nextInt();
```

---

# Internal Working

```
Keyboard

↓

Scanner

↓

nextInt()

↓

Read Integer

↓

Store in int Variable

↓

Process

↓

Output
```

---

# Memory Diagram

User enters

```
25
```

Memory

```
age

↓

25
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

Read Integer

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

        System.out.print("Enter Age: ");

        int age = sc.nextInt();

        System.out.println("Age = " + age);

        sc.close();

    }

}
```

---

### Output

```
Enter Age:

20

Age = 20
```

---

# Example 2

```java
Scanner sc = new Scanner(System.in);

System.out.print("Enter Marks: ");

int marks = sc.nextInt();

System.out.println("Marks = " + marks);
```

Input

```
95
```

Output

```
Marks = 95
```

---

# Dry Run

Input

```
18
```

↓

Scanner reads

```
18
```

↓

Stores in

```java
age
```

↓

Program prints

```
Age = 18
```

---

# What Happens if the User Enters Text?

Program

```java
int age = sc.nextInt();
```

Input

```
Twenty
```

Result

```
InputMismatchException
```

Reason:

`nextInt()` expects an integer, but the user entered text.

---

# Bootcamp Insight 💡

Every Scanner method expects a specific type of input.

```
nextInt()

↓

Integer Only
```

```
nextDouble()

↓

Decimal Number
```

```
next()

↓

One Word
```

```
nextLine()

↓

Entire Line
```

Choosing the correct method is very important.

---

# Best Practices

- Use `nextInt()` only for integer values.
- Validate user input when necessary.
- Close the Scanner after use.
- Use meaningful variable names.

---

# Common Mistakes

## Mistake 1

Entering text instead of an integer.

```
Twenty
```

Produces

```
InputMismatchException
```

---

## Mistake 2

Using `nextInt()` for decimal values.

Incorrect

```java
int price = sc.nextInt();
```

Input

```
99.99
```

Produces an exception.

Correct

```java
double price = sc.nextDouble();
```

---

## Mistake 3

Calling `nextLine()` immediately after `nextInt()`.

Remember to consume the leftover newline.

```java
sc.nextLine();
```

---

# Interview Questions

### Q1

What does `nextInt()` return?

**Answer**

An integer (`int`).

---

### Q2

Which exception occurs if the user enters text instead of an integer?

**Answer**

`InputMismatchException`

---

### Q3

Can `nextInt()` read decimal values?

**Answer**

No.

Use `nextDouble()`.

---

### Q4

What happens after `nextInt()` when `nextLine()` is called?

**Answer**

The leftover newline may cause `nextLine()` to return an empty string.

---

# MCQs

### 1

Which method reads integer input?

A. next()

B. nextLine()

C. nextInt()

D. nextDouble()

**Answer:** C

---

### 2

Which exception occurs if `"ABC"` is entered for `nextInt()`?

A. IOException

B. ArithmeticException

C. InputMismatchException

D. NumberFormatException

**Answer:** C

---

### 3

Which method should be used for decimal values?

A. next()

B. nextInt()

C. nextDouble()

D. nextLine()

**Answer:** C

---

# Coding Exercises

1. Read your age.
2. Read two numbers and print their sum.
3. Read marks of three subjects.
4. Read product quantity.
5. Read employee ID.

---

# Assignment

Write a Java program that asks the user to enter:

- Age
- Marks
- Number of Subjects

Print all the values entered.

---

# Revision Notes

- `nextInt()` reads integer values.
- Returns an `int`.
- Throws `InputMismatchException` for invalid input.
- Cannot read decimal values.
- Use `nextDouble()` for floating-point numbers.
- Be careful when using `nextLine()` after `nextInt()`.

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

Operators

↓

Decision Making

↓

Loops

↓

Arrays
```

---

# Future Topic Connection

Now that you've learned how to read **integer values**, the next step is reading **decimal values** using `nextDouble()`.

You'll also see how Java handles floating-point input and when to choose `nextInt()` versus `nextDouble()` in real-world programs.

---

# Key Takeaways

- `nextInt()` reads integer input.
- It returns an `int`.
- It throws `InputMismatchException` for invalid input.
- It is widely used in calculators, banking, and student management systems.
- It is one of the most frequently used Scanner methods in Java.

---

## References

- Oracle Java Documentation
- https://docs.oracle.com/en/java/