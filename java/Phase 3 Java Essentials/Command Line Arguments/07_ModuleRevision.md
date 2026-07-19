# Module 16 Revision - Command Line Arguments

> **Module 16 – Command Line Arguments**
>
> **Quick Revision Guide**

---

# Module Overview

Command Line Arguments allow values to be passed to a Java program **before execution**.

These values are automatically stored inside:

```java
String[] args
```

---

# Definition

A **Command Line Argument** is an input passed to a Java program at the time of execution.

Example

```bash
java Student Lakshmi 21 AIML
```

Here,

```
args[0] = "Lakshmi"
args[1] = "21"
args[2] = "AIML"
```

---

# Syntax

```java
public static void main(String[] args)
```

---

# Meaning of Each Keyword

| Keyword | Meaning |
|----------|---------|
| public | Accessible by JVM |
| static | No object required |
| void | Returns nothing |
| main | Entry point |
| String[] | Array of Strings |
| args | Parameter name |

---

# Program Execution Flow

```
User

↓

Runs Program

↓

Operating System

↓

JVM Starts

↓

Loads Class

↓

Finds main()

↓

Creates String[]

↓

Stores Arguments

↓

Calls main()

↓

Program Executes
```

---

# Internal Working

Suppose we run

```bash
java Student Lakshmi 21 AIML
```

JVM creates

```java
String[] args = new String[3];
```

Stores

```java
args[0] = "Lakshmi";
args[1] = "21";
args[2] = "AIML";
```

Calls

```java
Student.main(args);
```

---

# Important Points

✅ Passed before execution

✅ Stored as Strings

✅ Created by JVM

✅ No object required

✅ Accessible through array indexes

---

# Common Parsing Methods

```java
Integer.parseInt(args[0]);
```

```java
Double.parseDouble(args[0]);
```

```java
Float.parseFloat(args[0]);
```

```java
Boolean.parseBoolean(args[0]);
```

---

# Common Programs

- Print Arguments
- Count Arguments
- Add Two Numbers
- Calculator
- Largest Number
- Greeting Program
- Circle Area
- Reverse Arguments

---

# Common Exceptions

## ArrayIndexOutOfBoundsException

Cause

```java
args[0]
```

when no arguments exist.

Solution

```java
if(args.length > 0)
```

---

## NumberFormatException

Cause

```java
Integer.parseInt("ABC");
```

Solution

Validate input before parsing or use exception handling.

---

# Comparison Summary

| Input Method | Best For |
|--------------|----------|
| Command Line Arguments | Automation, Configuration |
| Scanner | Interactive Input |
| BufferedReader | Large Input |
| Console | Password Input |

---

# Best Practices

- Check `args.length`.
- Parse carefully.
- Handle invalid input.
- Display usage instructions.
- Follow standard argument order.

---

# Common Mistakes

❌ Forgetting all arguments are Strings.

❌ Ignoring `args.length`.

❌ Parsing invalid numbers.

❌ Confusing Scanner with Command Line Arguments.

---

# Interview Quick Revision

### Who creates args?

JVM

---

### Where are arguments stored?

```java
String[] args
```

---

### Can args be renamed?

Yes.

```java
public static void main(String[] input)
```

---

### Can arguments be integers?

No.

They are always Strings.

---

### Can we pass multiple arguments?

Yes.

```bash
java Student Ram 21 India
```

---

### What happens if no arguments are passed?

```
args.length == 0
```

---

# One-Minute Revision

```
Command Line Arguments

↓

Before Execution

↓

Stored in

↓

String[] args

↓

Created by JVM

↓

Always Strings

↓

Need Parsing

↓

Validate args.length

↓

Program Executes
```

---

# Memory Trick

Remember:

```
Scanner

↓

Input AFTER Program Starts
```

```
Command Line Arguments

↓

Input BEFORE Program Starts
```

---

# Bootcamp Insight 💡

Command Line Arguments are used extensively in professional software to pass startup configurations, file paths, environment variables, and server settings. Although small as a Java topic, they introduce a fundamental software engineering principle: **programs should be configurable without changing the source code**.

---

# Key Takeaways

- Passed before execution.
- Stored in `String[] args`.
- Created by the JVM.
- Always received as Strings.
- Parse numeric values before use.
- Validate `args.length` to avoid runtime errors.
- Commonly used in automation and deployment.

---

## References

- Oracle Java Documentation
- Java Language Specification
- Java SE API Documentation