import java.util.Scanner;

public class circleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the radius?");
        double rad = scan.nextDouble();
        double area = (rad * rad * Math.PI);
        double area2 = rad * rad ;
        System.out.println("The area is "+ area + " or " + area2 + "π");
    }
}