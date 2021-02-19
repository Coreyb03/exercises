public class EqualX {
    public static void main(String[] args) {
        System.out.println(equalX("xiuxiu","x:)x(^///^)(^///^)"));
    }

    public static boolean equalX(String s1, String s2){
        if(s1.length() == 0){
            if(s2.length() == 0){
                return true;
            } else {
                return (s2.toLowerCase().contains("x"))? false : true;
            }
        } else if (s2.length() == 0){
            if(s1.length() == 0){
                return true;
            } else {
                return (s1.toLowerCase().contains("x"))? false : true;
            }
        }

        String front1 = s1.toLowerCase().substring(0, 1);
        String tail1 = s1.toLowerCase().substring(1);
        String front2 = s2.toLowerCase().substring(0, 1);
        String tail2 = s2.toLowerCase().substring(1);

        return ((front1.equals("x") ^ front2.equals("x"))? false: true) && equalX(tail1, tail2);
    }
}
