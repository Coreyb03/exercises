import java.util.Scanner;

public class Groundbeef{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("price per pound of package A and percent lean of package A");
        double priceA = scanner.nextDouble();
        double percentA = scanner.nextDouble();

        System.out.println("price per pound of package B and percent lean of package B");
        double priceB = scanner.nextDouble();
        double percentB = scanner.nextDouble();

        System.out.println("Package A cost per pound of lean: " + (priceA / (percentA/100)));
        System.out.println("Package B cost per pound of lean: " + (priceB / (percentB/100)));

        boolean isPackageABetter = ((priceA / (percentA/100))<(priceB / (percentB/100)))? true : false;
        
        if (isPackageABetter) {
            System.out.println("package A is a better deal");
        } else {
            System.out.println("package B is a better deal");
        }
    }
}