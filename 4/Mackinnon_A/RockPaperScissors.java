import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors{

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
   public static String getCPUChoice(Random seed){
      Random rand = new Random();
      int seed1 = seed.nextInt(Integer.MAX_VALUE);
      rand.setSeed(seed1);
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
   }
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
      else if(userChoice.equalsIgnoreCase(p) && CPUChoice.equalsIgnoreCase(r0)){
         pickingWinner = "User";
         }
      return pickingWinner;

   }//End pickWinner
} 