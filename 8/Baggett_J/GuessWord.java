/********************
Jacob Baggett P. 8
Guess Word Program
Last Edited 3/15/18
*********************/

import java.util.Scanner;

public class GuessWord{

   public static void main(String[] args){
   
      //init vars
      Scanner input = new Scanner(System.in);
      String secretWord = "blustery";
      char userIn;
      String userFinal = "";
      boolean tralse;
      
      //greet user
      System.out.println("Welcome to Guess My Word!");
      System.out.println("Guess 5 letters then try to guess what word I'm thinking of.");
      
      for(int i = 0; i < 6; i++){
            //get input
            System.out.print("Guess a letter: ");
            userIn = input.next().charAt(0);
            
            //call charCheck
            tralse = charCheck(secretWord, userIn);
            
            if(tralse == true){
               System.out.println(userIn + " is in the word!");
               }
            else{
               System.out.println(userIn + " is not in the word.");
               }
               
            }//end for loop
            
         
      //out of guesses - guess word
      
      //display win or lose
   
   }//end main
   
   
   public static boolean charCheck(String secretWord, char userIn){
      //init var
      boolean tralse = true;
      
      //checks if it's in
      for(int i = 0; i < secretWord.length(); i++){
         if(userIn == secretWord.charAt(i)){
            tralse = true;
            break;
            
            }    
         else{
            tralse = false;        
            }   
      }//end for
      
      if(tralse == true){
      return true;
      }
      else{
      return false;
      }
            
   }//end charCheck
         
   //wordCheck(word, guess)
      //if guess is word
         //win
      //else
         //lose
      //end wordCheck
      
}