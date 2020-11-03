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

    ImmutableBox box3 = box.BiggerBox(box);
    System.out.println( "length: " + box3.length() + " height: " + box3.height() +  " width:  " + box3.width() )  ;
    
    ImmutableBox box4 = box.SmallerBox(box);
    System.out.println( "length: " + box4.length() + " height: " + box4.height() +  " width:  " + box4.width() )  ;

    System.out.println("Does box fit in box4? " + box.nests(box4));
    System.out.println("Does box fit in box3? " + box.nests(box3));

  }
}