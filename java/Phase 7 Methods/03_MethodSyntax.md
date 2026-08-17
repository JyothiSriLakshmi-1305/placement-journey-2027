# Method Syntax

> **Module 20 – Methods**

---

## 1. Introduction

A Java method has a specific syntax.

Basic structure:

```java
modifier returnType methodName(parameters) {

    // method body

}
```

Example:

```java
static int add(int a, int b) {
    return a + b;
}
```

A method can be understood by breaking its syntax into smaller parts.

---

## 2. Complete Method Syntax ⭐

```java
accessModifier static returnType methodName(parameters) {

    // statements

}
```

Example:

```java
public static int add(int a, int b) {

    return a + b;

}
```

Breakdown:

```text
public
  ↓
access modifier

static
  ↓
class-level keyword

int
  ↓
return type

add
  ↓
method name

(int a, int b)
  ↓
parameters

{ }
  ↓
method body
```

Not every method must use every keyword.

---

## 3. Method Components

The main components are:

```text
1. Access Modifier
2. static / instance context
3. Return Type
4. Method Name
5. Parameter List
6. Method Body
```

---

## 4. Access Modifier

Common access modifiers are:

```text
public
private
protected
default
```

Basic idea:

```text
public
    ↓
Accessible from other classes

private
    ↓
Accessible only within the same class
```

We will study access modifiers more deeply during OOP.

---

## 5. `static`

`static` means the method belongs to the **class**, rather than requiring an object to call it.

Example:

```java
static void greet() {

    System.out.println("Hello");

}
```

A static method can be called directly from another static method such as `main()`:

```java
public static void main(String[] args) {

    greet();

}
```

We will study `static` in detail later.

---

## 6. Return Type

The return type tells Java what type of value the method returns.

Examples:

```text
int
double
float
char
boolean
String
void
```

Example:

```java
static int getNumber() {

    return 10;

}
```

Here:

```text
int
↓
return type
```

---

## 7. `void`

`void` means the method does not return a value.

Example:

```java
static void greet() {

    System.out.println("Hello");

}
```

This method performs an action but does not send a value back.

---

## 8. Method Name

The method name identifies what the method does.

Examples:

```java
calculateSum()
findMaximum()
checkPrime()
printPattern()
displayResult()
```

Use meaningful names.

Good:

```java
calculateAverage()
```

Poor:

```java
abc()
```

---

## 9. Method Naming Convention

Java methods normally use **camelCase**.

Examples:

```java
calculateSum()
findLargestNumber()
checkPalindrome()
printStudentDetails()
calculateTotalMarks()
```

Rule:

```text
First word → lowercase
Following words → first letter uppercase
```

Example:

```text
calculateTotalMarks
```

---

## 10. Parameter List

Parameters are variables declared inside the method's parentheses.

Example:

```java
static int add(int a, int b) {

    return a + b;

}
```

Here:

```text
int a
int b
```

are parameters.

They allow the method to receive input.

---

## 11. Parameters vs Arguments ⭐

### Parameter

The variable declared in the method definition.

```java
static int add(int a, int b)
```

Here:

```text
a and b → parameters
```

### Argument

The actual values passed when calling the method.

```java
add(10, 20);
```

Here:

```text
10 and 20 → arguments
```

Remember:

```text
Method Definition
      ↓
Parameters

Method Call
      ↓
Arguments
```

---

## 12. Empty Parameter List

A method does not always need parameters.

Example:

```java
static void greet() {

    System.out.println("Hello");

}
```

The parentheses are still required:

```text
()
```

---

## 13. Multiple Parameters

A method can have multiple parameters.

Example:

```java
static int add(int a, int b) {

    return a + b;

}
```

Parameters are separated using commas.

---

## 14. Method Body

The method body is the code inside `{}`.

Example:

```java
static int square(int n) {

    int result = n * n;

    return result;

}
```

The body contains the actual logic.

---

## 15. Return Statement

A method with a non-void return type normally uses `return`.

Example:

```java
static int add(int a, int b) {

    return a + b;

}
```

The expression is evaluated and returned to the caller.

---

## 16. Complete Example

```java
public class MethodSyntaxDemo {

    public static int add(int a, int b) {

        return a + b;

    }

    public static void main(String[] args) {

        int result = add(10, 20);

        System.out.println(result);

    }
}
```

Output:

```text
30
```

---

## 17. Method Execution Flow

For:

```java
int result = add(10, 20);
```

Execution:

```text
add(10, 20)
      ↓
a = 10
b = 20
      ↓
a + b
      ↓
30
      ↓
return 30
      ↓
result = 30
```

---

## 18. Four Fundamental Method Forms

### No Parameter + No Return

```java
static void greet() {

    System.out.println("Hello");

}
```

### Parameter + No Return

```java
static void greet(String name) {

    System.out.println("Hello " + name);

}
```

### No Parameter + Return

```java
static int getNumber() {

    return 100;

}
```

### Parameter + Return

```java
static int add(int a, int b) {

    return a + b;

}
```

These four forms are extremely important.

---

## 19. Method Syntax with `double`

```java
static double calculateArea(double radius) {

    return Math.PI * radius * radius;

}
```

---

## 20. Method Syntax with `boolean`

```java
static boolean isEven(int n) {

    return n % 2 == 0;

}
```

The method returns either:

```text
true
```

or:

```text
false
```

---

## 21. Method Syntax with `String`

```java
static String getName() {

    return "Java";

}
```

---

## 22. Method Syntax with Arrays

Methods can accept arrays.

Example:

```java
static int findMaximum(int[] arr) {

    int max = arr[0];

    for(int i = 1; i < arr.length; i++) {

        if(arr[i] > max) {
            max = arr[i];
        }

    }

    return max;
}
```

This becomes very important in DSA.

---

## 23. Calling a Method

After defining:

```java
static int add(int a, int b) {

    return a + b;

}
```

Call it:

```java
int result = add(10, 20);
```

Or:

```java
System.out.println(add(10, 20));
```

---

## 24. Method Definition vs Method Call

### Definition

```java
static int add(int a, int b) {

    return a + b;

}
```

This creates the method.

### Call

```java
add(10, 20);
```

This executes the method.

Remember:

```text
Definition → Create the method
Call → Execute the method
```

---

## 25. Method Syntax and `main()`

The `main()` method itself follows method syntax:

```java
public static void main(String[] args)
```

Breakdown:

```text
public
   ↓
access modifier

static
   ↓
static method

void
   ↓
return type

main
   ↓
method name

String[] args
   ↓
parameter

{ }
   ↓
method body
```

---

## 26. Why Does `main()` Use `String[] args`?

`String[] args` allows command-line arguments to be passed to the Java program.

Here:

```text
String[]
    ↓
array of String values

args
    ↓
parameter name
```

We will revisit this when learning parameters.

---

## 27. Common Syntax Errors

### Missing parentheses

Incorrect:

```java
static void greet {

}
```

Correct:

```java
static void greet() {

}
```

### Missing braces

Incorrect:

```java
static void greet()

    System.out.println("Hello");
```

Correct:

```java
static void greet() {

    System.out.println("Hello");

}
```

### Missing return value

Incorrect:

```java
static int getNumber() {

}
```

Correct:

```java
static int getNumber() {

    return 10;

}
```

### Wrong return type

Incorrect:

```java
static int getName() {

    return "Java";

}
```

Correct:

```java
static String getName() {

    return "Java";

}
```

### Wrong parameter type

Given:

```java
static int add(int a, int b) {

    return a + b;

}
```

This is invalid:

```java
add("10", "20");
```

because the method expects integers.

---

## 28. Method Syntax Cheat Table

| Component | Purpose | Example |
|---|---|---|
| Access Modifier | Controls access | `public` |
| `static` | Class-level method | `static` |
| Return Type | Value returned | `int` |
| Method Name | Identifies method | `add` |
| Parameters | Input variables | `int a, int b` |
| Body | Contains logic | `{ ... }` |
| `return` | Sends value back | `return a + b;` |

---

## 29. Universal Method Template ⭐

For a method that returns a value:

```java
accessModifier static returnType methodName(parameters) {

    // logic

    return value;

}
```

For a `void` method:

```java
accessModifier static void methodName(parameters) {

    // logic

}
```

---

## 30. Placement Perspective ⭐

When solving a coding problem, think:

```text
What is the input?
       ↓
What should the method receive?
       ↓
What is the required output?
       ↓
What should the method return?
       ↓
What logic belongs inside?
```

Example:

Problem:

> Check whether a number is prime.

Design:

```java
static boolean isPrime(int n)
```

Why?

```text
int n
 ↓
input

boolean
 ↓
required output
```

Then implement the logic.

This is how method design connects to coding interviews.

---

## 31. Practice Problems

### Problem 1

Create a method that prints:

```text
Hello Java
```

Expected structure:

```java
static void greet()
```

### Problem 2

Create a method that accepts two integers and prints their sum.

Expected idea:

```java
static void add(int a, int b)
```

### Problem 3

Create a method that accepts an integer and returns its square.

Expected idea:

```java
static int square(int n)
```

### Problem 4

Create a method that accepts an integer and returns whether it is even.

Expected idea:

```java
static boolean isEven(int n)
```

### Problem 5

Create a method that accepts an array and returns its maximum element.

Expected idea:

```java
static int findMaximum(int[] arr)
```

---

## 32. Quick Revision ⭐⭐⭐

Remember:

```text
Access Modifier
      ↓
static
      ↓
Return Type
      ↓
Method Name
      ↓
Parameters
      ↓
Method Body
```

Example:

```java
public static int add(int a, int b) {

    return a + b;

}
```

Think:

```text
public → who can access?
static → belongs to class
int → what is returned?
add → what is the method called?
(a, b) → what input does it receive?
{ } → what does it do?
```

---

## 33. Key Takeaways

- A method has a defined syntax.
- The return type specifies the type of value returned.
- `void` means no value is returned.
- Parameters allow methods to receive input.
- Arguments are actual values passed during a method call.
- The method body contains the logic.
- A non-void method needs a compatible return value.
- Meaningful method names improve readability.
- Understanding method syntax is essential before learning overloading, static methods, instance methods, and recursion.

---

## 34. Module 20 Progress

```text
✅ 01_Introduction.md
✅ 02_WhyMethods.md
✅ 03_MethodSyntax.md

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
