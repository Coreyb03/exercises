import java.util.Scanner;

public class OhmLaw {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the voltage and resistance (seperate by spaces)?");
        int v = scan.nextInt();
        int r = scan.nextInt();
        double current = ((v + 0.0)/r);
        System.out.println("The current is " + current + " amps");

    }
}