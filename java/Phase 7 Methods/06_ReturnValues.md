# Return Values

> **Module 20 – Methods**

---

## 1. Introduction

A method can perform a task and **send a value back to the caller**.

That value is called the **return value**.

Example:

```java
static int add(int a, int b) {
    return a + b;
}
```

Calling the method:

```java
int result = add(10, 20);
```

Output:

```text
30
```

Flow:

```text
Method Call
    ↓
Method executes
    ↓
Calculates result
    ↓
return
    ↓
Caller receives value
```

---

## 2. What is a Return Value?

A **return value** is the value sent back from a method to the code that called it.

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

The method returns:

```text
25
```

So:

```text
square(5)
    ↓
25
```

---

## 3. Return Type

The **return type** tells Java what type of value the method will return.

Example:

```java
static int add(int a, int b)
```

Here:

```text
int
 ↓
Return Type
```

The method must return a value compatible with `int`.

---

## 4. Common Return Types

A method can return different data types:

```text
int
long
float
double
char
boolean
String
array
object
```

A method can also use:

```java
void
```

which means the method does not return a value.

---

## 5. The `return` Statement

The `return` statement sends a value back to the caller.

Example:

```java
static int getNumber() {
    return 100;
}
```

Call:

```java
int x = getNumber();
```

Flow:

```text
getNumber()
    ↓
return 100
    ↓
x = 100
```

---

## 6. Return Value Must Match the Return Type ⭐

Example:

```java
static int getNumber() {
    return 10;
}
```

This is correct because the method returns an `int`.

Incorrect:

```java
static int getNumber() {
    return "10";
}
```

Why?

```text
int
≠
String
```

The returned value must be compatible with the declared return type.

---

## 7. Returning `double`

Example:

```java
static double calculateArea(double radius) {
    return Math.PI * radius * radius;
}
```

Call:

```java
double area = calculateArea(5.0);
```

The method returns a `double`.

---

## 8. Returning `boolean`

A method can return `true` or `false`.

Example:

```java
static boolean isEven(int n) {
    return n % 2 == 0;
}
```

Call:

```java
boolean result = isEven(10);
```

Result:

```text
true
```

This is extremely common in DSA.

---

## 9. Returning `char`

Example:

```java
static char getGrade() {
    return 'A';
}
```

Call:

```java
char grade = getGrade();
```

---

## 10. Returning `String`

Example:

```java
static String getName() {
    return "Java";
}
```

Call:

```java
String name = getName();
```

Output:

```text
Java
```

---

## 11. Returning an Array ⭐

A method can return an array.

Example:

```java
static int[] createArray() {

    int[] numbers = {10, 20, 30};

    return numbers;
}
```

Call:

```java
int[] arr = createArray();
```

Now:

```text
arr → {10, 20, 30}
```

Returning arrays becomes very important in DSA.

---

## 12. Returning an Expression

The `return` statement does not have to return a variable.

We can return an expression directly.

Example:

```java
static int add(int a, int b) {
    return a + b;
}
```

Java evaluates:

```text
a + b
```

and returns the result.

---

## 13. Returning a Variable

We can also store the result in a variable first.

Example:

```java
static int add(int a, int b) {

    int sum = a + b;

    return sum;
}
```

This is equivalent to:

```java
static int add(int a, int b) {
    return a + b;
}
```

Both are valid.

---

## 14. Multiple Return Statements

A method can contain multiple `return` statements.

Example:

```java
static int findMaximum(int a, int b) {

    if(a > b) {
        return a;
    }

    return b;
}
```

Only one return path executes during a particular method call.

---

## 15. Return Inside `if-else`

Example:

```java
static int absoluteValue(int n) {

    if(n >= 0) {
        return n;
    } else {
        return -n;
    }
}
```

Call:

```java
System.out.println(absoluteValue(-10));
```

Output:

```text
10
```

---

## 16. Return Inside Loops ⭐

A `return` statement can appear inside a loop.

Example:

```java
static int findNumber(int[] arr, int target) {

    for(int i = 0; i < arr.length; i++) {

        if(arr[i] == target) {
            return i;
        }
    }

    return -1;
}
```

If the target is found:

```text
return index
```

If it is not found:

```text
return -1
```

This pattern is extremely common in DSA.

---

## 17. `return` Ends the Method ⭐

When Java executes a `return` statement, the method immediately ends.

Example:

```java
static int test() {

    System.out.println("A");

    return 10;
}
```

Once `return` executes:

```text
Method stops
    ↓
Control goes back to caller
```

Any code after an unconditional `return` is unreachable.

---

## 18. `return` vs `System.out.println()` ⭐

These are completely different.

### `return`

Sends a value back to the caller.

```java
static int add(int a, int b) {
    return a + b;
}
```

### `System.out.println()`

Displays a value on the console.

```java
static void add(int a, int b) {
    System.out.println(a + b);
}
```

Remember:

```text
return
  ↓
Gives value back

println
  ↓
Displays value
```

---

## 19. Return Value Gives Reusability ⭐

Compare:

```java
static void square(int n) {
    System.out.println(n * n);
}
```

with:

```java
static int square(int n) {
    return n * n;
}
```

The second version is more reusable.

We can:

```java
System.out.println(square(5));
```

or:

```java
int result = square(5);
```

or:

```java
int total = square(5) + square(10);
```

Because the method returns a value.

---

## 20. Returning Boolean Values

Instead of:

```java
static void checkEven(int n) {

    if(n % 2 == 0) {
        System.out.println("Even");
    }
}
```

A more reusable method is:

```java
static boolean isEven(int n) {
    return n % 2 == 0;
}
```

Now it can be used anywhere:

```java
if(isEven(10)) {
    System.out.println("Even");
}
```

---

## 21. Return Values in Expressions

A returned value can participate in another expression.

Example:

```java
static int square(int n) {
    return n * n;
}
```

Then:

```java
int result = square(5) + square(3);
```

Calculation:

```text
square(5) → 25
square(3) → 9

25 + 9
  ↓
34
```

Therefore:

```text
result = 34
```

---

## 22. Nested Method Calls ⭐

A returned value can be passed into another method.

Example:

```java
static int square(int n) {
    return n * n;
}

static int add(int a, int b) {
    return a + b;
}
```

Call:

```java
int result = add(square(3), square(4));
```

Execution:

```text
square(3) → 9
square(4) → 16

add(9, 16)
     ↓
25
```

Result:

```text
25
```

---

## 23. Return Values and Conditions

Example:

```java
static boolean isEligible(int age) {
    return age >= 18;
}
```

Use:

```java
if(isEligible(21)) {
    System.out.println("Eligible");
}
```

Output:

```text
Eligible
```

The returned boolean becomes the condition.

---

## 24. Return Values and Loops

Example:

```java
static boolean isEven(int n) {
    return n % 2 == 0;
}

public static void main(String[] args) {

    for(int i = 1; i <= 10; i++) {

        if(isEven(i)) {
            System.out.println(i);
        }
    }
}
```

Output:

```text
2
4
6
8
10
```

---

## 25. Return Value in DSA ⭐

Return values are fundamental in DSA.

Examples:

```java
static int findMaximum(int[] arr)
```

```java
static int binarySearch(int[] arr, int target)
```

```java
static boolean isPalindrome(String str)
```

```java
static int sumOfDigits(int n)
```

```java
static int gcd(int a, int b)
```

The method performs the algorithm and returns the required answer.

---

## 26. Example: Maximum Element

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
int[] arr = {10, 50, 30, 80, 20};

int result = findMaximum(arr);

System.out.println(result);
```

Output:

```text
80
```

---

## 27. Example: Sum of Digits

```java
static int sumOfDigits(int n) {

    int sum = 0;

    while(n > 0) {

        sum += n % 10;
        n /= 10;
    }

    return sum;
}
```

Call:

```java
int result = sumOfDigits(12345);

System.out.println(result);
```

Output:

```text
15
```

---

## 28. Example: Reverse Number

```java
static int reverseNumber(int n) {

    int reverse = 0;

    while(n > 0) {

        int digit = n % 10;

        reverse = reverse * 10 + digit;

        n /= 10;
    }

    return reverse;
}
```

Call:

```java
System.out.println(reverseNumber(1234));
```

Output:

```text
4321
```

---

## 29. Example: Prime Check

```java
static boolean isPrime(int n) {

    if(n < 2) {
        return false;
    }

    for(int i = 2; i <= Math.sqrt(n); i++) {

        if(n % i == 0) {
            return false;
        }
    }

    return true;
}
```

Call:

```java
System.out.println(isPrime(17));
```

Output:

```text
true
```

---

## 30. Example: Palindrome

```java
static boolean isPalindrome(int n) {

    int original = n;
    int reverse = 0;

    while(n > 0) {

        int digit = n % 10;

        reverse = reverse * 10 + digit;

        n /= 10;
    }

    return original == reverse;
}
```

Call:

```java
System.out.println(isPalindrome(121));
```

Output:

```text
true
```

---

## 31. `void` vs Return Value ⭐

### `void` method

```java
static void greet() {
    System.out.println("Hello");
}
```

It performs an action but does not send a value back.

### Returning method

```java
static int add(int a, int b) {
    return a + b;
}
```

It calculates a value and sends it back.

Remember:

```text
void
 ↓
No value returned

non-void
 ↓
Value returned
```

---

## 32. Returning from a `void` Method

A `void` method cannot return a value.

This is valid:

```java
static void check(int n) {

    if(n < 0) {
        return;
    }

    System.out.println("Positive");
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

This is invalid:

```java
static void check(int n) {
    return 10;
}
```

A `void` method cannot return a value.

---

## 33. Return Value and `main()`

The `main()` method is:

```java
public static void main(String[] args)
```

Its return type is:

```text
void
```

Therefore, `main()` does not return a value to another method in the normal way.

It is the entry point from which program execution begins.

---

## 34. Return Value Can Be Stored

The returned value can be stored in a variable.

Example:

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
5 × 4
  ↓
20
  ↓
return 20
  ↓
result = 20
```

---

## 35. Return Value Can Be Printed Directly

We do not always need a variable.

Example:

```java
System.out.println(add(10, 20));
```

Flow:

```text
add(10, 20)
     ↓
30
     ↓
println(30)
```

---

## 36. Return Value Can Be Used as an Argument

Example:

```java
static int square(int n) {
    return n * n;
}

static void display(int value) {
    System.out.println(value);
}
```

Call:

```java
display(square(5));
```

Execution:

```text
square(5)
   ↓
25
   ↓
display(25)
```

Output:

```text
25
```

---

## 37. All Possible Paths Must Return ⭐

For a non-`void` method, every possible execution path must return a compatible value.

Incorrect:

```java
static int check(int n) {

    if(n > 0) {
        return 1;
    }
}
```

If `n <= 0`, there is no return.

Correct:

```java
static int check(int n) {

    if(n > 0) {
        return 1;
    }

    return 0;
}
```

---

## 38. Professional Method Design ⭐

Prefer methods that return results when the result may be needed elsewhere.

Example:

```java
static int calculateTotal(int price, int quantity) {
    return price * quantity;
}
```

Then the caller decides what to do with the result:

```java
int total = calculateTotal(100, 5);

System.out.println(total);
```

This separates:

```text
Calculation
     ↓
Method

Presentation
     ↓
Caller
```

This is cleaner and more reusable.

---

## 39. Common Beginner Mistakes ⭐

### Mistake 1 – Missing `return`

Incorrect:

```java
static int add(int a, int b) {

    int sum = a + b;
}
```

Correct:

```java
static int add(int a, int b) {

    int sum = a + b;

    return sum;
}
```

### Mistake 2 – Wrong return type

Incorrect:

```java
static int getName() {
    return "Joe";
}
```

Correct:

```java
static String getName() {
    return "Joe";
}
```

### Mistake 3 – Returning incompatible value

Incorrect:

```java
static boolean check() {
    return 10;
}
```

Correct:

```java
static boolean check() {
    return true;
}
```

### Mistake 4 – Returning a value from `void`

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

### Mistake 5 – Code after `return`

Incorrect:

```java
static int getNumber() {

    return 10;

    System.out.println("Hello");
}
```

The statement after `return` is unreachable.

### Mistake 6 – Confusing `return` with `println`

Incorrect thinking:

```text
println → sends value back
```

Correct:

```text
println → displays value

return → sends value back
```

---

## 40. Interview Perspective ⭐⭐⭐

### Q1. What is a return value?

A return value is the value sent from a method back to its caller.

### Q2. What does the return type specify?

It specifies the type of value a method is expected to return.

### Q3. Can a method have multiple return statements?

Yes. Only one return path executes during a particular method invocation.

### Q4. Can a `void` method use `return`?

Yes.

```java
return;
```

can exit a `void` method early.

### Q5. Can a `void` method return a value?

No.

```java
return 10;
```

is invalid inside a `void` method.

### Q6. What happens after `return`?

The method immediately terminates and control goes back to the caller.

### Q7. Can a method return an array?

Yes.

```java
static int[] getNumbers() {
    return new int[]{10, 20, 30};
}
```

### Q8. Why are return values important in DSA?

They allow a method to calculate an answer and send it back to the calling code for further processing.

---

## 41. Placement Connection ⭐

Most coding problems can be designed as:

```text
Input
  ↓
Parameters
  ↓
Method Logic
  ↓
Return Value
  ↓
Output
```

Example:

```java
static int solve(int[] arr) {

    // algorithm

    return answer;
}
```

This pattern appears frequently in:

- Coding platforms
- DSA
- Technical interviews
- Competitive programming
- Backend development

---

## 42. Practice Problems

### Beginner

1. Create:

```java
static int square(int n)
```

Return the square.

2. Create:

```java
static int cube(int n)
```

Return the cube.

3. Create:

```java
static boolean isEven(int n)
```

Return whether the number is even.

4. Create:

```java
static int findMaximum(int a, int b)
```

Return the larger number.

5. Create:

```java
static String getGrade(int marks)
```

Return a grade based on marks.

### Intermediate

6. Create:

```java
static int sumOfDigits(int n)
```

Return the sum of digits.

7. Create:

```java
static int reverseNumber(int n)
```

Return the reversed number.

8. Create:

```java
static boolean isPalindrome(int n)
```

Return whether the number is a palindrome.

9. Create:

```java
static boolean isPrime(int n)
```

Return whether the number is prime.

10. Create:

```java
static int factorial(int n)
```

Return the factorial.

### Placement Practice ⭐

11. Create:

```java
static int findMaximum(int[] arr)
```

Return the maximum element.

12. Create:

```java
static int findMinimum(int[] arr)
```

Return the minimum element.

13. Create:

```java
static int countDigits(int n)
```

Return the number of digits.

14. Create:

```java
static int gcd(int a, int b)
```

Return the GCD.

15. Create:

```java
static int lcm(int a, int b)
```

Return the LCM.

---

## 43. Quick Revision ⭐⭐⭐

Remember:

```text
Return Type
     ↓
What type of value will come back?

return
     ↓
Sends the value back

Caller
     ↓
Receives the returned value
```

Example:

```java
static int add(int a, int b) {
    return a + b;
}
```

Call:

```java
int result = add(10, 20);
```

Flow:

```text
10, 20
   ↓
add()
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

## 44. Key Takeaways

- A return value is the result sent back by a method.
- The return type specifies the expected type of the result.
- The `return` statement sends the value back.
- A non-`void` method must return a compatible value on every possible execution path.
- `return` immediately terminates the current method.
- A `void` method can use `return;` to exit early.
- A `void` method cannot return a value.
- `return` and `System.out.println()` are different.
- Returning values makes methods reusable.
- Returned values can be stored in variables.
- Returned values can be printed directly.
- Returned values can be used in expressions.
- Returned values can be passed to other methods.
- Methods can return arrays and objects.
- Return values are fundamental to DSA and coding interviews.
- Good method design separates calculation from presentation.

---

## 45. Module 20 Progress

```text
✅ 01_Introduction.md
✅ 02_WhyMethods.md
✅ 03_MethodSyntax.md
✅ 04_MethodDeclarationAndCalling.md
✅ 05_MethodParameters.md
✅ 06_ReturnValues.md

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
