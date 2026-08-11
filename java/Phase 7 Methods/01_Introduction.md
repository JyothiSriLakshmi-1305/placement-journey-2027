# Introduction to Methods

> **Module 20 – Methods**

---

## 1. What is a Method?

A **method** is a named block of code designed to perform a specific task.

Instead of writing all the logic inside `main()`, we can divide our program into smaller, reusable methods.

Example:

```java
static void greet() {
    System.out.println("Hello Java!");
}
```

Calling the method:

```java
greet();
```

Output:

```text
Hello Java!
```

---

## 2. Why Do We Need Methods?

If everything is written inside `main()`, a large program becomes difficult to:

- Read
- Understand
- Debug
- Test
- Maintain
- Reuse

Methods allow us to divide a program into smaller tasks.

```text
Large Program
     ↓
Small Tasks
     ↓
Methods
```

---

## 3. Real-Life Example

Think about a calculator.

A calculator performs different operations:

```text
Addition
Subtraction
Multiplication
Division
```

We can create separate methods:

```text
add()
subtract()
multiply()
divide()
```

Each method performs one specific operation.

---

## 4. Method as a Reusable Block

Consider:

```java
static void greet() {
    System.out.println("Hello!");
}
```

We can call it multiple times:

```java
greet();
greet();
greet();
```

The code is written once but used multiple times.

This is called **code reusability**.

---

## 5. Basic Method Structure

```java
static void methodName() {

    // statements

}
```

---

## 6. Main Components of a Method

```java
static void greet() {
    System.out.println("Hello");
}
```

Breakdown:

```text
static
  ↓
keyword

void
  ↓
return type

greet
  ↓
method name

()
  ↓
parameter list

{}
  ↓
method body
```

---

## 7. Method Name

The method name identifies the task performed by the method.

Good examples:

```java
calculateSum()
findMaximum()
checkPrime()
printPattern()
```

Avoid unclear names such as:

```java
abc()
```

Use **camelCase** for Java method names.

---

## 8. Calling a Method

Defining a method does not automatically execute it.

Example:

```java
static void greet() {
    System.out.println("Hello");
}
```

We must call it:

```java
greet();
```

---

## 9. Complete Example

```java
public class MethodDemo {

    static void greet() {
        System.out.println("Hello Java!");
    }

    public static void main(String[] args) {
        greet();
    }
}
```

Output:

```text
Hello Java!
```

---

## 10. Method Execution Flow

When Java reaches:

```java
greet();
```

execution moves to the `greet()` method.

After the method finishes, execution returns to `main()`.

```text
main()
  ↓
greet()
  ↓
execute method
  ↓
return to main()
```

---

## 11. Multiple Method Calls

```java
public class MethodDemo {

    static void greet() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {

        greet();
        greet();
        greet();

    }
}
```

Output:

```text
Hello
Hello
Hello
```

---

## 12. Why `main()` Is Special

Java applications traditionally begin execution from:

```java
public static void main(String[] args)
```

The JVM uses this method as the entry point.

Inside `main()`, we can call our own methods.

Example:

```java
public static void main(String[] args) {

    greet();
    calculate();
    display();

}
```

---

## 13. Methods and Program Structure

Without methods:

```text
main()
 ├── input
 ├── calculation
 ├── validation
 ├── output
 └── more logic
```

With methods:

```text
main()
 ├── getInput()
 ├── calculate()
 ├── validate()
 └── display()
```

This improves readability and maintainability.

---

## 14. Benefits of Methods ⭐

### Reusability

Write once and call multiple times.

### Readability

Methods make code easier to understand.

### Maintainability

Changes can be made in one place.

### Debugging

Problems can be isolated to a particular method.

### Testing

Individual methods can be tested separately.

### Modularity

Large programs can be divided into smaller logical components.

---

## 15. Single Responsibility ⭐

A good method should generally perform **one clear task**.

Good:

```java
calculateSum()
checkPrime()
printStudentDetails()
```

Avoid methods that try to do everything:

```java
doEverything()
```

Think:

```text
One method
     ↓
One clear responsibility
```

---

## 16. Method Categories

We will learn four fundamental categories:

### 1. No parameters, no return value

```java
static void greet()
```

### 2. Parameters, no return value

```java
static void greet(String name)
```

### 3. No parameters, return value

```java
static int getNumber()
```

### 4. Parameters and return value

```java
static int add(int a, int b)
```

These will be studied in detail in upcoming topics.

---

## 17. Methods in DSA

Methods become extremely important when we start DSA.

Instead of putting everything inside `main()`:

```java
public static void main(String[] args) {

    // 100 lines of DSA code

}
```

we can create:

```java
static int findMaximum(int[] arr) {
    // logic
}

static boolean isPalindrome(String str) {
    // logic
}

static void sortArray(int[] arr) {
    // logic
}
```

This makes coding problems much cleaner.

---

## 18. Methods in Interviews ⭐

Interviewers often expect logic to be written as methods.

Example:

```java
static boolean isPrime(int n) {

    // prime checking logic

}
```

Then:

```java
System.out.println(isPrime(17));
```

This separates:

```text
Problem Logic
```

from:

```text
Program Execution
```

---

## 19. Methods and Spring Boot

Methods are fundamental in real Java applications.

For example, a service class may contain:

```java
createUser()
getUser()
updateUser()
deleteUser()
```

These methods perform business operations.

The progression is:

```text
Java Methods
      ↓
OOP
      ↓
Collections
      ↓
DSA
      ↓
Spring Boot
      ↓
Backend Development
```

---

## 20. Common Beginner Mistakes

### Mistake 1 – Forgetting to call the method

Defining:

```java
static void greet() {
    System.out.println("Hello");
}
```

does not execute it.

You need:

```java
greet();
```

### Mistake 2 – Wrong method name

If you define:

```java
calculateSum()
```

but call:

```java
calculate()
```

Java will produce an error.

### Mistake 3 – Forgetting parentheses

Correct:

```java
greet();
```

Incorrect:

```java
greet;
```

### Mistake 4 – Defining a method inside another method

Incorrect:

```java
public static void main(String[] args) {

    static void greet() {
        System.out.println("Hello");
    }
}
```

Methods cannot be declared inside another method.

Correct:

```java
class Demo {

    static void greet() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        greet();
    }
}
```

---

## 21. Debugging Method Problems

Check:

```text
☐ Method declared?
☐ Method name correct?
☐ Method called?
☐ Parentheses present?
☐ Return type correct?
☐ Parameters correct?
☐ Method inside class?
☐ Method accidentally nested inside another method?
```

---

## 22. Important Vocabulary

| Term | Meaning |
|---|---|
| Method | Named block of code |
| Declaration | Defining a method |
| Calling | Executing a method |
| Parameter | Variable in method definition |
| Argument | Actual value passed |
| Return type | Type of value returned |
| `void` | No return value |
| Method body | Code inside `{}` |

---

## 23. Method vs Function

In general programming terminology, you may hear:

```text
Function
```

In Java, we commonly call it a:

```text
Method
```

because it is defined inside a class.

---

## 24. Quick Revision ⭐

Basic structure:

```java
static returnType methodName(parameters) {

    // method body

}
```

Example:

```java
static void greet() {
    System.out.println("Hello");
}
```

Call:

```java
greet();
```

Remember:

```text
METHOD

Name
 +
Parameters
 +
Return Type
 +
Body
```

---

## 25. Practice Problems

### Beginner

1. Create a method that prints `"Hello Java"`.
2. Create a method that prints your name.
3. Create a method that prints numbers from 1 to 10.
4. Create a method that prints the multiplication table of 5.
5. Create a method that prints a star pattern.

### Think About

How would you convert previous pattern programs into methods?

For example:

```java
printPyramid();
printDiamond();
printButterfly();
```

---

## 26. Bootcamp Insight 💡

Methods are the beginning of **structured programming**.

Instead of thinking:

> "How do I write this entire program?"

Start thinking:

> "What tasks does this program need?"

Then create a method for each meaningful task.

```text
Large Problem
     ↓
Smaller Tasks
     ↓
Methods
     ↓
Reusable Code
```

This mindset becomes extremely important when we move into:

```text
OOP
DSA
Spring Boot
Software Projects
Unit Testing
```

---

## 27. Key Takeaways

- A method is a named block of reusable code.
- Methods improve readability and maintainability.
- A method must be called to execute.
- Methods are declared inside a class.
- `void` means the method does not return a value.
- Good methods usually have one clear responsibility.
- Methods are fundamental to DSA and real-world Java development.

---

## 28. Module 20 Progress

```text
✅ 01_Introduction.md

⏳ 02_WhyMethods.md
⏳ 03_MethodSyntax.md
⏳ 04_MethodDeclarationAndCalling.md
⏳ 05_MethodParameters.md
⏳ 06_ReturnValues.md
⏳ 07_VoidMethods.md
⏳ 08_MethodOverloading.md
⏳ 09_StaticMethods.md
⏳ 10_InstanceMethods.md
⏳ 11_MethodScope.md
⏳ 12_PassByValue.md
⏳ 13_RecursionIntroduction.md
⏳ 14_MethodsAndMemory.md
⏳ 15_AdvancedInterviewMethods.md
⏳ 16_MethodCheatSheet.md
```

---

# References

- Oracle Java Documentation
- Java Language Specification
- Effective Java – Joshua Bloch
- Head First Java
