# Java Control Statements - Interview Questions

> **Module 17 – Control Statements (Decision Making)**

---

# Introduction

This chapter contains frequently asked Java interview questions on:

- if
- if-else
- if-else-if
- Nested if
- switch
- Enhanced switch
- Ternary Operator

Questions are arranged from **Beginner → Intermediate → Advanced → Tricky**.

---

# Beginner Level

## 1. What is a control statement?

A control statement changes the normal sequential execution of a program by making decisions, repeating statements, or transferring control.

---

## 2. What are the types of control statements in Java?

- Decision Making
- Looping
- Jump Statements

---

## 3. What is the purpose of an if statement?

It executes a block of code only when the specified condition is true.

---

## 4. What type of value must an if condition return?

A boolean value (`true` or `false`).

---

## 5. Can an if statement execute when the condition is false?

No.

---

## 6. Is else mandatory?

No.

It is optional.

---

## 7. Can an else exist without an if?

No.

---

## 8. How many else blocks can an if have?

Only one.

---

## 9. Can we write multiple if statements?

Yes.

Each `if` is evaluated independently unless connected using `else`.

---

## 10. What is an if-else statement?

It selects one of two execution paths depending on whether the condition is true or false.

---

## 11. What is an if-else-if ladder?

A structure used to evaluate multiple conditions in sequence.

---

## 12. Which block executes in an if-else-if ladder?

Only the **first matching block** executes.

---

## 13. What happens if no condition matches?

The optional `else` block executes.

---

## 14. What is a Nested if?

An if statement inside another if statement.

---

## 15. When should Nested if be used?

When one decision depends on another.

---

# Intermediate Level

## 16. What is a switch statement?

A decision-making statement that compares one expression with multiple constant values.

---

## 17. Why is break used inside switch?

It terminates the switch after executing the matched case and prevents fall-through.

---

## 18. What is fall-through?

Execution continues into the next case when `break` is omitted in a traditional switch.

---

## 19. Is default mandatory?

No.

However, it is recommended.

---

## 20. Which data types are supported by switch?

- byte
- short
- char
- int
- enum
- String

---

## 21. Can switch work with long?

No.

---

## 22. Can switch work with float or double?

No.

---

## 23. Can switch evaluate ranges?

No.

Use `if-else-if` instead.

---

## 24. What is the ternary operator?

The only conditional operator in Java.

Syntax

```java
condition ? value1 : value2
```

---

## 25. Why is it called a ternary operator?

Because it uses three operands:

- Condition
- True value
- False value

---

## 26. Can the ternary operator replace every if-else?

No.

It is suitable only for simple conditional expressions.

---

## 27. Can ternary operators be nested?

Yes.

But excessive nesting reduces readability.

---

## 28. What is enhanced switch?

A modern switch expression introduced in Java 14 that supports arrow (`->`) syntax and can return values.

---

## 29. What is yield?

`yield` returns a value from a block inside an enhanced switch expression.

---

## 30. Why is enhanced switch better?

- No break required
- No accidental fall-through
- Cleaner syntax
- Can return values

---

# Advanced Level

## 31. When should you choose if instead of switch?

Use `if` when conditions involve ranges, relational operators, or complex boolean expressions.

---

## 32. When should you choose switch?

When comparing one variable against many constant values.

---

## 33. Which is more readable: switch or if-else-if?

For fixed values, `switch` is generally more readable.

For ranges and complex logic, `if-else-if` is usually the better choice.

---

## 34. Can a switch case contain multiple labels?

Yes.

Example

```java
case 1, 2, 3 -> System.out.println("Group");
```

(Java 14+ enhanced switch)

---

## 35. Does enhanced switch allow fall-through?

No, when using the arrow (`->`) syntax.

---

## 36. Can switch return a value?

Traditional switch cannot directly return a value.

Enhanced switch expressions can.

---

## 37. Can we use braces in enhanced switch?

Yes.

When multiple statements are needed.

---

## 38. When is yield required?

When an enhanced switch case uses a block and needs to return a value.

---

## 39. Why should deep nesting be avoided?

It reduces readability, maintainability, and makes debugging more difficult.

---

## 40. Why should braces always be used?

To improve readability and prevent bugs when additional statements are added later.

---

# Tricky Questions

## 41. Which condition executes first in an if-else-if ladder?

The conditions are evaluated from top to bottom.

---

## 42. Can two blocks execute in an if-else-if ladder?

No.

Only the first matching block executes.

---

## 43. Can multiple if statements execute?

Yes.

If they are independent and their conditions are true.

---

## 44. What is wrong with this code?

```java
if(flag == true)
```

Nothing is technically wrong, but `if(flag)` is simpler and more readable.

---

## 45. Which is better?

```java
if(flag)
```

or

```java
if(flag == true)
```

`if(flag)` is preferred.

---

## 46. Which statement is best for menus?

switch

---

## 47. Which statement is best for grading systems?

if-else-if

---

## 48. Which statement is best for login validation?

if or if-else, depending on the logic.

---

## 49. Can we omit braces?

Yes, for a single statement.

However, using braces consistently is considered a best practice.

---

## 50. What is the biggest mistake beginners make with switch?

Forgetting the `break` statement in a traditional switch, leading to unintended fall-through.

---

# Coding-Based Interview Questions

1. Check voting eligibility.
2. Find the largest of two numbers.
3. Find the largest of three numbers.
4. Determine whether a number is even or odd.
5. Determine whether a year is a leap year.
6. Assign grades using if-else-if.
7. Build a menu-driven calculator using switch.
8. Convert a month number to a month name.
9. Check whether a character is a vowel or consonant.
10. Write a program using the ternary operator to find the maximum of two numbers.

---

# HR + Technical Mix

### Why should readable code be preferred over clever code?

Readable code is easier to understand, maintain, test, and debug, especially when working in a team.

---

### When should nested if be avoided?

When the same logic can be expressed more clearly using logical operators (`&&`, `||`) or by restructuring the code.

---

### What coding style do professional Java developers follow?

- Simple conditions
- Meaningful variable names
- Consistent braces
- Proper indentation
- Appropriate control statements
- Readable and maintainable code

---

# Quick Interview Revision

| Question | Answer |
|----------|--------|
| Single condition | if |
| Two outcomes | if-else |
| Multiple conditions | if-else-if |
| Dependent conditions | Nested if |
| Fixed values | switch |
| Modern switch | Enhanced switch |
| Short if-else | Ternary |
| Stops switch | break |
| Default block | default |
| Returns value from switch block | yield |

---

# Bootcamp Insight 💡

Interviewers rarely ask only for syntax. They often want to know **why** you chose a particular control statement, what alternatives exist, and how your solution affects readability and maintainability. Practice explaining your decisions, not just writing code.

---

# References

- Oracle Java Documentation
- Java Language Specification (JLS)
- Effective Java – Joshua Bloch
- Clean Code – Robert C. Martin