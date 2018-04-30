/************************
* Alysha Robertson
* ItemToPurchase
* Last Edited: 3/15/18
************************/


public class ItemToPurchase{
   //define vars
   private String itemName;
   private int itemPrice;
   private int itemQuantity;
     
   //method ItemToPurchase
   public ItemToPurchase(){
   this.itemName="none";
   this.itemPrice=0;
   this.itemQuantity=0;
   }//end ItemToPurchase method

   //method setName
   public void setName(String itemName){
   this.itemName=itemName;
   }//end setName

   //method getName
   public String getName(){
   return this.itemName;
   }//end getName

   //method setPrice
   public void setPrice(int itemPrice){
   this.itemPrice=itemPrice;
   }//end setPrice

   //method getName
   public int getPrice(){
   return this.itemPrice;
   }//end getPrice

   //method setQuality
   public void setQuantity(int itemQuantity){
   this.itemQuantity=itemQuantity;
   }//end setQuantity

   //method getQuality
   public int getQuantity(){
   return this.itemQuantity;
   }//end getQuantity
}//end ItemToPurchase class