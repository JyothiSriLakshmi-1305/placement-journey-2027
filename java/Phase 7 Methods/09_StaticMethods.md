# Static Methods

> **Module 20 – Methods**
>
> A `static` method belongs to the **class itself**, rather than to a particular object.

---

## 1. What is a Static Method?

A **static method** is a method declared using the `static` keyword.

It belongs to the class rather than to individual objects.

Example:

```java
class Demo {

    static void greet() {
        System.out.println("Hello Java");
    }

    public static void main(String[] args) {
        Demo.greet();
    }
}
```

Output:

```text
Hello Java
```

No `Demo` object is required to call `greet()`.

---

## 2. Professional Definition ⭐

> **A static method is a class-level method that belongs to the class rather than to individual objects and can be invoked without creating an instance of that class.**

Static methods are commonly used for:

- Utility operations
- Helper methods
- Calculations
- Class-level behavior
- Static factory methods
- The Java program entry point

---

## 3. Basic Syntax

```java
static returnType methodName(parameters) {

    // method body

}
```

Example:

```java
static int add(int a, int b) {
    return a + b;
}
```

Here:

```text
static
  ↓
class-level method

int
  ↓
return type

add
  ↓
method name
```

---

## 4. Calling a Static Method

The preferred way to call a static method is through the class name.

```java
ClassName.methodName();
```

Example:

```java
class Calculator {

    static int add(int a, int b) {
        return a + b;
    }
}
```

Call:

```java
int result = Calculator.add(10, 20);

System.out.println(result);
```

Output:

```text
30
```

---

## 5. Calling a Static Method from the Same Class

When calling a static method from another static method in the same class, the class name is optional.

Example:

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

This is equivalent to:

```java
Demo.greet();
```

---

## 6. Static Method Does Not Require an Object ⭐

Consider:

```java
class Calculator {

    static int add(int a, int b) {
        return a + b;
    }
}
```

We can directly write:

```java
Calculator.add(10, 20);
```

We do not need:

```java
Calculator calculator = new Calculator();
```

because `add()` belongs to the class.

---

## 7. Static Method vs Instance Method ⭐⭐⭐

### Static Method

```java
static void display() {
}
```

Belongs to:

```text
Class
```

Called using:

```java
ClassName.display();
```

### Instance Method

```java
void display() {
}
```

Belongs to:

```text
Object
```

Called using:

```java
object.display();
```

---

## 8. Comparison

| Feature | Static Method | Instance Method |
|---|---|---|
| Belongs to | Class | Object |
| Object required | No | Yes |
| Called using | Class name | Object reference |
| Direct access to static members | Yes | Yes |
| Direct access to instance members | No | Yes |
| Can use `this` | No | Yes |
| Can be overloaded | Yes | Yes |
| Can be overridden | No | Yes |

---

## 9. Static Methods and Static Variables

A static method can directly access static variables.

Example:

```java
class Counter {

    static int count = 0;

    static void increment() {
        count++;
    }
}
```

Call:

```java
Counter.increment();
Counter.increment();

System.out.println(Counter.count);
```

Output:

```text
2
```

Both `count` and `increment()` are class-level members.

---

## 10. Static Method and Instance Variable ⭐

A static method cannot directly access an instance variable.

Incorrect:

```java
class Student {

    String name;

    static void display() {
        System.out.println(name);
    }
}
```

This causes a compilation error.

Why?

```text
name
 ↓
instance variable
 ↓
belongs to an object
```

while:

```text
display()
 ↓
static method
 ↓
belongs to class
```

A static method does not have a particular object context.

---

## 11. Why Can't a Static Method Directly Access Instance Data?

Suppose:

```java
class Student {

    String name;

    static void display() {
        System.out.println(name);
    }
}
```

Now imagine:

```java
Student s1 = new Student();
Student s2 = new Student();

s1.name = "Joe";
s2.name = "Alex";
```

If we call:

```java
Student.display();
```

Which name should it access?

```text
Joe?
Alex?
```

There is no particular object.

Therefore, a static method cannot directly access instance data.

---

## 12. Accessing Instance Data Through an Object

A static method can access instance data if it has an object reference.

Example:

```java
class Student {

    String name;

    static void display(Student student) {
        System.out.println(student.name);
    }
}
```

Call:

```java
Student s = new Student();

s.name = "Joe";

Student.display(s);
```

Output:

```text
Joe
```

The object reference tells the static method which object's data to use.

---

## 13. Static Method Can Have Parameters

`static` does not mean "no parameters."

Example:

```java
static int multiply(int a, int b) {
    return a * b;
}
```

Call:

```java
int result = Calculator.multiply(5, 4);
```

Output:

```text
20
```

Static methods can accept any valid parameters.

---

## 14. Static Method Can Return Values

Example:

```java
static int square(int n) {
    return n * n;
}
```

Call:

```java
int result = square(5);
```

Result:

```text
25
```

`static` and `return` are separate concepts.

---

## 15. Static Method Can Be `void`

Example:

```java
static void greet() {
    System.out.println("Hello");
}
```

A static method can have different return types:

```text
void
int
double
boolean
String
array
object
```

---

## 16. Static Method Can Be Overloaded

Static methods can be overloaded.

Example:

```java
static int add(int a, int b) {
    return a + b;
}

static int add(int a, int b, int c) {
    return a + b + c;
}
```

Calls:

```java
add(10, 20);

add(10, 20, 30);
```

This is valid method overloading.

---

## 17. Static Methods and `main()` ⭐

The Java entry point is commonly:

```java
public static void main(String[] args)
```

Why is `main()` static?

The JVM needs to invoke the entry-point method without first creating an object of the class.

Conceptually:

```text
JVM
 ↓
main()
 ↓
program starts
```

This is one of the most important real-world uses of a static method.

---

## 18. Static Method Calling Another Static Method

A static method can directly call another static method.

Example:

```java
class Calculator {

    static int square(int n) {
        return n * n;
    }

    static void displaySquare(int n) {
        System.out.println(square(n));
    }
}
```

Call:

```java
Calculator.displaySquare(5);
```

Output:

```text
25
```

---

## 19. Static Method Calling an Instance Method ⭐

A static method cannot directly call an instance method.

Incorrect:

```java
class Demo {

    void display() {
        System.out.println("Display");
    }

    static void test() {
        display();
    }
}
```

Why?

```text
test()
 ↓
static
 ↓
no particular object

display()
 ↓
instance method
 ↓
requires object
```

---

## 20. Correct Way to Call an Instance Method

Use an object reference.

```java
class Demo {

    void display() {
        System.out.println("Display");
    }

    static void test() {

        Demo obj = new Demo();

        obj.display();
    }
}
```

Now the static method has an object through which it can call the instance method.

---

## 21. Static Method and `this` ⭐⭐⭐

A static method cannot use `this`.

Incorrect:

```java
class Student {

    String name;

    static void display() {
        System.out.println(this.name);
    }
}
```

Why?

`this` refers to the current object.

A static method does not belong to a particular object.

Therefore:

```text
static method
 ↓
no current object
 ↓
no this
```

---

## 22. Static Method and `super`

A static method cannot use `super`.

`super` refers to the superclass portion of the current object.

Since a static method has no current object context, `super` cannot be used there.

---

## 23. Static Method and Instance Fields

Incorrect:

```java
class Employee {

    int salary;

    static void showSalary() {
        System.out.println(salary);
    }
}
```

Correct:

```java
class Employee {

    int salary;

    static void showSalary(Employee employee) {
        System.out.println(employee.salary);
    }
}
```

The object reference supplies the required instance context.

---

## 24. Static Members Are Class-Level

Consider:

```java
class Counter {

    static int count = 0;

    static void increment() {
        count++;
    }
}
```

There is class-level state:

```text
Counter
   ↓
count
increment()
```

Calling:

```java
Counter.increment();
```

updates the class-level `count`.

---

## 25. Utility Classes ⭐

Static methods are commonly used in utility classes.

Example:

```java
class MathUtils {

    static int square(int n) {
        return n * n;
    }

    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    static int max(int a, int b) {
        return a > b ? a : b;
    }
}
```

Usage:

```java
System.out.println(MathUtils.square(5));

System.out.println(MathUtils.isEven(10));

System.out.println(MathUtils.max(10, 20));
```

No object is required.

---

## 26. Real Java Example: `Math`

Java's `Math` class provides many static utility methods.

Examples:

```java
Math.max(10, 20);

Math.min(10, 20);

Math.abs(-50);

Math.sqrt(25);

Math.pow(2, 3);
```

They are called using:

```text
Math.methodName()
```

because they are class-level utility operations.

---

## 27. Static Methods in `Arrays`

The `Arrays` utility class provides static methods.

Example:

```java
import java.util.Arrays;

int[] arr = {5, 2, 8, 1};

Arrays.sort(arr);
```

We call:

```java
Arrays.sort(arr);
```

rather than creating an `Arrays` object.

---

## 28. Static Methods in `Collections`

The `Collections` utility class also provides static methods.

Example:

```java
Collections.sort(list);
```

The operation is utility-like and does not require a `Collections` object.

---

## 29. Static Factory Methods ⭐

A **static factory method** is a static method that creates or provides objects.

Example:

```java
class Student {

    String name;

    private Student(String name) {
        this.name = name;
    }

    static Student create(String name) {
        return new Student(name);
    }
}
```

Usage:

```java
Student student = Student.create("Joe");
```

The object is created through a static method.

Java APIs also commonly provide factory-style methods such as:

```java
List.of(...)
Set.of(...)
Map.of(...)
```

---

## 30. Static Import

Java allows static members to be imported.

Example:

```java
import static java.lang.Math.max;
```

Then we can write:

```java
max(10, 20);
```

instead of:

```java
Math.max(10, 20);
```

Static imports should be used carefully because excessive use can reduce clarity.

---

## 31. Static Method Hiding ⭐⭐⭐

Static methods are not overridden like instance methods.

If a subclass declares a static method with the same signature, it **hides** the superclass method.

Example:

```java
class Parent {

    static void display() {
        System.out.println("Parent");
    }
}

class Child extends Parent {

    static void display() {
        System.out.println("Child");
    }
}
```

This is called **static method hiding**.

---

## 32. Static Method Hiding Example

```java
class Parent {

    static void show() {
        System.out.println("Parent");
    }
}

class Child extends Parent {

    static void show() {
        System.out.println("Child");
    }
}
```

Calls:

```java
Parent.show();
```

Output:

```text
Parent
```

and:

```java
Child.show();
```

Output:

```text
Child
```

Static methods are resolved based on the class/reference context, not through runtime overriding.

---

## 33. Static Methods and Runtime Polymorphism ⭐⭐⭐

Static methods do not participate in runtime method overriding.

Instance method:

```java
Animal animal = new Dog();

animal.sound();
```

can use runtime polymorphism when `sound()` is overridden.

Static methods are not dynamically dispatched in the same way.

Remember:

```text
Static method
→ class-level
→ method hiding
→ no runtime overriding
```

---

## 34. Static Methods and Inheritance

Static methods can be inherited depending on access rules.

Example:

```java
class Parent {

    static void show() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
}
```

We can write:

```java
Child.show();
```

But the method remains a static class-level member.

---

## 35. Static Method and `final`

A static method can be declared `final`.

Example:

```java
static final void display() {
    System.out.println("Hello");
}
```

A `final` static method cannot be hidden by a subclass with the same signature.

---

## 36. Static Method and Access Modifiers

Static methods can use access modifiers such as:

```java
public
protected
private
```

Examples:

```java
public static void show() {
}
```

```java
private static void calculate() {
}
```

`static` and access control are separate concepts.

---

## 37. Static Method and Local Variables

Variables declared inside a static method are local variables.

Example:

```java
static void test() {

    int x = 10;

    System.out.println(x);
}
```

`x` is a local variable.

It does not become static just because it is inside a static method.

---

## 38. Static Does Not Mean Everything Is Static

Example:

```java
class Demo {

    int instanceValue = 10;

    static int staticValue = 20;

    static void display() {

        int localValue = 30;
    }
}
```

Three different concepts:

```text
instanceValue
→ instance variable

staticValue
→ static variable

localValue
→ local variable
```

---

## 39. Static Method and Parameters

Parameters are local to each method invocation.

Example:

```java
static int add(int a, int b) {
    return a + b;
}
```

`a` and `b` are parameters.

They are not static variables.

---

## 40. Static Methods and Memory ⭐

At a conceptual level, static members are associated with the class rather than individual objects.

```text
Class
 ↓
Static members
```

Objects have their own instance state:

```text
Object 1 → instance state
Object 2 → instance state
Object 3 → instance state
```

Static state is shared at class level.

> **Interview note:** Avoid saying simply "static methods are stored in the Method Area." JVM memory management is more nuanced, especially across Java versions and implementations.

---

## 41. Static Does Not Mean Thread-Safe ⭐

Consider:

```java
static int count = 0;

static void increment() {
    count++;
}
```

If multiple threads call `increment()` at the same time, the shared mutable state may cause race conditions.

Therefore:

```text
static ≠ thread-safe
```

Synchronization or other concurrency mechanisms may be required.

---

## 42. Static Does Not Mean Constant

This is a common misconception.

```java
static int count = 10;
```

The value can change:

```java
count = 20;
```

`static` means:

```text
class-level
```

It does not mean:

```text
constant
```

For a constant, commonly use:

```java
static final int MAX_SIZE = 100;
```

---

## 43. Static Method Can Be Stateless

Example:

```java
static int square(int n) {
    return n * n;
}
```

This method does not depend on shared or instance state.

It is effectively a utility-style operation.

---

## 44. Static Method Can Use Shared Static State

Example:

```java
static int count = 0;

static void increment() {
    count++;
}
```

This method uses class-level state.

Therefore:

```text
static ≠ automatically stateless
```

---

## 45. When Should We Use Static? ⭐

A static method is appropriate when:

- The operation does not depend on instance-specific data.
- The behavior naturally belongs to the class.
- It is a utility/helper operation.
- Creating an object would provide no meaningful benefit.
- The operation works only with its parameters and/or class-level state.

Example:

```java
static boolean isEven(int n) {
    return n % 2 == 0;
}
```

---

## 46. When Should We NOT Use Static?

Do not make every method static.

If a method depends on object-specific state, an instance method is usually more appropriate.

Example:

```java
class BankAccount {

    double balance;

    void deposit(double amount) {
        balance += amount;
    }
}
```

`deposit()` operates on a particular account's balance.

Therefore, it should normally be an instance method.

---

## 47. Static vs Instance — Real Example ⭐

### Static

```java
class Calculator {

    static int add(int a, int b) {
        return a + b;
    }
}
```

Usage:

```java
Calculator.add(10, 20);
```

No object-specific state is required.

### Instance

```java
class BankAccount {

    double balance;

    void deposit(double amount) {
        balance += amount;
    }
}
```

Usage:

```java
BankAccount account = new BankAccount();

account.deposit(500);
```

The method operates on a particular object.

---

## 48. DSA Connection ⭐

Static methods are useful for utility operations in DSA.

Examples:

```java
static int max(int a, int b) {
    return a > b ? a : b;
}
```

```java
static boolean isPrime(int n) {
    // logic
}
```

```java
static int gcd(int a, int b) {
    // logic
}
```

These methods do not require object-specific state.

---

## 49. Example: DSA Utility Class

```java
class NumberUtils {

    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    static int max(int a, int b) {
        return a > b ? a : b;
    }

    static int gcd(int a, int b) {

        while (b != 0) {

            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}
```

Usage:

```java
System.out.println(NumberUtils.isEven(10));

System.out.println(NumberUtils.max(10, 20));

System.out.println(NumberUtils.gcd(24, 18));
```

Output:

```text
true
20
6
```

---

## 50. Common Mistakes ⭐

### Mistake 1 — Accessing an instance variable directly

Incorrect:

```java
class Demo {

    int x = 10;

    static void show() {
        System.out.println(x);
    }
}
```

A static method cannot directly access instance variable `x`.

---

### Mistake 2 — Calling an instance method directly

Incorrect:

```java
class Demo {

    void display() {
    }

    static void test() {
        display();
    }
}
```

An object reference is required.

---

### Mistake 3 — Using `this` in a static method

Incorrect:

```java
static void show() {
    System.out.println(this);
}
```

There is no current object in a static context.

---

### Mistake 4 — Thinking static means constant

Incorrect:

```text
static = cannot change
```

Correct:

```text
static = class-level
```

---

### Mistake 5 — Making everything static

Not every method should be static.

If behavior depends on instance state, use an instance method.

---

### Mistake 6 — Thinking static means thread-safe

Incorrect:

```text
static = thread-safe
```

Shared mutable static state may require synchronization.

---

## 51. Interview Questions ⭐⭐⭐

### Q1. What is a static method?

A static method is a class-level method that belongs to the class rather than to individual objects.

### Q2. How do you call a static method?

Using:

```java
ClassName.methodName();
```

### Q3. Can a static method be called without creating an object?

Yes.

### Q4. Can a static method directly access an instance variable?

No.

An object reference is required.

### Q5. Can a static method directly access a static variable?

Yes.

### Q6. Can a static method use `this`?

No.

`this` refers to the current object, while a static method has no particular object context.

### Q7. Can a static method be overloaded?

Yes.

### Q8. Can a static method be overridden?

No. Static methods are hidden, not overridden.

### Q9. Why is `main()` static?

The JVM needs to invoke the entry point without first creating an object of the class.

### Q10. Can a static method call an instance method?

Not directly. It needs an object reference.

### Q11. Does static mean thread-safe?

No.

### Q12. Does static mean constant?

No. `final` is used to prevent reassignment.

### Q13. When should you use a static method?

When the operation does not depend on a particular object's state and is naturally class-level.

---

## 52. Placement Connection ⭐

A strong interview answer is:

> **"I would make this method static when its behavior does not depend on the state of a particular object and it is naturally associated with the class."**

Examples:

```java
static boolean isPrime(int n)
```

```java
static int gcd(int a, int b)
```

```java
static int max(int a, int b)
```

These are good utility-style methods.

---

## 53. Decision Rule 🧠

Ask:

> **Does this method need object-specific state?**

If **No**:

```text
Static method may be appropriate
```

If **Yes**:

```text
Instance method is generally appropriate
```

Example:

```java
Math.max(10, 20)
```

does not need object state.

So:

```text
static
```

is appropriate.

But:

```java
account.deposit(500)
```

needs the particular account's balance.

So:

```text
instance method
```

is appropriate.

---

## 54. Practice Problems

### Beginner

#### Problem 1

Create:

```java
static int square(int n)
```

Return the square.

#### Problem 2

Create:

```java
static boolean isEven(int n)
```

Return whether the number is even.

#### Problem 3

Create:

```java
static int max(int a, int b)
```

Return the larger number.

#### Problem 4

Create:

```java
static void printTable(int n)
```

Print the multiplication table.

#### Problem 5

Create:

```java
static int sum(int a, int b)
```

Return the sum.

---

### Intermediate

#### Problem 6

Create:

```java
static int factorial(int n)
```

Return the factorial.

#### Problem 7

Create:

```java
static boolean isPrime(int n)
```

Return whether the number is prime.

#### Problem 8

Create:

```java
static int gcd(int a, int b)
```

Return the GCD.

#### Problem 9

Create:

```java
static int findMaximum(int[] arr)
```

Return the maximum element.

#### Problem 10

Create:

```java
static void reverseArray(int[] arr)
```

Reverse the array in-place.

---

### Placement Practice ⭐

#### Problem 11

Create a utility class:

```text
NumberUtils
```

with static methods:

```text
isEven()
isOdd()
isPrime()
gcd()
lcm()
```

#### Problem 12

Create a `Calculator` class with static methods:

```text
add()
subtract()
multiply()
divide()
```

#### Problem 13

Create a static method that accepts an array and returns the second-largest element.

#### Problem 14

Create a static method that checks whether a string is a palindrome.

#### Problem 15

Create a static factory method that creates and returns a `Student` object.

---

## 55. Quick Revision ⭐⭐⭐

```text
static method
      ↓
belongs to class
      ↓
object not required
```

Static methods can directly access:

```text
static members
```

Static methods cannot directly access:

```text
instance members
```

Static methods cannot use:

```text
this
super
```

Static methods:

```text
can be overloaded
cannot be overridden
can be hidden
```

Remember:

```text
static ≠ constant
static ≠ thread-safe
static ≠ automatically stateless
```

---

## 56. Key Takeaways

- `static` makes a method a class-level method.
- A static method belongs to the class rather than a particular object.
- A static method can be called without creating an object.
- Static methods can have parameters.
- Static methods can return values.
- Static methods can be `void`.
- Static methods can directly access static members.
- Static methods cannot directly access instance members.
- Static methods cannot use `this`.
- Static methods cannot use `super`.
- Static methods can directly call other static methods.
- Static methods need an object reference to call instance methods.
- Static methods can be overloaded.
- Static methods are not overridden; they are hidden.
- `main()` is static so the JVM can invoke it without first creating an object.
- Utility classes commonly use static methods.
- Static factory methods are common in Java APIs.
- `static` does not mean constant.
- `static` does not mean thread-safe.
- Do not make every method static.
- Use static when behavior does not depend on instance-specific state.

---

## 57. Module 20 Progress

```text
✅ 01_Introduction.md
✅ 02_WhyMethods.md
✅ 03_MethodSyntax.md
✅ 04_MethodDeclarationAndCalling.md
✅ 05_MethodParameters.md
✅ 06_ReturnValues.md
✅ 07_VoidMethods.md
✅ 08_MethodOverloading.md
✅ 09_StaticMethods.md

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
