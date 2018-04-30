/********************
*Grant Arave
*Online Shopping Cart
*Last Edited: 3/13/18
********************/

import java.util.Scanner;

public class ShoppingCartPrinter {
   public static void main(String[] args){
      
      ItemToPurchase itemOne = new ItemToPurchase();
      ItemToPurchase itemTwo = new ItemToPurchase();
      
      Scanner scnr = new Scanner(System.in);
      
      String itemOneName;
      String itemTwoName;
      int itemOnePrice;
      int itemTwoPrice;
      int itemOneQuantity;
      int itemTwoQuantity;
      int itemOneTotal;
      int itemTwoTotal;
      int totalTotal;
      
      System.out.println("Item 1");
      System.out.println("Enter the item name:");
      itemOneName = scnr.nextLine();
      itemOne.setName(itemOneName);
      System.out.println("Enter the item price:");
      itemOnePrice = scnr.nextInt();
      itemOne.setPrice(itemOnePrice);
      System.out.println("Enter the item quantity:");
      itemOneQuantity = scnr.nextInt();
      itemOne.setQuantity(itemOneQuantity);
      
      scnr.nextLine();
      System.out.println("");
      
      System.out.println("Item 2");
      System.out.println("Enter the item name:");
      itemTwoName = scnr.nextLine();
      itemTwo.setName(itemTwoName);
      System.out.println("Enter the item price:");
      itemTwoPrice = scnr.nextInt();
      itemTwo.setPrice(itemTwoPrice);
      System.out.println("Enter the item quantity:");
      itemTwoQuantity = scnr.nextInt();
      itemTwo.setQuantity(itemTwoQuantity);
      System.out.println("");
      
      itemOneTotal = itemOnePrice * itemOneQuantity;
      itemTwoTotal = itemTwoPrice * itemTwoQuantity;
      totalTotal = itemOneTotal + itemTwoTotal;
      
      System.out.println("TOTAL COST");
      System.out.println(itemOneName +" "+ itemOneQuantity +" @ $"+ itemOnePrice +" = $"+ itemOneTotal);
      System.out.println(itemTwoName +" "+ itemTwoQuantity +" @ $"+ itemTwoPrice +" = $"+ itemTwoTotal);
      System.out.println("");
      System.out.println("Total: $"+ totalTotal);
   }
}