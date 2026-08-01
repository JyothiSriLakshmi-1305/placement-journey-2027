# Java Identifiers

## What are Identifiers?

Identifiers are the **names given to Java program elements** such as:

- Variables
- Methods
- Classes
- Interfaces
- Packages
- Objects

They help uniquely identify each element in a program.

Example:

```java
int age = 20;

class Student {

    void display() {

    }
}
```

Here:

- `age` → Variable Identifier
- `Student` → Class Identifier
- `display` → Method Identifier

---

# Rules for Naming Identifiers

## 1. Can contain letters, digits, `_` and `$`

Valid Examples

```java
student
student1
_student
student$
```

---

## 2. Cannot start with a digit

❌ Invalid

```java
1student
123abc
```

✅ Valid

```java
student1
age2
```

---

## 3. Cannot use Java Keywords

❌ Invalid

```java
int class = 10;
```

Since `class` is a reserved keyword.

---

## 4. Case Sensitive

Java treats uppercase and lowercase differently.

```java
int age = 20;
int Age = 25;
```

These are **two different variables**.

---

## 5. No Spaces

❌ Invalid

```java
student name
```

✅ Valid

```java
studentName
student_name
```

---

## 6. Special Characters are Not Allowed

Except

- `_`
- `$`

❌ Invalid

```java
student-name
student@name
student#1
```

---

# Valid Identifiers

```java
name
age
Student
studentName
student_name
salary2026
$value
_value
```

---

# Invalid Identifiers

```java
2name
class
public
student-name
student name
student@123
```

---

# Naming Conventions

Although Java allows many names, developers follow standard conventions.

## Class Names

- Start with Capital Letter
- Use PascalCase

Example

```java
Student

EmployeeDetails

BankAccount
```

---

## Method Names

- Start with small letter
- Use camelCase

Example

```java
calculateSalary()

printDetails()

findMaximum()
```

---

## Variable Names

- Start with small letter
- Use camelCase

Example

```java
studentName

totalMarks

employeeId
```

---

## Constant Names

Constants are declared using `final`.

Convention:

- ALL CAPITAL LETTERS
- Words separated using `_`

Example

```java
final double PI = 3.14;

final int MAX_SIZE = 100;
```

---

## Package Names

Always lowercase.

Example

```java
java.util

com.company.project
```

---

# Example Program

```java
public class Student {

    String studentName;

    int rollNumber;

    void display() {

        System.out.println(studentName);
    }

    public static void main(String[] args) {

        Student s = new Student();

        s.studentName = "Rahul";

        s.rollNumber = 101;

        s.display();
    }
}
```

Identifiers used:

- Student
- studentName
- rollNumber
- display
- s
- main

---

# Common Mistakes

❌ Using keywords

```java
int while = 10;
```

---

❌ Starting with number

```java
int 123age;
```

---

❌ Using spaces

```java
student age
```

---

❌ Using invalid symbols

```java
student-name
```

---

# Best Practices

- Use meaningful names.
- Follow Java naming conventions.
- Keep names short but descriptive.
- Avoid single-letter names except in loops.
- Do not use `$` unless required by generated code.
- Use camelCase for variables and methods.
- Use PascalCase for classes.
- Use UPPER_CASE for constants.

---

# Interview Questions

### Q1. What is an Identifier?

An identifier is the name given to a program element such as a variable, class, method, object, or package.

---

### Q2. Can an identifier start with a number?

No.

Example

```java
int 1age;
```

Invalid.

---

### Q3. Can an identifier contain `$`?

Yes.

```java
int $salary = 5000;
```

Although valid, it is not recommended in normal coding.

---

### Q4. Is Java case-sensitive?

Yes.

```java
age
Age
AGE
```

These are three different identifiers.

---

### Q5. Can an identifier be a keyword?

No.

```java
int class = 10;
```

Produces a compile-time error.

---

# Revision Checklist

- [ ] Definition of Identifier
- [ ] Rules for Naming
- [ ] Valid Identifiers
- [ ] Invalid Identifiers
- [ ] Java Naming Conventions
- [ ] Common Mistakes
- [ ] Interview Questions

---

# Key Takeaways

- Identifiers are names for Java program elements.
- They cannot be Java keywords.
- They cannot begin with a digit.
- They are case-sensitive.
- Only `_` and `$` are allowed as special characters.
- Follow Java naming conventions for clean and maintainable code.

---

## References

- https://www.geeksforgeeks.org/java/java-identifiers/
- Oracle Java Documentation
