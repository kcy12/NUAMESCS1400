/***********************************
*Nick Lee
*Item To Purchase Chapter 16.15
* Works along Shopping Cart Printer
*Last Edited: 3-17-2018
***********************************/

public class ItemToPurchase {
   //Private fields
   private String itemName;
   private int itemPrice;
   private int itemQuantity;
   
   //default constructor
   public ItemToPurchase(){
      itemName = "none";
      itemPrice = 0;
      itemQuantity = 0;
   }//end constructor
   //public methods
   public void setName(String name){
      itemName = name;
      return;
   }//end setName
   public String getName(){
      return itemName;
   }//end getName
   public void setPrice(int price){
      itemPrice = price;
      return;
   }//end setPrice
   public int getPrice(){
      return itemPrice;
   }//end getPrice
   public void setQuantity(int quantity){
      itemQuantity = quantity;
      return;
   }//end setQuantity
   public int getQuantity(){
      return itemQuantity;
   }//end getQuantity
}//end class