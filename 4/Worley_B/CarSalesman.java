/********************
*Braden Worley
*Car sales man
*make a car sales man
*last edit 1/19/18
********************/
public class CarSalesman{

   public static void main(String[] args){
      //create scanner oject
      Scanner in = new Scanner(System.in);
      
      //initalize variables
      double cost = 0;
      double cost = 0.0;
      double totalTax = 0;
      double totalLicense = 0;
      double totalCost = 0;
      //two set fees
      int dealerPrep = 500;
      int destCharge = 375;
      //two % fees
      double tax = 0.15;
      double license = 0.10;
      
      //welcome user
      //get cost of car
      cost = in.nextInt();
      
      //math
      totalTax = cost * tax;
      totalLicense = cost * license;
      totalCost = totalTax + totalLicense + dealerPrep + destCharge
      
      //display total
      System.out.println("
      
   }//end main
}//end CarSalesman