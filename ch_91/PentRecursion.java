public class PentRecursion {
    public static void main(String[] args) {
        System.out.println(pentRecursion(5));
    }

    public static int pentRecursion(int n) {
        if (n == 1){
            return 1;
        }

        return pentRecursion(n-1) + (n * 2) + n - 2;
    }
}
