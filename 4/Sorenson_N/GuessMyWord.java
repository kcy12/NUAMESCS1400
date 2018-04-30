/*************
*Niklas Sorenson
*2/14/18
*
*guess my word game
*************/
import java.util.Scanner;
         
public class GuessMyWord {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      String mStr = "the string";
      System.out.println("Welcome to the Guess My Word Game");
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
      System.out.println("OUT OF GUESSES");
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