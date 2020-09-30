import java.util.Scanner;

public class inRange{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("what is the low and high end of the range");
        int low = scanner.nextInt();
        int high = scanner.nextInt();

        int data = 1;
        int sumIn =0;
        int sumOut =0;
        while (data != 0){
            System.out.println("enter data: ");
            data = scanner.nextInt();
            if (data >= low && data <= high){
                sumIn += data;
            } else {
                sumOut += data;
            }

        }
        System.out.println("sum of in-range values " + sumIn);
        System.out.println("Sum of out of range values " + sumOut);

    }
}