import java.util.Scanner;

public class PlayerRoster {
   public static void main(String[] args) {
      //init vars & make scanner
      Scanner input = new Scanner(System.in);
      int [] jerseyNum = new int[5];
      int [] playerRate = new int [5];
      int i = 0;
      
      //Get input
      for(i=0; i<5; i++){
         System.out.println("Input player "+(i+1)+"'s jersey number:");
         jerseyNum[i] = input.nextInt();
         System.out.println("Input player "+(i+1)+"'s rating:");
         playerRate[i] = input.nextInt();
         }
      System.out.println();
      
      //Print roster
      System.out.println("ROSTER");
      for(i=0; i<5; i++){
         System.out.println("Player "+(i+1)+" -- Jersey number: "+jerseyNum[i]+", Rating: "+playerRate[i]);
         }
         
      
      
      System.out.println("Further study is required to finish this program.");
      

   }
}