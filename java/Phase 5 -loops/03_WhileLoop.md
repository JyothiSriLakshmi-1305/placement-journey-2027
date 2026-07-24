# While Loop

> **Module 18 – Loops**

---

# Introduction

Programming often requires executing the same set of instructions multiple times. Writing the same code repeatedly is inefficient, difficult to maintain, and increases the chances of errors.

Java provides **loops** to automate repetitive tasks. Among them, the **while loop** is the simplest looping construct and is widely used when the number of iterations is **not known in advance**.

A `while` loop keeps executing a block of code **as long as the specified condition evaluates to `true`**.

Because the condition is checked **before** executing the loop body, the while loop is known as an **Entry-Controlled Loop**.

---

# History

The concept of loops originated from early programming languages to eliminate repetitive code.

The `while` loop became popular through languages like **ALGOL**, **C**, and later Java.

Java inherited the `while` loop from C while maintaining a cleaner and object-oriented syntax.

---

# Evolution

```
Repeated Statements

↓

while Loop

↓

for Loop

↓

Enhanced for Loop
```

---

# Why Do We Need a While Loop?

Suppose you want to print:

```
Hello
```

five times.

Without loops:

```java
System.out.println("Hello");
System.out.println("Hello");
System.out.println("Hello");
System.out.println("Hello");
System.out.println("Hello");
```

This is manageable for five lines.

Now imagine printing it **10,000 times**.

Clearly, manually writing thousands of statements is impossible.

A loop solves this problem.

---

# Problem Statement

Suppose a website keeps asking users to enter a valid password until the correct password is entered.

Since we don't know how many attempts the user will make, a `while` loop is the perfect choice.

---

# Real-Life Analogy

Imagine filling a water bottle.

```
Bottle Full?

↓

No

↓

Pour Water

↓

Bottle Full?

↓

No

↓

Pour Again

↓

Bottle Full?

↓

Yes

↓

Stop
```

The action repeats until the condition changes.

---

# Daily Life Applications

- Reading WhatsApp messages
- Checking emails
- Counting money
- Filling forms
- Waiting for OTP verification
- ATM transactions

---

# Industry Applications

While loops are commonly used in:

- Banking software
- Login authentication
- Reading files
- Processing network requests
- Game loops
- Sensor monitoring
- User input validation
- Chat applications

---

# Definition

A **while loop** repeatedly executes a block of code **as long as the specified condition remains true**.

If the condition becomes false, the loop terminates.

---

# Syntax

```java
while(condition){

    // statements

}
```

---

# Syntax Breakdown

### while

Java keyword used to create the loop.

---

### condition

A boolean expression.

Examples:

```java
i < 10
```

```java
age >= 18
```

---

### Body

The statements inside `{ }`.

Executed repeatedly while the condition is true.

---

# Flow Diagram

```
           Start
             │
             ▼
     Check Condition
        /        \
     True        False
       │            │
       ▼            ▼
 Execute Body      End
       │
       ▼
    Update Variable
       │
       └────────────► Back to Condition
```

---

# Internal Working (JVM Perspective)

When the JVM executes a `while` loop:

1. The loop variable is initialized.
2. The condition is evaluated.
3. If true, the loop body executes.
4. The update statement changes the loop variable.
5. The JVM again checks the condition.
6. The process repeats until the condition becomes false.

---

# Memory Representation

Example:

```java
int i = 1;

while(i <= 3){

    System.out.println(i);

    i++;

}
```

Memory Changes

```
Initially

i = 1

↓

Print 1

↓

i = 2

↓

Print 2

↓

i = 3

↓

Print 3

↓

i = 4

↓

Condition becomes false

↓

Exit Loop
```

---

# Dry Run

| Iteration | i Before | Condition | Output | i After |
|-----------|---------:|-----------|--------|--------:|
| 1 | 1 | True | 1 | 2 |
| 2 | 2 | True | 2 | 3 |
| 3 | 3 | True | 3 | 4 |
| Exit | 4 | False | — | — |

---

# Example 1 – Print Hello

```java
public class Main {

    public static void main(String[] args) {

        int i = 1;

        while(i <= 5){

            System.out.println("Hello");

            i++;

        }

    }

}
```

Output

```
Hello
Hello
Hello
Hello
Hello
```

---

# Example 2 – Print Numbers

```java
int i = 1;

while(i <= 10){

    System.out.print(i + " ");

    i++;

}
```

Output

```
1 2 3 4 5 6 7 8 9 10
```

---

# Example 3 – Even Numbers

```java
int i = 2;

while(i <= 10){

    System.out.print(i + " ");

    i += 2;

}
```

Output

```
2 4 6 8 10
```

---

# Example 4 – Reverse Counting

```java
int i = 5;

while(i >= 1){

    System.out.print(i + " ");

    i--;

}
```

Output

```
5 4 3 2 1
```

---

# Entry-Controlled Loop

A `while` loop checks the condition **before** executing the loop body.

Example

```java
int i = 10;

while(i < 5){

    System.out.println(i);

}
```

Output

```
No Output
```

The loop body is skipped because the condition is false from the beginning.

---

# Infinite While Loop

```java
while(true){

    System.out.println("Hello");

}
```

This loop never terminates.

Another common mistake:

```java
int i = 1;

while(i <= 5){

    System.out.println(i);

}
```

The update statement (`i++`) is missing, so the condition always remains true.

---

# Best Practices

- Initialize the loop variable before the loop.
- Update the loop variable correctly.
- Keep the condition simple and readable.
- Avoid unnecessary nested loops.
- Use meaningful variable names.

---

# Common Mistakes

❌ Forgetting to update the loop variable.

❌ Incorrect loop condition.

❌ Off-by-one errors (`<` vs `<=`).

❌ Accidentally creating an infinite loop.

---

# Time Complexity

Example

```java
while(i <= n){

    i++;

}
```

Time Complexity

```
O(n)
```

Space Complexity

```
O(1)
```

---

# Comparison with for Loop

| while | for |
|--------|------|
| Best when iterations are unknown | Best when iterations are known |
| Initialization outside | Initialization inside |
| More flexible | More compact |

---

# Interview Questions

### Why is the while loop called an entry-controlled loop?

Because the condition is checked before the loop body executes.

---

### Can a while loop execute zero times?

Yes. If the condition is false initially, the body is never executed.

---

### What causes an infinite while loop?

Not updating the loop variable or using a condition that never becomes false.

---

# MCQs

### 1. A while loop checks its condition:

A. After execution

B. Before execution

C. Both

D. None

**Answer:** B

---

### 2. Which loop may execute zero times?

A. do-while

B. while

C. Both

D. None

**Answer:** B

---

### 3. What happens if the loop variable is not updated?

A. Compilation Error

B. Runtime Error

C. Infinite Loop (if the condition stays true)

D. No Output

**Answer:** C

---

# Coding Exercises

### Beginner

1. Print numbers from 1 to 20.
2. Print even numbers up to 100.
3. Print odd numbers up to 50.
4. Find the sum of the first N natural numbers.
5. Print the multiplication table of a given number.

### Intermediate

6. Reverse a number.
7. Count the number of digits.
8. Check whether a number is a palindrome.
9. Find the factorial of a number.
10. Generate the Fibonacci series using a while loop.

---

# Debugging Tips

- Print the loop variable inside the loop to track its value.
- Verify that the update statement changes the condition.
- Check boundary conditions carefully.
- Use a debugger to step through each iteration if needed.

---

# Quick Revision

| Feature | While Loop |
|---------|------------|
| Loop Type | Entry-Controlled |
| Condition Checked | Before execution |
| Executes at least once | ❌ No |
| Best For | Unknown iterations |
| Time Complexity | O(n) |
| Space Complexity | O(1) |

---

# Bootcamp Insight 💡

The `while` loop is your first step toward solving real-world problems where the number of repetitions cannot be predicted beforehand. You'll use it in user input handling, file reading, networking, and many algorithmic problems.

---

# Connection Map

```
Loops

↓

while

↓

do-while

↓

for

↓

Enhanced for

↓

Arrays

↓

Collections

↓

Algorithms
```

---

# Future Topic

Next, you'll learn the **Do-While Loop**, which guarantees that the loop body executes at least once.

---

# Key Takeaways

- The `while` loop is an entry-controlled loop.
- It checks the condition before every iteration.
- It is ideal when the number of iterations is unknown.
- Forgetting to update the loop variable can lead to an infinite loop.
- It is commonly used in input validation, file processing, and event-driven programming.

---

# References

- Oracle Java Documentation
- Java Language Specification (JLS)
- Effective Java – Joshua Bloch
- Head First Java