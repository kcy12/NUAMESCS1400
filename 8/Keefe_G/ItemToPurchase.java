public class ItemToPurchase{
   private String itemName;
   private int itemPrice;
   private int itemQuantity;
   
   public ItemToPurchase(){
      itemName = "none";
      itemPrice = 0;
      itemQuantity = 0;
   }
   public void setName(String itemName){
      this.itemName = itemName;
   }
   public String getName(){
      String name = this.itemName;
      return name;
   }
   public void setPrice(int itemPrice){
      this.itemPrice = itemPrice;
   }
   public int getPrice(){
      int integer = this.itemPrice;
      return integer;
   }
   public void setQuantity(int itemQuantity){
      this.itemQuantity = itemQuantity;
   }
   public int getQuantity(){
      int integer = this.itemQuantity;
      return integer;
   }
}