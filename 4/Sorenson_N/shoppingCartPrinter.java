import java.util.Scanner;

public class ShoppingCartPrinter{
   public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      ItemToPurchase itemOne = new ItemToPurchase();
      ItemToPurchase itemTwo = new ItemToPurchase();
      int priceOne;
      int numberOne;
      int priceTwo;
      int numberTwo;
      
      System.out.println("Item 1");
      System.out.println("Enter the item name:");
      itemOne.setName(input.nextLine());
      System.out.println("Enter the item price:");
      itemOne.setPrice(input.nextInt());
      input.nextLine();
      System.out.println("Enter the item quantity:");
      itemOne.setQuantity(input.nextInt());
      input.nextLine();
      System.out.println();
      
      System.out.println("Item 2");
      System.out.println("Enter the item name:");
      itemTwo.setName(input.nextLine());
      System.out.println("Enter the item price:");
      itemTwo.setPrice(input.nextInt());
      input.nextLine();
      System.out.println("Enter the item quantity:");
      itemTwo.setQuantity(input.nextInt());
      System.out.println();
      
      
      priceOne = itemOne.getPrice();
      numberOne = itemOne.getQuantity();
      priceTwo = itemTwo.getPrice();
      numberTwo = itemTwo.getQuantity();
      System.out.println("TOTAL COST");
      System.out.println(itemOne.getName() + " " + numberOne + " @ $" + priceOne + " = $" + (priceOne * numberOne));
      System.out.println(itemTwo.getName() + " " + numberTwo + " @ $" + priceTwo + " = $" + (priceTwo * numberTwo));
      System.out.println();
      System.out.println("Total: $" + ((priceOne * numberOne)+(priceTwo * numberTwo)));
   }
}