import java.util.Scanner;
import java.util.Arrays;
public class zombieDice{
	public static void main (String[] args){
    int playerNum;
    Scanner s = new Scanner (System.in);
    System.out.print("How many players do you have? ");
    playerNum = s.nextInt();
    String[] playerList = new String[playerNum];
    int[] scoreList = new int[playerNum];
    Boolean isGameOver = false;

    for (int l = 0; l < playerNum; l++){
      int x;
      System.out.print("Player number " (x+1) "'s name? ");
      playerList[x] = s.nextLine();
      x++;
    }//for
    int y = 0;
    int z = 0;
    while(isGameOver == false){
      for(int j = 0; j < playerNum; j++){
      System.out.println(playerList[z] + "'s turn");
      System.out.print("How many points did " + playerList[z] + " make this turn?" );
      scoreList[y] = s.nextInt;
      z++;
      y++;
      isGameOver();
      }//for
    }//while
    int max;
    
    System.out.println(playerlist[winPos] + " won the match with " + scoreList[winPos] + " points.");
  }
  public static Boolean isGameOver(){
    for(int i = 0; i < playerNum; i++){
    if(scoreList[i] <= 13) // the condition you're checking for is that they're all greater than, so if its less than or equal to, it gets flagged
        return true;
      }//for
      return false; // if it goes through the whole array without triggering a false, it has to be true.
  }

}
