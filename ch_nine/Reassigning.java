import java.util.Scanner;

public class Reassigning {
    public static void main(String[] args) {
        Double x = 0.0;
        Double answer = 3*(x*x) - 8*(x) + 4;
        final Scanner scanner = new Scanner(System.in);

        System.out.println("what is the value of x");
        x = scanner.nextDouble();
        answer = 3*(x*x) - 8*(x) + 4;
        System.out.println("Value of 3x^2-8x + 4 when x = " + x + " is " + answer);
        System.out.println("what is the value of x");
        x = scanner.nextDouble();
        answer = 3*(x*x) - 8*(x) + 4;
        System.out.println("Value of 3x^2-8x + 4 when x = " + x + " is " + answer);
        System.out.println("what is the value of x");
        x = scanner.nextDouble();
        answer = 3*(x*x) - 8*(x) + 4;
        System.out.println("Value of 3x^2-8x + 4 when x = " + x + " is " + answer);

    }
}