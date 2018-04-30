/**
* Dana Escandor
* 17.9
* l.e. 3/25/2018
**/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class listShuffle{
   public static void main(String[] args){
      Scanner scnr = new Scanner(System.in);
      
      ArrayList<String> shuffled = new ArrayList<String>();
      ArrayList<String> unshuffled = new ArrayList<String>();
      
     
      int i;
      int seed = 0;
      String userIn = "";
      String word;


      System.out.println("\n List Shuffle Program");
      System.out.println("Input words > (Possible additional words) > Displays shuffled words \n");


      while(!userIn.equalsIgnoreCase("NO")){
         
         System.out.print("Input: ");
         word = scnr.next();
         
         unshuffled.add(word);
         
         System.out.print("Additional words? 'YES'/'NO'?: ");
         userIn = scnr.next();
         }
      
      System.out.println();
      
      System.out.println("ORIGINAL list: ");
      for(i = 0; i < unshuffled.size(); ++i){
         System.out.println(unshuffled.get(i));
      }
      
      shuffled = shuffleList(unshuffled, seed);
      
      System.out.println();
      
      System.out.println("SHUFFLED list: ");
      for(i = 0; i < shuffled.size(); ++i){
         System.out.println(shuffled.get(i));
      }
     }
   
  
   public static ArrayList<String> shuffleList(ArrayList<String> unshuffled, int seed){
     
      ArrayList<String> shuffling = new ArrayList<String>();
      Random rand = new Random();
      rand.setSeed(seed);
      int num;
      int i;
      
      for(i = unshuffled.size(); i > 0; --i){
         num = rand.nextInt(i);
         shuffling.add(unshuffled.get(num));
         unshuffled.remove(num);
      }
      return shuffling;
  }
}