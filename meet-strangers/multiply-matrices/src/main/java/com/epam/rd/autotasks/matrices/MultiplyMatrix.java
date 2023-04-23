package com.epam.rd.autotasks.matrices;
import java.util.Arrays;

public class MultiplyMatrix {
    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {

        // Put your code here
        int r1=matrix1.length;
        // int c1=matrix1[0].length;
        int c2=matrix2[0].length;
        int r2= matrix2.length;
        int [][]b= new int [r1][c2];
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++) {
                for(int k=0;k<r2;k++)
                {
                    b[i][j]+=matrix1[i][k]*matrix2[k][j];
                }
            }
        }

        return b;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        int[][] a = {
                {0, 12345},
                {4509, 0},
                {3, 567} };

        int[][] b = {
                {653, 0, 25353},
                {0, 61, 6} };

        int[][] result = multiply(a, b);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }
}
