import java.util.Random; 

public class Main {
   //global variables
   public static int high = 100;
   public static int low = 0;
   public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   //init vars
   String guess;
   String anyCaseGuess;
   int compGuess;
   int seed = 5555;
   int i;
   boolean correct = false;
   //greet user
   println("Welcome to the Guess Your Number Game!");
   println("I have 6 tries to guess what number you're thinking of between 1 and 100.");
   println("After each guess, tell me if I'm HIGH or LOW.");
   println("If I guess your number, let me know by typing CORRECT.");
   compGuess = guessRange(low, high, seed);
   println("");
   //guessing loop
   for (i = 6; i > 0; --i) {
      //prompt for response
      println("Is your number " + compGuess + " or am I high or low");
      //get response
      guess = input.nextLine();
      
      //call response(user response, computer guess)
      response(guess, compGuess);
      //increment tries
      if(high==low){
         compGuess = high;//keep the program from breaking
      }//end if
      else{
         if(guess.equalsIgnoreCase("CORRECT")) {
            correct = true;
            break;
         }
         else{
            compGuess = guessRange(low, high, seed);
         }
      }//end else
   }//end guess loop
   //branching for displaying win or loose
      if (correct = true) {
         println("You Win");
      }//finish if
      else {
      println("You Loose");
      }//end else
   }//end main
   //guessRange(low, high, seed)
   public static int guessRange(int start, int end, int seed){
      Random rand = new Random();
      int randNum;
      rand.setSeed(seed);
      randNum = rand.nextInt(end - start) + start;
      return randNum;
   }//end guessRange

   //response(user response, computer guess)
   public static void response (String userInput, int compGuess) {
      //branching to change global high and low variables based on user response
      if(userInput.equalsIgnoreCase("HIGH")) {
          high = (compGuess - 1);
      }//end if
      else if (userInput.equalsIgnoreCase("LOW")) {
         low = (compGuess + 1);
      }//end else if
   }//end response   
   public static void println(String theMessage) {
         System.out.println(theMessage);
   }//end print function
}