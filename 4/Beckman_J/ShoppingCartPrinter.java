// ***************************************************************
// ShoppingCartPrinter.java [Lab 6k]
// Student Name: Jarren Beckman
//
// Uses the Item class to create items and add them to a shopping
// cart stored in an ArrayList.
// ***************************************************************
import java.util.ArrayList;
import java.util.List;
import java.text.NumberFormat;
import java.util.Scanner;
public class ShoppingCartPrinter
 {
 public static void main( String[] args )
 {
 ItemToPurchase item;
 String itemName;
 double itemPrice;
 int quantity;
 Scanner scan = new Scanner( System.in );
 String keepShopping = "y";
 // ----------------------------------------------
 // TODO #1a: Create an ArrayList cart
 // ----------------------------------------------
 // Loop and allow user to add new shopping cart items
 do
 {
 System.out.println( "Item 1" );
 System.out.println( "Enter the name of the item:" );
 itemName = scan.nextLine();
 System.out.println( "Enter the unit price:" );
 itemPrice = scan.nextDouble();
 System.out.println( "Enter the quantity:" );
 System.out.println("");
 System.out.println( "Item 2" );
 System.out.println( "Enter the name of the item:" );
 itemName = scan.nextLine();
 System.out.println( "Enter the unit price:" );
 itemPrice = scan.nextDouble();
 System.out.println( "Enter the quantity:" );
 quantity = scan.nextInt();
 scan.nextLine();
 // ----------------------------------------------
 // TODO #1b: Create an new Item6k and add it to
 // the cart
 System.out.print( "Continue shopping (y/n)? " );
 keepShopping = scan.nextLine();
 }
 while ( keepShopping.equalsIgnoreCase( "y" ) );
 // ----------------------------------------------
 // TODO #2a: Loop through the cart
 // TODO #2ai: Print the item
 // TODO #2aii: Add up the total amount of all the items in the cart
 System.out.println();
 System.out.println( "Final Shopping Cart totals" );
 // ----------------------------------------------
 // TODO #2b: Output the total $ amount in cart
 NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
 }
 }