/*******************************
* Leon Nguyen
* Item to Purchase
* 3/14/18 
********************************/
public class ItemToPurchase{
   private String itemName;
   private int itemPrice;
   private int itemQuantity;
   
   public ItemToPurchase(){
      itemName = "none";
      itemPrice = 0;
      itemQuantity = 0;
   }
   public void setName(String nameItem){
      itemName = nameItem;
   }
   public void setPrice(int priceItem){
      itemPrice = priceItem;
   }
   public void setQuantity(int quantityItem){
      itemQuantity = quantityItem;
   }
   public String getName(){
      return itemName;
   }
   public int getPrice(){
      return itemPrice;
   }
   public int getQuantity(){
      return itemQuantity;
   }
}