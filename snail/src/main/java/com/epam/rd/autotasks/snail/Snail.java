package com.epam.rd.autotasks.snail;

import java.util.Scanner;

public class Snail
{
    public static void main(String[] args)
    {
        //Write a program that reads a,b and h (line by lyne in this order) and prints
        //the number of days for which the snail reach the top of the tree.
        //a - feet that snail travels up each day, b - feet that slides down each night, h - height of the tree
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int h= scanner.nextInt();

        int days=0;
        if ((h<=0)||(a==b && h>a)||(h>a&&b>a)){
            System.out.println("Impossible");
        }
        else {
            for(int i=0;;i=i-b){
                i=i+a;
                days++;
                if (i>=h){
                    System.out.println(days);
                    break;
                }
            }
        }
    }
}
