# Java Parsing Methods

> **Module 14 – Input System**
>
> **Topic:** Parsing Methods (`parseInt()`, `parseDouble()`, `parseFloat()`, `parseLong()`, `parseBoolean()`)

---

# History

Before Java introduced modern frameworks and APIs, most user input came directly from the keyboard.

Today, data often comes from:

- HTML Forms
- JSON
- XML
- Text Files
- Databases
- REST APIs

Most of this data is received as **Strings**.

To use this data for calculations or logical operations, Java must convert Strings into primitive data types.

This conversion process is called **Parsing**.

---

# Why Do We Need Parsing?

Imagine a shopping website.

A user enters:

```
Quantity

5
```

The application receives

```java
"5"
```

Notice that this is **not an integer**.

It is a **String**.

If we want to perform calculations, we must convert it into an integer.

That's where parsing comes in.

---

# Problem Statement

Suppose we receive the following data from a web form:

```java
String age = "21";
```

Can we write

```java
age + 5
```

No.

Because `age` is a String.

Instead we convert it.

```java
int num = Integer.parseInt(age);
```

Now calculations are possible.

---

# Real-Life Analogy

Imagine receiving money in a foreign currency.

Before spending it, you convert it into your local currency.

Similarly,

```
String

↓

Parsing

↓

Primitive Data Type
```

Java converts one representation into another.

---

# Daily Applications

Parsing is used in:

- Calculator Apps
- Student Portals
- Banking Applications
- Login Forms
- Shopping Websites
- Mobile Apps

---

# Industry Applications

Parsing is used everywhere.

Examples:

- Spring Boot APIs
- JSON Data
- CSV Files
- Configuration Files
- Database Records
- File Handling
- REST Services

If you become a Java Backend Developer, you'll use parsing almost every day.

---

# Definition

**Parsing** is the process of converting a **String** into another data type such as:

- int
- double
- float
- long
- boolean

---

# Java Philosophy

Why doesn't Java automatically convert every String?

Because

```
"ABC"
```

cannot become

```
123
```

Automatic conversion would produce incorrect results.

Therefore Java asks the programmer to explicitly convert Strings.

---

# Internal Working

```
String

↓

Parsing Method

↓

Primitive Value

↓

Processing

↓

Output
```

---

# Flow Diagram

```
User Input

↓

String

↓

parseXXX()

↓

Primitive Data Type

↓

Calculation

↓

Output
```

---

# Memory Diagram

Before Parsing

```
age

↓

"20"
```

After Parsing

```
age

↓

20
```

(Data type changes from String to int.)

---

# Types of Parsing Methods

| Method | Converts To |
|---------|-------------|
| Integer.parseInt() | int |
| Double.parseDouble() | double |
| Float.parseFloat() | float |
| Long.parseLong() | long |
| Boolean.parseBoolean() | boolean |

---

# Integer.parseInt()

## Syntax

```java
int age = Integer.parseInt("20");
```

Output

```
20
```

---

# Double.parseDouble()

## Syntax

```java
double cgpa = Double.parseDouble("8.91");
```

Output

```
8.91
```

---

# Float.parseFloat()

## Syntax

```java
float temp = Float.parseFloat("25.5");
```

Output

```
25.5
```

---

# Long.parseLong()

## Syntax

```java
long population = Long.parseLong("1450000000");
```

Output

```
1450000000
```

---

# Boolean.parseBoolean()

## Syntax

```java
boolean status = Boolean.parseBoolean("true");
```

Output

```
true
```

---

# Complete Example

```java
public class ParsingDemo {

    public static void main(String[] args) {

        String age = "20";
        String cgpa = "8.91";
        String active = "true";

        int a = Integer.parseInt(age);
        double c = Double.parseDouble(cgpa);
        boolean b = Boolean.parseBoolean(active);

        System.out.println(a);
        System.out.println(c);
        System.out.println(b);

    }

}
```

---

# Output

```
20
8.91
true
```

---

# Dry Run

Input

```
"50"
```

↓

String

↓

Integer.parseInt()

↓

50

↓

Stored in int variable

↓

Used in calculations

---

# What Happens if Parsing Fails?

Example

```java
Integer.parseInt("Java");
```

Result

```
NumberFormatException
```

Reason

```
Java
```

is not a valid number.

---

# Bootcamp Insight 💡

Remember

```
Scanner

↓

Reads Data

↓

Parsing

↓

Converts String

↓

Processing
```

These are different concepts.

Scanner **accepts input**.

Parsing **converts data**.

---

# Best Practices

- Validate input before parsing.
- Use try-catch when parsing user input.
- Choose the correct parsing method.
- Avoid unnecessary conversions.

---

# Common Mistakes

## Mistake 1

```java
Integer.parseInt("ABC");
```

Result

```
NumberFormatException
```

---

## Mistake 2

Using

```java
parseInt()
```

for decimal values.

Incorrect

```java
Integer.parseInt("8.5");
```

Correct

```java
Double.parseDouble("8.5");
```

---

# Interview Questions

### Q1

What is parsing?

**Answer**

Converting a String into another data type.

---

### Q2

Which method converts String into int?

**Answer**

```java
Integer.parseInt()
```

---

### Q3

Which exception occurs if parsing fails?

**Answer**

```
NumberFormatException
```

---

### Q4

What is the difference between Scanner and Parsing?

**Answer**

Scanner reads input.

Parsing converts String data into primitive data types.

---

# MCQs

### 1

Which method converts `"100"` into an integer?

A. parseInteger()

B. Integer.parseInt()

C. parse()

D. Integer.convert()

**Answer:** B

---

### 2

Which exception occurs for

```java
Integer.parseInt("ABC");
```

A. IOException

B. InputMismatchException

C. NumberFormatException

D. ArithmeticException

**Answer:** C

---

### 3

Which method converts `"8.91"` into a double?

A. parseFloat()

B. parseDouble()

C. parseInt()

D. parseLong()

**Answer:** B

---

# Coding Exercises

1. Convert `"100"` into int.
2. Convert `"8.5"` into double.
3. Convert `"true"` into boolean.
4. Convert `"500000"` into long.
5. Print all converted values.

---

# Assignment

Create a program that stores the following as Strings:

```
Age = "21"
CGPA = "8.75"
Placed = "true"
```

Convert them into their respective primitive data types and display the values.

---

# Revision Notes

- Parsing converts String into primitive data types.
- Integer.parseInt() → int
- Double.parseDouble() → double
- Float.parseFloat() → float
- Long.parseLong() → long
- Boolean.parseBoolean() → boolean
- Invalid numeric Strings cause NumberFormatException.

---

# Connection Map

```
Scanner

↓

String Input

↓

Parsing

↓

Primitive Data Types

↓

Operators

↓

Decision Making

↓

Loops
```

---

# Future Topic Connection

Now that you've learned how to convert Strings into primitive data types, the next step is learning **BufferedReader**.

Unlike Scanner, BufferedReader reads input as **String data**, so parsing becomes essential when you want to convert that input into integers, doubles, or other primitive types.

You'll see why BufferedReader is faster than Scanner and why parsing is commonly used with it.

---

# Key Takeaways

- Parsing converts Strings into primitive data types.
- Use the correct parsing method for each data type.
- Invalid numeric input throws `NumberFormatException`.
- Parsing is heavily used in Spring Boot, REST APIs, JSON, and file handling.
- Scanner reads input; parsing converts data.

---

## References

- Oracle Java Documentation
- https://docs.oracle.com/en/java/