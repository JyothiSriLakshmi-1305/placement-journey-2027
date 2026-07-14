# Java print() Method

## What is print()?

The `print()` method is used to display output on the console **without moving the cursor to the next line**.

It belongs to the `PrintStream` class and is accessed using the `System.out` object.

---

# Why Do We Need print()?

Programs often need to display information to the user.

The `print()` method is useful when we want multiple outputs to appear **on the same line**.

Examples:

- Printing menus
- Printing tables
- Printing patterns
- Displaying formatted text

---

# Real-World Analogy

Imagine writing on a whiteboard.

```
Hello Java
```

If you continue writing, your marker stays on the same line.

```
Hello Java Learning
```

It doesn't automatically move to the next line.

This is exactly how `print()` works.

---

# Definition

The `print()` method prints the specified value to the console **without adding a newline character** at the end.

---

# Syntax

```java
System.out.print(value);
```

where `value` can be:

- String
- int
- double
- float
- char
- boolean
- Object

---

# Internal Working

```java
System.out.print("Java");
System.out.print(" Programming");
```

Step 1

```
Print "Java"
```

Cursor remains on the same line.

Step 2

```
Print " Programming"
```

Final Output

```
Java Programming
```

---

# Flow Diagram

```
Program

↓

System.out

↓

print()

↓

Display Output

↓

Cursor stays on same line
```

---

# Memory Concept

```
System

↓

out

↓

PrintStream Object

↓

print()

↓

Console
```

---

# Example 1

```java
public class PrintExample1 {

    public static void main(String[] args) {

        System.out.print("Hello");

        System.out.print(" Java");

    }

}
```

### Output

```
Hello Java
```

---

# Example 2

```java
public class PrintExample2 {

    public static void main(String[] args) {

        System.out.print(100);

        System.out.print(200);

    }

}
```

### Output

```
100200
```

Notice that there is **no space** between the numbers.

---

# Example 3

```java
public class PrintExample3 {

    public static void main(String[] args) {

        System.out.print("Age : ");

        System.out.print(20);

    }

}
```

### Output

```
Age : 20
```

---

# Example 4

```java
public class PrintExample4 {

    public static void main(String[] args) {

        System.out.print(true);

        System.out.print('A');

    }

}
```

### Output

```
trueA
```

---

# Data Types Supported

```java
System.out.print("Java");

System.out.print(100);

System.out.print(95.5);

System.out.print('A');

System.out.print(true);
```

Output

```
Java10095.5Atrue
```

---

# Difference Between print() and println()

| print() | println() |
|----------|-----------|
| Prints on the same line | Prints on a new line |
| No newline | Adds a newline automatically |

Example

```java
System.out.print("A");
System.out.print("B");
```

Output

```
AB
```

---

# Common Mistakes

## Mistake 1

Expecting a new line.

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

---

## Mistake 2

Forgetting spaces.

```java
System.out.print("Java");
System.out.print("Course");
```

Output

```
JavaCourse
```

Correct

```java
System.out.print("Java ");
System.out.print("Course");
```

---

# Best Practices

- Use `print()` when output should remain on the same line.
- Add spaces manually if required.
- Use meaningful text labels.
- Use `println()` when each output should appear on a new line.

---

# Interview Questions

### Q1

What is the purpose of `print()`?

**Answer:**

It displays output on the console without moving the cursor to the next line.

---

### Q2

Which class provides the `print()` method?

**Answer:**

`PrintStream`

---

### Q3

What object is used to call `print()`?

**Answer:**

`System.out`

---

### Q4

Output

```java
System.out.print("A");
System.out.print("B");
```

Answer

```
AB
```

---

### Q5

Can `print()` display numbers, characters, strings, and boolean values?

**Answer:**

Yes.

---

# MCQs

### 1

Which method prints output without moving to the next line?

A. println()

B. printf()

C. print()

D. display()

**Answer:** C

---

### 2

Output

```java
System.out.print("Java");
System.out.print("Course");
```

A.

```
Java
Course
```

B.

```
JavaCourse
```

C.

```
Java Course
```

D.

Error

**Answer:** B

---

### 3

Which object is used for standard output?

A. System.in

B. System.out

C. System.err

D. Scanner

**Answer:** B

---

# Coding Exercises

1. Print your name using `print()`.
2. Print your college name on the same line.
3. Print age and CGPA.
4. Print a sentence using multiple `print()` statements.
5. Print different data types.

---

# Assignment

Write a Java program that prints:

- Name
- Age
- College
- Branch
- CGPA

using only the `print()` method.

---

# Revision Notes

- `print()` displays output on the console.
- Cursor remains on the same line.
- No newline is added automatically.
- Supports all primitive data types, Strings, and Objects.
- Add spaces manually when needed.

---

# Key Takeaways

- `print()` is used for output on the same line.
- It belongs to the `PrintStream` class.
- It is called using `System.out`.
- It does not append a newline character.
- Use `println()` when output should move to the next line.

---

## References

- Oracle Java Documentation
- https://docs.oracle.com/en/java/