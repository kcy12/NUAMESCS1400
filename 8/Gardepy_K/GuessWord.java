/************************
* Kacie Gardepy
* Guess Word Program
* Last Edited: 02/13/2018
************************/
import java.util.Scanner;

//class
public class GuessWord{
   //main
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);
      //init vars
      String correct = "word";
      String guess = "";
      char choice; 
      String lastguess;
      boolean letter;
      boolean last;
       
      //greet user
      System.out.print("Hello, and Welcome to the Guess My Word Program!");
      System.out.println(" ");
      System.out.print("You will guess a letter and I will tell you if it is in the word or not!");
      System.out.println(" ");
      System.out.print("Please do your guesses in lowercase, you have 4 guesses.");
      System.out.println(" ");
      
      //guessing loop
      for (int i = 3; i >= 0; i--){
         //user input
         System.out.print(" GUESS: ");
         choice = input.next().charAt(0);
         //call charCheck
         letter = charCheck(correct, choice);
         //display if char is in string or not
         if (letter){
            System.out.print(choice + " is in the word!");
            }//end if
         else{
            System.out.print(choice + " is not in the word!");
            }//end else
         }//end loop
         
      //out of guesses - guess word
         System.out.print(" What do you think my word is...?: ");
         lastguess = input.next();
         last = wordCheck(correct, lastguess);
         if (last){
            //user wins
            System.out.print("You got it right! The word was " + correct);
         }//end if statement
         else{  
            //user loses
            System.out.print("You lost! The word was " + correct);
         }//end else statement
         System.out.println(" ");
         System.out.print("Thanks For Playing!");
      //display win or lose
      
   }//End Main
   
   //charCheck(word, guess)
   public static boolean charCheck(String correct, char choice){
      //if char in string
         if (correct.indexOf(choice) != -1){
         //return true
            return true;
         }//end if statement
      //else
         else{
         //return false 
            return false;
            }//end else statement
   }//end charcheck
         
   //wordCheck(word, guess)
   public static boolean wordCheck(String correct, String lastguess){
      //if guess is word
      if (correct.equals(lastguess)){
         return true;
         }//end if
      else{
         return false;
         }//end else
   }//end wordcheck
}//end class