public class stringMethod{
    public static void main(String[] args) {
        String first = new String("         The Ca  r is             R E D                          ");
        String second;

        second = first.trim();

        System.out.println(first);
        System.out.println(second);

    }
}