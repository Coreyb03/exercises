import java.util.Scanner;

import javax.swing.text.Style;

public class SumDivisor{  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is the value of n");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i < n; i++ ){
            if (n % i == 0) {
                sum += i;
            }    
        }

        System.out.println("the sum of the divisors of n is " + sum);
        if (sum == n){
            System.out.println("n is a perfect number");
        }
    }
}