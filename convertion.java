import java.util.Scanner;

public class convertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double METER_TO_FEET = 3.28084;

        System.out.print("Enter length in meters: ");
        double meters = sc.nextDouble();

        double feet = meters * METER_TO_FEET;

        System.out.println(meters + " meters = " + feet + " feet");

        sc.close();
    }
}

