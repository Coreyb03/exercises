public class PrimeNum{
    public static void main(String[] args) {
        System.out.println(isPrime(7,2));
    }

    public static boolean isPrime(int n, int i){
        if (n <= 2){ 
            return (n == 2) ? true : false; 
        } else if (n % i == 0){ 
            return false; 
        } else if (i * i > n){ 
            return true;
        }
        return isPrime(n, i + 1); 
    }

}