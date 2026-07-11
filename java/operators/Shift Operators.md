# Java Shift Operators

## What are Shift Operators?

Shift operators are used to **shift the bits of a number to the left or right**.

They work on the binary representation of integer values.

Shift operators are commonly used in:

- Performance optimization
- Bit manipulation
- Cryptography
- Embedded systems
- Competitive programming

---

# Why Do We Need Shift Operators?

Shift operators help us:

- Multiply numbers by powers of 2
- Divide numbers by powers of 2
- Manipulate bits efficiently
- Improve performance in certain low-level operations

Example

```java
int a = 5;

System.out.println(a << 1);
```

Output

```
10
```

---

# Prerequisite

Before learning shift operators, you should know:

- Binary numbers
- Bitwise operators

Example

```
Decimal 5

↓

Binary

00000101
```

---

# Types of Shift Operators

| Operator | Name | Description |
|----------|------|-------------|
| << | Left Shift | Shifts bits to the left |
| >> | Signed Right Shift | Shifts bits to the right while preserving the sign |
| >>> | Unsigned Right Shift | Shifts bits to the right and fills leading bits with 0 |

---

# 1. Left Shift (<<)

Moves all bits towards the left.

Each left shift is approximately equal to multiplying by **2**.

### Syntax

```java
number << positions
```

### Example

```java
int a = 5;

System.out.println(a << 1);
```

Binary

```
5

00000101

↓

Shift Left by 1

00001010
```

Output

```
10
```

---

### Example

```java
System.out.println(5 << 2);
```

Output

```
20
```

---

# Formula

```
number << n

=

number × 2ⁿ
```

Example

```
5 << 2

=

5 × 4

=

20
```

---

# 2. Signed Right Shift (>>)

Moves bits towards the right.

The leftmost bit (sign bit) is preserved.

Each right shift is approximately equal to dividing by **2**.

### Syntax

```java
number >> positions
```

### Example

```java
int a = 20;

System.out.println(a >> 2);
```

Binary

```
20

00010100

↓

00000101
```

Output

```
5
```

---

# Formula

```
number >> n

=

number / 2ⁿ
```

Example

```
20 >> 2

=

20 / 4

=

5
```

---

# 3. Unsigned Right Shift (>>>)

Moves bits to the right.

Unlike `>>`, it always fills the leftmost bits with **0**.

It is mainly useful with negative numbers.

### Example

```java
int a = -20;

System.out.println(a >>> 2);
```

Output

```
1073741819
```

---

# Difference Between >> and >>>

| >> | >>> |
|----|------|
| Preserves sign bit | Fills leftmost bits with 0 |
| Used for signed numbers | Used for unsigned shifting |
| Negative numbers remain negative | May become large positive values |

---

# Internal Working

Example

```java
int a = 5;

System.out.println(a << 1);
```

Step 1

```
5

↓

00000101
```

Step 2

Shift left

```
00001010
```

Step 3

Convert back

```
10
```

---

# Example Program

```java
public class ShiftDemo {

    public static void main(String[] args) {

        int a = 20;

        System.out.println("Left Shift       : " + (a << 1));

        System.out.println("Right Shift      : " + (a >> 1));

        System.out.println("Unsigned Shift   : " + (a >>> 1));

    }
}
```

### Output

```
Left Shift       : 40
Right Shift      : 10
Unsigned Shift   : 10
```

---

# Common Mistakes

## Confusing << with <

Incorrect

```java
a < < 1
```

Correct

```java
a << 1
```

---

## Assuming Shift Always Multiplies or Divides

For negative numbers, the result depends on binary representation.

---

## Using >>> Without Understanding It

`>>>` behaves differently from `>>`, especially for negative numbers.

---

# Best Practices

- Understand binary representation before using shift operators.
- Use `<<` and `>>` only when appropriate.
- Prefer arithmetic operators for readability unless bit manipulation is required.
- Use `>>>` carefully with negative numbers.

---

# Interview Questions

### Q1. What is the purpose of shift operators?

Shift operators move bits to the left or right.

---

### Q2. Which operator shifts bits to the left?

```
<<
```

---

### Q3. Difference between `>>` and `>>>`?

`>>` preserves the sign bit.

`>>>` fills the leftmost bits with 0.

---

### Q4. Output

```java
System.out.println(5 << 2);
```

Answer

```
20
```

---

### Q5. Output

```java
System.out.println(20 >> 2);
```

Answer

```
5
```

---

# MCQs

### 1

Which operator shifts bits to the left?

A. >>

B. <<

C. >>>

D. &

**Answer:** B

---

### 2

Output

```java
System.out.println(5 << 1);
```

A. 5

B. 10

C. 20

D. 2

**Answer:** B

---

### 3

Output

```java
System.out.println(20 >> 2);
```

A. 5

B. 10

C. 20

D. 40

**Answer:** A

---

### 4

Which operator fills leading bits with 0?

A. >>

B. <<

C. >>>

D. ^

**Answer:** C

---

# Coding Exercises

1. Perform left shift by 1 and 2 positions.
2. Perform right shift by 1 and 2 positions.
3. Compare `>>` and `>>>` using positive numbers.
4. Compare `>>` and `>>>` using negative numbers.
5. Verify the multiplication and division formulas using shift operators.

---

# Assignment

Write a Java program that:

- Reads an integer.
- Performs left shift by 1 and 2.
- Performs signed right shift by 1 and 2.
- Performs unsigned right shift by 1.
- Prints all results.

---

# Revision Notes

- `<<` → Left Shift
- `>>` → Signed Right Shift
- `>>>` → Unsigned Right Shift
- Left shift approximately multiplies by powers of 2.
- Right shift approximately divides by powers of 2.
- `>>>` always fills leading bits with 0.

---

# Key Takeaways

- Shift operators work at the bit level.
- They are useful for efficient bit manipulation.
- `<<` shifts bits left.
- `>>` shifts bits right while preserving the sign.
- `>>>` shifts bits right and fills leading bits with zeros.

---

## References

- Oracle Java Documentation
- https://docs.oracle.com/en/java/
