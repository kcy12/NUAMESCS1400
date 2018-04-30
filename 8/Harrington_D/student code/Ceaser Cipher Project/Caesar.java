import java.util.Scanner;

public class Caesar{
   public static String decrypt(String message, int cipher) {
		return /*run the encryption method backwards*/;
	}//end decrypt
	
	public static String encrypt(String message, int cipher) {
      //create an empty string for the encrypted message
      String = "";
		
      if(cipher < 0){
         cipher += 26;
      //if cipher < 0
         //cipher += 26
         }
      for(){
      //for each character in the message
         //create an integer representation of the char at the current position
         //if the int represents a capital letter (check ascii chart)
            //add the cipher to the int
            //if the new number is out the range of capital letters, wrap it back, ie. Z+1=A, Z+2=B
         //else if the int represents a lower letter (check ascii chart)
            //add the cipher to the int
				//if the new number is out the range of capital letters, wrap it back, ie. z+1=a, z+2=b
			//add the char represented by the int to the encrypted message string
      }


		return /*encrypted message*/;
	}//end encrypt method
   
   public static int[] letterDistr(String message) {
		//initialize an int array to hold the number of each letter
		
      //for each character in the message
         //convert the current char to lowercase then to an int
         //if the int represents a lowercase letter (check the ascii chart)
            //subtract 97 from the int
            //add 1 to the int array at that index
         //return the int array
	}//end letter distribution method
   
	public static void printDistr(int[] distr) {
      //for each element in the array
         //create a char from the current position (ie. 0=a,1=b,...)
			System.out.print(/*letter*/ + ": " + distr[i] + "|");
         //for the number in the array at the current position
            //print an * on the same line
			//move to the next line
	}//end printDistr
   
}//end class Caersar