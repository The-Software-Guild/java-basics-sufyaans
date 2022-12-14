package Java;

import java.util.Scanner;
import java.util.Random;

public class DogGenetics {



    public static void main(String[] args)
    {
        //Variables
        String dogName = "";
        String[] breeds = {"St. Bernard", "Chihuahua", "Dramatic RedNosed Asian Pug", "Common Cur", "King Doberman"};
        int maxPercentage = 100;
        int breedPercent = 0;
        Random rand = new Random();

        Scanner scanner1 = new Scanner(System.in); 
        System.out.println("Enter name of dog: ");
        dogName = scanner1.nextLine();
        System.out.println("\nWell then, I have this highly reliable report on Sir Fluffy McFlufferkins Esquire's prestigious background right here.");
        System.out.println("\n" +dogName + " is: ");

        if (dogName.isEmpty()){
            System.out.println("dog name can't be empty");
            System.exit(0);
        }

        for (int i = 0; i < 5; i++) {

            String breed = "";
            breed = breeds[i];

            if (i != 4) {
                breedPercent = rand.nextInt(maxPercentage);
                maxPercentage -= breedPercent;
            } else {
                breedPercent = maxPercentage;
            }
            System.out.println(breed + ": " + breedPercent + "%");
        }

        System.out.println("\nWow, that's QUITE the dog!");
    }
}
