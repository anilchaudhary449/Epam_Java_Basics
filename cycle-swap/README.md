# Cycle Swap

The purpose of this exercise is to train you to work with arrays.

Estimated workload of this exercise is _30 min_.

### Description
Please, proceed to [`CycleSwap`](src/main/java/com/epam/rd/autotasks/CycleSwap.java) class
and implement its static methods:

* `void cycleSwap(int[] array)`\
  Shifts all the elements in the given array to the right by 1 position.\
  In this case, the last array element becomes first.\
  For example, `1 3 2 7 4` becomes `4 1 3 2 7`.

* `void cycleSwap(int[] array, int shift)`\
  Shift all the elements in the given array to the right in the cycle manner by `shift` positions.\
  Shift value is guaranteed to be non-negative and not bigger than the array length.\
  For example, `1 3 2 7 4` with a shift of `3` becomes `2 7 4 1 3`.

For a greater challenge, try not using loops in your code (not mandatory).

Note that input array may be empty.

### Examples

---
Code Sample:
```java
...
int[] array = new int[]{1, 3, 2, 7, 4};
CycleSwap.cycleSwap(array);
System.out.println(Arrays.toString(array));
```

Output:
```
[4, 1, 3, 2, 7]
```

---
Code Sample:
```java
...
int[] array = new int[]{1, 3, 2, 7, 4};
CycleSwap.cycleSwap(array, 2);
System.out.println(Arrays.toString(array));
```

Output:
```
[7, 4, 1, 3, 2]
```

---
Code Sample:
```java
...
int[] array = new int[]{1, 3, 2, 7, 4};
CycleSwap.cycleSwap(array, 5);
System.out.println(Arrays.toString(array));
```

Output:
```
[1, 3, 2, 7, 4]
```
