# For Loop

> **Module 18 – Loops**

---

# Introduction

The **for loop** is the most commonly used loop in Java. It is ideal when the **number of iterations is known in advance**.

Unlike the `while` loop, which separates initialization, condition checking, and update, the `for` loop keeps all three in one place, making the code more compact and readable.

Because of its simplicity and readability, the `for` loop is widely used in software development, competitive programming, and technical interviews.

---

# History

The `for` loop originated in early programming languages such as **ALGOL** and became popular through **C**. Java adopted the same syntax, making it familiar to C and C++ programmers.

Java 5 later introduced the **Enhanced for Loop** for easier traversal of arrays and collections.

---

# Evolution

```
Manual Repetition
        │
        ▼
while Loop
        │
        ▼
for Loop
        │
        ▼
Enhanced for Loop
```

---

# Why Do We Need a For Loop?

Suppose you want to print numbers from **1 to 100**.

Using a `while` loop:

```java
int i = 1;

while(i <= 100){

    System.out.println(i);

    i++;

}
```

Using a `for` loop:

```java
for(int i = 1; i <= 100; i++){

    System.out.println(i);

}
```

The `for` loop is shorter and clearly shows:

- Initialization
- Condition
- Update

in one statement.

---

# Problem Statement

Suppose a school wants to print roll numbers from **1 to 500**.

Instead of writing 500 print statements, a `for` loop automates the task.

---

# Real-Life Analogy

Imagine climbing stairs.

```
Start at Step 1

↓

Climb One Step

↓

Reached Last Step?

↓

No

↓

Repeat

↓

Yes

↓

Stop
```

Each step is like one iteration of a `for` loop.

---

# Daily Life Applications

- Numbering pages
- Counting people
- Printing receipts
- Sending reminders
- Generating invoices
- Processing attendance

---

# Industry Applications

The `for` loop is widely used for:

- Traversing arrays
- Processing lists
- Database record iteration
- File processing
- Report generation
- Game development
- Data analysis
- Machine Learning datasets

---

# Definition

A **for loop** repeatedly executes a block of code while a specified condition remains true. It combines initialization, condition checking, and update in a single statement.

---

# Syntax

```java
for(initialization; condition; update){

    // statements

}
```

---

# Syntax Breakdown

## Initialization

Executed **once** before the loop starts.

Example:

```java
int i = 1;
```

---

## Condition

Checked before every iteration.

If true → execute.

If false → stop.

Example:

```java
i <= 5
```

---

## Update

Executed after every iteration.

Example:

```java
i++
```

---

# Flow Diagram

```
        Start
          │
          ▼
   Initialization
          │
          ▼
     Condition?
      /       \
   True       False
     │           │
     ▼           ▼
 Execute Body    End
     │
     ▼
    Update
     │
     └────────────► Back to Condition
```

---

# Internal Working

Execution order:

1. Initialization (once)
2. Condition
3. Execute body
4. Update
5. Repeat until the condition becomes false

---

# Memory Representation

Example:

```java
for(int i = 1; i <= 3; i++){

    System.out.println(i);

}
```

Memory changes:

```
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

Condition False

↓

Exit
```

---

# Dry Run

| Iteration | i Before | Output | i After | Condition |
|-----------|---------:|--------|--------:|-----------|
| 1 | 1 | 1 | 2 | True |
| 2 | 2 | 2 | 3 | True |
| 3 | 3 | 3 | 4 | False |

---

# Example 1 – Print Numbers

```java
for(int i = 1; i <= 5; i++){

    System.out.println(i);

}
```

Output

```
1
2
3
4
5
```

---

# Example 2 – Even Numbers

```java
for(int i = 2; i <= 10; i += 2){

    System.out.print(i + " ");

}
```

Output

```
2 4 6 8 10
```

---

# Example 3 – Reverse Counting

```java
for(int i = 5; i >= 1; i--){

    System.out.print(i + " ");

}
```

Output

```
5 4 3 2 1
```

---

# Infinite For Loop

```java
for(;;){

    System.out.println("Hello");

}
```

This loop has no condition, so it runs forever unless terminated.

---

# Best Practices

- Use meaningful loop variable names.
- Keep conditions simple.
- Update the loop variable correctly.
- Avoid modifying the loop variable unexpectedly inside the loop.
- Prefer enhanced `for` for arrays and collections when you don't need the index.

---

# Common Mistakes

❌ Using the wrong condition.

❌ Forgetting the update expression.

❌ Off-by-one errors (`<` vs `<=`).

❌ Modifying the loop variable inside the loop body without a reason.

---

# Time Complexity

Example:

```java
for(int i = 1; i <= n; i++){

    // constant work

}
```

Time Complexity:

```
O(n)
```

Space Complexity:

```
O(1)
```

---

# When Should You Use a For Loop?

Use a `for` loop when:

- The number of iterations is known.
- Traversing arrays by index.
- Counting forward or backward.
- Repeating a task a fixed number of times.

---

# Comparison with While

| for | while |
|------|--------|
| Best for known iterations | Best for unknown iterations |
| Initialization inside loop | Initialization usually outside |
| Compact syntax | Flexible syntax |
| Easy to read for counting | Useful for condition-driven loops |

---

# Interview Questions

### Why is the `for` loop preferred for counting problems?

Because it keeps initialization, condition, and update together, making the code concise and readable.

---

### Can the initialization, condition, or update be omitted?

Yes.

Example:

```java
for(;;){

}
```

This creates an infinite loop.

---

### Which loop is best when the number of iterations is known?

The `for` loop.

---

# MCQ

What is the output?

```java
for(int i = 3; i <= 5; i++){

    System.out.print(i + " ");

}
```

A. 3 4 5

B. 3 4

C. 4 5

D. Infinite Loop

**Answer:** A

---

# Coding Exercises

1. Print numbers from 1 to 100.
2. Print even numbers between 1 and 50.
3. Print odd numbers between 1 and 50.
4. Find the sum of the first N natural numbers.
5. Print the multiplication table of a given number.

---

# Debugging Tips

- Check the initialization value.
- Verify the condition.
- Ensure the update expression changes the loop variable.
- Watch for off-by-one errors.

---

# Quick Revision

| Feature | for Loop |
|---------|----------|
| Loop Type | Entry-controlled |
| Best For | Known iterations |
| Executes at least once? | ❌ No |
| Time Complexity | O(n) |
| Space Complexity | O(1) |

---

# Bootcamp Insight 💡

The `for` loop is one of the most frequently used constructs in Java. You'll use it extensively in arrays, strings, collections, algorithms, and competitive programming. A solid understanding of the `for` loop will make future topics much easier.

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

Nested Loops

↓

Arrays & Collections
```

---

# Future Topic

Next, you'll learn the **Enhanced for Loop (for-each)**, which simplifies iterating over arrays and collections.

---

# Key Takeaways

- The `for` loop is best for known iterations.
- It combines initialization, condition, and update in one statement.
- It is an entry-controlled loop.
- Infinite loops are possible using `for(;;)`.
- It is widely used in real-world Java applications.

---

# References

- Oracle Java Documentation
- Java Language Specification (JLS)
- Effective Java – Joshua Bloch
- Head First Java
