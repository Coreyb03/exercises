import java.util.Scanner;

public class FactorialError{
    public static long factorial(int num){
        long factorial = 1;
        if (num <= 20 && num > 0){
            for (int i = 1; i<=num; i++){
                //System.out.println(i);
                factorial *= i;
            }
            return factorial;
        } else {
            return -1;
        }
        
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What number do you want to factorialize? (max 20)");
        int num = scanner.nextInt();
        while (factorial(num) != -1){
            long ans = factorial(num);
            System.out.println("" + factorial(num));
            System.out.println("What number do you want to factorialize? (max 20)");
            num = scanner.nextInt();

        }
    }
}