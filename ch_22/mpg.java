import java.util.Scanner;

public class mpg{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int intMiles = 0;
        while (intMiles >= 0){
            System.out.println("Initial miles (enter a negitive to quit): ");
            intMiles = scanner.nextInt();
            if (intMiles >= 0){
            System.out.println("Final miles: ");
            int finMiles = scanner.nextInt();
            System.out.println("Gallons of gas: ");
            int gallons = scanner.nextInt();
            
            int mpg = (finMiles - intMiles) / gallons;
            System.out.println("The miles per gallon are: "+mpg);
            }
        }
        System.out.println("bye!");

    }
}