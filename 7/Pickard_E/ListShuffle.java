/**********************
* Ethan Pickard
* List shuffle
* Last Edited: 3/22/18
***********************/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class ListShuffle {
   public static void main(String[] args) { //main
      //init vars etc
      Scanner input = new Scanner(System.in);
      ArrayList<String> userList = new ArrayList<String>();
      ArrayList<String> finalList = new ArrayList<String>();
      String userWord;
      char YesNo = 'o';
      
      //greet user
      System.out.println("Hello! Welcome to the List Shuffle program. Give me a list of words and I will Shuffle it for you!");
      System.out.println();
      
      //get first word
      System.out.print("What would you like the first word to be? ");
      userWord = input.next();
      userList.add(userWord);
      
      //while for more words
      while (YesNo != 'n') {
         //get next word
         System.out.println();
         System.out.print("What would you like the next word to be? ");
         userWord = input.next();
         userList.add(userWord);
         
         //ask if wants another
         System.out.print("Would you like to add another word? Enter \"y\" or \"n\". ");
         String bufferWord = input.next();
         YesNo = bufferWord.charAt(0);
      }//end while
      
      System.out.println();
      //display list
      System.out.println("Here is your list:");
      System.out.println(userList);
      
      //shuffle method call
      finalList = shuffleList(userList);
      //display shuffled list
      System.out.println();
      System.out.println("Here is your shuffled list!:");
      System.out.println(finalList);
      
   }//end main
   
   public static ArrayList<String> shuffleList (ArrayList<String> userList) {//shuffleList
      //init vars etc
      int seed = 5000;
      Random rand = new Random();
      rand.setSeed(seed);
      ArrayList<String> shuffledList = new ArrayList<String>();
      int shuffleNum = 0;
      
      
      //shuffle loop
      for (int i = userList.size(); i > 0; i--) {
         shuffleNum = rand.nextInt(userList.size());
         
         shuffledList.add(userList.get(shuffleNum));
         
         userList.remove(shuffleNum);
         
      }//end for
     
      return shuffledList;
      
   }//end shuffleList method
      
}//end ListShuffle class