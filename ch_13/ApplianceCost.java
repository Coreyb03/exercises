import java.util.Scanner;

public class ApplianceCost{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cost per kilowatt hour in cents and kilo-watt-hours used per year");
        double cost = scanner.nextDouble();
        int hours = scanner.nextInt();
        System.out.println("the annual cost is: $" + (cost * hours)/100);
    }
}