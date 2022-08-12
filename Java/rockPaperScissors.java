package Java;

import java.util.Scanner;
import java.util.Random;

class RockPaperScissorsLoop
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int val;
        String userChoice = "";
        String computerChoice = "";
        int userWins = 0;
        int computerWins = 0;
       
        // User chooses number of rounds
        Scanner rounds = new Scanner(System.in); 
        System.out.print("Enter number of rounds: ");
    
        
        int xRounds = rounds.nextInt();
        if (xRounds < 1 ){
            System.out.print("Invalid Entry");
            System.exit(0);

        // System.out.println("Number of rounds: " + xRounds); 

        
        for(int i=0;i< xRounds;i++)
        {
            //User choice
            System.out.print("\nPlease choose (1) Rock, (2) Paper, or (3) Scissors: ");
            
            userChoice = sc.nextLine();
            
            // Computer choice
            val = rand.nextInt(3);
            
            if(val == 0)
            {
                computerChoice = "1";
            }
            else if(val == 1)
            {
                computerChoice = "2";
            }
            else if(val == 2)
            {
                computerChoice = "3";
            }
            
            // Outputting computer choice
            if(computerChoice.equals("3"))
            {
                System.out.println("Computer chose scissors");
            }
            
            else if(computerChoice.equals("1"))
            {
                System.out.println("Computer chose rock");
            }
            
            else if(computerChoice.equals("2"))
            {
                System.out.println("Computer chose paper");
            }
            
            // Finding who wins
            if(userChoice.equals("1") && computerChoice.equals("3"))
            {
                System.out.println("User won");
                userWins++;
            }
            
            else if(userChoice.equals("2") && computerChoice.equals("1"))
            {
                System.out.println("User won");
                userWins++;
            }
            
            else if(userChoice.equals("3") && computerChoice.equals("2"))
            {
                System.out.println("User won");
                userWins++;
            }
            
            else if(userChoice.equals("3") && computerChoice.equals("1"))
            {
                System.out.println("Computer won");
                computerWins++;
            }
            
            else if(userChoice.equals("1") && computerChoice.equals("2"))
            {
                System.out.println("Computer won");
                computerWins++;
            }
            
            else if(userChoice.equals("2") && computerChoice.equals("3"))
            {
                System.out.println("Computer won");
                computerWins++;
            }
            
            else if(userChoice.equals(computerChoice))
            {
                System.out.println("Draw");
            }

            // Display score
            System.out.println("User Score: " + userWins + " Computer Score: " + computerWins);
        }
        
        // Finding final winner
        if(userWins > computerWins)
        {
            System.out.println("User wins");
        }
        else if (userWins < computerWins)
        {
            System.out.println("Computer wins");
        }
        else
        {
            System.out.println("Draw");
        }
    }
}
}
