import java.io.*;
import java.util.Scanner;

public class DeviationFile{
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("What is the name of your file? (DeviationData.txt)");
            File file = new File(scanner.nextLine());
            Scanner fileScanner = new Scanner(file);
            Double sum = 0.0;
            Double sumSQ = 0.0;
            int n = 0;
            while (fileScanner.hasNextDouble()){
                n++;
                sum += fileScanner.nextDouble();
                sumSQ += Math.pow(fileScanner.nextDouble(), 2);
            } 

            sum = sum / n;
            sumSQ = sumSQ/n;

            double sd = Math.sqrt(sumSQ - (sum * sum));
            System.out.println("The avg deviation is " + sum);
            System.out.println("The standard deviation is " + sd);

            
        } catch (FileNotFoundException error){
            System.out.println("That file doesn't exist!");
            System.exit(0);
        } finally {
            System.out.println("done");
        }
    }
}