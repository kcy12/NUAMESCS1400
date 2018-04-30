import java.util.Scanner;

public class PeopleWeights {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double weightTotal;
      double weightAverage;
      int i;
      double[] userWeight = new double[5];
      //1 Prompt the user to enter five numbers. Store the numbers in an array of doubles.
      System.out.println("Enter weight 1:");
      userWeight[0] = scnr.nextDouble();
      System.out.println("Enter weight 2:");
      userWeight[1] = scnr.nextDouble();
      System.out.println("Enter weight 3:");
      userWeight[2] = scnr.nextDouble();
      System.out.println("Enter weight 4:");
      userWeight[3] = scnr.nextDouble();
      System.out.println("Enter weight 5:");
      userWeight[4] = scnr.nextDouble();
      System.out.println("You entered: " + userWeight[0] + " " + userWeight[1] + " " + userWeight[2] + " " + 
      userWeight[3] + " " + userWeight[4] + " ");
      System.out.println("");
      //2 output the total weight, by summing the array's elements
      weightTotal = userWeight[0] + userWeight[1] + userWeight[2] + userWeight[3] + userWeight[4];
      System.out.println("Total weight: " + weightTotal);
      
      //3 output the average of the array's elements
      weightAverage = (weightTotal / 5);
      System.out.println("Average weight: " + weightAverage); 
      
      //4 output the max array element
      double weightMax = 0.0;
      for(i = 0; i < userWeight.length; ++i){
         if (userWeight[i] > weightMax){
            weightMax = userWeight[i];
            }
         }
      System.out.println("Max weight: " + weightMax);

   }//end main
}//end PeopleWeights