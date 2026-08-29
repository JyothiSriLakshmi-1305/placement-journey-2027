# Method Overloading

> **Module 20 – Methods**
>
> Method overloading allows multiple methods in the same class to have the **same method name but different parameter lists**.

---

## 1. What is Method Overloading?

**Method overloading** is a Java feature where two or more methods in the same class have:

- The same method name
- Different parameter lists

Example:

```java
static int add(int a, int b) {
    return a + b;
}

static int add(int a, int b, int c) {
    return a + b + c;
}
```

Both methods are named:

```text
add
```

But their parameters are different:

```text
add(int, int)
add(int, int, int)
```

Therefore, they are overloaded methods.

---

## 2. Professional Definition ⭐

> **Method overloading is a form of compile-time polymorphism in Java where multiple methods in the same class have the same name but different parameter lists.**

The compiler determines which overloaded method should be called based on the arguments provided.

---

## 3. Why Do We Need Method Overloading?

Suppose we want to add numbers.

Without overloading:

```java
addTwoNumbers(10, 20);
addThreeNumbers(10, 20, 30);
```

With overloading:

```java
add(10, 20);
add(10, 20, 30);
```

The same method name represents the same logical operation.

Benefits:

- Better readability
- Consistent naming
- Easier API usage
- Reusable design
- Less unnecessary method naming

---

## 4. Basic Example

```java
static int add(int a, int b) {
    return a + b;
}

static int add(int a, int b, int c) {
    return a + b + c;
}
```

Calling:

```java
System.out.println(add(10, 20));
```

Output:

```text
30
```

Calling:

```java
System.out.println(add(10, 20, 30));
```

Output:

```text
60
```

Java chooses the appropriate method based on the arguments.

---

## 5. Ways to Overload a Method ⭐⭐⭐

A method can be overloaded by changing:

### 1. Number of parameters

```java
add(int a, int b)
```

and:

```java
add(int a, int b, int c)
```

### 2. Type of parameters

```java
add(int a, int b)
```

and:

```java
add(double a, double b)
```

### 3. Order of parameter types

```java
display(int number, String name)
```

and:

```java
display(String name, int number)
```

---

## 6. Overloading by Number of Parameters

Example:

```java
static int multiply(int a, int b) {
    return a * b;
}

static int multiply(int a, int b, int c) {
    return a * b * c;
}
```

Calls:

```java
multiply(2, 3);
multiply(2, 3, 4);
```

Both are valid because the number of parameters is different.

---

## 7. Overloading by Parameter Type

Example:

```java
static int add(int a, int b) {
    return a + b;
}

static double add(double a, double b) {
    return a + b;
}
```

Call:

```java
add(10, 20);
```

selects:

```java
add(int, int)
```

Call:

```java
add(10.5, 20.5);
```

selects:

```java
add(double, double)
```

---

## 8. Overloading by Parameter Order

Example:

```java
static void display(int number, String name) {
    System.out.println(number + " " + name);
}

static void display(String name, int number) {
    System.out.println(name + " " + number);
}
```

The parameter lists are:

```text
(int, String)
(String, int)
```

Therefore, they are different signatures.

---

## 9. What Does NOT Create Overloading? ⭐⭐⭐

Changing only the return type does **not** create method overloading.

Incorrect:

```java
static int add(int a, int b) {
    return a + b;
}

static double add(int a, int b) {
    return a + b;
}
```

Both methods have:

```text
add(int, int)
```

Java cannot distinguish them only by return type.

---

## 10. Return Type Alone Cannot Overload

Incorrect:

```java
int calculate(int x) {
    return x;
}

double calculate(int x) {
    return x;
}
```

This is a compilation error.

Remember:

```text
Method Name + Parameter List
            ↓
Used to distinguish overloaded methods
```

The return type alone is not enough.

---

## 11. Parameter Names Do Not Create Overloading

Incorrect:

```java
static void show(int x) {
}

static void show(int y) {
}
```

This is not overloading.

Why?

Both have the same parameter type:

```text
show(int)
```

Parameter names:

```text
x
y
```

do not matter.

---

## 12. Access Modifier Does Not Create Overloading

Incorrect:

```java
public static void show(int x) {
}

private static void show(int x) {
}
```

Changing only the access modifier does not create an overloaded method.

---

## 13. `static` Does Not Create Overloading

Changing only `static` is not enough.

Incorrect:

```java
static void show(int x) {
}

void show(int x) {
}
```

Both have:

```text
show(int)
```

Therefore, they cannot coexist as overloaded methods just because one is static.

---

## 14. Method Signature ⭐⭐⭐

For overloading, the important parts are:

```text
Method Name
     +
Parameter Types
```

Example:

```text
add(int, int)
add(double, double)
add(int, int, int)
```

These are different method signatures.

Parameter names are not part of the method signature used for overloading.

---

## 15. Compile-Time Polymorphism ⭐⭐⭐

Method overloading is called **compile-time polymorphism**.

Why?

Because the compiler determines which overloaded method is applicable when compiling the program.

Example:

```java
static void print(int x) {
    System.out.println("int");
}

static void print(double x) {
    System.out.println("double");
}
```

Call:

```java
print(10);
```

The compiler selects:

```java
print(int)
```

Call:

```java
print(10.5);
```

The compiler selects:

```java
print(double)
```

---

## 16. Exact Match Has Priority

Example:

```java
static void test(int x) {
    System.out.println("int");
}

static void test(double x) {
    System.out.println("double");
}
```

Call:

```java
test(10);
```

Output:

```text
int
```

Because `10` is an `int`, the exact match is preferred.

---

## 17. Widening with Overloading

Java may use primitive widening when selecting an overloaded method.

Example:

```java
static void test(long x) {
    System.out.println("long");
}

static void test(double x) {
    System.out.println("double");
}
```

Call:

```java
test(10);
```

`10` is an `int`.

Java can widen:

```text
int → long
```

Therefore:

```text
long
```

is selected.

---

## 18. Primitive Widening

Common widening conversions:

```text
byte
 ↓
short
 ↓
int
 ↓
long
 ↓
float
 ↓
double
```

Also:

```text
char
 ↓
int
 ↓
long
 ↓
float
 ↓
double
```

Widening conversions can participate in overload resolution.

---

## 19. Narrowing Is Not Automatically Used

Java does not normally perform narrowing just to select an overloaded method.

Example:

```java
static void test(byte x) {
}

static void test(short x) {
}
```

Calling:

```java
test(10);
```

The literal `10` is an `int`.

Java does not automatically narrow it:

```text
int → byte
```

or:

```text
int → short
```

just to find an overload.

Therefore, the call fails to compile.

---

## 20. String and Primitive Overloading

Example:

```java
static void print(String value) {
    System.out.println("String: " + value);
}

static void print(int value) {
    System.out.println("Integer: " + value);
}
```

Calls:

```java
print("Java");
print(100);
```

Output:

```text
String: Java
Integer: 100
```

---

## 21. Different Parameter Counts

We can have multiple overloads with different numbers of parameters.

```java
static void show() {
    System.out.println("No arguments");
}

static void show(int x) {
    System.out.println("One argument");
}

static void show(int x, int y) {
    System.out.println("Two arguments");
}
```

Calls:

```java
show();
show(10);
show(10, 20);
```

Output:

```text
No arguments
One argument
Two arguments
```

---

## 22. Constructors Can Also Be Overloaded

Constructors can be overloaded.

Example:

```java
class Student {

    String name;
    int age;

    Student() {
        name = "Unknown";
        age = 0;
    }

    Student(String name) {
        this.name = name;
        age = 0;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

This is called **constructor overloading**.

---

## 23. Overloading with `null` ⭐

`null` can be passed to reference-type parameters.

Example:

```java
static void test(String value) {
    System.out.println("String");
}

static void test(Integer value) {
    System.out.println("Integer");
}
```

Call:

```java
test(null);
```

This is ambiguous.

Why?

Both:

```text
String
Integer
```

are reference types that can accept `null`.

Neither overload is more specific than the other in this situation.

Therefore, Java cannot choose one.

---

## 24. Varargs and Overloading

Varargs can participate in overload resolution.

Example:

```java
static void show(int x) {
    System.out.println("int");
}

static void show(int... x) {
    System.out.println("varargs");
}
```

Call:

```java
show(10);
```

The fixed parameter method:

```java
show(int)
```

is preferred over the varargs method.

---

## 25. `int` and `Integer` Overloading

Example:

```java
static void test(int x) {
    System.out.println("primitive");
}

static void test(Integer x) {
    System.out.println("wrapper");
}
```

Call:

```java
test(10);
```

The `int` overload is preferred because `10` is already an `int`.

---

## 26. Autoboxing and Overloading

Java can convert:

```text
int → Integer
```

This is called **autoboxing**.

Example:

```java
static void test(Integer x) {
    System.out.println("Integer");
}

test(10);
```

Java can convert:

```text
10
 ↓
Integer
```

But an exact primitive overload would generally be preferred if available.

---

## 27. Different Return Types with Different Parameters

This is valid:

```java
static int calculate(int a, int b) {
    return a + b;
}

static double calculate(double a, double b) {
    return a + b;
}
```

Why is this valid?

Because the parameter lists are different:

```text
calculate(int, int)
calculate(double, double)
```

The different return types are not what makes the overloading valid.

---

## 28. Static Methods Can Be Overloaded

Example:

```java
static void print(int x) {
    System.out.println(x);
}

static void print(String x) {
    System.out.println(x);
}
```

Calls:

```java
print(10);
print("Java");
```

Both are valid.

---

## 29. Instance Methods Can Be Overloaded

Example:

```java
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
```

Usage:

```java
Calculator calc = new Calculator();

calc.add(10, 20);
calc.add(10, 20, 30);
```

---

## 30. Ambiguous Overloading ⭐⭐⭐

Sometimes the compiler cannot determine the best overload.

Example:

```java
static void test(int x, double y) {
}

static void test(double x, int y) {
}
```

Call:

```java
test(10, 10);
```

Both methods can potentially be used through widening conversions.

Java cannot select a unique best match.

Therefore, the call is ambiguous and produces a compilation error.

---

## 31. Avoid Ambiguous Overloads

Overloading should make code easier to use.

Avoid overloads that create confusing calls.

Example:

```java
test(int, double)
test(double, int)
```

A call such as:

```java
test(10, 10);
```

can become ambiguous.

Good API design keeps overloaded methods clear and predictable.

---

## 32. Method Overloading vs Method Overriding ⭐⭐⭐

These concepts are different.

### Method Overloading

```text
Same method name
Different parameter list
Usually same class
Compile-time polymorphism
```

### Method Overriding

```text
Parent-child relationship
Same method signature
Subclass provides a new implementation
Runtime polymorphism
```

Example of overloading:

```java
void print(int x) {
}

void print(String x) {
}
```

Example of overriding:

```java
class Animal {

    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog sound");
    }
}
```

---

## 33. Overloading vs Overriding Table

| Feature | Overloading | Overriding |
|---|---|---|
| Method name | Same | Same |
| Parameters | Must differ | Must match |
| Main location | Same class commonly | Parent-child classes |
| Polymorphism | Compile-time | Runtime |
| Main purpose | Multiple input forms | Specialized behavior |
| Return type | May differ if parameters differ | Must be compatible |
| Static methods | Can be overloaded | Static methods are hidden, not overridden |

---

## 34. Professional Use of Overloading ⭐

Use method overloading when the methods perform the **same conceptual operation** but accept different forms of input.

Good example:

```java
calculateArea(int side)

calculateArea(int length, int width)

calculateArea(double radius)
```

All methods represent:

```text
calculateArea
```

The inputs are different.

---

## 35. Poor Use of Overloading

Avoid using the same method name for unrelated operations.

Poor design:

```java
process(int age)

process(String databaseUrl)
```

These operations have unrelated meanings.

Better:

```java
validateAge(int age)

connect(String databaseUrl)
```

Good method names should communicate intent.

---

## 36. DSA Connection ⭐

Method overloading is not itself an algorithm, but it can make utility code cleaner.

Example:

```java
static int max(int a, int b) {
    return a > b ? a : b;
}

static int max(int a, int b, int c) {
    return max(max(a, b), c);
}
```

Now we can write:

```java
max(10, 20);
```

or:

```java
max(10, 20, 30);
```

The same logical operation uses one meaningful name.

---

## 37. Example: Calculator

```java
class Calculator {

    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        System.out.println(add(10, 20));

        System.out.println(add(10.5, 20.5));

        System.out.println(add(10, 20, 30));
    }
}
```

Output:

```text
30
31.0
60
```

---

## 38. Example: Area Calculator

```java
static int area(int side) {
    return side * side;
}

static int area(int length, int width) {
    return length * width;
}

static double area(double radius) {
    return Math.PI * radius * radius;
}
```

Usage:

```java
System.out.println(area(5));

System.out.println(area(10, 20));

System.out.println(area(5.0));
```

The same method name represents the same concept with different inputs.

---

## 39. Common Mistakes ⭐

### Mistake 1 — Overloading only by return type

Incorrect:

```java
int add(int a, int b) {
    return a + b;
}

double add(int a, int b) {
    return a + b;
}
```

Return type alone cannot create overloading.

---

### Mistake 2 — Changing only parameter names

Incorrect:

```java
void show(int x) {
}

void show(int y) {
}
```

Both are:

```text
show(int)
```

---

### Mistake 3 — Changing only access modifier

Incorrect:

```java
public void show(int x) {
}

private void show(int x) {
}
```

Access modifier alone cannot create overloading.

---

### Mistake 4 — Confusing overloading with overriding

Remember:

```text
Overloading
→ Different parameters
→ Compile time

Overriding
→ Same signature in subclass
→ Runtime
```

---

### Mistake 5 — Creating ambiguous overloads

Example:

```java
test(int, double)
test(double, int)
```

Call:

```java
test(10, 10);
```

This can be ambiguous.

---

## 40. Interview Questions ⭐⭐⭐

### Q1. What is method overloading?

Method overloading is defining multiple methods with the same name but different parameter lists.

### Q2. Is method overloading compile-time or runtime polymorphism?

Compile-time polymorphism.

### Q3. Can methods be overloaded by changing only the return type?

No.

### Q4. Can methods be overloaded by changing the number of parameters?

Yes.

### Q5. Can methods be overloaded by changing parameter types?

Yes.

### Q6. Can methods be overloaded by changing parameter order?

Yes, if the resulting parameter type sequence is different.

### Q7. Do parameter names matter for overloading?

No.

### Q8. Can static methods be overloaded?

Yes.

### Q9. Can constructors be overloaded?

Yes.

### Q10. Can overloaded methods have different return types?

Yes, if their parameter lists are different. The return type itself does not create the overload.

### Q11. Can a method be overloaded by changing only `static`?

No.

### Q12. Can a method be overloaded by changing only access modifier?

No.

### Q13. What happens if an overloaded call is ambiguous?

The compiler reports a compile-time error.

### Q14. What is the main difference between overloading and overriding?

Overloading uses different parameter lists and is resolved at compile time.

Overriding uses the same method signature in a subclass and participates in runtime polymorphism.

---

## 41. Placement Connection ⭐

For interviews, remember:

> **Same method name + different parameter list = Method Overloading.**

The parameter list can differ by:

```text
1. Number
2. Type
3. Order
```

But not by:

```text
1. Return type alone
2. Parameter names
3. Access modifier alone
4. static/non-static alone
```

---

## 42. Memory Trick 🧠

Remember:

> **"Same Name, Different Inputs."**

Example:

```java
add(10, 20);

add(10, 20, 30);

add(10.5, 20.5);
```

Same logical operation:

```text
add
```

Different input forms.

---

## 43. Practice Problems

### Beginner

#### Problem 1

Create overloaded methods:

```java
add(int, int)

add(int, int, int)
```

Return the sum.

#### Problem 2

Create:

```java
multiply(int, int)

multiply(int, int, int)
```

Return the product.

#### Problem 3

Create overloaded `print()` methods for:

```text
int
double
String
```

---

### Intermediate

#### Problem 4

Create overloaded methods:

```java
area(int side)

area(int length, int width)

area(double radius)
```

Return the appropriate area.

#### Problem 5

Create:

```java
max(int a, int b)

max(int a, int b, int c)
```

Return the maximum value.

#### Problem 6

Create overloaded methods for calculating average:

```java
average(int a, int b)

average(int a, int b, int c)
```

---

### Placement Practice ⭐

#### Problem 7

Create overloaded methods:

```java
calculate(int a, int b)

calculate(double a, double b)

calculate(int a, int b, int c)
```

Test which overload is selected for different calls.

#### Problem 8

Create overloaded methods:

```java
isPositive(int n)

isPositive(double n)
```

Return a boolean.

#### Problem 9

Create overloaded `display()` methods for:

```text
int
String
int[]
```

#### Problem 10

Create a `Calculator` class containing overloaded methods for:

```text
add()
subtract()
multiply()
divide()
```

Support multiple parameter forms where appropriate.

---

## 44. Quick Revision ⭐⭐⭐

```text
Method Overloading
        ↓
Same Method Name
        +
Different Parameter List
        ↓
Compile-Time Polymorphism
```

### Valid

```java
add(int, int)

add(int, int, int)

add(double, double)

add(int, double)
```

### Invalid

```java
add(int, int)

add(int, int)
```

Also invalid:

```java
int add(int, int)

double add(int, int)
```

because return type alone cannot overload a method.

---

## 45. Key Takeaways

- Method overloading means using the same method name with different parameter lists.
- It is a form of compile-time polymorphism.
- Overloading can differ by number of parameters.
- Overloading can differ by parameter types.
- Overloading can differ by parameter order.
- Return type alone cannot create overloading.
- Parameter names do not matter.
- Access modifiers alone do not create overloading.
- `static` vs non-static alone does not create overloading.
- Constructors can also be overloaded.
- Static methods can be overloaded.
- Instance methods can be overloaded.
- The compiler resolves overloaded calls at compile time.
- Exact matches are generally preferred over conversions.
- Widening conversions can participate in overload resolution.
- Some overload combinations can become ambiguous.
- Good overloading keeps related operations under one meaningful method name.
- Do not confuse overloading with overriding.
- Method overloading is useful for readable and flexible APIs.

---

## 46. Module 20 Progress

```text
✅ 01_Introduction.md
✅ 02_WhyMethods.md
✅ 03_MethodSyntax.md
✅ 04_MethodDeclarationAndCalling.md
✅ 05_MethodParameters.md
✅ 06_ReturnValues.md
✅ 07_VoidMethods.md
✅ 08_MethodOverloading.md

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
