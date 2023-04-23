# Spiral

The purpose of this exercise is to train you to work with arrays.

Estimated workload of this exercise is _45 min_.

### Description
Please, proceed to [`Spiral`](src/main/java/com/epam/rd/autotasks/Spiral.java)
class and implement its static method:

* `int[][] spiral(int rows, int columns)`\
  Return a two-dimensional array coming in the form of a table and containing numbers from `1` up to `rows * columns`. The size of the table will be specified by the given parameters.\
  Numbers fill the "table" clockwise from the top-level corner in a spiral manner.\
  For example, for parameter values `(3, 4)`, the output array should be:
    ```
     1  2  3  4
    10 11 12  5
     9  8  7  6
    ```

### Examples

---
Code Sample:
```java
...
int[][] spiral = Spiral.spiral(3, 4);

for (int i = 0; i < spiral.length; i++) {
    for (int j = 0; j < spiral[i].length; j++) {
        System.out.print(String.format("%4s", spiral[i][j]));
    }
    System.out.println();
}

```

Output:
```
   1   2   3   4
  10  11  12   5
   9   8   7   6
```

---
Code Sample:
```java
...
int[][] spiral = Spiral.spiral(4, 3);

for (int i = 0; i < spiral.length; i++) {
    for (int j = 0; j < spiral[i].length; j++) {
        System.out.print(String.format("%4s", spiral[i][j]));
    }
    System.out.println();
}

```

Output:
```
   1   2   3
  10  11   4
   9  12   5
   8   7   6
```

---
Code Sample:
```java
...
int[][] spiral = Spiral.spiral(5, 6);

for (int i = 0; i < spiral.length; i++) {
    for (int j = 0; j < spiral[i].length; j++) {
        System.out.print(String.format("%4s", spiral[i][j]));
    }
    System.out.println();
}

```

Output:
```
   1   2   3   4   5   6
  18  19  20  21  22   7
  17  28  29  30  23   8
  16  27  26  25  24   9
  15  14  13  12  11  10
```

---
Code Sample:
```java
...
int[][] spiral = Spiral.spiral(5, 5);

for (int i = 0; i < spiral.length; i++) {
    for (int j = 0; j < spiral[i].length; j++) {
        System.out.print(String.format("%4s", spiral[i][j]));
    }
    System.out.println();
}

```

Output:
```
   1   2   3   4   5
  16  17  18  19   6
  15  24  25  20   7
  14  23  22  21   8
  13  12  11  10   9
```
