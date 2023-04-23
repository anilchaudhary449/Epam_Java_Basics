package com.epam.rd.autotasks;

public class Spiral {

    public static int[][] spiral(int rows, int columns) {
        int[][] result = new int[rows][columns];
        int count = 1;
        int rowStart = 0, rowEnd = rows - 1, colStart = 0, colEnd = columns - 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            // Traverse right
            for (int i = colStart; i <= colEnd; i++) {
                result[rowStart][i] = count++;
            }
            rowStart++;

            // Traverse down
            for (int i = rowStart; i <= rowEnd; i++) {
                result[i][colEnd] = count++;
            }
            colEnd--;

            if (rowStart <= rowEnd) {
                // Traverse left
                for (int i = colEnd; i >= colStart; i--) {
                    result[rowEnd][i] = count++;
                }
                rowEnd--;
            }

            if (colStart <= colEnd) {
                // Traverse up
                for (int i = rowEnd; i >= rowStart; i--) {
                    result[i][colStart] = count++;
                }
                colStart++;
            }
        }

        return result;
    }

    // Test method
    public static void main(String[] args) {
        int[][] spiral = Spiral.spiral(3,4);

        for (int i = 0; i < spiral.length; i++) {
            for (int j = 0; j < spiral[i].length; j++) {
                System.out.print(String.format("%4s", spiral[i][j]));
            }
            System.out.println();
        }
    }
}

