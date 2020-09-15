import java.util.Scanner;

public class CentDollar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many cents do you have?");
        int cent = scanner.nextInt();
        int dollar = (cent / 100);
        int centRemain = (cent % 100);
        System.out.println("You have $" +dollar+" and ¢"+centRemain);

    }
}