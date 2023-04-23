package com.epam.rd.autotasks.arrays;

public class SumOfEvenNumbers {

    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 2, 8, 15, 199};
        System.out.println(sum(array));
    }

    public static int sum(int[] array){
        //put your code here
        int even_sum = 0;

        try {
            for(int i = 0; i <array.length; i++)
            {
                if(array[i]% 2 == 0)
                {
                    even_sum = even_sum + array[i];
                }

            }
        }
        catch(NullPointerException e){
            even_sum = 0;
        }
        return even_sum;
        //throw new UnsupportedOperationException();
    }
}
