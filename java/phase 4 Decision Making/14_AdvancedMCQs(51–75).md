# Advanced MCQs (51–75)

These questions assess a deeper understanding of Java control statements, compiler behavior, modern Java features, and coding best practices.

---

## MCQ 51

What will be the output?

```java
int x = 10;

if(x > 5)
    if(x < 20)
        System.out.print("A");
    else
        System.out.print("B");
```

A. A

B. B

C. Compilation Error

D. No Output

**Answer:** A

**Explanation:**
Both conditions are true, so `"A"` is printed.

**Difficulty:** 🟠 Advanced

---

## MCQ 52

Which statement correctly describes the "dangling else" problem?

A. else always matches the nearest unmatched if.

B. else matches the first if.

C. Java doesn't allow nested if statements.

D. It causes a compilation error.

**Answer:** A

---

## MCQ 53

Which of the following is **NOT** a valid switch expression type?

A. int

B. String

C. enum

D. boolean

**Answer:** D

---

## MCQ 54

What will be the output?

```java
int x = 5;

switch(x){

    default:
        System.out.print("D");

    case 5:
        System.out.print("A");

    case 6:
        System.out.print("B");
}
```

A. DAB

B. AB

C. A

D. BA

**Answer:** B

**Explanation:**
Execution starts at `case 5` because it matches. The `default` block is skipped because it is not the entry point. Without `break`, execution falls through to `case 6`, producing `AB`.

---

## MCQ 55

Which statement is preferred for checking salary ranges?

A. switch

B. if-else-if

C. Enhanced switch

D. Ternary

**Answer:** B

---

## MCQ 56

What happens if no `case` matches and there is no `default`?

A. Compilation Error

B. Runtime Exception

C. Switch exits without executing any case

D. Infinite Loop

**Answer:** C

---

## MCQ 57

Which feature makes enhanced switch safer?

A. Automatic break

B. Automatic loops

C. Automatic variable declaration

D. Automatic casting

**Answer:** A

---

## MCQ 58

Which statement is true about enhanced switch?

A. It requires `break`.

B. It supports `->` syntax.

C. It only supports integers.

D. It cannot return values.

**Answer:** B

---

## MCQ 59

Which keyword returns a value from a block in an enhanced switch expression?

A. break

B. continue

C. yield

D. return

**Answer:** C

---

## MCQ 60

What will be the output?

```java
int x = 20;

String result = switch(x){

    case 10 -> "Ten";

    case 20 -> "Twenty";

    default -> "Other";

};

System.out.println(result);
```

A. Ten

B. Twenty

C. Other

D. Compilation Error

**Answer:** B

---

## MCQ 61

Which is considered the cleanest code?

A. Deeply nested if statements

B. Meaningful conditions with proper indentation

C. Multiple duplicated conditions

D. Long nested ternary expressions

**Answer:** B

---

## MCQ 62

Which operator is most suitable for combining conditions?

A. +

B. %

C. &&

D. ::

**Answer:** C

---

## MCQ 63

Which control statement is generally used in enterprise applications for role-based access?

A. switch

B. Nested if or well-structured if statements

C. while

D. do-while

**Answer:** B

---

## MCQ 64

Which statement improves maintainability?

A. Using braces consistently

B. Removing indentation

C. Deep nesting

D. Omitting `default`

**Answer:** A

---

## MCQ 65

What is the output?

```java
int x = 15;

System.out.println(x > 10 ? x > 20 ? "A" : "B" : "C");
```

A. A

B. B

C. C

D. Compilation Error

**Answer:** B

**Explanation:**
The outer condition is true (`15 > 10`), so the inner ternary is evaluated. `15 > 20` is false, so `"B"` is printed.

---

## MCQ 66

Which statement should be avoided because it hurts readability?

A. Simple if

B. Enhanced switch

C. Excessively nested ternary operators

D. switch

**Answer:** C

---

## MCQ 67

Which of the following is true?

A. `switch` supports relational operators.

B. `switch` evaluates ranges directly.

C. `if-else-if` can use logical operators.

D. `switch` supports floating-point values.

**Answer:** C

---

## MCQ 68

Which Java version introduced `String` support in `switch`?

A. Java 5

B. Java 6

C. Java 7

D. Java 8

**Answer:** C

---

## MCQ 69

Enhanced switch expressions became a standard feature in:

A. Java 11

B. Java 12

C. Java 14

D. Java 17

**Answer:** C

---

## MCQ 70

Which statement is the best choice for mapping HTTP status codes (e.g., 200, 404, 500) to messages?

A. if

B. if-else-if

C. switch

D. do-while

**Answer:** C

---

## MCQ 71

Which control statement is the most appropriate for validating a user's age and citizenship together?

A. switch

B. if with logical operators (`&&`)

C. break

D. continue

**Answer:** B

---

## MCQ 72

Which is the best practice when writing conditions?

A. Make them as complex as possible.

B. Use meaningful variable names and simple expressions.

C. Avoid parentheses completely.

D. Duplicate logic.

**Answer:** B

---

## MCQ 73

What is the main advantage of using enhanced switch over traditional switch?

A. It supports loops.

B. It avoids accidental fall-through and can return values.

C. It supports floating-point numbers.

D. It runs in a separate thread.

**Answer:** B

---

## MCQ 74

Which statement is true?

A. `default` is mandatory.

B. `break` is mandatory in enhanced switch using `->`.

C. Enhanced switch can be used as an expression.

D. `yield` is used in traditional switch.

**Answer:** C

---

## MCQ 75

Which principle should guide your choice of a control statement?

A. Always use the shortest syntax.

B. Always use `switch`.

C. Choose the construct that best fits the problem and keeps the code readable.

D. Replace every `if-else` with a ternary operator.

**Answer:** C

---

# Score Interpretation (Advanced Level)

| Score | Level |
|--------|-------|
| 22–25 | Placement Ready 🌟 |
| 18–21 | Strong Understanding 👍 |
| 14–17 | Good, but revise advanced concepts 📘 |
| Below 14 | Revisit enhanced switch and best practices 📚 |

---

# Next Section

➡ **Tricky & Interview MCQs (76–100)**

Topics include:

- Compiler behavior
- Edge cases
- Code output prediction
- Common interview traps
- Java best practices
- Frequently asked placement questions