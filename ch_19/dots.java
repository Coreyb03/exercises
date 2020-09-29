import java.util.Scanner;

public class dots{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the first word:");
        String firstWord = scanner.nextLine();
        System.out.println("enter the second word:");
        String secondWord = scanner.nextLine();
        
        String dots = "";
        while ((firstWord.length() + dots.length() + secondWord.length())<30){
            dots += ".";

        }
        System.out.println(firstWord+dots+secondWord);
    }
}