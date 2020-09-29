import java.util.Scanner;

public class squareCube{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("what is the upper limit");
        int n = scanner.nextInt();

        int i = 0;
        int square = 0;
        int cube = 0;
        while (i <= n){
            square += Math.pow(i, 2);
            cube += Math.pow(i, 3);
            i++;
        }
            System.out.println("the sum of the squares is "+square);
            System.out.println("the sum of the cubes is "+cube);

       }
}