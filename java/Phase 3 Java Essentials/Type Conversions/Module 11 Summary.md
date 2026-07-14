# Module 11 - Type Casting (Revision Notes)

## Overview

Type Casting is the process of converting one data type into another.

Java supports:

- Widening Casting (Implicit)
- Narrowing Casting (Explicit)
- Type Promotion
- Precision Loss

---

# Type Casting

Type Casting converts one data type into another.

Two Types:

```
Type Casting

│

├── Widening Casting (Implicit)

│

└── Narrowing Casting (Explicit)
```

---

# Widening Casting (Implicit)

## Definition

Converting a **smaller data type** into a **larger data type** automatically.

## Conversion Order

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

## Characteristics

- Automatic
- Safe
- No data loss
- No explicit casting required

## Example

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

# Narrowing Casting (Explicit)

## Definition

Converting a **larger data type** into a **smaller data type** manually.

## Conversion Order

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

## Characteristics

- Manual
- Explicit casting required
- Data loss possible
- Overflow possible

## Example

```java
double number = 25.75;

int value = (int) number;

System.out.println(value);
```

Output

```
25
```

---

# Difference Between Widening and Narrowing

| Widening | Narrowing |
|----------|-----------|
| Smaller → Larger | Larger → Smaller |
| Automatic | Manual |
| Safe | Risky |
| No data loss | Data loss possible |

---

# Type Promotion

## Definition

Java automatically promotes smaller data types during arithmetic operations.

Promotion Rule

```
byte
short
char

↓

int

↓

long

↓

float

↓

double
```

## Example

```java
byte a = 10;
byte b = 20;

int c = a + b;
```

Output

```
30
```

**Remember**

```
byte + byte

↓

int
```

---

# Precision Loss

## Definition

Precision Loss occurs when numerical accuracy is reduced during conversion.

Usually happens in:

- double → float
- float → int
- double → int

## Example

```java
double d = 9.99;

int a = (int)d;

System.out.println(a);
```

Output

```
9
```

The decimal part is discarded.

---

# Data Loss vs Precision Loss

| Data Loss | Precision Loss |
|-----------|----------------|
| Information is removed | Accuracy is reduced |
| Example: 9.99 → 9 | Example: 123.456789 → 123.45679 |

---

# Memory Flow

## Widening

```
int

20

↓

double

20.0
```

---

## Narrowing

```
double

20.75

↓

(int)

↓

20
```

---

# Type Promotion

```
byte

↓

int

↓

Arithmetic

↓

Result
```

---

# Common Compile-Time Errors

## Error

```java
double d = 20.5;

int a = d;
```

Reason

```
Explicit casting required.
```

Correct

```java
int a = (int)d;
```

---

## Error

```java
byte a = 10;
byte b = 20;

byte c = a + b;
```

Reason

```
Result becomes int.
```

Correct

```java
int c = a + b;
```

---

# Important Interview Points

✔ Widening is automatic.

✔ Narrowing requires explicit casting.

✔ byte + byte = int

✔ char participates in arithmetic using Unicode values.

✔ double has higher precision than float.

✔ Narrowing may cause overflow.

✔ Decimal values are truncated, not rounded.

---

# Frequently Asked Interview Questions

### Q1

What is Type Casting?

Converting one data type into another.

---

### Q2

How many types of Type Casting exist?

- Widening
- Narrowing

---

### Q3

Why is Narrowing explicit?

Because it may cause data loss.

---

### Q4

Why does byte + byte return int?

Because Java performs Type Promotion.

---

### Q5

Difference between Data Loss and Precision Loss?

Data Loss removes information.

Precision Loss reduces numerical accuracy.

---

# One-Line Revision

```
Type Casting

↓

Widening

↓

Automatic

↓

Safe

↓

No Data Loss
```

```
Type Casting

↓

Narrowing

↓

Explicit

↓

Data Loss Possible
```

```
Type Promotion

↓

byte

↓

int
```

```
Precision Loss

↓

Accuracy Reduced
```

---

# Quick Formula Sheet

```
Widening

Small → Large
```

```
Narrowing

Large → Small
```

```
Promotion

byte
short
char

↓

int
```

```
Precision Loss

double

↓

float
```

---

# Key Takeaways

- Type Casting converts one data type into another.
- Widening Casting is automatic and safe.
- Narrowing Casting requires explicit casting and may lose data.
- Type Promotion converts smaller integer types to `int` during arithmetic.
- Precision Loss occurs when numerical accuracy decreases.
- Understanding these concepts helps avoid compile-time errors and unexpected results.

---

# Module 11 Summary

```
Module 11 – Type Casting

✅ Type Casting Introduction

✅ Widening Casting

✅ Narrowing Casting

✅ Type Promotion

✅ Precision Loss

🎉 Module 11 Completed
```