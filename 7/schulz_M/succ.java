import java.util.Random;
import java.util.Scanner;
public class Main{
  //global vars
  public static int high = 100;
  public static int low = 1;
  public static void main(String[] args){
   //init vars
   Scanner s = new Scanner(System.in);
   Random r = new Random();
   String uInput;
   int guess;
   int seed = 0;
   boolean gCorrect = false;
   int g;

   //greet user
   System.out.println("Welcome to the Guess Your Number Game!");
   System.out.println("I have 6 tries to guess what number you're thinking of between 1 and 100.");
   System.out.println("After each guess, tell me if I'm HIGH or LOW.");
   System.out.println("If I guess your number, let me know by typing CORRECT.");
   guess = guessRange(low, high, seed);
   //guessing loop
   for(g = 6; g > 0; --g){
      //prompt for response
      System.out.println("Is your number " + guess + " or am I high or low");
      //get response
      uInput = s.nextLine();
      //call response(user response, computer guess)
      response(uInput, guess);
      //increment tries
      if(high==low){
         guess = high;//keep the program from breaking
      }
      else{
        if(uInput.equalsIgnoreCase("CORRECT")){
          gCorrect = true;
          break;
        }
        else{//get a new guess from guessRange\\
          guess = guessRange(low,high,seed);
        }
      }
    }//end for loop
   //branching for displaying win or lose
      if(gCorrect == true){
        System.out.println("You Win");
      }
      else{
        System.out.println("You Loose");
      }
    }//main\\

//guessRange(low, high, seed)
  public static int guessRange(int low, int high, int seed){
    Random r = new Random();
    int randNum;
    r.setSeed(seed);
    randNum = r.nextInt(high - low) + low;
    return randNum;

  }

//response(user response, computer guess)
  public static void response(String uInput,int guess){
  //branching to change global high and low variables based on user response
   if(uInput.equalsIgnoreCase("HIGH")){
     high = (guess - 1);
   }
   else if(uInput.equalsIgnoreCase("LOW")){
     low = (guess + 1);
   }
  }
}//end basicFormula class\\//main
