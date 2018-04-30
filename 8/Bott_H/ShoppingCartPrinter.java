/********************
*Holden Bott
*ShoppingCartPrinter
*Last Edited: 3/18/18
********************/

import java.util.Scanner;

public class ShoppingCartPrinter {
   public static void main(String[] args) {
   
      //vars
      Scanner input = new Scanner(System.in);
      String name;
      int price;
      int quantity;
      int total;
     
      //item 1
      println("Item 1");
      println("Enter the item name:");
      name = input.nextLine();
      
      println("Enter the item price:");
      price = input.nextInt();
      
      println("Enter the item quantity:");
      quantity = input.nextInt();
      
      
      
      //object 1
      ItemToPurchase Obj1 = new ItemToPurchase();
      Obj1.setName(name);
      Obj1.setPrice(price);
      Obj1.setQuantity(quantity);
      
      input.nextLine();
      println("");
      
      //enter item 2
      println("Item 2");
      println("Enter the item name:");
      name = input.nextLine();
   
      println("Enter the item price:");
      price = input.nextInt();
      
      println("Enter the item quantity:");
      quantity = input.nextInt();
      
      
      //object 2
      ItemToPurchase Obj2 = new ItemToPurchase();
      Obj2.setName(name);
      Obj2.setPrice(price);
      Obj2.setQuantity(quantity);

      //total cost
      println("");
      println("TOTAL COST");
      println(Obj1.getName() + " " + Obj1.getQuantity() + " @ $" + Obj1.getPrice() + " = $" + (Obj1.getQuantity() * Obj1.getPrice()));
      println(Obj2.getName() + " " + Obj2.getQuantity() + " @ $" + Obj2.getPrice() + " = $" + (Obj2.getQuantity() * Obj2.getPrice()));

      println("");
      
      println("Total: $" + ((Obj1.getQuantity() * Obj1.getPrice()) + (Obj2.getPrice() * Obj2.getQuantity())));
      
      
      
   }
      
   public static void println(String message) {
      System.out.println(message);
   }
}