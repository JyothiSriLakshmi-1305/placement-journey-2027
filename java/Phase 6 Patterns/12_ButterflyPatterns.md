# Butterfly Patterns

> **Module 19 – Pattern Programming**

## 1. Introduction

A **Butterfly Pattern** is a symmetric pattern formed using two star sections separated by spaces.

```text
*      *
**    **
***  ***
********
***  ***
**    **
*      *
```

It combines increasing stars, decreasing spaces, decreasing stars, nested loops, symmetry, and pattern decomposition.

## 2. Why Learn Butterfly Patterns?

Each row contains:

```text
Left Stars + Middle Spaces + Right Stars
```

This teaches how to combine multiple changing quantities in one pattern.

## 3. Pattern Thinking ⭐

Divide the butterfly into:

```text
Upper Half
+
Lower Half
```

Then solve each row as:

```text
Left Stars
+
Middle Spaces
+
Right Stars
```

## 4. Core Formula

For the upper half:

```text
Left Stars  = row
Spaces      = 2 * (n - row)
Right Stars = row
```

For `n = 4`:

| Row | Left Stars | Spaces | Right Stars |
|-----|-----------:|-------:|------------:|
| 1 | 1 | 6 | 1 |
| 2 | 2 | 4 | 2 |
| 3 | 3 | 2 | 3 |
| 4 | 4 | 0 | 4 |

## 5. Solid Butterfly

```text
*      *
**    **
***  ***
********
***  ***
**    **
*      *
```

### Code

```java
public class ButterflyPattern {

    public static void main(String[] args) {

        int n = 4;

        // Upper Half
        for(int row = 1; row <= n; row++) {

            for(int star = 1; star <= row; star++) {
                System.out.print("*");
            }

            for(int space = 1; space <= 2 * (n - row); space++) {
                System.out.print(" ");
            }

            for(int star = 1; star <= row; star++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower Half
        for(int row = n - 1; row >= 1; row--) {

            for(int star = 1; star <= row; star++) {
                System.out.print("*");
            }

            for(int space = 1; space <= 2 * (n - row); space++) {
                System.out.print(" ");
            }

            for(int star = 1; star <= row; star++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
```

## 6. Internal Working

For `n = 4`:

```text
Row 1 → 1 star, 6 spaces, 1 star
Row 2 → 2 stars, 4 spaces, 2 stars
Row 3 → 3 stars, 2 spaces, 3 stars
Row 4 → 4 stars, 0 spaces, 4 stars
```

The lower half reverses the same structure.

## 7. Why `2 * (n - row)`?

For `n = 4`:

```text
Row 1 → 2 × (4 - 1) = 6
Row 2 → 2 × (4 - 2) = 4
Row 3 → 2 × (4 - 3) = 2
Row 4 → 2 × (4 - 4) = 0
```

Therefore:

```text
6 → 4 → 2 → 0
```

Spaces decrease by 2 every row.

## 8. Why Does the Lower Half Start at `n - 1`?

The middle row is already printed in the upper half.

Correct:

```java
for(int row = n - 1; row >= 1; row--)
```

This prevents the middle row from being printed twice.

## 9. Dry Run

For `n = 4`:

```text
Upper Half

row = 1 → 1 star, 6 spaces, 1 star
row = 2 → 2 stars, 4 spaces, 2 stars
row = 3 → 3 stars, 2 spaces, 3 stars
row = 4 → 4 stars, 0 spaces, 4 stars

Lower Half

row = 3 → 3 stars, 2 spaces, 3 stars
row = 2 → 2 stars, 4 spaces, 2 stars
row = 1 → 1 star, 6 spaces, 1 star
```

## 10. Number Butterfly

Example:

```text
1      1
12    12
123  123
12341234
123  123
12    12
1      1
```

The structure remains the same; only the printing logic changes.

```java
for(int col = 1; col <= row; col++) {
    System.out.print(col);
}
```

## 11. Alphabet Butterfly

Example:

```text
A      A
AB    AB
ABC  ABC
ABCDABCD
ABC  ABC
AB    AB
A      A
```

Again, only the printing logic changes.

## 12. Pattern Formula Sheet ⭐

| Component | Formula |
|-----------|---------|
| Left Stars | `row` |
| Middle Spaces | `2 * (n - row)` |
| Right Stars | `row` |
| Lower Start | `n - 1` |

## 13. Time Complexity

```text
O(n²)
```

## 14. Space Complexity

```text
O(1)
```

## 15. Common Mistakes

### Wrong space formula

Incorrect:

```java
space <= n - row
```

Correct:

```java
space <= 2 * (n - row)
```

### Missing the second star loop

A butterfly has:

```text
Left Stars
+
Spaces
+
Right Stars
```

### Duplicating the middle row

Start the lower half at:

```java
n - 1
```

## 16. Debugging Strategy

Check the three sections separately:

```text
Left Stars
↓
Middle Spaces
↓
Right Stars
```

Then check the upper and lower halves.

## 17. Pattern Recognition ⭐

If you see:

```text
Stars ↑
Spaces ↓
Stars ↑
```

followed by:

```text
Stars ↓
Spaces ↑
Stars ↓
```

think:

> **Butterfly Pattern**

## 18. Connection with Previous Patterns

```text
Half Pyramid
     ↓
Full Pyramid
     ↓
Diamond
     ↓
Butterfly
```

The butterfly combines half-pyramid and inverted-pyramid concepts with symmetric spacing.

## 19. Interview Questions

### Q1. What are the three components of a butterfly row?

```text
Left Stars
Spaces
Right Stars
```

### Q2. What is the space formula?

```text
2 * (n - row)
```

### Q3. Why does the lower loop start from `n - 1`?

To avoid duplicating the middle row.

### Q4. What is the time complexity?

```text
O(n²)
```

## 20. Coding Exercises

### Beginner

1. Print a star butterfly.
2. Take `n` from the user.
3. Print a butterfly using `#`.
4. Print a butterfly using `$`.

### Intermediate

5. Number butterfly.
6. Alphabet butterfly.
7. Reverse number butterfly.
8. Butterfly with a user-selected character.

### Placement-Level

9. Hollow butterfly.
10. Double butterfly.
11. Symmetric character butterfly.
12. Butterfly with alternating symbols.

## 21. Best Practices

- Divide the pattern into upper and lower halves.
- Identify three sections in every row.
- Calculate spaces mathematically.
- Avoid duplicating the middle row.
- Dry run with a small value such as `n = 3`.

## 22. Bootcamp Insight 💡

A complicated-looking butterfly becomes simple when you divide it into:

```text
Left
+
Middle
+
Right
```

This decomposition technique is also useful in DSA when a large problem can be divided into smaller components.

## 23. Quick Revision

```text
BUTTERFLY

Upper:
row = 1 → n

Lower:
row = n - 1 → 1

Left Stars:
row

Spaces:
2 * (n - row)

Right Stars:
row
```

## 24. Key Takeaways

- Butterfly patterns have two symmetric halves.
- Each row contains left stars, spaces, and right stars.
- Stars increase in the upper half.
- Spaces decrease toward the middle.
- The lower half reverses the process.
- The middle row should appear only once.

Main formula:

```text
Left Stars  = row
Spaces      = 2 * (n - row)
Right Stars = row
```

## 25. References

- Oracle Java Documentation
- Java Language Specification
- Effective Java – Joshua Bloch
- Head First Java
