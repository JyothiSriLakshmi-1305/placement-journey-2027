# Java Command Line Arguments - MCQs

> **Module 16 – Command Line Arguments**
>
> **Placement & Interview Practice**

---

# Basic Level

## 1.

Command Line Arguments are passed:

A. During compilation

B. Before program execution

C. During execution using Scanner

D. After program execution

**Answer:** B

---

## 2.

Command Line Arguments are stored in:

A. String

B. String[]

C. int[]

D. ArrayList

**Answer:** B

---

## 3.

Which method receives Command Line Arguments?

A. start()

B. execute()

C. main()

D. init()

**Answer:** C

---

## 4.

Who creates the `args` array?

A. Programmer

B. Compiler

C. JVM

D. Operating System

**Answer:** C

---

## 5.

All Command Line Arguments are stored as:

A. int

B. float

C. String

D. char

**Answer:** C

---

## 6.

Which keyword allows the JVM to access `main()`?

A. static

B. void

C. public

D. final

**Answer:** C

---

## 7.

Why is `main()` static?

A. Faster execution

B. JVM can call it without creating an object

C. Saves memory

D. It is mandatory for all methods

**Answer:** B

---

## 8.

Which package contains the `String` class?

A. java.util

B. java.io

C. java.lang

D. java.math

**Answer:** C

---

## 9.

How many arguments are passed?

```bash
java Demo A B C
```

A. 2

B. 3

C. 4

D. 1

**Answer:** B

---

## 10.

Which expression returns the number of arguments?

A. args.size()

B. args.count()

C. args.length

D. args.length()

**Answer:** C

---

# Intermediate Level

## 11.

First argument is accessed using:

A. args(0)

B. args[0]

C. args.first()

D. args.get(0)

**Answer:** B

---

## 12.

Last argument is accessed using:

A. args[args.length]

B. args[args.length-1]

C. args[last]

D. args.end()

**Answer:** B

---

## 13.

Which method converts a String to an int?

A. Integer.value()

B. Integer.parseInt()

C. Integer.convert()

D. parse()

**Answer:** B

---

## 14.

Which method converts a String to a double?

A. Double.parseDouble()

B. Double.value()

C. Double.convert()

D. parse()

**Answer:** A

---

## 15.

What happens if no arguments are supplied?

A. `args` is `null`

B. `args.length` is `0`

C. Compile-time error

D. JVM stops immediately

**Answer:** B

---

## 16.

Accessing `args[0]` when no arguments exist throws:

A. NullPointerException

B. IOException

C. ArrayIndexOutOfBoundsException

D. NumberFormatException

**Answer:** C

---

## 17.

Parsing `"ABC"` using `Integer.parseInt()` throws:

A. IOException

B. ArithmeticException

C. NumberFormatException

D. IndexOutOfBoundsException

**Answer:** C

---

## 18.

Which loop is commonly used to print all arguments?

A. while

B. do-while

C. Enhanced for loop

D. switch

**Answer:** C

---

## 19.

Which statement is correct?

A. Command Line Arguments are integers.

B. Command Line Arguments are Strings.

C. Command Line Arguments are Objects only.

D. Command Line Arguments are characters.

**Answer:** B

---

## 20.

Which method starts a Java application?

A. run()

B. execute()

C. main()

D. start()

**Answer:** C

---

# Conceptual Questions

## 21.

Can we rename `args`?

A. No

B. Yes

**Answer:** B

---

## 22.

Which declaration is valid?

A.

```java
String[] args
```

B.

```java
String args[]
```

C. Both A and B

D. Neither

**Answer:** C

---

## 23.

Which component loads the `.class` file?

A. Compiler

B. Class Loader

C. Scanner

D. JVM Memory

**Answer:** B

---

## 24.

Who calls the `main()` method?

A. Compiler

B. IDE

C. JVM

D. Programmer

**Answer:** C

---

## 25.

The entry point of a Java application is:

A. constructor

B. init()

C. main()

D. execute()

**Answer:** C

---

# Comparison Questions

## 26.

Which input method is best for automation?

A. Scanner

B. BufferedReader

C. Command Line Arguments

D. Console

**Answer:** C

---

## 27.

Which input method is best for password input?

A. Scanner

B. BufferedReader

C. Console

D. Command Line Arguments

**Answer:** C

---

## 28.

Which input method is most suitable for beginners?

A. Scanner

B. Command Line Arguments

C. Console

D. BufferedReader

**Answer:** A

---

## 29.

Which input method is commonly preferred in competitive programming?

A. Console

B. Scanner

C. BufferedReader

D. Command Line Arguments

**Answer:** C

---

## 30.

Command Line Arguments are provided:

A. Before execution

B. During execution

C. After execution

D. During compilation

**Answer:** A

---

# Advanced Questions

## 31.

Which statement is TRUE?

A. `args` is always `null`

B. `args` is created by the JVM

C. Programmer creates `args`

D. Compiler creates `args`

**Answer:** B

---

## 32.

Which of the following is NOT a valid command?

A.

```bash
java Demo 10 20
```

B.

```bash
java Demo Hello
```

C.

```bash
java Demo
```

D.

```bash
javac Demo 10
```

**Answer:** D

---

## 33.

Which exception is avoided by checking `args.length`?

A. NumberFormatException

B. IOException

C. ArrayIndexOutOfBoundsException

D. ArithmeticException

**Answer:** C

---

## 34.

Which statement is TRUE?

A. `args.length()` returns the number of arguments.

B. `args.length` returns the number of arguments.

C. `args.size()` returns the number of arguments.

D. `args.count()` returns the number of arguments.

**Answer:** B

---

## 35.

Which of the following best describes Command Line Arguments?

A. Runtime configuration values

B. Keyboard input

C. File input

D. Database records

**Answer:** A

---

# Tricky Questions

## 36.

Can `main()` be overloaded?

A. No

B. Yes

**Answer:** B

> The JVM starts execution only from:

```java
public static void main(String[] args)
```

---

## 37.

Can Command Line Arguments contain spaces?

A. No

B. Yes, if enclosed in quotes

**Answer:** B

---

## 38.

Which statement is FALSE?

A. Command Line Arguments are Strings.

B. JVM creates the `args` array.

C. `args` is a keyword.

D. `args` can be renamed.

**Answer:** C

---

## 39.

Which command passes three arguments?

A.

```bash
java Demo
```

B.

```bash
java Demo Java
```

C.

```bash
java Demo Java Placement 2027
```

D.

```bash
javac Demo Java Placement
```

**Answer:** C

---

## 40.

Which of the following is a best practice?

A. Access `args[0]` directly.

B. Always check `args.length` first.

C. Assume all inputs are integers.

D. Ignore parsing errors.

**Answer:** B

---

# Score Yourself

| Score | Performance |
|--------|-------------|
| 36–40 | ⭐ Excellent |
| 30–35 | ⭐ Very Good |
| 24–29 | ⭐ Good |
| 18–23 | ⭐ Needs Revision |
| Below 18 | ⭐ Revise the Module Again |

---

# Quick Revision

✅ Passed before execution

✅ Stored in `String[] args`

✅ Created by the JVM

✅ All arguments are Strings

✅ Use `args.length` to count arguments

✅ Parse values using `Integer.parseInt()` or `Double.parseDouble()`

---

# 💡 Bootcamp Insight

These MCQs focus on concepts that are commonly tested in campus placements and Java interviews. Rather than memorizing answers, try to explain **why** the correct option is right and **why** the others are wrong. That approach builds stronger fundamentals.

---

# Key Takeaways

- Understand how the JVM passes command line arguments.
- Remember that all arguments are Strings.
- Practice validating `args.length`.
- Know when to use Command Line Arguments versus other input methods.

---

## References

- Oracle Java Documentation
- Java Language Specification
- Java SE API Documentation