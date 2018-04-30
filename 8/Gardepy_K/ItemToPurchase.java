/**********************
*Kacie Gardepy
*Item To Purchase Class
*Last Edited: 03/2018
**********************/

//class definition to the 16.15 Online Shopping Cart Duo
//public class
public class ItemToPurchase{

   //private fields initialized
   private String itemName;
   private int itemPrice;
   private int itemQuantity;
  
   //Default Constructor
   //now put in the variables for the string and ints
   public ItemToPurchase(){
      String itemName = "none";
      int itemPrice = 0;
      int itemQuantity = 0;
   }//end public 

   //Public Member Methods (mutators & accessors)
   //pretty much setting the name quantity and price info
   public void setName(String name){
      itemName = name;
      return;
   }//end public
   //MAKE SURE TO KEEP PRICE AND QUANTITY AS INTS
   public void setPrice(int price){
      itemPrice = price;
      return;
   }//end public
   public void setQuantity(int quantity){
      itemQuantity = quantity;
      return;
  }//end public
   //FINISH LATER AND FIX PART 2

}//end Class