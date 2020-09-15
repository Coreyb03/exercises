import java.util.Scanner;

public class SubstringFun {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter a string");
        String string = scan.nextLine();
        System.out.println("enter a begining and ending index seperated by spaces");
        int begin = scan.nextInt();
        int end = scan.nextInt();
        String newstring = string.substring(begin , end);
        System.out.println("original string: " + string);
        System.out.println("new string: " + newstring);

    }
}