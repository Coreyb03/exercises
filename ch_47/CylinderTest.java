import java.util.Scanner;

public class CylinderTest{
    public static void main( String[] args ) 
    {
      Scanner scan = new Scanner(System.in);
  
      double radius, height;
  
      System.out.print("Enter radius: " ); 
      radius = scan.nextDouble();
  
      System.out.print("Enter height: " ); 
      height = scan.nextDouble();
   
      Cylinder cylinder = new Cylinder( radius, height );

      System.out.println("The volume of the cylinder is " + cylinder.volume() + " and the surface area is " + cylinder.surfaceArea());
    }
}