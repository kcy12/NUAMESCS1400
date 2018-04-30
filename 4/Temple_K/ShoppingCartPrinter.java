import java.util.Scanner;
public class ShoppingCartPrinter {

public static void main(String[] args) {
   //Declaring scanner object
   Scanner scanner = new Scanner(System.in);
   //Prompting the user for two items
   System.out.println( "Enter two items: ");
   //Creating two objects
   ItemToPurchase item1 = new ItemToPurchase();
   ItemToPurchase item2 = new ItemToPurchase();
   
   System.out.println("Item 1");
   
   System.out.println("Enter the item name : ");
   item1.setItemName(scanner.nextLine());
   
   System.out.println("Enter the item price :");
   item1.setItemPrice(scanner.nextInt());
   
   System.out.println("Enter the item quantity : ");
   item1.setItemQuantity(scanner.nextInt());
   System.out.println();
   //Calling scanner.nextLine(); to allow the user to input a new string
   
   String demoCharacter = scanner.nextLine();
   System.out.println("Item 2");
   System.out.println("Enter the item name : ");
   item2.setItemName(scanner.nextLine());
   
   System.out.println("Enter the item price :");
   item2.setItemPrice(scanner.nextInt());
   
   System.out.println("Enter the item quantity : ");
   item2.setItemQuantity(scanner.nextInt());
   
   int totalCostOfItem1 = item1.getItemQuantity()*item1.getItemPrice();
   int totalCostOfItem2 = item2.getItemQuantity()*item2.getItemPrice();
   
   System.out.println("TOTAL COST " +item1.getItemName()+" "+item1.getItemQuantity()+" @ $"+item1.getItemPrice()+" = "+totalCostOfItem1+" "+item2.getItemName()+" "+item2.getItemQuantity()+" @ $"+item2.getItemPrice()+" = "+totalCostOfItem1+" "+"Total: $"+(totalCostOfItem1+totalCostOfItem2));
   }
  }