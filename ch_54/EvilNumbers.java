import java.util.Scanner;

public class EvilNumbers{
    public static Boolean Odious(int num){
        int oneCount = 0;
        while (num > 0){
            if (num % 2 ==1){
                oneCount += 1;
            }
            num = num / 2;
        }

        if (oneCount % 2 == 0){
            return false;
        } else {
            return true;
        }
    }
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your positive number?");
        int num = scanner.nextInt();
        Boolean isEvil = Odious(num);
        if (isEvil){
            System.out.println(num + " is EVIL!!!");
        } else {
            System.out.println("Phew, " + num + " is odious");
        }
    }
}