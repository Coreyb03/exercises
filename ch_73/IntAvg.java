import java.io.*;
import java.util.Scanner;

public class IntAvg{
    public static void main(String[] args) {
        try{
            int sum = 0;
            double n =0;
            Scanner scanner = new Scanner(System.in);
            System.out.println("File name?(enter quit to end)");
            String fileName = scanner.nextLine();
            while (!(fileName.equalsIgnoreCase("quit"))){
                File file = new File(fileName);
                Scanner fileScanner = new Scanner(file);

                while (fileScanner.hasNextInt()){
                    sum += fileScanner.nextInt();
                    n++;
                }
                System.out.println("File name?(enter quit to end)");
                fileName = scanner.nextLine();
            }
            System.out.println("the avg of the ints is " + sum/n);
        } catch (FileNotFoundException error){
            System.out.println("That file doesn't exist!");
            System.exit(0);
        } finally {
            System.out.println("done");
        }
    }
}