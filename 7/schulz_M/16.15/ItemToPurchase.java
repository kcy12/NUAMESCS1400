import java.util.Scanner;

public class ItemToPurchase{
  //var initialization
  private int itemPrice;
  private String itemName;
  private int itemQuantity;
  //public static void main(String[] args){
  //}main
     //Default Constructhot
      public ItemToPurchase(){
        itemName = "none";
        itemPrice = 0;
        itemQuantity = 0;
     }
     //start setName
     public void setName(String newItem) {
       itemName = newItem;
       return;
     }
     //start setPrice
     public void setPrice(int newItem) {
       itemPrice = newItem;
       return;
     }
     //start setQuantity
     public void setQuantity(int newItem) {
       itemQuantity = newItem;
       return;
     }
     //start getName
     public String getName() {
       //System.out.println(itemName);
       return itemName;
     }
     //start getPrice
     public int getPrice() {
       //System.out.println(itemName);
       return itemPrice;
     }
     //start getQuantity
     public int getQuantity() {
       //System.out.println(itemName);
       return itemQuantity;
     }
     //end getQuantity
   }
   //end ItemToPurchase
