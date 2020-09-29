import java.util.Scanner;

public class starWedge{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("initial number of stars");
        int n = scanner.nextInt();

        while (n > 0){
            String stars = "";
            while ((stars.length() < n)){
                stars += "*";
            }
            n = n - 1;
            System.out.println(stars);
        }
       }
}