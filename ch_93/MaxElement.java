public class MaxElement {
    public static void main(String[] args) {
        int[] array = {1,5,2,4,3};
        System.out.println(findMax(array, 0));
    }

    public static int findMax(int[] array, int index){
        if (index == array.length){
            return array[0];
        }

       return (array[index] >= findMax(array, index + 1) ? array[index] : findMax(array, index + 1));
    }
}
