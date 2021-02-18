public class Gcd{
    public static void main(String[] args) {
        System.out.println(findGdc(134, 75));
    }

    public static int findGdc(int n, int d){
        if (n == 0){
            return d;
        }

        return findGdc(d%n, n);
    }
}