import java.util.Scanner;
import java.util.Random;

public class snakeEyes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("How many times should this run?");
        int limit = scanner.nextInt();
        int timesRan = 0;
      
        int scoreSum = 0;
        int turnSum = 0;
        int moreThan4 = 0;
                
        while (limit > timesRan){
            int dice1 = rand.nextInt(5) + 1;
            int dice2 = rand.nextInt(5) + 1;
            int turns = 0;
            int score = 0;
            while (!(dice1 == dice2 && dice1 == 1)){
                turns++;
                score += dice1+dice2;
                dice1 = rand.nextInt(5) + 1; //added 1 to get the correct dice value 
                dice2 = rand.nextInt(5) + 1; // if you roll a 0 it becomes 1
                
            }
            scoreSum += score;
            turnSum += turns;
            if (turns > 4){
                moreThan4++;
            }
            timesRan++;
            
        }
        System.out.println("Average number of turns: " + turnSum/(1.0*limit)); //always about 24
        System.out.println("Average score: " + scoreSum/(1.0*limit)); //always about 148
        System.out.println("percent of players who got more than 4 rolls " + (100.0*moreThan4)/(1.0*limit) + "%"); //always about 81.5%


    }
}