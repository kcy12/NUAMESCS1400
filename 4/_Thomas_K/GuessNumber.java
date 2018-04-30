import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
  public static int high = 100;
  public static int low = 1;
  public static Boolean win;
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Random rand = new Random();
    int i;
    int guess;
    int seed = rand.nextInt(100);
    char userIn;
    win = false;
    guess = guessRange(low, high, seed);
    System.out.println("Welcome to the Guess Your Number Game!");
    System.out.println("I have 6 tries to guess what number you're thinking of between 1 and 100.");
    System.out.println("After each guess, tell me if I'm HIGH or LOW.");
    System.out.println("If I guess your number, let me know by typing CORRECT.");
    for(i=1; i<=6; i++) {
      seed = rand.nextInt(100);
      System.out.println("For guess #"+i+" I'll go with "+guess);
      System.out.println("Am I HIGH or LOW?");
      userIn = in.next().charAt(0);
      response(userIn, guess);
      if(win == true) {
        System.out.println("Easy. Better luck next time.");
        break;
      }
      else {
        guess = guessRange(low, high, seed);
        System.out.println(high+" "+low+" "+guess);
         
      }
    }
  }
  public static int guessRange(int l, int h, int seed) {
    int randNum;
    Random rand = new Random();
    rand.setSeed(seed);
    randNum = rand.nextInt(h - l) + l;
    return randNum;
  }
  public static void response(char userIn, int guess) {
    if(userIn == 'h' || userIn == 'H') {
      high = guess;
    }
    else if(userIn == 'l' || userIn == 'L') {
      low = guess;
    }
    else if(userIn == 'c' || userIn == 'C') {
      win = true;
    }
    return;
  }
}
