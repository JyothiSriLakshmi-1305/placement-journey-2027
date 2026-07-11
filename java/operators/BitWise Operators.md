# Java Bitwise Operators

## What are Bitwise Operators?

Bitwise operators perform operations directly on the **binary (bit-level)** representation of integer values.

Unlike arithmetic and logical operators, bitwise operators manipulate individual bits (0s and 1s).

Example:

```java
int a = 5;
int b = 3;

System.out.println(a & b);
```

---

# Why Do We Need Bitwise Operators?

Bitwise operators are mainly used for:

- Low-level programming
- Performance optimization
- Embedded systems
- Device drivers
- Cryptography
- Flags and permissions
- Competitive Programming

For normal application development, they are used less frequently than arithmetic or logical operators.

---

# Prerequisite

Before learning bitwise operators, you should know:

- Decimal Numbers
- Binary Numbers
- Bits (0 and 1)

Example

```
Decimal 5

↓

Binary

0101
```

```
Decimal 3

↓

Binary

0011
```

---

# Types of Bitwise Operators

| Operator | Name | Description |
|----------|------|-------------|
| & | Bitwise AND | Sets bit if both bits are 1 |
| \| | Bitwise OR | Sets bit if either bit is 1 |
| ^ | Bitwise XOR | Sets bit if bits are different |
| ~ | Bitwise Complement | Flips all bits |

> Shift operators (`<<`, `>>`, `>>>`) are covered in the next topic.

---

# 1. Bitwise AND (&)

Returns **1** only if both bits are **1**.

### Syntax

```java
a & b
```

### Example

```java
int a = 5;
int b = 3;

System.out.println(a & b);
```

Binary

```
5

0101

3

0011

---------

0001
```

Output

```
1
```

---

# Truth Table

| A | B | A & B |
|---|---|--------|
|0|0|0|
|0|1|0|
|1|0|0|
|1|1|1|

---

# 2. Bitwise OR (|)

Returns **1** if **at least one bit** is **1**.

### Example

```java
int a = 5;
int b = 3;

System.out.println(a | b);
```

Binary

```
0101

0011

------

0111
```

Output

```
7
```

---

# Truth Table

| A | B | A \| B |
|---|---|---------|
|0|0|0|
|0|1|1|
|1|0|1|
|1|1|1|

---

# 3. Bitwise XOR (^)

Returns **1** when bits are different.

### Example

```java
int a = 5;
int b = 3;

System.out.println(a ^ b);
```

Binary

```
0101

0011

------

0110
```

Output

```
6
```

---

# Truth Table

| A | B | A ^ B |
|---|---|--------|
|0|0|0|
|0|1|1|
|1|0|1|
|1|1|0|

---

# 4. Bitwise Complement (~)

Flips every bit.

0 becomes 1.

1 becomes 0.

### Example

```java
int a = 5;

System.out.println(~a);
```

Output

```
-6
```

---

# Why is ~5 equal to -6?

```
5

00000101
```

Flip every bit

```
11111010
```

This represents **-6** in two's complement representation.

---

# Internal Working

Example

```java
int a = 5;
int b = 3;

System.out.println(a & b);
```

Step 1

Convert to binary

```
5 → 0101

3 → 0011
```

Step 2

Apply AND

```
0101

0011

-----

0001
```

Step 3

Convert back to decimal

```
1
```

---

# Example Program

```java
public class BitwiseDemo {

    public static void main(String[] args) {

        int a = 5;
        int b = 3;

        System.out.println("AND : " + (a & b));
        System.out.println("OR  : " + (a | b));
        System.out.println("XOR : " + (a ^ b));
        System.out.println("NOT : " + (~a));

    }
}
```

---

# Common Mistakes

## Confusing && with &

```
&&
```

Logical AND

```
&
```

Bitwise AND

---

## Confusing || with |

```
||
```

Logical OR

```
|
```

Bitwise OR

---

## Forgetting Binary Conversion

Always convert numbers to binary before solving bitwise problems manually.

---

# Best Practices

- Use bitwise operators only when necessary.
- Understand binary representation first.
- Don't replace logical operators with bitwise operators in conditions.
- Use meaningful comments when writing bitwise code.

---

# Interview Questions

### Q1

What is the difference between `&` and `&&`?

`&` works on bits (and also evaluates both boolean operands).

`&&` is the logical AND operator with short-circuit evaluation.

---

### Q2

Which operator flips all bits?

```
~
```

---

### Q3

Output

```java
System.out.println(5 & 3);
```

Answer

```
1
```

---

### Q4

Output

```java
System.out.println(5 | 3);
```

Answer

```
7
```

---

### Q5

Output

```java
System.out.println(5 ^ 3);
```

Answer

```
6
```

---

# MCQs

### 1

Which operator performs Bitwise XOR?

A. &

B. |

C. ^

D. ~

Answer: **C**

---

### 2

Output

```java
System.out.println(5 & 3);
```

A. 1

B. 5

C. 7

D. 6

Answer: **A**

---

### 3

Which operator flips all bits?

A. !

B. ~

C. ^

D. %

Answer: **B**

---

# Coding Exercises

1. Find Bitwise AND of two numbers.
2. Find Bitwise OR of two numbers.
3. Find Bitwise XOR.
4. Find Bitwise Complement.
5. Convert decimal to binary and verify the results manually.

---

# Assignment

Write a Java program that:

- Reads two integers.
- Performs Bitwise AND.
- Performs Bitwise OR.
- Performs Bitwise XOR.
- Performs Bitwise Complement.

Print all results.

---

# Revision Notes

- `&` → Bitwise AND
- `|` → Bitwise OR
- `^` → Bitwise XOR
- `~` → Bitwise Complement
- Bitwise operators work on binary bits.
- Learn binary conversion before solving bitwise problems.

---

# Key Takeaways

- Bitwise operators manipulate bits directly.
- They are useful in system programming and optimization.
- Understanding binary numbers is essential.
- `~` uses two's complement representation.
- Don't confuse logical operators with bitwise operators.

---

## References

- Oracle Java Documentation
- https://docs.oracle.com/en/java/
