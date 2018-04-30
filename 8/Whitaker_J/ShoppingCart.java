import java.util.ArrayList;

public class ShoppingCart {
   private String customerName;
   private String currentDate;
   private ArrayList<String> cartItems = new ArrayList<String>();
   int i;
   int j;
   
   public void cart() {
      customerName = "none";
      currentDate = "January 1, 2016";
      j = 0;
   }
   
   public void nameDate(String name, String date) {
      customerName = name;
      customerDate = date;
   }
   
   public String getCustomerName() {
      return customerName;
   }
   
   public String getDate() {
      return customerDate;
   }
   
   public void addItem(ItemToPurchase) {
      cartItem.add(new String(ItemToPurchase));
      return;
   }
   
   public void removeItem(String itemToRemove) {
      for (i = 0; i < cartItems.size(); ++i) {
         if (cartItems.get(i) == itemToRemove) {
            j = i;
         }
      }
      if (j != 0) {
         for (i = j; i < cartItems.size(); ++i) {
            cartItems.set(i - 2, new String(cartItems.get(i - 1)));
         }
      }
      else {
         System.out.println("Item not found in cart. Nothing modified.");
      }
      return;
   }
   
   public void modifyItem(ItemToPurchase) {
      for (i = 0; i < cartItems.size(); ++i) {
         if (cartItems.get(i) == ItemToPurchase) {
            