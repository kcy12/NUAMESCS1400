import java.util.Scanner;

public class PeopleWeights {
   public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   //def variables
   int i;
   double totalWeight = 0.0;
   double averageWeight;
   double max = 0.0;
   //def array
   double[] weights = new double[5];
   //get user inputs
   System.out.println("Enter weight 1: ");
   weights[0] = input.nextDouble();
   
   System.out.println("Enter weight 2: ");
   weights[1] = input.nextDouble();
   
   System.out.println("Enter weight 3: ");
   weights[2] = input.nextDouble();
   
   System.out.println("Enter weight 4: ");
   weights[3] = input.nextDouble();
   
   System.out.println("Enter weight 5: ");
   weights[4] = input.nextDouble();
   
   //output weight
   System.out.print("You entered:");
   for(i =0; i < weights.length - 1; ++i) {
      System.out.print(" " + weights[i] + ",");
   }
   System.out.print(" " + weights[weights.length - 1]);
   System.out.println();
   //output total weight
   System.out.print("Total Weight ");
   for(i =0; i < weights.length ; ++i) {
      totalWeight += weights[i];
   }
   System.out.print(totalWeight);
   System.out.println();
   //output average weight
   System.out.print("Average weight: ");
   averageWeight = totalWeight/weights.length;
   System.out.print(averageWeight);
   System.out.println();
   //output max weight
   System.out.print("Max weight: ");
   for(i =0; i < weights.length; ++i) {
      if (weights[i] > max) {
         max = weights[i];
      }
   }
   System.out.print(max);
   }
}
   