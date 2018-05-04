import java.util.Scanner;

public class Caesar{
   public static String decrypt(String message, int cipher) {
		String decryptedMessage = "";
      encrypt(message, -(cipher));
      return decryptedMessage;
	}//end decrypt
	
	public static String encrypt(String message, int cipher) {
      //create an empty string for the encrypted message
      int i;
      String encryptedMessage = "";		
      //if cipher < 0
      if(cipher < 0){
         //cipher += 26
         cipher += 26;
      }      
      //for each character in the message
      for(i = 0; i < message.length(); i++){
         char subChar = message.charAt(i);
         //create an integer representation of the char at the current position
         int charInt = subChar;
         //if the int represents a capital letter (check ascii chart)
         if(charInt < 91 && charInt > 64){
            //add the cipher to the int
            charInt += cipher;
            //if the new number is out the range of capital letters, wrap it back, ie. Z+1=A, Z+2=B
            if(charInt > 90){
               charInt = charInt - 26;
            }
            if(charInt < 65){
               charInt = charInt + 26;
            }
         }
         //else if the int represents a lower letter (check ascii chart)
         else if(charInt < 123 && charInt > 96){
            //add the cipher to the int
            charInt += cipher;
				//if the new number is out the range of capital letters, wrap it back, ie. z+1=a, z+2=b
            if(charInt > 122){
               charInt = charInt - 26;
            }
            if(charInt < 97){
               charInt = charInt + 26;
            }
         }
			//add the char represented by the int to the encrypted message string
         encryptedMessage += subChar; //if this doesn't work try the .append method
      }
		return encryptedMessage;
	}//end encrypt method
   
   public static int[] letterDistr(String message) {
		//initialize an int array to hold the number of each letter
      int[] messageArray = new int[26];
		
      //for each character in the message
      for(int i = 0; i < message.length(); i++){
         //convert the current char to lowercase then to an int
         char subChar = message.charAt(i);
         int charInt = (int) subChar;
         if(charInt < 91 && charInt > 64){
            charInt += 32;
         }
         //if the int represents a lowercase letter (check the ascii chart)
         if(charInt < 123 && charInt > 96){
            //subtract 97 from the int
            charInt -= 97;
            //add 1 to the int array at that index
            messageArray[charInt] += 1;
         }
       }
       //return the int array
       return messageArray;
	}//end letter distribution method
   
	public static void printDistr(int[] distr) {
      //for each element in the array
      for(int i = 0; i < distr.length; i++){
         //create a char from the current position (ie. 0=a,1=b,...)
         int testInt = i + 97;
         char c = (char) testInt;
			System.out.print(c + ": " + distr[i] + "|");
         //for the number in the array at the current position
         for(int j = 0; j < distr[i]; j++){
            //print an * on the same line
            System.out.print("*");
         }
			//move to the next line
         System.out.println("");
      }         
	}//end printDistr
   
}//end class Caesar