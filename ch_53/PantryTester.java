import java.util.Scanner;

public class PantryTester
{
  public static void main ( String[] args )
  {
    Scanner scanner = new Scanner(System.in);
    int selectInput = 0;
    Jam goose = new Jam( "Gooseberry", "7/4/86", 12 );
    Jam apple = new Jam( "Crab Apple", "9/30/99", 8 );
    Jam rhub  = new Jam( "Rhubarb", "10/31/99", 16 );

    Pantry hubbard = new Pantry( goose, apple, rhub );
    System.out.println( hubbard );

    while ( selectInput != -1 ){
        System.out.println("which jam do you want to spread?(1,2,3)");
        selectInput = scanner.nextInt();
        if (selectInput != -1){
        hubbard.select(selectInput);
        System.out.println("how much do you want to spread?");
        hubbard.spread(scanner.nextInt());
        System.out.println( hubbard );
        } else {
            System.out.println("Bye");
        }
    } 

  }
}