import java.io.*;
import java.util.Scanner;

public class Seperate{
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("What is the name of your Data file? (SeperateData.txt)");
            File file = new File(scanner.nextLine());
            Scanner fileScanner = new Scanner(file);
            int xSum =0;
            int ySum =0;

            while (fileScanner.hasNextLine()){
                String var = fileScanner.next();
                if (var.equals("x=")){
                   xSum += fileScanner.nextInt();
                } else if (var.equals("y=")){
                   ySum += fileScanner.nextInt();
                }
            } 
            System.out.println("The sum of x is " + xSum + " and the sum of y is " + ySum);
        } catch (FileNotFoundException error){
            System.out.println("That file doesn't exist!");
            System.exit(0);
        } finally {
            System.out.println("done");
        }
    }
}