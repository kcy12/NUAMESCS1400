/*********************************
*Kacie Gardepy
*Shopping Cart Printer Main Method
*Last Edited: 03/2018
*********************************/

//import scanner
import java.util.Scanner;

//class 
public class ShoppingCartPrinter{
   //main method and new scanner
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);
      //variables
      ItemToPurchase item1 = new ItemToPurchase();
      ItemToPurchase item2 = new ItemToPurchase();
      String name1;
      String name2;
      int price1;
      int price2;
      int quantity1;
      int quantity2;
   
   //asking user for the stuff
   System.out.println("Item 1");
   System.out.println("Enter the item name:");
   name1 = input.nextLine();
   item1.setName(name1);
   System.out.println("Enter the item price:");
   price1 = input.nextInt(); //make sure to keep int with int
   item1.setPrice(price1);
   System.out.println("Enter the item quantity:");
   quantity1 = input.nextInt();
   item1.setQuantity(quantity1);
   System.out.println("");
   //second item information
   System.out.println("Item 2");
   System.out.println("Enter the item name:");
   name2 = input.nextLine();
   item2.setName(name2);
   System.out.println("Enter the item price:");
   price2 = input.nextInt();
   item2.setPrice(price2);
   System.out.println("Enter the item quantity:");
   quantity2 = input.nextInt();
   item2.setQuantity(quantity2);
   System.out.println("");
   
   //math portion
   //variables part 2
   int cost1;
   int cost2;
   int total;
   
   cost1 = price1 * quantity1;
   cost2 = price2 * quantity2;
   total = cost1 + cost2;
   //okay now the actual math part for the totals
   //and then uhhh print them out down below 
   //make sure your format is all correct
   System.out.println("TOTAL COST");
   System.out.println(name1 +" "+ quantity1+" @ $"+price1+ " = $"+cost1);
   System.out.println(name2 +" "+ quantity2+" @ $"+price2+ " = $"+cost2);
   System.out.println("");
   System.out.println("Total: $"+total);
   
   //FIX ALL THIS LATER BECAUSE OF THE ERRORS AND STUFF 
   
   }//end main
}//end class