import java.util.Scanner;

public class challenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the temperature on sunday?");
        int sun = scanner.nextInt();
        System.out.println("What is the temperature on monday?");
        int mon = scanner.nextInt();
        System.out.println("What is the temperature on tuesday?");
        int tue = scanner.nextInt();
        System.out.println("What is the temperature on wednesday?");
        int wed = scanner.nextInt();
        System.out.println("What is the temperature on thursday?");
        int thu = scanner.nextInt();
        System.out.println("What is the temperature on friday?");
        int fri = scanner.nextInt();
        System.out.println("What is the temperature on saturday?");
        int sat = scanner.nextInt();

        System.out.println("\nSunday's temp:\t\t " + sun);
        System.out.println("Monday's temp:\t\t " + mon);
        System.out.println("Tuesday's temp:\t\t " + tue);
        System.out.println("Wednesday's temp:\t " + wed);
        System.out.println("Thursdsay's temp:\t " + thu);
        System.out.println("Friday's temp:\t\t " + fri);
        System.out.println("Saturday's temp:\t " + sat);

    }
}