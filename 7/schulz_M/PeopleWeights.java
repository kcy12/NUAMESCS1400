import java.util.Scanner;
import java.util.Arrays;

public class PeopleWeights {
   public static void main(String[] args) {
      /* Type your code here. */
      double[] weightList = new double[5];
      double weightAverage;
      double weightMax;

      Scanner s = new Scanner(System.in);

      /* getting weights, putting them into lists */
      System.out.println("Enter weight 1:");
      weightList[0] = s.nextDouble();
      System.out.println("Enter weight 2:");
      weightList[1] = s.nextDouble();
      System.out.println("Enter weight 3:");
      weightList[2] = s.nextDouble();
      System.out.println("Enter weight 4:");
      weightList[3] = s.nextDouble();
      System.out.println("Enter weight 5:");
      weightList[4] = s.nextDouble();

      System.out.print("You entered: ");
    for(double n: weightList) {
     System.out.print(n+" ");
       }
   System.out.println();
   System.out.println();
    double sum = sum(weightList);
    System.out.println("Total weight: " + sum);
//weight average finder
    weightAverage = sum/5;
    System.out.println("Average weight: " + weightAverage);

      weightMax = getMax(weightList);
    System.out.println("Max weight: " + weightMax);

   }
   public static double sum(double[] values) {
     double result = 0;
     for (double value:values)
     result += value;
     return result;
   }
    public static double getMax(double[] inputArray){
    double maxValue = inputArray[0];
    for(int i=1;i < inputArray.length;i++){
      if(inputArray[i] > maxValue){
         maxValue = inputArray[i];
      }
    }
    return maxValue;
  }


}
