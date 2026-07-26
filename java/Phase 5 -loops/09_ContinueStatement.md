# Continue Statement

> **Module 18 – Loops**

---

# Introduction

The **continue statement** is a control transfer statement in Java that **skips the current iteration** of a loop and immediately proceeds to the **next iteration**.

Unlike the `break` statement, which completely terminates the loop, `continue` only skips the remaining statements of the current iteration.

It is commonly used when certain values should be ignored while processing data.

---

# History

The `continue` statement has been part of structured programming languages for decades. Java inherited it from the C programming language to give programmers better control over loop execution.

Today, it is widely used in data processing, validation, filtering, and algorithm development.

---

# Evolution

```
Normal Loop

↓

Need to Skip Some Iterations

↓

Continue Statement

↓

Efficient Data Processing
```

---

# Why Do We Need Continue?

Suppose you want to print numbers from **1 to 10**, but **skip 5**.

Without `continue`, you would have to write more complex conditions.

Using `continue`, you simply tell Java:

> "Skip this iteration and continue with the next one."

---

# Problem Statement

Print numbers from **1 to 10**, except **5**.

Expected Output

```
1
2
3
4
6
7
8
9
10
```

---

# Real-Life Analogy

Imagine a teacher checking assignments.

```
Student 1 ✔

↓

Student 2 ✔

↓

Student 3 Absent

↓

Skip

↓

Student 4 ✔

↓

Student 5 ✔
```

The teacher skips only the absent student and continues checking the remaining students.

---

# Daily Life Applications

- Skip invalid records
- Ignore empty input
- Skip holidays while generating attendance
- Ignore duplicate entries
- Skip unavailable products

---

# Industry Applications

The continue statement is widely used in:

- Data validation
- File processing
- Database record filtering
- Machine Learning data cleaning
- Network packet processing
- Log analysis
- Banking transaction validation

---

# Definition

The **continue statement** skips the remaining statements of the **current iteration** and immediately moves to the next iteration of the loop.

---

# Syntax

```java
continue;
```

---

# Flow Diagram

```
Loop Starts

↓

Condition True

↓

Execute Statements

↓

Continue?

↓

Yes

↓

Skip Remaining Statements

↓

Next Iteration

↓

Condition Check Again
```

---

# Internal Working

Execution order:

1. Loop begins.
2. Condition is checked.
3. Statements execute.
4. JVM encounters `continue`.
5. Remaining statements in the current iteration are skipped.
6. Loop proceeds to the next iteration.

---

# Example 1 – Skip Number 5

```java
for(int i = 1; i <= 10; i++){

    if(i == 5){

        continue;

    }

    System.out.println(i);

}
```

Output

```
1
2
3
4
6
7
8
9
10
```

---

# Dry Run

| i | Continue? | Output |
|---|-----------|--------|
|1|No|1|
|2|No|2|
|3|No|3|
|4|No|4|
|5|Yes|Skipped|
|6|No|6|
|7|No|7|
|8|No|8|
|9|No|9|
|10|No|10|

---

# Example 2 – Print Odd Numbers

```java
for(int i = 1; i <= 10; i++){

    if(i % 2 == 0){

        continue;

    }

    System.out.print(i + " ");

}
```

Output

```
1 3 5 7 9
```

---

# Example 3 – Continue in While Loop

```java
int i = 0;

while(i < 5){

    i++;

    if(i == 3){

        continue;

    }

    System.out.println(i);

}
```

Output

```
1
2
4
5
```

---

# Important Note

When using `continue` inside a `while` loop, ensure the loop variable is updated **before** `continue` executes.

Incorrect Example

```java
int i = 1;

while(i <= 5){

    if(i == 3){

        continue;

    }

    System.out.println(i);

    i++;

}
```

This creates an **infinite loop** because `i` never changes when it becomes `3`.

Correct Example

```java
int i = 1;

while(i <= 5){

    if(i == 3){

        i++;

        continue;

    }

    System.out.println(i);

    i++;

}
```

---

# Memory Representation

```
i = 1

↓

Print

↓

i = 2

↓

Print

↓

i = 3

↓

Continue

↓

Skip Print

↓

i = 4

↓

Print
```

---

# Advantages

- Simplifies conditional skipping.
- Improves readability.
- Useful for filtering data.
- Avoids unnecessary nested conditions.

---

# Limitations

- Excessive use may reduce readability.
- Can make debugging harder.
- Incorrect placement can cause infinite loops.

---

# Best Practices

- Keep continue conditions simple.
- Always update loop variables properly.
- Avoid multiple continue statements in one loop unless necessary.
- Use meaningful conditions.

---

# Common Mistakes

❌ Forgetting to update the loop variable before `continue` in a while loop.

❌ Confusing `continue` with `break`.

❌ Using continue when an `if` statement would be simpler.

---

# Time Complexity

Using `continue` does **not** change the loop's overall time complexity.

Example

```java
for(int i = 1; i <= n; i++){

    if(i % 2 == 0){

        continue;

    }

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

# Break vs Continue

| Break | Continue |
|--------|----------|
| Terminates the loop | Skips current iteration |
| Execution moves after the loop | Execution moves to the next iteration |
| Used for early exit | Used for selective skipping |

---

# Interview Questions

### What is the difference between break and continue?

- `break` exits the loop.
- `continue` skips only the current iteration.

---

### Can continue be used in all loops?

Yes.

It works with:

- while
- do-while
- for
- enhanced for

---

### Can continue cause an infinite loop?

Yes.

Especially in `while` loops if the loop variable is not updated before the `continue` statement.

---

# MCQ

What is the output?

```java
for(int i = 1; i <= 5; i++){

    if(i == 3){

        continue;

    }

    System.out.print(i);

}
```

A.

```
12345
```

B.

```
1245
```

C.

```
345
```

D.

Compilation Error

**Answer:** B

---

# Coding Exercises

## Beginner

1. Print numbers from 1 to 20, skipping multiples of 3.
2. Print only odd numbers.
3. Skip vowels in a string.
4. Skip negative numbers in an array.
5. Skip duplicate values.

## Intermediate

6. Ignore invalid marks while calculating average.
7. Skip failed transactions.
8. Skip empty strings.
9. Skip prime numbers.
10. Filter positive numbers.

---

# Debugging Tips

- Verify the continue condition.
- Ensure loop variables are updated correctly.
- Test skipped and non-skipped cases separately.
- Be careful with continue inside while loops.

---

# Quick Revision

| Feature | Continue |
|---------|----------|
| Stops Loop | ❌ |
| Skips Current Iteration | ✅ |
| Works in All Loops | ✅ |
| May Cause Infinite Loop | Yes, if misused |

---

# Bootcamp Insight 💡

The `continue` statement is commonly used in real-world applications to ignore invalid or unnecessary data while continuing to process the remaining information. It is especially useful in data validation, filtering, and batch processing systems.

---

# Connection Map

```
Loops

↓

Break

↓

Continue

↓

Labeled Statements

↓

Searching

↓

Filtering

↓

Algorithms
```

---

# Future Topic

Next, you'll learn **Labeled Statements**, which allow `break` and `continue` to control outer loops in nested loop structures.

---

# Key Takeaways

- `continue` skips only the current iteration.
- It does not terminate the loop.
- It works with all loop types.
- Update loop variables carefully in while loops.
- Use `continue` for filtering and validation tasks.

---

# References

- Oracle Java Documentation
- Java Language Specification (JLS)
- Effective Java – Joshua Bloch
- Head First Java