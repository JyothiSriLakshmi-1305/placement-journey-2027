# Java Command Line Arguments - Interview Questions

> **Module 16 – Command Line Arguments**
>
> **Placement & Interview Preparation**

---

# Beginner Level

## Q1. What are Command Line Arguments?

**Answer**

Command Line Arguments are values passed to a Java program at the time of execution. They are received in the `String[] args` parameter of the `main()` method.

---

## Q2. What is the syntax of the `main()` method?

```java
public static void main(String[] args)
```

---

## Q3. Which parameter stores Command Line Arguments?

**Answer**

```java
String[] args
```

---

## Q4. Who creates the `args` array?

**Answer**

The **JVM (Java Virtual Machine)** automatically creates the `String[] args` array before calling the `main()` method.

---

## Q5. Are Command Line Arguments always Strings?

**Answer**

Yes. Every argument passed from the command line is stored as a `String`.

Example:

```bash
java Student 25
```

Internally:

```java
args[0] = "25";
```

---

## Q6. Can we pass multiple arguments?

**Answer**

Yes.

Example:

```bash
java Student Ram 21 India
```

```
args[0] = "Ram"
args[1] = "21"
args[2] = "India"
```

---

## Q7. Can we rename `args`?

**Answer**

Yes.

```java
public static void main(String[] values)
```

or

```java
public static void main(String[] input)
```

Both are valid.

---

## Q8. Is `args` a Java keyword?

**Answer**

No.

It is just a parameter name.

---

## Q9. What happens if no arguments are supplied?

**Answer**

The JVM creates an empty array.

```java
args.length == 0
```

---

## Q10. Which exception occurs if you access `args[0]` when no arguments are passed?

**Answer**

```java
ArrayIndexOutOfBoundsException
```

---

# Intermediate Level

## Q11. Why are Command Line Arguments stored as Strings?

**Answer**

Because everything typed in the command line is treated as text by the operating system and passed to the JVM as strings.

---

## Q12. How do you convert a Command Line Argument to an integer?

```java
int n = Integer.parseInt(args[0]);
```

---

## Q13. How do you convert to a double?

```java
double d = Double.parseDouble(args[0]);
```

---

## Q14. Which exception occurs if parsing fails?

**Answer**

```java
NumberFormatException
```

---

## Q15. How do you find the number of arguments?

```java
args.length
```

---

## Q16. How do you print all Command Line Arguments?

```java
for(String s : args){
    System.out.println(s);
}
```

---

## Q17. Why should we check `args.length`?

**Answer**

To avoid accessing invalid indexes and prevent `ArrayIndexOutOfBoundsException`.

---

## Q18. What is the difference between Scanner and Command Line Arguments?

| Scanner | Command Line Arguments |
|----------|------------------------|
| Input during execution | Input before execution |
| Interactive | Non-interactive |
| Reads from keyboard | Reads from command line |

---

## Q19. Can Command Line Arguments be modified?

**Answer**

Yes.

Since `args` is a normal array, its elements can be changed within the program.

```java
args[0] = "Java";
```

This changes the array inside the running program only; it does **not** change the original command used to launch the program.

---

## Q20. Can we pass spaces as one argument?

**Answer**

Yes, by enclosing the value in quotes.

Example:

```bash
java Student "Jyothi Sri Lakshmi"
```

---

# Advanced Level

## Q21. Why is `main()` static?

**Answer**

Because the JVM must call it without creating an object of the class.

---

## Q22. Why is `main()` public?

**Answer**

So the JVM can access it from outside the class.

---

## Q23. Why is `main()` void?

**Answer**

Because the JVM does not expect any return value from the program's entry point.

---

## Q24. What is the role of the JVM in Command Line Arguments?

**Answer**

The JVM:

- Loads the class
- Creates the `args` array
- Stores the arguments
- Invokes the `main()` method

---

## Q25. What happens internally when you execute:

```bash
java Student Ram 21
```

**Answer**

1. OS starts the JVM.
2. JVM loads `Student.class`.
3. JVM creates `String[] args`.
4. Stores `"Ram"` and `"21"` in the array.
5. Calls `main(args)`.

---

## Q26. Can Command Line Arguments replace Scanner?

**Answer**

No.

They are suitable for startup configuration, while `Scanner` is designed for interactive user input during program execution.

---

## Q27. Where are Command Line Arguments commonly used?

**Answer**

- Spring Boot
- Maven
- Gradle
- Docker
- Jenkins
- Shell Scripts
- Server Configuration

---

## Q28. Can we overload the `main()` method?

**Answer**

Yes.

```java
public static void main(int a)
```

However, the JVM starts execution only from:

```java
public static void main(String[] args)
```

---

## Q29. Can we write `String args[]` instead of `String[] args`?

**Answer**

Yes.

Both are valid Java syntax.

```java
public static void main(String args[])
```

---

## Q30. Which input method is best for automation?

**Answer**

Command Line Arguments.

---

# Tricky Interview Questions

## Q31. Is `args` ever `null` when a program starts normally?

**Answer**

No. Under normal JVM execution, the JVM provides a `String` array. If no arguments are supplied, it is an **empty array**, not `null`.

---

## Q32. Can Command Line Arguments store integers directly?

**Answer**

No.

They always store Strings.

---

## Q33. Can we pass special characters?

**Answer**

Yes.

Example:

```bash
java Demo @Java #2027
```

How special characters are interpreted may depend on the operating system's shell.

---

## Q34. Which is faster: Scanner or Command Line Arguments?

**Answer**

Command Line Arguments avoid interactive input because the data is already available when the program starts. In typical applications, choose the method based on the use case rather than performance.

---

## Q35. Why are Command Line Arguments important?

**Answer**

They make programs configurable without modifying source code.

---

# Rapid Fire Questions

| Question | Answer |
|----------|--------|
| Entry point? | `main()` |
| Parameter type? | `String[]` |
| Who creates args? | JVM |
| Are arguments Strings? | Yes |
| Can args be renamed? | Yes |
| Count arguments? | `args.length` |
| First argument? | `args[0]` |
| Parse int? | `Integer.parseInt()` |
| Parse double? | `Double.parseDouble()` |
| Interactive input? | Scanner |
| Automation? | Command Line Arguments |

---

# Frequently Asked Placement Questions

⭐ Why are Command Line Arguments stored as Strings?

⭐ Difference between Scanner and Command Line Arguments.

⭐ Why is `main()` static?

⭐ Who creates the `args` array?

⭐ Explain the execution flow of a Java program.

⭐ How do you prevent `ArrayIndexOutOfBoundsException`?

⭐ How do you convert arguments to integers?

⭐ Can `args` be renamed?

⭐ Can `main()` be overloaded?

⭐ What happens when no arguments are supplied?

---

# Interview Tips

✅ Explain the JVM's role clearly.

✅ Mention that **all arguments are Strings**.

✅ Always discuss `args.length` validation.

✅ Support answers with short code examples when appropriate.

---

# Bootcamp Insight 💡

Interviewers often use Command Line Arguments to test your understanding of the **JVM startup process**, method signatures, arrays, parsing, and defensive programming. Mastering these questions strengthens your Java fundamentals far beyond this single topic.

---

# Key Takeaways

- Command Line Arguments are passed before execution.
- The JVM creates and populates the `args` array.
- Arguments are always Strings.
- Validate `args.length` before accessing elements.
- Use parsing methods to convert numeric values.
- This topic is frequently asked in Java interviews.

---

## References

- Oracle Java Documentation
- Java Language Specification
- Java SE API Documentation