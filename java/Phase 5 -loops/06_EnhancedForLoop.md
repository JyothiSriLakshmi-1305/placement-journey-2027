# Enhanced For Loop (For-Each Loop)

> **Module 18 – Loops**

---

# Introduction

The **Enhanced For Loop**, also known as the **for-each loop**, was introduced in **Java 5** to simplify iterating over arrays and collections.

Before Java 5, programmers used traditional `for` loops to access array elements using indexes. Although effective, this approach required extra code and increased the possibility of index-related errors.

The enhanced for loop makes iteration cleaner, more readable, and less error-prone.

It is especially useful when you only need to **read every element** and do not require the element's index.

---

# History

Before Java 5, developers used only:

- while loop
- do-while loop
- traditional for loop

To simplify array and collection traversal, Java 5 introduced the **Enhanced For Loop**, inspired by similar constructs in other programming languages.

---

# Evolution

```
Repeated Statements

↓

while Loop

↓

for Loop

↓

Enhanced For Loop
(Java 5)

↓

Collections Framework
```

---

# Why Do We Need an Enhanced For Loop?

Suppose we have an array:

```java
int[] marks = {80, 75, 92, 68, 89};
```

Traditional for loop:

```java
for(int i = 0; i < marks.length; i++){

    System.out.println(marks[i]);

}
```

Enhanced for loop:

```java
for(int mark : marks){

    System.out.println(mark);

}
```

The enhanced for loop removes the need for:

- index variables
- boundary conditions
- array indexing

making the code shorter and easier to understand.

---

# Problem Statement

Suppose a school wants to print marks of every student stored in an array.

The program only needs to display the marks, not their positions.

The enhanced for loop is the perfect choice.

---

# Real-Life Analogy

Imagine a teacher distributing answer sheets.

Instead of saying:

```
Go to Desk 1

↓

Take Paper

↓

Go to Desk 2

↓

Take Paper

↓

...
```

The teacher simply says:

```
Take each paper one by one.
```

That is exactly how the enhanced for loop works.

---

# Daily Life Applications

- Reading contact lists
- Displaying songs in a playlist
- Showing products in an online store
- Displaying notifications
- Reading messages

---

# Industry Applications

The enhanced for loop is commonly used for:

- Arrays
- ArrayLists
- HashSets
- LinkedLists
- Queues
- Lists of employees
- Lists of customers
- Product catalogs

---

# Definition

The **Enhanced For Loop** is a simplified version of the traditional `for` loop used to iterate through arrays and collections without explicitly using indexes.

---

# Syntax

```java
for(dataType variable : collection){

    // statements

}
```

---

# Syntax Breakdown

## dataType

Type of each element.

Example

```java
int
```

---

## variable

Stores the current element.

Example

```java
num
```

---

## collection

The array or collection being traversed.

Example

```java
numbers
```

---

# Flow Diagram

```
        Start
          │
          ▼
 Select First Element
          │
          ▼
 Execute Body
          │
          ▼
 Next Element Available?
      /           \
    Yes           No
     │             │
     ▼             ▼
Next Element      End
```

---

# Internal Working

Example

```java
int[] arr = {10,20,30};
```

Execution

```
Current Element = 10

↓

Print

↓

Current Element = 20

↓

Print

↓

Current Element = 30

↓

Print

↓

End
```

Internally, Java still uses an iterator (for collections) or index-based traversal (for arrays), but this complexity is hidden from the programmer.

---

# Memory Representation

```
Array

Index

0 → 10

1 → 20

2 → 30

↓

Enhanced for loop

↓

num = 10

↓

num = 20

↓

num = 30
```

---

# Dry Run

Example

```java
int[] arr = {5,10,15};
```

```java
for(int num : arr){

    System.out.println(num);

}
```

| Iteration | Current Element | Output |
|-----------|----------------:|--------|
| 1 | 5 | 5 |
| 2 | 10 | 10 |
| 3 | 15 | 15 |

---

# Example 1 – Print Array Elements

```java
int[] arr = {1,2,3,4,5};

for(int num : arr){

    System.out.print(num + " ");

}
```

Output

```
1 2 3 4 5
```

---

# Example 2 – Print Names

```java
String[] names = {

    "Ram",
    "Sita",
    "John"

};

for(String name : names){

    System.out.println(name);

}
```

Output

```
Ram
Sita
John
```

---

# Example 3 – Sum of Array

```java
int[] arr = {10,20,30};

int sum = 0;

for(int num : arr){

    sum += num;

}

System.out.println(sum);
```

Output

```
60
```

---

# Advantages

- Cleaner syntax
- No index management
- Easier to read
- Fewer chances of index errors
- Ideal for traversing arrays and collections

---

# Limitations

- Cannot directly access indexes.
- Cannot easily traverse in reverse.
- Cannot skip elements using index values.
- Not suitable when modifying array elements by index.

---

# Best Practices

- Use enhanced for when you only need to read elements.
- Use traditional for when indexes are required.
- Keep loop bodies simple.
- Use meaningful variable names.

---

# Common Mistakes

❌ Expecting the loop variable to change the original array element (for primitive types).

❌ Trying to access indexes inside the loop.

❌ Using enhanced for when reverse traversal is required.

---

# Time Complexity

Traversing an array of size **n**

```
O(n)
```

Space Complexity

```
O(1)
```

---

# Comparison with Traditional For Loop

| Traditional For | Enhanced For |
|-----------------|--------------|
| Uses indexes | No indexes |
| More flexible | Simpler |
| Reverse traversal possible | Not directly |
| Can modify by index | Mainly for reading |

---

# When Should You Use Enhanced For?

Use it when:

- Reading every array element.
- Traversing collections.
- No index is required.
- Code readability is important.

---

# Interview Questions

### When was the enhanced for loop introduced?

Java 5.

---

### Can we get the index in an enhanced for loop?

No.

---

### Which is better: for or enhanced for?

Neither is universally better. Use the traditional `for` loop when you need indexes or more control, and use the enhanced `for` loop when you simply want to read each element.

---

### Can enhanced for work with ArrayList?

Yes.

It works with arrays and classes that implement the `Iterable` interface.

---

# MCQ

What is the output?

```java
int[] arr = {2,4,6};

for(int x : arr){

    System.out.print(x + " ");

}
```

A. 2 4 6

B. 0 1 2

C. Compilation Error

D. Infinite Loop

**Answer:** A

---

# Coding Exercises

### Beginner

1. Print all array elements.
2. Find the sum of array elements.
3. Find the largest number.
4. Find the smallest number.
5. Count even numbers.

### Intermediate

6. Count odd numbers.
7. Count positive and negative numbers.
8. Find average.
9. Print names longer than five characters.
10. Count vowels in a string array.

---

# Debugging Tips

- Verify the array or collection is initialized.
- Ensure the element type matches the variable type.
- Remember that changing the loop variable does not modify primitive array elements.

---

# Quick Revision

| Feature | Enhanced For |
|---------|---------------|
| Introduced | Java 5 |
| Uses Index | ❌ |
| Arrays | ✅ |
| Collections | ✅ |
| Entry-Controlled | ✅ |
| Time Complexity | O(n) |

---

# Bootcamp Insight 💡

The enhanced for loop is widely used in enterprise Java applications, especially when working with collections such as `ArrayList`, `HashSet`, and `LinkedList`. Mastering it will make your code cleaner and prepare you for the Java Collections Framework.

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

Collections Framework

↓

Streams API
```

---

# Future Topic

Next, you'll learn **Nested Loops**, which are essential for solving pattern problems, working with matrices, and many algorithmic challenges.

---

# Key Takeaways

- Enhanced for loop was introduced in Java 5.
- It simplifies traversing arrays and collections.
- It does not provide direct access to indexes.
- It is ideal for read-only traversal.
- It improves code readability and reduces boilerplate.

---

# References

- Oracle Java Documentation
- Java Language Specification (JLS)
- Effective Java – Joshua Bloch
- Head First Java