# Java Character Input using Scanner

> **Module 14 – Input System**
>
> **Topic:** Character Input

---

# History

When Java introduced the **Scanner** class (Java 5), it provided methods for reading almost every primitive data type:

- nextInt()
- nextDouble()
- nextBoolean()
- nextFloat()
- nextLong()

However, Java **did not provide a `nextChar()` method**.

Instead, Java expects programmers to read a **String** first and then extract a character using the `charAt()` method.

---

# Why is there no nextChar() Method?

A keyboard always sends **text**, not individual characters.

When you press

```
A
```

Java actually receives

```
"A"
```

which is a **String** containing one character.

Since Scanner already reads Strings using `next()`, Java designers decided there was no need for a separate `nextChar()` method.

---

# Problem Statement

Suppose we want to read a student's grade.

```
Enter Grade:

A
```

If we try

```java
char grade = sc.nextChar();
```

Java gives a compile-time error because **nextChar() does not exist**.

---

# Real-Life Analogy

Imagine picking the **first letter** from a word.

Word

```
Java
```

Characters

```
J
a
v
a
```

`charAt(0)` picks

```
J
```

Similarly,

```
A
```

contains only one character, so

```java
charAt(0)
```

returns

```
A
```

---

# Daily Applications

Character input is useful for:

- Grade (A, B, C)
- Gender (M/F)
- Menu Choice
- Direction (N, S, E, W)
- Y/N Confirmation
- Initials

---

# Industry Applications

Character input is commonly used in:

- Menu-driven programs
- Banking systems
- Examination software
- Navigation systems
- Embedded applications

---

# Definition

Scanner does **not** provide a `nextChar()` method.

To read a character, we first read a **String** using `next()` and then extract the first character using `charAt(0)`.

---

# Syntax

```java
char variable = sc.next().charAt(0);
```

Example

```java
char grade = sc.next().charAt(0);
```

---

# Understanding the Statement

```java
char grade = sc.next().charAt(0);
```

| Part | Meaning |
|------|---------|
| sc | Scanner Object |
| next() | Reads one word as a String |
| charAt(0) | Returns the first character |
| grade | Character variable |

---

# Internal Working

```
Keyboard

↓

Scanner

↓

next()

↓

String

↓

charAt(0)

↓

Character

↓

Variable
```

---

# Memory Diagram

User enters

```
A
```

Scanner stores

```
"A"
```

↓

charAt(0)

↓

```
'A'
```

↓

Stored in

```
grade
```

---

# Flow Diagram

```
Start

↓

Create Scanner

↓

Read String

↓

Extract First Character

↓

Store in char

↓

Display Output

↓

End
```

---

# Example Program

```java
import java.util.Scanner;

public class CharacterInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Grade: ");

        char grade = sc.next().charAt(0);

        System.out.println("Grade = " + grade);

        sc.close();

    }

}
```

---

## Output

```
Enter Grade:

A

Grade = A
```

---

# Example 2

Input

```
Java
```

Program

```java
char ch = sc.next().charAt(0);

System.out.println(ch);
```

Output

```
J
```

Only the **first character** is returned.

---

# Dry Run

Input

```
Hello
```

↓

Scanner reads

```
"Hello"
```

↓

`charAt(0)`

↓

```
'H'
```

↓

Stored in

```
ch
```

↓

Output

```
H
```

---

# Why charAt(0)?

A String contains multiple characters.

Example

```
Java
```

Index positions

```
J   a   v   a

0   1   2   3
```

`charAt(0)` returns

```
J
```

---

# 💡 Bootcamp Insight

Remember:

```
Scanner

↓

next()

↓

Returns String

↓

charAt(0)

↓

Returns Character
```

Java doesn't read characters directly using Scanner.

It reads a String first.

---

# Best Practices

- Use `charAt(0)` only when you need one character.
- Inform the user to enter a single character.
- Validate input length when necessary.
- Close the Scanner after use.

---

# Common Mistakes

## Mistake 1

```java
sc.nextChar();
```

❌ Compile-time Error

Reason:

Scanner has **no nextChar() method**.

---

## Mistake 2

```java
char ch = sc.next();
```

❌ Error

Reason:

`next()` returns a String, not a char.

Correct

```java
char ch = sc.next().charAt(0);
```

---

## Mistake 3

Input

```
Java
```

Using

```java
charAt(0)
```

Output

```
J
```

Only the first character is returned.

---

# Interview Questions

### Q1

Does Scanner have a `nextChar()` method?

**Answer**

No.

---

### Q2

How do you read a character using Scanner?

**Answer**

```java
sc.next().charAt(0);
```

---

### Q3

Why do we use `charAt(0)`?

**Answer**

Because `next()` returns a String, and `charAt(0)` extracts the first character.

---

### Q4

What happens if the user enters `"Java"`?

**Answer**

Only `'J'` is returned.

---

# MCQs

### 1

Which method reads a character directly?

A. nextChar()

B. char()

C. None

D. nextCharacter()

**Answer:** C

---

### 2

`next()` returns

A. char

B. int

C. String

D. boolean

**Answer:** C

---

### 3

Which method extracts a character from a String?

A. next()

B. char()

C. charAt()

D. getChar()

**Answer:** C

---

# Coding Exercises

1. Read a student's grade.
2. Read gender (`M/F`).
3. Read menu choice (`A/B/C`).
4. Read the first letter of your name.
5. Read a direction (`N/S/E/W`).

---

# Assignment

Write a Java program that asks the user to enter:

- Grade
- Gender
- Menu Choice

Display all three values using character variables.

---

# Revision Notes

- Scanner has **no `nextChar()` method**.
- `next()` returns a String.
- `charAt(0)` extracts the first character.
- Character indexing starts at **0**.
- If multiple characters are entered, only the first one is returned.

---

# Connection Map

```
Scanner Class

↓

next()

↓

String

↓

charAt(0)

↓

Character Input

↓

Parsing Methods
```

---

# Future Topic Connection

Now that you've learned how to read:

- String
- Integer
- Double
- Boolean
- Character

the next step is learning **Parsing Methods**.

Parsing allows Java to **convert Strings into primitive data types**, which is essential when reading data from files, APIs, databases, and web applications.

---

# Key Takeaways

- Scanner does not provide `nextChar()`.
- Use `sc.next().charAt(0)` to read a character.
- `next()` returns a String.
- `charAt(0)` returns the first character.
- This is a very common Java interview question.

---

## References

- Oracle Java Documentation
- https://docs.oracle.com/en/java/