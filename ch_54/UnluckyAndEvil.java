import java.util.Scanner;

public class UnluckyAndEvil{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the Number?");
        int num = scanner.nextInt();
        while (num >= 0){
            
            if (thirteenCheck(num) && Odious(num)){
                System.out.println(num + " is Evil and Odious!");
            } else {
                System.out.println(num + " is safe.");
            }

            System.out.println("What is the next number?");
            num = scanner.nextInt();
        }
    }
    public static boolean thirteenCheck(int num){
        String numString = Integer.toString(num);
        if (numString.contains("13")){
            return true;
        } else {
            return false;   
        }
    }   
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
}