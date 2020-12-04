import java.util.Scanner;

public class unlucky {
    
    public static boolean thirteenCheck(int num){
        String numString = Integer.toString(num);
        //for (int i = 0; numString.length() > i; i++){
            if (numString.contains("13")){
                return true;
            } else {
                return false;   
            }
        //}
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("what is the positive number?");
        num = scanner.nextInt();

        while (num >= 0){
            Boolean numBoolean = thirteenCheck(num);
            if (numBoolean){
                System.out.println(num + " is unlucky! :(");
            } else {
                System.out.println(num + " is Safe! :)");
            }


            System.out.println("what is the positive number?");
            num = scanner.nextInt();
        }
    }
}