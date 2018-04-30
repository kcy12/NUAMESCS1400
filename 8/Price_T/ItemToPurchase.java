/********************
*Teancum Price
*Item To Purchase
*Last Edit: 3/13/18
********************/

public class ItemToPurchase{
   //Private Fields
   private String itemName;
   private int itemPrice;
   private int itemQuantity;
   
   //Default Constructor
   public ItemToPurchase(){
      //Set Default Values
      itemName = "none";
      itemPrice = 0;
      itemQuantity = 0;
   }//End Constructor Method
   //Set Name
   public void setName(String newName) {
      itemName = newName;
   }
   //Set Price
   public void setPrice(int newPrice) {
      itemPrice = newPrice;
   }
   //Set Quantity
   public void setQuantity(int newQuantity) {
      itemQuantity = newQuantity;
   }
   //Get Name
   public String getName() {
      return itemName;
   }
   //Get Price
   public int getPrice() {
      return itemPrice;
   }
   //Get Quantity
   public int getQuantity() {
      return itemQuantity;
   }
}//End Class ItemToPurchase