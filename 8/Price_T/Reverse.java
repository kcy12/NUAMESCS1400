/**********************************
*Teancum Price
*Reverse a message the user inputs
*Last Edit: 2/9/18
**********************************/

//Import Scanner
import java.util.Scanner;

//Main Class
public class Reverse{
   //main method
   public static void main(String[] args) {
      //Create Scanner
      Scanner input = new Scanner(System.in);
      //Declare Variables
      String message;
      String newMessage;
      //Get Message
      message = input.nextLine();
      //Call reverse
      newMessage = reverse(message);
      //Print reverse message
      System.out.println(newMessage);
   }//End main method
   
   //reverse method
   public static String reverse(String origString) {
      //Declare Variables
      String newString = "";
      int i;
      //Start for loop
      for (i = origString.length() -1; i >= 0; --i) {
         //Add the last character to the new string
         newString = newString.concat(origString.substring(i, i + 1));
      }
      //Return the reversed string
      return newString;
   }//End reverse method
}//End Main class