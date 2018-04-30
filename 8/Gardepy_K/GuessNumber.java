/************************
* Kacie Gardepy
* Guess My Number
* Last Edited: 02/15/2018
************************/
import java.util.Scanner;
import java.util.Random;

// class
public class GuessNumber{
   // main
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);
      // initialize variables
      int low = 0;
      int high = 0;
      // greet user
      System.out.print("Welcome to the Guess My Number Program!");
      System.out.println(" ");
      System.out.print("You will have to guess my number in 6 tries!");
      System.out.println(" ");
      System.out.print("But before we start, you need to set some limitations...");
      System.out.println(" ");
      
   //low number first
      System.out.print("What is the lowest number I can go to? ");
      low = input.nextInt();
   //high number second
      System.out.print("And what is the highest number I can go to? ");
      high = input.nextInt();
      System.out.println(" ");
      System.out.print("Okay, Time to guess my number! ");
      number = genRandNum(start, end, 0); //NOTE TO FUTURE KC - MAY NEED TO CHANGE SEED NUM
      }//end main
// genRandNum(start, end, seed)
   public static void genRandNum(int start, int end, int seed){
      Random rand = new Random();
      number = (int i = start; i <= end);
      }// end genrandnum
      

// hiLow(correct number, user guess)
   //if correct
   return "That's my number!";
   //if guess is low
   return "Higher...";
   //if guess is high
   return "Lower...";
}// end class