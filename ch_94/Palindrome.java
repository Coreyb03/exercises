public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome("racecars"));
    }

    public static boolean palindrome(String s1){
        return s1.toLowerCase().equals(reverse(s1).toLowerCase());
    }

    public static String reverse(String s){
        if (s.length() < 1){
            return s;
        }

        String first = s.substring(0, 1);
        String last = s.substring(1);

        return reverse(last) + first;
    }
}
