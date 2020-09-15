import java.util.Scanner;

public class correctChange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many cents do you have?");
        int cent = scan.nextInt();
        int dollar = (cent /100 );
        int dollarRemain = (cent % 100);
        int quarter = (dollarRemain /25);
        int quarterRemain = (dollarRemain % 25); 
        int dime = (quarterRemain /10);
        int dimeRemain = (quarterRemain %10);
        int nickle = (dimeRemain /5);
        int Remain = (dimeRemain %5);
        
        System.out.println("you will recive: " + dollar +" dollars");
        System.out.println("you will recive: " + quarter +" quarters");
        System.out.println("you will recive: " + dime +" dimes");
        System.out.println("you will recive: " + nickle+ " nickles");
        System.out.println("you will recive: " + Remain +" Pennies");

    }
}