# Loop Comparison Guide

> **Module 18 – Loops**

---

# Introduction

Java provides multiple looping constructs, each designed for different scenarios. Choosing the correct loop improves readability, performance, and maintainability.

This chapter compares:

- while
- do-while
- for
- Enhanced for
- break
- continue
- Labeled break
- Labeled continue

---

# 1. while vs do-while vs for vs Enhanced for

| Feature | while | do-while | for | Enhanced for |
|---------|-------|----------|-----|--------------|
| Loop Type | Entry Controlled | Exit Controlled | Entry Controlled | Entry Controlled |
| Condition Checked | Before | After | Before | Before |
| Executes At Least Once | ❌ | ✅ | ❌ | ❌ |
| Best For | Unknown iterations | Execute at least once | Known iterations | Arrays & Collections |
| Uses Index | Optional | Optional | ✅ | ❌ |
| Reverse Traversal | ✅ | ✅ | ✅ | ❌ |
| Readability | Good | Good | Excellent | Excellent |
| Performance | Same | Same | Same | Same |

---

# 2. Visual Comparison

```text
while

Condition
   ↓
Execute
   ↓
Update

--------------------

do-while

Execute
   ↓
Update
   ↓
Condition

--------------------

for

Initialize
   ↓
Condition
   ↓
Execute
   ↓
Update

--------------------

Enhanced for

Next Element
     ↓
Execute
     ↓
Next Element
```

---

# 3. When Should I Use Which Loop?

### Use `while`

✔ Number of iterations is unknown.

Examples:

- Login validation
- Reading files
- Reading user input
- Waiting for server response

---

### Use `do-while`

✔ Execute at least once.

Examples:

- ATM menu
- Calculator menu
- Game menu

---

### Use `for`

✔ Number of iterations is known.

Examples:

- Print 1–100
- Multiplication tables
- Counting
- Arrays with index

---

### Use Enhanced `for`

✔ Reading arrays or collections.

Examples:

- Print names
- Display products
- Process lists

---

# 4. Comparison of break and continue

| Feature | break | continue |
|---------|-------|----------|
| Stops Loop | ✅ | ❌ |
| Skips Current Iteration | ❌ | ✅ |
| Executes Remaining Iterations | ❌ | ✅ |
| Used In | Loops & switch | Loops Only |

---

# 5. Labeled vs Normal break

| Feature | break | break label |
|---------|-------|-------------|
| Exits Inner Loop | ✅ | ❌ |
| Exits Outer Loop | ❌ | ✅ |

---

# 6. Labeled vs Normal continue

| Feature | continue | continue label |
|---------|-----------|----------------|
| Next Inner Iteration | ✅ | ❌ |
| Next Outer Iteration | ❌ | ✅ |

---

# 7. Time Complexity Comparison

| Loop | Complexity |
|------|------------|
| while | O(n) |
| do-while | O(n) |
| for | O(n) |
| Enhanced for | O(n) |
| Nested Loop | O(n²) |
| Triple Nested Loop | O(n³) |

---

# 8. Space Complexity

Most loops:

```
O(1)
```

---

# 9. Memory Usage

| Loop | Extra Memory |
|------|--------------|
| while | O(1) |
| do-while | O(1) |
| for | O(1) |
| Enhanced for | O(1) |

---

# 10. Counter vs Accumulator

| Counter | Accumulator |
|----------|-------------|
| Counts | Totals |
| count++ | sum += value |
| Number of students | Total marks |
| Number of vowels | Shopping cart total |

---

# 11. Sentinel vs Flag

| Sentinel | Flag |
|----------|------|
| Stops loop | Tracks state |
| -1 | true/false |
| Exit menu | Search found |

---

# 12. Which Loop is Fastest?

Interview Answer:

```
None.
```

The JVM optimizes all loops similarly.

Choose the loop based on **readability and problem requirements**, not speed.

---

# 13. Industry Recommendations

| Situation | Preferred Loop |
|-----------|----------------|
| Arrays | for / enhanced for |
| Collections | Enhanced for |
| Unknown iterations | while |
| Menu programs | do-while |
| Matrix | Nested loops |
| Search | while / for + break |

---

# 14. Decision Tree

```text
Know iterations?

      Yes
       │
       ▼
      for
       │

No
 │
 ▼
while

Need at least one execution?

        Yes
         │
         ▼
     do-while

Reading Arrays?

        Yes
         │
         ▼
   Enhanced for
```

---

# 15. Interview Questions

1. Difference between while and for?
2. Why use do-while?
3. Difference between break and continue?
4. Difference between counter and accumulator?
5. What is a sentinel loop?
6. Which loop is best for arrays?
7. Which loop is best for unknown iterations?
8. Which loop executes at least once?

---

# 16. Quick Revision

```
Known Count
↓

for

Unknown Count
↓

while

Execute Once
↓

do-while

Collections
↓

Enhanced for

Stop Loop
↓

break

Skip Iteration
↓

continue

Exit Outer Loop
↓

Labeled break
```

---

# 17. Bootcamp Insight 💡

Professional developers don't ask:

> "Which loop is faster?"

Instead, they ask:

> "Which loop makes the code easiest to understand and maintain?"

Choosing the right loop is a sign of good software design.

---

# 18. Key Takeaways

- Use `for` when iterations are known.
- Use `while` when iterations are unknown.
- Use `do-while` when at least one execution is required.
- Use enhanced `for` for arrays and collections.
- Use `break` to terminate a loop.
- Use `continue` to skip an iteration.
- Use labeled statements only when necessary.

---

# References

- Oracle Java Documentation
- Java Language Specification
- Effective Java
- Head First Java