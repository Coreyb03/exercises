import java.util.*;

public class TriangleNoClass {
    public static void main(String[] args) {
    Scanner scanner =  new Scanner(System.in);
    System.out.println("how many rows of a triangle number do you want?");
    int n = scanner.nextInt();
    while ( n < 0){
        n = scanner.nextInt();
    }
    int result = triangleNum( n );
    System.out.println("Triangle(" + n +  ") is " + result );
    }

    public static int triangleNum( int n ){
        if ( n == 1){
            return 1;
        }
        return n + triangleNum(n - 1);
    }
}
