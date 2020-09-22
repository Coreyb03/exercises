import java.util.Scanner;

public class fantasyGame{
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter you characters name");
        String name = scanner.next();
        System.out.println("enter your characters stats (the total stats cant exceed 15)");
    
        System.out.print("luck: ");
        int luck = scanner.nextInt();
        System.out.print("strength: ");
        int str = scanner.nextInt();
        System.out.print("health: ");
        int health = scanner.nextInt();

        if (luck + str + health > 15){
            luck =5;
            str =5;
            health =5;
        }

        System.out.println( name +"'s stats are " + luck + " luck " + str + " strength " + health + " health");
    
    
    }   
}