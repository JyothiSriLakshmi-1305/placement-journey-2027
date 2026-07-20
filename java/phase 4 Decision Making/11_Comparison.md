# Comparison of Decision-Making Statements

> **Module 17 – Control Statements (Decision Making)**

---

# Introduction

Java provides several decision-making constructs, each designed for a specific purpose. Choosing the right control statement improves **readability, maintainability, and performance**.

This chapter compares all major decision-making statements in Java:

- `if`
- `if-else`
- `if-else-if`
- `Nested if`
- Traditional `switch`
- Enhanced `switch`
- Ternary Operator (`?:`)

Understanding when to use each one is an important skill for software engineering interviews and real-world projects.

---

# Decision-Making Family Tree

```
                  Decision Making
                         │
      ┌──────────────────┴──────────────────┐
      │                                     │
   if Family                       switch Family
      │                                     │
      ├── if                          Traditional switch
      ├── if-else                           │
      ├── if-else-if                        ▼
      └── Nested if                 Enhanced switch
             │
             ▼
      Ternary Operator
```

---

# Quick Comparison Table

| Feature | if | if-else | if-else-if | Nested if | switch | Enhanced switch | Ternary |
|---------|----|----------|-------------|-----------|---------|----------------|----------|
| Conditions | One | One | Multiple | Dependent | Fixed values | Fixed values | One |
| Two outcomes | ❌ | ✅ | ❌ | ❌ | ❌ | ❌ | ✅ |
| Multiple choices | ❌ | ❌ | ✅ | ❌ | ✅ | ✅ | ❌ |
| Returns value | ❌ | ❌ | ❌ | ❌ | ❌ | ✅ | ✅ |
| Uses ranges | ✅ | ✅ | ✅ | ✅ | ❌ | ❌ | ✅ |
| Supports fall-through | ❌ | ❌ | ❌ | ❌ | ✅ | ❌ | ❌ |
| Readability | High | High | Medium | Medium | High | Very High | High (simple cases) |

---

# Comparison 1 – if vs if-else

## if

Use when something should happen **only if a condition is true**.

```java
if(age >= 18){
    System.out.println("Eligible");
}
```

---

## if-else

Use when there are **exactly two possible outcomes**.

```java
if(age >= 18){
    System.out.println("Eligible");
}
else{
    System.out.println("Not Eligible");
}
```

### Best Choice

- `if` → One-way decision
- `if-else` → Two-way decision

---

# Comparison 2 – if-else vs if-else-if

## if-else

```
Condition

↓

True

OR

False
```

---

## if-else-if

```
Condition 1

↓

Condition 2

↓

Condition 3

↓

Else
```

### Best Choice

Use `if-else-if` when you have **more than two possible outcomes**.

---

# Comparison 3 – if-else-if vs switch

## if-else-if

Best for:

- Ranges
- Complex conditions
- Logical operators

```java
if(marks >= 90){
}
else if(marks >= 75){
}
```

---

## switch

Best for:

- Menu systems
- Fixed values
- Commands
- Enums
- String options

```java
switch(day){

    case 1:
        break;

    default:
}
```

---

# Comparison 4 – Traditional vs Enhanced Switch

| Feature | Traditional | Enhanced |
|----------|------------|----------|
| Uses `break` | Yes | No |
| Arrow (`->`) | No | Yes |
| Fall-through | Possible | Not with arrow syntax |
| Returns value | No | Yes |
| Java Version | Java 1.0+ | Java 14+ |

Example

Traditional

```java
switch(day){

    case 1:
        result = "Monday";
        break;

    default:
        result = "Invalid";
}
```

Enhanced

```java
String result = switch(day){

    case 1 -> "Monday";

    default -> "Invalid";

};
```

---

# Comparison 5 – if-else vs Ternary Operator

## if-else

```java
if(age >=18){
    status = "Adult";
}
else{
    status = "Minor";
}
```

---

## Ternary

```java
status = (age >=18) ? "Adult" : "Minor";
```

### Best Choice

Use the ternary operator only for **simple assignments**.

---

# Comparison 6 – Nested if vs Combined Conditions

Nested

```java
if(age >=18){

    if(hasLicense){

        System.out.println("Drive");

    }

}
```

Combined

```java
if(age >=18 && hasLicense){

    System.out.println("Drive");

}
```

### Recommendation

- Use nested `if` when the second check logically depends on the first.
- Use combined conditions when they improve readability.

---

# Decision Tree

```
Need a decision?

        │
        ▼

One condition?

        │

      Yes

        │

Use if

        │

No

        ▼

Exactly two outcomes?

        │

      Yes

        ▼

Use if-else

        │

No

        ▼

Many conditions?

        │

      Yes

        ▼

Comparing one variable?

      /            \

    Yes            No

    │               │

switch      if-else-if

        │

Simple assignment?

        │

      Yes

        ▼

Use Ternary
```

---

# Performance Discussion

### Is `switch` faster than `if-else`?

In modern Java, performance depends on the situation and the JVM's optimizations. For most applications, the difference is negligible.

Choose the construct based on **readability and the nature of the problem**, not assumed speed.

---

# Real-World Examples

| Situation | Recommended |
|-----------|-------------|
| Login validation | if |
| Pass/Fail | if-else |
| Grade system | if-else-if |
| ATM menu | switch |
| Language selection | switch |
| Role-based access | Nested if |
| Maximum of two numbers | Ternary |
| REST API status mapping | Enhanced switch |

---

# Industry Recommendations

Professional Java developers generally follow these guidelines:

- Use `if` for a single condition.
- Use `if-else` for two alternatives.
- Use `if-else-if` for ranges and complex logic.
- Use `switch` for fixed values.
- Use enhanced `switch` in Java 14+ projects.
- Use the ternary operator for simple value assignments only.

---

# Common Myths

### Myth 1

**"switch is always faster."**

❌ False.

Modern JVM optimizations mean readability is usually the more important consideration.

---

### Myth 2

**"Ternary operator should replace every if-else."**

❌ False.

Only use it for simple expressions.

---

### Myth 3

**"Nested if is always bad."**

❌ False.

It is appropriate when decisions genuinely depend on previous decisions.

---

### Myth 4

**"default is mandatory in switch."**

❌ False.

It is optional but recommended.

---

# Interview Questions

### Which decision-making statement is used for multiple ranges?

`if-else-if`

---

### Which statement is best for menu-driven programs?

`switch`

---

### Which statement directly returns a value?

- Enhanced switch
- Ternary operator

---

### Which construct prevents fall-through?

Enhanced switch using the `->` syntax.

---

### When should Nested if be used?

When later decisions depend on earlier ones.

---

# Quick Revision

| Situation | Best Choice |
|-----------|-------------|
| One condition | if |
| Two outcomes | if-else |
| Multiple ranges | if-else-if |
| Dependent checks | Nested if |
| Fixed values | switch |
| Modern fixed values | Enhanced switch |
| Simple assignment | Ternary |

---

# Bootcamp Insight 💡

Choosing the correct control statement is a mark of a good software engineer. During coding interviews, interviewers often evaluate not only whether your solution works but also whether you selected the most appropriate construct. Favor readability, maintainability, and correctness over unnecessary cleverness.

---

# Connection Map

```
Decision Making

↓

Choose Correct Statement

↓

Readable Code

↓

Maintainable Code

↓

Clean Architecture

↓

Enterprise Java
```

---

# Future Topic

Next, you'll revise everything you've learned in **Module 17** through a concise revision guide before moving on to interview questions, MCQs, coding exercises, and assignments.

---

# Key Takeaways

- Choose the control statement that best fits the problem.
- Use `if-else-if` for ranges and complex conditions.
- Use `switch` for fixed values.
- Prefer enhanced `switch` in modern Java.
- Use the ternary operator only for simple expressions.
- Prioritize readability and maintainability.

---

# References

- Oracle Java Documentation
- Java Language Specification (JLS)
- Effective Java – Joshua Bloch
- Clean Code – Robert C. Martin
- Head First Java