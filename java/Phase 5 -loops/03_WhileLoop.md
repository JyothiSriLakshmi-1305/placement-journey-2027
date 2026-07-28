
# While Loop

> **Module 18 – Loops**

---

# 1. Introduction

A **while loop** repeatedly executes a block of code **as long as a condition remains true**. It is best suited for situations where the number of iterations is **not known in advance**.

A `while` loop is an **entry-controlled loop**, meaning the condition is checked **before** the loop body executes.

---

# 2. History

The concept of looping originated in early programming languages to eliminate repetitive code. Java inherited the `while` loop from C while providing object-oriented programming support.

---

# 3. Evolution

```text
Repeated Statements
        ↓
while Loop
        ↓
for Loop
        ↓
Enhanced for Loop
```

---

# 4. Why While Loop?

Without loops:

```java
System.out.println("Hello");
System.out.println("Hello");
System.out.println("Hello");
```

With a while loop:

```java
int i = 1;
while(i <= 3){
    System.out.println("Hello");
    i++;
}
```

---

# 5. Problem Statement

Repeat a task until a condition becomes false.

Examples:
- Read user input until valid.
- Keep asking for a password.
- Read file contents until EOF.

---

# 6. Real-Life Analogy

Filling a water bottle:

```text
Bottle Full?
      ↓
     No
      ↓
 Pour Water
      ↓
Check Again
      ↓
    Yes
      ↓
    Stop
```

---

# 7. Daily Applications

- ATM menu
- OTP verification
- Login attempts
- Reading notifications
- Download progress

---

# 8. Industry Applications

- Banking systems
- File processing
- Network servers
- Sensor monitoring
- Chat applications

---

# 9. Definition

A **while loop** repeatedly executes a block of code while its condition evaluates to `true`.

---

# 10. Syntax

```java
while(condition){
    // statements
}
```

---

# 11. Syntax Breakdown

- **while** → Java keyword
- **condition** → boolean expression
- **body** → statements executed repeatedly

---

# 12. Internal Working (JVM Perspective)

1. Initialize variables.
2. Evaluate condition.
3. If true, execute body.
4. Execute update.
5. Jump back to the condition.
6. Exit when condition becomes false.

---

# 13. Flow Diagram

```text
Start
  ↓
Condition?
 ↓      ↓
Yes     No
 ↓       ↓
Body    End
 ↓
Update
 ↓
Back to Condition
```

---

# 14. Memory Representation

Example:

```java
int i = 1;
while(i <= 3){
    System.out.println(i);
    i++;
}
```

```text
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
Exit
```

---

# 15. Execution Cycle

Initialization → Condition → Execute → Update → Repeat

---

# 16. Counter Pattern ⭐

A **counter** counts occurrences.

```java
int count = 1;

while(count <= 5){
    System.out.println(count);
    count++;
}
```

Uses:
- Count students
- Login attempts
- Number of vowels
- Records processed

---

# 17. Accumulator Pattern ⭐

An **accumulator** stores a running total.

```java
int i = 1;
int sum = 0;

while(i <= 5){
    sum += i;
    i++;
}

System.out.println(sum);
```

Output:

```text
15
```

Uses:
- Shopping cart total
- Salary calculation
- Marks total
- Sales reports

---

# 18. Sentinel-Controlled Loop ⭐

A sentinel value ends the loop.

```java
Scanner sc = new Scanner(System.in);

int num = 0;

while(num != -1){
    num = sc.nextInt();
}
```

Uses:
- Menu programs
- Exit option
- File reading
- Chat systems

---

# 19. Flag Pattern ⭐

A **flag** records whether something happened.

```java
boolean found = false;
int i = 0;
int[] arr = {10,20,30};

while(i < arr.length){
    if(arr[i] == 20){
        found = true;
        break;
    }
    i++;
}
```

Uses:
- Search
- Login success
- Validation
- Error detection

---

# 20. Examples

### Print Numbers

```java
int i = 1;

while(i <= 5){
    System.out.println(i);
    i++;
}
```

### Print Even Numbers

```java
int i = 2;

while(i <= 10){
    System.out.print(i + " ");
    i += 2;
}
```

### Reverse Counting

```java
int i = 5;

while(i >= 1){
    System.out.print(i + " ");
    i--;
}
```

---

# 21. Dry Run

| Iteration | i Before | Condition | Output | i After |
|-----------|---------:|-----------|--------|--------:|
|1|1|True|1|2|
|2|2|True|2|3|
|3|3|True|3|4|
|Exit|4|False|-|-|

---

# 22. Infinite Loop

```java
while(true){
    System.out.println("Running...");
}
```

Common cause:

```java
while(i <= 5){
    System.out.println(i);
    // missing i++
}
```

---

# 23. Best Practices

- Initialize variables correctly.
- Update loop variables.
- Keep conditions simple.
- Avoid unnecessary nesting.

---

# 24. Common Mistakes

- Forgetting updates
- Wrong condition
- Off-by-one errors
- Infinite loops

---

# 25. Debugging Tips

- Print loop variables.
- Dry run with small values.
- Verify boundary conditions.

---

# 26. Time Complexity

Typical loop:

```text
O(n)
```

---

# 27. Space Complexity

```text
O(1)
```

---

# 28. Comparison

| Feature | while | do-while | for |
|---------|-------|----------|-----|
| Entry Controlled | ✅ | ❌ | ✅ |
| Executes at least once | ❌ | ✅ | ❌ |
| Best for Unknown Iterations | ✅ | ✅ | ❌ |
| Best for Known Iterations | ❌ | ❌ | ✅ |

---

# 29. Interview Questions

1. Why is while called an entry-controlled loop?
2. What is a counter variable?
3. What is an accumulator?
4. Difference between counter and accumulator?
5. Can a while loop execute zero times?
6. What causes an infinite loop?
7. When should you use while instead of for?

---

# 30. MCQs

**Q:** Which loop checks its condition first?

A. while

B. do-while

C. enhanced for

D. None

**Answer:** A

---

# 31. Coding Exercises

1. Print numbers 1–100.
2. Print even numbers.
3. Sum of first N numbers.
4. Count digits.
5. Reverse a number.
6. Check palindrome.
7. Fibonacci using while.

---

# 32. Assignment

1. Build an ATM menu.
2. Login validation.
3. Guess the number game.
4. Shopping bill calculator.
5. Student marks processor.

---

# 33. Quick Revision

- Entry-controlled loop
- Unknown iterations
- Counter
- Accumulator
- Sentinel
- Flag
- O(n)
- O(1)

---

# 34. Bootcamp Insight 💡

The four loop patterns—**Counter, Accumulator, Sentinel, and Flag**—are fundamental building blocks for DSA and real-world software development.

---

# 35. Connection Map

```text
While Loop
   │
   ├── Counter
   ├── Accumulator
   ├── Sentinel
   ├── Flag
   ├── Arrays
   └── DSA
```

---

# 36. Key Takeaways

- Entry-controlled loop
- Best for unknown iterations
- Counter counts
- Accumulator totals
- Sentinel ends processing
- Flag tracks state

---

# 37. References

- Oracle Java Documentation
- Java Language Specification
- Effective Java – Joshua Bloch
- Head First Java
