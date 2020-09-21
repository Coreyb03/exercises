import java.util.Scanner;

public class delicatessen{
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("what is the name of the meal?");
        String food = scanner.next();
        System.out.println("what is the price in cents");
        int price = scanner.nextInt();
        System.out.println("Do you want express delivery(0 - no, 1 - yes)?");
        int delivery = scanner.nextInt();

        boolean express = (delivery == 1)? true : false ;

        int totalPrice =0;
        if (!(express)){
            if (price > 1000){
                totalPrice = price;
            } else {
                totalPrice = price + 200;
            }
        } else {
            totalPrice = price + 300;
        }

        System.out.println("the total price of " + food + " is $" + (totalPrice/100));
    }
}