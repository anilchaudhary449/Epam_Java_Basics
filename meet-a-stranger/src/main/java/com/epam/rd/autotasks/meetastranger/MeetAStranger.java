package com.epam.rd.autotasks.meetastranger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class HelloStrangers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("How many strangers do you want to meet? ");
        int numStrangers = Integer.parseInt(reader.readLine());

        if (numStrangers == 0) {
            System.out.println("Oh, it looks like there is no one here.");
        } else if (numStrangers < 0) {
            System.out.println("Seriously? Why so negative?");
        } else {
            for (int i = 0; i < numStrangers; i++) {
                System.out.print("Enter stranger name " + (i+1) + ": ");
                String name = reader.readLine();
                System.out.println("Hello, " + name);
            }
        }
        reader.close();
    }
}
