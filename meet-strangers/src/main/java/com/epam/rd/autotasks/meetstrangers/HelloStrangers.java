package com.epam.rd.autotasks.meetstrangers;

import java.io.IOException;
import java.util.Scanner;

public class HelloStrangers {
    public static void main(String[] args) throws IOException {
        //Write a program, asks for a number - amount of strangers to meet.
        //Then reads stranger names line by line and prints line by line "Hello, ...".
        Scanner scanner = new Scanner(System.in);
        var strangersCount = scanner.nextInt();
        switch (strangersCount) {
            case 0:
                System.out.println("Oh, it looks like there is no one here");
                break;
            case -1:
                System.out.println("Seriously? Why so negative?");
                break;
            default:
                scanner.nextLine();
                for (int i = strangersCount; i > 0; i--) {
                    String s = scanner.nextLine();
                    System.out.println("Hello, " + s);
                }
        }
    }
}