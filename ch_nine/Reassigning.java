public class Reassigning {
    public static void main(String[] args) {
        double x = 0.0;
        double answer = 3*(x*x) - 8*(x) + 4;

        x = 0.5;
        answer = 3*(x*x) - 8*(x) + 4;
        System.out.println("Value of 3x^2-8x + 4 when x = " + x + " is " + answer);
        x = 2.0;
        answer = 3*(x*x) - 8*(x) + 4;
        System.out.println("Value of 3x^2-8x + 4 when x = " + x + " is " + answer);
        x = 4.0;
        answer = 3*(x*x) - 8*(x) + 4;
        System.out.println("Value of 3x^2-8x + 4 when x = " + x + " is " + answer);

    }
}