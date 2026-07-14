# Java Type Casting

## What is Type Casting?

Type Casting is the process of **converting one data type into another**.

Java allows us to convert values from one data type to another when required.

Example:

```java
int age = 20;
double salary = age;
```

Here, the integer value is converted into a double value.

---

# Why Do We Need Type Casting?

Different situations require different data types.

For example:

- Storing marks as `int`
- Calculating average as `double`
- Reading sensor values as `float`
- Displaying salary as `double`

To use values between different data types, Java performs **Type Casting**.

Example

```java
int marks = 95;

double percentage = marks;
```

Output

```
95.0
```

---

# Real-World Analogy

Imagine two containers.

### Widening

```
Small Glass
      ↓
Large Bucket
```

Water easily fits into the larger bucket.

No data is lost.

---

### Narrowing

```
Large Bucket
      ↓
Small Glass
```

Some water may overflow.

Some data may be lost.

This is exactly how Java Type Casting works.

---

# Definition

Type Casting is the process of converting a value from one data type to another.

Java supports two types of type casting:

- Widening Casting (Implicit)
- Narrowing Casting (Explicit)

---

# Types of Type Casting

```
Type Casting

│

├── Widening Casting (Implicit)

│

└── Narrowing Casting (Explicit)
```

---

# 1. Widening Casting (Implicit)

Widening casting converts a **smaller data type into a larger data type**.

Java performs this conversion automatically because there is no risk of data loss.

### Conversion Order

```
byte

↓

short

↓

int

↓

long

↓

float

↓

double
```

---

# Example

```java
int number = 50;

double value = number;

System.out.println(value);
```

Output

```
50.0
```

---

# Why is it Safe?

Because a larger data type can store all the values of the smaller data type.

Example

```
int

↓

double
```

No information is lost.

---

# 2. Narrowing Casting (Explicit)

Narrowing casting converts a **larger data type into a smaller data type**.

Java does **not** perform this automatically because data may be lost.

The programmer must explicitly tell Java to perform the conversion.

### Conversion Order

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

---

# Example

```java
double number = 25.75;

int value = (int) number;

System.out.println(value);
```

Output

```
25
```

The decimal part is removed.

---

# Why is Explicit Casting Required?

Because converting from a larger type to a smaller type may cause:

- Loss of decimal values
- Loss of range
- Overflow

Java requires explicit casting to make the programmer aware of this risk.

---

# Difference Between Widening and Narrowing

| Widening | Narrowing |
|----------|-----------|
| Smaller → Larger | Larger → Smaller |
| Automatic | Manual |
| No data loss | Possible data loss |
| Safe | Risky |

---

# Internal Working

## Widening

```java
int number = 100;

double value = number;
```

Memory

```
100

↓

int

↓

double

↓

100.0
```

---

## Narrowing

```java
double value = 45.89;

int number = (int) value;
```

Memory

```
45.89

↓

double

↓

(int)

↓

45
```

---

# Type Promotion

When Java performs arithmetic operations on smaller data types, they are automatically promoted to `int`.

Example

```java
byte a = 10;
byte b = 20;

int c = a + b;

System.out.println(c);
```

Output

```
30
```

Although `a` and `b` are `byte`, the result is `int`.

---

# Example Program

```java
public class TypeCastingDemo {

    public static void main(String[] args) {

        // Widening

        int number = 100;

        double value = number;

        System.out.println(value);

        // Narrowing

        double salary = 45678.95;

        int amount = (int) salary;

        System.out.println(amount);

    }

}
```

Output

```
100.0
45678
```

---

# Common Mistakes

## 1. Narrowing Without Casting

Incorrect

```java
double d = 20.5;

int a = d;
```

Compile-time Error

Correct

```java
int a = (int) d;
```

---

## 2. Assuming Decimal Values are Rounded

```java
double d = 9.99;

int a = (int)d;
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

## 3. Ignoring Data Loss

```java
long number = 5000000000L;

int value = (int) number;
```

The value may overflow.

---

# Best Practices

- Use widening casting whenever possible.
- Avoid unnecessary narrowing.
- Cast explicitly only when required.
- Be careful when converting decimal values to integers.
- Use meaningful variable names.

---

# Interview Questions

### Q1

What is Type Casting?

Type Casting is the process of converting one data type into another.

---

### Q2

What are the two types of Type Casting?

- Widening Casting
- Narrowing Casting

---

### Q3

Why is narrowing casting explicit?

Because it may cause data loss.

---

### Q4

Output

```java
double d = 20.8;

int a = (int)d;

System.out.println(a);
```

Answer

```
20
```

---

### Q5

Why does `byte + byte` return `int`?

Because Java performs **Type Promotion** during arithmetic operations.

---

# MCQs

### 1

Which type casting is automatic?

A. Narrowing

B. Widening

C. Explicit

D. Manual

**Answer:** B

---

### 2

Which type casting may lose data?

A. Widening

B. Narrowing

C. Automatic

D. Promotion

**Answer:** B

---

### 3

Output

```java
double d = 15.75;

int a = (int)d;

System.out.println(a);
```

A. 15

B. 16

C. 15.75

D. Error

**Answer:** A

---

### 4

Which keyword is used for explicit casting?

A. cast

B. convert

C. Data type inside parentheses

D. change

**Answer:** C

---

# Coding Exercises

1. Convert int to double.
2. Convert double to int.
3. Convert float to long.
4. Convert long to byte.
5. Demonstrate type promotion.
6. Predict outputs after casting.

---

# Assignment

Write a Java program that:

- Demonstrates widening casting.
- Demonstrates narrowing casting.
- Demonstrates type promotion.
- Prints the result of each conversion.

---

# Revision Notes

- Type Casting converts one data type into another.
- Two types:
  - Widening (Automatic)
  - Narrowing (Manual)
- Widening is safe.
- Narrowing may lose data.
- Type Promotion converts smaller integer types to `int` during arithmetic operations.

---

# Key Takeaways

- Java automatically performs widening conversions.
- Narrowing conversions require explicit casting.
- Data loss may occur during narrowing.
- Type Promotion is applied during arithmetic operations.
- Understanding Type Casting helps avoid conversion errors.

---

## References

- Oracle Java Documentation
- https://docs.oracle.com/en/java/