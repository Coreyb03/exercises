public class trig{
    public static void main(String[] args) {
        double value = 0.0;
        double sine = Math.sin(value);
        double cosine = Math.cos(value);
        double sum = Math.pow(sine,2) + Math.pow(cosine,2);
        System.out.println("Sine:\t " + sine + "\nCosine:\t " + cosine + "\nSum of the squares:\t " + sum);
    }
}