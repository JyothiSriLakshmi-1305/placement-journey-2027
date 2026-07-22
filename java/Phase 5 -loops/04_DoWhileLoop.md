# Do-While Loop

> **Module 18 – Loops**

---

# Introduction

A **do-while loop** is a looping statement that executes a block of code **at least once**, regardless of whether the condition is initially true or false.

Unlike the `while` loop, which checks the condition before executing the loop body, the `do-while` loop checks the condition **after** executing the loop body.

Because of this behavior, the do-while loop is called an **Exit-Controlled Loop**.

---

# History

The do-while loop originated from structured programming languages to solve situations where a task must execute **at least one time** before checking whether it should continue.

Java inherited this concept from the C programming language.

---

# Evolution

```
Manual Repetition

↓

while Loop
(Check First)

↓

do-while Loop
(Execute First)

↓

Modern Programming
```

---

# Why Do We Need a Do-While Loop?

Sometimes we want the program to execute a task before checking any condition.

Examples:

- Displaying a menu
- Asking for a password
- Taking user input
- Playing a game at least once

The `while` loop cannot guarantee the first execution.

The `do-while` loop can.

---

# Problem Statement

Suppose an ATM must display the menu at least once.

Even if the user immediately chooses Exit, the menu should still appear.

A do-while loop is ideal for this scenario.

---

# Real-Life Analogy

Imagine eating at a buffet.

```
Take one plate

↓

Eat

↓

Still hungry?

↓

Yes → Take another plate

↓

No → Stop
```

You eat **at least one plate** before deciding whether to continue.

---

# Daily Life Applications

- ATM menu
- Mobile app menu
- Game menu
- Login attempts
- Quiz applications
- Menu-driven programs

---

# Industry Applications

- Banking software
- Restaurant ordering systems
- POS systems
- Command-line tools
- Interactive console applications
- Game loops

---

# Definition

A **do-while loop** executes the loop body first and checks the condition afterward.

Therefore, the loop body executes **at least once**.

---

# Syntax

```java
do{

    // statements

}while(condition);
```

---

# Syntax Breakdown

## do

Starts the loop.

---

## Body

Runs immediately.

---

## while(condition)

Checks whether another iteration should occur.

Notice the **semicolon (`;`)** after the condition.

---

# Flow Diagram

```
        Start
          │
          ▼
    Execute Body
          │
          ▼
   Check Condition
      /       \
   True       False
     │           │
     ▼           ▼
 Execute Again   End
```

---

# Internal Working

Execution order:

1. Execute body
2. Check condition
3. If true → repeat
4. If false → exit

---

# Memory Representation

Example:

```java
int i = 1;

do{

    System.out.println(i);

    i++;

}while(i <= 3);
```

Memory

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

# Example 1 – Print Hello

```java
int i = 1;

do{

    System.out.println("Hello");

    i++;

}while(i <= 5);
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

do{

    System.out.print(i + " ");

    i++;

}while(i <= 10);
```

Output

```
1 2 3 4 5 6 7 8 9 10
```

---

# Example 3 – Condition Initially False

```java
int i = 10;

do{

    System.out.println(i);

}while(i < 5);
```

Output

```
10
```

Even though the condition is false, the loop executes once.

---

# Comparison with while

| while | do-while |
|--------|-----------|
| Entry-controlled | Exit-controlled |
| Checks first | Executes first |
| May execute 0 times | Executes at least once |
| Condition before body | Condition after body |

---

# Infinite do-while Loop

```java
do{

    System.out.println("Hello");

}while(true);
```

This loop never terminates.

---

# Best Practices

- Update the loop variable.
- Use meaningful conditions.
- Use do-while only when one execution is mandatory.
- Avoid unnecessary infinite loops.

---

# Common Mistakes

❌ Forgetting the semicolon after `while(condition);`

❌ Forgetting to update the loop variable.

❌ Using do-while when while is more appropriate.

---

# Time Complexity

Example

```java
do{

    i++;

}while(i <= n);
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

# When Should You Use do-while?

Choose do-while when:

- A menu must appear at least once.
- User input is required before validation.
- At least one execution is guaranteed.

---

# Interview Questions

### Why is do-while called an exit-controlled loop?

Because the condition is checked after executing the loop body.

---

### Can a do-while loop execute only once?

Yes.

If the condition becomes false after the first iteration.

---

### What is the biggest difference between while and do-while?

A do-while loop always executes the body at least once.

---

# MCQ

What is the output?

```java
int i = 5;

do{

    System.out.print(i);

}while(i < 5);
```

A. Nothing

B. 5

C. Compilation Error

D. Infinite Loop

**Answer:** B

---

# Coding Exercises

1. Print numbers 1–10.
2. Print even numbers up to N.
3. Print multiplication table.
4. Create a menu-driven calculator.
5. Validate user input until it is positive.

---

# Debugging Tips

- Trace the variable after every iteration.
- Ensure the update statement changes the condition.
- Check for the mandatory semicolon after `while(condition);`

---

# Quick Revision

| Feature | do-while |
|---------|-----------|
| Condition Check | After execution |
| Executes at least once | ✅ |
| Entry-controlled | ❌ |
| Exit-controlled | ✅ |

---

# Bootcamp Insight 💡

Use a `do-while` loop when the program must perform an action before deciding whether to continue. It is especially useful for interactive console programs such as menus and repeated user prompts.

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
```

---

# Future Topic

Next, you'll learn the **for Loop**, the most commonly used loop in Java, ideal when the number of iterations is known in advance.

---

# Key Takeaways

- do-while executes at least once.
- It is an exit-controlled loop.
- The condition is checked after the loop body.
- Commonly used for menus and user interaction.
- Always remember the semicolon after `while(condition);`

---

# References

- Oracle Java Documentation
- Java Language Specification (JLS)
- Effective Java – Joshua Bloch
- Head First Java