# Java Precision Loss

## What is Precision Loss?

**Precision Loss** occurs when a value loses some of its accuracy while being converted from one data type to another.

It usually happens when converting a **larger or more precise data type** into a **smaller or less precise data type**.

---

# Why Do We Need to Learn Precision Loss?

When working with numbers, especially decimal values, Java may not always store the exact original value after conversion.

Understanding Precision Loss helps us:

- Avoid unexpected results.
- Prevent data corruption.
- Write accurate mathematical programs.
- Understand type casting better.

---

# Real-World Analogy

Imagine measuring water using a measuring cup.

```
Actual Water

↓

1.987 Liters
```

Now your measuring cup can only measure whole liters.

```
↓

1 Liter
```

The remaining value is lost.

Similarly, Java may lose precision during type conversion.

---

# Definition

Precision Loss is the loss of numerical accuracy when converting between data types with different precision or range.

---

# When Does Precision Loss Occur?

Precision loss commonly occurs during:

- Narrowing Casting
- Large integer to floating-point conversion
- Floating-point to integer conversion

---

# Example 1 - double to int

```java
double value = 9.99;

int number = (int) value;

System.out.println(number);
```

### Output

```
9
```

Explanation

```
9.99

↓

(int)

↓

9
```

The decimal part is discarded.

---

# Example 2 - float to int

```java
float marks = 95.75f;

int result = (int) marks;

System.out.println(result);
```

### Output

```
95
```

The decimal value is removed.

---

# Example 3 - long to float

```java
long number = 123456789123L;

float value = number;

System.out.println(value);
```

### Output

```
1.23456791E11
```

Explanation

A `float` has only about **7 decimal digits of precision**, so it cannot exactly represent very large integers.

---

# Example 4 - int to float

```java
int number = 16777217;

float value = number;

System.out.println(value);
```

### Output

```
1.6777216E7
```

Explanation

A `float` cannot exactly represent every integer larger than **16,777,216 (2²⁴)**.

The stored value is rounded internally.

---

# Example 5 - double to float

```java
double value = 123.456789123;

float result = (float) value;

System.out.println(result);
```

### Output

```
123.45679
```

Explanation

A `float` stores fewer decimal digits than a `double`, so some precision is lost.

---

# Memory Diagram

```
double

123.456789123

↓

(float)

↓

123.45679
```

Some digits are lost because `float` has lower precision.

---

# Difference Between Data Loss and Precision Loss

| Data Loss | Precision Loss |
|-----------|----------------|
| Information is removed completely | Value changes slightly due to limited precision |
| Example: `9.99 → 9` | Example: `123.456789123 → 123.45679` |
| Usually occurs in narrowing | Can occur in floating-point conversions |

---

# Internal Working

Example

```java
double d = 12.987654321;

float f = (float) d;
```

Step 1

```
double

↓

12.987654321
```

Step 2

```
float
```

can store fewer significant digits.

Step 3

Java rounds the value.

```
↓

12.987655
```

---

# Common Mistakes

## Mistake 1

Assuming all decimal values remain exactly the same.

```java
double d = 10.123456789;

float f = (float) d;
```

The values may not be identical.

---

## Mistake 2

Confusing Precision Loss with Overflow.

Precision Loss

```
123.456789

↓

123.45679
```

Overflow

```
130

↓

byte

↓

-126
```

These are different concepts.

---

# Best Practices

- Use `double` for high-precision decimal calculations.
- Avoid unnecessary conversions between floating-point types.
- Be careful when converting decimal values to integers.
- Choose the appropriate data type based on required precision.

---

# Interview Questions

### Q1. What is Precision Loss?

Precision Loss is the loss of numerical accuracy during data type conversion.

---

### Q2. Does Precision Loss always mean Data Loss?

No.

Precision Loss means the value becomes less accurate, while Data Loss means information is removed completely.

---

### Q3. Which conversion is more likely to cause Precision Loss?

```
double

↓

float
```

---

### Q4. Output

```java
double d = 9.99;

int i = (int)d;

System.out.println(i);
```

Answer

```
9
```

---

### Q5. Why is `double` preferred over `float`?

Because `double` provides higher precision and can store more significant digits.

---

# MCQs

### 1. Precision Loss commonly occurs during

A. Widening

B. Floating-point conversion

C. Variable declaration

D. Comments

**Answer:** B

---

### 2. Output

```java
double d = 7.89;

int i = (int)d;
```

A. 7

B. 8

C. 7.89

D. Error

**Answer:** A

---

### 3. Which data type has higher precision?

A. float

B. double

**Answer:** B

---

### 4. Precision Loss means

A. Complete data removal

B. Loss of numerical accuracy

C. Compile-time error

D. Runtime error

**Answer:** B

---

# Coding Exercises

1. Convert `double` to `float`.
2. Convert `double` to `int`.
3. Convert a large `long` to `float`.
4. Observe precision differences between `float` and `double`.
5. Print results before and after conversion.

---

# Assignment

Write a Java program that demonstrates:

- `double → int`
- `double → float`
- `long → float`

Print the original value and the converted value.

Explain whether **Data Loss**, **Precision Loss**, or **both** occurred.

---

# Revision Notes

- Precision Loss = Loss of numerical accuracy.
- Common in floating-point conversions.
- `double` has higher precision than `float`.
- Converting decimal values to integers removes the fractional part.
- Precision Loss is different from Overflow.

---

# Key Takeaways

- Precision Loss occurs when converting between data types with different precision.
- `double → float` may lose decimal accuracy.
- `double → int` removes the fractional part.
- Choose data types carefully for mathematical calculations.
- Understanding Precision Loss helps avoid unexpected results in Java programs.

---

## References

- Oracle Java Documentation
- https://docs.oracle.com/en/java/