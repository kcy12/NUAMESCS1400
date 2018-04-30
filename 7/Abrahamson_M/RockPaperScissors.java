import java.util.*; //import libraries

public class RockPaperScissors extends Game
{  //RockPaperScissors
   public static String getUserChoice(Scanner in)
   {  //getUserChoice(Scanner in)
      int seed = 0;
      boolean bool = false;
      String userChoice = "";
      System.out.println("Do you want rock paper or scissors?");
      userChoice = in.next();//get user choice of rock, paper, or scissor
      if(userChoice.equalsIgnoreCase("rock"))
      {
         bool = true;
      }
      else if(userChoice.equalsIgnoreCase("paper"))
      {
         bool = true;
      }
      else if(userChoice.equalsIgnoreCase("scissors"))
      {
         bool = true;
      }
      while(bool != true)
      {
      if(userChoice.equalsIgnoreCase("rock"))
      {
         bool = true;
      }
      else if(userChoice.equalsIgnoreCase("paper"))
      {
         bool = true;
      }
      else if(userChoice.equalsIgnoreCase("scissors"))
      {
         bool = true;
      }
      else{
         System.out.print("That's not a valid input. Try again: ");
         userChoice = in.next();
         }
      }
      return userChoice;
   }
   public static String getCPUChoice(Random r)
   {  //getCPUChoice(int seed)
   String cpuChoice = "";
      int randomNum;
      randomNum = (r.nextInt(3) + 1);
      if(randomNum == 1)
      {
         cpuChoice = "rock";   
      }
      if(randomNum == 3)
      {
         cpuChoice = "scissors";
      }
      if(randomNum == 2)
      {
         cpuChoice = "paper";
      }
      return cpuChoice;
   }
   public static String pickWinner(String userChoice, String cpuChoice)
   {  //pickWinner(String userChoice, String CPUChoice)
      String winner = "";
      if(userChoice.equalsIgnoreCase("rock"))
      {
         if(cpuChoice.equalsIgnoreCase("rock"))
         {
            winner = "Tie";
         }
         if(cpuChoice.equalsIgnoreCase("paper"))
         {
            winner = "Computer";
         }
         if(cpuChoice.equalsIgnoreCase("scissors"))
         {
            winner = "User";
         }
      }
      else if(userChoice.equalsIgnoreCase("scissors"))
      {
         if(cpuChoice.equalsIgnoreCase("rock"))
         {
            winner = "Computer";
         }
         if(cpuChoice.equalsIgnoreCase("paper"))
         {
            winner = "User";
         }
         if(cpuChoice.equalsIgnoreCase("scissors"))
         {
            winner = "Tie";
         }
      }
      else if(userChoice.equalsIgnoreCase("paper"))
      {
         if(cpuChoice.equalsIgnoreCase("rock"))
         {
            winner = "User";
         }
         if(cpuChoice.equalsIgnoreCase("paper"))
         {
            winner = "Tie";
         }
         if(cpuChoice.equalsIgnoreCase("scissors"))
         {
            winner = "Computer";
         }
      }
      else
      {
         winner = "error";
      }
      return winner;
   }
}