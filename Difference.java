import java.util.Scanner;

public class Difference{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int diff = num1 - num2;

        if (diff > 0) {
            System.out.println("DIFFERENCE IS POSITIVE");
        } else if (diff < 0) {
            System.out.println("DIFFERENCE IS NEGATIVE");
        } else {
            System.out.println("DIFFERENCE IS ZERO");
        }

        sc.close();
    }
}
