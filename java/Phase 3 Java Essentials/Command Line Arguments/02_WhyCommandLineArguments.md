# Why Command Line Arguments?

> **Module 16 – Command Line Arguments**
>
> **Topic:** Why Java Introduced Command Line Arguments

---

# Introduction

Java provides multiple ways to accept input from users:

- Scanner
- BufferedReader
- Console
- Command Line Arguments

A common beginner question is:

> **If Scanner can read input, why did Java introduce Command Line Arguments?**

The answer lies in **automation, flexibility, and real-world software development**.

---

# The Problem Before Command Line Arguments

Imagine a program that greets a user.

Without command line arguments:

```java
Scanner sc = new Scanner(System.in);

System.out.print("Enter Name: ");
String name = sc.nextLine();

System.out.println("Welcome " + name);
```

Every time the program runs:

1. Program starts
2. Waits for user input
3. Reads input
4. Continues execution

This is perfectly fine for interactive programs.

But what if no person is available to type?

---

# The Real Problem

Consider a server that starts automatically every morning.

Should it stop and ask:

```
Enter Port Number:
```

Of course not.

The server should already know its configuration.

Example:

```bash
java Server 8080
```

The server immediately starts using port **8080**.

---

# Why Command Line Arguments?

Command line arguments allow information to be supplied **before** the program starts.

```
User

 │

 ▼

Runs Program

 │

 ▼

Arguments Passed

 │

 ▼

Program Starts

 │

 ▼

Uses Arguments
```

No waiting.

No keyboard interaction.

---

# Real-Life Analogy

Imagine booking a flight.

You don't board the plane and then tell the pilot where you want to go.

Instead:

- Destination
- Passenger Name
- Seat Preference

are provided **before the journey begins**.

Command line arguments work the same way.

---

# Scanner vs Command Line Arguments

## Scanner

```
Program Starts

↓

Waits for User

↓

Reads Input

↓

Continues
```

---

## Command Line Arguments

```
Arguments Given

↓

Program Starts

↓

Uses Arguments Immediately
```

---

# Daily Life Examples

Command line arguments are used while:

- Opening applications
- Running Java programs
- Executing scripts
- Launching IDE tools
- Starting web servers
- Running build tools

---

# Industry Examples

## Spring Boot

```bash
java -jar app.jar --server.port=9090
```

---

## Maven

```bash
mvn clean install
```

---

## Git

```bash
git commit -m "Initial Commit"
```

---

## Docker

```bash
docker run nginx
```

Each of these commands passes arguments to a program.

---

# Advantages

✅ No hardcoding

✅ Easy automation

✅ Reusable programs

✅ Faster execution

✅ Better for scripts

✅ Easy testing

---

# Limitations

- All values arrive as `String`
- Order matters
- Missing arguments must be handled
- Not ideal for long interactive input sessions

---

# When to Use Command Line Arguments

Use them when:

- Starting applications
- Passing file names
- Passing configuration values
- Running automated scripts
- Launching servers
- Providing environment settings

---

# When NOT to Use Them

Avoid them when:

- Reading many user inputs
- Building menu-driven applications
- Taking continuous input
- Creating interactive console programs

Use `Scanner` or `BufferedReader` instead.

---

# Example Scenario

Suppose you want to calculate the square of a number.

### Using Scanner

```java
Scanner sc = new Scanner(System.in);

int n = sc.nextInt();
```

The program waits for input.

---

### Using Command Line Arguments

Run:

```bash
java Square 5
```

The value **5** is available immediately when the program starts.

---

# Best Practices

- Validate the number of arguments before using them.
- Display usage instructions if required arguments are missing.
- Convert string arguments carefully using parsing methods.
- Use meaningful argument order.

---

# Common Mistakes

❌ Confusing command line arguments with Scanner input.

❌ Assuming arguments can store integers directly.

❌ Forgetting to check `args.length`.

❌ Accessing `args[0]` when no arguments are supplied.

---

# Interview Questions

### Q1

Why were command line arguments introduced?

---

### Q2

When are command line arguments passed to a program?

---

### Q3

Can command line arguments replace Scanner?

---

### Q4

Which is better for automation?

---

### Q5

Which is better for interactive input?

---

# Quick Comparison

| Feature | Scanner | Command Line Arguments |
|---------|----------|------------------------|
| Input Time | During execution | Before execution |
| Interactive | Yes | No |
| Automation | No | Yes |
| Continuous Input | Yes | No |
| Used in Scripts | Rarely | Frequently |

---

# Revision Notes

- Passed before program execution.
- Ideal for automation.
- Used in scripts, servers, and deployment.
- All arguments are stored as strings.
- Validate `args.length` before accessing elements.

---

# 💡 Bootcamp Insight

As you progress to **Spring Boot, Maven, Docker, and DevOps**, you'll notice that command line arguments are everywhere. Learning this concept now builds the foundation for understanding how professional Java applications are configured and launched.

---

# Connection Map

```
Java Input Methods
        │
        ├── Scanner
        ├── BufferedReader
        ├── Console
        └── Command Line Arguments
                    │
                    ▼
        Automation & Configuration
```

---

# Future Topic Connection

Next, we'll learn the **syntax of command line arguments**, understand the `main()` method signature, and see how the JVM passes values into the `String[] args` array.

---

# Key Takeaways

- Command line arguments provide input before execution.
- They are best suited for automation and configuration.
- They complement Scanner rather than replacing it.
- They are widely used in real-world Java applications.

---

## References

- Oracle Java Documentation
- Java Language Specification
- Java SE API Documentation