# Java BufferedReader

> **Module 14 – Input System**
>
> **Topic:** BufferedReader

---

# History

Before the Scanner class was introduced in Java 5, `BufferedReader` was one of the commonly used ways to read keyboard input in Java.

`BufferedReader` belongs to the `java.io` package.

Unlike Scanner, which provides methods such as `nextInt()` and `nextDouble()`, BufferedReader generally reads input as **text (String)**.

Therefore, when numeric values are needed, we usually combine BufferedReader with **Parsing Methods**.

---

# Why Do We Need BufferedReader?

Scanner is easy to use:

```java
int age = sc.nextInt();
```

But Scanner performs additional processing while reading and parsing input.

For applications or programming problems involving larger amounts of text input, `BufferedReader` can be a faster alternative.

It reads characters efficiently by using a **buffer**.

---

# What is a Buffer?

A **buffer** is a temporary memory area used to hold data while it is being transferred.

Instead of repeatedly reading very small pieces of data directly from the input source, BufferedReader reads data through a buffer.

Conceptually:

```text
Keyboard
   ↓
Input Stream
   ↓
Buffer
   ↓
BufferedReader
   ↓
Program
```

This reduces the number of direct read operations and makes character input more efficient.

---

# Real-Life Analogy

Imagine carrying 100 books.

### Without a Buffer

You carry:

```text
1 Book
↓
Go Back
↓
1 Book
↓
Go Back
```

This requires many trips.

### With a Buffer

You use a box:

```text
Many Books
↓
Box
↓
Carry Together
```

The **box acts like a buffer**.

Similarly, BufferedReader uses a buffer to make reading data more efficient.

---

# Definition

`BufferedReader` is a Java class used to efficiently read **character-based input** from a character stream.

It belongs to:

```java
java.io
```

---

# Import Statements

For keyboard input, we commonly need:

```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
```

Or:

```java
import java.io.*;
```

For learning, explicit imports make it clearer which classes are being used.

---

# Creating a BufferedReader

```java
BufferedReader br =
        new BufferedReader(
                new InputStreamReader(System.in));
```

This may look complicated at first.

Let's break it down.

---

# Understanding the Statement

```java
BufferedReader br =
        new BufferedReader(
                new InputStreamReader(System.in));
```

| Part | Meaning |
|---|---|
| `System.in` | Reads raw byte input from standard input |
| `InputStreamReader` | Converts bytes into characters |
| `BufferedReader` | Buffers character input for efficient reading |
| `br` | Reference variable |

---

# Why Do We Need InputStreamReader?

`System.in` is an `InputStream`, which works with **bytes**.

`BufferedReader` works with a `Reader`, which handles **characters**.

Therefore, `InputStreamReader` acts as a bridge.

```text
System.in
   ↓
Bytes
   ↓
InputStreamReader
   ↓
Characters
   ↓
BufferedReader
```

This is an important concept.

---

# Internal Working

```text
Keyboard
   ↓
System.in
   ↓
Byte Data
   ↓
InputStreamReader
   ↓
Character Data
   ↓
BufferedReader
   ↓
readLine()
   ↓
String
```

---

# The readLine() Method

The most commonly used BufferedReader method is:

```java
readLine()
```

It reads a complete line of text.

Syntax:

```java
String data = br.readLine();
```

---

# First BufferedReader Program

```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReaderDemo {

    public static void main(String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(
                        new InputStreamReader(System.in));

        System.out.print("Enter your name: ");

        String name = br.readLine();

        System.out.println("Welcome " + name);
    }
}
```

---

# Sample Output

```text
Enter your name: Jyothi Sri Lakshmi
Welcome Jyothi Sri Lakshmi
```

Because `readLine()` reads an entire line, spaces are also included.

---

# Memory Diagram

User enters:

```text
Java Programming
```

Then:

```text
Keyboard
   ↓
System.in
   ↓
InputStreamReader
   ↓
BufferedReader
   ↓
readLine()
   ↓
"Java Programming"
```

The result is stored as a `String`.

---

# Reading Integer Input

This is where our previous topic, **Parsing**, becomes important.

`readLine()` returns a String.

Example input:

```text
20
```

BufferedReader initially gives us:

```java
"20"
```

To convert it into an integer:

```java
int age = Integer.parseInt(br.readLine());
```

---

# Example

```java
import java.io.*;

public class AgeInput {

    public static void main(String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(
                        new InputStreamReader(System.in));

        System.out.print("Enter Age: ");

        int age = Integer.parseInt(br.readLine());

        System.out.println("Age = " + age);
    }
}
```

---

# Dry Run

User enters:

```text
20
```

Step 1:

```java
br.readLine()
```

returns:

```text
"20"
```

Step 2:

```java
Integer.parseInt("20")
```

returns:

```text
20
```

Step 3:

```java
int age = 20;
```

So:

```text
Keyboard Input
      ↓
    "20"
      ↓
Integer.parseInt()
      ↓
     20
      ↓
 int variable
```

---

# Reading Double Input

```java
double cgpa =
        Double.parseDouble(br.readLine());
```

Example:

```java
System.out.print("Enter CGPA: ");

double cgpa =
        Double.parseDouble(br.readLine());

System.out.println("CGPA = " + cgpa);
```

---

# Reading Character Input

Since `readLine()` returns a String, we can use:

```java
char grade = br.readLine().charAt(0);
```

Example:

```java
System.out.print("Enter Grade: ");

char grade = br.readLine().charAt(0);
```

This is similar to:

```java
sc.next().charAt(0);
```

with Scanner.

---

# BufferedReader + Parsing Connection

Now you can understand exactly why we learned Parsing before BufferedReader.

```text
BufferedReader
      ↓
  readLine()
      ↓
    String
      ↓
   Parsing
      ↓
Primitive Data Type
```

Examples:

```java
int age =
    Integer.parseInt(br.readLine());

double cgpa =
    Double.parseDouble(br.readLine());

float value =
    Float.parseFloat(br.readLine());

long number =
    Long.parseLong(br.readLine());

boolean status =
    Boolean.parseBoolean(br.readLine());
```

---

# Exception Handling

`readLine()` can throw an `IOException`.

For now, we can write:

```java
public static void main(String[] args)
        throws IOException
```

Example:

```java
public static void main(String[] args)
        throws IOException {
```

We will study exceptions properly in the **Exception Handling module**.

For now, remember:

```text
BufferedReader
      ↓
readLine()
      ↓
May throw IOException
```

---

# Scanner vs BufferedReader

| Scanner | BufferedReader |
|---|---|
| `java.util` | `java.io` |
| Beginner-friendly | Requires more setup |
| Can directly read several primitive types | `readLine()` returns String |
| Provides `nextInt()`, `nextDouble()`, etc. | Parsing is needed for numbers |
| Convenient token parsing | Efficient buffered character reading |
| Common in beginner programs | Common where efficient text input is useful |

---

# When Should We Use BufferedReader?

Use BufferedReader when:

- You want efficient character/text input.
- You are reading complete lines.
- You are comfortable using parsing.
- You need more control over text-based input.

For simple beginner programs, Scanner is usually easier.

---

# Common Mistakes

## Mistake 1 – Expecting readLine() to Return int

Incorrect:

```java
int age = br.readLine();
```

`readLine()` returns a String.

Correct:

```java
int age =
        Integer.parseInt(br.readLine());
```

---

## Mistake 2 – Forgetting InputStreamReader

Incorrect:

```java
BufferedReader br =
        new BufferedReader(System.in);
```

Correct:

```java
BufferedReader br =
        new BufferedReader(
                new InputStreamReader(System.in));
```

---

## Mistake 3 – Forgetting IOException Handling

If you use:

```java
br.readLine();
```

you must handle or declare the possible `IOException`.

For now:

```java
throws IOException
```

---

# Best Practices

- Use meaningful names such as `br`.
- Understand that `readLine()` returns a String.
- Use parsing when numeric data is required.
- Handle exceptions appropriately.
- Prefer Scanner when simplicity matters.
- Prefer buffered input when efficient text reading matters.

---

# 💡 Bootcamp Insight

Scanner and BufferedReader solve similar input problems differently.

Scanner:

```text
Input
 ↓
Scanner
 ↓
nextInt()
 ↓
int
```

BufferedReader:

```text
Input
 ↓
BufferedReader
 ↓
readLine()
 ↓
String
 ↓
parseInt()
 ↓
int
```

Remember:

> **Scanner = Convenient Input**

> **BufferedReader = Buffered Character Input + Parsing when needed**

---

# Interview Questions

### Q1. What is BufferedReader?

**Answer:**

BufferedReader is a class in `java.io` used to efficiently read character-based input using a buffer.

---

### Q2. Which method reads a complete line?

**Answer:**

```java
readLine()
```

---

### Q3. What does readLine() return?

**Answer:**

A `String`.

---

### Q4. How do you read an integer using BufferedReader?

**Answer:**

```java
int num =
    Integer.parseInt(br.readLine());
```

---

### Q5. Why is InputStreamReader used?

**Answer:**

It acts as a bridge between byte streams such as `System.in` and character-based readers such as `BufferedReader`.

---

### Q6. Which is easier for beginners: Scanner or BufferedReader?

**Answer:**

Scanner, because it provides methods such as `nextInt()` and `nextDouble()` directly.

---

# MCQs

### 1. BufferedReader belongs to which package?

A. `java.util`

B. `java.lang`

C. `java.io`

D. `java.net`

**Answer:** C

---

### 2. What does readLine() return?

A. int

B. char

C. String

D. double

**Answer:** C

---

### 3. Which converts String to int?

A. `Integer.parseInt()`

B. `Integer.nextInt()`

C. `parseInteger()`

D. `String.toInt()`

**Answer:** A

---

### 4. Why is InputStreamReader used with System.in?

A. To print output

B. To bridge byte input to character reading

C. To create integers

D. To compile Java

**Answer:** B

---

# Coding Exercises

1. Read your full name using BufferedReader.
2. Read your age using `Integer.parseInt()`.
3. Read your CGPA using `Double.parseDouble()`.
4. Read your grade using `charAt(0)`.
5. Print all entered values.

---

# Assignment

Create a **Student Information Program** using BufferedReader.

Accept:

```text
Name
Age
College
CGPA
Grade
Placed Status
```

Use appropriate parsing methods where required.

Display all the information.

---

# 1-Minute Revision

```text
BufferedReader
      ↓
java.io
      ↓
System.in
      ↓
InputStreamReader
      ↓
BufferedReader
      ↓
readLine()
      ↓
String
      ↓
Parsing (if required)
      ↓
Primitive Value
```

Remember:

```text
Scanner → Easy

BufferedReader → Buffered Character Input

readLine() → String

String + Parsing → Primitive
```

---

# Connection Map

```text
Scanner
   ↓
Scanner Methods
   ↓
Parsing
   ↓
BufferedReader
   ↓
readLine()
   ↓
String
   ↓
Parsing
```

---

# Future Topic Connection

Now that you've learned **Scanner** and **BufferedReader**, the next input mechanism is the **Console class**.

Console is particularly interesting because it provides features such as:

```java
readLine()
```

and

```java
readPassword()
```

The `readPassword()` method can read sensitive input without displaying the characters normally on the screen.

After learning Console, we'll compare:

```text
Scanner
    vs
BufferedReader
    vs
Console
```

This is an important Java interview comparison.

---

# Key Takeaways

- BufferedReader belongs to `java.io`.
- It efficiently reads character-based input using buffering.
- `readLine()` returns a String.
- Numeric input usually requires parsing.
- `InputStreamReader` bridges byte input and character reading.
- Scanner is generally easier for beginners.
- BufferedReader is useful when efficient text input is needed.
- Understanding BufferedReader reinforces the importance of parsing.

---

## References

- Oracle Java Documentation
- Java Standard Library Documentation