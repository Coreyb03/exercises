public class PascalsTriangle {
    public static void main(String[] args) {
        System.out.println(tri(3, 2));
    }

    public static int tri(int row, int col){
        if (col == 0 || row == col){
            return 1;
        }

        return tri(row-1, col) + tri(row - 1, col - 1); 
    }
}
