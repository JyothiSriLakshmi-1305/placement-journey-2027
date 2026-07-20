# Switch Statement

> **Module 17 – Control Statements (Decision Making)**

---

# Introduction

The **switch statement** is a decision-making statement in Java that allows a program to select **one block of code from multiple alternatives** based on the value of a single expression.

It provides a cleaner and more readable alternative to long `if-else-if` ladders when comparing **one variable against multiple constant values**.

The `switch` statement is widely used in menu-driven applications, calculators, command-line utilities, banking systems, and enterprise software.

---

# History

Early programming languages relied heavily on chained `if-else` statements for decision making.

As software grew larger, long chains of conditions became difficult to read and maintain.

To simplify this, programming languages introduced the **switch statement**, allowing developers to compare one expression with several predefined values in a structured way.

Java adopted the traditional `switch` statement from C and later enhanced it with **switch expressions** (Java 14+) for improved readability and safety.

---

# Why Do We Need switch?

Suppose we are creating a calculator.

Without `switch`

```java
if(choice == 1){
    System.out.println("Addition");
}
else if(choice == 2){
    System.out.println("Subtraction");
}
else if(choice == 3){
    System.out.println("Multiplication");
}
else if(choice == 4){
    System.out.println("Division");
}
else{
    System.out.println("Invalid Choice");
}
```

As the number of choices increases, the code becomes longer and harder to maintain.

Using `switch`

```java
switch(choice){
    case 1:
        System.out.println("Addition");
        break;

    case 2:
        System.out.println("Subtraction");
        break;

    case 3:
        System.out.println("Multiplication");
        break;

    case 4:
        System.out.println("Division");
        break;

    default:
        System.out.println("Invalid Choice");
}
```

The code is shorter, cleaner, and easier to understand.

---

# Problem Statement

Many applications need to compare **one variable** against several possible constant values.

Examples:

- ATM Menu
- Calculator
- Restaurant Menu
- Traffic Signal
- Employee Department
- Language Selection
- Month Name
- Day Name

The `switch` statement is designed for these situations.

---

# Definition

The **switch statement** evaluates a single expression and compares it with multiple `case` values.

When a matching case is found, the corresponding block executes.

If no case matches, the optional `default` block executes.

---

# Syntax

```java
switch(expression){

    case value1:
        // statements
        break;

    case value2:
        // statements
        break;

    case value3:
        // statements
        break;

    default:
        // statements

}
```

---

# Syntax Breakdown

| Keyword | Purpose |
|----------|---------|
| switch | Starts the switch block |
| expression | Value to compare |
| case | Possible matching value |
| break | Exits the switch |
| default | Executes when no case matches |

---

# Flow Diagram

```
             Start
                │
                ▼
      Evaluate Expression
                │
                ▼
       ┌───────────────────┐
       │ Compare with case │
       └───────────────────┘
                │
      ┌─────────┼──────────┐
      ▼         ▼          ▼
   Case1     Case2     Case3
      │         │          │
      └─────────┴──────────┘
                │
        No Match?
                │
                ▼
           Default
                │
                ▼
               End
```

---

# Internal Working

Example

```java
int day = 2;

switch(day){

    case 1:
        System.out.println("Monday");
        break;

    case 2:
        System.out.println("Tuesday");
        break;

    default:
        System.out.println("Invalid");
}
```

### Step 1

```
day = 2
```

### Step 2

Evaluate expression.

```
switch(day)
```

### Step 3

Compare sequentially.

```
2 == 1

↓

false

2 == 2

↓

true
```

### Step 4

Execute matching case.

```
Print Tuesday
```

### Step 5

`break` transfers control outside the switch.

---

# Memory Representation

```
Stack Memory

+----------------+

day = 2

+----------------+
```

Evaluation

```
switch(day)

↓

Compare Cases

↓

Case 2

↓

Execute

↓

break

↓

End
```

---

# Example 1 – Day Name

```java
int day = 3;

switch(day){

    case 1:
        System.out.println("Monday");
        break;

    case 2:
        System.out.println("Tuesday");
        break;

    case 3:
        System.out.println("Wednesday");
        break;

    default:
        System.out.println("Invalid");
}
```

Output

```
Wednesday
```

---

# Example 2 – Calculator Menu

```java
int choice = 2;

switch(choice){

    case 1:
        System.out.println("Addition");
        break;

    case 2:
        System.out.println("Subtraction");
        break;

    case 3:
        System.out.println("Multiplication");
        break;

    case 4:
        System.out.println("Division");
        break;

    default:
        System.out.println("Invalid Choice");
}
```

---

# Example 3 – Grade

```java
char grade = 'A';

switch(grade){

    case 'A':
        System.out.println("Excellent");
        break;

    case 'B':
        System.out.println("Very Good");
        break;

    default:
        System.out.println("Needs Improvement");
}
```

---

# Example 4 – Month

```java
int month = 12;

switch(month){

    case 12:
        System.out.println("December");
        break;

    default:
        System.out.println("Other Month");
}
```

---

# Example 5 – Language

```java
String language = "Java";

switch(language){

    case "Java":
        System.out.println("Object-Oriented");
        break;

    case "Python":
        System.out.println("Easy to Learn");
        break;

    default:
        System.out.println("Unknown Language");
}
```

---

# What is break?

The `break` statement immediately terminates the current `switch` block after executing the matched case.

Without `break`, execution continues into the following cases. This behavior is called **fall-through**.

Example:

```java
int day = 1;

switch(day){

    case 1:
        System.out.println("Monday");

    case 2:
        System.out.println("Tuesday");

    default:
        System.out.println("Invalid");
}
```

Output

```
Monday
Tuesday
Invalid
```

Adding `break` after each case prevents unintended fall-through.

---

# What is default?

The `default` block executes when none of the `case` values match the expression.

It is similar to the final `else` block in an `if-else-if` ladder.

---

# Supported Types

Traditional `switch` supports:

- `byte`
- `short`
- `char`
- `int`
- `enum`
- `String` (Java 7+)

It does **not** support types like `long`, `float`, `double`, or `boolean`.

---

# Real-Life Analogies

## ATM Menu

```
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

3 → Pasta

4 → Juice
```

---

## Remote Control

```
1 → TV

2 → HDMI

3 → USB

4 → Settings
```

---

# Industry Applications

The `switch` statement is used in:

- Menu-driven applications
- Banking software
- POS systems
- Command-line utilities
- REST API request routing
- Compiler design
- Game development

---

# Advantages

- Improves readability.
- Cleaner than long `if-else-if` ladders.
- Easier to maintain.
- Well suited for menu-driven programs.

---

# Limitations

- Works only with supported data types.
- Compares a single expression.
- Cannot evaluate ranges directly (for example, `marks > 90`).

---

# Best Practices

✅ Use `switch` when comparing one variable with multiple constant values.

✅ Include `break` unless fall-through is intentional.

✅ Always provide a `default` case when appropriate.

---

# Common Mistakes

❌ Forgetting `break`.

❌ Duplicate `case` labels.

❌ Using unsupported data types.

❌ Expecting `switch` to evaluate ranges.

---

# Comparison

| Feature | if-else-if | switch |
|---------|------------|---------|
| Multiple conditions | ✅ | ❌ |
| Compare ranges | ✅ | ❌ |
| Compare fixed values | ✅ | ✅ |
| Readability | Medium | Excellent |
| Menu programs | Good | Excellent |

---

# Interview Questions

### What is a switch statement?

A decision-making statement that selects one block of code based on the value of an expression.

---

### Why is `break` used?

To exit the switch after executing the matched case and prevent fall-through.

---

### What happens if `break` is omitted?

Execution continues into the next case until a `break` or the end of the switch is reached.

---

### Is the `default` case mandatory?

No, but it is recommended to handle unexpected values.

---

### Which is better: `switch` or `if-else-if`?

Use `switch` when comparing a single variable against multiple constant values. Use `if-else-if` for ranges or complex boolean conditions.

---

# Quick Revision

```
switch

↓

Expression

↓

Compare Cases

↓

Match?

↓

Execute

↓

break

↓

End
```

---

# Bootcamp Insight 💡

The traditional `switch` statement is still widely used in Java projects, especially for menu-driven programs and fixed-value decisions. However, modern Java introduced **Enhanced Switch Expressions**, which make switch statements shorter, safer, and more expressive. You'll learn those in the next chapter.

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

Switch

↓

Enhanced Switch

↓

Loops
```

---

# Future Topic

Next, you'll learn **Enhanced Switch Expressions (Java 14+)**, including arrow syntax (`->`), multiple labels, `yield`, and how modern Java simplifies switch statements.

---

# Key Takeaways

- `switch` compares one expression with multiple constant values.
- `break` prevents fall-through.
- `default` handles unmatched values.
- Use `switch` for fixed choices and menu-driven programs.
- Prefer `if-else-if` when conditions involve ranges or complex logic.

---

# References

- Oracle Java Documentation
- Java Language Specification (JLS)
- Effective Java – Joshua Bloch
- Head First Java