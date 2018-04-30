/*******************
*Grant Arave
*Online shopping cart
*Last Edited: 3/13/18
*******************/

import java.util.Scanner;

public class ItemToPurchase {

   private String itemName;
   private int itemPrice;
   private int itemQuantity;
   
   public ItemToPurchase()
   {
      itemName = "none";
      itemPrice = 0;
      itemQuantity = 0;
   }
   
   public void setName(String nameItem)
   {
      itemName = nameItem;
      return;
   }
   
   public void setPrice(int priceItem)
   {
      itemPrice = priceItem;
      return;
   }
   
   public void setQuantity(int quantityItem)
   {
      itemQuantity = quantityItem;
      return;
   }
   
   public String getName()
   {
      return itemName;
   }
   
   public int getPrice()
   {
      return itemPrice;
   }
   
   public int getQuantity()
   {
      return itemQuantity;
   }

   


   
   
}