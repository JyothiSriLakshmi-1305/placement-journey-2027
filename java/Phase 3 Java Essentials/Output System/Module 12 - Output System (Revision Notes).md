# Module 12 - Output System (Revision Notes)

## Overview

The Output System in Java is used to display information on the console.

Java provides three main output methods:

- print()
- println()
- printf()

---

# Java Output System

```
System

↓

out

↓

PrintStream

↓

print()
println()
printf()
```

---

# print()

## Definition

Prints output on the console **without moving the cursor to the next line**.

## Syntax

```java
System.out.print(value);
```

## Example

```java
System.out.print("Java");
System.out.print("Course");
```

Output

```
JavaCourse
```

---

# println()

## Definition

Prints output and automatically moves the cursor to the next line.

## Syntax

```java
System.out.println(value);
```

## Example

```java
System.out.println("Java");
System.out.println("Course");
```

Output

```
Java
Course
```

---

# Difference Between print() and println()

| print() | println() |
|----------|------------|
| Same line | New line |
| No newline | Adds newline automatically |

---

# printf()

## Definition

Prints formatted output using format specifiers.

## Syntax

```java
System.out.printf("format", values);
```

Example

```java
System.out.printf("Age : %d",20);
```

Output

```
Age : 20
```

---

# Common Format Specifiers

| Specifier | Purpose |
|-----------|----------|
| `%d` | Integer |
| `%f` | Floating-point |
| `%.2f` | Two decimal places |
| `%c` | Character |
| `%s` | String |
| `%b` | Boolean |
| `%n` | New line |
| `%%` | Percent sign |

---

# Examples

### Integer

```java
System.out.printf("%d",100);
```

Output

```
100
```

---

### Floating Point

```java
System.out.printf("%.2f",8.916);
```

Output

```
8.92
```

---

### Character

```java
System.out.printf("%c",'A');
```

Output

```
A
```

---

### String

```java
System.out.printf("%s","Java");
```

Output

```
Java
```

---

### Boolean

```java
System.out.printf("%b",true);
```

Output

```
true
```

---

# Width Formatting

Right Alignment

```java
System.out.printf("%10d",100);
```

Output

```
       100
```

---

Left Alignment

```java
System.out.printf("%-10d",100);
```

Output

```
100
```

---

# Decimal Precision

```java
System.out.printf("%.3f",8.912345);
```

Output

```
8.912
```

---

# Formatting Output

Formatting improves:

- Readability
- Alignment
- Professional appearance

Example

```
Name    : Jyothi
Age     : 20
CGPA    : 8.91
```

---

# Common Output Mistakes

## Wrong

```java
System.out.printf("%d","Java");
```

Correct

```java
System.out.printf("%s","Java");
```

---

## Wrong

```java
System.out.printf("Age : %d");
```

Correct

```java
System.out.printf("Age : %d",20);
```

---

## Wrong

```java
System.out.print("Hello");
System.out.print("World");
```

Output

```
HelloWorld
```

Correct

```java
System.out.print("Hello ");
System.out.print("World");
```

Output

```
Hello World
```

---

## Wrong

```java
System.out.printf("100%");
```

Better

```java
System.out.printf("100%%");
```

Output

```
100%
```

---

# Exceptions

| Mistake | Exception |
|----------|-----------|
| Wrong format specifier | IllegalFormatConversionException |
| Missing printf() argument | MissingFormatArgumentException |

---

# Best Practices

- Use `print()` for same-line output.
- Use `println()` for line-by-line output.
- Use `printf()` for professional formatting.
- Match format specifiers with data types.
- Use `%n` instead of `\n`.
- Keep output clean and aligned.

---

# Frequently Asked Interview Questions

### What is the difference between print(), println(), and printf()?

- print() → Same line
- println() → New line
- printf() → Formatted output

---

### Which method is used for formatted output?

```
printf()
```

---

### Which format specifier prints an integer?

```
%d
```

---

### Which format specifier prints a String?

```
%s
```

---

### Which format specifier prints a Character?

```
%c
```

---

### Which format specifier prints a Boolean?

```
%b
```

---

### Which format specifier prints two decimal places?

```
%.2f
```

---

### Which format specifier prints a new line?

```
%n
```

---

### Which format specifier prints a percent symbol?

```
%%
```

---

# One-Line Revision

```
print()

↓

Same Line
```

```
println()

↓

Next Line
```

```
printf()

↓

Formatted Output
```

---

# Format Specifier Cheat Sheet

```
%d → int

%f → float/double

%.2f → 2 decimal places

%c → char

%s → String

%b → boolean

%n → new line

%% → %
```

---

# Module Summary

```
Output System

↓

print()

↓

println()

↓

printf()

↓

Formatting

↓

Format Specifiers

↓

Common Output Mistakes
```

---

# Key Takeaways

- `print()` prints on the same line.
- `println()` prints and moves to the next line.
- `printf()` provides formatted output.
- Use the correct format specifier for each data type.
- Formatting improves readability and professionalism.
- Understanding common mistakes helps avoid runtime exceptions.

---

# Module 12 Status

```
✅ print()

✅ println()

✅ printf()

✅ Formatting Output

✅ Format Specifiers

✅ Common Output Mistakes

🎉 Module 12 Completed
```