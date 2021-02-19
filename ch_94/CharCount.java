public class CharCount{
    public static void main(String[] args) {
        System.out.println(count("Hello how are you today?", "l"));
    }

    public static int count(String s, String c){
        String first = s.substring(0,1);
        String end = s.substring(1);

        if (s.length() < 0 || s == null){
            return 0;
        } else if (s.length() == 1){
            return s.toLowerCase().equals(c.toLowerCase())? 1 : 0;
        } else if (first.length() < 0){
            return 0;
        }


        return (first.toLowerCase().equals(c.toLowerCase())? 1 : 0 )+ count(end, c);
    }
}
