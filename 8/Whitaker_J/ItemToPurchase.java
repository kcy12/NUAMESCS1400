public class ItemToPurchase {
   private String itemName;
   private int itemPrice;
   private int itemQuantity;
   private String itemDescription;
   
   public void Item() {
      itemName = "none";
      itemPrice = 0;
      itemQuantity = 0;
      itemDescription = "none"
      return;
   }
   
   public void setName(String itemToName) {
      itemName = itemToName;
      return;
   }
   
   public void setPrice(int itemToPrice) {
      itemPrice = itemToPrice;
      return;
   }
   
   public void setQuantity(int itemToQuantify) {
      itemQuantity = itemToQuantify;
      return;
   }
   
   public String getName() {
      return itemName;
   }
   
   public int getPrice() {
      int price = itemPrice;
      return itemPrice;
   }
   
   public int getQuantity() {
      return itemQuantity;
   }
   
   public void setDescription(String itemToDescribe) {
      itemDescription = itemToDescribe;
      return;
   }
   
   public String getDescription() {
      return itemDescription;
   }
   
   public void printItemCost() {
      System.out.println(itemName + " " + itemQuantity + " @ $" + itemPrice + " = $" + (itemPrice * itemQuantity);
      return;
   }
   
   
   public void printItemDescription() {
      System.out.println(itemName + ": " + itemDescription);
      return;
   }
}