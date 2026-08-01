# Java Associativity

## What is Associativity?

Associativity determines the **order in which operators of the same precedence are evaluated**.

When an expression contains multiple operators with the **same precedence**, associativity decides whether Java evaluates them:

- From **Left to Right**
- From **Right to Left**

---

# Why Do We Need Associativity?

Operator precedence tells Java **which operator has higher priority**.

But when two operators have **equal precedence**, Java needs another rule to decide which one should execute first.

That rule is called **Associativity**.

Example

```java
int result = 20 / 5 * 2;
```

Both `/` and `*` have the same precedence.

Java evaluates from **Left to Right**.

```
20 / 5

↓

4

↓

4 × 2

↓

8
```

Output

```
8
```

---

# Difference Between Precedence and Associativity

| Operator Precedence | Associativity |
|---------------------|---------------|
| Decides which operator has higher priority | Decides evaluation order when precedence is the same |
| Different precedence | Same precedence |

---

# Types of Associativity

Java follows two types:

## 1. Left to Right Associativity

Most Java operators follow this rule.

Examples

- `+`
- `-`
- `*`
- `/`
- `%`
- `<<`
- `>>`
- `>>>`
- `<`
- `>`
- `<=`
- `>=`
- `==`
- `!=`
- `&`
- `^`
- `|`
- `&&`
- `||`

---

### Example

```java
int result = 20 / 5 * 2;
```

Execution

```
20 / 5

↓

4

↓

4 × 2

↓

8
```

Output

```
8
```

---

## Another Example

```java
System.out.println(10 - 5 - 2);
```

Execution

```
10 - 5

↓

5

↓

5 - 2

↓

3
```

Output

```
3
```

---

# 2. Right to Left Associativity

Only a few operators use Right-to-Left evaluation.

Examples

- Assignment Operators (`=`, `+=`, `-=`, `*=`, `/=`, `%=`)
- Unary Operators (`++`, `--`, `!`, `~`)
- Ternary Operator (`?:`)

---

### Example

```java
int a, b, c;

a = b = c = 10;
```

Execution

```
c = 10

↓

b = 10

↓

a = 10
```

Final Values

```
a = 10
b = 10
c = 10
```

---

# Internal Working

Example

```java
int result = 100 / 10 * 5;
```

Step 1

```
100 / 10

↓

10
```

Step 2

```
10 × 5

↓

50
```

Output

```
50
```

---

# Example Program

```java
public class AssociativityDemo {

    public static void main(String[] args) {

        System.out.println(20 / 5 * 2);

        System.out.println(10 - 5 - 2);

        int a, b, c;

        a = b = c = 50;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
```

### Output

```
8
3
50
50
50
```

---

# Associativity Summary

## Left to Right

```
20 / 5 * 2

↓

20 / 5

↓

4

↓

4 * 2

↓

8
```

---

## Right to Left

```
a = b = c = 100

↓

c = 100

↓

b = 100

↓

a = 100
```

---

# Common Mistakes

## Confusing Precedence with Associativity

Precedence decides **which operator** is evaluated first.

Associativity decides **the direction of evaluation** when operators have the same precedence.

---

## Assuming Assignment is Left to Right

Incorrect

```
a

↓

b

↓

c
```

Correct

```
c

↓

b

↓

a
```

---

# Best Practices

- Use parentheses when expressions become difficult to understand.
- Avoid writing long expressions with multiple operators.
- Remember that assignment operators evaluate from right to left.
- Keep expressions simple for better readability.

---

# Interview Questions

### Q1

What is Associativity?

Associativity determines the order of evaluation when operators have the same precedence.

---

### Q2

Difference between Precedence and Associativity?

Precedence decides **priority**.

Associativity decides **evaluation direction**.

---

### Q3

Which operators use Right-to-Left associativity?

- Assignment Operators
- Unary Operators
- Ternary Operator

---

### Q4

Output

```java
System.out.println(20 / 5 * 2);
```

Answer

```
8
```

---

### Q5

Output

```java
int a, b, c;

a = b = c = 25;

System.out.println(a);
```

Answer

```
25
```

---

# MCQs

### 1

Associativity is used when:

A. Operators have different precedence

B. Operators have the same precedence

C. Variables are declared

D. Loops are executed

**Answer:** B

---

### 2

Which associativity is followed by arithmetic operators?

A. Right to Left

B. Left to Right

C. Random

D. None

**Answer:** B

---

### 3

Which associativity is followed by assignment operators?

A. Left to Right

B. Right to Left

C. Both

D. None

**Answer:** B

---

### 4

Output

```java
System.out.println(12 / 3 * 2);
```

A. 2

B. 8

C. 6

D. 12

**Answer:** B

---

# Coding Exercises

1. Evaluate expressions with multiple arithmetic operators.
2. Demonstrate assignment associativity.
3. Compare precedence and associativity using examples.
4. Rewrite expressions using parentheses.
5. Predict outputs before execution.

---

# Assignment

Write a Java program that demonstrates:

- Left-to-right associativity
- Right-to-left associativity
- Difference between precedence and associativity

Display the output with explanations.

---

# Revision Notes

- Associativity applies when operators have the same precedence.
- Most operators evaluate from Left to Right.
- Assignment operators evaluate from Right to Left.
- Parentheses override both precedence and associativity.
- Use parentheses to improve readability.

---

# Key Takeaways

- Associativity defines evaluation direction.
- Precedence defines operator priority.
- Arithmetic operators are Left to Right.
- Assignment operators are Right to Left.
- Parentheses make expressions clearer and reduce mistakes.

---

## References

- Oracle Java Documentation
- https://docs.oracle.com/en/java/