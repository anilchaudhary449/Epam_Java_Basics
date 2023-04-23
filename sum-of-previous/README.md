# Sum of previous

The purpose of this exercise is to train you to work with arrays.

Estimated workload of this exercise is _20 min_.

### Description
Please, proceed to [com.epam.rd.autotasks.arrays.SumOfPrevious](src/main/java/com/epam/rd/autotasks/arrays/SumOfPrevious.java) class
and implement `getSumCheckArray` method.

The correct implementation should receive an array of `int` values 
and return an array of booleans where each element is a result 
of a check if a corresponding element is a sum 
of two previous elements in given array.

Details:
- The length of given array is guaranteed to be 2 or more.
- Given array is guaranteed to be not null.
- Method returns an array of booleans where each element is a result for corresponding element in given array.
- First two elements of the boolean array are always false.

### Example
Input array: `[1, -1, 0, 4, 6, 10, 15, 25]`

Output array: `[false, false, true, false, false, true, false, true]`