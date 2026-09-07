# Zocato Test — Complete Revision & Interview Review

## 1. Test Pattern We Reconstructed

The test covered three major areas:

```text
Java MCQs       → 10 questions
DBMS            → 5 questions
Coding          → 1 problem
```

### Java topics remembered

* `extends`
* `implements`
* Classes and OOP
* Queue
* LinkedList
* HashMap
* Output Streams
* `flush()`
* `available()`
* Output-prediction questions

### DBMS topics remembered

* Transactions
* `COMMIT`
* `ROLLBACK`
* Concurrent transactions
* Non-repeatable read / Lost update type scenarios
* Functional dependencies
* Transitive dependency
* Normalization-related concepts

### Coding

**GPA Calculator**

* `n` persons, where `n >= 2`
* Each person has a name
* Each person has an array of grades
* Each person has an array of credits
* Calculate individual GPA
* Find the person with maximum GPA

---

# 2. JAVA — OOP

## `extends` vs `implements`

### Class extending another class

```java
class Animal {
}

class Dog extends Animal {
}
```

Meaning:

```text
Dog IS-A Animal
```

A class can extend **only one class**.

```java
class C extends A {
}
```

Valid.

```java
class C extends A, B {
}
```

Invalid.

Java does not support multiple class inheritance.

---

## `implements`

A class uses `implements` when it implements an interface.

```java
interface Animal {
    void sound();
}

class Dog implements Animal {

    public void sound() {
        System.out.println("Bark");
    }
}
```

A class can implement multiple interfaces:

```java
class C implements A, B, D {
}
```

This is valid.

---

## Interface extending interface

An interface uses `extends` to inherit another interface.

```java
interface A {
}

interface B extends A {
}
```

Therefore remember:

```text
class     extends     class
class     implements  interface
interface extends     interface
```

### Common MCQ

```java
class C extends A implements B, D {
}
```

This is valid.

Why?

```text
C extends one class → A
C implements multiple interfaces → B, D
```

---

# 3. QUEUE

Queue follows:

```text
FIFO
First In → First Out
```

Example:

```text
10 → 20 → 30
```

Remove:

```text
10
```

because 10 entered first.

### Important methods

```java
add()
offer()
remove()
poll()
peek()
element()
```

### `poll()` vs `remove()`

If the queue is empty:

```text
poll()   → returns null
remove() → throws exception
```

### `peek()` vs `element()`

If the queue is empty:

```text
peek()   → returns null
element() → throws exception
```

These differences are common MCQ traps.

---

# 4. LINKEDLIST

Java:

```java
LinkedList<Integer> list = new LinkedList<>();
```

Important methods:

```java
add()
addFirst()
addLast()
remove()
removeFirst()
removeLast()
get()
getFirst()
getLast()
```

Example:

```java
list.add(10);
list.add(20);
list.add(30);
```

Result:

```text
[10, 20, 30]
```

LinkedList can also work as a:

```text
List
Queue
Deque
```

because it implements the corresponding interfaces.

---

# 5. HASHMAP

Basic structure:

```java
HashMap<Key, Value>
```

Example:

```java
HashMap<Integer, String> map = new HashMap<>();

map.put(1, "A");
map.put(2, "B");
```

Result:

```text
1 → A
2 → B
```

### Important properties

* Keys are unique.
* Values can be duplicated.
* `put()` adds or updates a key.
* `get()` retrieves a value.
* `remove()` removes a mapping.
* `containsKey()` checks a key.
* `containsValue()` checks a value.

### Important MCQ

```java
map.put(1, "A");
map.put(1, "B");
```

The final value for key `1` is:

```text
1 → B
```

The second `put()` replaces the previous value.

---

# 6. JAVA OUTPUT STREAMS

An `OutputStream` is used to **write/send data from a Java program to an output destination**.

The important hierarchy is:

```text
OutputStream
    |
    +-- FileOutputStream
    |
    +-- ByteArrayOutputStream
    |
    +-- BufferedOutputStream
```

`OutputStream` is an abstract class.

---

## `write()`

Used to write data.

Example:

```java
out.write(data);
```

For a byte array:

```java
byte[] data = {10, 20, 30, 40};

out.write(data, 0, 3);
```

Meaning:

```text
data = [10, 20, 30, 40]
        ↑   ↑   ↑
        └── 3 bytes ──┘
```

`0` = starting position

`3` = number of bytes to write

Therefore:

```text
Array length  = 4
Bytes written = 3
```

Do not confuse these.

---

# 7. `flush()`

`flush()` is used with output streams.

Its purpose is to ensure that buffered output is pushed to the destination.

Example:

```java
System.out.print("Hello");
System.out.flush();
```

Important:

```text
write() → writes data
flush() → pushes buffered output
close() → closes the stream
```

`flush()` does **not** add a newline.

So:

```java
System.out.print("A");
System.out.flush();
System.out.print("B");
```

Output:

```text
AB
```

---

# 8. `available()`

This was another byte-related concept worth remembering.

For an `InputStream`:

```java
available()
```

returns the number of bytes that can currently be read without blocking.

Example:

```java
byte[] data = {10, 20, 30, 40};

ByteArrayInputStream in =
        new ByteArrayInputStream(data);

System.out.println(in.available());
```

Output:

```text
4
```

After reading three bytes:

```text
available() = 1
```

### Don't confuse:

```text
array.length → total array size

write(..., n) → number of bytes written

available() → bytes currently available to READ

size() → current size of ByteArrayOutputStream
```

---

# 9. OUTPUT-BASED QUESTIONS

For output questions, don't guess.

Use this method:

### Step 1

Read the code from top to bottom.

### Step 2

Write down the value of every variable after each important statement.

### Step 3

For collections, maintain their current contents.

Example:

```java
HashMap<Integer, String> map = new HashMap<>();

map.put(1, "A");
map.put(1, "B");

System.out.println(map.get(1));
```

Trace:

```text
put(1,"A") → {1=A}
put(1,"B") → {1=B}
get(1)     → B
```

Output:

```text
B
```

---

# 10. DBMS — TRANSACTIONS

A transaction is a sequence of database operations treated as one logical unit.

Example:

```text
T1:
READ X
UPDATE X
COMMIT
```

Important transaction commands:

```text
COMMIT
ROLLBACK
```

---

## COMMIT

`COMMIT` makes the transaction's changes permanent.

Example:

```text
T2 updates X
T2 COMMIT
```

The change becomes permanent.

---

## ROLLBACK

`ROLLBACK` undoes changes that have not been committed.

Example:

```text
T1 updates X
T1 ROLLBACK
```

The uncommitted change is undone.

---

# 11. Non-Repeatable Read

This is the type of transaction scenario you remembered.

Suppose:

```text
Initial X = 100
```

T1 reads:

```text
T1 → READ X → 100
```

Then T2 changes X:

```text
T2 → UPDATE X → 200
T2 → COMMIT
```

Now T1 reads X again:

```text
T1 → READ X → 200
```

T1 read the same row twice but got different values.

This is:

```text
NON-REPEATABLE READ
```

### Remember

```text
Same transaction
Same row
Different values
        ↓
Non-repeatable read
```

---

# 12. Lost Update

A lost update is different.

Typical pattern:

```text
T1 reads X = 100
T2 reads X = 100

T1 updates X = 150
T2 updates X = 120

T2's update overwrites T1's update
```

T1's update is effectively lost.

That is:

```text
LOST UPDATE
```

Don't confuse it with non-repeatable read.

---

# 13. Functional Dependency

This was another DBMS question from your test.

If:

```text
A → B
```

it means:

> A functionally determines B.

Knowing A uniquely determines B.

Example:

```text
StudentID → StudentName
```

A student ID determines the student's name.

---

# 14. Transitive Dependency

The question you remembered was:

```text
A → B
B → C
```

Therefore:

```text
A → C
```

This is a **transitive dependency**.

Think:

```text
A
↓
B
↓
C
```

Therefore C depends on A **through B**.

For example:

```text
StudentID → DepartmentID
DepartmentID → DepartmentName
```

Therefore:

```text
StudentID → DepartmentName
```

through `DepartmentID`.

---

# 15. CODING — GPA CALCULATOR

## Problem

There are `n` persons, where:

```text
n >= 2
```

Each person has:

```text
name
grades[]
credits[]
```

Calculate each person's GPA using:

$$
GPA =
\frac{\sum(grade_i \times credit_i)}
{\sum credit_i}
$$

Then find the person with the maximum GPA.

---

# 16. Data Structure

Because each person has multiple grades and credits, we need two-dimensional arrays:

```java
String[] names = new String[n];

double[][] grades = new double[n][];
double[][] credits = new double[n][];

double[] gpas = new double[n];
```

Example:

```text
Person A
grades  = [8, 9, 10]
credits = [3, 4, 3]

Person B
grades  = [9, 8, 9]
credits = [4, 3, 3]
```

---

# 17. GPA Calculation

For one person:

```java
static double calculateGPA(double[] grades, double[] credits) {

    double sumGradeCredits = 0;
    double sumCredits = 0;

    for(int i=0;i<grades.length;i++) {
        sumGradeCredits += grades[i] * credits[i];
        sumCredits += credits[i];
    }

    return sumGradeCredits / sumCredits;
}
```

Example:

```text
Grades  = [8, 9, 10]
Credits = [3, 4, 3]

sumGradeCredits
= 8×3 + 9×4 + 10×3
= 88

sumCredits
= 3 + 4 + 3
= 10

GPA = 88 / 10
    = 8.80
```

---

# 18. Find Maximum GPA

After calculating every person's GPA:

```text
gpas = [8.80, 8.70, 9.30]
```

Use:

```java
int maxIndex = 0;

for(int i=1;i<n;i++) {
    if(gpas[i] > gpas[maxIndex]) {
        maxIndex = i;
    }
}
```

Finally:

```java
names[maxIndex]
```

gives the person with the highest GPA.

And:

```java
gpas[maxIndex]
```

gives their GPA.

Because `n >= 2`, we can safely compare candidates.

---

# 19. Complete Coding Flow

Remember this:

```text
N persons
      ↓
names[]
      ↓
grades[][]
credits[][]
      ↓
For each person
      ↓
calculateGPA()
      ↓
gpas[]
      ↓
Find maxIndex
      ↓
names[maxIndex]
      ↓
Maximum GPA person
```

---

# 20. Interview Explanation for GPA Problem

If the interviewer asks you to explain your approach:

> "First, I store all candidate names in a one-dimensional array. Since each candidate can have multiple subjects, I use two-dimensional arrays for grades and credits. For each candidate, I iterate through their subjects and calculate the weighted GPA using the sum of grade multiplied by credit divided by total credits. I store each candidate's GPA in a separate array. After calculating all GPAs, I iterate through the GPA array and maintain the index of the maximum GPA. Finally, I use that index to print the candidate's name and GPA."

---

# 21. High-Priority Revision List

For your next placement test, revise these first:

### Java

```text
★★★★★ OOP
★★★★★ extends / implements
★★★★★ Arrays
★★★★★ Strings
★★★★★ HashMap
★★★★★ Queue
★★★★☆ LinkedList
★★★★☆ OutputStream
★★★★☆ flush()
★★★★☆ available()
★★★★☆ Output tracing
```

### DBMS

```text
★★★★★ Transactions
★★★★★ COMMIT / ROLLBACK
★★★★★ ACID
★★★★★ Isolation levels
★★★★★ Dirty read
★★★★★ Non-repeatable read
★★★★★ Lost update
★★★★★ Functional dependency
★★★★★ Transitive dependency
★★★★☆ Normalization
★★★★☆ SQL / Joins
```

### Coding

```text
★★★★★ Arrays
★★★★★ Strings
★★★★★ HashMap
★★★★★ Nested arrays
★★★★★ Methods
★★★★★ Maximum / minimum
★★★★★ Frequency counting
★★★★★ Basic searching / sorting
```

---

# 22. Biggest Lesson From This Test

The test shows that placement preparation cannot be only:

```text
"Learn Java programs."
```

You need three abilities:

```text
              PLACEMENT PREPARATION
                       |
          ┌────────────┼────────────┐
          ↓            ↓            ↓
       MCQs        OUTPUT TRACE    CODING
          ↓            ↓            ↓
      Concepts      Dry run       Approach
          |
          └────────────┬────────────
                       ↓
                      DBMS
```

The GPA question also taught an important lesson:

> **Before coding, identify exactly what one array represents and what one loop represents.**

In this problem:

```text
Outer loop  → person
Inner loop  → subjects
```

That distinction is what makes the two-dimensional array approach clear.

---

## Final Cheat Sheet

```text
extends
→ class inherits class
→ interface inherits interface

implements
→ class implements interface

Queue
→ FIFO

LinkedList
→ List + Queue/Deque functionality

HashMap
→ key-value
→ keys unique
→ duplicate key replaces old value

write()
→ writes bytes

flush()
→ pushes buffered output

available()
→ bytes currently available to read

length
→ array length

COMMIT
→ make transaction changes permanent

ROLLBACK
→ undo uncommitted changes

A → B
B → C
therefore A → C
→ transitive dependency

Same transaction reads same row twice
and gets different values
→ non-repeatable read

Two transactions overwrite each other's updates
→ lost update

GPA
→ Σ(grade × credit) / Σcredit

Maximum GPA
→ store GPAs
→ compare using maxIndex
```

**This is the complete review of the topics you remembered from your Zocato test.**
