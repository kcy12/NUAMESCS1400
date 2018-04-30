/**********************
* Ethan Pickard
* Online shopping cart
* Last Edited: 3/13/18
***********************/

public class ItemToPurchase {

//private vars
private String itemName;
private int itemPrice;
private int itemQuantity;

   //constructor
   public ItemToPurchase() {
      itemName = "none";
      itemPrice = 0;
      itemQuantity = 0;
   } 
   
   //mutators and accessors
   public void setName(String inputName) {
      itemName = inputName;
   }
   
   public void setPrice(int inputPrice) {
      itemPrice = inputPrice;
   }
   
   public void setQuantity(int inputQuantity) {
      itemQuantity = inputQuantity;
   }
   
   public String getName() {
      return itemName;
   }
   
   public int getPrice() {
      return itemPrice;
   }
   
   public int getQuantity() {
      return itemQuantity;
   }


}//end ItemToPurchase class