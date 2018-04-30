import java.util.Scanner;
import java.util.Random;
//import libraries
public class RockPaperScissors{
   public String getUserChoice(Scanner in){ 
      System.out.println("Select your input");
      String uC = in.nextLine();
      while(!uC.equalsIgnoreCase("rock") && !uC.equalsIgnoreCase("paper") && !uC.equalsIgnoreCase("scissors")){
         System.out.println("That's not a valid input. Try again: ");
         uC = in.nextLine();
      }
      return uC;
   }     
   //getCPUChoice(int seed)
   public String getCPUChoice(int seed){
      Random rand = new Random(seed);
      String z = "Nothing";
      int x;
      x = rand.nextInt(3);
      if(x == 0){
         z = "rock";
      }
      if(x == 1){
         z = "paper";
      }
      if(x == 2){
         z = "scissors";
      }
      return z;
   }  
   //pickWinner(String userChoice, String CPUChoice)
   public String pickWinner(String userChoice, String CPUChoice){
      String Winner = "Dissapointment";
      
      
      if(userChoice.equalsIgnoreCase("rock") && CPUChoice.equalsIgnoreCase("scissors")){
         Winner = "User";
      } 
      if(userChoice.equalsIgnoreCase("paper") && CPUChoice.equalsIgnoreCase("rock")){
         Winner = "User";
      }
      if(userChoice.equalsIgnoreCase("scissors") && CPUChoice.equalsIgnoreCase("paper")){
         Winner = "User";
      }
      if(userChoice.equalsIgnoreCase("scissors") && CPUChoice.equalsIgnoreCase("rock")){
         Winner = "Computer";
      }
      if(userChoice.equalsIgnoreCase("rock") && CPUChoice.equalsIgnoreCase("paper")){
         Winner = "Computer";
      }
      if(userChoice.equalsIgnoreCase("paper") && CPUChoice.equalsIgnoreCase("scissors")){
         Winner = "Computer";
      }
      if(userChoice.equalsIgnoreCase("rock") && CPUChoice.equalsIgnoreCase("rock")){
         Winner = "Tie";
      }
      if(userChoice.equalsIgnoreCase("paper") && CPUChoice.equalsIgnoreCase("paper")){
         Winner = "Tie";
      }
      if(userChoice.equalsIgnoreCase("scissors") && CPUChoice.equalsIgnoreCase("scissors")){
         Winner = "Tie";
      }
      return Winner;
   }
}