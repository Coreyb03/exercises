public class subString
{
  public static void main ( String[] args )
  {
    String str = new String( "Golf is a good walk spoiled." ); // create the original object

    String sub = str.substring(8, 10); 
    String sub2 = str.substring(8, 8); 
    String sub3= str.substring(0, str.length()); 

    System.out.println( sub );
    System.out.println( sub2 );
    System.out.println( sub3 );

  }
}