import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors{
   Scanner in = new Scanner(System.in);
   public static String r0 = "Rock";
   public static String p = "Paper";
   public static String s = "Scissors";

   public String getUserChoice(Scanner in){
      String userChoice;

      //get user choice of rock, paper, or scissors
      userChoice = in.nextLine();
      //while choice is invalid
      while(!userChoice.equalsIgnoreCase(r0) && !userChoice.equalsIgnoreCase(p) && !userChoice.equalsIgnoreCase(s)){
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
      if(userChoice.equalsIgnoreCase(r0) && CPUChoice.equalsIgnoreCase(r0)){
         pickingWinner = "Tie";
      }//end of if
      else if(userChoice.equalsIgnoreCase(r0) && CPUChoice.equalsIgnoreCase(p)){
         pickingWinner = "Computer";
      }
      else if(userChoice.equalsIgnoreCase(r0) && CPUChoice.equalsIgnoreCase(s)){
         pickingWinner = "User";
      }
      else if(userChoice.equalsIgnoreCase(p) && CPUChoice.equalsIgnoreCase(p)){
         pickingWinner = "Tie";
      }
      else if(userChoice.equalsIgnoreCase(p) && CPUChoice.equalsIgnoreCase(s)){
         pickingWinner = "Computer";
      }
      else if(userChoice.equalsIgnoreCase(s) && CPUChoice.equalsIgnoreCase(s)){
         pickingWinner = "Tie";
      }
      return pickingWinner;

   }//End pickWinner
}
