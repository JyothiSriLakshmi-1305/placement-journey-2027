# Java Escape Sequences

## What are Escape Sequences?

Escape Sequences are **special character combinations** that begin with a **backslash (`\`)**.

They allow us to print characters that cannot be typed directly or have a special meaning in Java strings.

---

# Why Do We Need Escape Sequences?

Sometimes we need to:

- Print text on multiple lines.
- Add tab spaces.
- Print double quotes.
- Print single quotes.
- Print file paths containing backslashes.

Escape sequences make these tasks simple.

---

# Real-Life Analogy

Imagine you're writing a message.

Normally:

```
Hello World
```

But sometimes you want:

```
Hello
World
```

or

```
Name    Age
```

Escape sequences tell Java how to display the output.

---

# Daily Applications

Escape sequences are used in:

- Console applications
- Bills and receipts
- Student reports
- File paths
- Logs
- Formatted messages

---

# Industry Applications

Used in:

- Banking software
- Hospital management systems
- ERP applications
- Billing systems
- Report generation
- Logging frameworks

---

# Definition

An **Escape Sequence** is a special sequence of characters that starts with a **backslash (`\`)** and represents a special character.

---

# Common Escape Sequences

| Escape Sequence | Meaning |
|-----------------|---------|
| `\n` | New Line |
| `\t` | Horizontal Tab |
| `\"` | Double Quote |
| `\'` | Single Quote |
| `\\` | Backslash |

---

# 1. New Line (`\n`)

Moves the cursor to the next line.

### Syntax

```java
System.out.println("Java\nProgramming");
```

### Output

```
Java
Programming
```

---

# 2. Tab (`\t`)

Inserts a horizontal tab space.

### Syntax

```java
System.out.println("Name\tAge");
```

### Output

```
Name    Age
```

---

# 3. Double Quote (`\"`)

Prints double quotation marks.

### Syntax

```java
System.out.println("\"Java\"");
```

### Output

```
"Java"
```

---

# 4. Single Quote (`\'`)

Prints a single quotation mark.

### Syntax

```java
System.out.println("\'");
```

### Output

```
'
```

---

# 5. Backslash (`\\`)

Prints a backslash character.

### Syntax

```java
System.out.println("C:\\Java");
```

### Output

```
C:\Java
```

---

# Internal Working

Example

```java
System.out.println("Java\nProgramming");
```

### Step 1

Java reads the string.

```
Java\nProgramming
```

### Step 2

Java finds

```
\n
```

### Step 3

Java replaces it with a newline character.

### Step 4

Output

```
Java
Programming
```

---

# Memory Diagram

```
String Literal

↓

Escape Sequence

↓

Special Character

↓

Console Output
```

---

# Example Program

```java
public class EscapeSequenceDemo {

    public static void main(String[] args) {

        System.out.println("Java\nProgramming");

        System.out.println("Name\tAge");

        System.out.println("\"Welcome\"");

        System.out.println("\'A\'");

        System.out.println("C:\\Users\\Jyothi");

    }

}
```

### Output

```
Java
Programming
Name    Age
"Welcome"
'A'
C:\Users\Jyothi
```

---

# Common Mistakes

## Mistake 1

Using a single backslash in file paths.

Incorrect

```java
"C:\Java"
```

This causes a compile-time error because `\J` is not a valid escape sequence.

Correct

```java
"C:\\Java"
```

---

## Mistake 2

Printing quotes directly.

Incorrect

```java
System.out.println(""Java"");
```

Correct

```java
System.out.println("\"Java\"");
```

---

## Mistake 3

Using `/n` instead of `\n`.

Incorrect

```java
System.out.println("Hello/nWorld");
```

Correct

```java
System.out.println("Hello\nWorld");
```

---

# Best Practices

- Use `\n` for new lines.
- Use `\t` for simple spacing.
- Escape quotes inside strings.
- Escape backslashes in file paths.
- Keep output clean and readable.

---

# Interview Questions

### Q1

What is an escape sequence?

**Answer**

A special character sequence beginning with `\` that represents a special character in a string.

---

### Q2

Which escape sequence creates a new line?

**Answer**

```
\n
```

---

### Q3

Which escape sequence inserts a tab?

**Answer**

```
\t
```

---

### Q4

How do you print a double quote?

**Answer**

```java
\"
```

---

### Q5

How do you print a backslash?

**Answer**

```java
\\
```

---

# MCQs

### 1

Which escape sequence creates a new line?

A. `\t`

B. `\n`

C. `\\`

D. `\"`

**Answer:** B

---

### 2

Which escape sequence inserts a tab?

A. `\t`

B. `\n`

C. `\'`

D. `\\`

**Answer:** A

---

### 3

Which escape sequence prints a backslash?

A. `\`

B. `\\`

C. `//`

D. `///`

**Answer:** B

---

### 4

Which escape sequence prints a double quote?

A. `\"`

B. `\'`

C. `\\`

D. `\n`

**Answer:** A

---

# Coding Exercises

1. Print your name on two lines using `\n`.
2. Display a table using `\t`.
3. Print `"Java Programming"` including quotes.
4. Print `'A'` including single quotes.
5. Print a Windows file path.

---

# Assignment

Write a Java program that displays:

- Name
- College
- Branch

using `\n`.

Display a table using `\t`.

Print:

```
"Welcome to Java"
```

Print the file path:

```
C:\Users\Student\Documents
```

using the appropriate escape sequences.

---

# Revision Notes

- `\n` → New Line
- `\t` → Tab Space
- `\"` → Double Quote
- `\'` → Single Quote
- `\\` → Backslash

---

# Connection Map

```
Escape Sequences

↓

print()

↓

println()

↓

printf()

↓

Formatted Console Output
```

---

# Future Topic Connection

Escape Sequences help us **display output properly**.

The next module is **Input System**, where we'll learn how to **accept input from users** using:

- Scanner
- BufferedReader
- Console

---

# Key Takeaways

- Escape sequences begin with a backslash (`\`).
- They represent special characters inside strings.
- They improve console output formatting.
- They are commonly used in Java applications.
- Understanding escape sequences helps avoid common syntax errors.

---

## References

- Oracle Java Documentation
- https://docs.oracle.com/en/java/