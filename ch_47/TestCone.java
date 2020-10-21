public class TestCone
{
  public static void main( String[] args ) 
  {
    Cone cone  = new Cone( 1.2, 4.56 );
    System.out.println( "cone area: " + cone.area() 
      + " volume: " + cone.volume() );

    System.out.println( "cone slant height: " + cone.slantHeight() 
      + " angle: " + cone.angle() );
  }
}