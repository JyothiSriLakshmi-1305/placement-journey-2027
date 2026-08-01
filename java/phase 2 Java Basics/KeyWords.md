# Java Keywords

## What are Keywords?

Java keywords are **reserved words** that have predefined meanings in the Java language. They cannot be used as identifiers such as variable names, method names, or class names.

Example:

```java
int age = 20;      // Valid
int class = 20;    // Invalid (class is a keyword)
```

---

# Types of Java Keywords

Java has **67 keywords** (including reserved words and literals in modern Java versions).

---

## 1. Access Modifiers

| Keyword | Description |
|----------|-------------|
| public | Accessible from anywhere |
| private | Accessible only within the same class |
| protected | Accessible within package and subclasses |

Example:

```java
public class Student{
    private int age;
}
```

---

## 2. Class & Object Keywords

| Keyword | Description |
|----------|-------------|
| class | Declares a class |
| interface | Declares an interface |
| enum | Defines enumeration |
| extends | Inherits another class |
| implements | Implements an interface |
| new | Creates an object |
| this | Refers to current object |
| super | Refers to parent class |

Example:

```java
class Animal {}

class Dog extends Animal {

}
```

---

## 3. Data Type Keywords

| Keyword | Description |
|----------|-------------|
| byte | 8-bit integer |
| short | 16-bit integer |
| int | 32-bit integer |
| long | 64-bit integer |
| float | Decimal (32-bit) |
| double | Decimal (64-bit) |
| char | Single character |
| boolean | true/false |
| void | No return value |

Example

```java
int age = 20;
double salary = 45000.75;
```

---

## 4. Decision Making Keywords

| Keyword | Description |
|----------|-------------|
| if | Executes conditionally |
| else | Alternative block |
| switch | Multiple choices |
| case | One option inside switch |
| default | Default block |

Example

```java
if(age >= 18){
    System.out.println("Eligible");
}
```

---

## 5. Loop Keywords

| Keyword | Description |
|----------|-------------|
| for | Loop with counter |
| while | Loop while condition is true |
| do | Executes at least once |

Example

```java
for(int i=1;i<=5;i++){
    System.out.println(i);
}
```

---

## 6. Jump Statements

| Keyword | Description |
|----------|-------------|
| break | Exit loop/switch |
| continue | Skip current iteration |
| return | Exit method |

Example

```java
return sum;
```

---

## 7. Exception Handling

| Keyword | Description |
|----------|-------------|
| try | Start exception block |
| catch | Handle exception |
| finally | Always executes |
| throw | Throw exception |
| throws | Declare exception |

Example

```java
try{

}
catch(Exception e){

}
finally{

}
```

---

## 8. Object-Oriented Programming

| Keyword | Description |
|----------|-------------|
| abstract | Abstract class/method |
| final | Constant / Cannot override |
| static | Belongs to class |
| synchronized | Thread synchronization |
| native | Native method |
| transient | Skip serialization |
| volatile | Variable shared between threads |
| strictfp | Floating-point consistency |

Example

```java
final double PI = 3.14;
```

---

## 9. Package Keywords

| Keyword | Description |
|----------|-------------|
| package | Defines package |
| import | Imports package |

Example

```java
import java.util.Scanner;
```

---

## 10. Reserved Literals

| Keyword | Description |
|----------|-------------|
| true | Boolean true |
| false | Boolean false |
| null | Null reference |

Example

```java
String name = null;
```

---

# Rarely Used Keywords

These are less commonly used but important for interviews.

- assert
- const (reserved)
- goto (reserved)
- native
- strictfp
- transient
- volatile
- synchronized

---

# Frequently Asked Interview Questions

### Q1. Can we use a keyword as a variable name?

No.

```java
int class = 10; // Error
```

---

### Q2. Difference between `this` and `super`

| this | super |
|------|-------|
| Refers to current object | Refers to parent class |
| Calls current constructor | Calls parent constructor |

---

### Q3. Difference between `throw` and `throws`

| throw | throws |
|---------|---------|
| Actually throws an exception | Declares possible exceptions |

---

### Q4. Difference between `final`, `finally`, and `finalize`

| Keyword | Purpose |
|----------|---------|
| final | Prevent modification |
| finally | Executes after try/catch |
| finalize() | Garbage collection method (deprecated) |

---

# Placement Tips

Focus on these keywords first:

- public
- private
- protected
- class
- static
- final
- this
- super
- new
- return
- if
- else
- switch
- for
- while
- break
- continue
- try
- catch
- throw
- throws
- package
- import

These keywords are asked frequently in Java interviews and coding assessments.

---

# Revision Checklist

- [ ] Access Modifiers
- [ ] Data Types
- [ ] OOP Keywords
- [ ] Loops
- [ ] Decision Statements
- [ ] Exception Handling
- [ ] Packages
- [ ] Reserved Literals
- [ ] Frequently Asked Interview Questions

---

## References

- https://www.geeksforgeeks.org/java/java-keywords/
- Oracle Java Documentation
