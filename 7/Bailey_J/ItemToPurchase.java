import java.util.Scanner;

public class ItemToPurchase {
   //define varaibles
   private int itemPrice;
   private String itemName;
   private int itemQuantity;

   //Create the default constructor
   public ItemToPurchase() {
      itemPrice = 0;
      itemName = "none";
      itemQuantity = 0;
   }//end constructor
   
   //start set name
   public void setName(String name) {
      itemName = name;
   }//end set name
   
   //start set Price
   public void setPrice(int price) {
      itemPrice = price;
   }//end set Price
   
   //start set Quantity
   public void setQuantity(int quantity) {
      itemQuantity = quantity;
   }//end set Quantity
   
   //start name accessor
   public String getName() {
      return itemName;
   }//end name accessor
   
   //start price accessor
   public int getPrice() {
      return itemPrice;
   }//end price accessor
   
   //start quantity accessor
   public int getQuantity () {
      return itemQuantity;
   }//end quantity accessor
   
   
   
   
}//end class