import java.util.Scanner;

public class creditCard{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your balance");
        double balance = scanner.nextDouble();
        System.out.println("how much will you pay per month");
        double payment = scanner.nextDouble();

        double totalPayment =0;
        double amountDue = 1000;
        int month =0;

        while (balance > 0 && amountDue >= 0){
            if (amountDue >= 0){
                if (balance > 0){
                    amountDue = amountDue - payment;
                    month++;
                    balance = (balance - (balance * 0.015) )- payment; 
                    totalPayment += payment;
                } else {
                    System.out.println("Your balance is less than zero");
                }
            } else {
                System.out.println("Congrats you payed off you credit card bill");
            }
            System.out.println("Month: " + month + "\tbalance: " + balance + "\tTotal Payments: " +totalPayment);
        }

    }
}