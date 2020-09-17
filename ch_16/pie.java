import java.util.Scanner;

public class pie{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("what is your weight?");
        int weight = scanner.nextInt();

        boolean canParticipate = (Math.abs(250 - weight) <= 30) ? true : false;

        if (canParticipate){
            System.out.println("Congratulations, you can participate");
        }else {
            System.out.println("Sorry, you can't participate");
        }
    
    }   
}