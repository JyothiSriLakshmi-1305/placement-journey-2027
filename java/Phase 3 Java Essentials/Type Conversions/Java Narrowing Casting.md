# Java Narrowing Casting (Explicit Type Casting)

## What is Narrowing Casting?

**Narrowing Casting** is the process of converting a **larger data type into a smaller data type**.

Unlike Widening Casting, Java **does not perform this conversion automatically** because there is a possibility of **data loss**.

The programmer must explicitly instruct Java to perform the conversion.

It is also known as:

- Explicit Casting
- Manual Type Conversion

---

# Why Do We Need Narrowing Casting?

Sometimes we need to store a larger data type into a smaller one.

Examples:

- Converting `double` to `int`
- Saving memory
- Removing decimal values
- Reading large values and storing only the integer part

Example

```java
double cgpa = 8.95;

int value = (int) cgpa;
```

Output

```
8
```

---

# Real-World Analogy

Imagine pouring water from a **large bucket** into a **small glass**.

```
Large Bucket
      ↓
Small Glass
```

The glass cannot hold all the water.

Some water is lost.

Similarly, during Narrowing Casting, some data may be lost.

---

# Definition

Narrowing Casting converts a **larger data type** into a **smaller data type**.

Since the smaller data type may not be able to store all the information, Java requires **explicit casting**.

---

# Conversion Order

```
double
   ↓
float
   ↓
long
   ↓
int
   ↓
short
   ↓
byte
```

Each conversion moves from a **larger** data type to a **smaller** one.

---

# Why is Explicit Casting Required?

Java prevents accidental data loss.

For example,

```java
double price = 199.99;

int amount = price;
```

❌ Compile-time Error

Java asks the programmer:

> "Are you sure you want to lose data?"

The correct code is:

```java
int amount = (int) price;
```

---

# Syntax

```java
smallerDataType variable = (smallerDataType) largerVariable;
```

Example

```java
int number = (int) value;
```

---

# Internal Working

Example

```java
double salary = 45678.95;

int amount = (int) salary;
```

### Step 1

```
salary

↓

45678.95
```

### Step 2

Java checks

```
double

↓

int

↓

Possible Data Loss
```

### Step 3

Programmer explicitly casts

```
(int)
```

### Step 4

Java removes the decimal part

```
45678.95

↓

45678
```

---

# Memory Diagram

```
double

45678.95

↓

(int)

↓

45678

↓

int
```

---

# Example 1 - double to int

```java
double number = 25.75;

int value = (int) number;

System.out.println(value);
```

### Output

```
25
```

---

# Example 2 - float to int

```java
float marks = 98.9f;

int result = (int) marks;

System.out.println(result);
```

### Output

```
98
```

---

# Example 3 - long to short

```java
long number = 150;

short value = (short) number;

System.out.println(value);
```

### Output

```
150
```

---

# Example 4 - int to byte

```java
int number = 130;

byte value = (byte) number;

System.out.println(value);
```

### Output

```
-126
```

**Explanation:**

A `byte` can store values only from **-128 to 127**.

Since `130` is outside this range, **overflow** occurs.

---

# Data Loss Example

```java
double d = 9.99;

int i = (int) d;

System.out.println(i);
```

### Output

```
9
```

The decimal part is **discarded**, not rounded.

---

# Overflow Example

```java
int number = 260;

byte b = (byte) number;

System.out.println(b);
```

### Output

```
4
```

Because:

```
260 % 256 = 4
```

This is called **overflow**.

---

# Example Program

```java
public class NarrowingCastingDemo {

    public static void main(String[] args) {

        double cgpa = 8.95;
        int marks = (int) cgpa;

        float salary = 45678.45f;
        int amount = (int) salary;

        int number = 130;
        byte value = (byte) number;

        System.out.println("Double to Int : " + marks);
        System.out.println("Float to Int  : " + amount);
        System.out.println("Int to Byte   : " + value);

    }
}
```

### Output

```
Double to Int : 8
Float to Int  : 45678
Int to Byte   : -126
```

---

# Common Mistakes

## Mistake 1

Forgetting explicit casting.

Incorrect

```java
double d = 10.5;

int a = d;
```

Compile-time Error

Correct

```java
int a = (int) d;
```

---

## Mistake 2

Expecting rounding.

```java
double d = 9.99;

int a = (int) d;
```

Output

```
9
```

Not

```
10
```

---

## Mistake 3

Ignoring overflow.

```java
int number = 500;

byte b = (byte) number;
```

The value changes because it exceeds the byte range.

---

# Best Practices

- Avoid unnecessary narrowing.
- Always check for possible data loss.
- Use explicit casting only when required.
- Be careful with decimal values.
- Know the range of each primitive data type.

---

# Interview Questions

### Q1. What is Narrowing Casting?

Narrowing Casting converts a larger data type into a smaller data type using explicit casting.

---

### Q2. Why does Java require explicit casting?

Because narrowing may cause data loss or overflow.

---

### Q3. What happens to decimal values?

The decimal part is discarded.

---

### Q4. Output

```java
double d = 45.99;

int i = (int)d;

System.out.println(i);
```

Answer

```
45
```

---

### Q5. What is overflow?

Overflow occurs when a value exceeds the range of the destination data type.

---

# MCQs

### 1. Which casting requires explicit conversion?

A. Widening

B. Narrowing

C. Promotion

D. Automatic

**Answer:** B

---

### 2. Output

```java
double d = 18.75;

int i = (int)d;
```

A. 18

B. 19

C. 18.75

D. Error

**Answer:** A

---

### 3. Which conversion may lose data?

A. int → double

B. byte → int

C. double → int

D. short → long

**Answer:** C

---

### 4. Why does Java not perform narrowing automatically?

A. It is slower

B. It may cause data loss

C. It uses more memory

D. It is not supported

**Answer:** B

---

# Coding Exercises

1. Convert double to int.
2. Convert float to long.
3. Convert int to byte.
4. Convert long to short.
5. Observe overflow with byte values.

---

# Assignment

Write a Java program that demonstrates:

- double → int
- float → int
- long → short
- int → byte

Print the values before and after conversion.

---

# Revision Notes

- Narrowing = Larger → Smaller
- Requires explicit casting
- May cause data loss
- May cause overflow
- Decimal values are discarded, not rounded

---

# Key Takeaways

- Narrowing Casting converts larger data types into smaller ones.
- Java requires explicit casting because data may be lost.
- Decimal values are truncated during conversion.
- Overflow occurs when values exceed the target type's range.
- Always understand the destination type's range before narrowing.

---

## References

- Oracle Java Documentation
- https://docs.oracle.com/en/java/