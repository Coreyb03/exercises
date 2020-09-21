import java.util.Scanner;

public class age{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("what is your age in years months and days");
        int years = scanner.nextInt();
        int months = scanner.nextInt();
        int days = scanner.nextInt();
        int daysInAMonth = 0;

        if (months == 1) {
            daysInAMonth = 31;
        } else if (months == 2){
            daysInAMonth = 31 + 28;
        } else if (months == 3){
            daysInAMonth = 31 + 28 + 31;
        } else if (months == 4){
            daysInAMonth = 31 + 28 + 31 + 30;
        } else if (months == 5){
            daysInAMonth = 31 + 28 + 31 + 30 + 31;
        } else if (months == 6){
            daysInAMonth = 31 + 28 + 31 + 30 + 31 + 30;
        } else if (months == 7){
            daysInAMonth = 31 + 28 + 31 + 30 + 31 + 30 + 31;
        } else if (months == 8){
            daysInAMonth = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
        } else if (months == 9){
            daysInAMonth = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
        } else if (months == 10){
            daysInAMonth = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
        } else if (months == 11){
            daysInAMonth = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
        } else if (months == 12){
            daysInAMonth = 365;
        } else {
            daysInAMonth = 0;
        }

        
        long dayAge = (years * 365)  + days + daysInAMonth;
        long age = (dayAge * 24 * 60 * 60);
        System.out.println("Your age in seconds is " + age);
        System.out.println("you have lived " + (age/(2.5 * 10000000))+ "% of your life");
    }
}