public class Lpr{
    public static void main(String[] args) {
        System.out.println(leastRes(14, 18));
    }

    public static int leastRes(int a, int m){
        if (a >= m){
            return leastRes(a-m,m) ; 
        } else if(a < 0){
            return leastRes(a+m,m);
        }

        return a;
    }
}