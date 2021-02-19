public class VowelRemove {
    public static void main(String[] args) {
        System.out.println(vowelRemove("VooDoo"));
    }

    public static String vowelRemove(String s){
        String first = s.substring(0, 1);
        String last = s.substring(1);

        if (s.length() < 0 || s == null){
            return s;
        } else if (s.length() == 1){
            return s.toLowerCase().matches("[aeiou]")? "" : s;
        } else if (first.length() < 0){
            return "";
        }

        return (first.toLowerCase().matches("[aeiou]")? "" : first) + vowelRemove(last);
    }
}
