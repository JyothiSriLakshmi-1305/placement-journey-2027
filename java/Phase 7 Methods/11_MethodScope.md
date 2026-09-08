# Method Scope

> **Module 20 – Methods**
>
> Scope determines **where a variable, parameter, or member can be accessed in a Java program**.

---

## 1. What is Scope?

**Scope** is the region of a Java program where a variable, parameter, or member can be accessed directly.

```java
void display() {

    int number = 10;

    System.out.println(number);
}
```

Here, `number` can be accessed only within its enclosing method block.

---

## 2. Professional Interview Definition ⭐

> **Scope is the portion of a program in which a declared variable, parameter, or member is accessible by its name.**

In Java, scope mainly depends on where the declaration occurs.

---

## 3. Why Scope Matters

Understanding scope helps us:

- prevent accidental access to variables
- avoid naming conflicts
- understand compilation errors
- understand variable shadowing
- write maintainable code
- control access to data
- understand recursion and method calls

---

# 4. Important Scope Categories

```text
Local Variable
Parameter
Block Variable
Instance Variable
Static/Class Variable
```

---

# 5. Local Variable

A local variable is declared inside a method, constructor, or block.

```java
void display() {

    int number = 10;

    System.out.println(number);
}
```

`number` is a local variable.

Its scope is limited to its enclosing block.

---

# 6. Local Variable Scope

```java
void display() {

    int number = 10;

    System.out.println(number);
}
```

This is valid because `number` is used inside its scope.

But:

```java
void display() {

    int number = 10;
}

void show() {

    System.out.println(number); // Error
}
```

`number` is local to `display()` and is not available in `show()`.

---

# 7. Method Parameters

A parameter is a variable declared in a method's parameter list.

```java
void add(int a, int b) {

    System.out.println(a + b);
}
```

Here:

```text
a
b
```

are parameters.

Their scope is the method body.

---

# 8. Parameter Scope

```java
void display(String name) {

    System.out.println(name);
}
```

`name` can be used inside the method.

It cannot be directly used by another method:

```java
void display(String name) {

    System.out.println(name);
}

void test() {

    System.out.println(name); // Error
}
```

---

# 9. Block Scope ⭐⭐⭐

A block is code enclosed in `{ }`.

Examples:

```java
if (condition) {

    // block
}
```

```java
for (...) {

    // block
}
```

```java
while (...) {

    // block
}
```

A local variable declared inside a block is generally accessible only within that block.

---

# 10. Example of Block Scope

```java
if (true) {

    int number = 10;

    System.out.println(number);
}
```

Valid.

But:

```java
if (true) {

    int number = 10;
}

System.out.println(number); // Error
```

`number` is outside its scope.

---

# 11. Nested Block Scope

Blocks can exist inside other blocks.

```java
void display() {

    int outer = 10;

    {
        int inner = 20;

        System.out.println(outer);
        System.out.println(inner);
    }

    System.out.println(outer);
}
```

Inside the inner block:

```text
outer → accessible
inner → accessible
```

After the inner block:

```text
outer → accessible
inner → not accessible
```

---

# 12. Scope Flows from Outer to Inner

An inner block can access accessible declarations from an enclosing scope.

```java
void display() {

    int outer = 10;

    {
        int inner = 20;

        System.out.println(outer);
        System.out.println(inner);
    }
}
```

The inner block can use both `outer` and `inner`.

The reverse is not true.

---

# 13. Outer Scope Cannot Access Inner Variables

```java
void display() {

    {
        int inner = 20;
    }

    System.out.println(inner); // Error
}
```

The outer scope cannot access a variable declared only inside the inner block.

Remember:

```text
Outer → accessible to inner
Inner → not accessible to outer
```

---

# 14. `if` Block Scope

```java
if (age >= 18) {

    String message = "Adult";

    System.out.println(message);
}
```

`message` exists only inside the `if` block.

This is invalid:

```java
if (age >= 18) {

    String message = "Adult";
}

System.out.println(message); // Error
```

---

# 15. `for` Loop Scope

```java
for (int i = 0; i < 5; i++) {

    System.out.println(i);
}
```

The variable `i` belongs to the scope of the `for` statement and its body.

This is invalid:

```java
for (int i = 0; i < 5; i++) {

    System.out.println(i);
}

System.out.println(i); // Error
```

---

# 16. Declaring a Loop Variable Outside

If you need the variable after the loop, declare it in an enclosing scope.

```java
int i;

for (i = 0; i < 3; i++) {

    System.out.println(i);
}

System.out.println(i);
```

Output after the loop:

```text
3
```

---

# 17. `while` Loop Scope

```java
while (condition) {

    int count = 10;

    System.out.println(count);
}
```

`count` belongs to the loop body block.

It cannot be accessed after that block.

---

# 18. `if-else` Scope

This is valid:

```java
if (condition) {

    int value = 10;

    System.out.println(value);
}
else {

    int value = 20;

    System.out.println(value);
}
```

The two `value` variables belong to different blocks.

---

# 19. Scope in `switch`

Case labels do not automatically create independent local scopes.

This can cause problems:

```java
switch (choice) {

    case 1:
        int value = 10;
        System.out.println(value);
        break;

    case 2:
        int value = 20; // Error
        System.out.println(value);
        break;
}
```

If separate variables with the same name are required, use explicit blocks:

```java
switch (choice) {

    case 1: {
        int value = 10;
        System.out.println(value);
        break;
    }

    case 2: {
        int value = 20;
        System.out.println(value);
        break;
    }
}
```

---

# 20. Enhanced `for` Scope

```java
int[] numbers = {10, 20, 30};

for (int number : numbers) {

    System.out.println(number);
}
```

`number` is scoped to the enhanced `for` statement and its body.

It cannot be accessed afterward.

---

# 21. Local Variable vs Instance Variable ⭐⭐⭐

```java
class Student {

    String name;

    void display() {

        int age = 22;

        System.out.println(name);
        System.out.println(age);
    }
}
```

Here:

```text
name
→ instance variable

age
→ local variable
```

---

# 22. Instance Variable

An instance variable is declared inside a class but outside methods, constructors, and blocks.

```java
class Student {

    String name;
    int age;

    void display() {

        System.out.println(name);
        System.out.println(age);
    }
}
```

`name` and `age` belong to individual objects.

---

# 23. Static Variable

A static variable is declared using `static`.

```java
class Student {

    static String college = "ABC College";
}
```

`college` is a class/static variable.

It belongs to the class rather than a particular object.

---

# 24. Scope vs Lifetime ⭐⭐⭐

Do not confuse **scope** and **lifetime**.

### Scope

Answers:

> Where can I access this variable by name?

### Lifetime

Answers:

> How long does the associated variable or object exist during execution?

They are different concepts.

---

# 25. Local Variable: Scope and Lifetime

```java
void display() {

    int number = 10;

    System.out.println(number);
}
```

Scope:

```text
inside its enclosing method/block
```

Lifetime:

```text
associated with the method invocation
```

---

# 26. Instance Variable: Scope and Lifetime

```java
class Student {

    int age;
}
```

`age` is part of each `Student` object.

Conceptually:

```text
Scope
→ member access rules

Lifetime
→ associated with the object's lifetime
```

---

# 27. Static Variable: Scope and Lifetime

```java
class Student {

    static int count;
}
```

`count` is class state.

Its lifetime is associated with the class's runtime lifecycle.

For interviews, remember:

```text
Local variable
→ local/block scope

Instance variable
→ object state

Static variable
→ class state
```

---

# 28. Variable Shadowing ⭐⭐⭐

**Shadowing** occurs when a declaration in a narrower scope uses the same name as another declaration from an enclosing scope.

Example:

```java
class Demo {

    int number = 10;

    void display() {

        int number = 20;

        System.out.println(number);
    }
}
```

Output:

```text
20
```

The local variable shadows the instance variable.

---

# 29. Resolving Shadowing with `this` ⭐⭐⭐

```java
class Demo {

    int number = 10;

    void display() {

        int number = 20;

        System.out.println(number);
        System.out.println(this.number);
    }
}
```

Output:

```text
20
10
```

Therefore:

```text
number
→ local variable

this.number
→ instance variable
```

---

# 30. Constructor Parameter Shadowing

A very common pattern:

```java
class Student {

    String name;

    Student(String name) {
        this.name = name;
    }
}
```

Here:

```text
name
→ constructor parameter

this.name
→ instance variable
```

---

# 31. Method Parameter Shadowing

```java
class Student {

    String name;

    void setName(String name) {
        this.name = name;
    }
}
```

Again:

```text
name
→ parameter

this.name
→ instance variable
```

---

# 32. Shadowing vs Overriding

Do not confuse:

```text
Shadowing
```

with:

```text
Overriding
```

### Shadowing

Deals with declarations and name resolution.

### Overriding

Deals with a subclass providing a new implementation of an inherited instance method.

Example:

```java
class Parent {

    int value = 10;
}

class Child extends Parent {

    int value = 20;
}
```

Fields are hidden/shadowed; they are not overridden like instance methods.

---

# 33. Same Local Variable Twice

This is invalid:

```java
void display() {

    int number = 10;
    int number = 20; // Error
}
```

You cannot redeclare a local variable with the same name in the same overlapping scope.

---

# 34. Same Name in Separate Blocks

This is valid:

```java
void display() {

    {
        int number = 10;
        System.out.println(number);
    }

    {
        int number = 20;
        System.out.println(number);
    }
}
```

The two declarations are in separate non-overlapping blocks.

---

# 35. Important Java Local Variable Rule ⭐⭐⭐

Do not assume that every nested block can freely reuse a local variable name.

For example:

```java
void display() {

    int number = 10;

    {
        int number = 20; // Error
    }
}
```

Java does not allow this local-variable redeclaration in an overlapping enclosing local scope.

---

# 36. Declaration Point Matters ⭐⭐⭐

This is invalid:

```java
void display() {

    System.out.println(number); // Error

    int number = 10;
}
```

A local variable cannot be used before its declaration.

Correct:

```java
void display() {

    int number = 10;

    System.out.println(number);
}
```

---

# 37. Local Variables Must Be Initialized

Incorrect:

```java
void display() {

    int number;

    System.out.println(number);
}
```

Compilation error:

```text
variable number might not have been initialized
```

Correct:

```java
void display() {

    int number = 10;

    System.out.println(number);
}
```

---

# 38. Instance Variables Get Default Values

Example:

```java
class Demo {

    int number;
    boolean active;
    String name;
}
```

Default values:

```text
number → 0
active → false
name → null
```

Local variables do not automatically receive usable default values.

---

# 39. Method Scope

A method's parameters and local variables exist in the relevant method/block scopes.

```java
int calculate(int a, int b) {

    int result = a + b;

    return result;
}
```

Here:

```text
a
b
result
```

are not directly available to unrelated methods.

---

# 40. Methods Do Not Share Local Variables

```java
void methodOne() {

    int number = 10;
}

void methodTwo() {

    System.out.println(number); // Error
}
```

Each method has its own local scope.

If two methods need to exchange data, use:

- parameters
- return values
- object state
- static/class state when appropriate

---

# 41. Passing Data Between Methods

Use parameters and return values.

```java
int calculate() {

    int number = 10;

    return number;
}

void display() {

    int value = calculate();

    System.out.println(value);
}
```

This is a clean way to transfer data between methods.

---

# 42. Scope and Recursion Preview ⭐⭐⭐

In recursion, every method invocation gets its own parameters and local variables.

```java
void countDown(int n) {

    if (n == 0) {
        return;
    }

    System.out.println(n);

    countDown(n - 1);
}
```

Each recursive call has its own `n`.

This becomes very important when studying recursion.

---

# 43. Scope and Memory

Scope is primarily a **language-level concept**.

Do not simplify it to:

```text
scope = stack memory
```

That is not an accurate definition.

For example:

```text
Scope
→ where a name can be referenced

Lifetime
→ how long the associated runtime entity exists
```

These concepts should be kept separate.

---

# 44. Scope vs Access Modifier ⭐⭐⭐

Do not say:

> "`private` defines the scope."

A better interview answer is:

> **Access modifiers control accessibility, while scope describes the region in which a declaration is in scope.**

Example:

```java
private int balance;
```

`private` is an access-control rule for the member.

---

# 45. Access Modifiers and Local Variables

Access modifiers such as:

```text
public
protected
private
```

are used with class members, not ordinary local variables.

This is invalid:

```java
void display() {

    private int number = 10; // Error
}
```

---

# 46. Full Scope Example ⭐⭐⭐

```java
class Demo {

    static int staticValue = 100;

    int instanceValue = 200;

    void display(int parameter) {

        int localValue = 300;

        if (parameter > 0) {

            int blockValue = 400;

            System.out.println(staticValue);
            System.out.println(instanceValue);
            System.out.println(parameter);
            System.out.println(localValue);
            System.out.println(blockValue);
        }

        System.out.println(staticValue);
        System.out.println(instanceValue);
        System.out.println(parameter);
        System.out.println(localValue);

        // blockValue is not accessible here
    }
}
```

Inside the `if` block:

```text
staticValue   → accessible
instanceValue → accessible
parameter     → accessible
localValue    → accessible
blockValue    → accessible
```

After the `if` block:

```text
staticValue   → accessible
instanceValue → accessible
parameter     → accessible
localValue    → accessible
blockValue    → not accessible
```

---

# 47. Scope Hierarchy 🧠

Think of scopes like nested boxes:

```text
Class
 │
 ├── Method
 │    │
 │    ├── Parameter
 │    ├── Local variable
 │    │
 │    └── Block
 │         │
 │         └── Block variable
 │
 └── Another Method
```

An inner scope can generally access accessible declarations from an enclosing scope.

An outer scope cannot access declarations that exist only inside an inner scope.

---

# 48. Common Interview Traps ⭐⭐⭐

### Trap 1

```java
void test() {

    int x = 10;
}

void display() {

    System.out.println(x);
}
```

**Answer:** Compilation error.

`x` is local to `test()`.

---

### Trap 2

```java
if (true) {

    int x = 10;
}

System.out.println(x);
```

**Answer:** Compilation error.

`x` is outside its scope.

---

### Trap 3

```java
class Demo {

    int x = 10;

    void display() {

        int x = 20;

        System.out.println(x);
        System.out.println(this.x);
    }
}
```

Output:

```text
20
10
```

---

### Trap 4

```java
void display() {

    int x;

    System.out.println(x);
}
```

**Answer:** Compilation error because the local variable has not been initialized.

---

### Trap 5

```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}

System.out.println(i);
```

**Answer:** Compilation error because `i` is outside the `for` statement's scope.

---

# 49. Interview Questions ⭐⭐⭐

### Q1. What is scope?

Scope is the region of a program in which a declared variable, parameter, or member can be referenced by name.

### Q2. What is the scope of a local variable?

It is limited to its enclosing block, beginning at the declaration and continuing to the end of that block.

### Q3. What is block scope?

It is the scope associated with a block enclosed by `{ }`.

### Q4. Can a variable declared inside an `if` block be accessed outside it?

No.

### Q5. Can an inner block access variables from an outer block?

Yes, if those declarations are accessible and in scope.

### Q6. Can an outer block access a variable declared in an inner block?

No.

### Q7. What is variable shadowing?

It occurs when a declaration in a narrower scope uses the same name as another declaration from an enclosing scope.

### Q8. How do you access a shadowed instance variable?

Use:

```java
this.variableName
```

### Q9. What is the difference between scope and lifetime?

Scope is where a name can be referenced; lifetime is how long the associated runtime entity exists.

### Q10. Do local variables get default values?

No. They must be definitely assigned before use.

### Q11. Do instance variables get default values?

Yes.

### Q12. Can two local variables have the same name?

Not when their declarations would occupy overlapping prohibited local scopes.

### Q13. Can the same local variable name be used in separate non-overlapping blocks?

Yes.

### Q14. Is `private` the same as scope?

No. `private` controls member accessibility; scope and access control are distinct concepts.

---

# 50. Placement-Level Answer ⭐

If an interviewer asks:

> **"What is variable scope in Java?"**

A strong answer:

> **"Scope defines the region of the program where a variable, parameter, or member can be referenced by name. Local variables and parameters have method or block-based scope, while instance and static variables are class members governed by member access rules. Understanding scope is also important for variable shadowing and avoiding compilation errors."**

---

# 51. Scope Decision Cheat Sheet

```text
Declared inside method?
        ↓
Local variable / parameter
        ↓
Accessible within its relevant local scope
```

```text
Declared inside a block?
        ↓
Block scope
        ↓
Accessible within that block
```

```text
Declared in class outside methods?
        ↓
Instance variable
        ↓
Object state
```

```text
Declared with static?
        ↓
Static variable
        ↓
Class state
```

---

# 52. Practice Problems

## Beginner

### Problem 1

Identify the scope of every variable:

```java
class Demo {

    int a = 10;

    void display(int b) {

        int c = 20;

        if (b > 0) {

            int d = 30;

            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
        }
    }
}
```

### Problem 2

Find which statement causes a compilation error:

```java
void test() {

    if (true) {

        int x = 10;

        System.out.println(x);
    }

    System.out.println(x);
}
```

### Problem 3

Explain the output:

```java
class Demo {

    int value = 10;

    void display() {

        int value = 20;

        System.out.println(value);
        System.out.println(this.value);
    }
}
```

---

## Intermediate

### Problem 4

Write a program demonstrating:

```text
method parameter
local variable
block variable
instance variable
static variable
```

### Problem 5

Create nested blocks and demonstrate which variables are accessible at each level.

### Problem 6

Write a program demonstrating parameter shadowing:

```java
String name;

void setName(String name)
```

Use `this`.

---

## Placement Practice ⭐

### Problem 7

Given a Java program containing nested `if`, `for`, and method blocks, identify the exact scope of every variable.

### Problem 8

Find and fix all scope-related compilation errors in a program.

### Problem 9

Explain the difference between:

```text
scope
lifetime
accessibility
```

with Java examples.

### Problem 10

Write a recursive method and identify the scope of its parameters and local variables for every recursive invocation.

---

# 53. Quick Revision ⭐⭐⭐

```text
SCOPE
  ↓
Where can I use this name?
```

```text
LOCAL VARIABLE
  ↓
Method/block scope
```

```text
PARAMETER
  ↓
Method/constructor body
```

```text
BLOCK VARIABLE
  ↓
Inside its { } block
```

```text
INSTANCE VARIABLE
  ↓
Object state
```

```text
STATIC VARIABLE
  ↓
Class state
```

```text
this.variable
  ↓
Current object's instance variable
```

```text
Scope ≠ Lifetime
Scope ≠ Access Modifier
```

---

# 54. Key Rules to Remember ⭐⭐⭐

```text
1. Scope = where a name can be referenced.

2. Local variables are scoped to their enclosing block.

3. Method parameters are scoped to the method/constructor body.

4. Inner blocks can access accessible outer declarations.

5. Outer blocks cannot access inner-block variables.

6. A local variable cannot be used before its declaration.

7. Local variables must be initialized before use.

8. Instance variables belong to objects.

9. Static variables belong to the class.

10. this can distinguish an instance field from a shadowing parameter/local variable.

11. Scope and lifetime are different concepts.

12. Scope and access modifiers are different concepts.

13. Local variables from one method cannot be directly accessed by another method.

14. Use parameters and return values to transfer data between methods.

15. Each recursive method invocation has its own parameters and local variables.
```

---

# 55. Module 20 Progress

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
✅ 10_InstanceMethods.md
✅ 11_MethodScope.md

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
- Effective Java — Joshua Bloch
- Head First Java
