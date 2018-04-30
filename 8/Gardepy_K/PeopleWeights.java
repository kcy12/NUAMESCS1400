/**********************
Kacie Gardepy
People's Weight Program
Last Edited: 03/05/2018
**********************/

//copy in code from zybooks
import java.util.Scanner;

public class PeopleWeights {
   public static void main(String[] args) {
   //new scanner
   Scanner input = new Scanner(System.in);
   //variables 
   int i;
   double weight[] = new double[5];
   //get 5 numbers from user
   System.out.println("Enter weight 1: ");
   weight[0] = input.nextDouble();
   System.out.println("Enter weight 2: ");
   weight[1] = input.nextDouble();
   System.out.println("Enter weight 3: ");
   weight[2]= input.nextDouble();
   System.out.println("Enter weight 4: ");
   weight[3] = input.nextDouble();
   System.out.println("Enter weight 5: ");
   weight[4] = input.nextDouble();
   //you entered info
   System.out.println("You entered: "+weight[0]+" "+weight[1]+" "+weight[2]+" "+weight[3]+" "+weight[4]);
   //total info and variables for it
   double total = weight[0] + weight[1] + weight[2] + weight[3] + weight[4];
   double average = total/5;
   double max = 0.0;
   //Max for loop
   for 
   System.out.println("");
   System.out.println("Total weight: "+ total);
   System.out.println("Average weight: "+ average);
   System.out.println("Max weight: "); //EDIT THIS TO DO THE MAX
      

   }
}