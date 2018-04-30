import java.util.Scanner;
public class ShoppingCartPrinter{
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      ItemToPurchase Item1 = new ItemToPurchase();
      ItemToPurchase Item2 = new ItemToPurchase();
      System.out.println("Item 1");
      System.out.println("Enter the item name:");
      String name1 = scan.nextLine();
      Item1.setName(name1);
      System.out.println("Enter the item price:");
      int int1 = scan.nextInt();
      Item1.setPrice(int1);
      System.out.println("Enter the item quantity:");
      int int2 = scan.nextInt();
      Item1.setQuantity(int2);
      System.out.println();
      scan.nextLine();
      System.out.println("Item 2");
      System.out.println("Enter the item name:");
      String name2 = scan.nextLine();
      Item2.setName(name2);
      System.out.println("Enter the item price:");
      int int3 = scan.nextInt();
      Item2.setPrice(int3);
      System.out.println("Enter the item quantity:");
      int int4 = scan.nextInt();
      Item2.setQuantity(int4);
      System.out.println();
      int integer1 = Item1.getPrice() * Item1.getQuantity();
      int integer2 = Item2.getPrice() * Item2.getQuantity();
      System.out.println("TOTAL COST");
      String name3 = Item1.getName();
      String name4 = Item2.getName();
      System.out.println(name3 + " " + Item1.getQuantity() + " @ $" + Item1.getPrice() + " = $" + integer1);
      System.out.println(name4 + " " + Item2.getQuantity() + " @ $" + Item2.getPrice() + " = $" + integer2);
      System.out.println();
      System.out.println("Total: $" + (integer1 + integer2));
   }
}
      