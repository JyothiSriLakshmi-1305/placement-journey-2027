# Void Methods

> **Module 20 – Methods**
>
> A `void` method performs an operation but does not return a value to its caller.

---

## 1. What is a Void Method?

A **void method** is a method whose return type is `void`.

It performs some action but does not send a result back to the caller.

```java
static void greet() {
    System.out.println("Hello Java");
}
```

Calling the method:

```java
greet();
```

Output:

```text
Hello Java
```

### Simple idea

```text
Method
  ↓
Performs an action
  ↓
No value returned
  ↓
void
```

---

## 2. Syntax of a Void Method

```java
static void methodName() {
    // statements
}
```

With parameters:

```java
static void methodName(type parameter1, type parameter2) {
    // statements
}
```

Example:

```java
static void greet(String name) {
    System.out.println("Hello " + name);
}
```

---

## 3. Understanding `void`

The keyword `void` tells the compiler:

> "This method does not return a value."

Example:

```java
static void displayMessage() {
    System.out.println("Welcome!");
}
```

Here:

```text
static  → method modifier
void    → return type
displayMessage → method name
()      → no parameters
```

---

## 4. Calling a Void Method

A `void` method is called as a statement.

```java
greet();
```

We do **not** normally store its result in a variable.

Correct:

```java
greet();
```

Incorrect:

```java
int result = greet();
```

Why?

Because `greet()` returns nothing.

---

## 5. Void Method with Parameters

A `void` method can accept parameters.

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

Important:

```text
void
does NOT mean
no parameters
```

It only means:

```text
no return value
```

---

## 6. Void Method with Multiple Parameters

Example:

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

The method receives two values and performs an action.

---

## 7. Void Method vs Return Method ⭐

### Void Method

```java
static void add(int a, int b) {
    System.out.println(a + b);
}
```

It displays the result.

### Return Method

```java
static int add(int a, int b) {
    return a + b;
}
```

It sends the result back.

### Main Difference

```text
void method
     ↓
performs action
     ↓
no value returned


non-void method
     ↓
produces result
     ↓
value returned
```

---

## 8. `return;` in a Void Method

A `void` method can contain:

```java
return;
```

This means:

> Exit the method immediately.

Example:

```java
static void checkNumber(int n) {

    if (n < 0) {
        return;
    }

    System.out.println("Positive");
}
```

For:

```text
n = -5
```

Execution:

```text
n < 0
 ↓
true
 ↓
return;
 ↓
method ends
```

---

## 9. `return;` vs `return value;`

Inside a `void` method:

```java
return;
```

is valid.

But:

```java
return 10;
```

is invalid.

Example:

```java
static void test() {
    return;
}
```

Correct.

```java
static void test() {
    return 10;
}
```

Incorrect.

Why?

```text
void
 ↓
No value allowed
```

---

## 10. Void Method Does Not Mean "Does Nothing"

A `void` method can perform many useful operations.

For example:

```java
static void printNumbers() {

    for (int i = 1; i <= 5; i++) {
        System.out.println(i);
    }
}
```

It performs an operation:

```text
Print numbers
```

It simply does not return a value.

---

## 11. Void Method with `if`

```java
static void checkEven(int n) {

    if (n % 2 == 0) {
        System.out.println("Even");
    }
}
```

Call:

```java
checkEven(10);
```

Output:

```text
Even
```

---

## 12. Void Method with `if-else`

```java
static void checkNumber(int n) {

    if (n > 0) {
        System.out.println("Positive");
    }
    else if (n < 0) {
        System.out.println("Negative");
    }
    else {
        System.out.println("Zero");
    }
}
```

Call:

```java
checkNumber(-5);
```

Output:

```text
Negative
```

---

## 13. Void Method with `for` Loop

```java
static void printTable(int n) {

    for (int i = 1; i <= 10; i++) {
        System.out.println(n * i);
    }
}
```

Call:

```java
printTable(5);
```

Output:

```text
5
10
15
20
25
30
35
40
45
50
```

---

## 14. Void Method with `while` Loop

```java
static void countDown(int n) {

    while (n >= 1) {
        System.out.println(n);
        n--;
    }
}
```

Call:

```java
countDown(5);
```

Output:

```text
5
4
3
2
1
```

---

## 15. Void Method with `do-while`

```java
static void printNumbers(int n) {

    int i = 1;

    do {
        System.out.println(i);
        i++;
    } while (i <= n);
}
```

Call:

```java
printNumbers(5);
```

Output:

```text
1
2
3
4
5
```

---

## 16. Void Method with Arrays

A `void` method can process an array.

```java
static void printArray(int[] arr) {

    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
}
```

Call:

```java
int[] arr = {10, 20, 30, 40};

printArray(arr);
```

Output:

```text
10
20
30
40
```

---

## 17. Void Method Can Modify an Array ⭐

A `void` method can modify an existing array.

Example:

```java
static void doubleValues(int[] arr) {

    for (int i = 0; i < arr.length; i++) {
        arr[i] = arr[i] * 2;
    }
}
```

Call:

```java
int[] arr = {1, 2, 3};

doubleValues(arr);
```

After the method:

```text
arr = {2, 4, 6}
```

The method does not return the array.

It modifies the existing array.

---

## 18. Void Method for Swapping ⭐

A common DSA example:

```java
static void swap(int[] arr, int i, int j) {

    int temp = arr[i];

    arr[i] = arr[j];

    arr[j] = temp;
}
```

Call:

```java
int[] arr = {10, 20, 30};

swap(arr, 0, 2);
```

Before:

```text
{10, 20, 30}
```

After:

```text
{30, 20, 10}
```

This is a practical use of `void` methods in DSA.

---

## 19. Void Method to Reverse an Array

```java
static void reverseArray(int[] arr) {

    int left = 0;
    int right = arr.length - 1;

    while (left < right) {

        int temp = arr[left];

        arr[left] = arr[right];

        arr[right] = temp;

        left++;
        right--;
    }
}
```

Call:

```java
int[] arr = {1, 2, 3, 4, 5};

reverseArray(arr);
```

Array becomes:

```text
{5, 4, 3, 2, 1}
```

---

## 20. Void Method Can Modify Objects

A `void` method can modify the state of an object.

Example:

```java
class Student {

    String name;

    void setName(String name) {
        this.name = name;
    }
}
```

Calling:

```java
Student student = new Student();

student.setName("Joe");
```

The object's `name` is changed.

The method does not need to return the new name.

---

## 21. Void Method and Side Effects ⭐

A method has a **side effect** when it changes something outside its local calculation.

Examples:

```text
Modify an array
Modify an object
Print output
Write data
Update a database
Send a message
Change program state
```

Example:

```java
static void increment(int[] arr) {
    arr[0]++;
}
```

The method changes the array.

---

## 22. Void Method Calling Another Method

A `void` method can call another method.

```java
static void greet() {
    System.out.println("Hello");
}

static void welcome() {

    greet();

    System.out.println("Welcome");
}
```

Call:

```java
welcome();
```

Output:

```text
Hello
Welcome
```

---

## 23. Void Method Calling a Returning Method

A `void` method can also call a method that returns a value.

```java
static int square(int n) {
    return n * n;
}

static void displaySquare(int n) {
    System.out.println(square(n));
}
```

Call:

```java
displaySquare(5);
```

Output:

```text
25
```

The returned value is used inside the `void` method.

---

## 24. Void Method with Early Exit

Example:

```java
static void printPositive(int n) {

    if (n <= 0) {
        return;
    }

    System.out.println("Positive number");
}
```

For:

```text
n = -5
```

the method exits without printing anything.

---

## 25. Multiple `return;` Statements

A `void` method can have multiple early exits.

```java
static void checkNumber(int n) {

    if (n < 0) {
        return;
    }

    if (n == 0) {
        return;
    }

    System.out.println("Positive");
}
```

This is valid.

Use early returns when they make the logic easier to understand.

---

## 26. `void` and `System.out.println()`

A common beginner implementation is:

```java
static void add(int a, int b) {
    System.out.println(a + b);
}
```

This method displays the answer.

It does **not** return the answer.

If another part of the program needs the result, use:

```java
static int add(int a, int b) {
    return a + b;
}
```

Then:

```java
int result = add(10, 20);
```

---

## 27. When Should We Use `void`? ⭐

Use a `void` method when its primary responsibility is to **perform an action**.

Common examples:

- Display something
- Print an array
- Print a pattern
- Modify an array
- Swap values
- Update object state
- Display a menu
- Log information
- Perform an operation with side effects

Example:

```java
static void printWelcomeMessage() {
    System.out.println("Welcome to the application");
}
```

---

## 28. When Should We Return a Value?

Use a non-`void` method when the caller needs the result.

Example:

```java
static int calculateTotal(int price, int quantity) {
    return price * quantity;
}
```

The caller can then:

```java
int total = calculateTotal(100, 5);
```

or:

```java
System.out.println(calculateTotal(100, 5));
```

or:

```java
if (calculateTotal(100, 5) > 400) {
    System.out.println("Expensive");
}
```

Returning a value gives the caller more flexibility.

---

## 29. `void` vs Return — Important Comparison ⭐⭐⭐

| Feature | `void` Method | Non-`void` Method |
|---|---|---|
| Return type | `void` | `int`, `double`, `boolean`, `String`, etc. |
| Returns a value | No | Yes |
| Can use `return;` | Yes | Yes |
| Can use `return value;` | No | Yes |
| Can have parameters | Yes | Yes |
| Can contain loops | Yes | Yes |
| Can modify arrays | Yes | Yes |
| Can modify objects | Yes | Yes |
| Typical purpose | Perform an action | Produce a result |

---

## 30. Professional Method Design ⭐

Consider:

```java
static void calculateTotal(int price, int quantity) {
    System.out.println(price * quantity);
}
```

This mixes calculation and presentation.

A more reusable design is:

```java
static int calculateTotal(int price, int quantity) {
    return price * quantity;
}
```

Then the caller controls what happens:

```java
int total = calculateTotal(100, 5);

System.out.println(total);
```

This provides better separation of responsibilities.

---

## 31. `void` Methods in DSA ⭐

`void` methods are useful for operations where the data itself is modified.

Common examples:

```java
static void swap(int[] arr, int i, int j)
```

```java
static void reverseArray(int[] arr)
```

```java
static void printArray(int[] arr)
```

```java
static void printLinkedList()
```

```java
static void displayStack()
```

These methods often perform an operation rather than calculate and return an answer.

---

## 32. Example: Print Even Numbers

```java
static void printEvenNumbers(int n) {

    for (int i = 1; i <= n; i++) {

        if (i % 2 == 0) {
            System.out.print(i + " ");
        }
    }
}
```

Call:

```java
printEvenNumbers(10);
```

Output:

```text
2 4 6 8 10
```

---

## 33. Example: Print Prime Numbers

```java
static boolean isPrime(int n) {

    if (n < 2) {
        return false;
    }

    for (int i = 2; i <= Math.sqrt(n); i++) {

        if (n % i == 0) {
            return false;
        }
    }

    return true;
}

static void printPrimes(int n) {

    for (int i = 2; i <= n; i++) {

        if (isPrime(i)) {
            System.out.print(i + " ");
        }
    }
}
```

Call:

```java
printPrimes(20);
```

Output:

```text
2 3 5 7 11 13 17 19
```

Notice:

```text
isPrime()
    ↓
returns boolean

printPrimes()
    ↓
void
```

A `void` method can use the result of a returning method.

---

## 34. Example: Print Pattern

```java
static void printPattern(int n) {

    for (int i = 1; i <= n; i++) {

        for (int j = 1; j <= i; j++) {

            System.out.print("* ");
        }

        System.out.println();
    }
}
```

Call:

```java
printPattern(4);
```

Output:

```text
*
* *
* * *
* * * *
```

This is a common use of `void` methods in pattern programming.

---

## 35. Common Mistakes ⭐

### Mistake 1 — Storing a `void` method result

Incorrect:

```java
int result = greet();
```

Correct:

```java
greet();
```

---

### Mistake 2 — Returning a value from `void`

Incorrect:

```java
static void getNumber() {
    return 10;
}
```

Correct:

```java
static int getNumber() {
    return 10;
}
```

---

### Mistake 3 — Thinking `void` means no parameters

Incorrect:

```text
void → no parameters
```

Correct:

```text
void → no return value
```

Example:

```java
static void greet(String name) {
    System.out.println(name);
}
```

---

### Mistake 4 — Confusing `return` and `println`

```java
System.out.println(value);
```

displays a value.

```java
return value;
```

sends a value back to the caller.

They are not interchangeable.

---

### Mistake 5 — Thinking `void` cannot modify data

A `void` method can modify:

- Arrays
- Objects
- Fields
- Other mutable data structures

Example:

```java
static void increment(int[] arr) {
    arr[0]++;
}
```

---

## 36. Interview Questions ⭐⭐⭐

### Q1. What is a void method?

A `void` method is a method that does not return a value to its caller.

### Q2. Can a void method have parameters?

Yes.

```java
static void greet(String name) {
    System.out.println(name);
}
```

### Q3. Can a void method contain `return`?

Yes.

```java
return;
```

can terminate the method early.

### Q4. Can a void method return a value?

No.

```java
return 10;
```

is invalid in a `void` method.

### Q5. Does void mean the method does nothing?

No.

A `void` method can perform many operations.

### Q6. Can a void method modify an array?

Yes.

### Q7. Can a void method modify an object?

Yes.

### Q8. Why use void instead of returning a value?

When the method's main responsibility is performing an action rather than producing a result for the caller.

### Q9. How is `return;` different from `return value;`?

`return;` exits a `void` method without returning a value.

`return value;` exits a non-void method and sends a value back to the caller.

### Q10. Can a void method call a method that returns a value?

Yes.

Example:

```java
static void displaySquare(int n) {
    System.out.println(square(n));
}
```

---

## 37. Placement Connection ⭐

When designing a method, ask:

```text
Does the method mainly perform an action?
             ↓
            void
```

or:

```text
Does the caller need a calculated result?
             ↓
       return a value
```

Example:

```java
static void printArray(int[] arr)
```

is appropriate for displaying an array.

But:

```java
static int findMaximum(int[] arr)
```

is appropriate for calculating and returning the maximum.

This distinction is important in:

- DSA
- Coding interviews
- Competitive programming
- Backend development
- Real-world Java applications

---

## 38. Practice Problems

### Beginner

1. Create:

```java
static void greet()
```

Print `"Hello Java"`.

2. Create:

```java
static void printName(String name)
```

Print the name.

3. Create:

```java
static void printSquare(int n)
```

Print the square of a number.

4. Create:

```java
static void checkEven(int n)
```

Print whether the number is even or odd.

5. Create:

```java
static void printTable(int n)
```

Print the multiplication table from 1 to 10.

---

### Intermediate

6. Create:

```java
static void printDigits(int n)
```

Print each digit of a number.

7. Create:

```java
static void printReverse(int n)
```

Print the reversed number.

8. Create:

```java
static void printSumOfDigits(int n)
```

Calculate and print the sum of digits.

9. Create:

```java
static void printMaximum(int[] arr)
```

Find and print the maximum element.

10. Create:

```java
static void printArray(int[] arr)
```

Print all elements.

---

### Placement Practice ⭐

11. Create:

```java
static void swap(int[] arr, int i, int j)
```

Swap two elements.

12. Create:

```java
static void reverseArray(int[] arr)
```

Reverse the array in-place.

13. Create:

```java
static void printEvenNumbers(int[] arr)
```

Print all even elements.

14. Create:

```java
static void printPrimeNumbers(int n)
```

Print all prime numbers from `1` to `n`.

15. Create:

```java
static void printPattern(int n)
```

Print a suitable star pattern using nested loops.

---

## 39. Quick Revision ⭐⭐⭐

### Remember

```text
void
 ↓
No value returned
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

---

### Early Exit

```java
static void check(int n) {

    if (n < 0) {
        return;
    }

    System.out.println(n);
}
```

Here:

```java
return;
```

means:

```text
Exit the method
```

---

### Invalid

```java
static void test() {
    return 10;
}
```

### Valid

```java
static int test() {
    return 10;
}
```

---

## 40. Key Takeaways

- `void` means the method does not return a value.
- A `void` method can still accept parameters.
- A `void` method can contain conditions and loops.
- A `void` method can call other methods.
- A `void` method can call methods that return values.
- A `void` method can modify arrays and objects.
- `return;` can exit a `void` method early.
- `return value;` is not allowed in a `void` method.
- `void` does not mean the method does nothing.
- `return` and `System.out.println()` have different purposes.
- Use `void` when the method primarily performs an action.
- Use a non-void return type when the caller needs a result.
- `void` methods are useful in DSA for swapping, reversing, displaying, and modifying data.
- Good method design separates calculation from presentation when appropriate.

---

## 41. Module 20 Progress

```text
✅ 01_Introduction.md
✅ 02_WhyMethods.md
✅ 03_MethodSyntax.md
✅ 04_MethodDeclarationAndCalling.md
✅ 05_MethodParameters.md
✅ 06_ReturnValues.md
✅ 07_VoidMethods.md

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
