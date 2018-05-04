import java.util.Scanner;

public class Caesar{
   public static String decrypt(String message, int cipher) {
		return encrypt(message, -cipher);
	}//end decrypt
	
	public static String encrypt(String message, int cipher) {
      //create an empty string for the encrypted message
      String encryptMessage = "";
		
      if (cipher < 0) {
         cipher += 26;
      }
      
      for (int i = 0; i < message.length(); i++) {
         //create an integer representation of the char at the current position
         char subChar = message.charAt(i);
         int charInt = (int) subChar;
         //if the int represents a capital letter (check ascii chart)
         if (charInt > 64 && charInt < 91) {
            //add the cipher to the int
            charInt += cipher;
            //if the new number is out the range of capital letters, wrap it back, ie. Z+1=A, Z+2=B
            if (charInt > 90) {
               charInt -= 26;
            }
            if (charInt < 65) {
               charInt += 26;
            }
         }
         
         //else if the int represents a lower letter (check ascii chart)
         else if (charInt > 96 && charInt < 123) {
            charInt += cipher;
            
            if (charInt > 122) {
               charInt -= 26;
            } 
            if (charInt < 97) {
               charInt += 26;
            }
         }
         
			  
         
         subChar = (char) charInt;
         //add the char represented by the int to the encrypted message string
         encryptMessage += subChar;      
      }

      return encryptMessage;
	}//end encrypt method
   
   public static int[] letterDistr(String message) {
		//initialize an int array to hold the number of each letter
      int[] messageArray = new int[26];
		
      //for each character in the message
      for (int i = 0; i < message.length(); i++) {
         char currentChar = message.charAt(i);
         int charInt = (int) currentChar;
         //convert the current char to lowercase then to an int
         if (charInt > 64 && charInt < 91) {
            charInt = charInt + 32;
         }
         //if the int represents a lowercase letter (check the ascii chart)
         if (charInt > 96 && charInt < 123) {
            //subtract 97 from the int
            charInt = charInt - 97;
            //add 1 to the int array at that index
            messageArray[charInt] += 1;
         }
      }//end for
      return messageArray;
	}//end letter distribution method
   
	public static void printDistr(int[] distr) {
      //for each element in the array
      for (int i = 0; i < distr.length; i++) {
         char c = (char) (i + 97); //create a char from the current position (ie. 0=a,1=b,...)
         System.out.print(c + ": " + distr[i] + "|");
         for (int j = 0; j < distr[i]; j++) { //for the number in the array at the current position
            System.out.print("*");
            
         }
         System.out.println(); //move to the next line
      }		
	}//end printDistr
   
}//end class Caersar