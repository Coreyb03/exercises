import java.util.Scanner;

public class addingUp{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("how many integers will be added up?");
        int timesAdded = scanner.nextInt();

        int times =0;
        int sum = 0;
        while (times < timesAdded){
        System.out.println("enter an integer");
        int number = scanner.nextInt();

        sum += number;
        times++;
        }
        System.out.println("the sum is " + sum);
    }
}