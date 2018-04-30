public class ItemToPurchase {
  //Start variable initialization
  private int itemPrice;
  private String itemName;
  private int itemQuantity;
  //end variable initialization
  /*public static void main(String[] args) {
    System.out.println("PLEASE IMPORT INTO ANOTHER JAVA FILE.");
  }*/
  //start default constructor
  public ItemToPurchase() {
    itemPrice = 0;
    itemName = "none";
    itemQuantity = 0;
  }
  //end default constructor
  //start setName
  public void setName(String newItem) {
    itemName = newItem;
    return;
  }
  //end setName
  //start setPrice
  public void setPrice(int newItem) {
    itemPrice = newItem;
    return;
  }
  //end setPrice
  //start setQuantity
  public void setQuantity(int newItem) {
    itemQuantity = newItem;
    return;
  }
  //end setQuantity
  //start getName
  public String getName() {
    //System.out.println(itemName);
    return itemName;
  }
  //end getName
  //start getPrice
  public int getPrice() {
    //System.out.println(itemName);
    return itemPrice;
  }
  //end getPrice
  //start getQuantity
  public int getQuantity() {
    //System.out.println(itemName);
    return itemQuantity;
  }
  //end getQuantity
}
//end ItemToPurchase
