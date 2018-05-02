import java.util.Scanner;

public class Caesar{
   public static String decrypt(String message, int cipher) {//call encrypt w/ a negative input
      String s = "";
      s = encrypt(message, -cipher);//neg cipher
		return s;
	}//end decrypt
	
	public static String encrypt(String message, int cipher) {
      String ENCmessage = "";//create an empty string for the encrypted message
		
      if(cipher < 0)//if cipher < 0
      {
         cipher += 26;//cipher += 26
      }
      for(int i = 0; i < message.length(); i++)//for each character in the message
      {
      char subChar = message.charAt(i);//takes the char from the string
	   int charInt = (int) subChar;     //create an integer representation of the char at the current position
	   if(charInt<91 && charInt>64)   //if the int represents a capital letter (check ascii chart)
	   {
            charInt += cipher;//add the cipher to the int 
      
	      if(charInt>90)
	      {
              charInt -= 26;//if the new number is out the range of capital letters, wrap it back, ie. Z+1=A, Z+2=B
	      }
         if(charInt<65)
         {
            charInt += 26;
         }
	   }
       else if(charInt<123 && charInt>96)//else if the int represents a lower letter (check ascii chart)
	    {
            charInt += cipher;//add the cipher to the int//Method call?
		   if(charInt > 122)
		   {
				charInt -=26;//if the new number is out the range of lower letters, wrap it back, ie. z+1=a, z+2=b
		   }
         if(charInt < 61)
         {
            charInt +=26;
         }
         subChar = (char) charInt;
       }
         ENCmessage += subChar; //add the char represented by the int to the encrypted message string//use .appends if you cant convert char to string
      }

		return ENCmessage;
   }//end encrypt method
   
   public static int[] letterDistr(String message) {
	int[] messageArray = new int[26];//initialize an int array to hold the number of each letter
		
   for(int i = 0; i < message.length(); i++)//for each character in the message
	{
      char subChar = message.charAt(i);
		int charInt = (int) subChar; //convert the current char to lowercase then to an int
      if(charInt<90&&charInt>65)
      {
         charInt += 33;
      }
      if(charInt<122&&charInt>97)//if the int represents a lowercase letter (check the ascii chart)
		{
         charInt -= 97;//subtract 97 from the int//puts it into the index # of array
			messageArray[charInt] += 1;//add 1 to the int array at that index
		}
    }
		return messageArray;//return the int array
      
	}//end letter distribution method
   
	public static void printDistr(int[] distr) {
      for(int i = 0; i < distr.length; i++)//for each element in the array
		{
         int testInt = i + 97;
         char c = (char) testInt;//create a char from the current position (ie. 0=a,1=b,...)
		   System.out.print(c + ": " + distr[i] + "|");//what letter? the one from the array we just converted?
         for(int j = 0; j<distr[i]; j++)//for the number in the array at the current position
		   {
             System.out.print("*");//print an * on the same line
		   	   
		   }
      System.out.println();
      }
	}//end printDistr
   
}//end class Caersar
