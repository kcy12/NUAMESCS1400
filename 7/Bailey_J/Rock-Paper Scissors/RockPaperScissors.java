import java.util.*;

public class RockPaperScissors extends Game {

static String choiceRock = "rock";
static String choicePaper = "paper";
static String choiceScissors = "scissors";

   public static String getUserChoice(Scanner in) {
      //init variables
      String userChoice  = "";
      boolean valid = false;
      //greet and get input
      println("Rock, Paper or Scissors");
      
      userChoice = in.next();
      
      while (valid == false) {
         if (userChoice.equalsIgnoreCase(choiceRock)) {
            valid = true;
         }
         else if (userChoice.equalsIgnoreCase(choicePaper)) {
            valid = true;
         }
         else if (userChoice.equalsIgnoreCase(choiceScissors)) {
            valid = true;
         }
         else {
            println("That's not a valid input. Try again: ");
            userChoice  = in.next();
         }
      }
      
      //return
      return userChoice;
  }
   
   public static String getCPUChoice(Random r) {
      //init variables 
      String cpuChoice = "";
      int randNum;
      randNum = (r.nextInt(3) + 1);
      

      if (randNum == 1) {
         cpuChoice = "Paper"; 
      }
      else if (randNum == 2) {
         cpuChoice = "Rock";
      }
      else if (randNum == 3) {
         cpuChoice = "Scissors";
      }
      
      return cpuChoice;
      
   }
   
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
   }
   public static void println(String theMessage) {
         System.out.println(theMessage);
   }//end print function
   //print
   public static void print(String theMessage) {
         System.out.print(theMessage);
   }//end print function
}