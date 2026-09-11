# Pass-by-Value in Java

> **Module 20 – Methods**
>
> **Core rule: Java is always pass-by-value.**

## 1. What is Pass-by-Value?

Pass-by-value means that when a method is called, a **copy of the argument's value** is passed to the parameter.

```java
static void change(int number) {
    number = 100;
}

public static void main(String[] args) {
    int number = 10;
    change(number);
    System.out.println(number);
}
```

Output:

```text
10
```

The method changes its local copy, not the caller's variable.

---

## 2. Professional Interview Definition ⭐

> **Java is strictly pass-by-value. For primitive arguments, the primitive value is copied into the parameter. For object arguments, the value of the reference is copied into the parameter.**

This is the most important rule in this topic.

---

## 3. Java Does Not Use True Pass-by-Reference

Java does not pass the caller's variable itself to a method.

It always passes a value.

That value can be:

```text
Primitive value
```

or:

```text
Object reference value
```

Therefore:

```text
Java → pass-by-value only
```

---

## 4. Primitive Arguments ⭐⭐⭐

```java
static void change(int x) {
    x = 50;
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

Flow:

```text
a = 10
 ↓
copy of 10
 ↓
x = 10
 ↓
x = 50
```

Only `x` changes.

---

## 5. Another Primitive Example

```java
static void addTen(int number) {

    number += 10;

    System.out.println(number);
}

public static void main(String[] args) {

    int value = 20;

    addTen(value);

    System.out.println(value);
}
```

Output:

```text
30
20
```

Inside the method:

```text
number = 30
```

Outside:

```text
value = 20
```

---

# 6. Object Arguments ⭐⭐⭐

Consider:

```java
class Student {

    String name;
}
```

Method:

```java
static void changeName(Student student) {

    student.name = "Alex";
}
```

Call:

```java
Student s = new Student();

s.name = "Joe";

changeName(s);

System.out.println(s.name);
```

Output:

```text
Alex
```

This does **not** mean Java passes objects by reference.

The **reference value is copied**.

---

# 7. Reference Value Is Copied ⭐⭐⭐

Before the method call:

```text
s
 │
 └────────────→ Student object
                name = "Joe"
```

After:

```java
changeName(s);
```

conceptually:

```text
s
 │
 └────────────→ Student object
                name = "Joe"
                      ↑
                      │
student ──────────────┘
```

Now:

```text
s
student
```

are different reference variables, but they contain the same reference value.

Therefore both refer to the same object.

---

# 8. Changing Object State

```java
class Student {

    String name;
}

static void changeName(Student student) {

    student.name = "Alex";
}

public static void main(String[] args) {

    Student s = new Student();

    s.name = "Joe";

    changeName(s);

    System.out.println(s.name);
}
```

Output:

```text
Alex
```

The method mutated the object that both references point to.

---

# 9. Changing the Reference Parameter ⭐⭐⭐

This is different:

```java
static void changeReference(Student student) {

    student = new Student();

    student.name = "Alex";
}
```

Caller:

```java
Student s = new Student();

s.name = "Joe";

changeReference(s);

System.out.println(s.name);
```

Output:

```text
Joe
```

Why?

The parameter `student` contains a **copy** of the reference value.

When we write:

```java
student = new Student();
```

only the local parameter is changed.

The caller's `s` remains unchanged.

---

# 10. Mutation vs Reassignment ⭐⭐⭐

This distinction is extremely important.

### Mutation

```java
student.name = "Alex";
```

Changes the state of the object.

### Reassignment

```java
student = new Student();
```

Changes what the local parameter refers to.

Remember:

```text
Object mutation
→ caller can observe it

Parameter reassignment
→ caller cannot observe the reassignment
```

---

# 11. Complete Example

```java
class Student {

    String name;
}

static void test(Student student) {

    student.name = "Alex";

    student = new Student();

    student.name = "John";
}

public static void main(String[] args) {

    Student s = new Student();

    s.name = "Joe";

    test(s);

    System.out.println(s.name);
}
```

Output:

```text
Alex
```

Flow:

```text
Initially:

s → Object A
    name = "Joe"
```

Inside the method:

```text
student → Object A
```

After:

```java
student.name = "Alex";
```

Object A becomes:

```text
name = "Alex"
```

Then:

```java
student = new Student();
```

Now:

```text
s       → Object A
student → Object B
```

Then:

```java
student.name = "John";
```

changes Object B only.

Therefore:

```text
s.name = "Alex"
```

---

# 12. Arrays Are Objects ⭐⭐⭐

Arrays are objects in Java.

```java
static void change(int[] arr) {

    arr[0] = 100;
}
```

Caller:

```java
int[] numbers = {10, 20, 30};

change(numbers);

System.out.println(numbers[0]);
```

Output:

```text
100
```

The reference value of the array was copied, and both references point to the same array.

---

# 13. Array Reference Reassignment

```java
static void change(int[] arr) {

    arr = new int[]{100, 200, 300};
}
```

Caller:

```java
int[] numbers = {10, 20, 30};

change(numbers);

System.out.println(numbers[0]);
```

Output:

```text
10
```

The parameter was reassigned to another array.

The caller's reference was not changed.

---

# 14. Strings ⭐⭐⭐

Strings are objects, but they are **immutable**.

```java
static void change(String text) {

    text = "Alex";
}

public static void main(String[] args) {

    String name = "Joe";

    change(name);

    System.out.println(name);
}
```

Output:

```text
Joe
```

The parameter is only a copy of the String reference value.

Reassigning it does not change the caller's reference.

---

# 15. String Immutability

```java
String name = "Joe";
```

If we do:

```java
name = name.toUpperCase();
```

a new String object is produced and `name` is made to refer to it.

The original String object is not modified.

---

# 16. Wrapper Classes

Wrapper classes are objects:

```text
Integer
Double
Long
Boolean
Character
```

They are immutable.

Example:

```java
static void change(Integer number) {

    number = 100;
}

public static void main(String[] args) {

    Integer value = 10;

    change(value);

    System.out.println(value);
}
```

Output:

```text
10
```

---

# 17. Mutable vs Immutable Objects

### Mutable

An object's internal state can be changed.

Examples:

```text
ArrayList
HashMap
StringBuilder
arrays
many custom classes
```

### Immutable

The object's state cannot be changed after creation.

Examples:

```text
String
Integer
Long
Double
Boolean
```

---

# 18. Mutable Object Example

```java
class Counter {

    int value;
}

static void increment(Counter counter) {

    counter.value++;
}
```

Usage:

```java
Counter c = new Counter();

c.value = 10;

increment(c);

System.out.println(c.value);
```

Output:

```text
11
```

The shared object was mutated.

---

# 19. StringBuilder Example

`StringBuilder` is mutable.

```java
static void change(StringBuilder builder) {

    builder.append(" Java");
}

public static void main(String[] args) {

    StringBuilder text = new StringBuilder("Hello");

    change(text);

    System.out.println(text);
}
```

Output:

```text
Hello Java
```

The method mutated the same object.

---

# 20. Reassigning StringBuilder

```java
static void change(StringBuilder builder) {

    builder = new StringBuilder("Java");
}
```

Caller:

```java
StringBuilder text = new StringBuilder("Hello");

change(text);

System.out.println(text);
```

Output:

```text
Hello
```

Again:

```text
mutation → visible
reassignment → not visible
```

---

# 21. Does Java Pass Objects by Reference?

Interview question:

> Does Java pass objects by reference?

Correct answer:

> **No. Java is strictly pass-by-value. When an object is passed to a method, the value of its reference is copied. Both the caller's reference and the parameter can therefore refer to the same object. Mutating that object can be visible to the caller, but reassigning the parameter does not reassign the caller's reference.**

---

# 22. Why People Say "Objects Are Passed by Reference"

Because this works:

```java
static void update(Student student) {

    student.name = "Alex";
}
```

The caller sees the changed state.

The technically correct explanation is:

```text
reference value passed by value
```

not:

```text
object passed by reference
```

---

# 23. Swap Two Primitive Variables

```java
static void swap(int a, int b) {

    int temp = a;

    a = b;

    b = temp;
}
```

Caller:

```java
int x = 10;
int y = 20;

swap(x, y);

System.out.println(x);
System.out.println(y);
```

Output:

```text
10
20
```

Only the parameter copies are swapped.

---

# 24. Swapping Using an Object

We can mutate an object's fields:

```java
class Pair {

    int first;
    int second;
}

static void swap(Pair pair) {

    int temp = pair.first;

    pair.first = pair.second;

    pair.second = temp;
}
```

Usage:

```java
Pair pair = new Pair();

pair.first = 10;
pair.second = 20;

swap(pair);

System.out.println(pair.first);
System.out.println(pair.second);
```

Output:

```text
20
10
```

Java is still pass-by-value.

The method changed the shared object's state.

---

# 25. Returning a New Object

A method can return a reference value:

```java
static Student createStudent() {

    Student student = new Student();

    student.name = "Joe";

    return student;
}
```

Caller:

```java
Student s = createStudent();
```

The returned reference value is assigned to `s`.

---

# 26. Pass-by-Value and Return Values

Parameter passing:

```text
caller argument
      ↓
value copied
      ↓
method parameter
```

Return:

```text
method result
      ↓
returned value
      ↓
caller variable
```

---

# 27. Primitive vs Reference Argument

| Argument | What is copied? | Can parameter reassignment change caller variable? |
|---|---|---|
| `int` | Primitive value | No |
| `double` | Primitive value | No |
| `boolean` | Primitive value | No |
| `char` | Primitive value | No |
| Object | Reference value | No |
| Array | Reference value | No |
| String | Reference value | No |

For objects and arrays, however, the method can mutate the referenced object when it is mutable.

---

# 28. Important Mental Model ⭐⭐⭐

When an object is passed:

```text
Object variable
      ↓
contains a reference value
      ↓
reference value is copied
      ↓
method parameter
```

The object itself is not automatically copied.

There is no automatic deep copy.

---

# 29. Two References Can Point to One Object

```java
Student s1 = new Student();

s1.name = "Joe";

Student s2 = s1;
```

Conceptually:

```text
s1 ─────┐
        ↓
     Student
     name = "Joe"
        ↑
        └───── s2
```

Then:

```java
s2.name = "Alex";
```

means:

```java
s1.name
```

is also:

```text
Alex
```

because both references point to the same object.

---

# 30. Method Parameter Works Similarly

```java
Student s1 = new Student();

s1.name = "Joe";

change(s1);
```

Inside:

```java
static void change(Student s2) {
}
```

Conceptually:

```text
s1 ─────┐
        ↓
     Student
        ↑
        └───── s2
```

`s2` contains a copied reference value.

---

# 31. `null` and Pass-by-Value

```java
static void change(Student student) {

    student = new Student();
}

public static void main(String[] args) {

    Student s = null;

    change(s);

    System.out.println(s);
}
```

Output:

```text
null
```

Flow:

```text
s = null
 ↓
null value copied into student
 ↓
student = new Student()
 ↓
only student changes
 ↓
s remains null
```

---

# 32. Passing `null` and Accessing Members

```java
static void display(Student student) {

    System.out.println(student.name);
}
```

Calling:

```java
display(null);
```

causes:

```text
NullPointerException
```

because `student` does not refer to an object.

---

# 33. Collections and Pass-by-Value

Collections are objects.

```java
static void addNumber(ArrayList<Integer> list) {

    list.add(100);
}
```

Caller:

```java
ArrayList<Integer> numbers = new ArrayList<>();

numbers.add(10);

addNumber(numbers);

System.out.println(numbers);
```

Output:

```text
[10, 100]
```

The reference value was copied, and both references point to the same list.

---

# 34. Reassigning a Collection Parameter

```java
static void replaceList(ArrayList<Integer> list) {

    list = new ArrayList<>();

    list.add(100);
}
```

Caller:

```java
ArrayList<Integer> numbers = new ArrayList<>();

numbers.add(10);

replaceList(numbers);

System.out.println(numbers);
```

Output:

```text
[10]
```

The parameter was reassigned; the caller still refers to the original list.

---

# 35. `final` Reference ⭐⭐⭐

```java
static void change(final Student student) {

    student.name = "Alex";
}
```

This is valid if `Student` is mutable.

But:

```java
student = new Student();
```

is not allowed.

Why?

```text
final reference
→ cannot be reassigned
```

But:

```text
final reference
≠ immutable object
```

---

# 36. Example of `final` Reference

```java
class Student {

    String name;
}

static void change(final Student student) {

    student.name = "Alex"; // Valid

    // student = new Student(); // Error
}
```

The reference cannot be changed, but the object's state can still be changed.

---

# 37. Pass-by-Value and DSA

This concept is very important in DSA.

Array:

```java
static void modifyArray(int[] arr) {

    arr[0] = 999;
}
```

Linked list:

```java
class Node {

    int data;
    Node next;
}

static void modify(Node node) {

    node.data = 100;
}
```

In both cases, the reference value is passed by value.

The method can mutate the object reached through that reference.

---

# 38. Why Can't We Swap References?

```java
static void swap(Student a, Student b) {

    Student temp = a;

    a = b;

    b = temp;
}
```

The caller's references do not change.

Why?

```text
a and b
→ local parameter variables

Their values are copies of caller reference values.
```

Swapping those copies does not swap the caller's variables.

---

# 39. Returning a Reference to Replace Caller State

A method can return a new reference:

```java
static Student replace(Student student) {

    return new Student();
}
```

Caller:

```java
student = replace(student);
```

The caller explicitly assigns the returned value.

---

# 40. Most Important Interview Example ⭐⭐⭐

```java
class Test {

    int value = 10;

    static void change(Test obj) {

        obj.value = 20;

        obj = new Test();

        obj.value = 30;
    }

    public static void main(String[] args) {

        Test t = new Test();

        change(t);

        System.out.println(t.value);
    }
}
```

Output:

```text
20
```

Explanation:

```text
Initially:

t → Object A
    value = 10
```

Inside:

```text
obj → Object A
```

Then:

```java
obj.value = 20;
```

Object A becomes:

```text
value = 20
```

Then:

```java
obj = new Test();
```

Now:

```text
t   → Object A
obj → Object B
```

Then:

```java
obj.value = 30;
```

changes Object B.

Therefore:

```text
t.value = 20
```

---

# 41. Common Misconceptions ⭐⭐⭐

### Wrong

> Java passes primitives by value and objects by reference.

### Correct

> Java passes everything by value. For objects, the value being passed is a reference.

---

### Wrong

> If an object changes inside a method, Java must use pass-by-reference.

### Correct

> The copied reference points to the same object, so mutation of that object is visible through the caller's reference.

---

# 42. Golden Rule 🧠

Always think:

```text
JAVA METHOD CALL
       ↓
argument value is copied
       ↓
parameter receives the copy
```

Primitive:

```text
10
 ↓
copy of 10
```

Object:

```text
reference value
 ↓
copy of reference value
 ↓
same object
```

---

# 43. Placement-Level Answer ⭐⭐⭐

If the interviewer asks:

> **"Is Java pass-by-value or pass-by-reference?"**

Answer:

> **"Java is always pass-by-value. For primitive arguments, the primitive value is copied into the parameter. For object arguments, the value of the reference is copied. Therefore, the parameter and caller reference can point to the same object, so object-state mutations can be visible to the caller, but reassigning the parameter itself does not change the caller's reference."**

---

# 44. Interview Questions ⭐⭐⭐

### Q1. Is Java pass-by-value or pass-by-reference?

Java is always pass-by-value.

### Q2. What happens when a primitive is passed?

Its value is copied into the parameter.

### Q3. What happens when an object is passed?

The value of the object's reference is copied.

### Q4. Can a method modify an object's fields?

Yes, if the object is mutable.

### Q5. Can a method reassign the caller's object reference?

No.

### Q6. Why can an object's state change if Java is pass-by-value?

Because the copied reference still points to the same object.

### Q7. Are arrays passed by reference?

Technically no. Arrays are objects, so their reference value is passed by value.

### Q8. Are Strings passed by reference?

No. Their reference value is passed by value, and String objects are immutable.

### Q9. Can we swap two primitive variables by simply passing them to a method?

No.

### Q10. Can we swap caller reference variables by simply reassigning reference parameters?

No.

### Q11. What is the difference between mutation and reassignment?

Mutation changes an object's state. Reassignment changes what a reference variable points to.

### Q12. Does `final` make an object immutable?

No. `final` prevents reassignment of the reference; it does not automatically make the referenced object immutable.

---

# 45. Practice Problems

## Beginner

### Problem 1

Predict the output:

```java
static void change(int x) {
    x = 100;
}

public static void main(String[] args) {

    int x = 10;

    change(x);

    System.out.println(x);
}
```

### Problem 2

Create a `Student` class and write a method that changes the student's name. Explain why the caller sees the change.

### Problem 3

Write a method that reassigns a `Student` parameter to a new object. Explain why the caller's reference remains unchanged.

---

## Intermediate

### Problem 4

Write a method that modifies an integer array. Explain why the caller sees the change.

### Problem 5

Write a method that replaces an array parameter with a new array. Explain why the caller still has the original array.

### Problem 6

Write a method that modifies a `StringBuilder`.

### Problem 7

Write a method that reassigns a `StringBuilder` parameter and explain the output.

---

## Placement Practice ⭐

### Problem 8

Predict the output:

```java
class Test {

    int value = 10;

    static void change(Test obj) {

        obj.value = 20;

        obj = new Test();

        obj.value = 30;
    }

    public static void main(String[] args) {

        Test t = new Test();

        change(t);

        System.out.println(t.value);
    }
}
```

### Problem 9

Explain technically why Java does not support true pass-by-reference.

### Problem 10

Write one program demonstrating all three:

```text
1. primitive value change
2. object state mutation
3. object reference reassignment
```

---

# 46. Quick Revision ⭐⭐⭐

```text
Java
 ↓
ALWAYS PASS-BY-VALUE
```

Primitive:

```text
value copied
```

Object:

```text
reference value copied
```

Therefore:

```text
primitive reassignment
→ caller unchanged

object state mutation
→ caller can observe change

object reference reassignment
→ caller unchanged
```

Golden rule:

> **Java passes the value of the reference, not the reference variable itself and not a copy of the object.**

---

# 47. Key Takeaways

- Java is always pass-by-value.
- Primitive values are copied into parameters.
- Object reference values are copied into parameters.
- The object itself is not automatically copied.
- Two references can point to the same object.
- Mutating a shared mutable object can be visible to the caller.
- Reassigning a parameter does not change the caller's reference.
- Arrays are objects and follow the same rule.
- Strings are objects but immutable.
- Wrapper classes are objects and generally immutable.
- Collections are objects and can be mutated through a copied reference.
- `final` prevents reassignment of a reference but does not automatically make the object immutable.
- Mutation and reassignment must be clearly distinguished.
- This concept is important in Java interviews, OOP, and DSA.

---

# 48. Module 20 Progress

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
✅ 12_PassByValue.md

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
