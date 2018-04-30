//import libraries
import java.util.Scanner;
import java.util.Random;

//RockPaperScissors
public class RockPaperScissors{
   Scanner in = new Scanner(System.in);

   //getUserChoice(Scanner in)
   public String getUserChoice(Scanner in){
      String userChoice;
      
      //get user choice of rock, paper, or scissors\
      userChoice = in.nextLine();
      //while choice is invalid
      while(!userChoice.equalsIgnoreCase("ROCK") && !userChoice.equalsIgnoreCase("PAPER") && !userChoice.equalsIgnoreCase("Scissors")){
         System.out.print("That's not a valid input. Try again: ");
         userChoice = in.nextLine();
         }
      //return choice
      return userChoice;
      }
      
   //getCPUChoice(int seed)
   public String getCPUChoice(int seed){
      Random rand = new Random();
      rand.setSeed(seed);
      int changeCase = 0;
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
   }//end getCPUChoice
   
   //pickWinner(String userChoice, String CPUChoice)
   public String pickWinner(String userChoice, String CPUChoice){
      String pickingWinner = "";
      if(userChoice.equalsIgnoreCase("ROCK") && CPUChoice.equalsIgnoreCase("ROCK")){
         pickingWinner = "Tie";
      }//end of if
      else if(userChoice.equalsIgnoreCase("ROCK") && CPUChoice.equalsIgnoreCase("PAPER")){
         pickingWinner = "Computer";
      }
      else if(userChoice.equalsIgnoreCase("ROCK") && CPUChoice.equalsIgnoreCase("SCISSORS")){
         pickingWinner = "User";
      }
      else if(userChoice.equalsIgnoreCase("PAPER") && CPUChoice.equalsIgnoreCase("PAPER")){
         pickingWinner = "Tie";
      }
      else if(userChoice.equalsIgnoreCase("PAPER") && CPUChoice.equalsIgnoreCase("SCISSORS")){
         pickingWinner = "Computer";
      }
      else if(userChoice.equalsIgnoreCase("SCISSORS") && CPUChoice.equalsIgnoreCase("SCISSORS")){
         pickingWinner = "Tie";
      }
      return pickingWinner;
      
   }//End pickWinner
}