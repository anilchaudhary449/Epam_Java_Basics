# Sum of even numbers

The purpose of this exercise is to train you to work with arrays.

Estimated workload of this exercise is _20 min_.

### Description

Please, proceed to the [SumOfEvenNumbers](src/main/java/com/epam/rd/autotasks/arrays/SumOfEvenNumbers.java) class and
implement the `sum` method.

The correct implementation should receive an array of `int` values and return the sum of even numbers.

Details:

- If given array is null or empty, method returns 0.
- `sum` method must not modify the array.
- Input array may contain any `int` value between `Integer.MIN_VALUE` and `Integer.MAX_VALUE`.

### Example

```java
int[]vals = new int[]{-2,10,0,5};
int result = SumOfEvenNumbers.sum(vals);
System.out.println(result == 8); // true
```