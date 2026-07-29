# Labeled Statements

> **Module 18 – Loops**

## 1. Introduction
A **labeled statement** gives a name to a loop or block. It is used with `break` and `continue` to control **outer loops** in nested loops.

## 2. History
Java inherited labeled statements from structured programming to simplify exiting deeply nested loops.

## 3. Evolution
```
break
 ↓
continue
 ↓
Nested Loops
 ↓
Labeled break / continue
```

## 4. Why Labeled Statements?
Normally, `break` and `continue` affect only the nearest loop. Labels let you control an outer loop.

## 5. Real-Life Analogy
Leaving a classroom (normal break) vs leaving the entire school (labeled break).

## 6. Daily Applications
- Matrix search
- Multi-level menus
- Grid traversal

## 7. Industry Applications
- Game development
- Image processing
- Matrix algorithms
- Parser implementations

## 8. Definition
A label is an identifier followed by `:` placed before a loop or block.

## 9. Syntax
```java
outer:
for(int i=0;i<3;i++){
    for(int j=0;j<3;j++){
        if(i==1 && j==1)
            break outer;
    }
}
```

## 10. Internal Working
1. JVM identifies the labeled loop.
2. `break label` exits that loop.
3. `continue label` starts the next iteration of that loop.

## 11. Flow
Outer Loop → Inner Loop → Condition → break/continue label → Exit or Next Iteration

## 12. Labeled Break
```java
outer:
for(int i=1;i<=3;i++){
    for(int j=1;j<=3;j++){
        if(i==2 && j==2)
            break outer;
    }
}
```

## 13. Labeled Continue
```java
outer:
for(int i=1;i<=3;i++){
    for(int j=1;j<=3;j++){
        if(j==2)
            continue outer;
    }
}
```

## 14. Best Practices
- Use only when necessary.
- Prefer meaningful label names.
- Avoid deep nesting.

## 15. Common Mistakes
- Wrong label
- Using labels unnecessarily
- Confusing break and continue

## 16. Comparison

| Feature | break | break label | continue | continue label |
|---------|-------|-------------|----------|----------------|
|Nearest loop|✅|❌|✅|❌|
|Outer loop|❌|✅|❌|✅|

## 17. Interview Questions
1. What is a labeled statement?
2. Why use labeled break?
3. Difference between labeled break and labeled continue?

## 18. Coding Exercises
- Matrix search
- Exit nested loops
- Skip outer iteration

## 19. Bootcamp Insight
Labeled statements are uncommon in business applications but important for interviews and certain nested-loop algorithms.

## 20. References
- Oracle Java Documentation
- Java Language Specification
