import java.util.Scanner;

public class log{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the value of x?");
        double x = scanner.nextDouble();
        double ans = (Math.log(x))/(Math.log(2));
        System.out.println("The base 2 log of " + x + " is " + ans);

    }
}