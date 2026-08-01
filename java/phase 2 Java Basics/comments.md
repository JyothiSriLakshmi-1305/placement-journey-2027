# Java Comments

## What are Comments?

Comments are **non-executable text** in a Java program used to explain code, improve readability, and provide documentation. The Java compiler ignores comments during compilation.

Example:

```java
// This is a comment
System.out.println("Hello, World!");
```

---

# Why Do We Need Comments?

Comments help developers:

- Explain complex logic
- Improve code readability
- Document classes and methods
- Make maintenance easier
- Collaborate effectively with other developers

---

# Types of Comments in Java

Java supports three types of comments:

1. Single-Line Comments
2. Multi-Line Comments
3. Documentation (JavaDoc) Comments

---

# 1. Single-Line Comment

A single-line comment starts with `//` and continues until the end of the line.

### Syntax

```java
// comment
```

### Example

```java
public class Main {

    public static void main(String[] args) {

        // Printing a message
        System.out.println("Welcome to Java");
    }
}
```

### Use Cases

- Short explanations
- Temporary debugging
- Describing a single statement

---

# 2. Multi-Line Comment

A multi-line comment begins with `/*` and ends with `*/`.

### Syntax

```java
/*
comment
*/
```

### Example

```java
/*
This program
prints
Hello World
*/

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello");
    }
}
```

### Use Cases

- Long explanations
- Block descriptions
- Temporary disabling of code

---

# 3. JavaDoc Comment

JavaDoc comments begin with `/**` and end with `*/`.

They are used to generate professional documentation using the **javadoc** tool.

### Syntax

```java
/**
 * Documentation
 */
```

### Example

```java
/**
 * Adds two numbers.
 *
 * @param a First number
 * @param b Second number
 * @return Sum of two numbers
 */

public int add(int a, int b) {

    return a + b;
}
```

---

# Difference Between Multi-Line and JavaDoc Comments

| Multi-Line Comment | JavaDoc Comment |
|--------------------|-----------------|
| Starts with `/*` | Starts with `/**` |
| Used for explanations | Used for documentation |
| Cannot generate documentation | Can generate HTML documentation |

---

# JavaDoc Tags

Some commonly used JavaDoc tags are:

| Tag | Description |
|------|-------------|
| `@author` | Author name |
| `@version` | Version of the class |
| `@param` | Method parameter |
| `@return` | Return value |
| `@throws` | Exception information |
| `@since` | Version introduced |
| `@see` | Related classes or methods |
| `@deprecated` | Marks deprecated APIs |

### Example

```java
/**
 * Calculates the square of a number.
 *
 * @author Jyothi
 * @version 1.0
 * @param number Input number
 * @return Square of the number
 */

public int square(int number) {

    return number * number;
}
```

---

# Example Program

```java
public class CommentsDemo {

    public static void main(String[] args) {

        // Variable declaration
        int age = 20;

        /*
         * Displaying
         * the age
         */
        System.out.println(age);
    }
}
```

---

# Best Practices

- Write comments only when necessary.
- Keep comments simple and meaningful.
- Update comments whenever code changes.
- Prefer self-explanatory variable and method names.
- Use JavaDoc for public classes and methods.
- Avoid redundant comments.

Good Example

```java
double area = Math.PI * radius * radius;
```

Bad Example

```java
// Multiply pi with radius twice
double area = Math.PI * radius * radius;
```

The code is already self-explanatory, so the comment is unnecessary.

---

# Common Mistakes

### Writing unnecessary comments

```java
// Increment i
i++;
```

---

### Outdated comments

```java
// Adds two numbers
return a - b;
```

The comment no longer matches the code.

---

### Commenting out large blocks of code

```java
/*
int x = 10;
int y = 20;
System.out.println(x + y);
*/
```

Use version control (Git) instead of keeping unused code commented out.

---

# Interview Questions

### Q1. What are comments in Java?

Comments are ignored by the compiler and are used to explain or document code.

---

### Q2. How many types of comments are available in Java?

Three:

- Single-line comments
- Multi-line comments
- JavaDoc comments

---

### Q3. Which comment type is used to generate documentation?

JavaDoc comments (`/** ... */`).

---

### Q4. Which tool generates Java documentation?

The `javadoc` tool.

---

### Q5. Are comments executed by the JVM?

No. Comments are ignored during compilation and execution.

---

# Frequently Asked MCQs

### 1. Which symbol starts a single-line comment?

- A. `/*`
- B. `//`
- C. `/**`
- D. `#`

**Answer:** B

---

### 2. Which comment type is used for API documentation?

- A. Single-line
- B. Multi-line
- C. JavaDoc
- D. None

**Answer:** C

---

### 3. Which tool generates Java documentation?

- A. javac
- B. java
- C. javadoc
- D. jar

**Answer:** C

---

# Coding Exercise

Write a Java program that demonstrates:

- One single-line comment
- One multi-line comment
- One JavaDoc comment

---

# Assignment

Create a program with:

- A class-level JavaDoc comment
- A method-level JavaDoc comment
- Single-line comments explaining important logic
- Multi-line comments describing the program

---

# Revision Notes

- Comments improve readability.
- The compiler ignores comments.
- Java has three types of comments.
- JavaDoc comments generate documentation.
- Use comments wisely; avoid redundant comments.

---

# Key Takeaways

- Comments explain code without affecting execution.
- Single-line comments use `//`.
- Multi-line comments use `/* ... */`.
- JavaDoc comments use `/** ... */`.
- JavaDoc is used for creating professional API documentation.

---

## References

- Oracle Java Documentation
- https://docs.oracle.com/en/java/
- https://www.geeksforgeeks.org/comments-in-java/
