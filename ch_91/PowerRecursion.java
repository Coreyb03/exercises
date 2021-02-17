public class PowerRecursion {
    public static void main(String[] args) {
        System.out.println(powRecursion(5));
    }

    public static int powRecursion(int n){
        if (n == 0){
            return 1;
        }

        return 2 * powRecursion(n-1);
    }
}
