import java.util.Scanner;
public class ItemToPurchase{
   private String itemName = "none";
   private int itemPrice = 0;
   private int itemQuantity = 0;
   
   public void setName(String inputName){
      itemName = inputName;
      return;
   }
   public String getName(){
      return itemName;
   }
   public void setPrice(int inputPrice){
      itemPrice = inputPrice;
      return;
   }
   public int getPrice(){
      return itemPrice;
   }
   public void setQuantity(int inputQuantity){
      itemQuantity = inputQuantity;
      return;
   }
   public int getQuantity(){
      return itemQuantity;
   }
}   
      