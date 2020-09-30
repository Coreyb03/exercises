import java.util.Scanner;

public class drugEffectiveness{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many months have you had this drug?");
        int months = scanner.nextInt();
        double effectiveness = 100.0;

        while (effectiveness > 50){
            System.out.println("months: " + months + " Effectiveness: " + effectiveness);
            effectiveness = effectiveness *.96;
            if (effectiveness < 50.0){
                System.out.print("DISCARD");
            }
            months++;
        }

    }
}