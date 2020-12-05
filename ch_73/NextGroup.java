import java.io.*;
import java.util.Scanner;

public class NextGroup{
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("File name?(enter quit to end)");
            String fileName = scanner.nextLine();
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);
            int groupNumber = 0;
            while(fileScanner.hasNext("next")){
                String string = new String(fileScanner.next());
                int sum = 0;
                if (string.equalsIgnoreCase("next")){
                    while(fileScanner.hasNextInt()){
                        sum += fileScanner.nextInt();
                    }
                }
                groupNumber += 1;
                System.out.println("group " + groupNumber + " has a sum of " + sum);
            }

        } catch (FileNotFoundException error){
            System.out.println("That file doesn't exist!");
            System.exit(0);
        } finally {
            System.out.println("done");
        }
    }
}