/*****************************
* Ian Argyle
* Counts based on user input
* 
* Last Edited: 1/25/2018
******************************/

import java.util.Scanner;

public class counter {
   public static void main(String[] args) {
      // Define a scanner to get input
      Scanner in = new Scanner(System.in);
      // Greet the user
      System.out.println("Welcome to the counter program");
      // Define the vars
      int start = 0;
      int end = 0;
      int countBy = 0;
      // Get values for the vars
      System.out.println("What number should I start with?");
      start = in.nextInt();
      System.out.println("What number should I end with?");
      end = in.nextInt();
      System.out.println("What should I count by?");
      countBy = in.nextInt();
      // Call count
      count(start, end, countBy);
   } //end method main
   public static void count(int start, int end, int countBy) {
      // Use a for loop to count
      for(int i = start; i <= end; i += countBy) {
         // Print the output
         System.out.println(i);
      }
   } //end count
} //end counter