# 📘 Topic 6 - SQL Command Categories

## 🎯 Objective

Understand how SQL commands are classified, what each category is used for, and the important commands in each category.

---

# 1. Why Do We Have SQL Categories?

SQL contains many commands:

```text
CREATE
INSERT
SELECT
UPDATE
DELETE
ALTER
DROP
GRANT
COMMIT
```

Instead of memorizing them randomly, SQL commands are commonly grouped according to their purpose.

```text
SQL
│
├── DDL
├── DML
├── DQL
├── DCL
└── TCL
```

---

# 2. DDL — Data Definition Language

**DDL = Data Definition Language**

DDL is used to **define or modify the structure of database objects**.

### Think:

> **DDL → Structure**

Common commands:

```text
CREATE
ALTER
DROP
TRUNCATE
```

## CREATE

Creates a database or table.

```sql
CREATE DATABASE company;
```

Later:

```sql
CREATE TABLE employees (...);
```

## ALTER

Changes the structure of an existing object.

```sql
ALTER TABLE employees
ADD email VARCHAR(100);
```

## DROP

Removes a database object.

```sql
DROP TABLE employees;
```

The table structure and its data are removed.

## TRUNCATE

Removes all rows from a table while keeping the table structure.

```sql
TRUNCATE TABLE employees;
```

### Remember:

```text
DDL
│
├── CREATE   → Create structure
├── ALTER    → Change structure
├── DROP     → Remove structure/object
└── TRUNCATE → Remove all rows, keep structure
```

---

# 3. DML — Data Manipulation Language

**DML = Data Manipulation Language**

DML is used to **modify data stored inside tables**.

### Think:

> **DML → Data**

Common commands:

```text
INSERT
UPDATE
DELETE
```

## INSERT

Adds new rows.

```sql
INSERT INTO students
VALUES(101,'Ravi','CSE',8.5);
```

## UPDATE

Changes existing rows.

```sql
UPDATE students
SET cgpa=9.0
WHERE student_id=101;
```

## DELETE

Removes rows.

```sql
DELETE FROM students
WHERE student_id=101;
```

### Remember:

```text
DML
│
├── INSERT → Add data
├── UPDATE → Modify data
└── DELETE  → Remove data
```

---

# 4. DQL — Data Query Language

**DQL = Data Query Language**

DQL is commonly used to **retrieve data**.

The main command is:

```text
SELECT
```

Example:

```sql
SELECT *
FROM students;
```

### Interview Note

Some SQL classifications include `SELECT` under DML, while many educational resources treat it separately as **DQL**.

For our learning plan:

```text
DQL → SELECT
```

---

# 5. DCL — Data Control Language

**DCL = Data Control Language**

DCL deals with **permissions and access control**.

Main commands:

```text
GRANT
REVOKE
```

## GRANT

Gives privileges.

```sql
GRANT SELECT
ON company.employees
TO 'user';
```

## REVOKE

Removes privileges.

```sql
REVOKE SELECT
ON company.employees
FROM 'user';
```

### Remember:

```text
DCL
│
├── GRANT  → Give permission
└── REVOKE → Remove permission
```

---

# 6. TCL — Transaction Control Language

**TCL = Transaction Control Language**

TCL is used to manage **transactions**.

Important commands:

```text
COMMIT
ROLLBACK
SAVEPOINT
```

## COMMIT

Saves transaction changes.

```sql
COMMIT;
```

## ROLLBACK

Undoes changes that have not been committed, subject to transaction and storage-engine behavior.

```sql
ROLLBACK;
```

## SAVEPOINT

Creates a point inside a transaction that can be used for a partial rollback.

```sql
SAVEPOINT sp1;
```

### Remember:

```text
TCL
│
├── COMMIT    → Save transaction
├── ROLLBACK  → Undo transaction changes
└── SAVEPOINT → Create rollback point
```

---

# 7. Complete SQL Classification

| Category | Full Form | Main Purpose | Important Commands |
|---|---|---|---|
| **DDL** | Data Definition Language | Database structure | CREATE, ALTER, DROP, TRUNCATE |
| **DML** | Data Manipulation Language | Modify data | INSERT, UPDATE, DELETE |
| **DQL** | Data Query Language | Retrieve data | SELECT |
| **DCL** | Data Control Language | Permissions | GRANT, REVOKE |
| **TCL** | Transaction Control Language | Transactions | COMMIT, ROLLBACK, SAVEPOINT |

---

# 8. Easy Memory Trick

```text
DDL → Define
DML → Manipulate
DQL → Query
DCL → Control
TCL → Transaction
```

Or:

```text
DDL → Structure
DML → Data
DQL → Retrieve
DCL → Permissions
TCL → Transactions
```

---

# 9. Real-World Example

Imagine our database:

```text
sql_learning
│
└── students
```

### Create a table

```sql
CREATE TABLE students (...);
```

**DDL**

↓

### Add students

```sql
INSERT INTO students VALUES (...);
```

**DML**

↓

### View students

```sql
SELECT * FROM students;
```

**DQL**

↓

### Give another user permission

```sql
GRANT SELECT ON sql_learning.students TO 'user';
```

**DCL**

↓

### Save a transaction

```sql
COMMIT;
```

**TCL**

---

# 10. Important Difference: DROP vs TRUNCATE vs DELETE

This is a very common interview question.

## DROP

```sql
DROP TABLE employees;
```

Removes the table/object itself, including its structure and data.

## TRUNCATE

```sql
TRUNCATE TABLE employees;
```

Removes all rows while keeping the table structure.

## DELETE

```sql
DELETE FROM employees
WHERE employee_id=101;
```

Removes rows from the table. With a `WHERE` condition, selected rows can be deleted.

### Quick comparison

| Command | Main Effect |
|---|---|
| DROP | Removes the table/object |
| TRUNCATE | Removes all rows, keeps table structure |
| DELETE | Removes rows |

We will study their detailed behavior later.

---

# 🎤 Interview Questions

## Q1. What are the main SQL command categories?

> DDL, DML, DQL, DCL, and TCL.

## Q2. What is DDL?

> DDL stands for Data Definition Language and is used to define or modify database structures.

## Q3. Give examples of DDL commands.

> CREATE, ALTER, DROP, and TRUNCATE.

## Q4. What is DML?

> DML stands for Data Manipulation Language and is used to insert, update, and delete data.

## Q5. What is DQL?

> DQL stands for Data Query Language and is commonly used to retrieve data using SELECT.

## Q6. What is DCL?

> DCL stands for Data Control Language and is used to manage database permissions using commands such as GRANT and REVOKE.

## Q7. What is TCL?

> TCL stands for Transaction Control Language and is used to manage transactions using commands such as COMMIT, ROLLBACK, and SAVEPOINT.

## Q8. What is the difference between DELETE and TRUNCATE?

> DELETE removes rows from a table, while TRUNCATE removes all rows but keeps the table structure.

## Q9. What is the difference between DROP and TRUNCATE?

> DROP removes the table/object itself, while TRUNCATE removes the rows and keeps the table structure.

## Q10. Is SELECT DQL or DML?

> It depends on the classification used. Many educational resources classify SELECT as DQL, while some classify it under DML. In our learning plan, we use DQL for SELECT.

---

# ⚠️ Common Mistakes

### CREATE vs INSERT

```text
CREATE → Structure
INSERT → Data
```

### DELETE vs DROP

```text
DELETE → Removes rows
DROP   → Removes the table/object
```

### TRUNCATE

```text
TRUNCATE → Removes all rows, keeps structure
```

### SELECT

```text
SELECT → Retrieves data
```

---

# 💻 Practical Learning Order

We will not run every category randomly.

Our practical sequence will be:

```text
DDL
 ↓
CREATE DATABASE
 ↓
CREATE TABLE
 ↓
ALTER
 ↓
TRUNCATE
 ↓
DROP

DML
 ↓
INSERT
 ↓
UPDATE
 ↓
DELETE

DQL
 ↓
SELECT
 ↓
WHERE
 ↓
ORDER BY
 ↓
GROUP BY
 ↓
JOINS
 ...

DCL
 ↓
GRANT
 ↓
REVOKE

TCL
 ↓
COMMIT
 ↓
ROLLBACK
 ↓
SAVEPOINT
```

This lets us learn each command when its purpose becomes relevant.

---

# 📝 Practice Questions

1. What does DDL stand for?
2. What does DML stand for?
3. What does DQL stand for?
4. What does DCL stand for?
5. What does TCL stand for?
6. Give four DDL commands.
7. Give three DML commands.
8. Which command is commonly used for retrieving data?
9. Which commands manage permissions?
10. Which commands manage transactions?
11. What is the difference between DROP and TRUNCATE?
12. What is the difference between TRUNCATE and DELETE?
13. Why is SELECT commonly classified as DQL?
14. Why is CREATE classified as DDL?

---

# 🏆 Mini Challenge

Classify each command and identify its purpose:

```text
CREATE
INSERT
SELECT
UPDATE
DELETE
ALTER
DROP
TRUNCATE
GRANT
REVOKE
COMMIT
ROLLBACK
SAVEPOINT
```

Try to classify them before checking the table above.

---

# 🎯 Key Takeaways

- SQL commands are commonly grouped into DDL, DML, DQL, DCL, and TCL.
- **DDL** manages database structure.
- **DML** modifies stored data.
- **DQL** retrieves data using SELECT.
- **DCL** manages permissions.
- **TCL** manages transactions.
- `CREATE`, `ALTER`, `DROP`, and `TRUNCATE` are DDL commands.
- `INSERT`, `UPDATE`, and `DELETE` are DML commands.
- `SELECT` is commonly treated as DQL.
- `GRANT` and `REVOKE` are DCL commands.
- `COMMIT`, `ROLLBACK`, and `SAVEPOINT` are TCL commands.
- `DROP`, `TRUNCATE`, and `DELETE` have different purposes.

---

# 📌 Module 1 Progress

```text
01 Data                    ✅
02 Database                ✅
03 DBMS                    ✅
04 RDBMS                   ✅
05 SQL Introduction        ✅
06 SQL Command Categories  ✅
07 SQL Syntax & Naming     ⏳
```

---

# 🚀 Next Topic

## Topic 7 - SQL Syntax & Naming Rules

We will learn:

- SQL statement structure
- Keywords
- Identifiers
- Literals
- Operators
- Semicolon
- Comments
- Naming conventions
- MySQL naming best practices
- Common syntax mistakes

After completing Topic 7, **Module 1 - SQL Foundations will be complete**, and we'll move into **Module 2 - Tables & Data**, starting with `CREATE TABLE`.
