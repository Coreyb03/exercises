public class TriangleNumSubdivide{
    public static void main(String[] args) {
        System.out.println(subdivide(10));
    }

    public static int subdivide(int n){
        triangleCalc tri = new triangleCalc();
        int triangle = tri.Triangle(n);

        if (triangle == 0){
            return 0;
        } else if ( triangle == 1){
            return 1;
        }

        
        return n % 4 + subdivide(n - 1 );
    }
}