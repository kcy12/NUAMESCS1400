/************************
* Alysha Robertson
* ShopingCartPrinter
* Last Edited: 3/15/18
************************/

import java.util.Scanner;

public class ShoppingCartPrinter{
   //main method
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      //object item1 for method ItemToPurchase
      ItemToPurchase item1 = new ItemToPurchase();
      //object item2 for method ItemToPurchase
      ItemToPurchase item2 = new ItemToPurchase();

      System.out.println("Item 1");
      System.out.println("Enter the item name:");
      item1.setName(sc.nextLine());

      System.out.println("Enter the item price:");
      item1.setPrice(sc.nextInt());
      sc.nextLine();

      System.out.println("Enter the item quantity:");
      item1.setQuantity(sc.nextInt());
      sc.nextLine();

      System.out.println("\nItem 2");
      System.out.println("Enter the item name:");
      item2.setName(sc.nextLine());
          
      System.out.println("Enter the item price:");
      item2.setPrice(sc.nextInt());
      sc.nextLine();
          
      System.out.println("Enter the item quantity:");
      item2.setQuantity(sc.nextInt());
      //sc.nextLine();

      System.out.println("\nTOTAL COST");
      System.out.println(item1.getName() + " "
      + item1.getQuantity() + " @ $" + item1.getPrice()
      + " = $" + (item1.getPrice()*item1.getQuantity()));

      System.out.println(item2.getName() + " "
      + item2.getQuantity() + " @ $" + item2.getPrice()
      + " = $" + (item2.getPrice()*item2.getQuantity()));

      System.out.println("\nTotal: $" +
      (item1.getPrice()* item1.getQuantity()+
      item2.getPrice() *item2.getQuantity()));
   }//end public main
}//end ShoppingCartPrinter class