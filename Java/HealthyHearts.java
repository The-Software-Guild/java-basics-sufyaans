package Java;

import java.util.Scanner;
import java.util.Random;

public class HealthyHearts {
    public static void main(String[] args){
        //Variabls
        int age;
        int maxHeartRate = 220;

        //Inputs
        Scanner scanner1 = new Scanner(System.in); 
        System.out.println("Enter your age: ");
        age = scanner1.nextInt();

        //Calculations
        int maxRate = maxHeartRate - age;
        float maxZone = Math.round(maxRate*0.85);
        float minZone = Math.round(maxRate*0.50);

        //Outputs
        System.out.println("\nYour maximum heart rate should be " + maxRate + " beats per minute.");
        System.out.println("\nYour target HR Zone is " + minZone +"-" + maxZone + " beats per minute.");
    }   
}
