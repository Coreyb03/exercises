import java.util.Scanner;

public class SumOdd{  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is the value of n");
        int n = scanner.nextInt();

        int sumOdd =0;
        int sumsquare =0;
        for (int nOdd = n; nOdd > 0; nOdd --){
            if (nOdd % 2 == 1){
                sumOdd += nOdd;
            }
        }

        for (int nsquare = n*n; nsquare > 0; nsquare --){
            if (nsquare % 2 == 1){
                sumsquare += nsquare;
            }
        }
        System.out.println("the sum of all odd number of 1 to n is "+ sumOdd);
        System.out.println("the sum of all odd number of 1 to n^2 is "+ sumsquare);

    }
}