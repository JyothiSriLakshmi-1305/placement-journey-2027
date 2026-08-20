# Method Parameters

> **Module 20 – Methods**

---

## 1. Introduction

**Parameters** allow a method to receive input from the caller.

Without parameters:

```java
static void greet() {
    System.out.println("Hello");
}
```

With a parameter:

```java
static void greet(String name) {
    System.out.println("Hello " + name);
}
```

Call:

```java
greet("Joe");
```

Output:

```text
Hello Joe
```

---

## 2. What is a Parameter?

A **parameter** is a variable declared inside the parentheses of a method definition.

Example:

```java
static void greet(String name) {
    System.out.println("Hello " + name);
}
```

Here:

```text
String name
     ↓
Parameter
```

The parameter acts as an input variable for the method.

---

## 3. Why Do We Need Parameters?

Parameters make methods more reusable.

Without parameters:

```java
static void greetJoe() {
    System.out.println("Hello Joe");
}

static void greetSam() {
    System.out.println("Hello Sam");
}
```

Instead:

```java
static void greet(String name) {
    System.out.println("Hello " + name);
}
```

Now:

```java
greet("Joe");
greet("Sam");
greet("Alex");
```

One method can handle different inputs.

---

## 4. Parameter Flow ⭐

```text
Caller
  ↓
Argument
  ↓
Parameter
  ↓
Method Logic
  ↓
Result
```

Example:

```java
greet("Joe");
```

Flow:

```text
"Joe"
  ↓
name
  ↓
"Hello " + name
  ↓
Hello Joe
```

---

## 5. Parameter vs Argument ⭐⭐⭐

### Parameter

The variable declared in the method definition.

```java
static int add(int a, int b)
```

Here:

```text
a and b → Parameters
```

### Argument

The actual value passed during the method call.

```java
add(10, 20);
```

Here:

```text
10 and 20 → Arguments
```

Remember:

```text
Definition
    ↓
Parameters

Call
    ↓
Arguments
```

---

## 6. Single Parameter

```java
static void printNumber(int n) {
    System.out.println(n);
}
```

Call:

```java
printNumber(10);
```

Output:

```text
10
```

---

## 7. Multiple Parameters

```java
static int add(int a, int b) {
    return a + b;
}
```

Call:

```java
int result = add(10, 20);
```

Output:

```text
30
```

Parameters are separated by commas.

---

## 8. Parameters Must Have Data Types

Correct:

```java
static void display(int age) {
}
```

Correct:

```java
static void display(String name) {
}
```

Incorrect:

```java
static void display(age) {
}
```

Every parameter must have a data type.

---

## 9. Parameters of Different Types

```java
static void displayStudent(String name, int age, double marks) {

    System.out.println(name);
    System.out.println(age);
    System.out.println(marks);

}
```

Call:

```java
displayStudent("Joe", 21, 85.5);
```

Output:

```text
Joe
21
85.5
```

---

## 10. Parameter Order Matters

Given:

```java
static void display(String name, int age) {
    System.out.println(name);
    System.out.println(age);
}
```

Correct:

```java
display("Joe", 21);
```

Parameters and arguments correspond by position.

---

## 11. Parameter Count Must Match

Given:

```java
static int add(int a, int b) {
    return a + b;
}
```

Correct:

```java
add(10, 20);
```

Incorrect:

```java
add(10);
```

Incorrect:

```java
add(10, 20, 30);
```

The number of arguments must match the method's parameter list, unless a suitable overloaded method exists.

---

## 12. Passing Variables as Arguments

Arguments can be variables.

```java
int x = 10;
int y = 20;

int result = add(x, y);
```

Flow:

```text
x = 10
y = 20
   ↓
add(x, y)
   ↓
a = 10
b = 20
```

---

## 13. Passing Constants as Arguments

We can directly pass values:

```java
add(10, 20);
```

Here `10` and `20` are arguments.

---

## 14. Passing Expressions as Arguments

We can also pass expressions:

```java
add(10 + 5, 20 + 5);
```

Java evaluates the expressions before the method receives the values.

```text
10 + 5 → 15
20 + 5 → 25
```

So the method receives:

```text
a = 15
b = 25
```

---

## 15. Integer Parameter Example

```java
static void printSquare(int n) {
    System.out.println(n * n);
}
```

Call:

```java
printSquare(5);
```

Output:

```text
25
```

---

## 16. String Parameter Example

```java
static void greet(String name) {
    System.out.println("Hello " + name);
}
```

Call:

```java
greet("Joe");
```

Output:

```text
Hello Joe
```

---

## 17. Character Parameter Example

```java
static void printGrade(char grade) {
    System.out.println("Grade: " + grade);
}
```

Call:

```java
printGrade('A');
```

Output:

```text
Grade: A
```

---

## 18. Boolean Parameter Example

```java
static void checkStatus(boolean active) {

    if(active) {
        System.out.println("Active");
    } else {
        System.out.println("Inactive");
    }

}
```

Call:

```java
checkStatus(true);
```

Output:

```text
Active
```

---

## 19. Double Parameter Example

```java
static void displayPrice(double price) {
    System.out.println("Price: " + price);
}
```

Call:

```java
displayPrice(999.50);
```

Output:

```text
Price: 999.5
```

---

## 20. Multiple Data Types

```java
static void studentInfo(String name, int age, double marks) {

    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Marks: " + marks);

}
```

Call:

```java
studentInfo("Joe", 21, 87.5);
```

---

## 21. Array as a Parameter ⭐

Methods can accept arrays.

```java
static void printArray(int[] arr) {

    for(int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }

}
```

Call:

```java
int[] numbers = {10, 20, 30};

printArray(numbers);
```

Output:

```text
10
20
30
```

This is extremely important for DSA.

---

## 22. Finding Maximum Using an Array Parameter

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

Call:

```java
int[] numbers = {10, 50, 20, 80, 30};

int result = findMaximum(numbers);

System.out.println(result);
```

Output:

```text
80
```

---

## 23. String Array Parameter

```java
static void printNames(String[] names) {

    for(String name : names) {
        System.out.println(name);
    }

}
```

Call:

```java
String[] names = {"Joe", "Alex", "Sam"};

printNames(names);
```

---

## 24. Parameters with Return Values

```java
static int multiply(int a, int b) {
    return a * b;
}
```

Call:

```java
int result = multiply(5, 4);
```

Flow:

```text
Arguments
   ↓
5, 4
   ↓
Parameters
   ↓
a = 5
b = 4
   ↓
a * b
   ↓
20
   ↓
Return
```

---

## 25. Parameters Without Return Values

A method can accept parameters and still be `void`.

```java
static void printSum(int a, int b) {
    System.out.println(a + b);
}
```

Call:

```java
printSum(10, 20);
```

Output:

```text
30
```

---

## 26. No Parameters

A method can have no parameters.

```java
static void greet() {
    System.out.println("Hello");
}
```

Parameter count:

```text
0
```

Call:

```java
greet();
```

---

## 27. Four Fundamental Forms

| Parameters | Return | Example |
|---|---|---|
| No | No | `void greet()` |
| Yes | No | `void printSum(int a, int b)` |
| No | Yes | `int getNumber()` |
| Yes | Yes | `int add(int a, int b)` |

These four forms are fundamental for Java beginners.

---

## 28. Parameter Naming

Good:

```java
static int calculateSalary(int basicSalary, int bonus)
```

Poor:

```java
static int calculateSalary(int x, int y)
```

For simple mathematical problems, `a` and `b` are acceptable.

For real projects, descriptive names are preferred.

---

## 29. Local Scope of Parameters ⭐

Parameters exist inside the method where they are declared.

```java
static void display(int number) {
    System.out.println(number);
}
```

The parameter `number` belongs to that method's scope.

It cannot be directly accessed from another unrelated method.

We will study scope in more detail later.

---

## 30. Parameters Are Local Variables

Parameters behave like local variables inside the method.

```java
static void calculate(int x) {

    int result = x * 2;

    System.out.println(result);

}
```

Here:

```text
x
result
```

are local to the method.

---

## 31. Parameter Shadowing

Later, when we learn instance variables and objects, you may see:

```java
class Student {

    String name;

    void setName(String name) {
        this.name = name;
    }
}
```

Here the parameter `name` has the same name as the instance variable.

The keyword `this` distinguishes them.

This will be covered during OOP.

---

## 32. Type Compatibility

Arguments should be compatible with parameter types.

Example:

```java
static void display(int n) {
    System.out.println(n);
}
```

Correct:

```java
display(10);
```

Incorrect:

```java
display("10");
```

---

## 33. Widening Conversion with Parameters

Java can perform certain widening conversions.

Example:

```java
static void display(double n) {
    System.out.println(n);
}
```

We can pass an `int`:

```java
int x = 10;

display(x);
```

Conversion:

```text
int
 ↓
double
```

This is widening conversion.

---

## 34. Narrowing Conversion

Narrowing conversions generally require explicit casting.

Example:

```java
static void display(int n) {
    System.out.println(n);
}
```

A `double` cannot automatically be passed as an `int`.

We can explicitly cast:

```java
double value = 10.5;

display((int) value);
```

The fractional part is lost:

```text
10.5
 ↓
10
```

---

## 35. Parameter Passing Example

Consider:

```java
static void change(int x) {
    x = 100;
}

public static void main(String[] args) {

    int a = 10;

    change(a);

    System.out.println(a);
}
```

Output:

```text
10
```

Why?

Java uses **pass-by-value**.

The method receives a copy of the value.

We will study this in detail in:

```text
12_PassByValue.md
```

---

## 36. Parameters in DSA ⭐

Parameters are everywhere in DSA.

Examples:

```java
static int binarySearch(int[] arr, int target)
```

```java
static boolean isPalindrome(String str)
```

```java
static int findMaximum(int[] arr)
```

```java
static void reverseArray(int[] arr)
```

```java
static int sumOfDigits(int n)
```

The parameters represent the input required by the algorithm.

---

## 37. Designing Parameters for a Problem ⭐

When solving a coding problem, ask:

```text
What input does my method need?
        ↓
Choose parameters
        ↓
What output is required?
        ↓
Choose return type
```

Example:

Problem:

> Find the largest element in an array.

Input:

```text
Array
```

Output:

```text
Largest number
```

Method:

```java
static int findMaximum(int[] arr)
```

This is good method design.

---

## 38. Interview Example

Question:

> Write a method to check whether a number is prime.

Think:

```text
Input → integer
Output → true/false
```

Therefore:

```java
static boolean isPrime(int n)
```

The parameter `int n` represents the input number.

The return type `boolean` represents the answer.

---

## 39. Common Beginner Mistakes

### Mistake 1 – Forgetting the parameter type

Incorrect:

```java
static void greet(name)
```

Correct:

```java
static void greet(String name)
```

### Mistake 2 – Wrong number of arguments

Given:

```java
static int add(int a, int b)
```

Incorrect:

```java
add(10);
```

Correct:

```java
add(10, 20);
```

### Mistake 3 – Wrong argument type

Given:

```java
static void display(int n)
```

Incorrect:

```java
display("10");
```

### Mistake 4 – Confusing parameters and arguments

Remember:

```text
Definition → Parameter
Call → Argument
```

### Mistake 5 – Incorrect parameter order

Given:

```java
static void display(String name, int age)
```

Use:

```java
display("Joe", 21);
```

not:

```java
display(21, "Joe");
```

---

## 40. Practice Problems

### Beginner

1. Create:
```java
static void printNumber(int n)
```

2. Create:
```java
static void printTable(int n)
```

3. Create:
```java
static int square(int n)
```

4. Create:
```java
static int cube(int n)
```

5. Create:
```java
static boolean isEven(int n)
```

### Intermediate

6. Create:
```java
static int findMaximum(int a, int b)
```

7. Create:
```java
static int sumOfDigits(int n)
```

8. Create:
```java
static int reverseNumber(int n)
```

9. Create:
```java
static boolean isPalindrome(int n)
```

10. Create:
```java
static int findMaximum(int[] arr)
```

### Placement Practice ⭐

11. Create:
```java
static int countDigits(int n)
```

12. Create:
```java
static boolean isPrime(int n)
```

13. Create:
```java
static int gcd(int a, int b)
```

14. Create:
```java
static int lcm(int a, int b)
```

15. Create:
```java
static int secondLargest(int[] arr)
```

---

## 41. Quick Revision ⭐⭐⭐

```text
Parameter
   ↓
Input variable declared in method

Argument
   ↓
Actual value passed during method call
```

Example:

```java
static int add(int a, int b) {
    return a + b;
}
```

Here:

```text
a, b → parameters
```

Call:

```java
add(10, 20);
```

Here:

```text
10, 20 → arguments
```

Flow:

```text
Arguments
    ↓
Parameters
    ↓
Method Logic
    ↓
Return Value
```

---

## 42. Key Takeaways

- Parameters allow methods to receive input.
- Parameters are declared in the method definition.
- Arguments are actual values passed during a method call.
- A method can have zero, one, or multiple parameters.
- Parameters must have data types.
- Parameter order and count matter.
- Arrays can be passed as parameters.
- Parameters are local to the method.
- Java uses pass-by-value.
- Parameters are extremely important in DSA and coding interviews.
- Good parameter design starts by identifying the required input.

---

## 43. Module 20 Progress

```text
✅ 01_Introduction.md
✅ 02_WhyMethods.md
✅ 03_MethodSyntax.md
✅ 04_MethodDeclarationAndCalling.md
✅ 05_MethodParameters.md

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
