import java.util.Scanner;

import javax.swing.text.StyledEditorKit;

public class deviation{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter n");
        int n = scanner.nextInt();


        int i = 0;
        double avg = 0.0;
        double number = 0.0;
        double avgSquare = 0.0;
        while (i < n){
            System.out.println("enter a floating point number");
            number = scanner.nextDouble();

            avg += number;
            avgSquare += Math.pow(number, 2) ;
            i++;
        }
        double standard = Math.sqrt((avgSquare/n) - ((avg/n)*(avg/n)));
        System.out.println("the average deviation is " + avg/n);
        System.out.println("the standard deviation is " + standard);
    }
}