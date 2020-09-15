import java.util.Scanner;

public class discount{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("what is the price in cents");
        int price = scanner.nextInt();
        double newPrice = price;
        if (price > 1000 ){
            newPrice = price* 0.9;
        }
        System.out.println("The new price is ¢" +newPrice);
    }
}