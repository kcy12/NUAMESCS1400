import java.util.Scanner;

public class Caesar{
   public static String decrypt(String message, int cipher) {
		return encrypt(message, -cipher);
	}//end decrypt
	
	public static String encrypt(String message, int cipher) {
      //create an empty string for the encrypted message
      //WIP!!!!!
      String cryptic = "";
      int i;
      int charVal;
      char tempChar;
		
      //if cipher < 0
         //cipher += 26
      if (cipher < 0) {
         cipher += 26;
      }
      
      //for each character in the message
      for (i = 0; i < message.length(); ++i) {
         //create an integer representation of the char at the current position
         tempChar = message.charAt(i);
         charVal = tempChar;
         //if the int represents a capital letter (check ascii chart)
         if ((charVal > 64) && (charVal < 91)) {
            //add the cipher to the int
            charVal += (cipher);
            //if the new number is out the range of capital letters, wrap it back, ie. Z+1=A, Z+2=B
            if (charVal > 90) {
               charVal -= 26;
            }
         }
         //else if the int represents a lower letter (check ascii chart)
         else if ((charVal > 96) && (charVal < 123)){
            //add the cipher to the int
            charVal += (cipher);
				//if the new number is out the range of capital letters, wrap it back, ie. z+1=a, z+2=b
            if (charVal > 122) {
               charVal -= 26;
            }
         }
			//add the char represented by the int to the encrypted message string
         tempChar = (char)charVal;
         cryptic += tempChar;
      }


		return cryptic;
	}//end encrypt method
   
   public static int[] letterDistr(String message) {
		//initialize an int array to hold the number of each letter
		int[] letters = new int[26];
      int i;
      int charVal;
      //for each character in the message
      message = message.toLowerCase();
      for (i = 0; i < message.length(); ++i){
         //convert the current char to lowercase then to an int
         charVal = message.charAt(i);
         //if the int represents a lowercase letter (check the ascii chart)
         if ((charVal > 96) && (charVal < 123)) {
            //subtract 97 from the int
            //add 1 to the int array at that index
            letters[charVal - 97] += 1;
         }
      }
         //return the int array
      return letters;
	}//end letter distribution method
   
	public static void printDistr(int[] distr) {
      int i;
      int j;
      char tempChar;
      //for each element in the array
      for (i = 0; i < 26; ++i) {
         //create a char from the current position (ie. 0=a,1=b,...)
         tempChar = (char)(i + 97);
			System.out.print(tempChar + ": " + distr[i] + "|");
         //for the number in the array at the current position
         for (j = 0; j < distr[i]; ++j) {
            //print an * on the same line
            System.out.print("*");
         }
			//move to the next line
         System.out.println();
      }
	}//end printDistr
   
}//end class Caersar