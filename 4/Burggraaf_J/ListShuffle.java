/******************
*JJ Burggraaf
*List Shuffle
*Fill in main method and shuffleList method to populate an ArrayList,
*and shuffle the items held within the ArrayList.
*The user should be able to enter in any number of strings to the list.
*Last edited: 3/25/18
******************/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
//class
public class ListShuffle {
   //main
   public static void main (String[] args) {
      //init vars
      ArrayList<String> list1 = new ArrayList<String>();
      ArrayList<String> listShuffled = new ArrayList<String>();
      int list1Size = 0;
      Scanner scnr = new Scanner(System.in);
      String userInput = "";
      String word;
      int i;
      //greet user
      System.out.println("Welcome to the List Shuffler.");
      System.out.println("It's really simple. You give me a list of words and I'll shuffle the list.");
      //get first word
      System.out.println("What is the first word you want on the list");
      //while user wants another word
      while (!userInput.equalsIgnoreCase("no")){
         //get next word
         System.out.print("Your word: ");
         word = scnr.next();
         //add word to ArrayList
         list1.add(word);
         list1Size ++;
         //ask another?
         System.out.println("Do you want to add another word?");
         userInput = scnr.next();
      }//end while
      
      //display list
      System.out.println("Your list is:");
      for(i = 0; i < list1Size; i++){
         System.out.println(list1.get(i));
      }//end list display
      //shuffle method call
      listShuffled = shuffleList(list1, list1Size);
      //display shuffled list
      System.out.println("Your shuffled list is:");
      for(i = 0; i < list1Size; i ++){
         System.out.println(listShuffled.get(i));
      }//end shuffled list display
   }//end main
   
   //shuffleList(arrayList, seed)
   public static ArrayList<String> shuffleList (ArrayList<String> unshuffled, int size) {
      //init vars
      ArrayList<String> shuffling = new ArrayList<String>();
      Random rand = new Random();
      rand.setSeed(0);
      int num;
      //shuffle loop
      for(int i = unshuffled.size() - 1; i >= 0; i --){
         // if index is too big
         num = rand.nextInt(i + 1);
         shuffling.add(unshuffled.get(num));
         unshuffled.remove(num);
      }//end shuffle loop
      //return shuffled arrayList
      return shuffling;
   }//end shuffleList
}//end ListShuffle