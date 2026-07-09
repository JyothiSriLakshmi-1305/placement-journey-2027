# Java Logical Operators

## What are Logical Operators?

Logical operators are used to **combine or reverse boolean expressions**.

They help Java make decisions by evaluating one or more conditions.

The result of every logical operation is always a **boolean value**:

- `true`
- `false`

---

# Why Do We Need Logical Operators?

Logical operators are essential for decision-making.

They are commonly used in:

- if statements
- loops
- login systems
- eligibility checking
- validation
- filtering data

Example

```java
int age = 20;
boolean hasLicense = true;

System.out.println(age >= 18 && hasLicense);
```

Output

```
true
```

---

# Types of Logical Operators

| Operator | Name | Description |
|----------|------|-------------|
| && | Logical AND | Returns true if both conditions are true |
| \|\| | Logical OR | Returns true if at least one condition is true |
| ! | Logical NOT | Reverses the boolean value |

---

# 1. Logical AND (&&)

Returns **true only when both conditions are true**.

### Syntax

```java
condition1 && condition2
```

### Example

```java
int age = 20;
boolean hasLicense = true;

System.out.println(age >= 18 && hasLicense);
```

### Output

```
true
```

### Truth Table

| Condition 1 | Condition 2 | Result |
|-------------|-------------|--------|
| true | true | true |
| true | false | false |
| false | true | false |
| false | false | false |

---

# 2. Logical OR (||)

Returns **true if at least one condition is true**.

### Syntax

```java
condition1 || condition2
```

### Example

```java
int marks = 45;
boolean sportsQuota = true;

System.out.println(marks >= 50 || sportsQuota);
```

### Output

```
true
```

### Truth Table

| Condition 1 | Condition 2 | Result |
|-------------|-------------|--------|
| true | true | true |
| true | false | true |
| false | true | true |
| false | false | false |

---

# 3. Logical NOT (!)

Reverses a boolean value.

### Syntax

```java
!condition
```

### Example

```java
boolean isHoliday = false;

System.out.println(!isHoliday);
```

### Output

```
true
```

### Truth Table

| Condition | Result |
|-----------|--------|
| true | false |
| false | true |

---

# Short-Circuit Evaluation

Java uses **short-circuit evaluation** with `&&` and `||`.

## Logical AND (&&)

If the first condition is **false**, Java **does not evaluate** the second condition.

Example

```java
int a = 5;

System.out.println(a > 10 && a++ > 5);
System.out.println(a);
```

Output

```
false
5
```

`a++` is never executed.

---

## Logical OR (||)

If the first condition is **true**, Java **does not evaluate** the second condition.

Example

```java
int a = 5;

System.out.println(a < 10 || a++ > 5);
System.out.println(a);
```

Output

```
true
5
```

Again, `a++` is skipped.

---

# Internal Working

Example

```java
int age = 20;
boolean voterId = true;

System.out.println(age >= 18 && voterId);
```

Flow

```
age >= 18

↓

true

↓

voterId

↓

true

↓

true && true

↓

true
```

---

# Example Program

```java
public class LogicalDemo {

    public static void main(String[] args) {

        int age = 20;
        int marks = 75;

        boolean voterId = true;

        System.out.println("AND : " + (age >= 18 && voterId));

        System.out.println("OR  : " + (marks >= 90 || voterId));

        System.out.println("NOT : " + (!voterId));

    }
}
```

### Output

```
AND : true
OR  : true
NOT : false
```

---

# Common Mistakes

## Confusing && with &

```java
&&
```

Uses **short-circuit evaluation**.

```java
&
```

Evaluates both operands every time.

---

## Confusing || with |

```java
||
```

Short-circuit OR.

```java
|
```

Bitwise OR (also works on booleans without short-circuiting).

---

## Applying ! to Non-Boolean Values

Incorrect

```java
int a = 10;

System.out.println(!a);
```

Compile-time Error

`!` works only with boolean expressions.

---

# Best Practices

- Use `&&` for multiple mandatory conditions.
- Use `||` when any one condition is sufficient.
- Use `!` carefully to improve readability.
- Prefer short-circuit operators (`&&`, `||`) over bitwise operators (`&`, `|`) in conditional statements.

---

# Real-World Examples

## ATM Withdrawal

```java
balance >= amount && pinVerified
```

Money is withdrawn only if both conditions are true.

---

## College Admission

```java
marks >= 90 || sportsQuota
```

Admission is granted if either condition is satisfied.

---

## Office Closed

```java
!isWorkingDay
```

Returns true when it is not a working day.

---

# Interview Questions

### Q1. What are logical operators?

Logical operators combine or reverse boolean expressions.

---

### Q2. How many logical operators are there in Java?

Three:

- &&
- ||
- !

---

### Q3. Difference between && and &?

| && | & |
|----|---|
| Short-circuit | Evaluates both operands |
| Used in conditions | Bitwise operator (also works with booleans) |

---

### Q4. Difference between || and |?

| \|\| | \| |
|------|----|
| Short-circuit OR | Bitwise OR |

---

### Q5. What is short-circuit evaluation?

Java stops evaluating as soon as the result is known.

---

# MCQs

### 1. Which operator returns true only if both conditions are true?

- A. ||
- B. &&
- C. !
- D. %

**Answer:** B

---

### 2. Which operator reverses a boolean value?

- A. %
- B. !
- C. &&
- D. ||

**Answer:** B

---

### 3. Output

```java
System.out.println(true && false);
```

- A. true
- B. false
- C. Error
- D. 1

**Answer:** B

---

### 4. Output

```java
System.out.println(false || true);
```

- A. true
- B. false
- C. Error
- D. 0

**Answer:** A

---

# Coding Exercises

1. Check voting eligibility.
2. Check driving eligibility.
3. Validate username and password.
4. Demonstrate short-circuit evaluation.
5. Toggle a boolean using `!`.

---

# Assignment

Write a Java program that:

- Reads age and whether the user has a driving license.
- Checks if the person can legally drive.
- Demonstrates all three logical operators.
- Prints the result of each condition.

---

# Revision Notes

- `&&` → Logical AND
- `||` → Logical OR
- `!` → Logical NOT
- Logical operators always return a boolean value.
- `&&` and `||` use short-circuit evaluation.
- `!` reverses the boolean value.

---

# Key Takeaways

- Logical operators are used to combine or negate conditions.
- They are fundamental in decision-making and loops.
- `&&` requires all conditions to be true.
- `||` requires at least one condition to be true.
- `!` reverses the result of a boolean expression.
- Understanding short-circuit evaluation is important for writing efficient Java code.

---

## References

- Oracle Java Documentation
- https://docs.oracle.com/en/java/
