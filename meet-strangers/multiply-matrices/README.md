# Matrices multiplication

The purpose of this exercise is to train you to work with arrays.

Estimated workload of this exercise is _60 min_.

### Description

Please, proceed to [`MultiplyMatrix`](src/main/java/com/epam/rd/autotasks/matrices/MultiplyMatrix.java)
class and implement its `multiply` method.

It takes two rectangular integer arrays (matrices) and returns the result of their multiplication.

Consider two integer matrices represented as **rectangular arrays**. The task is to **multiply** given matrices. The
definition of **matrix multiplication** indicates a row-by-column multiplication, 
where the entries in the **i-th** row of *A*
are multiplied by the corresponding entries in the **j-th** column of *B*
and then the **ij-th** element of the resulting matrix is the sum of that multiplication results.

Note that it is guaranteed that 
the number of columns in the first matrix 
is equal to the number of rows in the second matrix.

### Example

Input:

        {{1, 2, 3}, 
        {4, 5, 6}}, 
        
        {{7 , 8 }, 
        {9 , 10},
        {11, 12}}

Output:

        {{58 , 64 },
        {139, 154}}
