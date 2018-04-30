import java.util.Scanner;
import java.util.Random;
public class NumberGuesser
{
   public static void main(String[] args)// main
   {
      int highNumber;
      int lowNumber;//init vars
      String returnString;
      int userInput = 0;
      int randNum;
      int seed = 0;
      int i;
      Scanner input = new Scanner(System.in); //establish scqanner
      System.out.print("Welcome to the number guesser game. ");
      System.out.println("A random number is generated and you need to guess it within 6 tries");
      System.out.println("What would you like as the low number in the range?");//high number first
      lowNumber = input.nextInt();//low number second
      System.out.println("What would you like as the high number?");
      highNumber = input.nextInt();
      randNum = genRandNum(lowNumber, highNumber, seed);// genRandNum(start, end, seed)
      for(i = 0; i < 6; i++)
      {
         System.out.print("What would you like to guess? ");
         System.out.println("You have " + ((i - 6) * -1) + " guesses left");
         userInput = input.nextInt();
         returnString = hiLow(randNum, userInput);
         System.out.println();
         System.out.println(returnString);
      }
      if(randNum != userInput)
      {
         System.out.print("The number was " + randNum + " good luck next time!");
      }
   }//end method  
   public static int genRandNum(int lowNum, int highNum, int seed) 
   {   
      Random rand = new Random();
      rand.setSeed(seed);  
      int randNum = rand.nextInt(highNum - lowNum) + lowNum;   
      return randNum;   
   }//end genRandNum method
   public static String hiLow(int randNum,int userInput)// hiLow(correct number, user guess)
   {
      if(userInput == randNum)
      {
         return "That's my number!";
      }
   //if guess is low
      else if(userInput < randNum)
      {
         return "Higher...";
      }
   //if guess is high
      else
      {
         return "Lower...";
      }
   }//endmethod
}   