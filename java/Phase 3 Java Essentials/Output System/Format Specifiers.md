# Java Format Specifiers

## What are Format Specifiers?

**Format Specifiers** are special symbols used with the `printf()` method to tell Java **how a value should be displayed**.

They always begin with the **% (percent)** symbol.

Example

```java
System.out.printf("Age : %d",20);
```

Output

```
Age : 20
```

Here,

```
%d
```

is the format specifier.

---

# Why Do We Need Format Specifiers?

Without format specifiers, Java prints values normally.

```java
System.out.println(8.912345);
```

Output

```
8.912345
```

Using format specifiers

```java
System.out.printf("%.2f",8.912345);
```

Output

```
8.91
```

They help us:

- Format numbers
- Align text
- Control decimal places
- Create reports
- Improve readability

---

# Real-World Analogy

Imagine filling out a form.

```
Name  : _______

Age   : _______

CGPA  : _______
```

Each blank expects a specific type of information.

Similarly,

```
%d

expects Integer

%s

expects String

%f

expects Decimal Number
```

---

# Definition

A Format Specifier is a placeholder that tells `printf()` how to display a particular value.

---

# General Syntax

```java
System.out.printf("format string", values);
```

Example

```java
System.out.printf("Age : %d",20);
```

---

# Common Format Specifiers

| Specifier | Data Type | Example Output |
|-----------|-----------|----------------|
| `%d` | Integer | 25 |
| `%f` | Floating Point | 8.91 |
| `%.2f` | Floating Point (2 decimals) | 8.91 |
| `%c` | Character | A |
| `%s` | String | Java |
| `%b` | Boolean | true |
| `%n` | New Line | Line Break |
| `%%` | Percent Symbol | % |

---

# 1. %d (Integer)

Used to print integer values.

Example

```java
int age = 20;

System.out.printf("Age : %d",age);
```

Output

```
Age : 20
```

---

# 2. %f (Floating Point)

Used to print decimal numbers.

Example

```java
double cgpa = 8.91;

System.out.printf("%f",cgpa);
```

Output

```
8.910000
```

By default, Java prints **6 digits after the decimal point**.

---

# 3. %.2f (Precision)

Limits decimal places.

Example

```java
double cgpa = 8.912345;

System.out.printf("%.2f",cgpa);
```

Output

```
8.91
```

---

Another Example

```java
System.out.printf("%.3f",8.912345);
```

Output

```
8.912
```

---

# 4. %c (Character)

Used for characters.

Example

```java
char grade='A';

System.out.printf("%c",grade);
```

Output

```
A
```

---

# 5. %s (String)

Used for Strings.

Example

```java
String name="Jyothi";

System.out.printf("%s",name);
```

Output

```
Jyothi
```

---

# 6. %b (Boolean)

Used for boolean values.

Example

```java
boolean placed=true;

System.out.printf("%b",placed);
```

Output

```
true
```

---

# 7. %n (New Line)

Moves output to the next line.

Example

```java
System.out.printf("Java%nCourse");
```

Output

```
Java
Course
```

---

# 8. %% (Percent Symbol)

Prints a percent symbol.

Example

```java
System.out.printf("Success : 95%%");
```

Output

```
Success : 95%
```

---

# Advanced Format Specifiers

## %x (Hexadecimal)

```java
System.out.printf("%x",255);
```

Output

```
ff
```

---

## %o (Octal)

```java
System.out.printf("%o",10);
```

Output

```
12
```

---

## %e (Scientific Notation)

```java
System.out.printf("%e",12345.678);
```

Output

```
1.234568e+04
```

---

# Width Specifiers

### Right Alignment

```java
System.out.printf("%10d",100);
```

Output

```
       100
```

---

### Left Alignment

```java
System.out.printf("%-10d",100);
```

Output

```
100
```

---

# Complete Example

```java
public class FormatSpecifierDemo {

    public static void main(String[] args) {

        String name = "Jyothi";
        int age = 20;
        double cgpa = 8.91234;
        char grade = 'A';
        boolean placed = false;

        System.out.printf("Name    : %s%n", name);
        System.out.printf("Age     : %d%n", age);
        System.out.printf("CGPA    : %.2f%n", cgpa);
        System.out.printf("Grade   : %c%n", grade);
        System.out.printf("Placed  : %b%n", placed);
        System.out.printf("Success : 95%%%n");

    }

}
```

Output

```
Name    : Jyothi
Age     : 20
CGPA    : 8.91
Grade   : A
Placed  : false
Success : 95%
```

---

# Internal Working

Example

```java
System.out.printf("Age : %d",20);
```

Step 1

Read

```
Age : %d
```

↓

Find

```
%d
```

↓

Replace

```
20
```

↓

Display

```
Age : 20
```

---

# Common Mistakes

## Wrong Specifier

Incorrect

```java
System.out.printf("%d","Java");
```

Correct

```java
System.out.printf("%s","Java");
```

---

## Forgetting Arguments

Incorrect

```java
System.out.printf("%d");
```

Compile-time passes, but a runtime exception (`MissingFormatArgumentException`) occurs because `%d` expects a value.

---

## Using %f for int

Prefer

```
%d
```

for integers.

---

# Best Practices

- `%d` → int
- `%f` → float/double
- `%.2f` → two decimal places
- `%s` → String
- `%c` → Character
- `%b` → Boolean
- `%n` → New Line
- `%%` → Percent Symbol

Always choose the correct specifier.

---

# Interview Questions

### Q1

Which specifier prints integers?

Answer

```
%d
```

---

### Q2

Which specifier prints Strings?

Answer

```
%s
```

---

### Q3

How do you print two decimal places?

Answer

```
%.2f
```

---

### Q4

Which specifier prints a percent sign?

Answer

```
%%
```

---

### Q5

Which specifier prints a new line?

Answer

```
%n
```

---

# MCQs

### 1

Which specifier prints a floating-point value?

A. `%d`

B. `%f`

C. `%c`

D. `%b`

**Answer:** B

---

### 2

Which specifier prints a String?

A. `%d`

B. `%s`

C. `%c`

D. `%o`

**Answer:** B

---

### 3

Output

```java
System.out.printf("%.2f",5.678);
```

A.

```
5.67
```

B.

```
5.68
```

C.

```
5.678
```

D.

Error

**Answer:** B

---

### 4

Which specifier prints a percent symbol?

A. `%`

B. `%%`

C. `%p`

D. `%n`

**Answer:** B

---

# Coding Exercises

1. Print your age using `%d`.
2. Print your name using `%s`.
3. Print your CGPA using `%.2f`.
4. Print your grade using `%c`.
5. Print your placement status using `%b`.
6. Print `100% Completed`.

---

# Assignment

Create a formatted student report using all of the following:

- `%s`
- `%d`
- `%.2f`
- `%c`
- `%b`
- `%n`
- `%%`

---

# Revision Notes

- `%d` → Integer
- `%f` → Decimal
- `%.2f` → Two decimal places
- `%c` → Character
- `%s` → String
- `%b` → Boolean
- `%n` → New line
- `%%` → Percent sign

---

# Key Takeaways

- Format Specifiers control how values are displayed.
- They are used with `printf()`.
- Each data type has its own format specifier.
- Width and precision improve output readability.
- Using the correct specifier prevents formatting errors.

---

## References

- Oracle Java Documentation
- https://docs.oracle.com/en/java/