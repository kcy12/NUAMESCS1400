import java.util.*;

public class RockPaperScissors extends Game {

static String choiceRock = "rock";
static String choicePaper = "paper";
static String choiceScissors = "scissors";

   public static String getUserChoice(Scanner in) {
      //init vars
      String userChoice = "";
      boolean bool = false;

      //greet
      System.out.println("Rock, Paper or Scissors?");
      
      //get user choice of rock, paper, or scissors
      userChoice = in.next();
      
      //////while choice is invalid
      while (bool != true) {
         if (userChoice.equalsIgnoreCase(choiceRock)) {
            bool = true;
         }
         else if (userChoice.equalsIgnoreCase(choicePaper)) {
            bool = true;
         }
         else if (userChoice.equalsIgnoreCase(choiceScissors)) {
            bool = true;
         }
         else {
            System.out.println("That's not a valid input. Try again:");
            userChoice = in.next();
         }
      }
   
      
      //return choice
      return userChoice;
      
   }//end getUserChoice method
      
   public static String getCPUChoice(Random r) {
      //init vars etc
      String cpuChoice = "";
      int randomNum = (r.nextInt(3) + 1);
      
      //choose and return CPU choice
      if (randomNum == 1) {
         cpuChoice = choiceRock;
      }
      if (randomNum == 2) {
         cpuChoice = choicePaper;
      }
      if (randomNum == 3) {
         cpuChoice = choiceScissors; 
      }
      
      return cpuChoice;

   }//end getCPUChoice method
   
   public static String pickWinner(String userChoice, String CPUChoice) {
      //init vars
      String winner = "";
      
      //if user chooses rock
      if (userChoice.equalsIgnoreCase(choiceRock)) {
         if (CPUChoice.equalsIgnoreCase(choiceRock)){
            winner = "Tie";
         }
         else if (CPUChoice.equalsIgnoreCase(choicePaper)){
            winner = "Computer";
         }
         else if (CPUChoice.equalsIgnoreCase(choiceScissors)){
            winner = "User";
         }         
      }
      //if user chooses paper
      else if (userChoice.equalsIgnoreCase(choicePaper)) {
         if (CPUChoice.equalsIgnoreCase(choiceRock)){
            winner = "User";
         }
         else if (CPUChoice.equalsIgnoreCase(choicePaper)){
            winner = "Tie";
         }
         else if (CPUChoice.equalsIgnoreCase(choiceScissors)){
            winner = "Computer";
         }         
      }
      //if user chooses scissors
      else if (userChoice.equalsIgnoreCase(choiceScissors)) {
         if (CPUChoice.equalsIgnoreCase(choiceRock)){
            winner = "Computer";
         }
         else if (CPUChoice.equalsIgnoreCase(choicePaper)){
            winner = "User";
         }
         else if (CPUChoice.equalsIgnoreCase(choiceScissors)){
            winner = "Tie";
         }         
      }
      //else somehow
      else {
         winner = "you broke it";
      }
       
      return winner;   
   
   }//end pickWinner method
   
}//end class