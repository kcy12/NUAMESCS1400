import java.util.Scanner;
import java.util.ArrayList;

public class PeopleWeights {
   public static void main(String[] args) {
      /* Type your code here. */
      Scanner police_scanner = new Scanner(System.in);
      ArrayList <Double> array = new ArrayList<Double>();
      System.out.println("Enter weight 1:");
      double input1 = police_scanner.nextDouble();
      array.add((input1));
      System.out.println("Enter weight 2:");
      double input2 = police_scanner.nextDouble();
      array.add((input2));
      System.out.println("Enter weight 3:");
      double input3 = police_scanner.nextDouble();
      array.add((input3));
      System.out.println("Enter weight 4:");
      double input4 = police_scanner.nextDouble();
      array.add((input4));
      System.out.println("Enter weight 5:");
      double input5 = police_scanner.nextDouble();
      array.add((input5));
      System.out.println("You entered: " + array.get(0) + " " + array.get(1) + " " + array.get(2) + " " + array.get(3) + " " + array.get(4)+ " ");
      double SumWeight = (array.get(0) + array.get(1) + array.get(2) + array.get(3) + array.get(4));
      System.out.println("");
      System.out.println("Total weight: " + SumWeight);
      double AveWeight = (SumWeight / 5);
      System.out.println("Average weight: " + AveWeight);
      double MaxWeight = 0;
      for (int i = 0; i <= 4; ++i){
         if (MaxWeight < array.get(i)){
            MaxWeight = array.get(i);
         }
      }
      System.out.println("Max weight: " + MaxWeight);
      
      
      
      
   }
}