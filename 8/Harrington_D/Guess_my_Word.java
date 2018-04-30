import java.util.Scanner;

//class
public class Guess_my_Word{
   //main
   public static void Main(String [] args){
      Scanner scan = new Scanner(System.in);
      //init vars
      char userCInput;
      String word; 
      String userWInput; 
      int tries = 5;
      word = "Garbage";
      //greet user
      System.out.print("Welcome to guess my word, today the goal is to guess characters within the word and after 5 guesses it is time to guess");
      //guessing loop
      while (tries > 0){
        tries -= 1;
         System.out.print("you have " + tries + " tries left");
         //user input
         userCInput = in.next().charAt(0);
         //call charCheck
         boolean Charactercheck;
         Charactercheck = charCheck(word, userCInput);
         //display if char is in string or not
         if(Charactercheck){
            System.out.println("That is a character in the word.");
         }            
         else{
            System.out.println("That is not a character in the word.");
         } 
      }
      //out of guesses - guess word
      System.print.out("You have run out of guesses, time to guess the word.");
      userWInput = scan.next();
      //display win or lose
      boolean WordCheck = none;
      WordCheck = wordCheck(word, userWInput);
      if(WordCheck){
         System.out.print("you win");
      }
      else{
       System.out.print("you lose");  
      }
      }
   //charCheck(word, guess)
   public static boolean charCheck(String word, char userCInput){
      //if char in string
      if(word.indexOfC(userCInput) != -1){
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
   public static boolean wordCheck(String word, String userWInput){
      //if guess is word
      if(userWInput == word){
         //win
         return true;
      }
      //else
      else{
         //lose
         return false;
      }      
      }
}