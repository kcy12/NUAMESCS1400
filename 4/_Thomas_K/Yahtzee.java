import java.util.Random;
import java.util.Scanner;

public class Yahtzee {
  public static void main(String[] args) {
    //initialize variables
    Scanner in = new Scanner(System.in);
    Random rand = new Random();
    int hold = 0;//number of dice being held
    int rroll = 2;//number of rerolls allowed
    int i;
    int current;
    int[] dice = new int[5];
    //first dice re-roll
    for(i = 0; i<5; i++) {
      dice[i] = rand.nextInt(6) + 1;
    }
    //begin game
    System.out.println("The dice fall:");
    System.out.println(print_dice(dice));
    System.out.print("How many dice would you like to hold? ");
    hold = in.nextInt();
    while(hold > 5 || hold < 0) {
      System.out.print("How many dice would you like to hold? ");
      hold = in.nextInt();
    }
    //keep asking until giving an input that is within range

    while(hold<5&&rroll>0){
      System.out.println("You chose to reroll "+(5-hold)+" dice.");
      for(i=0;i<(5-hold);i++){
        System.out.print("Which die would you like to reroll? ");
        current = in.nextInt();
        System.out.println();//newline

        //validate dice reroll number
        while(current > 5 || current < 0) {
          System.out.print("Which die would you like to reroll? ");
          current = in.nextInt();
          System.out.println();//newline
        }
        dice[i] = rand.nextInt(6) + 1;
        //reroll selected die

      }//end re-roll die selection

      if(rroll>0){//only ask if there are rerolls left
        System.out.println("The dice fall:");
        //print_dice(dice)
        System.out.print("How many dice would you like to hold? ");
        hold = in.nextInt();
        System.out.println();//newline
      }
    }//end re-roll loop

    //final dice display
    System.out.println("The final dice are:");
    System.out.println(print_dice(dice));
    //Display score
    System.out.println("Score:");
    System.out.println(print_score(dice));
    //print(print_score(dice))
    in.close();

  }//end main method
  //start print_dice method
  public static String print_dice(int[] dice) {
    int i;
    String toPrint = "";
    for(i = 0; i < 5; i++) {
      toPrint.concat(dice[i]+" ");
    }
    return toPrint;
  }
  //end print_dice method

  //int[] kinds(int[] dice) method
  public static int[] kinds(int[] dice) {
    int i;
    int j;
    int[] numDice = new int[6];
    for(i = 0; i < 6; i++) {
      for(j = 0; j < 5; j++) {
        if(dice[j] == j+1) {
          numDice[i] += 1;
        }
      }
    }
    return numDice;
  }
  /*this method counts the number of unique values and stores them in an int array
  ie 1 3 3 4 6 yields [1,0,2,1,0,1]
  */

  //String print_score(int[]dice) method
  public static String print_score(int[] dice) {
    int i;
    int j;
    int check = 0;
    Boolean straight = false;
    int[] numDice = kinds(dice);
    for(i = 0; i < 6; i++) {
      if(numDice[i] == 5) {
        return "Yahtzee";
      }
      else if(numDice[i] == 4) {
        return "4 of a Kind";
      }
      else if(numDice[i] == 3) {
        for(j = 0; j < 6; j++) {
          if(numDice[j] == 2) {
            return "Full House";
          }
          else {
            return "3 of a Kind";
          }
        }
      }
    }
    for(i = 0; i < 6; i++) {
      if(numDice[i] > 2) {
        break;
      }
    }
    for(i = 0; i < 6; i++) {
      if(numDice[i] == 2) {
        return "Small Straight";
      }
    }
    for(i = 0; i < 6; i++) {
        if(numDice[i] == 1) {
          check += 1;
        }
    }
    if(check == 1) {
      return "Large Straight";
    }
    else {
      return "You did not score anything noteworthy.";
    }
  }
  /*this methiod returns a string representation of the different winning values. The test for this method is worth 7 points.
  possible return values
  rep = "Yahtzee"; all dice the same value
  rep = "Large Straight"; all dice in sequential order
  rep = "Small Straight"; 4 dice in sequential order
  rep = "4 of a Kind"; 4 dice with the same value
  rep = "Full House"; 3 dice with the same value and another 2 dice with the same value
  rep = "3 of a Kind"; 3 dice with the same value
  rep = "You did not score anything noteworthy."; anything else
  */

}//end class Main
