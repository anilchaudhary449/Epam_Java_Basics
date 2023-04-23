package com.epam.rd.autotasks.max;
import java.util.Scanner;
public class MaxMethod {
    public static int max(int[] values) {
        int maxi = values[0];
        for(int i =0; i<values.length; i++){
            if(maxi<values[i]){
                maxi=values[i];
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] values = new int[n];
        for(int i = 0; i<n; i++){
            values[i] = sc.nextInt();
        }
        System.out.println(values);
    }
}