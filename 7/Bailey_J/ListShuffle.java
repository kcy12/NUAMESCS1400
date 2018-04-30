//import stuff
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

//class
public class ListShuffle {
   //main
   public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
      //init vars
      ArrayList<String> words = new ArrayList<String>();
      ArrayList<String> wordsShuffled = new ArrayList<String>();
      String temp;
      String userInput;
      boolean user = false;
      //greet user
      println ("What is your first word");
      //get first word
      temp = input.nextLine();
      words.add(temp);
      //while user wants another word
      while (user == false) {
         //get next word
         println("What is your next word");
         temp = input.nextLine();
         words.add(temp);
         //ask another?
         println("Do you want another word, y or n");
         userInput = input.nextLine();
            if (userInput.equalsIgnoreCase("n")) {
            user = true;
            }
      }//end while
      //display list
      System.out.println(words);
        //end display loop
      //shuffle method call
      wordsShuffled = shuffleList(words, 5555);
      //display shuffled list
      System.out.println(wordsShuffled);
      
   }
   //shuffleList
   public static ArrayList<String> shuffleList (ArrayList<String> words, int seed) {
      //init vars
      int num;
      ArrayList<String> wordsShuffled = new ArrayList<String>();
      Random rand = new Random();
      rand.setSeed(seed);
      //shuffle loop
      for (int i = words.size(); i > 0 ; --i) {
         num = rand.nextInt(i);
         wordsShuffled.add(words.get(num));
         words.remove(num);
      }//end shuffle loop
      //return
      return wordsShuffled;
   }//end Shuffle List
   //print
   public static void println(String theMessage) {
         System.out.println(theMessage);
   }//end print function
}