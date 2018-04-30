import java.util.Scanner;
public class ShoppingCartPrinter{
   public static void main(String[] args){
   ItemToPurchase itemOne = new ItemToPurchase();
   ItemToPurchase itemTwo = new ItemToPurchase();
   Scanner scnr = new Scanner(System.in);
   String itemOneName;
   int itemOnePrice;
   int itemOneQuantity;
   String itemTwoName;
   int itemTwoPrice;
   int itemTwoQuantity;
   int totalOne;
   int totalTwo;
   
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
      System.out.println("\nItem 2");
      System.out.println("Enter the item name:");
      itemTwoName = scnr.nextLine();
      itemTwo.setName(itemTwoName);
      System.out.println("Enter the item price:");
      itemTwoPrice = scnr.nextInt();
      itemTwo.setPrice(itemTwoPrice);
      System.out.println("Enter the item quantity:");
      itemTwoQuantity = scnr.nextInt();
      itemTwo.setQuantity(itemTwoQuantity);
   
      totalOne = itemOneQuantity * itemOnePrice;
      totalTwo = itemTwoQuantity * itemTwoPrice;
      System.out.println("\nTOTAL COST");
      System.out.println(itemOne.getName() + " " + itemOne.getQuantity() + " @ $" + itemOne.getPrice() + " = $" + totalOne);
      System.out.println(itemTwo.getName() + " " + itemTwo.getQuantity() + " @ $" + itemTwo.getPrice() + " = $" + totalTwo);
      System.out.println("\nTotal: $" + (totalOne + totalTwo));
      return;
  }
}