import java.util.Scanner;


public class ShoppingCartPrinter extends ItemToPurchase{
   
   public static void main(String [] Args){
      Scanner in = new Scanner(System.in);
      String inputName;
      int inputPrice;
      int inputQuantity;
      //item 1
      System.out.println("Item 1");
      System.out.println("Enter the item name:");
      ItemToPurchase item1 = new ItemToPurchase();
      inputName = in.nextLine();
      item1.setName(inputName);
      System.out.println("Enter the item price:");
      inputPrice = in.nextInt();
      item1.setPrice(inputPrice);
      System.out.println("Enter the item quantity:");
      inputQuantity = in.nextInt();
      item1.setQuantity(inputQuantity);
      
      System.out.println("");
      in.nextLine();
      
      //item 2
      System.out.println("Item 2");
      System.out.println("Enter the item name:");
      ItemToPurchase item2 = new ItemToPurchase();
      inputName = in.nextLine();
      item2.setName(inputName);
      System.out.println("Enter the item price:");
      inputPrice = in.nextInt();
      item2.setPrice(inputPrice);
      System.out.println("Enter the item quantity:");
      inputQuantity = in.nextInt();
      item2.setQuantity(inputQuantity);
      
      System.out.println("");
      
      //total cost
      System.out.println("TOTAL COST");
      System.out.println(item1.getName()+ " " + item1.getQuantity() + " @ $" + item1.getPrice() + " = $" +
     (item1.getPrice() * item1.getQuantity()));
      System.out.println(item2.getName()+ " " + item2.getQuantity() + " @ $" + item2.getPrice() + " = $" +
      (item2.getPrice() * item2.getQuantity()));
      
      System.out.println("");
      System.out.println("Total: $" + ((item1.getPrice() * item1.getQuantity()) +
      (item2.getPrice() * item2.getQuantity())));     
      
   }
}