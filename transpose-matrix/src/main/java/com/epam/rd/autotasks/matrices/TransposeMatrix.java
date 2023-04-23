package com.epam.rd.autotasks.matrices;
import java.util.Arrays;

public class TransposeMatrix {
    public static int[][] transpose(int[][] matrix) {

        //Put your code here
        int m=matrix.length;
        int n=matrix[0].length;
        int[][] B = new int[n][m];
        for (int j = 0; j < n; j++)
            for (int i = 0; i < m; i++)
                B[j][i] = matrix[i][j];

        return B;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        int[][] matrix = {
                {1, 2},
                {7, -13} };

        int[][] result = transpose(matrix);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }

}
