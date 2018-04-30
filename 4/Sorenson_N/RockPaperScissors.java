/***************
*Niklas Sorenson
*Rock paper scissors
*4/13/17
***************/
//import libraries
import java.util.Scanner;
import java.util.Random;
//RockPaperScissors
public class RockPaperScissors{

   //getUserChoice(Scanner in)
   public String getUserChoice(Scanner in){
      String userInput = "";
      
      while (userInput == ""){
         try {
            System.out.println("Enter 'rock', 'paper', or 'scissors'");
            //get user choice of rock, paper, or scissors
            userInput = in.nextLine();

            if (userInput.equals("rock") || userInput.equals("paper") || userInput.equals("scissors")){
               return userInput;
            }
            //while choice is invalid
            else  {
               userInput = "";
               throw new Exception ("Please enter 'rock', 'paper', or 'scissors' and note that they are case-sensitive");
            }
         }
         catch (Exception except){
               System.out.println(except.getMessage());
               System.out.println("Try again: That's not a valid input.");
         }

      }
      return "Error: Shouldn't get here";
   }   
   //getCPUChoice(int seed)
   public String getCPUChoice (Random rand){
      int ascribeToThis = rand.nextInt(3)+1;
      String cpuChoice;
      if (ascribeToThis == 1){
         cpuChoice = "rock";
      }
      else if (ascribeToThis == 2){
         cpuChoice = "paper";
      }
      else   {
         cpuChoice = "scissors";
      }
   
   return cpuChoice;
   }
   //pickWinner(String userChoice, String CPUChoice)
   public String pickWinner (String userChoice, String cpuChoice){
      if (userChoice.equalsIgnoreCase("rock")){
         if (cpuChoice.equalsIgnoreCase("scissors")){
            return "User";
         }
         
         else if (cpuChoice.equalsIgnoreCase("paper")){
            return "Computer";
         }
         else  {
            return "Tie";
         }
      }
      
      if (userChoice.equalsIgnoreCase("paper")){
         if (cpuChoice.equalsIgnoreCase("rock")){
            return "User";
         }
         
         else if (cpuChoice.equalsIgnoreCase("scissors")){
            return "Computer";
         }
         else  {
            return "Tie";
         }
      }
      
      if (userChoice.equalsIgnoreCase("scissors")){
         if (cpuChoice.equalsIgnoreCase("paper")){
            return "User";
         }
         
         else if (cpuChoice.equalsIgnoreCase("rock")){
            return "Computer";
         }
         else  {
            return "Tie";
         }
      }
      return "Error, we shouldn't have made it this far."; 
   }
}// end RockPaperScissors