/****
*Dana Escandor
*lab 16.15
le 3,18,2018
****/
//import
import java.util.Scanner;

//main() method
public class ShoppingCartPrinter {
   public static void main(String[] args){
   //scanner
   Scanner scnr = new Scanner(System.in);
   
   //strings
   String itemName_1;
   String itemName_2;
   //indentify
   ItemToPurchase i1 = new ItemToPurchase();
   ItemToPurchase i2 = new ItemToPurchase();
   //int
   int itemPrice_1;
   int itemPrice_2;
   int itemQuan_1;
   int itemQuan_2;
   int total_1;
   int total_2;

   
   //item 1
   //d
   System.out.println("Item 1");
   System.out.println("Enter the item name:");
   itemName_1 = scnr.nextLine();
   i1.setName(itemName_1);
   //d
   System.out.println("Enter the item price:");
   itemPrice_1 = scnr.nextInt();
   i1.setPrice(itemPrice_1);
   //d
   System.out.println("Enter the item quantity:");
   itemQuan_1 = scnr.nextInt();
   i1.setQuantity(itemQuan_1);
   
   
   //item 2
   itemName_2 = scnr.nextLine();
   i2.setName(scnr.nextLine());
   //d
   System.out.println("\nItem 2");
   System.out.println("Enter the item name:");

   
   //scan, set
   itemPrice_2 = scnr.nextInt();
   i2.setPrice(itemPrice_2);
   
   //d
   System.out.println("Enter the item price:");
   itemPrice_2 = scnr.nextInt();
   i2.setPrice(itemPrice_2);
   //d
   System.out.println("Enter the item quantity:");
   itemQuan_2 = scnr.nextInt();
   i2.setQuantity(itemQuan_2);
   
   //d
   System.out.println("\nTOTAL COST");
   //putttt them togeth ez
   total_1 = i1.getQuantity() * i1.getPrice();
   total_2 = i2.getQuantity() * i2.getPrice();
   System.out.println(i1.getName() + " " + i1.getQuantity() + " @ $" + i1.getPrice() + " = $" + total_1);
   System.out.println(i2.getName() + " " + i2.getQuantity() + " @ $" + i2.getPrice() + " = $" + total_2);
   System.out.println("\nTotal: $" + (total_1 + total_2));
   /*		System.out.println("TOTAL COST");
		System.out.println(item1.getName() + " " + i1.getQuantity() + " @ $"
				+ i1.getPrice() + " = $"
				+ (i1.getQuantity() * i1.getPrice()));
		System.out.println(i2.getName() + " " + i2.getQuantity() + " @ $"
				+ i2.getPrice() + " = $"
				+ (i2.getQuantity() * i2.getPrice()));
		System.out.println("\nTotal: $"
				+ ((i1.getQuantity() * i1.getPrice()) + (i2
						.getQuantity() * i2.getPrice()))); */
   
   }//end main
}//end class