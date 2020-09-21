import java.util.Scanner;

public class movie{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("what is your age?");
        int age = scanner.nextInt();
        System.out.println("what is the time (use 24 hour time)?");
        int time = scanner.nextInt();

        int price = 0 ;

        boolean kid = (age < 13)? true : false ;
        if (kid){
            if (time > 1700){
                price = 4;
            } else {
                price = 2;
            }

        } else {
            if (time > 1700){
                price = 8;
            } else {
                price = 5;
            }
        }
        System.out.println("the price of the movie ticket is $" + price);
    }
}