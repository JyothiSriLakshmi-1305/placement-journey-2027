# Java Relational Operators

## What are Relational Operators?

Relational operators are used to **compare two values or expressions**.

The result of every relational operation is a **boolean value**:

- `true`
- `false`

These operators are commonly used in:

- if statements
- loops
- switch expressions (with conditions)
- decision-making programs

---

# Why Do We Need Relational Operators?

Relational operators help us compare values to make decisions.

Common use cases:

- Checking eligibility
- Comparing marks
- Login validation
- Age verification
- Finding the largest number

Example

```java
int age = 20;

System.out.println(age >= 18);
```

Output

```
true
```

---

# Types of Relational Operators

| Operator | Meaning | Example |
|----------|---------|---------|
| == | Equal to | `a == b` |
| != | Not Equal to | `a != b` |
| > | Greater than | `a > b` |
| < | Less than | `a < b` |
| >= | Greater than or Equal to | `a >= b` |
| <= | Less than or Equal to | `a <= b` |

---

# 1. Equal To (==)

Checks whether two values are equal.

### Syntax

```java
a == b
```

### Example

```java
int a = 10;
int b = 10;

System.out.println(a == b);
```

### Output

```
true
```

---

# 2. Not Equal To (!=)

Checks whether two values are different.

### Example

```java
int a = 10;
int b = 20;

System.out.println(a != b);
```

### Output

```
true
```

---

# 3. Greater Than (>)

Checks whether the left operand is greater than the right operand.

### Example

```java
int marks = 85;

System.out.println(marks > 50);
```

### Output

```
true
```

---

# 4. Less Than (<)

Checks whether the left operand is less than the right operand.

### Example

```java
int a = 5;

System.out.println(a < 10);
```

### Output

```
true
```

---

# 5. Greater Than or Equal To (>=)

Returns true if the left operand is greater than or equal to the right operand.

### Example

```java
int age = 18;

System.out.println(age >= 18);
```

### Output

```
true
```

---

# 6. Less Than or Equal To (<=)

Returns true if the left operand is less than or equal to the right operand.

### Example

```java
int marks = 35;

System.out.println(marks <= 35);
```

### Output

```
true
```

---

# Internal Working

Example

```java
int a = 15;
int b = 20;

System.out.println(a < b);
```

Flow

```
Compare

15 < 20

↓

true

↓

Print true
```

---

# Example Program

```java
public class RelationalDemo {

    public static void main(String[] args) {

        int a = 20;
        int b = 10;

        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

    }
}
```

### Output

```
a == b : false
a != b : true
a > b  : true
a < b  : false
a >= b : true
a <= b : false
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

## Comparing Strings using ==

Incorrect

```java
String s1 = "Java";
String s2 = new String("Java");

System.out.println(s1 == s2);
```

Use

```java
s1.equals(s2);
```

---

## Assuming Relational Operators Return Numbers

Incorrect

```java
int result = (10 > 5);
```

Relational operators return only:

```
true
```

or

```
false
```

---

# Best Practices

- Use `==` for primitive values.
- Use `.equals()` for comparing String contents.
- Write clear comparison expressions.
- Avoid unnecessary comparisons.

---

# Interview Questions

### Q1. What do relational operators return?

They always return a **boolean value** (`true` or `false`).

---

### Q2. Difference between `=` and `==`?

| = | == |
|---|----|
| Assignment Operator | Comparison Operator |

---

### Q3. Output

```java
System.out.println(10 > 5);
```

Answer

```
true
```

---

### Q4. Which operator checks inequality?

Answer

```
!=
```

---

### Q5. Can relational operators be used with Strings?

For content comparison, use `.equals()` instead of `==`.

---

# MCQs

### 1. Which operator checks equality?

- A. =
- B. ==
- C. !=
- D. >=

**Answer:** B

---

### 2. Output

```java
System.out.println(5 > 10);
```

- A. true
- B. false
- C. 5
- D. Error

**Answer:** B

---

### 3. Which operator means "Not Equal To"?

- A. <>
- B. !=
- C. ==
- D. =

**Answer:** B

---

### 4. Relational operators return

- A. int
- B. double
- C. boolean
- D. char

**Answer:** C

---

# Coding Exercises

1. Compare two integers.
2. Check voting eligibility.
3. Check pass or fail.
4. Find the greater number.
5. Compare two floating-point numbers.

---

# Assignment

Write a Java program that:

- Reads two integers.
- Applies all six relational operators.
- Prints the result of each comparison.

---

# Revision Notes

- `==` → Equal To
- `!=` → Not Equal To
- `>` → Greater Than
- `<` → Less Than
- `>=` → Greater Than or Equal To
- `<=` → Less Than or Equal To
- Every relational operator returns a **boolean** value.

---

# Key Takeaways

- Relational operators compare two values.
- They are essential for decision-making in Java.
- The result is always `true` or `false`.
- Use `==` for primitive data types.
- Use `.equals()` when comparing String contents.

---

## References

- Oracle Java Documentation
- https://docs.oracle.com/en/java/
