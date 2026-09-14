# 📘 Topic 4 - RDBMS (Relational Database Management System)

## 🎯 Objective

Understand what an RDBMS is, why it is called relational, how data is organized into tables, how tables are related, and why MySQL is an RDBMS.

---

# 1. What is RDBMS?

**RDBMS** stands for **Relational Database Management System**.

An RDBMS is a type of DBMS that stores data primarily in **tables** and supports relationships between related tables.

### Interview Definition

> An RDBMS is a database management system that stores data in related tables and uses relationships between tables to organize and manage data efficiently.

---

# 2. Why is it Called "Relational"?

The word **relational** refers to the relationships between tables.

### Students

| student_id | name | department_id |
|---:|---|---:|
| 101 | Ravi | 10 |
| 102 | Priya | 20 |
| 103 | Arun | 10 |

### Departments

| department_id | department_name |
|---:|---|
| 10 | CSE |
| 20 | ECE |

The tables are related through `department_id`.

```text
Students.department_id
          ↓
Departments.department_id
```

---

# 3. Why Use Multiple Tables?

Suppose we store everything in one table:

| Student ID | Name | Department | HOD |
|---:|---|---|---|
| 101 | Ravi | CSE | Dr. A |
| 102 | Priya | ECE | Dr. B |
| 103 | Arun | CSE | Dr. A |

Department and HOD information may be repeated for many students.

Instead:

```text
Students
    ↓
department_id
    ↓
Departments
```

Separating related data makes it easier to maintain and can reduce unnecessary duplication.

> The detailed study of reducing data redundancy is called **normalization**, which we will learn later.

---

# 4. Tables in an RDBMS

An RDBMS organizes structured data into tables.

```text
College Database
│
├── Students
├── Departments
├── Courses
├── Faculty
└── Enrollments
```

Each table can represent a particular type of entity or data.

---

# 5. Rows and Columns

Consider:

| student_id | name | branch | cgpa |
|---:|---|---|---:|
| 101 | Ravi | CSE | 8.5 |
| 102 | Priya | ECE | 9.1 |

### Row

A row represents one complete record.

```text
101 | Ravi | CSE | 8.5
```

### Column

A column represents an attribute.

```text
student_id
name
branch
cgpa
```

Therefore:

```text
Table
├── Rows → Records
└── Columns → Attributes
```

---

# 6. Relationships Between Tables

Common relationship types are:

## One-to-One

```text
Person
  ↓
Passport
```

One person can have one passport in a simplified model.

## One-to-Many

```text
Department
     ↓
Students
```

One department can have many students.

## Many-to-Many

```text
Students ←→ Courses
```

One student can take many courses, and one course can have many students.

A separate junction/associative table is normally used:

```text
Students
    ↓
Enrollments
    ↓
Courses
```

Relationships will be studied in greater detail later.

---

# 7. Keys in RDBMS

Keys help identify records and establish relationships between tables.

For example:

### Departments

| department_id | name |
|---:|---|
| 10 | CSE |
| 20 | ECE |

`department_id` can uniquely identify each department.

### Students

| student_id | name | department_id |
|---:|---|---:|
| 101 | Ravi | 10 |
| 102 | Priya | 20 |

Here, `department_id` in Students can refer to the department identified by `department_id` in Departments.

Two important key concepts are:

- **Primary Key**
- **Foreign Key**

These will be covered thoroughly in the Tables & Constraints module.

---

# 8. DBMS vs RDBMS

| DBMS | RDBMS |
|---|---|
| General database management system | A type of DBMS focused on relational data |
| May support different data models depending on the system | Organizes data primarily in related tables |
| Relationships are not the defining feature | Relationships between tables are fundamental |
| RDBMS is a type of DBMS | Provides relational database management |

### Important relationship

```text
DBMS
 │
 └── RDBMS
```

> **Every RDBMS is a DBMS, but not every DBMS is necessarily an RDBMS.**

---

# 9. Examples of RDBMS

Popular relational database systems include:

- MySQL
- Oracle Database
- PostgreSQL
- Microsoft SQL Server

---

# 10. Why Do Developers Use RDBMS?

RDBMSs are useful when applications contain structured data and relationships.

For example, an e-commerce application may contain:

```text
Customers
    │
    ├── Orders
    │      │
    │      └── Order Items
    │
    ├── Addresses
    │
    └── Payments

Products
    │
    └── Reviews
```

The relationships between these entities are important to the application's data model.

---

# 11. SQL and RDBMS

SQL is commonly used to interact with relational databases.

Example:

```sql
SELECT *
FROM students;
```

A query can also retrieve related data using a JOIN:

```sql
SELECT students.name, departments.department_name
FROM students
JOIN departments
ON students.department_id=departments.department_id;
```

JOINs will be studied in detail later.

---

# 12. MySQL and RDBMS

The database system used for this learning journey is **MySQL**.

MySQL is an **RDBMS**.

```text
MySQL
  ↓
Database
  ↓
Tables
  ↓
Rows + Columns
  ↓
Data
```

Relationships can connect related tables.

---

# 13. SQL vs MySQL vs Database vs RDBMS

| Term | Meaning |
|---|---|
| Data | Raw facts or values |
| Database | Organized collection of data |
| DBMS | Software that manages databases |
| RDBMS | DBMS that manages relational data using tables and relationships |
| MySQL | An RDBMS |
| SQL | Language used to interact with relational databases |

### Easy way to remember

```text
SQL       → Language
MySQL     → RDBMS
Database  → Organized Data
RDBMS     → Software for managing relational databases
```

---

# 🎤 Interview Questions

## Q1. What is RDBMS?

> RDBMS stands for Relational Database Management System. It is a type of DBMS that stores data in related tables and supports relationships between those tables.

## Q2. Why is it called relational?

> It is called relational because data is organized into tables and relationships can be established between related tables.

## Q3. What is the difference between DBMS and RDBMS?

> RDBMS is a type of DBMS that organizes data primarily into related tables and supports relationships between them.

## Q4. Is MySQL a DBMS or RDBMS?

> MySQL is an RDBMS.

## Q5. Give examples of RDBMS.

> MySQL, Oracle Database, PostgreSQL, and Microsoft SQL Server.

## Q6. What is a relationship in an RDBMS?

> A relationship represents an association between related data stored in different tables.

## Q7. What are the common types of relationships?

> One-to-one, one-to-many, and many-to-many.

## Q8. Why do we use multiple tables?

> We use multiple tables to organize different types of data separately, reduce unnecessary duplication, and represent relationships between related data.

---

# ⚠️ Common Mistakes

### ❌ SQL and RDBMS are the same.

### ✅ Correct

```text
SQL   → Language
RDBMS → Database management system
```

### ❌ MySQL is SQL.

### ✅ Correct

> MySQL is an RDBMS that uses SQL.

### ❌ Database and RDBMS are the same.

### ✅ Correct

```text
Database → Organized collection of data
RDBMS    → Software used to manage relational databases
```

---

# 🧠 Quick Revision

```text
DBMS
 ↓
RDBMS
 ↓
Tables
 ↓
Rows + Columns
 ↓
Relationships
 ↓
Related Data
```

And:

```text
SQL
 ↓
Used to interact with
 ↓
RDBMS
```

---

# 📝 Practice Questions

Answer these without looking at the notes:

1. What does RDBMS stand for?
2. What is an RDBMS?
3. Why is it called relational?
4. What is the difference between DBMS and RDBMS?
5. Why do we use multiple tables?
6. What is a row?
7. What is a column?
8. What is a relationship?
9. Give an example of a one-to-many relationship.
10. Give an example of a many-to-many relationship.
11. Is MySQL an RDBMS?
12. What is the difference between SQL and MySQL?

---

# 🏆 Mini Challenge

Design a simple college database.

Choose at least three tables.

Example:

```text
Students
Departments
Courses
```

Then identify:

1. What tables are related?
2. What column connects them?
3. What type of relationship exists?
4. Which table should contain the primary key?
5. Which table should contain the foreign key?

Do not worry if you cannot answer the key questions yet. We will study primary keys and foreign keys later.

---

# 🎯 Key Takeaways

- RDBMS stands for **Relational Database Management System**.
- RDBMS is a type of DBMS.
- RDBMS organizes data primarily into tables.
- Tables contain rows and columns.
- Relationships connect related tables.
- Common relationships are one-to-one, one-to-many, and many-to-many.
- Keys help identify records and establish relationships.
- MySQL is an RDBMS.
- SQL is a language used to interact with relational databases.
- Multiple tables can help organize data and reduce unnecessary duplication.

---

# 📌 Important Interview Chain

```text
Data
 ↓
Database
 ↓
DBMS
 ↓
RDBMS
 ↓
MySQL
```

And separately:

```text
SQL
 ↓
Language used to interact with
 ↓
RDBMS
```

---

# 🚀 Next Topic

## Topic 5 - SQL

We will learn:

- What SQL means
- Why SQL was created
- SQL vs MySQL
- How SQL communicates with a database
- Basic SQL syntax
- SQL command categories
- First practical SQL commands
- Interview questions
- Hands-on practice
