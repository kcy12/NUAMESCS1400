/*****************
*Braden Worley
*Simonsen period 4
*we guess a number
*****************/
import java.util.Random;
import java.util.Scanner;

class numberGuess{
   public static void main(String[] args){
   
      Scanner in = new Scanner(System.in);
      
      int start;
      int end;
      int seed;
      int numGuesses;
      int userGuess;
      
      System.out.println("Hello, welcome to the Guess My Number Game.");
      System.out.println("What is the lowest value of the number?");
      start = in.nextInt();
      System.out.println("What is the Highest value of the number?");
      end = in.nextInt();
      
      Random rand = new Random();
      int randNum = rand.nextInt((end - start) + 1) + start;
      
      for(numGuesses = 0; numGuesses < 6; ++numGuesses){
         System.out.println("What is your guess?");
         userGuess = in.nextInt();
         System.out.println(hiLow(randNum, userGuess));
         if(hiLow(randNum, userGuess) == "Thats my number!"){
            break;
         }
         System.out.println("You have " + (5 - numGuesses) + " tries left.");
         if (numGuesses == 5){
            System.out.println("Sorry! you have ran out of tries. My number was " + randNum);
         }
      }
 
   }//end class main 
   
   public static int genRandNum(int start, int end, int seed){
      Random rand = new Random();
      rand.setSeed(seed);
      
      int randNum = rand.nextInt((end - start) + 1) + start;
      return randNum;
            
   }//end genRandNum
   
   public static String hiLow(int randNum, int userGuess){
      if(userGuess < randNum){
         return "Higher...";
      }
      
      else if(userGuess > randNum){
         return "Lower...";
      }
      
      else{
         return "Thats my number!";
      }
         
   }//end hiLow
}//end main