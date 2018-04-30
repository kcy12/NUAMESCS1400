/***********************************
*Nick Lee
*Shopping Cart Printer Chapter 16.15
* Needs Items To Purchase
*Last Edited: 3-17-2018
***********************************/

import java.util.Scanner;

public class ShoppingCartPrinter {
   public static void main(String[] args){
   Scanner scnr = new Scanner(System.in);
   ItemToPurchase item1 = new ItemToPurchase();
   ItemToPurchase item2 = new ItemToPurchase();
   String name1;
   String name2;
   int price1;
   int price2;
   int quantity1;
   int quantity2;
   int cost1;
   int cost2;
   
   //get Item1 information
   System.out.println("Item 1");
   System.out.println("Enter the item name:");
   name1 = scnr.nextLine();
   item1.setName(name1);
   System.out.println("Enter the item price:");
   price1 = scnr.nextInt();
   item1.setPrice(price1);
   System.out.println("Enter the item quantity:");
   quantity1 = scnr.nextInt();
   item1.setQuantity(quantity1);
   //get item2 information
   System.out.println("\nItem 2");
   System.out.println("Enter the item name:");
   name2 = scnr.nextLine();
   item2.setName(scnr.nextLine());
   //System.out.println(item2.getName());
   System.out.println("Enter the item price:");
   price2 = scnr.nextInt();
   item2.setPrice(price2);
   System.out.println("Enter the item quantity:");
   quantity2 = scnr.nextInt();
   item2.setQuantity(quantity2);
   //output total cost
   System.out.println("\nTOTAL COST");
   cost1 = item1.getQuantity() * item1.getPrice();
   cost2 = item2.getQuantity() * item2.getPrice();
   System.out.println(item1.getName() + " " + item1.getQuantity() + " @ $" + item1.getPrice() +
                     " = $" + cost1);
   System.out.println(item2.getName() + " " + item2.getQuantity() + " @ $" + item2.getPrice() +
                     " = $" + cost2);
   System.out.println("\nTotal: $" + (cost1 + cost2));
   
   }//end main
}//end class