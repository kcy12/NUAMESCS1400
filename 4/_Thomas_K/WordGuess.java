/***************************
* Kevin Thomas
*Guess My Word
*
* Last Edited: 2/14/18
***************************/
import java.util.Scanner;

public class WordGuess
{
  public static void main(String[] args)
  {
    int i;
    char guess;
    String wordGuess;
    boolean check;
    boolean check2;
    String theWord = "extraneous";
    Scanner in  = new Scanner(System.in);
    Scanner in2 = new Scanner(System.in);
    System.out.println("Welcome to Guess My Word!");
    System.out.println("I will give you 7 chances to guess what letters are in my word.");
    System.out.println("After, you will have a chance to guess my word.");
    System.out.println("If you guess my word correctly, you win!");
    System.out.println("Press ENTER to begin.");
    in.nextLine();
    for(i=1; i<=7; i++)
    {
      System.out.println("Guess a letter.");
      guess = in.next().charAt(0);
      check = charCheck(guess, theWord);
      if (check==false)
      {
        System.out.println(guess+" is not in the word.");
      }
      else
      {
        System.out.println(guess+" is in the word");
      }
    }
    System.out.println("It's time to take a shot at the word!");
    System.out.println("What do you think the word is?");
    wordGuess = in2.nextLine();
    check2 = wordCheck(wordGuess, theWord);
    if (check2==false)
    {
      System.out.println("I'm sorry, "+wordGuess+" is not the word.\nBetter luck next time!");
    }
    else
    {
      System.out.println("You got it! "+wordGuess+" is the word!\nNice job!");
    }
  }
  public static boolean charCheck(char guess, String word)
  {
    Scanner in  = new Scanner(System.in);
    int i;
    boolean check = false;
    for(i=0; i<10; i++)
    {
      if(word.charAt(i)==guess)
      {
        check = true;
        break;
      }
      else
      {
        check = false;
      }
    }
    return check;
  }
  public static boolean wordCheck(String wordGuess, String word)
  {
    if(wordGuess.compareTo(word)==0)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
}
