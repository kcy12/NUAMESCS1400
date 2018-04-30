/**********************
* Ethan Pickard
* Online shopping cart main
* Last Edited: 3/13/18
***********************/

import java.util.Scanner;

public class ShoppingCartPrinter extends ItemToPurchase {
   public static void main(String[] args) {
   //init vars etc
   Scanner input = new Scanner(System.in);
   String inputName;
   int inputPrice;
   int inputQuantity;
   
   /////////////item 1
   System.out.println("Item 1");
   
   System.out.println("Enter the item name:");
   inputName = input.nextLine();
   
   System.out.println("Enter the item price:");
   inputPrice = input.nextInt();
   
   System.out.println("Enter the item quantity:");
   inputQuantity = input.nextInt();
   
   System.out.println();
   
   input.nextLine();
   
   //call other file
   ItemToPurchase item1 = new ItemToPurchase();
   item1.setName(inputName);
   item1.setPrice(inputPrice);
   item1.setQuantity(inputQuantity);
   
   
   //////////////item 2
   System.out.println("Item 2");
   
   System.out.println("Enter the item name:");
   inputName = input.nextLine();
   
   System.out.println("Enter the item price:");
   inputPrice = input.nextInt();
   
   System.out.println("Enter the item quantity:");
   inputQuantity = input.nextInt();
   
   
   //input.nextLine();
   
   //call other file
   ItemToPurchase item2 = new ItemToPurchase();
   item2.setName(inputName);
   item2.setPrice(inputPrice);
   item2.setQuantity(inputQuantity);
   
   //totals
   System.out.println();
   System.out.println("TOTAL COST");
   System.out.println(item1.getName() + " " + item1.getQuantity() + " @ $" + item1.getPrice() + " = $" + (item1.getQuantity() * item1.getPrice()));
   System.out.println(item2.getName() + " " + item2.getQuantity() + " @ $" + item2.getPrice() + " = $" + (item2.getQuantity() * item2.getPrice()));
   
   System.out.println();
   System.out.println("Total: $" + ((item1.getQuantity() * item1.getPrice()) + (item2.getQuantity() * item2.getPrice())));
   
   ////////////////////////////////////FINISH THIS LOSER

   }//end main method
}//end ShoppingCartPrinter class