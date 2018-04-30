//class
   //main
      //init vars
      //greet user
      //guessing loop
         //user input
         //call charCheck
         //display if char is in string or not
      //out of guesses - guess word
      //display win or lose
   
   //charCheck
      //if char in string
         //return true
      //else
         //return false
         
   //wordCheck
      //if guess is word
         //win
      //else
         //lose
         
import java.util.Scanner;
         
public class Main {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      String mStr = "the string";
      System.out.println("hello cyka");
      for (int i=0; i<=5; i++) {
         System.out.print("Guess: ");
         char guess = in.nextLine().charAt(0);
         boolean yo = charCheck(mStr, guess);
         if (yo = true) {
            System.out.println("Yes");
         }
         else {
            System.out.println("No");
         }
      }
      System.out.println("OUT OFHD GUESSDF");
      String userGuess = in.nextLine();
      boolean result = wordCheck(mStr, userGuess);
      if (result = true) {
            System.out.println("Yes");
         }
         else {
            System.out.println("No");
         }
   }
      
   public static boolean charCheck(String word, char chara) {
      String chars = "" + chara;
      if (word.contains(chars) == true) {
         return true;
      }
      else {
         return false;
      }
   }
   public static boolean wordCheck(String inWord, String word) {
      if (inWord == word) {
         return true;
      }
      else {
         return false;
      }
   }
}