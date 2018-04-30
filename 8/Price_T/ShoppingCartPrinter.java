/*************************************************
*Teancum Price
*Set Two Items names and prices, then total them
*Last Edit: 3/13/18
*************************************************/

//Import Scanner
import java.util.Scanner;

public class ShoppingCartPrinter{
   public static void main(String args[]) {
      //Create Scanner
      Scanner input = new Scanner(System.in);
      //Initialize Variables
      ItemToPurchase itemA = new ItemToPurchase();
      ItemToPurchase itemB = new ItemToPurchase();
      int aPrice;
      int aNum;
      int bPrice;
      int bNum;
      
      //Print Prompts and get Inputs
      System.out.println("Item 1");
      System.out.println("Enter the item name:");
      itemA.setName(input.nextLine());
      System.out.println("Enter the item price:");
      itemA.setPrice(input.nextInt());
      input.nextLine();
      System.out.println("Enter the item quantity:");
      itemA.setQuantity(input.nextInt());
      input.nextLine();
      System.out.println();
      
      System.out.println("Item 2");
      System.out.println("Enter the item name:");
      itemB.setName(input.nextLine());
      System.out.println("Enter the item price:");
      itemB.setPrice(input.nextInt());
      input.nextLine();
      System.out.println("Enter the item quantity:");
      itemB.setQuantity(input.nextInt());
      System.out.println();
      
      //Get the prices and numbers
      aPrice = itemA.getPrice();
      aNum = itemA.getQuantity();
      bPrice = itemB.getPrice();
      bNum = itemB.getQuantity();
      System.out.println("TOTAL COST");
      System.out.println(itemA.getName() + " " + aNum + " @ $" + aPrice + " = $" + (aPrice * aNum));
      System.out.println(itemB.getName() + " " + bNum + " @ $" + bPrice + " = $" + (bPrice * bNum));
      System.out.println();
      System.out.println("Total: $" + ((aPrice * aNum)+(bPrice * bNum)));
   }//End main Method
}//End ShoppingCartPrinter