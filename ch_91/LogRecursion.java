public class LogRecursion{
    public static void main(String[] args) {
        System.out.println(LogRecursion(32));
    }

    public static int LogRecursion(int n){
        if (n == 1){
            return 0;
        }

        return 1 + LogRecursion(n/2);
    }
}