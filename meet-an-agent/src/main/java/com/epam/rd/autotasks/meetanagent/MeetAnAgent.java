package com.epam.rd.autotasks.meetanagent;

import java.util.Scanner;

public class MeetAnAgent {
    final static int PASSWORD = 133976; //You can change pass, but don't change the type
    public static void main(String[] args) {
        int passwords;
        Scanner newInputs=new Scanner(System.in);
        passwords=newInputs.nextInt();
        if(passwords==PASSWORD){
            System.out.println("Hello, Agent");
        }
        else {
            System.out.println("Access denied");
        }
    }
}
