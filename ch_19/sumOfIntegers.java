import java.util.Scanner;

public class sumOfIntegers{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("What is the N value?");
        int N = scanner.nextInt();
        System.out.println("N value: " + N);
        int sum = 0;
        int i= 0;
        while (i < N) {
            i++;
            sum += i;
        }
        int sum2 = (N*(N+1))/2;
                    
        System.out.println("sum value: "+ sum);
        System.out.println("formula sum value: "+ sum2);




    }
}