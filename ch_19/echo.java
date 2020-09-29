import java.util.Scanner;

public class echo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a word:");
        String word = scanner.next();
        int times = word.length();
        System.out.print("\n");
        int i =0;
        while (i < times){
            System.out.println(word);
            i++;
        }
    }
}