# 📘 Day 01 - MySQL Setup & Installation

## 🎯 Objective

Set up the MySQL development environment on Windows and verify that MySQL Server is installed and working correctly.

---

# 📥 Step 1: Download MySQL

Download the **MySQL Community Installer** from the official MySQL website.

> Install the **Developer Default** package.

It includes:

- MySQL Server
- MySQL Workbench
- MySQL Shell
- MySQL Connectors
- Additional developer tools

---

# ⚙️ Step 2: Configure MySQL

During installation:

- Setup Type → **Developer Default**
- Port → **3306 (Default)**
- Create a **Root Password**
- Enable **MySQL Windows Service**
- Start MySQL Server automatically

Complete the installation.

---

# 💻 Step 3: Open Command Prompt

Open **Command Prompt**.

Verify the installation:

```bash
mysql --version
```

### Output

```text
mysql Ver 8.0.46 for Win64 on x86_64 (MySQL Community Server - GPL)
```

---

# 🔐 Step 4: Login to MySQL Server

Execute:

```bash
mysql -u root -p
```

### Explanation

| Command | Description |
|----------|-------------|
| mysql | Starts the MySQL Client |
| -u | Specifies the username |
| root | Administrator account |
| -p | Prompts for password |

After pressing **Enter**:

```text
Enter password:
```

> **Note:** Password characters are hidden while typing.

---

# ✅ Step 5: Successful Login

If the password is correct, MySQL opens successfully.

```text
Welcome to the MySQL monitor.

mysql>
```

The `mysql>` prompt indicates that you are connected to the MySQL Server.

---

# 📝 Step 6: Check MySQL Server Version

Execute:

```sql
SELECT VERSION();
```

### Output

```text
+-----------+
| VERSION() |
+-----------+
| 8.0.46    |
+-----------+
```

This confirms that MySQL Server is running correctly.

---

# 📂 Step 7: Display Existing Databases

Execute:

```sql
SHOW DATABASES;
```

### Example Output

```text
+--------------------+
| Database           |
+--------------------+
| information_schema |
| mysql              |
| performance_schema |
| sys                |
+--------------------+
```

These are the default system databases created during installation.

---

# ⚠️ Important Note

Every SQL statement **must end with a semicolon (`;`)**.

✔ Correct

```sql
SHOW DATABASES;
```

❌ Incorrect

```sql
SHOW DATABASES
```

Without the semicolon, MySQL waits for additional input and changes the prompt to:

```text
->
```

---

# 📚 Commands Learned

## Check Installed Version

```bash
mysql --version
```

---

## Login to MySQL

```bash
mysql -u root -p
```

---

## Check Server Version

```sql
SELECT VERSION();
```

---

## Show Databases

```sql
SHOW DATABASES;
```

---

# 🧠 Key Learnings

- Installed MySQL Community Server.
- Installed MySQL Workbench.
- Verified MySQL installation.
- Connected to MySQL Server using the root user.
- Executed the first SQL query.
- Listed existing databases.
- Learned the importance of the semicolon (`;`) in SQL statements.

---

# 🚀 Next Topic

- What is a Database?
- Create a Database
- Use a Database
- Create Tables

---

## 📌 Summary

Today I successfully installed MySQL, connected to the MySQL Server using Command Prompt, verified the installation by checking the server version, and executed my first SQL queries. This setup forms the foundation for learning SQL and building database-driven applications using Java and MySQL.
