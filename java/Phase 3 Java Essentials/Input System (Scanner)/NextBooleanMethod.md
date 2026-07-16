# Java Scanner nextBoolean() Method

> **Module 14 – Input System**
>
> **Topic:** Scanner Method - `nextBoolean()`

---

# History

When Java introduced the Scanner class in Java 5, it included methods to read different primitive data types directly.

One of these methods is **nextBoolean()**, which reads boolean values (`true` or `false`) from the user.

This eliminated the need to manually compare strings such as `"true"` and `"false"`.

---

# Why Do We Need nextBoolean()?

Many real-world applications require simple Yes/No or True/False decisions.

Examples:

- Is the user logged in?
- Payment Successful?
- Student Placed?
- User Eligible?
- Account Active?

Instead of writing

```java
boolean placed = true;
```

we can ask the user

```
Are you placed?

true
```

This makes the application dynamic.

---

# Problem Statement

Suppose we are developing a placement portal.

Instead of fixing

```java
boolean placed = false;
```

every student has a different placement status.

The program should accept the value from the user.

---

# Real-Life Analogy

Think about an online application.

```
Do you agree to the Terms & Conditions?

true
```

or

```
false
```

The application stores your response as a boolean value.

---

# Daily Applications

Used in:

- Login Status
- Payment Success
- Student Placement
- Attendance
- User Verification
- Account Activation

---

# Industry Applications

Commonly used in:

- Authentication Systems
- Banking Software
- E-Commerce Applications
- Hospital Management Systems
- HR Management Systems

---

# Definition

The **nextBoolean()** method reads a **boolean value** entered by the user and stores it in a boolean variable.

Valid inputs are:

```
true
false
```

(Java accepts uppercase or lowercase variations such as `TRUE` and `False`.)

---

# Syntax

```java
boolean variable = sc.nextBoolean();
```

Example

```java
boolean placed = sc.nextBoolean();
```

---

# Internal Working

```
Keyboard

↓

Scanner

↓

nextBoolean()

↓

Read true/false

↓

Store in boolean Variable

↓

Processing

↓

Output
```

---

# Memory Diagram

User enters

```
true
```

Memory

```
placed

↓

true
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

Read Boolean

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

# Example Program

```java
import java.util.Scanner;

public class BooleanDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Are you placed? (true/false): ");

        boolean placed = sc.nextBoolean();

        System.out.println("Placement Status: " + placed);

        sc.close();
    }
}
```

---

## Output

```
Are you placed? (true/false):

true

Placement Status: true
```

---

# Dry Run

Input

```
false
```

↓

Scanner reads

```
false
```

↓

Stores in

```java
placed
```

↓

Program prints

```
Placement Status: false
```

---

# What Happens if the User Enters Other Values?

Program

```java
boolean placed = sc.nextBoolean();
```

Input

```
yes
```

Result

```
InputMismatchException
```

Reason:

`nextBoolean()` only accepts

```
true
false
```

---

# When NOT to Use nextBoolean()

Do **not** use `nextBoolean()` if users are expected to type:

```
Yes
No
Y
N
1
0
```

In such cases, read the input using:

```java
String answer = sc.next();
```

and process it manually.

---

# 💡 Bootcamp Insight

Many beginners think

```
Yes

=

true
```

Not in Java.

Scanner only understands

```
true

or

false
```

Anything else results in an exception.

---

# Best Practices

- Use meaningful variable names.
- Clearly tell users to enter `true` or `false`.
- Validate user input when necessary.
- Close the Scanner after use.

---

# Common Mistakes

## Mistake 1

Input

```
Yes
```

Produces

```
InputMismatchException
```

---

## Mistake 2

Using String instead of boolean when only true/false is needed.

Prefer

```java
boolean active = sc.nextBoolean();
```

instead of

```java
String active = sc.next();
```

when appropriate.

---

# Interview Questions

### Q1

What values does `nextBoolean()` accept?

**Answer**

Only `true` or `false`.

---

### Q2

Which data type stores the result?

**Answer**

`boolean`

---

### Q3

What happens if the user enters `"Yes"`?

**Answer**

`InputMismatchException`

---

### Q4

When should you use `nextBoolean()`?

**Answer**

When the input represents a true/false decision.

---

# MCQs

### 1

Which Scanner method reads boolean values?

A. next()

B. nextLine()

C. nextBoolean()

D. nextInt()

**Answer:** C

---

### 2

Which input is valid for `nextBoolean()`?

A. Yes

B. No

C. true

D. 1

**Answer:** C

---

### 3

Which exception occurs for invalid boolean input?

A. IOException

B. ArithmeticException

C. InputMismatchException

D. NumberFormatException

**Answer:** C

---

# Coding Exercises

1. Read placement status.
2. Read login status.
3. Read payment success.
4. Read account active status.
5. Print different messages based on the boolean value.

---

# Assignment

Write a Java program that asks the user:

- Are you eligible? (`true/false`)
- Are you placed? (`true/false`)

Display both values.

---

# Revision Notes

- `nextBoolean()` reads boolean values.
- Returns a `boolean`.
- Accepts only `true` or `false`.
- Invalid input causes `InputMismatchException`.
- Useful for yes/no type decisions represented as boolean values.

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

Now that you've learned how to read **String**, **integer**, **decimal**, and **boolean** values, the next step is reading a **single character**.

Interestingly, Scanner **does not provide a `nextChar()` method**.

We'll learn the standard Java technique to read a character using:

```java
sc.next().charAt(0);
```

This is another common interview question.

---

# Key Takeaways

- `nextBoolean()` reads boolean input.
- Accepts only `true` or `false`.
- Returns a `boolean`.
- Invalid values throw `InputMismatchException`.
- Commonly used for login, eligibility, and status checks.

---

## References

- Oracle Java Documentation
- https://docs.oracle.com/en/java/