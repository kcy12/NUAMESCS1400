/***************************
* Kevin Thomas
*Guess My Number
*
* Last Edited: 2/15/18
***************************/

import java.util.Random;
import java.util.Scanner;

public class NumberGuess
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    Random rand = new Random();
    int low;
    int high;
    int seed = 10;
    int theNumber;
    int guess;
    String result;
    Boolean win = false;

    System.out.println("Welcome to the Guess My Number game!");
    System.out.println("In this game, you will have 6 tries to guess a number within\nthe range that YOU set.");
    System.out.println("Each guess I will tell you if you're HIGH or LOW.");
    System.out.println("If you guess correctly, you win!");
    System.out.println("Press ENTER when you're ready to begin.");
    in.nextLine();
    System.out.println("Awesome! Now go ahead and enter in your LOW and HIGH number,\nseparated by a space.");
    low = in.nextInt();
    high = in.nextInt();
    System.out.println(low+" "+high);
    theNumber = genRandNum(low, high, seed);
    System.out.println("Great! I have chosen a number, so let the guessing begin!");
    for (int i=0; i<=5; i++)
    {
      System.out.println("Guess a number.");
      guess = in.nextInt();
      result = hiLow(theNumber, guess);
      if (result.equals("Lower...") || result.equals("Higher..."))
      {
        System.out.println(result);
        win = false;
      }
      else if (result.equals("correct"))
      {
        win = true;
        break;
      }
      else
      {
        System.out.println("Your guess was invalid. Please try again.");
        i -= 1;
        win = false;
      }
    }
    if (win==true)
    {
      System.out.println("I knew you were smart, but not that smart! You got it!");
      System.out.println("Thanks for playing!");
    }
    else
    {
      System.out.println("I knew you couldn't get it.");
      System.out.println("The number was "+theNumber+".");
      System.out.println("Better luck next time, loser.");
    }
  }
  public static int genRandNum(int start, int end, int seed)
  {
    int randNum;
    Random rand = new Random();
    rand.setSeed(seed);
    randNum = rand.nextInt(end - start) + start;
    return randNum;
  }
  public static String hiLow(int correct, int guessed)
  {
    String low = "Lower...";
    String high = "Higher...";
    String correctR = "correct";
    String invalid = "invalid";
    if (guessed<correct)
    {
      return high;
    }
    else if (guessed>correct)
    {
      return low;
    }
    else if (guessed==correct)
    {
      return correctR;
    }
    else
    {
      return invalid;
    }
  }
}
