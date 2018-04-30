import java.util.Scanner;

public class ShoppingCartPrinter {
   public static void main(String[] args) {
   Scanner scnr = new Scanner(System.in);
   ItemToPurchase itemOne = new ItemToPurchase();
   ItemToPurchase itemTwo = new ItemToPurchase();
   String oneName;
   String twoName;
   int onePrice;
   int oneQuantity;
   int twoPrice;
   int twoQuantity;
   int oneTotal;
   int twoTotal;
   
      System.out.println("Item 1");
      System.out.println("Enter the item name:");
      oneName = scnr.nextLine();
      itemOne.setName(oneName);
      System.out.println("Enter the item price:");
      onePrice = scnr.nextInt();
      itemOne.setPrice(onePrice);
      System.out.println("Enter the item quantity:");
      oneQuantity = scnr.nextInt();
      itemOne.setQuantity(oneQuantity);
      scnr.nextLine();
      
      System.out.println("\nItem 2");
      System.out.println("Enter the item name:");
      twoName = scnr.nextLine();
      itemTwo.setName(twoName);
      System.out.println("Enter the item price:");
      twoPrice = scnr.nextInt();
      itemTwo.setPrice(twoPrice);
      System.out.println("Enter the item quantity:");
      twoQuantity = scnr.nextInt();
      itemTwo.setQuantity(twoQuantity);
   
      oneTotal = onePrice * oneQuantity;
      twoTotal = twoPrice * twoQuantity;
      System.out.println("\nTOTAL COST");
      System.out.println(itemOne.getName() + " " + itemOne.getQuantity() + 
      " @ $" + itemOne.getPrice() + " = $" + oneTotal);
      System.out.println(itemTwo.getName() + " " + itemTwo.getQuantity() + 
      " @ $" + itemTwo.getPrice() + " = $" + twoTotal);
      System.out.println("\nTotal: $" + (oneTotal + twoTotal));
   }//end main
}//end ShoppingCartPrinter