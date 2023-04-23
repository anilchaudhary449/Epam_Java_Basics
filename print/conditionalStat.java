import java.util.Scanner;

public class conditionalStat{
    public static void main(String[]args)
    {
       Scanner obj= new Scanner(System.in);
       int age;
       System.out.println("Enter your age:");
       age=obj.nextInt();
        if (age >= 20) {
            System.out.println("Eligible for voting.");
        }
        else
            System.out.println("Not eligible for voting.");
    }
}
