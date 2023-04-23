# Local maxima remove

The purpose of this exercise is to train you to work with arrays.

Estimated workload of this exercise is _30 min_.

### Description

Please, proceed to the [LocalMaximaRemove](src/main/java/com/epam/rd/autotasks/arrays/LocalMaximaRemove.java) class and
implement the `removeLocalMaxima` method.

The correct implementation should receive an array of `int` values 
and return a copy of a given array with all local maxima removed in it.
The original array must not be changed.

**Local maximum** is an element that is bigger that any of its neighbour elements.
You should remove elements that are local maxima in the original array.

Details:
- The size of given array is guaranteed to be more than 1.
- Given array is guaranteed to be not null.
- If the array has no local maxima, then you should return its copy without changes.
- You may use java.util.Arrays.* methods.

### Example

Input array: `[18, 1, 3, 6, 7, -5]`

Output array: `[1, 3, 6, -5]`