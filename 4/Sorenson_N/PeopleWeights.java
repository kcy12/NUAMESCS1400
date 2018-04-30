import java.util.Scanner;

public class PeopleWeights {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in); 
      double weight1;
      double weight2;
      double weight3;
      double weight4;
      double weight5;
      
      System.out.println("Enter weight 1:");
      weight1 = in.nextDouble();
      
      System.out.println("Enter weight 2:");
      weight2 = in.nextDouble();
      
      System.out.println("Enter weight 3:");
      weight3 = in.nextDouble();

      System.out.println("Enter weight 4:");
      weight4 = in.nextDouble();

      System.out.println("Enter weight 5:");
      weight5 = in.nextDouble();

      double [] weightsOfPeople = new double [5];
         weightsOfPeople [0] = weight1;
         weightsOfPeople [1] = weight2;
         weightsOfPeople [2] = weight3;
         weightsOfPeople [3] = weight4;
         weightsOfPeople [4] = weight5;
         
      System.out.println("You entered: " + weight1 + " " + weight2 + " " + weight3 + " " + weight4 + " " + weight5 + " ");
      
      double sumVal = 0;
      for (int i = 0; i < weightsOfPeople.length; ++i) {
         sumVal = sumVal + weightsOfPeople[i];
      }
      System.out.println("Total Weight: " + sumVal);
      
      System.out.println((weight1 + weight2 + weight3 + weight4 + weight5) / 5.0);
      
      double maxVal = 0;
      for (int j = 0; j < weightsOfPeople.length; ++j) {
         if (weightsOfPeople[j] > maxVal) {
            maxVal = weightsOfPeople[j];
         }
      }
      System.out.print("Max weight: " + maxVal);
   }  
}