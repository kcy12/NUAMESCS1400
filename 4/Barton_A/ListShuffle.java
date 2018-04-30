import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
//class
public class ListShuffle{
   //main
   public static void main(String[] args){
      //init vars
      ArrayList<String> unshuffled = new ArrayList<String>();
      ArrayList<String> shuffled = new ArrayList<String>();
      Scanner scnr = new Scanner(System.in);
      int i;
      int seed = 0;
      String userIn = "";
      String word;
      //greet user
      System.out.println("Welcome to List Shuffle!");
      System.out.println("You will give me a list of words and I'll shuffle them.");
      //get first word
      System.out.println("What is the first word.");
      //while user wants another word
      while(!userIn.equalsIgnoreCase("NO")){
         //get next word
         System.out.println("Your word: ");
         word = scnr.next();
         //add to arraylist
         unshuffled.add(word);
         //ask another?
         System.out.println("Do you want another word? YES/NO?");
         userIn = scnr.next();
         }
      //display list
      System.out.println("Your list is: ");
      for(i = 0; i < unshuffled.size(); ++i){
         System.out.println(unshuffled.get(i));
      }
      //shuffle method call
      shuffled = shuffleList(unshuffled, seed);
      //display shuffled list
      System.out.println("Your shufled list is: ");
      for(i = 0; i < shuffled.size(); ++i){
         System.out.println(shuffled.get(i));
      }
      }//end of main
   
   //shuffleList
   public static ArrayList<String> shuffleList(ArrayList<String> unshuffled, int seed){
      //init vars
      ArrayList<String> shuffling = new ArrayList<String>();
      Random rand = new Random();
      rand.setSeed(seed);
      int num;
      int i;
      //shuffle loop
      for(i = unshuffled.size(); i > 0; --i){
         num = rand.nextInt(i);
         shuffling.add(unshuffled.get(num));
         unshuffled.remove(num);
      }
      //return
      return shuffling;
      }
}