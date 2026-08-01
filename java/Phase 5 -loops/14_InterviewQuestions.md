# Interview Questions – Loops

> **Module 18 – Loops**

---

# Introduction

Loops are one of the most frequently tested topics in Java interviews. This chapter contains important interview questions covering while, do-while, for, enhanced for, nested loops, break, continue, and labeled statements.

---

# Beginner Level Questions

## 1. What is a loop?

A loop is a control statement used to execute a block of code repeatedly until a specified condition becomes false.

---

## 2. Why are loops used?

Loops eliminate repetitive code and automate repetitive tasks.

---

## 3. What are the types of loops in Java?

- while
- do-while
- for
- Enhanced for (for-each)

---

## 4. What is an entry-controlled loop?

A loop that checks the condition before executing the body.

Examples:

- while
- for

---

## 5. What is an exit-controlled loop?

A loop that checks the condition after executing the body.

Example:

- do-while

---

## 6. Can a while loop execute zero times?

Yes.

If the condition is false initially, the body is never executed.

---

## 7. Can a do-while loop execute zero times?

No.

It always executes at least once.

---

## 8. Which loop is best when the number of iterations is known?

The `for` loop.

---

## 9. Which loop is best when the number of iterations is unknown?

The `while` loop.

---

## 10. Which loop is best for arrays and collections?

Enhanced for loop.

---

# Intermediate Questions

## 11. What is an infinite loop?

A loop whose condition never becomes false.

Example

```java
while(true){

}
```

---

## 12. How can an infinite loop be avoided?

- Update loop variables.
- Write correct conditions.
- Verify boundary values.

---

## 13. What is a counter variable?

A variable used to count iterations or occurrences.

Example

```java
count++;
```

---

## 14. What is an accumulator variable?

A variable used to maintain a running total.

Example

```java
sum += value;
```

---

## 15. Difference between counter and accumulator?

| Counter | Accumulator |
|----------|-------------|
| Counts | Totals |
| count++ | sum += value |

---

## 16. What is a sentinel-controlled loop?

A loop that stops when a special value is encountered.

Example:

```
-1
```

---

## 17. What is a flag variable?

A boolean variable used to indicate whether a condition has been met.

---

## 18. What is the difference between break and continue?

| break | continue |
|--------|----------|
| Terminates loop | Skips current iteration |

---

## 19. Can break be used in a switch statement?

Yes.

---

## 20. Can continue be used in a switch statement?

No.

It is used only inside loops.

---

# Advanced Questions

## 21. What are labeled statements?

Labels allow `break` and `continue` to control outer loops in nested loop structures.

---

## 22. Why are labeled statements rarely used?

Because they can reduce readability if overused.

---

## 23. Which loop has the best performance?

All loop types have similar performance.

Choose based on readability and requirements.

---

## 24. What is the time complexity of a single loop?

```
O(n)
```

---

## 25. What is the time complexity of nested loops?

Usually

```
O(n²)
```

---

## 26. What is the space complexity of loops?

Generally

```
O(1)
```

---

## 27. Can enhanced for loop modify array elements?

Not directly for primitive arrays.

---

## 28. Can enhanced for loop access indexes?

No.

---

## 29. Difference between while and for?

| while | for |
|--------|-----|
| Unknown iterations | Known iterations |
| Initialization outside | Initialization inside |

---

## 30. Difference between while and do-while?

| while | do-while |
|--------|-----------|
| Checks before | Checks after |
| May execute zero times | Executes at least once |

---

# Scenario-Based Questions

## 31. Which loop would you use to read a file?

Answer:

```
while
```

---

## 32. Which loop would you use for an ATM menu?

Answer:

```
do-while
```

---

## 33. Which loop would you use for matrix traversal?

Answer:

```
Nested loops
```

---

## 34. Which loop would you use for searching an array?

Answer:

```
for or while
```

---

## 35. Which loop would you use for displaying products from an ArrayList?

Answer:

```
Enhanced for
```

---

# Coding Interview Questions

1. Print 1–100.
2. Print even numbers.
3. Reverse a number.
4. Count digits.
5. Check palindrome.
6. Find factorial.
7. Fibonacci.
8. Prime numbers.
9. Pattern printing.
10. Matrix addition.
11. Matrix multiplication.
12. Search element.
13. Find largest element.
14. Find smallest element.
15. Count vowels.

---

# HR + Technical Mixed Questions

## Why do companies ask loop questions?

Because loops test:

- Logical thinking
- Problem-solving
- Code efficiency
- Boundary handling
- Debugging skills

---

## Common Follow-up Questions

- Why not use recursion?
- Why not use streams?
- Which loop is cleaner?
- Which loop is more maintainable?
- How do you optimize nested loops?

---

# Quick Revision

```
Known iterations
↓

for

Unknown iterations
↓

while

At least one execution
↓

do-while

Collections
↓

Enhanced for

Exit
↓

break

Skip
↓

continue
```

---

# Placement Tips 💡

Interviewers usually expect you to:

- Choose the correct loop.
- Explain your choice.
- Know time complexity.
- Avoid infinite loops.
- Write clean and readable code.
- Handle edge cases.

---

# Key Takeaways

- Learn every loop thoroughly.
- Understand where each loop is used.
- Practice dry runs.
- Solve coding problems daily.
- Focus on readability and correctness.

---

# References

- Oracle Java Documentation
- Effective Java
- Java Language Specification
- Head First Java