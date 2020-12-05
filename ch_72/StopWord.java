import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class StopWord{
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("What is the name of your imput file? (textImput.txt)");
            File inputFile = new File(scanner.nextLine());
            System.out.println("What is the name of your output file? (output.md)");
            PrintWriter outputFile = new PrintWriter(scanner.nextLine());
            
            File stopList = new File("stopList.txt");
            Scanner stopListScanner = new Scanner(stopList);

            String[] words = stopListScanner.nextLine().split(",");
            Scanner fileScanner = new Scanner(inputFile);
            while(fileScanner.hasNext()){
                int i=0;
                String string = fileScanner.next();
                while((!(string.equalsIgnoreCase(words[i]))) && (i < (words.length - 1))){
                    i++;
                   
                }
                if(!(string.equalsIgnoreCase(words[i]))){
                    outputFile.print(string + " ");
                }
            }
            

            outputFile.close();
            
            
            
        } catch (FileNotFoundException error){
            System.out.println("That file doesn't exist!");
            System.exit(0);
        } finally {
            System.out.println("done");
        }
    }
}