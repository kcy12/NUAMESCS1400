/***************************
*Joshua Crossley
*Car salesman
*Last updated Feb 13, 2018
***************************/
import java.util.Scanner;

public class Car_salesman{
   public static void main(String[] args){
  /*new scanner*/
   Scanner input = new Scanner(System.in);
   /*varables*/
   double total = 0;
   int car = 0;
   double license = 0.10; 
   double tax = 0.15;
   int dealer = 500;
   int charge = 375;
   
   System.out.println("Welcome to the Car Saleman Program!");/*intorduces program*/
   System.out.print("What is the amount of your car? ");/*asks for input*/
   car = input.nextInt();/*input*/
   
   /*tax added to total cost*/
   tax = (car * tax);
   /*display amount of taxs*/
   System.out.println("your taxs is: " +tax);
   
   /*license to total cost*/
   license = (car * license);
   System.out.println("License is 10%: " +license);
   
   /*add 500 to total cost*/
   System.out.println("Dealer Prep is: " +dealer);
   
   /*add 375 to total cost*/
   System.out.println("Desitation charge is: " +charge);
   
   /*add all cost to equal total amount*/
   total = (car + tax + license+ dealer + charge);
   System.out.println("Your total: " +total);
  
  }/*end main*/
}/*end class*/