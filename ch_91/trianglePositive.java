import java.util.Scanner;

public class trianglePositive
{
  public static void main ( String[] args)
  {
    Scanner scanner =  new Scanner(System.in);
    triangleCalc tri = new triangleCalc();
    System.out.println("how many rows of a triangle number do you want?");
    int n = scanner.nextInt();
    while ( n < 0){
        n = scanner.nextInt();
    }
    int result = tri.Triangle( n );
    System.out.println("Triangle(" + n +  ") is " + result );
  }
}