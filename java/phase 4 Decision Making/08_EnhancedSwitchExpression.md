# Enhanced Switch Expression (Java 14+)

> **Module 17 – Control Statements (Decision Making)**

---

# Introduction

Java has supported the traditional `switch` statement since its early versions. While useful, the traditional `switch` has some drawbacks:

- It requires `break` statements.
- Forgetting `break` can cause accidental fall-through.
- It is more verbose than necessary.
- Assigning values often requires extra variables.

To solve these issues, Java introduced **Switch Expressions** (preview in Java 12/13 and standardized in Java 14).

Enhanced switch expressions make code shorter, safer, and easier to read.

---

# History

### Traditional Switch

Available since Java 1.0

```java
switch(day){
    case 1:
        System.out.println("Monday");
        break;
}
```

---

### Java 12

Switch Expressions introduced as a preview feature.

---

### Java 13

Improved using `yield`.

---

### Java 14

Enhanced Switch became a standard language feature.

---

# Why Enhanced Switch?

Traditional switch has several problems.

Example

```java
String day;

switch(num){

    case 1:
        day="Monday";
        break;

    case 2:
        day="Tuesday";
        break;

    default:
        day="Invalid";
}
```

Many repeated statements.

Enhanced Switch

```java
String day = switch(num){

    case 1 -> "Monday";

    case 2 -> "Tuesday";

    default -> "Invalid";
};
```

Cleaner.

Safer.

Shorter.

---

# Definition

An **Enhanced Switch Expression** is a modern version of the switch statement that:

- Uses arrow (`->`) syntax.
- Eliminates accidental fall-through.
- Can directly return a value.
- Improves readability.

---

# Syntax

```java
switch(expression){

    case value1 -> statement;

    case value2 -> statement;

    default -> statement;

}
```

---

# Returning a Value

Traditional

```java
String grade;

switch(score){

    case 1:
        grade="A";
        break;

    default:
        grade="F";
}
```

Enhanced

```java
String grade = switch(score){

    case 1 -> "A";

    default -> "F";

};
```

---

# Flow Diagram

```
Expression

↓

Match Case

↓

Execute

↓

Return Value

↓

End
```

---

# Internal Working

Example

```java
int day = 2;

String result = switch(day){

    case 1 -> "Monday";

    case 2 -> "Tuesday";

    default -> "Invalid";
};
```

Execution

```
day = 2

↓

Compare

↓

Case 2

↓

Return "Tuesday"

↓

Store in result
```

---

# Example 1

```java
int day = 3;

String name = switch(day){

    case 1 -> "Monday";

    case 2 -> "Tuesday";

    case 3 -> "Wednesday";

    default -> "Invalid";
};

System.out.println(name);
```

Output

```
Wednesday
```

---

# Example 2

```java
char grade='A';

String result = switch(grade){

    case 'A' -> "Excellent";

    case 'B' -> "Very Good";

    default -> "Average";
};

System.out.println(result);
```

---

# Example 3

Multiple Labels

```java
int month = 12;

String season = switch(month){

    case 12,1,2 -> "Winter";

    case 3,4,5 -> "Summer";

    case 6,7,8 -> "Rainy";

    default -> "Autumn";

};
```

---

# Example 4

Using Block

```java
int score = 95;

String grade = switch(score){

    case 100 -> {

        System.out.println("Perfect");

        yield "A+";

    }

    default -> "A";

};
```

---

# What is yield?

`yield` returns a value from a block inside a switch expression.

Example

```java
String message = switch(choice){

    case 1 -> {

        System.out.println("Addition");

        yield "Done";

    }

    default -> "Invalid";

};
```

---

# Arrow Operator

Traditional

```java
case 1:
    break;
```

Enhanced

```java
case 1 -> "Monday";
```

Advantages

- Shorter
- Cleaner
- No break
- No fall-through

---

# Fall-through

Traditional

```java
case 1:
case 2:
```

May continue accidentally.

Enhanced

```
No Fall-through
```

Each case executes independently.

---

# Supported Types

- byte
- short
- char
- int
- enum
- String

---

# Real-Life Examples

## ATM

```
Choice

↓

1 → Balance

2 → Deposit

3 → Withdraw

4 → Exit
```

---

## Restaurant

```
1 → Pizza

2 → Burger

3 → Juice
```

---

## Language Selection

```
1 → English

2 → Telugu

3 → Hindi
```

---

# Industry Applications

Enhanced Switch is used in:

- Spring Boot
- REST APIs
- Microservices
- Menu Systems
- Configuration Processing
- Enterprise Java

---

# Traditional vs Enhanced

| Feature | Traditional | Enhanced |
|----------|------------|----------|
| break | Required | Not Required |
| Fall-through | Possible | Impossible |
| Returns Value | No | Yes |
| Arrow Operator | No | Yes |
| Multiple Labels | Limited | Yes |
| Readability | Good | Excellent |

---

# Advantages

- Cleaner syntax.
- Safer.
- No accidental fall-through.
- Can directly return values.
- Modern Java standard.

---

# Limitations

- Requires Java 14+.
- Older projects may still use traditional switch.

---

# Best Practices

✅ Use enhanced switch in modern projects.

✅ Prefer arrow syntax.

✅ Use `yield` only when a block needs to return a value.

✅ Keep case blocks simple.

---

# Common Mistakes

❌ Forgetting the semicolon after a switch expression assignment.

```java
String day = switch(num){

    case 1 -> "Monday";

    default -> "Invalid";

};
```

---

❌ Using `break` with arrow cases.

```java
case 1 -> {
    break;
}
```

Incorrect.

---

❌ Confusing `yield` with `return`.

`yield` returns a value from a switch expression, while `return` exits the method.

---

# Interview Questions

### What is Enhanced Switch?

A modern switch expression introduced in Java 14 that uses arrow syntax and can return values.

---

### Why is it better?

- No break
- No fall-through
- Cleaner
- Returns values

---

### What is `yield`?

A keyword used to return a value from a block inside a switch expression.

---

### Can switch return a value?

Yes, enhanced switch expressions can directly return values.

---

### Is Enhanced Switch recommended?

Yes, for modern Java projects using Java 14 or later.

---

# Quick Revision

```
Traditional

↓

case :

↓

break

↓

End
```

```
Enhanced

↓

case ->

↓

Return Value

↓

End
```

---

# Bootcamp Insight 💡

Most enterprise Java projects are gradually adopting enhanced switch expressions because they produce cleaner, safer, and more maintainable code. While you'll still encounter traditional `switch` in legacy codebases, becoming comfortable with the modern syntax will prepare you for current Java development and technical interviews.

---

# Connection Map

```
if

↓

if-else

↓

if-else-if

↓

Nested if

↓

Traditional Switch

↓

Enhanced Switch

↓

Loops

↓

Methods
```

---

# Future Topic

Next, you'll learn the **Ternary Operator (`?:`)**, a concise alternative to simple `if-else` statements.

---

# Key Takeaways

- Enhanced Switch was standardized in Java 14.
- Uses `->` instead of `:`.
- Eliminates accidental fall-through.
- Can return values directly.
- Uses `yield` for multi-statement blocks.
- Preferred for modern Java applications.

---

# References

- Oracle Java Documentation
- Java Language Specification (JLS)
- JEP 361: Switch Expressions
- Effective Java – Joshua Bloch
- Head First Java