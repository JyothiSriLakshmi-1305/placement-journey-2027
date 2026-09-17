# Recursion Introduction

> **Module 20 – Methods**
>
> Recursion is a technique in which a method calls itself to solve a problem by reducing it into smaller versions of the same problem.
>
> **Core idea: Base Case + Recursive Case + Progress Toward the Base Case**

---

## 1. What is Recursion?

Recursion occurs when a method calls itself directly or indirectly.

```java
static void countDown(int n) {

    if (n == 0) {
        return;
    }

    System.out.println(n);

    countDown(n - 1);
}
```

Call:

```java
countDown(5);
```

Output:

```text
5
4
3
2
1
```

---

## 2. Professional Interview Definition ⭐

> **Recursion is a problem-solving technique in which a method calls itself on a smaller or simpler input until a reachable base condition is satisfied.**

A recursive solution normally contains:

```text
Base Case
+
Recursive Case
```

---

## 3. Why Do We Need Recursion?

Recursion is useful when a problem naturally contains smaller versions of itself.

Common examples:

- Factorial
- Fibonacci
- Tree traversal
- Graph traversal
- Binary search
- Merge sort
- Quick sort
- Backtracking
- File-system traversal
- Divide-and-conquer algorithms

---

## 4. Real-Life Analogy

Imagine opening nested boxes:

```text
Box 5
 ↓
Box 4
 ↓
Box 3
 ↓
Box 2
 ↓
Box 1
 ↓
Empty
```

The empty box is similar to the **base case**.

You continue working with a smaller box until the stopping condition is reached.

---

## 5. Basic Recursive Syntax

General form:

```java
returnType method(parameters) {

    if (baseCondition) {
        return baseValue;
    }

    return method(smallerInput);
}
```

For a `void` method:

```java
void method(parameters) {

    if (baseCondition) {
        return;
    }

    method(smallerInput);
}
```

---

## 6. Two Essential Parts ⭐⭐⭐

### Base Case

Stops recursion.

### Recursive Case

Calls the method again with a smaller or simpler problem.

```text
Recursive Method
       ↓
Base Case?
   ↙       ↘
 Yes       No
  ↓         ↓
Stop     Recursive Call
            ↓
       Smaller Input
```

---

## 7. Base Case ⭐⭐⭐

The base case is the condition that stops further recursive calls.

```java
static void countDown(int n) {

    if (n == 0) {
        return;
    }

    System.out.println(n);

    countDown(n - 1);
}
```

Here:

```java
if (n == 0)
```

is the base case.

Without a reachable stopping condition, recursive calls may continue until the call stack is exhausted.

---

## 8. Recursive Case

The recursive case reduces the problem.

```java
countDown(n - 1);
```

For:

```text
n = 5
```

the calls become:

```text
5 → 4 → 3 → 2 → 1 → 0
```

The input moves toward the base case.

---

## 9. First Recursion Program

```java
class Main {

    static void printNumbers(int n) {

        if (n == 0) {
            return;
        }

        System.out.println(n);

        printNumbers(n - 1);
    }

    public static void main(String[] args) {

        printNumbers(5);
    }
}
```

Output:

```text
5
4
3
2
1
```

---

## 10. Execution Flow

For:

```java
printNumbers(3);
```

Execution:

```text
printNumbers(3)
      ↓
print 3
      ↓
printNumbers(2)
      ↓
print 2
      ↓
printNumbers(1)
      ↓
print 1
      ↓
printNumbers(0)
      ↓
return
```

---

## 11. Recursion and the Call Stack ⭐⭐⭐

Every active method invocation requires runtime call information.

For:

```java
countDown(3);
```

conceptually:

```text
countDown(3)
countDown(2)
countDown(1)
countDown(0)
```

The calls return in reverse order.

```text
countDown(0) returns
      ↓
countDown(1) returns
      ↓
countDown(2) returns
      ↓
countDown(3) returns
```

---

## 12. Stack Visualization

```text
Top
┌─────────────────┐
│ countDown(0)    │
├─────────────────┤
│ countDown(1)    │
├─────────────────┤
│ countDown(2)    │
├─────────────────┤
│ countDown(3)    │
└─────────────────┘
Bottom
```

As recursive calls go deeper, the number of active frames increases.

---

## 13. Calling Phase and Returning Phase ⭐⭐⭐

Consider:

```java
static void test(int n) {

    if (n == 0) {
        return;
    }

    System.out.println("Before: " + n);

    test(n - 1);

    System.out.println("After: " + n);
}
```

Call:

```java
test(3);
```

Output:

```text
Before: 3
Before: 2
Before: 1
After: 1
After: 2
After: 3
```

The first statements execute while going deeper.

The statements after the recursive call execute while returning.

---

## 14. Why Does the Output Reverse?

Going down:

```text
3 → 2 → 1
```

Returning:

```text
1 → 2 → 3
```

Therefore:

```java
System.out.println("Before: " + n);
```

prints in descending order, while:

```java
System.out.println("After: " + n);
```

prints in ascending order.

---

## 15. Factorial Using Recursion ⭐⭐⭐

Mathematically:

```text
5! = 5 × 4 × 3 × 2 × 1
```

Recursive definition:

```text
n! = n × (n - 1)!
```

Base case:

```text
0! = 1
```

Java:

```java
static int factorial(int n) {

    if (n == 0) {
        return 1;
    }

    return n * factorial(n - 1);
}
```

Call:

```java
System.out.println(factorial(5));
```

Output:

```text
120
```

---

## 16. Factorial Dry Run

```text
factorial(5)
= 5 × factorial(4)

factorial(4)
= 4 × factorial(3)

factorial(3)
= 3 × factorial(2)

factorial(2)
= 2 × factorial(1)

factorial(1)
= 1 × factorial(0)

factorial(0)
= 1
```

Returning:

```text
1
→ 1
→ 2
→ 6
→ 24
→ 120
```

---

## 17. Sum of N Numbers

Problem:

```text
1 + 2 + 3 + ... + n
```

Recursive relation:

```text
sum(n) = n + sum(n - 1)
```

Base case:

```text
sum(0) = 0
```

Java:

```java
static int sum(int n) {

    if (n == 0) {
        return 0;
    }

    return n + sum(n - 1);
}
```

Call:

```java
System.out.println(sum(5));
```

Output:

```text
15
```

---

## 18. Print N to 1

```java
static void printNumbers(int n) {

    if (n == 0) {
        return;
    }

    System.out.println(n);

    printNumbers(n - 1);
}
```

Call:

```java
printNumbers(5);
```

Output:

```text
5
4
3
2
1
```

---

## 19. Print 1 to N

```java
static void printNumbers(int n) {

    if (n == 0) {
        return;
    }

    printNumbers(n - 1);

    System.out.println(n);
}
```

Call:

```java
printNumbers(5);
```

Output:

```text
1
2
3
4
5
```

The printing happens during the returning phase.

---

## 20. Forward vs Backward Recursion

### Before Recursive Call

```java
System.out.println(n);

method(n - 1);
```

Typical output direction:

```text
N → ... → 1
```

### After Recursive Call

```java
method(n - 1);

System.out.println(n);
```

Typical output direction:

```text
1 → ... → N
```

This is a powerful recursion pattern.

---

## 21. Fibonacci Recursion ⭐⭐⭐

Fibonacci sequence:

```text
0 1 1 2 3 5 8 13 ...
```

Definition:

```text
F(0) = 0
F(1) = 1

F(n) = F(n - 1) + F(n - 2)
```

Java:

```java
static int fibonacci(int n) {

    if (n == 0) {
        return 0;
    }

    if (n == 1) {
        return 1;
    }

    return fibonacci(n - 1) + fibonacci(n - 2);
}
```

---

## 22. Fibonacci Call Tree

For:

```java
fibonacci(4)
```

conceptually:

```text
              fib(4)
             /               fib(3)     fib(2)
         /   \       /   \
     fib(2) fib(1) fib(1) fib(0)
     /   \
 fib(1) fib(0)
```

The same subproblems are calculated repeatedly.

This makes the simple recursive Fibonacci solution inefficient for large inputs.

---

## 23. Recursion vs Iteration ⭐⭐⭐

Many recursive problems can also be solved using loops.

### Recursive

```java
static int sum(int n) {

    if (n == 0) {
        return 0;
    }

    return n + sum(n - 1);
}
```

### Iterative

```java
static int sum(int n) {

    int total = 0;

    for (int i = 1; i <= n; i++) {
        total += i;
    }

    return total;
}
```

Both calculate the same result.

---

## 24. Comparison: Recursion vs Loop

| Feature | Recursion | Loop |
|---|---|---|
| Repetition | Method calls | Iteration |
| Call stack growth | Yes | No recursive growth |
| Stopping mechanism | Base case | Loop condition |
| Stack overflow risk | Possible | Not from recursion |
| Natural for trees | Yes | Often less direct |
| Simple counting | Usually unnecessary | Usually preferred |
| Backtracking | Very useful | More complicated |

---

## 25. When Should We Use Recursion?

Recursion is especially useful for:

```text
Tree structures
Nested structures
Divide-and-conquer
Backtracking
Self-similar problems
```

Examples:

```text
Tree traversal
DFS
Merge sort
Quick sort
Binary search
N-Queens
Permutations
Combinations
Maze solving
```

---

## 26. When Should We Prefer Iteration?

For straightforward repetition:

```text
counting
summing
basic array traversal
simple loops
```

a loop is often simpler.

Example:

```java
for (int i = 0; i < 100; i++) {
    System.out.println(i);
}
```

There is usually no advantage in replacing this with recursion.

---

## 27. Infinite Recursion ⭐⭐⭐

Incorrect:

```java
static void test(int n) {

    System.out.println(n);

    test(n);
}
```

The input never changes.

There is no progress toward termination.

This can eventually produce:

```text
StackOverflowError
```

---

## 28. Recursion Without a Base Case

Incorrect:

```java
static void test(int n) {

    test(n - 1);
}
```

There is no stopping condition.

The call stack can eventually be exhausted.

---

## 29. Base Case That Cannot Be Reached

Incorrect:

```java
static void test(int n) {

    if (n == 0) {
        return;
    }

    test(n + 1);
}
```

Starting with:

```text
n = 5
```

gives:

```text
5 → 6 → 7 → 8 → ...
```

The base case `n == 0` is never reached.

---

## 30. Three Questions for Every Recursive Problem 🧠

### Question 1

What is the smallest valid input?

This helps define the base case.

### Question 2

How can the current problem be reduced to a smaller problem?

This defines the recursive case.

### Question 3

Does every recursive call move toward the base case?

If not, the solution may not terminate.

---

## 31. Recursive Problem-Solving Template

```text
Problem
   ↓
Find smallest case
   ↓
Base Case
   ↓
Reduce problem
   ↓
Recursive Call
   ↓
Eventually reach base case
   ↓
Return / unwind
```

---

## 32. Recursion and Parameters ⭐⭐⭐

Each recursive invocation gets its own parameter state.

```java
static void countDown(int n) {

    if (n == 0) {
        return;
    }

    countDown(n - 1);
}
```

Calls:

```text
n = 3
n = 2
n = 1
n = 0
```

Each invocation has its own `n`.

---

## 33. Recursion and Local Variables

Each recursive invocation has its own local-variable state.

```java
static void test(int n) {

    int value = n * 2;

    if (n == 0) {
        return;
    }

    test(n - 1);
}
```

Conceptually:

```text
Call 1
n = 3
value = 6

Call 2
n = 2
value = 4

Call 3
n = 1
value = 2

Call 4
n = 0
value = 0
```

These belong to different method invocations.

---

## 34. Connection to Method Scope ⭐⭐⭐

From our previous topic:

```text
Each recursive call
       ↓
new method invocation
       ↓
new parameters
       ↓
new local variables
       ↓
new active stack frame
```

This is why recursion is closely connected to method scope and memory.

---

## 35. Recursion and Return Values

Recursive methods can return values.

```java
static int factorial(int n) {

    if (n == 0) {
        return 1;
    }

    return n * factorial(n - 1);
}
```

Each call returns a value to its caller.

---

## 36. Recursion and `void`

Recursion can also use `void`.

```java
static void printNumbers(int n) {

    if (n == 0) {
        return;
    }

    System.out.println(n);

    printNumbers(n - 1);
}
```

No value is returned, but the method still calls itself.

---

## 37. Direct Recursion

A method directly calls itself.

```java
static void test() {

    test();
}
```

This is:

```text
Direct Recursion
```

---

## 38. Indirect Recursion

Two or more methods call each other.

```java
static void methodA(int n) {

    if (n > 0) {
        methodB(n - 1);
    }
}

static void methodB(int n) {

    if (n > 0) {
        methodA(n - 1);
    }
}
```

This is:

```text
Indirect Recursion
```

---

## 39. Tail Recursion

A recursive call is tail-recursive when it is the final operation performed by the method.

```java
static void countDown(int n) {

    if (n == 0) {
        return;
    }

    System.out.println(n);

    countDown(n - 1);
}
```

The recursive call is the final operation.

Important:

> Java does not generally guarantee tail-call optimization, so tail recursion can still consume stack space.

---

## 40. Non-Tail Recursion

```java
static int factorial(int n) {

    if (n == 0) {
        return 1;
    }

    return n * factorial(n - 1);
}
```

After the recursive call returns, multiplication still has to be performed.

Therefore it is not tail recursion.

---

## 41. Recursion Time and Space Complexity

For:

```java
static void countDown(int n) {

    if (n == 0) {
        return;
    }

    countDown(n - 1);
}
```

There are approximately `n` recursive calls.

Time complexity:

```text
O(n)
```

Auxiliary call-stack space:

```text
O(n)
```

---

## 42. Factorial Complexity

```java
static int factorial(int n) {

    if (n == 0) {
        return 1;
    }

    return n * factorial(n - 1);
}
```

Time:

```text
O(n)
```

Auxiliary stack space:

```text
O(n)
```

---

## 43. Fibonacci Complexity

Naive recursive Fibonacci:

```java
static int fibonacci(int n) {

    if (n <= 1) {
        return n;
    }

    return fibonacci(n - 1) + fibonacci(n - 2);
}
```

It repeatedly calculates the same subproblems.

Time complexity:

```text
O(2^n)
```

Recursion depth:

```text
O(n)
```

Optimized solutions can use:

```text
Memoization
Dynamic Programming
Iteration
```

---

## 44. Recursion Tree

For:

```text
F(n) = F(n - 1) + F(n - 2)
```

the calls branch:

```text
                  F(n)
                /                 F(n-1)      F(n-2)
           /   \        /   \
      F(n-2) F(n-3) F(n-3) F(n-4)
```

Repeated subproblems cause unnecessary work.

---

## 45. Recursion and DSA ⭐⭐⭐

Recursion is heavily used in:

### Trees

```text
Preorder
Inorder
Postorder
```

### Graphs

```text
DFS
```

### Searching

```text
Binary Search
```

### Sorting

```text
Merge Sort
Quick Sort
```

### Backtracking

```text
N-Queens
Maze
Permutations
Combinations
Sudoku
```

---

## 46. Recursion and Binary Search

Binary search repeatedly reduces the search space.

```text
Array
 ↓
Choose middle
 ↓
Discard one half
 ↓
Search remaining half
 ↓
Repeat
```

This naturally fits recursive problem solving.

---

## 47. Recursion and Tree Traversal

A tree contains subtrees:

```text
Tree
 ├── Left Subtree
 │     ├── ...
 │
 └── Right Subtree
       ├── ...
```

A subtree is itself a tree.

This self-similar structure makes recursion natural for tree algorithms.

---

## 48. Recursion and Backtracking

Backtracking commonly follows:

```text
Choose
 ↓
Explore
 ↓
Undo
 ↓
Try another choice
```

Examples:

```text
N-Queens
Permutations
Combinations
Maze
Sudoku
```

---

## 49. Debugging Recursive Programs

Use tracing output:

```java
static void test(int n) {

    System.out.println("Entering: " + n);

    if (n == 0) {
        System.out.println("Base case");
        return;
    }

    test(n - 1);

    System.out.println("Returning: " + n);
}
```

This visualizes:

```text
enter
 ↓
deeper call
 ↓
base case
 ↓
return
```

---

## 50. Dry Run Strategy ⭐⭐⭐

For recursion, make a call table:

| Call | `n` | Action |
|---|---:|---|
| 1 | 3 | Recursive call |
| 2 | 2 | Recursive call |
| 3 | 1 | Recursive call |
| 4 | 0 | Base case |

Then trace the return phase.

This is extremely useful in coding interviews.

---

## 51. Common Mistakes ⭐⭐⭐

### Mistake 1 — Missing Base Case

```java
static void test(int n) {
    test(n - 1);
}
```

### Mistake 2 — Base Case Is Unreachable

```java
test(n + 1);
```

when the base case requires `n` to decrease.

### Mistake 3 — No Progress

```java
test(n);
```

The input does not become smaller.

### Mistake 4 — Incorrect Recursive Input

```java
return factorial(n);
```

The same input is passed again.

### Mistake 5 — Ignoring Stack Usage

Deep recursion can cause:

```text
StackOverflowError
```

---

## 52. Interview Questions ⭐⭐⭐

### Q1. What is recursion?

Recursion is a technique where a method calls itself on a smaller or simpler input until a reachable base case is satisfied.

### Q2. What are the two essential parts of recursion?

```text
Base Case
Recursive Case
```

### Q3. Why is a base case necessary?

It terminates the recursive process.

### Q4. What happens without a reachable base case?

Recursive calls may continue until the call stack is exhausted, potentially causing `StackOverflowError`.

### Q5. Does recursion use extra memory?

Yes. Active recursive calls require call-stack space.

### Q6. What is direct recursion?

A method directly calls itself.

### Q7. What is indirect recursion?

Two or more methods call one another recursively.

### Q8. What is tail recursion?

A recursive call that is the final operation of the method.

### Q9. Does Java guarantee tail-call optimization?

No.

### Q10. What is the difference between recursion and iteration?

Recursion uses method calls and the call stack; iteration uses loops.

### Q11. Why is naive recursive Fibonacci inefficient?

It repeatedly solves the same subproblems.

### Q12. What is stack unwinding?

It is the process of returning from completed recursive calls in reverse order.

### Q13. Does every recursive call have its own local variables?

Yes. Each method invocation has its own parameter and local-variable state.

---

## 53. Placement-Level Answer ⭐⭐⭐

If an interviewer asks:

> **"Explain recursion."**

Answer:

> **"Recursion is a technique where a method calls itself with a smaller or simpler input until a reachable base case is reached. A recursive solution contains a base case for termination and a recursive case that reduces the problem. Each invocation has its own method state and contributes to call-stack usage."**

---

## 54. Recursive Problem-Solving Checklist 🧠

Before submitting a recursive solution:

```text
☐ Is there a base case?
☐ Can the base case be reached?
☐ Does every call reduce the problem?
☐ Is the return value correct?
☐ What is the time complexity?
☐ What is the recursion depth?
☐ What is the auxiliary stack space?
☐ Could recursion become too deep?
☐ Would iteration be simpler?
```

---

# 55. Practice Problems

## Beginner

### Problem 1

Write a recursive method to print:

```text
1 2 3 4 5
```

### Problem 2

Write a recursive method to print:

```text
5 4 3 2 1
```

### Problem 3

Find the factorial of `n` using recursion.

### Problem 4

Find the sum of the first `n` natural numbers using recursion.

### Problem 5

Find:

```text
a^b
```

using recursion.

---

## Intermediate

### Problem 6

Find the nth Fibonacci number using recursion.

### Problem 7

Count the number of digits in an integer using recursion.

### Problem 8

Find the sum of digits of a number using recursion.

### Problem 9

Reverse a string using recursion.

### Problem 10

Check whether a string is a palindrome using recursion.

---

## Placement Practice ⭐

### Problem 11

Implement recursive binary search.

### Problem 12

Find the greatest common divisor using recursion.

### Problem 13

Find the maximum element in an array using recursion.

### Problem 14

Implement recursive array traversal.

### Problem 15

Implement factorial and explain its call stack.

### Problem 16

Compare recursive Fibonacci with iterative Fibonacci and explain the complexity difference.

---

# 56. Quick Revision ⭐⭐⭐

```text
RECURSION
    ↓
Method calls itself
    ↓
Base Case
    ↓
Recursive Case
    ↓
Smaller Problem
    ↓
Base Case
    ↓
Stack Unwinding
```

Remember:

```text
Base Case
→ stops recursion

Recursive Case
→ reduces problem

Call Stack
→ stores active recursive calls

Stack Unwinding
→ returns through previous calls
```

---

# 57. Key Takeaways

- Recursion is a method calling itself.
- Java recursion uses method invocations and call-stack space.
- A recursive solution needs a reachable termination condition.
- The base case stops further recursion.
- The recursive case reduces the problem.
- Each recursive invocation has its own parameters and local variables.
- Recursion has a calling phase and a returning/unwinding phase.
- Deep recursion can cause `StackOverflowError`.
- Recursion is natural for trees, graphs, divide-and-conquer, and backtracking.
- Simple counting and accumulation are often easier with loops.
- Tail recursion makes the recursive call the final operation, but Java does not generally guarantee tail-call optimization.
- Naive recursive Fibonacci has exponential time because of repeated subproblems.
- Recursion is an important foundation for DSA and technical interviews.

---

# 58. Module 20 Progress

```text
✅ 01_Introduction.md
✅ 02_WhyMethods.md
✅ 03_MethodSyntax.md
✅ 04_MethodDeclarationAndCalling.md
✅ 05_MethodParameters.md
✅ 06_ReturnValues.md
✅ 07_VoidMethods.md
✅ 08_MethodOverloading.md
✅ 09_StaticMethods.md
✅ 10_InstanceMethods.md
✅ 11_MethodScope.md
✅ 12_PassByValue.md
✅ 13_RecursionIntroduction.md

⏳ 14_MethodsAndMemory.md
⏳ 15_AdvancedInterviewMethods.md
⏳ 16_MethodCheatSheet.md
```

---

# References

- Oracle Java Documentation
- Java Language Specification
- Effective Java — Joshua Bloch
- Head First Java
