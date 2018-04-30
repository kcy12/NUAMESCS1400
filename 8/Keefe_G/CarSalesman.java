/**************************
 Garrett Keefe
 Car Salesman
 Last Edited
***************************/

import java.util.Scanner;
public class CarSalesman{
   public static void main(String[] args){
      //make scanner
      Scanner input = new Scanner(System.in);
      //init values
      int cost = 0;
      double tax = 0.15;
      double license = 0.10;
      int dealerprep = 500;
      int destcharge = 375;
      double total = 0.0;
      //greet user
      System.out.println("Welcome to the Car Salesman program!");
      System.out.println("What is the cost of your desired cars?: ");
      //get input
      cost = input.nextInt();
      //new line
      System.out.println();
      //math
      tax *= cost;
      license *= cost;
      total = (cost+tax+license+dealerprep+destcharge);
      //print info
      System.out.println("The Tax amounts to $"+tax);
      System.out.println("The license fee amounts to $"+license);
      System.out.println("The dealer prep fee is $"+dealerprep);
      System.out.println("The destination charge is $"+destcharge);
      System.out.println("Your total is $"+total);
      System.out.println("Thank you for using our program!");
   }//end main
}//end class