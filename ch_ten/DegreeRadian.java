import java.util.Scanner;

public class DegreeRadian{
    public static void main(String[] args) {
        double degree = 0.0;
        final Scanner scanner = new Scanner(System.in);

        System.out.println("what is the value of degree?");
        degree = scanner.nextDouble();
        double rad = (degree) * (Math.PI / 180.0);

        System.out.println("The value of rad is " + rad + " when degree is " + degree);
    }
}