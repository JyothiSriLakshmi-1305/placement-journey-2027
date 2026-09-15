# 📘 Topic 5 - SQL Introduction

## 🎯 Objective

Understand what SQL is, why we use it, how SQL communicates with a relational database, the difference between SQL and MySQL, and the basic SQL command structure.

---

# 1. What is SQL?

**SQL** stands for:

> **Structured Query Language**

SQL is a language used to communicate with and perform operations on relational databases.

### Interview Definition

> SQL is a standard language used to create, access, manipulate, and manage data in relational databases.

---

# 2. Why Do We Need SQL?

Suppose our database contains a `students` table:

| student_id | name | branch | cgpa |
|---:|---|---|---:|
| 101 | Ravi | CSE | 8.5 |
| 102 | Priya | ECE | 9.1 |
| 103 | Arun | CSE | 7.8 |

If we want all CSE students, we can use SQL:

```sql
SELECT *
FROM students
WHERE branch='CSE';
```

SQL allows us to communicate our requirements to the database.

---

# 3. SQL Is a Language, Not a Database

This distinction is very important.

```text
SQL
 ↓
Language
```

```text
MySQL
 ↓
RDBMS
```

```text
Database
 ↓
Organized collection of data
```

### Simple mental model

```text
User / Application
        ↓
       SQL
        ↓
      MySQL
        ↓
    Database
```

SQL is the language used to interact with the database system.

---

# 4. What Can We Do Using SQL?

SQL can be used for many operations.

## Create

Create databases and tables.

```sql
CREATE DATABASE college;
```

## Insert

Add data.

```sql
INSERT INTO students
VALUES(101,'Ravi','CSE',8.5);
```

## Retrieve

Get data.

```sql
SELECT *
FROM students;
```

## Update

Modify existing data.

```sql
UPDATE students
SET cgpa=9.0
WHERE student_id=101;
```

## Delete

Remove data.

```sql
DELETE FROM students
WHERE student_id=101;
```

### Basic idea

```text
SQL
│
├── Create
├── Insert
├── Retrieve
├── Update
└── Delete
```

---

# 5. SQL vs MySQL

This is one of the most common beginner interview questions.

### SQL

SQL is a **language**.

### MySQL

MySQL is an **RDBMS** that uses SQL.

```text
SQL
 ↓
Language

MySQL
 ↓
RDBMS
 ↓
Manages
 ↓
Databases
```

Therefore:

> **SQL and MySQL are not the same thing.**

---

# 6. SQL Is Used With Different RDBMSs

SQL is used with many relational database systems, including:

- MySQL
- Oracle Database
- PostgreSQL
- Microsoft SQL Server

However, each database system can have its own **SQL dialects and database-specific features**.

Therefore, a query written for one database may sometimes need modification for another.

We will later practice specifically with **MySQL**.

---

# 7. Basic SQL Query Structure

A simple query is:

```sql
SELECT *
FROM students;
```

Let's understand each part.

### SELECT

Specifies what we want to retrieve.

```sql
SELECT *
```

### FROM

Specifies the table from which the data should be retrieved.

```sql
FROM students
```

### Semicolon

```text
;
```

Marks the end of the SQL statement.

---

# 8. SQL Is Declarative

SQL is generally described as a **declarative language**.

For example:

```sql
SELECT *
FROM students
WHERE cgpa>8;
```

We specify **what result we want**.

We normally do not specify every low-level step the database must perform to find that result.

The database system determines an appropriate execution strategy.

### Easy way to remember

```text
SQL
 ↓
Tell the database WHAT you want
 ↓
Database determines HOW to execute it
```

---

# 9. SQL Keywords

SQL contains reserved keywords such as:

```text
SELECT
FROM
WHERE
CREATE
INSERT
UPDATE
DELETE
```

For readability, we normally write SQL keywords in uppercase:

```sql
SELECT *
FROM students
WHERE cgpa>8;
```

MySQL SQL keywords are generally case-insensitive.

---

# 10. SQL Statement vs Query

### SQL Statement

A complete SQL instruction.

Example:

```sql
CREATE DATABASE college;
```

### Query

The term "query" is commonly used for a SQL statement that retrieves or works with data.

Example:

```sql
SELECT *
FROM students;
```

In everyday development, people may use the word **query** loosely for SQL statements in general.

---

# 11. SQL Command Categories

SQL commands are commonly grouped into five categories:

```text
SQL
│
├── DDL
├── DML
├── DQL
├── DCL
└── TCL
```

### DDL — Data Definition Language

Used for database structure.

```text
CREATE
ALTER
DROP
TRUNCATE
```

### DML — Data Manipulation Language

Used to modify data.

```text
INSERT
UPDATE
DELETE
```

### DQL — Data Query Language

Commonly used to retrieve data.

```text
SELECT
```

### DCL — Data Control Language

Used for permissions.

```text
GRANT
REVOKE
```

### TCL — Transaction Control Language

Used for transaction management.

```text
COMMIT
ROLLBACK
SAVEPOINT
```

> These categories are covered in detail in **Topic 6 - SQL Command Categories**.

---

# 12. SQL Case Sensitivity

SQL keywords in MySQL are generally case-insensitive.

These are equivalent:

```sql
SELECT * FROM students;
```

and:

```sql
select * from students;
```

For our notes and projects, we will use uppercase SQL keywords because they are easier to read.

### Important

Do not assume that every identifier is always case-insensitive. Identifier case-sensitivity can depend on the database system and configuration.

---

# 13. Our MySQL Practice Environment

For this learning journey, we are using:

```text
MySQL Server
      ↓
MySQL Workbench
      ↓
sql_learning
      ↓
Tables
      ↓
Data
```

We will execute SQL commands through MySQL Workbench.

---

# 14. First MySQL Test

Open MySQL Workbench and connect to your MySQL Server.

Run:

```sql
SELECT VERSION();
```

This displays the MySQL server version.

Example:

```text
8.x.x
```

---

# 15. Our Learning Database

We already have a dedicated database called:

```text
sql_learning
```

Select it using:

```sql
USE sql_learning;
```

Then verify:

```sql
SELECT DATABASE();
```

Expected result:

```text
sql_learning
```

---

# 16. View Available Databases

Use:

```sql
SHOW DATABASES;
```

This displays the databases available on the MySQL server.

---

# 17. View Tables

Once you are using `sql_learning`, run:

```sql
SHOW TABLES;
```

This displays the tables inside the selected database.

---

# 18. Basic SQL Workflow

Our practical workflow is:

```text
Open MySQL Workbench
        ↓
Connect to MySQL Server
        ↓
USE sql_learning;
        ↓
Write SQL
        ↓
Run query
        ↓
Check result / error
        ↓
Understand
        ↓
Practice
```

---

# 19. How to Run a Query in MySQL Workbench

You can execute SQL using:

### Method 1 — Lightning Button

Click the **⚡ Execute** button.

### Method 2 — Keyboard

Place the cursor inside a statement and use:

```text
Ctrl + Enter
```

### Best practice while learning

Select the exact query you want to execute and then click the execute button.

This reduces the chance of accidentally running another statement.

---

# 20. SQL Comments

Comments are ignored by the database and are useful for documenting code.

## Single-line comment

```sql
-- Display all students
SELECT *
FROM students;
```

## Multi-line comment

```sql
/*
This query displays
all students.
*/
SELECT *
FROM students;
```

---

# 21. Semicolon

A semicolon is commonly used to terminate a SQL statement.

Example:

```sql
SELECT *
FROM students;
```

Multiple statements:

```sql
SELECT *
FROM students;

SELECT *
FROM departments;
```

---

# 22. First Hands-On Practice

Run these commands one by one:

### Step 1

```sql
USE sql_learning;
```

### Step 2

```sql
SELECT DATABASE();
```

Expected:

```text
sql_learning
```

### Step 3

```sql
SHOW TABLES;
```

You should see the tables currently present in your database.

### Step 4

If your `students` table exists:

```sql
SELECT *
FROM students;
```

This retrieves all rows and columns from the table.

---

# 🎤 Interview Questions

## Q1. What is SQL?

> SQL stands for Structured Query Language. It is a standard language used to create, access, manipulate, and manage data in relational databases.

## Q2. Is SQL a database?

> No. SQL is a language.

## Q3. Is MySQL SQL?

> No. MySQL is an RDBMS that uses SQL.

## Q4. What does SQL stand for?

> Structured Query Language.

## Q5. Name some RDBMSs that use SQL.

> MySQL, Oracle Database, PostgreSQL, and Microsoft SQL Server.

## Q6. Why is SQL called declarative?

> Because we generally specify what result we want rather than describing every low-level step required to obtain it.

## Q7. What does SELECT do?

> SELECT retrieves data from a database.

## Q8. What does USE do in MySQL?

> USE selects the database that subsequent statements will operate on by default.

## Q9. What does SHOW DATABASES do?

> It displays the databases available to the current MySQL account.

## Q10. What does SHOW TABLES do?

> It displays the tables in the currently selected database.

---

# ⚠️ Common Beginner Mistakes

### Mistake 1

Thinking:

```text
SQL = MySQL
```

### Correct:

```text
SQL   → Language
MySQL → RDBMS
```

---

### Mistake 2

Thinking a database and an RDBMS are the same.

### Correct:

```text
Database → Organized data
RDBMS    → Software that manages relational databases
```

---

### Mistake 3

Thinking `SELECT` creates data.

### Correct:

```text
SELECT → Retrieves data
INSERT → Adds data
```

---

### Mistake 4

Forgetting the semicolon.

```sql
SELECT *
FROM students;
```

Use `;` to terminate SQL statements.

---

# 🧠 Quick Revision

```text
SQL
 ↓
Structured Query Language
 ↓
Language used to interact with relational databases
```

```text
MySQL
 ↓
RDBMS
 ↓
Manages relational databases
```

```text
SQL
│
├── DDL → Structure
├── DML → Modify data
├── DQL → Retrieve data
├── DCL → Permissions
└── TCL → Transactions
```

---

# 📝 Practice Questions

Answer these without looking at the notes:

1. What does SQL stand for?
2. What is SQL?
3. Is SQL a database?
4. What is MySQL?
5. What is the difference between SQL and MySQL?
6. Name four RDBMSs.
7. Why is SQL called declarative?
8. What does `SELECT` do?
9. What does `USE sql_learning;` do?
10. What does `SHOW DATABASES;` do?
11. What does `SHOW TABLES;` do?
12. Why do we use a semicolon?
13. What are SQL keywords?
14. What are the five common SQL command categories?

---

# 🏆 Mini Challenge

Without looking at the notes, explain this flow:

```text
User
 ↓
SQL
 ↓
MySQL
 ↓
Database
 ↓
Table
 ↓
Rows + Columns
```

Then explain the difference between:

```text
SQL
MySQL
Database
Table
```

This distinction is fundamental for everything that follows.

---

# 🎯 Key Takeaways

- SQL stands for **Structured Query Language**.
- SQL is a language, not a database.
- MySQL is an **RDBMS** that uses SQL.
- SQL is used to create, retrieve, modify, and manage data.
- SQL is generally considered a declarative language.
- SQL keywords in MySQL are generally case-insensitive.
- `SELECT` retrieves data.
- `USE` selects the current database.
- `SHOW DATABASES` displays available databases.
- `SHOW TABLES` displays tables in the selected database.
- SQL commands are commonly grouped into DDL, DML, DQL, DCL, and TCL.
- We will use **MySQL Workbench + `sql_learning`** for practical learning.

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

After Topic 7, **Module 1 - SQL Foundations will be complete**.

Then we move to:

# Module 2 — Tables & Data

Starting with:

```text
CREATE TABLE
     ↓
Columns
     ↓
Data Types
     ↓
Constraints
     ↓
INSERT
```

This is where our serious hands-on SQL practice begins. 🚀
