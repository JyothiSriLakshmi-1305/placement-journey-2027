# Intermediate MCQs (26–50)

These questions test your understanding of Java control statements through code analysis, concept application, and common interview scenarios.

---

## MCQ 26

What will be the output?

```java
int x = 10;

if(x > 5){
    System.out.println("A");
}
else{
    System.out.println("B");
}
```

A. A

B. B

C. Compilation Error

D. Runtime Error

**Answer:** A

**Explanation:**
Since `10 > 5` is `true`, the `if` block executes.

**Difficulty:** 🟡 Intermediate

---

## MCQ 27

What will be the output?

```java
int x = 10;

if(x > 20){
    System.out.println("A");
}
else if(x > 5){
    System.out.println("B");
}
else{
    System.out.println("C");
}
```

A. A

B. B

C. C

D. Compilation Error

**Answer:** B

**Explanation:**
The first condition is false, the second is true, so `"B"` is printed.

---

## MCQ 28

How many blocks execute in an `if-else-if` ladder?

A. All matching blocks

B. Only the first matching block

C. Two blocks

D. Depends on the compiler

**Answer:** B

---

## MCQ 29

What will be the output?

```java
int n = 2;

switch(n){

    case 1:
        System.out.print("A");

    case 2:
        System.out.print("B");

    case 3:
        System.out.print("C");
}
```

A. A

B. B

C. BC

D. ABC

**Answer:** C

**Explanation:**
Since there are no `break` statements, execution falls through from case 2 to case 3.

---

## MCQ 30

What is the output?

```java
int n = 2;

switch(n){

    case 1:
        System.out.print("A");
        break;

    case 2:
        System.out.print("B");
        break;

    case 3:
        System.out.print("C");
}
```

A. A

B. B

C. BC

D. ABC

**Answer:** B

---

## MCQ 31

Which statement is best for checking age groups like:

- 0–12
- 13–19
- 20–59
- 60+

A. switch

B. if

C. if-else-if

D. Ternary

**Answer:** C

**Explanation:**
Age groups involve ranges, which are best handled using `if-else-if`.

---

## MCQ 32

Which data type is **NOT** supported by `switch`?

A. char

B. String

C. int

D. double

**Answer:** D

---

## MCQ 33

What will be the output?

```java
boolean flag = true;

if(flag){
    System.out.println("YES");
}
```

A. YES

B. NO

C. Compilation Error

D. Runtime Error

**Answer:** A

---

## MCQ 34

Which statement is cleaner for menu-driven applications?

A. Nested if

B. if-else-if

C. switch

D. while

**Answer:** C

---

## MCQ 35

Which operator combines multiple conditions?

A. +

B. &&

C. %

D. ::

**Answer:** B

---

## MCQ 36

Which statement is preferred for simple value assignment?

A. if

B. switch

C. Ternary

D. while

**Answer:** C

---

## MCQ 37

What is the output?

```java
int marks = 85;

String grade = (marks >= 35) ? "Pass" : "Fail";

System.out.println(grade);
```

A. Pass

B. Fail

C. Compilation Error

D. Runtime Error

**Answer:** A

---

## MCQ 38

Which keyword is optional in a traditional switch?

A. switch

B. case

C. default

D. expression

**Answer:** C

---

## MCQ 39

Which Java feature eliminates accidental fall-through?

A. if

B. Enhanced switch (`->`)

C. Ternary

D. break

**Answer:** B

---

## MCQ 40

What will be the output?

```java
int x = 5;

if(x > 0)
    if(x > 10)
        System.out.println("A");
    else
        System.out.println("B");
```

A. A

B. B

C. Nothing

D. Compilation Error

**Answer:** B

**Explanation:**
The `else` is associated with the nearest unmatched `if` (known as the **dangling else** rule).

---

## MCQ 41

Which statement improves readability when checking one variable against many fixed values?

A. if

B. if-else-if

C. switch

D. Nested if

**Answer:** C

---

## MCQ 42

Which of the following can return a value?

A. Traditional switch

B. Enhanced switch expression

C. if

D. while

**Answer:** B

---

## MCQ 43

What is the purpose of `yield`?

A. Exit the program

B. Return a value from an enhanced switch block

C. Stop a loop

D. Skip execution

**Answer:** B

---

## MCQ 44

Which statement should be avoided because it reduces readability?

A. Simple if

B. Deeply nested if statements

C. switch

D. Ternary for simple assignments

**Answer:** B

---

## MCQ 45

What will be the output?

```java
int x = 20;

System.out.println(x > 10 ? "High" : "Low");
```

A. High

B. Low

C. Compilation Error

D. Runtime Error

**Answer:** A

---

## MCQ 46

Which is considered a Java coding best practice?

A. Omit braces everywhere

B. Write long nested ternary operators

C. Use braces consistently

D. Avoid indentation

**Answer:** C

---

## MCQ 47

Which statement is best for validating username and password?

A. switch

B. if

C. for

D. do-while

**Answer:** B

---

## MCQ 48

Which statement is used in modern Java projects for cleaner multiple-choice selection?

A. if

B. Traditional switch

C. Enhanced switch

D. goto

**Answer:** C

---

## MCQ 49

Which of the following is true?

A. switch can evaluate ranges.

B. if-else-if can evaluate ranges.

C. switch supports float.

D. Ternary is a loop.

**Answer:** B

---

## MCQ 50

Which control statement would you choose for selecting a day of the week from numbers 1–7?

A. if

B. if-else-if

C. switch

D. Nested if

**Answer:** C

**Explanation:**
The values are fixed constants, making `switch` the most readable and maintainable choice.

---

# Score Interpretation (Intermediate Level)

| Score | Level |
|--------|-------|
| 22–25 | Excellent ✅ |
| 18–21 | Good 👍 |
| 14–17 | Average 📘 |
| Below 14 | Revise switch, ternary, and nested if 📚 |

---

# Next Section

➡ **Advanced MCQs (51–75)**

Topics include:

- Output prediction
- Compiler behavior
- Enhanced switch internals
- Best practices
- Real interview scenarios
- Tricky control-flow questions