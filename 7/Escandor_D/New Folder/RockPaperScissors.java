/***
*Dana Escandor
*rps
*4/15/2018
***/
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors{
   Scanner in = new Scanner(System.in);
   public static String choiceRock = "Rock";
   public static String choicePaper = "Paper";
   public static String choiceScissors = "Scissors";

   public String getUserChoice(Scanner in){
      String userChoice;
      
      userChoice = in.nextLine();
      while(!userChoice.equalsIgnoreCase(choiceRock) && !userChoice.equalsIgnoreCase(choicePaper) && !userChoice.equalsIgnoreCase(choiceScissors)){
         System.out.print("That's not a valid input. Try again: ");
         userChoice = in.nextLine();
         }
      return userChoice;
      }

   public String getCPUChoice(Random r){
      Random rand = new Random();
      int changeCase = 0;
      //random
      changeCase = rand.nextInt(3);
      String CPUChoice = "";

      switch(changeCase){
         case 0:
            CPUChoice = "Rock";
            break;
         case 1:
            CPUChoice = "Paper";
            break;
         case 2:
            CPUChoice = "Scissors";
      }
      return CPUChoice;
   }

   public String pickWinner(String userChoice, String CPUChoice){
      String pickingWinner = "";
      if(userChoice.equalsIgnoreCase(choiceRock) && CPUChoice.equalsIgnoreCase(choiceRock)){
         pickingWinner = "Tie";
      }
      else if(userChoice.equalsIgnoreCase(choiceRock) && CPUChoice.equalsIgnoreCase(choiceScissors)){
         pickingWinner = "User";

      }
      else if(userChoice.equalsIgnoreCase(choicePaper) && CPUChoice.equalsIgnoreCase(choicePaper)){
         pickingWinner = "Tie";
      }
      else if(userChoice.equalsIgnoreCase(choiceScissors) && CPUChoice.equalsIgnoreCase(choiceScissors)){
         pickingWinner = "Tie";
      }
      else if(userChoice.equalsIgnoreCase(choicePaper) && CPUChoice.equalsIgnoreCase(s)){
         pickingWinner = "Computer";
      }
      else if(userChoice.equalsIgnoreCase(choiceRock) && CPUChoice.equalsIgnoreCase(choicePaper)){
         pickingWinner = "Computer";
      }
      return pickingWinner;

   }
}
