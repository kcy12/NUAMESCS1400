import java.util.Scanner;

public class PeopleWeights {
   public static void main(String[] args) {
      
      
      //init vars
      Scanner input = new Scanner(System.in);
      double sum = 0.0;
      double max = 0.0;
      double [] weightList = new double[5];
      
      //get input
      System.out.println("Enter weight 1:");
      weightList[0] = input.nextDouble();
      
      System.out.println("Enter weight 2:");
      weightList[1] = input.nextDouble();

      System.out.println("Enter weight 3:");
      weightList[2] = input.nextDouble();

      System.out.println("Enter weight 4:");
      weightList[3] = input.nextDouble();
      
      System.out.println("Enter weight 5:");
      weightList[4] = input.nextDouble();

      System.out.print("You entered: ");
      
      //Prints array
      for(int i=0; i<5; i++){
         System.out.print(weightList[i]+" ");
         }
         
      System.out.println();
      
      //Calculates sum
      for(int i=0; i<weightList.length; i++){
         sum += weightList[i];
         }   
         
      //Calculates max
      for(int i=0; i<weightList.length; i++){
         if(weightList[i] > max){
            max = weightList[i];
            }
         }
         
      
      //Prints last stuff
      System.out.println("Total weight: "+sum);
      System.out.println("Average weight: "+(sum/5));
      System.out.println("Max weight: "+max);
      
   }
}