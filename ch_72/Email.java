import java.io.*;
import java.util.Scanner;

public class Email{
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("What is the name of your data? (EmailData.txt)");
            File file = new File(scanner.nextLine());
            System.out.println("What is the name of your output? (EmailOut.txt)");
            PrintWriter output = new PrintWriter(scanner.nextLine());
            Scanner fileScanner = new Scanner(file);
            
            while (fileScanner.hasNextLine()){
                String string = new String(fileScanner.next());
                if (string.contains("@") && string.contains(".")){
                    output.println(string);
                }
            } 
            output.close();
        } catch (FileNotFoundException error){
            System.out.println("That file doesn't exist!");
            System.exit(0);
        } finally {
            System.out.println("done");
        }
    }
}