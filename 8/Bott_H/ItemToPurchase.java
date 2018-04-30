/********************
*Holden Bott
*ItemToPurchase
*Last Edited: 3/18/18
********************/

import java.util.Scanner;

public class ItemToPurchase {
   //vars
   private int itemPrice;
   private String itemName;
   private int itemQuantity;

   
   public ItemToPurchase() {
      itemPrice = 0;
      itemName = "none";
      itemQuantity = 0;
   }
   
   //set name method
   public void setName(String name) {
      itemName = name;
   }//end set name
   
   //set price method
   public void setPrice(int price) {
      itemPrice = price;
   }
   
   //set quantity method
   public void setQuantity(int quantity) {
      itemQuantity = quantity;
   }
   
   //name method
   public String getName() {
      return itemName;
   }
   
   //price method
   public int getPrice() {
      return itemPrice;
   }//end price accessor
   
   //set quantity
   public int getQuantity () {
      return itemQuantity;
   } 
}