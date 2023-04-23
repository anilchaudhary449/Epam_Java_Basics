import java.util.Scanner;

public class FindMaxInSeq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = max(scanner);
        System.out.println(max);
    }

    public static int max(Scanner scanner) {
        int max = Integer.MIN_VALUE;
        int value;
        do {
            value = scanner.nextInt();
            if (value > max) {
                max = value;
            }
        } while (value != 0);
        return max;
    }
}
