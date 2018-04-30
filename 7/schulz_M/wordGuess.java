
import java.util.Scanner;

//class
public class wordGuess{
   public static void main(String[] args){
     //init vars
     Scanner input = new Scanner(System.in);
     String word = "overwatch";
     String guessLetter=  "" ;
     Boolean  characterCheck;
     int tries =  5;
     String winLoss;
      //greet user
      System.out.println("Hi! I'm going to come up with a word, and you're going to try and guess it!");
      System.out.println("Here's a hint. It's a game.");
      System.out.println("");
      //guessing loop
      while(tries > 0){
        //user input
        System.out.print("What do you think one of the letters are? ");
        guessLetter = input.nextLine();
        //call charCheck
        characterCheck = charCheck(word, guessLetter);
        //display if char is in string or not
        if(characterCheck == true){
          System.out.println("Yep! '" +  guessLetter + "' is in my word! But beware, you have " + (tries - 1) + " tries left.");
          tries -=1;
        }
        else{
          System.out.println("Nope! '" +  guessLetter + "' is NOT in my word! But beware, you have " + (tries - 1) + " tries left.");
          tries -=1;
        }
      }
      //out of guesses - guess word
      System.out.println("You're outta guesses. Do you know the word yet?");
      guessLetter = input.nextLine();
      //display win or lose
      winLoss = wordCheck(word, guessLetter);
      System.out.println(winLoss);
   }//main\\


   //charCheck(word, guess)
   public static boolean charCheck(String word, String guess){
     //if char in string
    if(word.contains(guess)){
    //return true
    return true;
    }
     //else
     else{
     //return false
       return false;
     }

   }


   //wordCheck(word, guess)
   public static String wordCheck(String word, String guess){
     //if guess is word
     if(word == guess){
      //win
      return "That's my word! You won!";
     }
     //else
     else{
      //lose
      return "That's not my word. You lost :(";
     }

   }

} /*class*/
