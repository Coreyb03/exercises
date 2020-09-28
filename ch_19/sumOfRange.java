import java.util.Scanner;

public class sumOfRange{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("What is the start value?");
        int start = scanner.nextInt();
        
        System.out.println("What is the end value?");
        int end = scanner.nextInt();
        
        
        int sumEnd= ((end*(end+1))/2); 
        int sumStart = ((start-1)*start)/2;

        System.out.println("sum value: "+ (sumEnd-sumStart));




    }
}