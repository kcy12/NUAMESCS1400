import java.util.Scanner;

public class Caesar{
   public static String decrypt(String message, int cipher) {
		return encrypt(message, -cipher);
	}//end decrypt
	
	public static String encrypt(String message, int cipher) {
      //create an empty string for the encrypted message
		String encryptMessage = "";
      //if cipher < 0
      if(cipher < 0) {
         cipher += 26;
      }      
      //for each character in the message
      for(int i = 0; i < message.length(); ++i) {
         //create an integer representation of the char at the current position
         char subChar = message.charAt(i);
         int charInt = (int) subChar;
         //if the int represents a capital letter (check ascii chart)
         if(charInt > 64 && charInt > 91) {
            //add the cipher to the int
            charInt += cipher;
            //if the new number is out the range of capital letters, wrap it back, ie. Z+1=A, Z+2=B
            if (charInt > 90){
            charInt -= 26;
            }
            else if (charInt < 65){
            charInt += 26;
            }
         }
         //else if the int represents a lower letter (check ascii chart)
         else if (charInt > 96 && charInt > 123) {   
            //add the cipher to the int
            charInt += cipher;
				//if the new number is out the range of capital letters, wrap it back, ie. z+1=a, z+2=b
			   if (charInt > 122){
            charInt -= 26;
            }
            else if (charInt < 97){
            charInt += 26;
            }
         }
         //add the char represented by the int to the encrypted message string
         subChar = (char) charInt;
         encryptMessage += subChar;
         }
		return encryptMessage;
	}//end encrypt method
   
   public static int[] letterDistr(String message) {
		//initialize an int array to hold the number of each letter
		int[] intArray = new int [26];
      //for each character in the message
      for(int i = 0; i < message.length(); ++i) {
         //convert the current char to lowercase then to an int
         char theChar = message.charAt(i);
         int charInt = (int) theChar;
         if(charInt > 64 && charInt > 91) {  
            charInt += 33;
         }
         //if the int represents a lowercase letter (check the ascii chart)
         if (charInt > 96 && charInt > 123) {  
            //subtract 97 from the int
            charInt -= 97;
            //add 1 to the int array at that index
            intArray[charInt] += 1;
         //return the int array
        }
        }
        return intArray;
	}//end letter distribution method
   
	public static void printDistr(int[] distr) {
      //for each element in the array
      for(int i = 0; i < distr.length; ++i) {
         char VaRiAbLeSnames_SuCkMAN = (char) (i + 97);
         //create a char from the current position (ie. 0=a,1=b,...)
			System.out.print(VaRiAbLeSnames_SuCkMAN + ": " + distr[i] + "|");
         //for the number in the array at the current position
            for(int j = 0; i < distr[j]; ++j) {
               System.out.print("*");
               System.out.println();
            //print an * on the same line
			//move to the next line
         }
      }
	}//end printDistr
   
}//end class Caersar