import java.util.Scanner;

public class PeopleWeights {
   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      double weight[] = new double[5];
      weight[0] = 0.0;
      weight[1] = 0.0;
      weight[2] = 0.0;
      weight[3] = 0.0;
      weight[4] = 0.0;
      double sumWeight = 0.0;
      double averageWeight = 0.0;
      double largestVal = 0.0;
      int i;
      
      //enter the weight this could be made into 1 while loop but i'm lazy
      System.out.println("Enter weight 1: ");
      weight[0] = input.nextDouble();
      
      System.out.println("Enter weight 2: ");
      weight[1] = input.nextDouble();
      
      System.out.println("Enter weight 3: ");
      weight[2] = input.nextDouble();
      
      System.out.println("Enter weight 4: ");
      weight[3] = input.nextDouble();
      
      System.out.println("Enter weight 5: ");
      weight[4] = input.nextDouble();
      
      //while loop prints the array
      System.out.print("You entered: ");
      for (i = 0; i < weight.length; ++i){
         System.out.print(weight[i] + " ");
      }
      
      System.out.println();
      
      //get sum of all numbers
      for (i = 0; i < weight.length; ++i){
         sumWeight = sumWeight + weight[i];
      }
      
      System.out.println("Total weight: " + sumWeight);
      
      //find the average
      averageWeight = sumWeight / 5;
      System.out.println("Average weight: " + averageWeight);
      
      //find the largest Value
      for(i = 0; i < weight.length; ++i){
         if(weight[i] > largestVal){
            largestVal = weight[i];
         }
      }
      System.out.println("Max weight: " + largestVal);
   }
}