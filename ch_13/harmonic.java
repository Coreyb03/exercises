import java.util.Scanner;

public class harmonic{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the value of x and y?");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        double arithmetic = (x + y)/2;
        double harmonic = 2/(1.0/x + 1.0/y);
        System.out.println("arithmetic mean: " + arithmetic);
        System.out.println("harmonic mean: " + harmonic);

    }
}