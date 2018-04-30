//Start the import
import java.util.Scanner;
//Start class
public class ShoppingCartPrinter {
//Start main method
   public static void main(String[] args) {
   //Variables
   Scanner in = new Scanner(System.in);
   ItemToPurchase item1 = new ItemToPurchase();
   ItemToPurchase item2 = new ItemToPurchase();
   String name1;
   int quantity1;
   int price1;
   int total1;
   String name2;
   int quantity2;
   int price2;
   int total2;
   //Start main
   System.out.println("Item 1");
   System.out.println("Enter the item name:");
   name1 = in.nextLine();
   item1.setName(name1);
   System.out.println("Enter the item price:");
   price1 = in.nextInt();
   item1.setPrice(price1);
   System.out.println("Enter the item quantity:");
   quantity1 = in.nextInt();
   item1.setQuantity(quantity1);
    
   in.nextLine();
   System.out.println();

   System.out.println("Item 2");
   System.out.println("Enter the item name:");
   name2 = in.nextLine();
   item2.setName(name2);
   System.out.println("Enter the item price:");
   price2 = in.nextInt();
   item2.setPrice(price2);
   System.out.println("Enter the item quantity:");
   quantity2 = in.nextInt();
   item2.setQuantity(quantity2);
   System.out.println();
   System.out.println("TOTAL COST");
   total1 = quantity1 * price1;
   total2 = quantity2 * price2;
   System.out.println(name1 + " " + quantity1 + " @ $" + price1 + " = " + "$" + total1);
   System.out.println(name2 + " " + quantity2 + " @ $" + price2 + " = " + "$" + total2);
   System.out.println();
   System.out.println("Total: $" + (total1 + total2));
  }
  //end main method
}
//end ShoppingCartPrinter class