# Java Console Class

> **Module 14 – Input System**
>
> **Topic:** Console Class

---

# History

Before Java 6, developers mainly used:

- Scanner
- BufferedReader

for reading user input.

In **Java 6**, Oracle introduced the **Console** class to provide a more secure and convenient way to interact with users through the command line.

One of its biggest advantages is **password input**, where typed characters are hidden.

---

# Why was Console Introduced?

Scanner and BufferedReader work well for normal input.

However, they have a limitation.

When entering a password:

```
Enter Password:

MyPassword123
```

everyone nearby can see the password on the screen.

To solve this security problem, Java introduced the **Console** class.

---

# Problem Statement

Suppose we are developing an ATM application.

The user enters:

```
Password: 123456
```

Using Scanner, the password is visible.

For secure applications, passwords should not be displayed.

Console provides:

```java
readPassword()
```

which hides the entered characters.

---

# Real-Life Analogy

Think about logging into your Gmail account.

When typing your password:

```
************
```

or

```
••••••••••
```

The password is hidden.

Java Console provides the same security for command-line applications.

---

# Daily Applications

Console is useful for:

- Password Entry
- Login Systems
- Banking Applications
- Command Line Tools
- Secure Authentication

---

# Industry Applications

Console is commonly used in:

- Banking Software
- Linux CLI Applications
- System Administration Tools
- Database Utilities
- Secure Command-Line Programs

---

# Definition

The **Console** class provides methods to read user input from the command line.

Unlike Scanner, it can also read passwords securely.

Package:

```java
java.io
```

---

# Java Philosophy

Java believes that sensitive information should not be displayed openly.

Instead of asking programmers to implement password masking manually, Java provides the built-in `readPassword()` method.

This makes applications more secure.

---

# Creating a Console Object

```java
Console console = System.console();
```

---

# Understanding the Statement

```java
Console console = System.console();
```

| Part | Meaning |
|------|---------|
| System | Predefined Java class |
| console() | Returns the system console |
| Console | Console class |
| console | Reference variable |

---

# Internal Working

```
Keyboard

↓

System.console()

↓

Console Object

↓

readLine()

↓

Program
```

---

# Memory Diagram

```
Keyboard

↓

Console

↓

Input

↓

Variable
```

---

# Flow Diagram

```
Start

↓

System.console()

↓

Console Object

↓

Read Input

↓

Store Value

↓

Display Output

↓

End
```

---

# readLine()

Used to read a complete line.

Syntax

```java
String name = console.readLine();
```

Example

```java
import java.io.Console;

public class ConsoleDemo {

    public static void main(String[] args) {

        Console console = System.console();

        String name = console.readLine("Enter Name: ");

        System.out.println("Welcome " + name);

    }

}
```

---

# Output

```
Enter Name:

Jyothi

Welcome Jyothi
```

---

# readPassword()

Used to read passwords securely.

Syntax

```java
char[] password = console.readPassword("Enter Password: ");
```

Unlike Scanner,

the entered password is **not displayed**.

---

# Example

```java
import java.io.Console;

public class PasswordDemo {

    public static void main(String[] args) {

        Console console = System.console();

        char[] password =
                console.readPassword("Enter Password: ");

        System.out.println("Password Received.");

    }

}
```

---

# Why readPassword() Returns char[]

Instead of String,

Java returns:

```java
char[]
```

Reason:

Strings are immutable and remain in memory until garbage collection.

Character arrays can be overwritten after use, making them more secure for sensitive data.

Example:

```java
password[0] = '*';
```

This is one reason security libraries prefer `char[]` over `String`.

---

# Why Does System.console() Return null?

One of the most common beginner questions.

When running inside many IDEs:

```
VS Code

↓

System.console()

↓

null
```

Reason:

Most IDEs do not provide a real operating system console.

When running from:

- Command Prompt
- Terminal
- Linux Shell

```
Command Prompt

↓

System.console()

↓

Console Object
```

works correctly.

---

# Bootcamp Insight 💡

Many beginners think Console is "broken" because `System.console()` returns `null`.

It is **not broken**.

The environment simply doesn't provide a real console.

---

# Scanner vs Console

| Scanner | Console |
|----------|----------|
| Easy to use | Secure password input |
| Shows password | Hides password |
| Reads many data types | Mainly text and password |
| Works in IDE | Often requires a real terminal |

---

# BufferedReader vs Console

| BufferedReader | Console |
|----------------|----------|
| Reads text | Reads text and passwords |
| Needs parsing | Mainly String/char[] |
| Faster for text | Better for secure CLI applications |

---

# Best Practices

- Check whether `System.console()` returns `null`.
- Use `readPassword()` for passwords.
- Do not store passwords as `String`.
- Prefer `char[]` for sensitive information.

---

# Common Mistakes

## Mistake 1

```java
Console console = System.console();

console.readLine();
```

without checking for `null`.

Correct

```java
Console console = System.console();

if(console != null){
    // use console
}
```

---

## Mistake 2

Using Scanner for passwords.

Instead use

```java
readPassword()
```

---

# Interview Questions

### Q1

Which package contains Console?

**Answer**

```java
java.io
```

---

### Q2

Which method reads passwords securely?

**Answer**

```java
readPassword()
```

---

### Q3

Why does `readPassword()` return `char[]`?

**Answer**

For better security.

Character arrays can be cleared after use.

---

### Q4

Why does `System.console()` return `null`?

**Answer**

Because most IDEs do not provide a real system console.

---

### Q5

Where is Console commonly used?

**Answer**

Secure command-line applications and password input.

---

# MCQs

### 1

Console belongs to

A. java.util

B. java.lang

C. java.io

D. java.net

**Answer:** C

---

### 2

Which method hides password input?

A. read()

B. next()

C. readPassword()

D. println()

**Answer:** C

---

### 3

Which type does `readPassword()` return?

A. String

B. char[]

C. int

D. boolean

**Answer:** B

---

# Coding Exercises

1. Read name using Console.
2. Read password using `readPassword()`.
3. Display only the username.
4. Check whether `System.console()` is `null`.
5. Run the program from Command Prompt.

---

# Assignment

Create a simple **Login Program** using Console.

Input:

- Username
- Password

Display:

```
Login Successful
```

(Note: Do not print the password.)

---

# Revision Notes

- Console belongs to `java.io`.
- Created using `System.console()`.
- `readLine()` reads text.
- `readPassword()` hides password input.
- `readPassword()` returns `char[]`.
- Console usually works in Command Prompt or Terminal, not in many IDEs.

---

# Connection Map

```
Scanner

↓

BufferedReader

↓

Console

↓

Comparison

↓

Module 14 Revision
```

---

# Future Topic Connection

Now that you've learned all three Java input mechanisms:

- Scanner
- BufferedReader
- Console

the next topic is one of the **most important interview chapters**:

## Scanner vs BufferedReader vs Console

You'll compare:

- Speed
- Performance
- Security
- Ease of Use
- Parsing
- Memory
- Real-world Usage
- Interview Questions

This comparison is frequently asked in Java interviews and will help you choose the right input method for different situations.

---

# Key Takeaways

- Console belongs to `java.io`.
- It provides secure password input.
- `readPassword()` returns `char[]`.
- `System.console()` may return `null` in many IDEs.
- Console is mainly used for secure command-line applications.

---

## References

- Oracle Java Documentation
- Java Standard Library Documentation