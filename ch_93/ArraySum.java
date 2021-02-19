public class ArraySum{
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(sum(array, 0));
    }

    public static int sum(int[] array, int index){
        if (array.length == index){
            return 0;
        }

        return array[index] + sum(array, index + 1);
    }
}