/****
*Dana Escandor
*lab 16.15
le 3,18,2018
****/

//class
public class ItemToPurchase {

   //private field
   private String itemName;
   private int itemQuantity;
   private int itemPrice;

   
   //constructor
   public ItemToPurchase(){
      itemName = "none";
      itemQuantity = 0;
      itemPrice = 0;
   }//end c  
    
   //methods, set/get
   //NAME
   public void setName(String name){
      itemName = name;
      return;
   }//end setName
   
   public String getName(){
      return itemName;
   }//end getName
   
   //QUANTITY
   public void setQuantity(int quantity){
      itemQuantity = quantity;
      return;
   }//end setQuantity
   
   public int getQuantity(){
      return itemQuantity;
   }//end getQuantity
   
   //PRICE
   public void setPrice(int price){
      itemPrice = price;
      return;
   }//end setPrice
   
   public int getPrice(){
      return itemPrice;
   }//end getPrice
   

   
   
}//end