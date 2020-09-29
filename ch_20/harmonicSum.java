import java.util.Scanner;

public class harmonicSum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter n");
        int n = scanner.nextInt();

        int i = 0;
        double sum = 0;

        while (i < n){
            i++;
            sum += (1.0/i);
        }

        System.out.println("the sum is " + sum);
    }
}