# Command Line Arguments - Programs & Examples

> **Module 16 – Command Line Arguments**
>
> **Topic:** Working with Command Line Arguments

---

# Introduction

Command line arguments allow values to be passed to a Java program **before it starts executing**.

All values are received as **strings** inside the `String[] args` array.

General Syntax:

```java
public static void main(String[] args)
```

Run the program using:

```bash
java ClassName argument1 argument2 argument3
```

---

# Program 1: Print All Arguments

## Code

```java
public class PrintArguments {

    public static void main(String[] args) {

        for(String value : args){
            System.out.println(value);
        }

    }

}
```

### Run

```bash
java PrintArguments Java Placement 2027
```

### Output

```
Java
Placement
2027
```

---

# Program 2: Count Arguments

```java
public class CountArguments {

    public static void main(String[] args) {

        System.out.println("Number of Arguments = " + args.length);

    }

}
```

Run

```bash
java CountArguments A B C D
```

Output

```
Number of Arguments = 4
```

---

# Program 3: Print First Argument

```java
public class FirstArgument {

    public static void main(String[] args) {

        if(args.length > 0){
            System.out.println(args[0]);
        }else{
            System.out.println("No argument supplied.");
        }

    }

}
```

---

# Program 4: Print Last Argument

```java
public class LastArgument {

    public static void main(String[] args) {

        if(args.length > 0){
            System.out.println(args[args.length-1]);
        }else{
            System.out.println("No arguments.");
        }

    }

}
```

---

# Program 5: Add Two Numbers

```java
public class Addition {

    public static void main(String[] args) {

        if(args.length != 2){

            System.out.println("Usage: java Addition <num1> <num2>");
            return;

        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.println("Sum = " + (a+b));

    }

}
```

Run

```bash
java Addition 15 20
```

Output

```
Sum = 35
```

---

# Program 6: Calculator

```java
public class Calculator {

    public static void main(String[] args) {

        if(args.length != 3){

            System.out.println("Usage: java Calculator <num1> <operator> <num2>");
            return;

        }

        int a = Integer.parseInt(args[0]);
        String op = args[1];
        int b = Integer.parseInt(args[2]);

        switch(op){

            case "+":
                System.out.println(a+b);
                break;

            case "-":
                System.out.println(a-b);
                break;

            case "*":
                System.out.println(a*b);
                break;

            case "/":
                if(b != 0)
                    System.out.println(a/b);
                else
                    System.out.println("Cannot divide by zero.");
                break;

            default:
                System.out.println("Invalid operator.");

        }

    }

}
```

Run

```bash
java Calculator 25 + 10
```

Output

```
35
```

---

# Program 7: Largest of Three Numbers

```java
public class Largest {

    public static void main(String[] args) {

        if(args.length != 3){

            System.out.println("Enter exactly three numbers.");
            return;

        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        System.out.println(Math.max(a, Math.max(b,c)));

    }

}
```

---

# Program 8: Area of Circle

```java
public class CircleArea {

    public static void main(String[] args) {

        if(args.length != 1){

            System.out.println("Usage: java CircleArea <radius>");
            return;

        }

        double r = Double.parseDouble(args[0]);

        double area = Math.PI * r * r;

        System.out.println(area);

    }

}
```

---

# Program 9: Greeting Application

```java
public class Greeting {

    public static void main(String[] args) {

        if(args.length == 0){

            System.out.println("Welcome Guest");

        }else{

            System.out.println("Welcome " + args[0]);

        }

    }

}
```

Run

```bash
java Greeting Lakshmi
```

Output

```
Welcome Lakshmi
```

---

# Program 10: Reverse the Arguments

```java
public class ReverseArguments {

    public static void main(String[] args) {

        for(int i = args.length-1; i >= 0; i--){

            System.out.println(args[i]);

        }

    }

}
```

Run

```bash
java ReverseArguments A B C D
```

Output

```
D
C
B
A
```

---

# Common Exceptions

## 1. ArrayIndexOutOfBoundsException

Cause:

```java
System.out.println(args[0]);
```

when no arguments are passed.

Solution:

```java
if(args.length > 0)
```

---

## 2. NumberFormatException

Cause:

```bash
java Addition Ten Twenty
```

```java
Integer.parseInt("Ten");
```

Solution:

Validate input or handle exceptions.

---

# Best Practices

- Always check `args.length`.
- Convert strings using parsing methods.
- Display helpful usage messages.
- Handle invalid input gracefully.
- Keep the argument order consistent.

---

# Common Mistakes

❌ Forgetting that arguments are strings.

❌ Accessing invalid array indexes.

❌ Not validating the number of arguments.

❌ Ignoring parsing errors.

---

# Interview Questions

### Q1

How do you pass multiple command line arguments?

### Q2

How do you convert arguments to integers?

### Q3

What exception occurs when parsing invalid numbers?

### Q4

How do you check if arguments are provided?

### Q5

Why is `args.length` important?

---

# Quick Revision

| Task | Code |
|------|------|
| First argument | `args[0]` |
| Last argument | `args[args.length-1]` |
| Count arguments | `args.length` |
| Integer conversion | `Integer.parseInt()` |
| Double conversion | `Double.parseDouble()` |
| Loop through all | `for(String s : args)` |

---

# 💡 Bootcamp Insight

Command line arguments are commonly used in production software to pass configuration values, file paths, server ports, and environment settings. By practicing these examples, you're learning patterns that extend beyond simple Java programs into frameworks like Spring Boot and build tools like Maven and Gradle.

---

# Connection Map

```
Command Line Arguments
        │
        ├── Read Values
        ├── Validate Length
        ├── Parse Data
        ├── Process Logic
        └── Display Result
```

---

# Future Topic Connection

Next, we'll compare **Command Line Arguments**, **Scanner**, **BufferedReader**, and **Console** to understand when each input technique is the best choice.

---

# Key Takeaways

- Command line arguments are received as `String` values.
- Always validate `args.length` before accessing elements.
- Use parsing methods to convert numeric input.
- Handle invalid input with clear error messages.
- Command line arguments are widely used in automation and configuration.

---

## References

- Oracle Java Documentation
- Java SE API Documentation
- Java Language Specification