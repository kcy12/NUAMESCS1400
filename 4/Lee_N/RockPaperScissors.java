/*********************
*Nick Lee
*Rock Paper Scissors 17.11
*
*Last Edited: 4-11-2018
*********************/

//import libraries
import java.util.Scanner;
import java.util.Random;

//RockPaperScissors
public class RockPaperScissors{

   //getUserChoice(Scanner in)
   public String getUserChoice(Scanner in){
      boolean valid = true;
      String choice = "";
   
      //get user choice of rock, paper, or scissors
      System.out.println("What is your choice?");
      choice = in.next();
      //while choice is invalid
      while(valid){
         if(choice.equalsIgnoreCase("rock")){
            valid = false;
         } else if(choice.equalsIgnoreCase("paper")){
            valid = false;
         } else if(choice.equalsIgnoreCase("scissors")){
            valid = false;
         } else{
            System.out.println("That's not a valid choice. Try again: ");
         }
         if(valid){
            choice = in.nextLine();
         }
      }//end while loop
      //return choice
      return choice;
   }//end getUserChoice
      
   //getCPUChoice(int seed)
   public String getCPUChoice(int seed){
      Random rand = new Random(seed);
      int temp = rand.nextInt(3);
      String COMChoice;
      
      if(temp == 0){
         COMChoice = "Rock";
      } else if (temp == 1){
         COMChoice = "Paper";
      } else if (temp == 2){
         COMChoice = "Scissors";
      } else{
         COMChoice = "COM failed check getCPUChoice";
      }
      return COMChoice;
   }//end getCPUChoice
   
   //pickWinner(String userChoice, String CPUChoice)
   public String pickWinner(String userChoice, String CPUChoice){
      boolean valid = true;
      String win = "";
      
      //tie
      if(userChoice.equalsIgnoreCase(CPUChoice)){
         win = "Tie";
         valid = false;
      }
      
      //userChoice = Rock
      if(valid && userChoice.equalsIgnoreCase("rock")){
         if(CPUChoice.equalsIgnoreCase("paper")){
            win = "Computer";
         } else if (CPUChoice.equalsIgnoreCase("scissors")){
            win = "User";
         } else{
            win = "ROCK FAILED";
         }
         valid = false;
      }//end rock
      //userChoice = Paper
      if(valid && userChoice.equalsIgnoreCase("paper")){
         if(CPUChoice.equalsIgnoreCase("rock")){
            win = "User";
         } else if (CPUChoice.equalsIgnoreCase("scissors")){
            win = "Computer";
         } else{
            win = "PAPER FAILED";
         }
         valid = false;
      }
      //userChoice = Scissors
      if(valid && userChoice.equalsIgnoreCase("scissors")){
         if(CPUChoice.equalsIgnoreCase("rock")){
            win = "Computer";
         } else if(CPUChoice.equalsIgnoreCase("paper")){
            win = "User";
         } else {
            win = "SCISSORS FAILED";
         }
      }//end scissors
      
      return win;
   }//end pickWinner
   
}//end class