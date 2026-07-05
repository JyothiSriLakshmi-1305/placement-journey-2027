# Java Unary Operators

## What are Unary Operators?

Unary operators are operators that perform an operation on **only one operand**.

Unlike arithmetic operators, which require two operands, unary operators modify or evaluate a single variable or value.

Example:

```java
int a = 10;
a++;
```

Here, the unary operator (`++`) works on only one operand (`a`).

---

# Why Do We Need Unary Operators?

Unary operators are commonly used to:

- Increment or decrement values
- Reverse boolean values
- Change the sign of numbers
- Improve code readability
- Simplify expressions

---

# Types of Unary Operators

| Operator | Name | Description |
|----------|------|-------------|
| + | Unary Plus | Indicates positive value |
| - | Unary Minus | Negates a value |
| ++ | Increment | Increases value by 1 |
| -- | Decrement | Decreases value by 1 |
| ! | Logical NOT | Reverses a boolean value |

---

# 1. Unary Plus (+)

Indicates that a value is positive.

### Syntax

```java
+operand
```

### Example

```java
int a = 10;

System.out.println(+a);
```

### Output

```
10
```

---

# 2. Unary Minus (-)

Changes the sign of a number.

### Syntax

```java
-operand
```

### Example

```java
int a = 10;

System.out.println(-a);
```

### Output

```
-10
```

---

# 3. Increment Operator (++)

Increases the value of a variable by **1**.

There are two types:

- Pre Increment (`++a`)
- Post Increment (`a++`)

---

## Pre Increment (++a)

The value is increased **before** it is used.

### Example

```java
int a = 10;

System.out.println(++a);
```

### Output

```
11
```

---

## Post Increment (a++)

The current value is used first, then increased.

### Example

```java
int a = 10;

System.out.println(a++);
System.out.println(a);
```

### Output

```
10
11
```

---

# Difference Between Pre and Post Increment

| Pre Increment | Post Increment |
|---------------|----------------|
| Increment happens first | Current value is used first |
| `++a` | `a++` |

Example

```java
int a = 5;

System.out.println(++a); // 6

a = 5;

System.out.println(a++); // 5
System.out.println(a);   // 6
```

---

# 4. Decrement Operator (--)

Decreases the value of a variable by **1**.

Types:

- Pre Decrement (`--a`)
- Post Decrement (`a--`)

---

## Pre Decrement

```java
int a = 10;

System.out.println(--a);
```

Output

```
9
```

---

## Post Decrement

```java
int a = 10;

System.out.println(a--);
System.out.println(a);
```

Output

```
10
9
```

---

# Difference Between Pre and Post Decrement

| Pre Decrement | Post Decrement |
|---------------|----------------|
| Decrements first | Uses current value first |
| `--a` | `a--` |

---

# 5. Logical NOT (!)

Reverses a boolean value.

### Syntax

```java
!booleanVariable
```

### Example

```java
boolean isPlaced = true;

System.out.println(!isPlaced);
```

### Output

```
false
```

---

# Example Program

```java
public class UnaryDemo {

    public static void main(String[] args) {

        int a = 10;
        boolean flag = true;

        System.out.println("Unary Plus      : " + (+a));
        System.out.println("Unary Minus     : " + (-a));

        System.out.println("Pre Increment   : " + (++a));
        System.out.println("Post Increment  : " + (a++));

        System.out.println("Value After Post Increment : " + a);

        System.out.println("Pre Decrement   : " + (--a));
        System.out.println("Post Decrement  : " + (a--));

        System.out.println("Value After Post Decrement : " + a);

        System.out.println("Logical NOT     : " + (!flag));

    }
}
```

---

# Internal Working

Example:

```java
int a = 5;

int b = ++a;
```

Step 1

```
a = 5
```

Step 2

```
Increment first

a = 6
```

Step 3

```
Assign to b

b = 6
```

---

Example

```java
int a = 5;

int b = a++;
```

Step 1

```
a = 5
```

Step 2

```
Assign current value

b = 5
```

Step 3

```
Increment afterwards

a = 6
```

---

# Common Mistakes

## Confusing Pre and Post Increment

```java
int a = 5;

System.out.println(++a);
```

Output

```
6
```

---

```java
int a = 5;

System.out.println(a++);
```

Output

```
5
```

---

## Applying ++ to Constants

```java
10++;
```

❌ Compile-time Error

Only variables can be incremented or decremented.

---

## Using Logical NOT on Non-Boolean Values

```java
int a = 5;

System.out.println(!a);
```

❌ Compile-time Error

`!` works only with boolean values.

---

# Best Practices

- Use pre-increment when the updated value is immediately needed.
- Avoid writing multiple increment operators in a single expression.
- Keep expressions simple and readable.
- Use meaningful variable names.

---

# Interview Questions

### Q1. What is a unary operator?

A unary operator performs an operation on a single operand.

---

### Q2. Difference between pre and post increment?

Pre increment updates the value first.

Post increment uses the current value first and updates later.

---

### Q3. What is the output?

```java
int a = 5;

System.out.println(++a);
```

Answer

```
6
```

---

### Q4. What is the output?

```java
int a = 5;

System.out.println(a++);
System.out.println(a);
```

Answer

```
5
6
```

---

### Q5. Which operator reverses a boolean value?

Answer

```
!
```

---

# MCQs

### 1. Which is a unary operator?

- A. +
- B. *
- C. ++
- D. /

**Answer:** C

---

### 2. Output?

```java
int a = 5;

System.out.println(++a);
```

- A. 5
- B. 6
- C. 7
- D. Error

**Answer:** B

---

### 3. Output?

```java
int a = 5;

System.out.println(a++);
```

- A. 5
- B. 6
- C. Error
- D. 4

**Answer:** A

---

### 4. Which operator reverses a boolean?

- A. ~
- B. !
- C. %
- D. ++

**Answer:** B

---

# Coding Exercises

1. Demonstrate unary plus and unary minus.
2. Compare pre and post increment.
3. Compare pre and post decrement.
4. Toggle a boolean using `!`.
5. Predict outputs of increment expressions.

---

# Assignment

Write a Java program that:

- Demonstrates all unary operators.
- Prints the value before and after each operation.
- Shows the difference between pre and post increment/decrement.
- Demonstrates logical NOT with boolean values.

---

# Revision Notes

- Unary operators work on **one operand**.
- `+` → Positive value
- `-` → Negative value
- `++` → Increase by 1
- `--` → Decrease by 1
- `!` → Reverse boolean value
- Pre operators update first.
- Post operators use current value first.

---

# Key Takeaways

- Unary operators require only one operand.
- Java provides five unary operators.
- Understand the difference between pre and post increment/decrement.
- Logical NOT works only with boolean values.
- Unary operators are widely used in loops and conditional statements.

---

## References

- Oracle Java Documentation
- https://docs.oracle.com/en/java/