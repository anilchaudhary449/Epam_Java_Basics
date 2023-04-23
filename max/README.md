# Max method

The purpose of this exercise is to train you to work with arrays.

Estimated workload of this exercise is _20 min_.

### Description
Please, proceed to the [`MaxMethod`](src/main/java/com/epam/rd/autotasks/max/MaxMethod.java) class
and implement the `max` method. 

The correct implementation should receive an array of `int` values and return its maximum value.

Details:
- An input array is guaranteed to not be an empty array or `null`.
- `max` method must not modify the array.
- Input array may contain any `int` value between `Integer.MIN_VALUE` and `Integer.MAX_VALUE`. 

### Example
```java
int[] vals = new int[]{-2, 0, 10, 5};
int result = MaxMethod.max(vals);
System.out.println(result == 10); // true
```
