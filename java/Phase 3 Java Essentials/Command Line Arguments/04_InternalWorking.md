# Command Line Arguments - Internal Working

> **Module 16 – Command Line Arguments**
>
> **Topic:** Internal Working of Command Line Arguments

---

# Introduction

When we run a Java program using command line arguments, many operations happen behind the scenes before our code starts executing.

Example:

```bash
java Student Lakshmi 21 AIML
```

Although it looks like a simple command, the Operating System, JVM, Class Loader, and Memory Manager work together before calling the `main()` method.

Understanding this process helps you understand how Java programs actually start.

---

# Overall Execution Flow

```
User

    │

    ▼

Types Command

java Student Lakshmi 21 AIML

    │

    ▼

Operating System

    │

    ▼

Starts JVM

    │

    ▼

JVM Starts

    │

    ▼

Class Loader Loads Student.class

    │

    ▼

JVM Searches for

public static void main(String[] args)

    │

    ▼

Creates String Array

    │

    ▼

Stores Arguments

    │

    ▼

Calls main(args)

    │

    ▼

Program Execution Begins
```

---

# Step 1 — User Executes the Program

The user runs:

```bash
java Student Lakshmi 21 AIML
```

Here,

```
java
```

starts the JVM.

```
Student
```

is the class to execute.

Everything after it becomes command line arguments.

```
Lakshmi
21
AIML
```

---

# Step 2 — Operating System Starts JVM

The Operating System launches the Java Virtual Machine.

```
Windows

or

Linux

or

macOS

↓

Starts JVM
```

The JVM now takes control.

---

# Step 3 — JVM Loads the Class

The JVM asks the Class Loader to load:

```
Student.class
```

If the class is not found:

```
ClassNotFoundException
```

(or an error indicating the main class could not be found or loaded)

The program stops.

---

# Step 4 — JVM Searches for main()

The JVM searches specifically for:

```java
public static void main(String[] args)
```

If this method is missing:

```
Error:
Main method not found
```

The program cannot start.

---

# Step 5 — JVM Creates the String Array

Suppose the command is:

```bash
java Student Lakshmi 21 AIML
```

The JVM automatically creates:

```java
String[] args = new String[3];
```

Memory:

```
args

 │

 ▼

+-----------+
|           |
|           |
|           |
+-----------+
```

---

# Step 6 — JVM Stores Arguments

Each argument becomes one array element.

```
args[0] = "Lakshmi"

args[1] = "21"

args[2] = "AIML"
```

Memory

```
                args

                  │

                  ▼

        +-------------------+

Index   | Value

--------+-------------------+

0       | Lakshmi

1       | 21

2       | AIML

        +-------------------+
```

Notice:

Even

```
21
```

is stored as:

```
"21"
```

because every command line argument is a String.

---

# Step 7 — JVM Calls main()

The JVM internally performs something similar to:

```java
Student.main(args);
```

No object is created because

```
main()

↓

static
```

belongs to the class.

---

# Step 8 — Program Starts Executing

Control enters:

```java
public static void main(String[] args)
```

Now your Java code begins executing.

Example:

```java
System.out.println(args[0]);
```

Output

```
Lakshmi
```

---

# Memory Diagram

Command

```bash
java Student Lakshmi 21 AIML
```

```
                 Stack Memory

                 +------------------+

main() ---------->| args Reference |

                 +------------------+

                          │

                          ▼

                 Heap Memory

      +-----------------------------+

Index | Value

------+------------------------------+

0     | "Lakshmi"

1     | "21"

2     | "AIML"

      +------------------------------+
```

The local variable `args` (a reference) exists in the stack frame for `main()`, while the array object and its `String` elements are stored on the heap.

---

# Internal Lifecycle

```
Compile

↓

Student.java

↓

Student.class

↓

User Runs Program

↓

Operating System

↓

JVM

↓

Class Loader

↓

main()

↓

Creates String[]

↓

Stores Arguments

↓

Executes Code

↓

Program Ends

↓

Memory Released
```

---

# What Happens if No Arguments Are Given?

Command

```bash
java Student
```

The JVM still creates the array.

```java
String[] args = new String[0];
```

Memory

```
Length

0
```

Trying

```java
args[0]
```

causes

```
ArrayIndexOutOfBoundsException
```

---

# Safe Programming

Always check:

```java
if(args.length>0){

    System.out.println(args[0]);

}
else{

    System.out.println("No arguments supplied.");

}
```

---

# Why Strings?

Suppose we type

```bash
java Student 25
```

The Operating System passes text to the JVM.

Therefore

```
25

↓

"25"
```

To convert:

```java
int age = Integer.parseInt(args[0]);
```

---

# Internal Components Involved

| Component | Responsibility |
|------------|----------------|
| Operating System | Starts the JVM process |
| JVM | Controls program execution |
| Class Loader | Loads `.class` files |
| Memory Manager | Allocates memory for objects |
| `main()` Method | Entry point of the program |
| `String[] args` | Stores command line arguments |

---

# Best Practices

- Check `args.length` before using elements.
- Parse numeric values carefully.
- Display meaningful error messages.
- Validate user input.

---

# Common Mistakes

❌ Assuming arguments are integers.

❌ Forgetting to parse strings.

❌ Ignoring array bounds.

❌ Confusing `args` with keyboard input.

---

# Interview Questions

### Q1

Who creates the `args` array?

**Answer:** The JVM.

---

### Q2

Where are command line arguments stored?

**Answer:** In the `String[] args` array created by the JVM.

---

### Q3

Who calls the `main()` method?

**Answer:** The JVM.

---

### Q4

Why is `main()` static?

**Answer:** So the JVM can invoke it without creating an object.

---

### Q5

What happens if no arguments are supplied?

**Answer:** The JVM creates an empty array (`args.length == 0`).

---

# Revision Notes

- OS starts the JVM.
- JVM loads the class.
- JVM finds `main()`.
- JVM creates `String[] args`.
- JVM stores command line arguments.
- JVM invokes `main(args)`.
- Program execution begins.

---

# 💡 Bootcamp Insight

Command line arguments are one of the first examples of **communication between the Operating System and a Java program**. Understanding this startup sequence makes later topics—such as the Class Loader, JVM memory model, and application configuration—much easier to learn.

---

# Connection Map

```
Operating System
        │
        ▼
       JVM
        │
        ▼
  Class Loader
        │
        ▼
Find main()
        │
        ▼
Create String[]
        │
        ▼
Store Arguments
        │
        ▼
Call main(args)
        │
        ▼
Program Starts
```

---

# Future Topic Connection

In the next chapter, we'll write **real Java programs using command line arguments**, including:

- Printing arguments
- Adding two numbers
- Finding the largest number
- Calculator using command line arguments
- Handling invalid input safely

These examples will show how the concepts from this chapter are applied in practice.

---

# Key Takeaways

- The Operating System starts the JVM.
- The JVM loads the class and searches for `main()`.
- The JVM creates and fills the `String[] args` array.
- All command line arguments are received as strings.
- The JVM invokes `main(args)` to begin execution.
- Always validate `args.length` and parse values when needed.

---

## References

- Oracle Java Documentation
- Java Language Specification
- Java Virtual Machine Specification