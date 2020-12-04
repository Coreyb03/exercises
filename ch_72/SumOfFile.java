import java.io.*;
import java.util.Scanner;

public class SumOfFile{
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("What is the name of your file? (SumData.md)");
            File file = new File(scanner.nextLine());
            Scanner fileScanner = new Scanner(file);
            int sum = 0;

            while (fileScanner.hasNextInt()){
                int num = fileScanner.nextInt();
                sum += num;
            } 

            System.out.println("the sum of the numbers is " + sum);
        } catch (FileNotFoundException error){
            System.out.println("That file doesn't exist!");
            System.exit(0);
        } finally {
            System.out.println("done");
        }
    }
}