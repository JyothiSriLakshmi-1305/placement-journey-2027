# Command Line Arguments - Syntax

> **Module 16 – Command Line Arguments**
>
> **Topic:** Understanding `public static void main(String[] args)`

---

# Introduction

Every Java application starts its execution from the `main()` method.

The JVM looks for a method with the following signature:

```java
public static void main(String[] args)
```

This method acts as the **entry point** of a Java application.

---

# Complete Syntax

```java
public static void main(String[] args)
```

Let's understand every keyword.

---

# 1. public

## Definition

`public` is an **access modifier**.

It allows the JVM to access the `main()` method from anywhere.

### Why public?

When you run

```bash
java Student
```

the JVM is outside your class.

It must be able to call the `main()` method.

If `main()` is not public, the JVM cannot access it.

---

## Example

```java
public static void main(String[] args)
```

---

# 2. static

## Definition

`static` means the method belongs to the class instead of an object.

The JVM can call it without creating an object.

---

## Why static?

Imagine if `main()` were not static.

The JVM would first need to create an object.

But how would it know which constructor to call?

To avoid this dependency, Java makes `main()` static.

---

## Example

Instead of

```java
Student obj = new Student();
obj.main(args);
```

the JVM simply calls

```java
Student.main(args);
```

---

# 3. void

## Definition

`void` means the method does not return any value.

The JVM starts the program and doesn't expect any result back from `main()`.

---

## Example

```java
public static void main(String[] args)
```

---

# 4. main

`main` is the predefined method name recognized by the JVM.

When you execute

```bash
java Student
```

the JVM searches for

```java
main()
```

If it cannot find a valid `main()` method, the program cannot start.

---

# 5. String[]

## Definition

`String[]` represents an array of strings.

Each command line argument is stored as a separate string.

Example

```bash
java Student Ram 20 India
```

The JVM creates:

```java
args[0] = "Ram"
args[1] = "20"
args[2] = "India"
```

---

# Why String?

Everything typed in the command line is treated as **text**.

Even numbers are received as strings.

Example

```bash
java Student 100
```

Internally:

```java
args[0] = "100"
```

To use it as an integer:

```java
int number = Integer.parseInt(args[0]);
```

---

# 6. args

`args` is simply the **parameter name**.

You can rename it.

Example

```java
public static void main(String[] values)
```

or

```java
public static void main(String[] input)
```

These work correctly because the JVM only cares about the **type** (`String[]`), not the variable name.

However, using `args` is the standard convention.

---

# How the JVM Executes a Program

Suppose the command is:

```bash
java Student Lakshmi 21 AIML
```

### Step 1

The JVM loads the `Student.class` file.

↓

### Step 2

The JVM searches for

```java
public static void main(String[] args)
```

↓

### Step 3

The JVM creates a `String` array.

```java
args = new String[3];
```

↓

### Step 4

The array is populated.

```java
args[0] = "Lakshmi";
args[1] = "21";
args[2] = "AIML";
```

↓

### Step 5

The JVM calls

```java
Student.main(args);
```

↓

### Step 6

Program execution begins.

---

# Memory Representation

Command:

```bash
java Student Lakshmi 21 AIML
```

Memory:

```
                args
                  │
                  ▼
        +-----------------------+
Index   | Value                 |
--------+-----------------------+
0       | "Lakshmi"             |
1       | "21"                  |
2       | "AIML"                |
        +-----------------------+
```

---

# Execution Flow

```
Compile Program

↓

Student.class

↓

User Runs Program

↓

java Student Lakshmi 21

↓

JVM Starts

↓

Creates String Array

↓

Stores Arguments

↓

Calls main(args)

↓

Program Executes
```

---

# Example Program

```java
public class Student {

    public static void main(String[] args) {

        System.out.println(args[0]);
        System.out.println(args[1]);

    }

}
```

Run

```bash
java Student Lakshmi AIML
```

Output

```
Lakshmi
AIML
```

---

# What Happens If No Arguments Are Passed?

Command

```bash
java Student
```

The JVM creates an empty array.

```
args.length = 0
```

Trying

```java
System.out.println(args[0]);
```

throws

```
ArrayIndexOutOfBoundsException
```

---

# Safe Way

```java
if(args.length > 0){
    System.out.println(args[0]);
}
else{
    System.out.println("No arguments provided.");
}
```

---

# Best Practices

- Always check `args.length` before accessing elements.
- Parse numeric values only after validating input.
- Use meaningful argument order.
- Display a usage message when arguments are missing.

---

# Common Mistakes

❌ Assuming command line arguments are integers.

❌ Forgetting to parse numeric values.

❌ Accessing `args[0]` without checking the length.

❌ Confusing `args` with `Scanner`.

---

# Interview Questions

### Q1

Why is `main()` public?

---

### Q2

Why is `main()` static?

---

### Q3

Why is `main()` void?

---

### Q4

Can we rename `args`?

---

### Q5

Why are command line arguments stored as strings?

---

### Q6

What happens if no arguments are supplied?

---

### Q7

Can we write `String args[]` instead of `String[] args`?

**Answer:** Yes. Both declarations are valid in Java, but `String[] args` is the preferred style because the brackets are associated with the type.

---

# Revision Notes

- `public` → Accessible by JVM
- `static` → No object required
- `void` → Returns nothing
- `main` → Entry point
- `String[]` → Array of strings
- `args` → Parameter name (can be changed)

---

# 💡 Bootcamp Insight

A common misconception is that `args` is a special Java keyword. It is **not**. The only required parts of the method signature are the method name (`main`) and the parameter type (`String[]`). The parameter name can be anything, but `args` is the widely accepted convention.

Understanding this method signature is essential because it explains how the JVM hands control to your program. The same concepts—method signatures, parameters, arrays, and static methods—reappear throughout Java development.

---

# Connection Map

```
JVM
 │
 ▼
Loads Class
 │
 ▼
Finds main()
 │
 ▼
Creates String[]
 │
 ▼
Stores Arguments
 │
 ▼
Calls main(args)
 │
 ▼
Program Starts
```

---

# Future Topic Connection

In the next chapter, we'll explore **how the JVM internally creates the `args` array and passes it to `main()`**, including a deeper look at memory allocation and execution flow.

---

# Key Takeaways

- `main()` is the entry point of every Java application.
- The JVM looks specifically for `public static void main(String[] args)`.
- Command line arguments are always received as strings.
- The parameter name `args` is conventional and can be changed.
- Always validate `args.length` before accessing array elements.

---

## References

- Oracle Java Documentation
- Java Language Specification
- Java SE API Documentation