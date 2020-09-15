import java.util.Scanner;

public class brick{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How long did the brick fall in seconds");
        double seconds = scanner.nextDouble();
        double distance = (0.5)*32.174*Math.pow(seconds, 2);
        System.out.println("The brick fell "+ distance + " feet in "+ seconds +" seconds");

        // the brick falls 160870 feet in 100 seconds
    }
}