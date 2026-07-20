# Flow Control Best Practices

> **Module 17 – Control Statements (Decision Making)**

---

# Introduction

Writing a program that works is only the first step. Professional software engineers also write code that is **readable, maintainable, efficient, and less prone to bugs**.

Flow control statements (`if`, `if-else`, `if-else-if`, `switch`, and the ternary operator) are used in almost every Java application. Poorly written decision-making logic can make code difficult to understand and maintain.

This chapter discusses the best practices for writing clean and professional flow control code.

---

# Why Best Practices Matter

Consider the following code:

```java
if(age >= 18){
    if(hasLicense){
        if(vehicleAvailable){
            if(fuelAvailable){
                System.out.println("Start Journey");
            }
        }
    }
}
```

Although it works, it is difficult to read.

A cleaner approach is:

```java
if(age >= 18 && hasLicense && vehicleAvailable && fuelAvailable){
    System.out.println("Start Journey");
}
```

Both programs produce the same result, but the second version is easier to understand.

---

# Best Practice 1 – Keep Conditions Simple

❌ Avoid

```java
if((a > b && c < d) || (x == y && p != q)){
    ...
}
```

✅ Better

```java
boolean eligible = (a > b && c < d) || (x == y && p != q);

if(eligible){
    ...
}
```

Simple conditions improve readability.

---

# Best Practice 2 – Use Meaningful Variable Names

❌ Poor

```java
if(x > 18){
    ...
}
```

✅ Better

```java
if(age > 18){
    ...
}
```

Descriptive names make the code self-explanatory.

---

# Best Practice 3 – Always Use Braces

Even for a single statement.

❌

```java
if(age >= 18)
    System.out.println("Eligible");
```

✅

```java
if(age >= 18){
    System.out.println("Eligible");
}
```

Braces prevent accidental bugs when new statements are added later.

---

# Best Practice 4 – Avoid Deep Nesting

❌

```java
if(a){
    if(b){
        if(c){
            if(d){
                ...
            }
        }
    }
}
```

✅

```java
if(a && b && c && d){
    ...
}
```

If the conditions are independent, combining them often improves readability.

---

# Best Practice 5 – Choose the Right Control Statement

Use:

- `if` → Single condition
- `if-else` → Two outcomes
- `if-else-if` → Multiple conditions or ranges
- `switch` → One variable compared against many constant values
- `?:` → Simple value assignment

Choosing the right construct makes code clearer.

---

# Best Practice 6 – Prefer switch for Fixed Choices

❌

```java
if(choice == 1){
    ...
}
else if(choice == 2){
    ...
}
else if(choice == 3){
    ...
}
```

✅

```java
switch(choice){
    case 1:
        ...
        break;

    case 2:
        ...
        break;

    default:
        ...
}
```

`switch` is often easier to read for menu-driven programs.

---

# Best Practice 7 – Use Enhanced Switch in Modern Java

Instead of

```java
switch(day){

    case 1:
        result = "Monday";
        break;

    default:
        result = "Invalid";
}
```

Prefer

```java
String result = switch(day){

    case 1 -> "Monday";

    default -> "Invalid";

};
```

It is shorter and prevents accidental fall-through.

---

# Best Practice 8 – Avoid Long if-else-if Ladders

❌

```java
if(country.equals("India")){
    ...
}
else if(country.equals("USA")){
    ...
}
else if(country.equals("Japan")){
    ...
}
```

If you're comparing one variable against many fixed values, a `switch` statement may be more appropriate.

---

# Best Practice 9 – Use Ternary Operator Only for Simple Decisions

✅ Good

```java
String result = (marks >= 35) ? "Pass" : "Fail";
```

❌ Difficult to Read

```java
String grade =
(marks >=90) ? "A"
: (marks >=75) ? "B"
: (marks >=60) ? "C"
: (marks >=35) ? "D"
: "Fail";
```

For multiple conditions, prefer `if-else-if`.

---

# Best Practice 10 – Avoid Duplicate Conditions

❌

```java
if(age >=18){
    ...
}

if(age >=18){
    ...
}
```

Store the result or reorganize the logic to avoid repeating the same condition.

---

# Best Practice 11 – Write Readable Boolean Expressions

❌

```java
if(flag == true){
    ...
}
```

✅

```java
if(flag){
    ...
}
```

Similarly,

❌

```java
if(flag == false){
    ...
}
```

✅

```java
if(!flag){
    ...
}
```

---

# Best Practice 12 – Use Parentheses for Complex Conditions

Even though Java follows operator precedence, parentheses improve readability.

```java
if((age >= 18 && citizen) || specialPermission){
    ...
}
```

---

# Best Practice 13 – Keep Business Logic Separate

Avoid writing complex calculations directly inside conditions.

❌

```java
if((salary + bonus - tax) > 100000){
    ...
}
```

✅

```java
double netIncome = salary + bonus - tax;

if(netIncome > 100000){
    ...
}
```

---

# Best Practice 14 – Handle Default Cases

Always consider unexpected input.

```java
switch(choice){

    case 1:
        ...
        break;

    default:
        System.out.println("Invalid Choice");
}
```

This makes programs more robust.

---

# Best Practice 15 – Test Edge Cases

Always test boundary values.

Examples:

- `age = 18`
- `marks = 35`
- `balance = 0`
- `number = 1`

Testing edge cases helps identify hidden bugs.

---

# Common Mistakes

- Forgetting `break` in a traditional `switch`.
- Writing very long nested `if` statements.
- Using a ternary operator for complex logic.
- Omitting braces.
- Writing duplicate conditions.
- Ignoring invalid inputs.

---

# Industry Coding Standards

Professional Java teams generally follow these practices:

- Keep methods short.
- Keep conditions readable.
- Avoid unnecessary nesting.
- Prefer meaningful names.
- Handle invalid input gracefully.
- Write code that is easy to maintain.

Many teams also use automated tools (such as static code analyzers) to enforce coding standards.

---

# Comparison

| Situation | Recommended |
|-----------|-------------|
| Single condition | `if` |
| Two outcomes | `if-else` |
| Multiple ranges | `if-else-if` |
| Fixed constant values | `switch` |
| Simple assignment | Ternary (`?:`) |
| Modern Java projects | Enhanced `switch` |

---

# Interview Questions

### Why should braces be used even for a single statement?

To improve readability and prevent bugs when additional statements are added later.

---

### Why is deep nesting discouraged?

It makes code harder to read, understand, test, and maintain.

---

### When should you use a `switch` instead of an `if-else-if` ladder?

When comparing a single variable against multiple constant values.

---

### Is the ternary operator always better than `if-else`?

No. It is suitable only for simple expressions.

---

### What is the most important principle when writing flow control logic?

Prioritize readability and maintainability while ensuring the logic is correct.

---

# Quick Revision

```
✔ Keep conditions simple

✔ Use braces

✔ Avoid deep nesting

✔ Choose the right statement

✔ Handle default cases

✔ Test edge cases

✔ Write readable code
```

---

# Bootcamp Insight 💡

Writing correct code is only half the job of a software engineer. Writing code that your teammates can easily understand and maintain is equally important. During placement interviews and code reviews, interviewers often evaluate not just whether your solution works, but also how clearly and professionally it is written.

---

# Connection Map

```
Decision Making

↓

Best Practices

↓

Readable Code

↓

Maintainable Code

↓

Professional Java Development

↓

Spring Boot

↓

Enterprise Applications
```

---

# Future Topic

Next, you'll study **Comparison of Decision-Making Statements**, where you'll learn when to choose `if`, `if-else`, `if-else-if`, `switch`, enhanced `switch`, or the ternary operator for different scenarios.

---

# Key Takeaways

- Write simple and readable conditions.
- Always use braces for clarity and safety.
- Avoid unnecessary nesting.
- Choose the appropriate decision-making construct.
- Test boundary conditions and invalid inputs.
- Prioritize maintainability over clever code.

---

# References

- Oracle Java Documentation
- Java Language Specification (JLS)
- Effective Java – Joshua Bloch
- Clean Code – Robert C. Martin
- Head First Java