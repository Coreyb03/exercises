import java.io.*;
import java.util.Scanner;

public class Filter{
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("What is the name of your Data file? (FilterData.csv)");
            File file = new File(scanner.nextLine());
            System.out.println("What is the name of your Positive file? (Pos.md)");
            PrintWriter posOutput = new PrintWriter(scanner.nextLine());
            System.out.println("What is the name of your Negative file? (Neg.md)");
            PrintWriter negOutput = new PrintWriter(scanner.nextLine());
            Scanner fileScanner = new Scanner(file);
           
            while (fileScanner.hasNext()){
                int num = fileScanner.nextInt();
                if (num >= 0){
                    posOutput.println(num);
                } else {
                    negOutput.println(num);
                }
            } 
            posOutput.close();
            negOutput.close();
            
        } catch (FileNotFoundException error){
            System.out.println("That file doesn't exist!");
            System.exit(0);
        } finally {
            System.out.println("done");
        }
    }
}