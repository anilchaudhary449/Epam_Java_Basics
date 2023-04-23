package com.epam.rd.autotasks;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Use Scanner methods to read input
        int first,second,count=0;
        first = scanner.nextInt();

        while(true){
            second = scanner.nextInt();
            if(first == 0 || second ==0 ){
                break;
            }
            count+=1;
            first = first+second;
        }
        int average = first/(count+1);
        System.out.println(average);


    }

}
