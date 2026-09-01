# Instance Methods

> **Module 20 – Methods**
>
> An **instance method** is a non-static method that belongs to an object and can directly access that object's instance members.

---

## 1. What is an Instance Method?

An instance method is a method declared **without the `static` keyword**.

```java
class Student {

    String name;

    void displayName() {
        System.out.println(name);
    }
}
```

Calling it:

```java
Student student = new Student();

student.name = "Joe";

student.displayName();
```

Output:

```text
Joe
```

The method operates on the particular `Student` object.

---

## 2. Professional Definition ⭐

> **An instance method is a non-static method that belongs to an object instance of a class and can directly access the instance state and other instance members of that object.**

Use an instance method when behavior depends on the state of a particular object.

---

## 3. Basic Syntax

```java
returnType methodName(parameters) {

    // method body

}
```

Example:

```java
void greet() {
    System.out.println("Hello");
}
```

Because `static` is absent, this is an instance method.

---

## 4. Calling an Instance Method

Instance methods are normally called through an object reference:

```java
objectReference.methodName();
```

Example:

```java
Student student = new Student();

student.displayName();
```

The object provides the instance context.

---

## 5. Why Do We Need Instance Methods?

Instance methods are useful when behavior depends on object-specific data.

Example:

```java
class BankAccount {

    double balance;

    void deposit(double amount) {
        balance += amount;
    }
}
```

Different accounts can have different balances.

```text
Account 1 → balance = 5000
Account 2 → balance = 10000
```

The same `deposit()` method operates on each object's own balance.

---

## 6. Instance Method and Instance Variable ⭐

An instance method can directly access instance variables.

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

Usage:

```java
Student s = new Student();

s.name = "Joe";
s.age = 22;

s.display();
```

Output:

```text
Joe
22
```

---

## 7. Multiple Objects Have Independent State ⭐⭐⭐

```java
class Student {

    String name;

    void display() {
        System.out.println(name);
    }
}
```

Create two objects:

```java
Student s1 = new Student();
Student s2 = new Student();

s1.name = "Joe";
s2.name = "Alex";
```

Call:

```java
s1.display();
s2.display();
```

Output:

```text
Joe
Alex
```

The same instance method operates on different object states.

---

## 8. Object Reference Determines the State

When we write:

```java
s1.display();
```

the method operates on `s1`.

When we write:

```java
s2.display();
```

the method operates on `s2`.

Conceptually:

```text
s1.display()
     ↓
s1's state

s2.display()
     ↓
s2's state
```

---

## 9. Instance Methods and `this` ⭐⭐⭐

An instance method has access to the `this` reference.

```java
class Student {

    String name;

    void setName(String name) {
        this.name = name;
    }
}
```

Here:

```java
this.name
```

refers to the current object's instance variable.

---

## 10. What is `this`?

`this` is a reference to the **current object**.

```java
class Student {

    String name;

    void display() {
        System.out.println(this.name);
    }
}
```

If:

```java
Student s1 = new Student();
```

and:

```java
s1.display();
```

then `this` refers to `s1`.

```text
this
 ↓
current object
 ↓
s1
```

---

## 11. `this` Resolves Naming Conflicts

```java
class Student {

    String name;

    void setName(String name) {
        this.name = name;
    }
}
```

Here:

```text
this.name
→ instance variable

name
→ method parameter
```

This is one of the most common uses of `this`.

---

## 12. Instance Method with Parameters

Instance methods can accept parameters.

```java
class Calculator {

    int value;

    void add(int number) {
        value += number;
    }
}
```

Usage:

```java
Calculator calc = new Calculator();

calc.add(10);
```

The parameter provides input while the instance variable stores object-specific state.

---

## 13. Instance Method Can Return Values

```java
class Rectangle {

    int length;
    int width;

    int area() {
        return length * width;
    }
}
```

Usage:

```java
Rectangle rectangle = new Rectangle();

rectangle.length = 10;
rectangle.width = 5;

int result = rectangle.area();
```

Result:

```text
50
```

---

## 14. Instance Method Can Be `void`

```java
class Student {

    String name;

    void displayName() {
        System.out.println(name);
    }
}
```

An instance method can have any appropriate return type:

```text
void
int
double
boolean
String
object
array
```

---

## 15. Instance Method Can Call Another Instance Method

```java
class Calculator {

    int square(int n) {
        return n * n;
    }

    void displaySquare(int n) {
        System.out.println(square(n));
    }
}
```

Usage:

```java
Calculator calc = new Calculator();

calc.displaySquare(5);
```

Output:

```text
25
```

An instance method can directly call another instance method on the same current object.

---

## 16. Instance Method Can Access Static Members

An instance method can directly access static members.

```java
class Demo {

    static int count = 10;

    void display() {
        System.out.println(count);
    }
}
```

This is valid because static members belong to the class.

---

## 17. Static Method vs Instance Method ⭐⭐⭐

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

## 18. Comparison Table

| Feature | Static Method | Instance Method |
|---|---|---|
| Keyword | `static` | No `static` |
| Belongs to | Class | Object |
| Object required | No | Yes |
| Direct access to instance fields | No | Yes |
| Direct access to static fields | Yes | Yes |
| Can use `this` | No | Yes |
| Can directly call instance methods | No | Yes |
| Can be overloaded | Yes | Yes |
| Can participate in overriding | No | Yes |
| Typical use | Utility/class-level behavior | Object-specific behavior |

---

## 19. Object Creation

Example:

```java
class Car {

    void drive() {
        System.out.println("Car is driving");
    }
}
```

Create an object:

```java
Car car = new Car();
```

Call:

```java
car.drive();
```

The object is required because `drive()` is an instance method.

---

## 20. Calling an Instance Method from Static Context

This is invalid:

```java
class Demo {

    void display() {
        System.out.println("Hello");
    }

    static void test() {
        display();
    }
}
```

A static method has no particular object context.

Correct:

```java
class Demo {

    void display() {
        System.out.println("Hello");
    }

    static void test() {

        Demo obj = new Demo();

        obj.display();
    }
}
```

---

## 21. Instance Method Calling Static Method

This is valid:

```java
class Demo {

    static void staticMethod() {
        System.out.println("Static");
    }

    void instanceMethod() {
        staticMethod();
    }
}
```

An instance method can directly call a static method.

---

## 22. Calling Another Object's Instance Method

An instance method can call a method through another object.

```java
class Student {

    void greet() {
        System.out.println("Hello");
    }

    void callOtherStudent(Student other) {
        other.greet();
    }
}
```

Usage:

```java
Student s1 = new Student();
Student s2 = new Student();

s1.callOtherStudent(s2);
```

The method operates on `s1` but calls `greet()` on `s2`.

---

## 23. Instance Methods and Encapsulation ⭐⭐⭐

Instance methods are central to encapsulation.

```java
class BankAccount {

    private double balance;

    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}
```

Here:

```text
balance
 ↓
private
 ↓
direct external access restricted
```

Methods provide controlled access to object state.

---

## 24. Getters

A getter is commonly an instance method used to retrieve object state.

```java
class Student {

    private String name;

    public String getName() {
        return name;
    }
}
```

Usage:

```java
Student student = new Student();

System.out.println(student.getName());
```

---

## 25. Setters

A setter is commonly an instance method used to update object state.

```java
class Student {

    private String name;

    public void setName(String name) {
        this.name = name;
    }
}
```

Usage:

```java
Student student = new Student();

student.setName("Joe");
```

---

## 26. Instance Method and Object State ⭐

A useful mental model:

```text
Object
 ├── State
 │    ├── name
 │    └── age
 │
 └── Behavior
      ├── display()
      └── setName()
```

Instance variables represent **state**.

Instance methods represent **behavior**.

This is a fundamental OOP concept.

---

## 27. Constructors and Instance Methods

Constructors initialize objects.

Instance methods operate on those objects after creation.

```java
class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(name + " " + age);
    }
}
```

Usage:

```java
Student student = new Student("Joe", 22);

student.display();
```

Output:

```text
Joe 22
```

---

## 28. Instance Method and Arrays

An instance method can process an array stored in an object.

```java
class Numbers {

    int[] values = {10, 20, 30, 40};

    void printValues() {

        for (int value : values) {
            System.out.println(value);
        }
    }
}
```

Usage:

```java
Numbers numbers = new Numbers();

numbers.printValues();
```

---

## 29. Instance Method Modifying an Array

```java
class Numbers {

    int[] values = {1, 2, 3};

    void doubleValues() {

        for (int i = 0; i < values.length; i++) {
            values[i] *= 2;
        }
    }
}
```

After:

```java
numbers.doubleValues();
```

the array becomes:

```text
{2, 4, 6}
```

---

## 30. Multiple Objects and Independent State ⭐

```java
class Counter {

    int count;

    void increment() {
        count++;
    }
}
```

Create:

```java
Counter c1 = new Counter();
Counter c2 = new Counter();
```

Call:

```java
c1.increment();
c1.increment();

c2.increment();
```

State:

```text
c1.count = 2
c2.count = 1
```

Each object has independent instance state.

---

## 31. Instance Method and `null`

If an object reference is `null`, calling an instance method through it causes a `NullPointerException`.

```java
Student student = null;

student.displayName();
```

Conceptually:

```text
student
   ↓
null
   ↓
no object
   ↓
instance method invocation fails
```

---

## 32. Instance Methods and Method Overloading

Instance methods can be overloaded.

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
Calculator calculator = new Calculator();

calculator.add(10, 20);

calculator.add(10, 20, 30);
```

---

## 33. Instance Methods and Method Overriding ⭐⭐⭐

Instance methods can participate in overriding.

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

Usage:

```java
Animal animal = new Dog();

animal.sound();
```

Output:

```text
Dog sound
```

This demonstrates runtime polymorphism.

---

## 34. Dynamic Method Dispatch ⭐⭐⭐

When an overridden instance method is called, Java can select the implementation based on the actual object.

```java
Animal animal = new Dog();

animal.sound();
```

Reference type:

```text
Animal
```

Actual object:

```text
Dog
```

Executed method:

```text
Dog.sound()
```

This is **dynamic method dispatch**.

---

## 35. Why Instance Methods Support Runtime Polymorphism

Instance methods represent object behavior.

When a subclass overrides an eligible instance method, Java can select the implementation based on the actual object at runtime.

```text
Reference
   ↓
Actual Object
   ↓
Overridden Method
```

---

## 36. `final` Instance Method

An instance method can be declared `final`.

```java
class Parent {

    final void display() {
        System.out.println("Parent");
    }
}
```

A subclass cannot override this method.

---

## 37. Access Modifiers

Instance methods can use:

```text
public
protected
private
```

Example:

```java
public void display() {
}
```

Access modifiers control where the method can be accessed.

---

## 38. Private Instance Methods

A private instance method can only be accessed inside its class.

```java
class BankAccount {

    private void validateAmount(double amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException();
        }
    }

    public void deposit(double amount) {

        validateAmount(amount);
    }
}
```

The private method is an implementation detail.

---

## 39. `this` vs `this()`

Do not confuse:

```java
this
```

with:

```java
this()
```

### `this`

Refers to the current object.

```java
this.name
```

### `this()`

Calls another constructor in the same class.

```java
this("Unknown");
```

---

## 40. Returning `this`

An instance method can return the current object.

```java
class Builder {

    Builder setValue(int value) {
        // set value
        return this;
    }
}
```

Returning `this` is commonly used in fluent APIs.

---

## 41. Fluent Instance Methods

```java
class Person {

    String name;
    int age;

    Person setName(String name) {
        this.name = name;
        return this;
    }

    Person setAge(int age) {
        this.age = age;
        return this;
    }
}
```

Usage:

```java
Person person = new Person();

person.setName("Joe")
      .setAge(22);
```

Each method returns the same object.

---

## 42. Instance Methods and DSA ⭐

Instance methods are common in object-oriented implementations of data structures.

Example:

```java
class Stack {

    int[] data;

    void push(int value) {
        // add value
    }

    int pop() {
        // remove and return value
        return 0;
    }

    boolean isEmpty() {
        return true;
    }
}
```

These methods operate on the particular `Stack` object's state.

---

## 43. Example: Simple Stack

```java
class Stack {

    int[] data;
    int top = -1;

    Stack(int size) {
        data = new int[size];
    }

    void push(int value) {

        if (top == data.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        data[++top] = value;
    }

    int pop() {

        if (top == -1) {
            return -1;
        }

        return data[top--];
    }

    boolean isEmpty() {
        return top == -1;
    }
}
```

Usage:

```java
Stack stack = new Stack(5);

stack.push(10);
stack.push(20);

System.out.println(stack.pop());
```

The methods operate on the particular `stack` object's state.

---

## 44. Instance Methods and Linked Lists

A linked list implementation commonly uses instance methods.

```java
class LinkedList {

    Node head;

    void add(int value) {
        // add node
    }

    void display() {
        // display nodes
    }
}
```

Why?

Because:

```text
head
 ↓
belongs to a particular linked-list object
```

---

## 45. Common Mistakes ⭐

### Mistake 1 — Calling an instance method using the class name

Incorrect:

```java
Student.displayName();
```

Correct:

```java
Student student = new Student();

student.displayName();
```

---

### Mistake 2 — Calling an instance method from static context without an object

Incorrect:

```java
static void test() {
    display();
}
```

Correct:

```java
static void test() {

    Demo obj = new Demo();

    obj.display();
}
```

---

### Mistake 3 — Thinking every method should be static

If a method operates on object-specific state, it should generally be an instance method.

---

### Mistake 4 — Confusing `this` and `this()`

```text
this
→ current object

this()
→ another constructor in the same class
```

---

### Mistake 5 — Ignoring `null`

Calling an instance method through a null reference causes a `NullPointerException`.

---

## 46. Interview Questions ⭐⭐⭐

### Q1. What is an instance method?

An instance method is a non-static method that belongs to an object and can directly access that object's instance members.

### Q2. How do you call an instance method?

Using:

```java
object.method();
```

### Q3. Can an instance method access instance variables directly?

Yes.

### Q4. Can an instance method access static variables?

Yes.

### Q5. Can an instance method use `this`?

Yes.

### Q6. Can an instance method call another instance method?

Yes.

### Q7. Can an instance method call a static method?

Yes.

### Q8. Can a static method directly call an instance method?

No. It needs an object reference.

### Q9. Can instance methods be overloaded?

Yes.

### Q10. Can instance methods be overridden?

Yes, when the method is eligible for overriding.

### Q11. What happens when an instance method is called through a null reference?

A `NullPointerException` occurs.

### Q12. Why are instance methods important in OOP?

They encapsulate behavior that operates on the state of individual objects.

---

## 47. Placement Connection ⭐

A strong interview explanation:

> **"I use an instance method when the behavior depends on the state of a particular object. The method can directly access the object's instance variables and other instance methods."**

Example:

```java
class BankAccount {

    private double balance;

    void deposit(double amount) {
        balance += amount;
    }
}
```

`deposit()` should be an instance method because each account has its own balance.

---

## 48. Static vs Instance Decision Rule 🧠

Ask:

> **Does this method need a particular object's state?**

If **Yes**:

```text
Instance Method
```

If **No**:

```text
Static Method may be appropriate
```

Example:

```java
account.deposit(500);
```

needs:

```text
account.balance
```

Therefore:

```text
Instance method
```

But:

```java
Math.max(10, 20);
```

does not need object-specific state.

Therefore:

```text
Static method
```

---

## 49. Practice Problems

### Beginner

#### Problem 1

Create a `Student` class with:

```text
name
age
display()
```

Print the student's details.

#### Problem 2

Create a `Rectangle` class with:

```text
length
width
area()
```

Return the area.

#### Problem 3

Create a `BankAccount` class with:

```text
balance
deposit()
withdraw()
getBalance()
```

---

### Intermediate

#### Problem 4

Create a `Counter` class with:

```text
count
increment()
decrement()
display()
```

Create two objects and observe their independent states.

#### Problem 5

Create a `Calculator` class with instance methods:

```text
add()
subtract()
multiply()
divide()
```

#### Problem 6

Create a `Student` class with private fields and instance methods:

```text
setName()
getName()
setMarks()
getMarks()
```

---

### Placement Practice ⭐

#### Problem 7

Create a `BankAccount` class that prevents invalid deposits and withdrawals using private fields and instance methods.

#### Problem 8

Create a `Stack` class with instance methods:

```text
push()
pop()
peek()
isEmpty()
```

#### Problem 9

Create a `LinkedList` class with instance methods:

```text
add()
delete()
search()
display()
```

#### Problem 10

Create a parent class and child class where an instance method is overridden. Demonstrate runtime polymorphism.

---

## 50. Quick Revision ⭐⭐⭐

```text
Instance Method
       ↓
Non-static method
       ↓
Belongs to an object
       ↓
Called using object reference
```

Instance methods can directly access:

```text
instance variables
instance methods
static variables
static methods
this
```

Instance methods can:

```text
accept parameters
return values
be overloaded
be overridden
```

Remember:

```text
Instance method
→ object-specific behavior

Static method
→ class-level behavior
```

---

## 51. Key Takeaways

- An instance method is a non-static method.
- It belongs to an object instance.
- It is normally called using an object reference.
- It can directly access instance variables.
- It can directly access other instance methods.
- It can access static members.
- It can use `this`.
- It can accept parameters.
- It can return values.
- It can be `void`.
- It can be overloaded.
- It can be overridden.
- Instance methods are central to runtime polymorphism.
- Instance methods are important for encapsulation.
- Getters and setters are commonly instance methods.
- DSA data structures commonly use instance methods to operate on internal state.
- Calling an instance method through a null reference causes `NullPointerException`.
- Use an instance method when behavior depends on a particular object's state.

---

## 52. Module 20 Progress

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
