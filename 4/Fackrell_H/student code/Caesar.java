import java.util.*;

public class Caesar {
  public static String decrypt(String message, int cipher) {
		/*run the encryption method backwards*/
    String encrypted = "";
    //if cipher < 0
    if (cipher < 0) {
      //cipher += 26
      cipher += 26;
    }
    //for each character in the message
    for (int i = 0; i < message.length(); i++) {
      //create an integer representation of the char at the current position
      int representation = (int)message.charAt(i);
      //if the int represents a capital letter (check ascii chart)
      if (representation >= 65 && representation <= 90) {
        //add the cipher to the int
        representation -= cipher;
        //if the new number is out the range of capital letters,
        if (representation < 65) {
          //wrap it back, ie. Z+1=A, Z+2=B
          representation += 26;
        }
      //else if the int represents a lower letter (check ascii chart)
      } else if (representation >= 97 && representation <= 122) {
        //add the cipher to the int
        representation -= cipher;
        //if the new number is out the range of lowercase letters,
        if (representation < 97) {
          //wrap it back, ie. Z+1=A, Z+2=B
          representation += 26;
        }
      }
		  //add the char represented by the int to the encrypted message string
      encrypted += (char)(representation);
    }
		return encrypted;
	}//end decrypt
  public static String encrypt(String message, int cipher) {
    //create an empty string for the encrypted message
    String encrypted = "";
    //if cipher < 0
    if (cipher < 0) {
      //cipher += 26
      cipher += 26;
    }
    //for each character in the message
    for (int i = 0; i < message.length(); i++) {
      //create an integer representation of the char at the current position
      int representation = (int)message.charAt(i);
      //if the int represents a capital letter (check ascii chart)
      if (representation >= 65 && representation <= 90) {
        //add the cipher to the int
        representation += cipher;
        //if the new number is out the range of capital letters,
        if (representation > 90) {
          //wrap it back, ie. Z+1=A, Z+2=B
          representation -= 26;
        }
      //else if the int represents a lower letter (check ascii chart)
      } else if (representation >= 97 && representation <= 122) {
        //add the cipher to the int
        representation += cipher;
        //if the new number is out the range of lowercase letters,
        if (representation > 122) {
          //wrap it back, ie. Z+1=A, Z+2=B
          representation -= 26;
        }
      }
		  //add the char represented by the int to the encrypted message string
      encrypted += (char)(representation);
    }
		return encrypted;
	}//end encrypt method
  public static int[] letterDistr(String message) {
    //initialize an int array to hold the number of each letter
    int[] distribution = new int[26];
    //for each character in the message
    for (int i = 0; i < message.length(); i++) {
      //convert the current char to lowercase then to an int
      int letter = Character.toLowerCase(message.charAt(i));
      //if the int represents a lowercase letter (check the ascii chart)
      if (letter >= 97 && letter <= 122) {
        //subtract 97 from the int
        letter -= 97;
        //add 1 to the int array at that index
        distribution[letter] += 1;
      }
    }
    //return the int array
    return distribution;
	}//end letter distribution method
	public static void printDistr(int[] distr) {
    //for each element in the array
    for (int i = 0; i < distr.length; i++) {
      //create a char from the current position (ie. 0=a,1=b,...)
      char currentChar = (char)(i + 97);
		  System.out.print(currentChar + ": " + distr[i] + "|");
      //for the number in the array at the current position
      for (int j = 0; j < distr[i]; j++) {
        //print an * on the same line
        System.out.print("*");
      }
		  //move to the next line
      System.out.println("");
    }
	}//end printDistr
}//end class Caesar
