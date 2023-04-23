package com.epam.rd.autotasks;
import java.util.Locale;
import java.util.Scanner;
public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double determinant;
        determinant = b *b - (4*a*c);

        if(determinant > 0){
            double root1= (-b + Math.sqrt(determinant)) / (2 * a);
            double root2 = (-b - Math.sqrt(determinant)) / (2 * a);
            System.out.println(root1+" "+root2);
        }
        if(determinant == 0){
            double root1 = -b / (2 * a);
            System.out.println(root1);
        }
        if(determinant<0){
            System.out.println("no roots");
        }
    }

}
