import java.util.Random;
import java.util.Scanner;


public class quiz{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("how many questions would you like?");
        int n = scanner.nextInt();

        int numCorrect =0;
        int i =0;
        while (i < n){
            int x = rand.nextInt(10);
            int y = rand.nextInt(10);
            int ans = y*x;

            System.out.println("What is "+ x +" * "+ y);
            int userAns = scanner.nextInt();
            if (ans == userAns){
                System.out.println("correct");
                numCorrect++;
            } else {
                System.out.println("wrong, the answer is " + ans);
                
            }
            i++;
        }
         System.out.println("You got " + numCorrect + " out of " + n + "correct");
    }
}