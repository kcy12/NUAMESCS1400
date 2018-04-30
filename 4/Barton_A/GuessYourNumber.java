import java.util.Scanner;
import java.util.Random;
public class GuessYourNumber{
//global vars
//high = 100
   static int high = 100;
//low = 1
   static int low = 1;
//main
   public static void main(String[] args){
   //init vars
      Scanner scnr = new Scanner(System.in);
      String userResponse = "";
      int computerGuess = 0;
      int seed = 0;
      int i;
      int tries = 6;
      
   //greet user
   System.out.println("Welcome to the Guess Your Number Game!");
   System.out.println("I have 6 tries to guess what number you're thinking of between 1 and 100.");
   System.out.println("After each guess, tell me if I'm HIGH or LOW.");
   System.out.println("If I guess your number, let me know by typing CORRECT.");
   //guessing loop
   computerGuess = guessRange(low, high, seed);
   while(tries != 0 && userResponse.equalsIgnoreCase("CORRECT") == false){
      //prompt for response
      System.out.println("Is your number " + computerGuess + " or am I high or low.");
      //get response
      userResponse = scnr.nextLine();
      //call response(user response, computer guess)
      response(userResponse, computerGuess);
      //increment tries
      --tries;
      if(high==low){
         computerGuess = high;//keep the program from breaking
      }
      else{
         //get a new guess from guessRange
         computerGuess = guessRange(low, high, seed);
      }//end of while
      }
   //branching for displaying win or loose
   if(userResponse.equalsIgnoreCase("CORRECT") == false){
      System.out.println("You win.");
   }//end of if
   else{
      System.out.println("You loose.");
   }
   }

//guessRange(low, high, seed)
   public static int guessRange(int start, int end, int seed){
      Random rand = new Random();
      rand.setSeed(seed);
      int randNum = rand.nextInt(end - start) + start;
      return randNum;
   }

//response(user response, computer guess)
   public static void response(String userResponse, int computerGuess){
   //branching to change global high and low variables based on user response
   if(userResponse.equalsIgnoreCase("HIGH")){
      high = (computerGuess - 1);
   }//end of if
   else if(userResponse.equalsIgnoreCase("LOW")){
      low = (computerGuess + 1);
   }
   }//end of response
   }//end of class