/***********************
*Nick Lee
*Chapter 16.11
*
*Last Edited: 3-12-2018
***********************/

import java.util.Scanner;

public class PeopleWeights {
   public static void main(String[] args) {
      double[] weights = new double[5];
      Scanner scnr = new Scanner(System.in);
      int i;
      double userInput;
      double average = 0.0;
      double max = 0.0;
      
      //welcome user
      System.out.println("Enter five weights");
      
      //ask for weights
      for (i = 0; i <= 4; i ++){
         System.out.println("Enter weight " + (i + 1) + ":");
         userInput = scnr.nextDouble();
         weights[i] = userInput;
      }//end asking for numbers
      
      //output weights
      System.out.print("You entered: ");
      for(i = 0; i <= 4; i++){
         System.out.print(weights[i] + " ");
      }//end output for weights
      System.out.println(" \n");
      
      //max weight
      //average the weights
      for(i = 0; i <= 4; i++){
         average = average + weights[i];
      }//end adding all the numbers
      System.out.println("Total weight: " + average);
      average = average / 5;
      System.out.println("Average weight: " + average);
      
      //find max weight
      for(i = 0; i <= 4; i++){
         if(weights[i] > max){
            max = weights[i];
         }//end max replacer
      }//end max weight finder
      System.out.println("Max weight: " + max);
      
   }//end main
}//end class