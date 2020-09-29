import java.util.Scanner;

public class power{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("what is the value of x");
        double x = scanner.nextDouble();
        System.out.println("what is the value of n");
        int n = scanner.nextInt();

        int i = 0;
        double sum = 1;
        while (i < n && n>0){
            
            sum = sum *x;
            i++;
            
            
        }
        if (n>0){
            System.out.println(x +" raised to the power of "+ n +" is: " +sum);
        } else {
            System.out.println("n must be positive");
        }
       }
}