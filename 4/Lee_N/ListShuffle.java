/***********************
*Nick Lee
*List Shuffle
*
*Last Edited: 3-21-2018
***********************/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

//class
public class ListShuffle {
   //main
   public static void main (String[] args) {
      //init vars
      ArrayList<String> list1 = new ArrayList<String>();
      ArrayList<String> shuffledList = new ArrayList<String>();
      int list1Size = 0;
      Scanner scnr = new Scanner(System.in);
      String userIn = "";
      String word;
      int i;
      //greet user
      System.out.println("Welcome to List Shuffle!");
      System.out.println("You will give me a list of words and I'll shuffle them.");
      //get first word
      System.out.println("What is your first word?");
      //while user wants another word
      while (!userIn.equalsIgnoreCase("no")){
         //get next word
         System.out.print("Your word: ");
         word = scnr.next();
         //add word to ArrayList
         list1.add(word);
         list1Size ++;
         //ask another?
         System.out.println("Do you want another word? yes/no");
         userIn = scnr.next();
      }//end asking for words
      
      //display list
      System.out.println("Your list is:");
      for(i = 0; i < list1Size; i++){
         System.out.println("\t" + list1.get(i));
      }//end display list
      //shuffle method call
      shuffledList = shuffleList(list1, list1Size);
      //display shuffled list
      System.out.println("Your shuffled list is:");
      for(i = 0; i < list1Size; i ++){
         System.out.println("\t" + shuffledList.get(i));
      }//end display shuffled list
   }//end main
   
   //shuffleList
   public static ArrayList<String> shuffleList (ArrayList<String> unshuffled, int size) {
      //init vars
      ArrayList<String> shuffling = new ArrayList<String>();
      Random rand = new Random();
      rand.setSeed(0);
      int num;
      //shuffle loop
      for(int i = unshuffled.size() - 1; i >= 0; i --){
         //index too big
         num = rand.nextInt(i + 1);
         shuffling.add(unshuffled.get(num));
         unshuffled.remove(num);
      }//end shuffle loop
      //return
      return shuffling;
   }//end shuffleList
}//end class