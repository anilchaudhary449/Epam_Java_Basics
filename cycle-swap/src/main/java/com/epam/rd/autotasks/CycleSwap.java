package com.epam.rd.autotasks;

import java.util.Arrays;

public class CycleSwap {

    public static void cycleSwap(int[] array) {
        if (array.length == 0) {
            return;
        }

        int last = array[array.length - 1];
        for (int i = array.length - 2; i >= 0; i--) {
            array[i + 1] = array[i];
        }
        array[0] = last;
    }

    public static void cycleSwap(int[] array, int shift) {
        if (array.length == 0) {
            return;
        }

        shift = shift % array.length;
        if (shift == 0) {
            return;
        }

        int[] temp = new int[shift];
        for (int i = 0; i < shift; i++) {
            temp[i] = array[array.length - shift + i];
        }

        for (int i = array.length - shift - 1; i >= 0; i--) {
            array[i + shift] = array[i];
        }

        for (int i = 0; i < shift; i++) {
            array[i] = temp[i];
        }
    }

    // Test method
    public static void main(String[] args) {
        int[] array = new int[]{ 1, 3, 2, 7, 4 };
        CycleSwap.cycleSwap(array);
        System.out.println(Arrays.toString(array));

        int[] array2 = new int[]{ 1, 3, 2, 7, 4 };
        CycleSwap.cycleSwap(array2, 3);
        System.out.println(Arrays.toString(array2));
    }
}
