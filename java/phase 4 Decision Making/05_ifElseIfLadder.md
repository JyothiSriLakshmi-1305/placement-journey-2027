# if-else-if Ladder

> **Module 17 – Control Statements (Decision Making)**

---

# Introduction

The **if-else-if ladder** is a decision-making statement used when a program needs to choose **one option from multiple conditions**.

Unlike the `if-else` statement, which provides only two possible execution paths, the `if-else-if` ladder allows Java to evaluate several conditions one by one until a matching condition is found.

It is commonly used in grading systems, tax calculations, menu-driven applications, discount systems, and many other real-world applications.

---

# History

As software systems became more advanced, programmers needed a way to evaluate multiple conditions efficiently.

Early programming languages introduced chained conditional statements to solve this problem.

Java inherited this concept from the C language and provides the `if-else-if` ladder as a structured and readable solution for handling multiple conditions.

---

# Why Do We Need if-else-if?

Suppose a college wants to assign grades based on marks.

Without `if-else-if`

```java
System.out.println("Grade A");
System.out.println("Grade B");
System.out.println("Grade C");
```

Every grade would be printed.

This is incorrect.

Instead, the program should determine the correct grade based on the student's marks.

---

# Problem Statement

Many real-world problems involve more than two possible outcomes.

Examples:

- Student grades
- Income tax slabs
- Electricity bill calculation
- Employee bonus
- Shopping discounts
- Traffic fine categories

The `if-else-if` ladder provides a clean way to handle these scenarios.

---

# Definition

The **if-else-if ladder** checks multiple conditions in sequence.

The first condition that evaluates to **true** executes its corresponding block, and the remaining conditions are skipped.

If none of the conditions are true, the optional `else` block executes.

---

# Syntax

```java
if(condition1){

    // Block 1

}
else if(condition2){

    // Block 2

}
else if(condition3){

    // Block 3

}
else{

    // Default Block

}
```

---

# Syntax Breakdown

| Part | Purpose |
|------|---------|
| if | First condition |
| else if | Additional conditions |
| else | Executes if no condition matches |

---

# Flow Diagram

```
                 Start
                    │
                    ▼
             Condition 1
              /       \
           True      False
            │           │
            ▼           ▼
        Block 1    Condition 2
                       /    \
                    True   False
                     │        │
                     ▼        ▼
                 Block 2  Condition 3
                               /   \
                            True  False
                              │      │
                              ▼      ▼
                          Block 3  Else Block
                                │
                                ▼
                               End
```

---

# Internal Working

Example

```java
int marks = 82;

if(marks >= 90){
    System.out.println("Grade A");
}
else if(marks >= 75){
    System.out.println("Grade B");
}
else{
    System.out.println("Grade C");
}
```

### Step 1

```
marks = 82
```

### Step 2

Check

```
marks >= 90

↓

false
```

### Step 3

Move to next condition

```
marks >=75

↓

true
```

### Step 4

```
Print Grade B
```

### Step 5

Remaining conditions are skipped.

---

# Memory Representation

```
Stack Memory

+------------------+

marks = 82

+------------------+
```

Evaluation

```
Condition 1

↓

false

↓

Condition 2

↓

true

↓

Execute Block 2

↓

End
```

---

# Example 1 – Student Grade

```java
int marks = 95;

if(marks >=90){
    System.out.println("Grade A");
}
else if(marks >=75){
    System.out.println("Grade B");
}
else if(marks >=60){
    System.out.println("Grade C");
}
else{
    System.out.println("Fail");
}
```

Output

```
Grade A
```

---

# Example 2 – Shopping Discount

```java
int amount = 4500;

if(amount >=5000){
    System.out.println("20% Discount");
}
else if(amount >=3000){
    System.out.println("15% Discount");
}
else if(amount >=1000){
    System.out.println("10% Discount");
}
else{
    System.out.println("No Discount");
}
```

---

# Example 3 – Income Tax

```java
double salary = 900000;

if(salary <=300000){
    System.out.println("No Tax");
}
else if(salary <=700000){
    System.out.println("10% Tax");
}
else{
    System.out.println("20% Tax");
}
```

---

# Example 4 – Traffic Signal

```java
String signal = "Yellow";

if(signal.equals("Green")){
    System.out.println("Go");
}
else if(signal.equals("Yellow")){
    System.out.println("Ready");
}
else{
    System.out.println("Stop");
}
```

---

# Example 5 – Temperature

```java
int temp = 18;

if(temp >=35){
    System.out.println("Hot");
}
else if(temp >=20){
    System.out.println("Warm");
}
else{
    System.out.println("Cold");
}
```

---

# Dry Run

```java
int age = 65;

if(age <18){
    System.out.println("Child");
}
else if(age <60){
    System.out.println("Adult");
}
else{
    System.out.println("Senior Citizen");
}
```

Execution

```
65 <18

↓

false

↓

65 <60

↓

false

↓

Print Senior Citizen
```

---

# Real-Life Analogies

### School Grades

```
Marks ≥ 90

↓

Grade A

Else

↓

Marks ≥75

↓

Grade B

Else

↓

Marks ≥60

↓

Grade C

Else

↓

Fail
```

---

### Shopping

```
Amount ≥5000

↓

20%

Else

↓

Amount ≥3000

↓

15%

Else

↓

10%

Else

↓

No Discount
```

---

# Industry Applications

Used in:

- Grading Systems
- Payroll Software
- Income Tax Calculation
- Banking Systems
- Discount Engines
- Loan Eligibility
- Healthcare Risk Levels
- Spring Boot Business Rules

---

# Advantages

- Handles multiple conditions.
- Easy to understand.
- Executes only one matching block.
- Improves readability.

---

# Limitations

- Long ladders reduce readability.
- Slower than `switch` when checking many fixed values.
- Deep logic is harder to maintain.

---

# Best Practices

✅ Arrange conditions from most specific to most general.

✅ Avoid unnecessary conditions.

✅ Keep conditions readable.

✅ Use `switch` when comparing one variable with many constant values.

---

# Common Mistakes

❌ Incorrect ordering of conditions.

Example

```java
if(marks >=60){
    System.out.println("Pass");
}
else if(marks >=90){
    System.out.println("Grade A");
}
```

The second condition will never execute.

---

❌ Overusing long if-else-if ladders.

---

# Comparison

| Feature | if | if-else | if-else-if |
|---------|----|----------|------------|
| Conditions | One | One | Multiple |
| Outcomes | One | Two | Many |
| Executes | True block only | One of two blocks | First matching block |

---

# Interview Questions

### What is an if-else-if ladder?

A decision-making structure that checks multiple conditions in sequence.

---

### How many blocks execute?

Only the first matching block.

---

### What happens if no condition is true?

The `else` block executes if it is present.

---

### Can we write multiple else blocks?

No.

---

### When should we use switch instead?

When comparing a single variable against multiple fixed constant values.

---

# Quick Revision

```
if

↓

Condition 1

↓

False

↓

Condition 2

↓

False

↓

Condition 3

↓

True

↓

Execute

↓

End
```

---

# Bootcamp Insight 💡

The `if-else-if` ladder is widely used in enterprise applications to implement business rules such as pricing, eligibility, discounts, grading, and tax calculations. Keep your conditions ordered logically and avoid very long ladders—if you find yourself comparing one variable against many constant values, consider using a `switch` statement instead.

---

# Connection Map

```
if

↓

if-else

↓

if-else-if

↓

switch

↓

Loops

↓

Methods
```

---

# Future Topic

Next, you'll learn **Nested if**, where one decision depends on the result of another decision.

---

# Key Takeaways

- Used for multiple conditions.
- Conditions are checked from top to bottom.
- Only the first matching block executes.
- `else` acts as the default block.
- Arrange conditions carefully to avoid unreachable logic.

---

# References

- Oracle Java Documentation
- Java Language Specification
- Effective Java – Joshua Bloch
- Head First Java