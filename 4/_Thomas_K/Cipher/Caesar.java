import java.util.Scanner;

public class Caesar{
  public static String decrypt(String message, int cipher) {
    int i;
    int length = message.length();
    int l;
    char nl;
    //create an empty string for the decrypted message
    String decrypted = "";
    //if cipher < 0
    if(cipher < 0) {
      //cipher += 26
      cipher += 26;
    }
    //for each character in the message
    for(i = 0; i < length; i++) {
      //create an integer representation of the char at the current position
      l = (int) message.charAt(i);
      //if the int represents a capital letter (check ascii chart)
      if(l >= 65 && l <= 90) {
        //add the cipher to the int
        l -= cipher;
        //if the new number is out the range of capital letters, wrap it back, ie. Z+1=A, Z+2=B
        if(l < 65) {
          l = (l + 90) - 64;
        }
      }
      //else if the int represents a lower letter (check ascii chart)
      else if(l >= 97 && l <= 122) {
        l -= cipher;
      //if the new number is out the range of capital letters, wrap it back, ie. z+1=a, z+2=b
        if(l < 97) {
          l = (l + 122) - 96;
        }
      }
      //add the char represented by the int to the encrypted message string
      nl = (char) l;
      decrypted += nl;
    }
    return decrypted;
  }//end decrypt

  public static String encrypt(String message, int cipher) {
    int i;
    int length = message.length();
    int l;
    char nl;
    //create an empty string for the encrypted message
    String encrypted = "";
    //if cipher < 0
    if(cipher < 0) {
      //cipher += 26
      cipher += 26;
    }
    //for each character in the message
    for(i = 0; i < length; i++) {
      //create an integer representation of the char at the current position
      l = (int) message.charAt(i);
      //if the int represents a capital letter (check ascii chart)
      if(l >= 65 && l <= 90) {
        //add the cipher to the int
        l += cipher;
        //if the new number is out the range of capital letters, wrap it back, ie. Z+1=A, Z+2=B
        if(l > 90) {
          l = (l - 90) + 64;
        }
      }
      //else if the int represents a lower letter (check ascii chart)
      else if(l >= 97 && l <= 122) {
        l += cipher;
      //if the new number is out the range of capital letters, wrap it back, ie. z+1=a, z+2=b
        if(l > 122) {
          l = (l - 122) + 96;
        }
      }
      //add the char represented by the int to the encrypted message string
      nl = (char) l;
      encrypted += nl;
    }
    return encrypted;
  }//end encrypt method

  public static int[] letterDistr(String message) {
    int length = message.length();
    int i;
    int c;
    //initialize an int array to hold the number of each letter
    int[] letters = new int[26];
    //for each character in the message
    for (i = 0; i < length; i++) {
    //convert the current char to lowercase then to an int
      message = message.toLowerCase();
      c = (int) message.charAt(i);
    //if the int represents a lowercase letter (check the ascii chart)
      if(c >= 97 && c <= 122) {
    //subtract 97 from the int
        c -=97;
    //add 1 to the int array at that index
        letters[c]++;
      }
    }
    //return the int array
    return letters;
  }//end letter distribution method

  public static void printDistr(int[] distr) {
    int i;
    char l;
    int a;
    int j;
    //for each element in the array
    for(i = 0; i < 26; i++) {
    //create a char from the current position (ie. 0=a,1=b,...)
      l = (char) (i+97);
      System.out.print(l + ": " + distr[i] + "|");
    //for the number in the array at the current position
      a = distr[i];
      for(j = 0; j < a; j++) {
    //print an * on the same line
        System.out.print("*");
      }
    //move to the next line
    System.out.println();
    }
    return;
  }//end printDistr

}//end class Caersar
