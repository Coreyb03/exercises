import java.util.Scanner;

public class oneLetter{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a word:");
        String word = scanner.nextLine();
        int times = word.length();

        int i =0;
        while (i < times){
            System.out.println(word.charAt(i));
            i++;
        }
    }
}