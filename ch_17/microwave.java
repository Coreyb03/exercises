import java.util.Scanner;

public class microwave{
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("how many items are you microwaving?");
        int items = scanner.nextInt();
        System.out.println("what is the single item heating time?");
        int time = scanner.nextInt();

        int heatTime =0;

        if (items == 1){ heatTime = time;}
        if (items == 2){ heatTime = (3 * time)/2;}
        if (items == 3){heatTime = 2 * time;}
        if (items > 3){ heatTime = 9999;}

        int heatTimeMin = heatTime/100;
        int heatTimeSec = heatTime%100;

        System.out.println("heat the " + items + " item(s) for " + heatTimeMin + " minutes and " + heatTimeSec + " seconds");
    }    
}