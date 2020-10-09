import java.util.Scanner;

public class sheep{  
    public static void main(String[] args) {
        for (int t = 0;t <= 25; t ++){
            double n = 220/(1+10*Math.pow(0.83,t)); 
            System.out.println("the value of n at t="+t+" is " +n);
        }
    }
}