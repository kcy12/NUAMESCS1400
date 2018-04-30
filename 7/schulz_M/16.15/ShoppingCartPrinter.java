//import
import java.util.Scanner;
/class
public class ShoppingCartPrinter {
// main
   public static void main(String[] args) {
   //vars
   Scanner s = new Scanner(System.in);

   String name1;
   int quantity1;
   int price1;
   int total1;

   String name2;
   int quantity2;
   int price2;
   int total2;

   ItemToPurchase item1 = new ItemToPurchase();
   ItemToPurchase item2 = new ItemToPurchase();
   //code
   System.out.println("Item 1");
   System.out.println("Enter the item name:");
   name1 = s.nextLine();
   item1.setName(name1);
   System.out.println("Enter the item price:");
   price1 = s.nextInt();
   item1.setPrice(price1);
   System.out.println("Enter the item quantity:");
   quantity1 = s.nextInt();
   item1.setQuantity(quantity1);

   s.nextLine();
   System.out.println();

   System.out.println("Item 2");
   System.out.println("Enter the item name:");
   name2 = s.nextLine();
   item2.setName(name2);
   System.out.println("Enter the item price:");
   price2 = s.nextInt();
   item2.setPrice(price2);
   System.out.println("Enter the item quantity:");
   quantity2 = s.nextInt();
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
