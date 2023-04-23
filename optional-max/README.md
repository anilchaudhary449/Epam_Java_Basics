# Optional Max

The purpose of this exercise is to train you to work with arrays and optional.

Estimated workload of this exercise is _45 min_.

### Description
Implement `max` method of [`MaxMethod`](src/main/java/com/epam/rd/autotasks/max/MaxMethod.java) class.

The correct implementation should receive an array of `int` values and return its maximum value.

Details:
- the method returns the result as OptionalInt
- if the input array is empty or `null`, return empty OptionalInt. 

### Example
```java
int[] vals = new int[]{-2, 0, 10, 5};
OptionalInt result = MaxMethod.max(vals);
System.out.println(result.getAsInt() == 10); // true
```
