# Why Methods?

> **Module 20 – Methods**

---

## 1. Introduction

A **method** is a named block of code that performs a specific task.

Methods help us divide a large program into smaller, meaningful, reusable parts.

```text
Large Program
      ↓
Smaller Tasks
      ↓
Methods
      ↓
Readable + Reusable Code
```

---

## 2. Why Do We Need Methods?

If everything is written inside `main()`, a large program becomes difficult to read, debug, test, and maintain.

Instead of:

```java
public static void main(String[] args) {

    // input
    // calculations
    // validation
    // output
    // more logic
}
```

we can organize the program:

```java
getInput();
calculateResult();
validateData();
displayResult();
```

---

## 3. Code Reusability ⭐

One of the biggest advantages of methods is **reusability**.

Without a method:

```java
System.out.println("Welcome");
System.out.println("Welcome");
System.out.println("Welcome");
```

With a method:

```java
static void welcome() {
    System.out.println("Welcome");
}
```

Then:

```java
welcome();
welcome();
welcome();
```

The logic is written once and reused multiple times.

---

## 4. Avoid Code Duplication

Repeated code is called **code duplication**.

Example:

```java
int a = 10;
int b = 20;
System.out.println(a + b);

int x = 30;
int y = 40;
System.out.println(x + y);
```

Instead:

```java
static void addAndPrint(int a, int b) {
    System.out.println(a + b);
}
```

Then:

```java
addAndPrint(10, 20);
addAndPrint(30, 40);
```

---

## 5. Modularity ⭐

**Modularity** means dividing a large program into smaller logical parts.

For example, an online shopping application may have:

```text
User
Product
Cart
Payment
Order
```

Methods can represent operations:

```java
addProduct();
removeProduct();
calculateTotal();
placeOrder();
makePayment();
```

---

## 6. Readability

Compare:

```text
// 200 lines of code
```

with:

```java
getStudentDetails();
calculateMarks();
calculateGrade();
displayResult();
```

The second version makes the program flow easier to understand.

Methods act like meaningful labels for sections of code.

---

## 7. Maintainability

Suppose the same calculation is used in many places.

Without a method, we may need to change the logic everywhere.

With a method:

```java
calculateTotal();
```

we change the implementation in one place.

```text
One Method
    ↓
Used in many places
    ↓
Change once
    ↓
Updated behavior
```

---

## 8. Debugging

Methods make debugging easier.

For example:

```java
getInput();
calculateSalary();
calculateTax();
displaySalary();
```

If the final result is wrong, we can investigate each method separately.

This is easier than debugging one huge block of code.

---

## 9. Testing ⭐

Methods make testing easier.

Example:

```java
static int add(int a, int b) {
    return a + b;
}
```

We can test:

```java
add(2, 3);
add(10, 20);
add(-5, 5);
```

Expected results:

```text
5
30
0
```

This is useful for:

- Unit testing
- DSA practice
- Backend development
- Software projects

---

## 10. Single Responsibility Principle

A good method should generally have **one clear responsibility**.

Good:

```java
calculateSalary();
calculateTax();
displaySalary();
```

Avoid putting unrelated responsibilities into one huge method.

```text
One Method
     ↓
One Clear Responsibility
```

---

## 11. Cleaner `main()`

Instead of:

```java
public static void main(String[] args) {

    // 100+ lines of code

}
```

we can write:

```java
public static void main(String[] args) {

    getInput();
    processData();
    displayResult();

}
```

The `main()` method becomes easier to understand.

---

## 12. Problem Decomposition ⭐

Methods help break a large problem into smaller problems.

Example:

```text
Student Result System
        ↓
Get Marks
        ↓
Calculate Total
        ↓
Calculate Average
        ↓
Calculate Grade
        ↓
Display Result
```

Possible methods:

```java
getMarks();
calculateTotal();
calculateAverage();
calculateGrade();
displayResult();
```

This is called **problem decomposition**.

---

## 13. Methods in DSA

Methods are extremely useful in DSA.

Examples:

```java
static int findMaximum(int[] arr) {
    // logic
}
```

```java
static boolean isPalindrome(String str) {
    // logic
}
```

```java
static void sortArray(int[] arr) {
    // logic
}
```

Each problem can be implemented as a separate method.

---

## 14. Methods in Competitive Programming

Example:

```java
static boolean isPrime(int n) {
    // prime logic
}
```

Then:

```java
if(isPrime(number)) {
    System.out.println("Prime");
}
```

The main code focuses on the problem flow while the method handles the implementation.

---

## 15. Methods in Software Development

Real Java applications contain many methods.

Examples:

```java
createUser();
findUser();
updateUser();
deleteUser();
```

Methods are basic building blocks of professional Java software.

---

## 16. Methods and Spring Boot

When we learn Spring Boot, methods will appear everywhere.

Example:

```java
public User getUserById(int id) {
    // logic
}
```

or:

```java
public void createUser(User user) {
    // logic
}
```

Understanding methods now will make Spring Boot easier later.

---

## 17. Methods and OOP

Methods are a major part of Object-Oriented Programming.

A class can contain:

```text
Variables
+
Methods
```

Example:

```java
class Student {

    String name;
    int marks;

    void displayDetails() {
        System.out.println(name);
        System.out.println(marks);
    }
}
```

Later we will connect methods with:

- Classes
- Objects
- Encapsulation
- Inheritance
- Polymorphism
- Abstraction

---

## 18. What Makes a Good Method?

A good method generally has:

```text
✔ Meaningful name
✔ Clear responsibility
✔ Understandable logic
✔ Appropriate parameters
✔ Appropriate return type
✔ Minimal unnecessary duplication
```

Example:

```java
static boolean isEven(int number) {
    return number % 2 == 0;
}
```

This method is small, reusable, readable, and easy to test.

---

## 19. When Should We Create a Method?

Consider creating a method when:

### 1. Logic is repeated

```text
Repeated logic → Method
```

### 2. A task has a clear responsibility

```text
Calculate tax → calculateTax()
```

### 3. `main()` becomes too large

```text
Large main() → Break into methods
```

### 4. Logic needs independent testing

```text
Testable logic → Method
```

### 5. A complex problem can be divided

```text
Large problem → Smaller methods
```

---

## 20. Don't Overuse Methods

Methods are useful, but creating a separate method for every single line can make code unnecessarily complicated.

Avoid:

```java
printOne();
printTwo();
printThree();
```

if there is no meaningful reason to separate them.

The goal is:

```text
Good organization
```

not:

```text
Maximum number of methods
```

---

## 21. Common Beginner Mistakes

### Mistake 1

Putting the entire program inside `main()`.

### Mistake 2

Repeating the same logic instead of creating a reusable method.

### Mistake 3

Using unclear names.

Bad:

```java
doIt();
```

Better:

```java
calculateAverage();
```

### Mistake 4

Creating methods that perform unrelated tasks.

### Mistake 5

Creating too many tiny methods without a real reason.

---

## 22. Interview Perspective ⭐

### Why do we use methods?

Methods provide:

- Reusability
- Modularity
- Readability
- Maintainability
- Testing
- Debugging
- Reduced code duplication

### Why break a program into methods?

It makes the program easier to understand, test, debug, maintain, and reuse.

### Should every statement be a separate method?

No. Methods should represent meaningful responsibilities.

---

## 23. Methods in Placement Preparation ⭐

Methods directly help with:

```text
Java Fundamentals
      ↓
OOP
      ↓
DSA
      ↓
Competitive Programming
      ↓
Coding Interviews
      ↓
Spring Boot
      ↓
Software Projects
```

In placement coding questions, you will frequently write methods such as:

```java
static int solve(...) 
```

```java
static boolean check(...)
```

```java
static void process(...)
```

---

## 24. Quick Revision

Remember the major reasons for methods:

```text
Methods
   ↓
Reusability
   ↓
Modularity
   ↓
Readability
   ↓
Maintainability
   ↓
Testing
   ↓
Debugging
   ↓
Less Duplication
```

---

## 25. Interview One-Liner ⭐

**Question: Why are methods used in Java?**

Strong answer:

> Methods are used to divide a program into reusable and meaningful blocks of code. They improve readability, modularity, maintainability, testing, debugging, and reduce code duplication.

---

## 26. Bootcamp Insight 💡

The important mindset change is:

```text
Beginner Thinking:
"I need to write a program."

        ↓

Engineering Thinking:
"I need to design small reusable operations
that work together to solve the problem."
```

Methods are one of the first steps toward thinking like a software engineer.

---

## 27. Key Takeaways

- Methods divide large programs into smaller tasks.
- Methods provide code reusability.
- Methods reduce code duplication.
- Methods improve readability.
- Methods make debugging and testing easier.
- Methods support modular design.
- Methods should generally have a clear responsibility.
- Methods are fundamental to DSA, OOP, Spring Boot, and software projects.
- Good method design is more important than simply creating many methods.

---

## 28. Module 20 Progress

```text
✅ 01_Introduction.md
✅ 02_WhyMethods.md

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
