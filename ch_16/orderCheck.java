import java.util.Scanner;

public class orderCheck{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How many bolts, nuts, and washer put a space between");
        int bolt = scanner.nextInt();
        System.out.println("number of bolts: "+ bolt);
        int nut = scanner.nextInt();
        System.out.println("number of nuts: "+ nut);
        int washer =  scanner.nextInt();
        System.out.println("number of washers: "+ washer);
        int price = (5*bolt + 3*nut + washer);

        if (nut >= bolt) {
            if (washer >= 2*bolt){
                System.out.println("\nThe order is correct\nthe price is: "+ price);
            } else {
                System.out.println("too few washers");

            }

        } else {
            System.out.println("too few nuts");
            if (!(washer >= 2*bolt)){
                System.out.println("too few washers");

            }
        }

    }
}