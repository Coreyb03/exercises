import java.util.Scanner;
import java.util.Random;

public class snakeEyes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("How many times should this run?");
        int limit = scanner.nextInt();
        double timesRan =0;
        int turns = 0;


        int score =0;
        double scoreSum =0;
        double turnSum = 0;
        double lowRolls =0;
                
        while (limit > timesRan){
            int n1 = 0;
            int n2 = 0;
            turns = 0;
            score =0;
            while (!(n1 == n2 && n1 == 1)){
                n1 = rand.nextInt(5) + 1; //added 1 to get the correct dice value 
                n2 = rand.nextInt(5) + 1; // if you roll a 0 it becomes 1
                score += n1+n2;
                turns++;
            }
            scoreSum += score;
            turnSum += turns;
            if (turns <= 4){
                lowRolls++;
            }
            timesRan++;
            
        }
        System.out.println("Average number of turns: " + turnSum/limit); //always about 25
        System.out.println("Average score: " + scoreSum/limit); //always about 150
        System.out.println("percent of players who got less than 4 rolls " + 100*lowRolls/limit + "%"); //always about 15%


    }
}