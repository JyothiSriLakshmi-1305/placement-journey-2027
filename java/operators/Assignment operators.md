# Java Assignment Operators

## What are Assignment Operators?

Assignment operators are used to **assign values to variables**.

They are one of the most frequently used operators in Java because almost every program stores values in variables.

Example:

```java
int age = 20;
```

Here,

- `=` is the assignment operator.
- `20` is assigned to the variable `age`.

---

# Why Do We Need Assignment Operators?

Assignment operators help us:

- Store values in variables.
- Update existing values.
- Perform calculations and assign the result in a single statement.
- Write shorter and cleaner code.

Example

Without Assignment Operator

```java
marks = marks + 5;
```

With Compound Assignment Operator

```java
marks += 5;
```

Both statements perform the same operation.

---

# Types of Assignment Operators

| Operator | Meaning | Example |
|----------|---------|---------|
| = | Assign | `a = 10` |
| += | Add and Assign | `a += 5` |
| -= | Subtract and Assign | `a -= 5` |
| *= | Multiply and Assign | `a *= 5` |
| /= | Divide and Assign | `a /= 5` |
| %= | Modulus and Assign | `a %= 5` |

---

# 1. Simple Assignment Operator (=)

Assigns the value on the right side to the variable on the left side.

### Syntax

```java
variable = value;
```

### Example

```java
int age = 20;

System.out.println(age);
```

Output

```
20
```

---

# 2. Addition Assignment (+=)

Adds the value and stores the result in the same variable.

### Syntax

```java
a += b;
```

Equivalent to

```java
a = a + b;
```

### Example

```java
int marks = 80;

marks += 10;

System.out.println(marks);
```

Output

```
90
```

---

# 3. Subtraction Assignment (-=)

Subtracts and stores the result.

### Example

```java
int balance = 500;

balance -= 100;

System.out.println(balance);
```

Output

```
400
```

---

# 4. Multiplication Assignment (*=)

Multiplies and stores the result.

### Example

```java
int number = 8;

number *= 5;

System.out.println(number);
```

Output

```
40
```

---

# 5. Division Assignment (/=)

Divides and stores the result.

### Example

```java
int number = 20;

number /= 4;

System.out.println(number);
```

Output

```
5
```

---

# 6. Modulus Assignment (%=)

Stores the remainder after division.

### Example

```java
int number = 20;

number %= 6;

System.out.println(number);
```

Output

```
2
```

---

# Internal Working

Example

```java
int a = 10;

a += 5;
```

Internally Java performs

```java
a = a + 5;
```

Step-by-step

```
a = 10

↓

10 + 5

↓

15

↓

Store back into a

a = 15
```

---

# Example Program

```java
public class AssignmentDemo {

    public static void main(String[] args) {

        int a = 20;

        System.out.println("Initial Value : " + a);

        a += 10;
        System.out.println("After += : " + a);

        a -= 5;
        System.out.println("After -= : " + a);

        a *= 2;
        System.out.println("After *= : " + a);

        a /= 5;
        System.out.println("After /= : " + a);

        a %= 3;
        System.out.println("After %= : " + a);

    }
}
```

Output

```
Initial Value : 20
After += : 30
After -= : 25
After *= : 50
After /= : 10
After %= : 1
```

---

# Compound Assignment Operators

Compound assignment operators combine:

- Arithmetic operation
- Assignment operation

Example

```java
a += 5;
```

means

```java
a = a + 5;
```

Similarly,

```
a -= 5
```

means

```
a = a - 5
```

---

# Common Mistakes

## Using = instead of ==

Incorrect

```java
if(a = 10)
```

Correct

```java
if(a == 10)
```

---

## Forgetting Assignment Updates Variable

```java
a + 5;
```

This does nothing.

Correct

```java
a += 5;
```

or

```java
a = a + 5;
```

---

# Best Practices

- Use compound assignment operators for readability.
- Use meaningful variable names.
- Avoid unnecessary repeated assignments.
- Use `=` only for assigning values.

---

# Interview Questions

### Q1. What is an assignment operator?

An assignment operator assigns a value to a variable.

---

### Q2. Difference between `=` and `+=`?

| = | += |
|---|----|
| Assigns a value | Adds and assigns |

---

### Q3. Is

```java
a += b;
```

same as

```java
a = a + b;
```

Yes.

---

### Q4. Output

```java
int a = 10;

a *= 3;

System.out.println(a);
```

Answer

```
30
```

---

### Q5. Output

```java
int a = 20;

a %= 6;

System.out.println(a);
```

Answer

```
2
```

---

# MCQs

### 1. Which operator adds and assigns?

- A. =
- B. +=
- C. ==
- D. %=

Answer: **B**

---

### 2. Output

```java
int a = 15;

a -= 5;

System.out.println(a);
```

- A. 20
- B. 15
- C. 10
- D. 5

Answer: **C**

---

### 3. Output

```java
int a = 8;

a *= 2;
```

- A. 10
- B. 16
- C. 18
- D. 8

Answer: **B**

---

### 4. Which operator stores the remainder?

- A. /=
- B. %=
- C. *=
- D. +=

Answer: **B**

---

# Coding Exercises

1. Demonstrate all assignment operators.
2. Update salary using `+=`.
3. Reduce balance using `-=`.
4. Calculate product using `*=`.
5. Find remainder using `%=`.
6. Compare `a += b` and `a = a + b`.

---

# Assignment

Write a Java program that:

- Reads two integers.
- Demonstrates all assignment operators.
- Prints the value after each operation.

---

# Revision Notes

- `=` → Assign value
- `+=` → Add and assign
- `-=` → Subtract and assign
- `*=` → Multiply and assign
- `/=` → Divide and assign
- `%=` → Modulus and assign
- Compound assignment operators make code shorter and more readable.

---

# Key Takeaways

- Assignment operators assign or update variable values.
- Compound assignment operators combine arithmetic and assignment.
- `a += b` is equivalent to `a = a + b`.
- They improve code readability and reduce repetition.

---

## References

- Oracle Java Documentation
- https://docs.oracle.com/en/java/
