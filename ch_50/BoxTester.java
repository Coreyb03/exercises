public class BoxTester
{

  public static void main ( String[] args )
  {
    ImmutableBox box = new ImmutableBox( 2.5, 5.0, 6.0 ) ;

    System.out.println( "Area: "  + box.area() + " volume: " + box. volume() );

    System.out.println( "length: " + box.length() + " height: " + box.height() +  " width:  " + box.width() )  ;

    System.out.println( "topArea: "  + box.topArea() + " sideArea: " + box.sideArea() + " faceArea: " + box.faceArea() );

    ImmutableBox box2 = new ImmutableBox(box);

    System.out.println( "length: " + box2.length() + " height: " + box2.height() +  " width:  " + box2.width() )  ;

  }
}