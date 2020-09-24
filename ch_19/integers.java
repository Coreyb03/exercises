import java.util.Scanner;

public class integers{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("What is the start and end value?");
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        System.out.println("Start value: "+start);
        while (start <= end) {
            System.out.println(start);
            start++;
        }
        System.out.println("End value: "+ end);


    }
}