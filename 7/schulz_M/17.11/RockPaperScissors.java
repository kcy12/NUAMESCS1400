//import libraries
import java.util.Scanner;
import java.util.Random;
//RockPaperScissors
public class RockPaperScissors{
   //getUserChoice(Scanner in)
   public String getUserChoice(Scanner s){
      s.nextLine();
     String userChoice = "";
      //get user choice of rock, paper, or scissors
      userChoice = s.nextLine();
      roundsPlayed = s.nextInt();
      //while choice is invalid
      while(!userChoice.equalsIgnoreCase("rock")||!userChoice.equalsIgnoreCase("paper")||!userchoice.equalsIgnoreCase("scissors")){
         System.out.print("That's not a valid input. Try again: ");
         userChoice = s.nextLine();
        }
      //return choice
      return userChoice;
   }//end
   //getCPUChoice(Random r)
   public String getCPUChoice(Random r){
     String cpuChoice ="";
     int randomChoice;
     randomChoice = r.nextInt(2);
     if(randomChoice == 0){
       cpuChoice = "rock";
     }
     else if(randomChoice == 1){
       cpuChoice = "scissors";
     }
     else if(randomChoice == 2){
       cpuChoice = "paper";
     }
     else{
       System.out.println("Try again: That's not a valid input.");
     }
     return cpuChoice;
   }
   //pickWinner(String userChoice, String CPUChoice)
   public String pickWinner(String userChoice, String cpuChoice){
     String result;
    if(userChoice == cpuChoice){
      result = "Tie";
      return result;
    }
    else if(userChoice.equalsIgnoreCase("rock") && cpuChoice.equalsIgnoreCase("paper")){
    result = "Computer";
    return result;
    }
    else if(userChoice.equalsIgnoreCase("paper") && cpuChoice.equalsIgnoreCase("scissors")){
    result = "Computer";
    return result;
    }
    else if(userChoice.equalsIgnoreCase("scissors") && cpuChoice.equalsIgnoreCase("rock")){
    result = "Computer";
    return result;
    }
    else if(userChoice.equalsIgnoreCase("rock") && cpuChoice.equalsIgnoreCase("scissors")){
    result = "User";
    return result;
    }
    else if(userChoice.equalsIgnoreCase("paper") && cpuChoice.equalsIgnoreCase("rock")){
    result = "User";
    return result;
    }
    else if(userChoice.equalsIgnoreCase("scissors") && cpuChoice.equalsIgnoreCase("paper")){
    result = "User";
    return result;
    }
    else {
      result = "you broke something...";
      return result;
    }
   }
}//end class
