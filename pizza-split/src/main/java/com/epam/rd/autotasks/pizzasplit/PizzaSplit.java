package com.epam.rd.autotasks.pizzasplit;

import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {
        //Write a program, reading number of people and number of pieces per pizza and then
        //printing minimum number of pizzas to order to split all the pizzas equally and with no remainder
        Scanner sc= new Scanner(System.in);
        int people= sc.nextInt();
        int piecesperpizza=sc.nextInt();
        int find;
        int i=1;
        while (true){
            find= i* piecesperpizza;
            if(find%people==0){
                break;
            }
            i++;
        }
        System.out.println(i);
    }
}



