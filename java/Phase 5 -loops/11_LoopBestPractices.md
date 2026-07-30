# Loop Best Practices

> **Module 18 – Loops**

## 1. Introduction
Writing efficient, readable, and maintainable loops is an essential software engineering skill.

## 2. Why Best Practices Matter
- Better readability
- Fewer bugs
- Easier debugging
- Better performance
- Easier maintenance

## 3. Choose the Right Loop
| Situation | Loop |
|---|---|
| Known iterations | for |
| Unknown iterations | while |
| Execute at least once | do-while |
| Collections/arrays | enhanced for |

## 4. Use Meaningful Variable Names
```java
for(int studentIndex=0; studentIndex<n; studentIndex++){}
```

## 5. Keep Conditions Simple
Prefer clear boolean expressions.

## 6. Avoid Infinite Loops
Always update loop variables.

## 7. Minimize Work Inside Loops
Move repeated calculations outside the loop.

## 8. Avoid Deep Nesting
Extract methods when nesting becomes complex.

## 9. Use break and continue Carefully
Use them only when they improve readability.

## 10. Avoid Magic Numbers
Use named constants.

## 11. Performance Tips
- Cache repeated values
- Exit early with break
- Avoid unnecessary object creation

## 12. Memory Considerations
Most loops use O(1) extra space.

## 13. Common Mistakes
- Off-by-one errors
- Infinite loops
- Wrong boundaries
- Excessive nesting

## 14. Debugging Tips
- Dry run
- Print variables
- Check first/last iteration

## 15. Interview Tips
Choose the correct loop and explain its complexity.

## 16. Industry Best Practices
Follow naming conventions, keep loops small, and write maintainable code.

## 17. Do's and Don'ts
### Do
- Keep loops simple
- Use meaningful names
- Update variables

### Don't
- Write complex conditions
- Duplicate logic

## 18. Quick Revision
Choose the right loop, avoid infinite loops, and write readable code.

## 19. Bootcamp Insight
Good loop design reflects strong programming fundamentals and helps in placements.

## 20. Key Takeaways
- Readability matters
- Simplicity wins
- Performance and maintainability go together

## 21. References
- Oracle Java Documentation
- Effective Java
- Clean Code
