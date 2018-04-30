//start function imports
import java.util.Scanner;
//end function imports
// start PlayerRoster class
public class PlayerRoster {
   // start main method
   public static void main(String[] args) {
      //start variable initialization
      final int NUM_PLAYERS = 5;
      int[] pJerseys = new int[NUM_PLAYERS];
      int[] pRatings = new int[NUM_PLAYERS];
      int i;
      char choice;
      int currJersey;
      int currRating;
      Scanner in = new Scanner(System.in);
      Scanner in2 = new Scanner(System.in);
      //end variable initialization
      //start roster fill
      for(i = 0; i <= 4; i++) {
         System.out.println("Enter player " + (i+1) + "'s jersey number:");
         pJerseys[i] = in.nextInt();
         System.out.println("Enter player " + (i+1) + "'s rating:");
         pRatings[i] = in.nextInt();
         System.out.println();
      }
      //end roster fill
      System.out.println("ROSTER");
      //start roster print
      for(i = 0; i <= 4; i++) {
         System.out.println("Player " + (i+1) + " -- Jersey number: " + pJerseys[i] + ", Rating: " + pRatings[i]);
      }
      //end roster print
      //start menu
      System.out.println();
      System.out.println("MENU");
      System.out.println("u - Update player rating");
      System.out.println("a - Output players above a rating");
      System.out.println("r - Replace player");
      System.out.println("o - Output roster");
      System.out.println("q - Quit");
      System.out.println();
      System.out.println("Choose an option:");
      choice = in2.next().charAt(0);
      //end menu
      //start main loop check
      if(choice != 'q') {
        //start main loop
        while(choice != 'q') {
           //start loop menu
           System.out.println();
           System.out.println("MENU");
           System.out.println("u - Update player rating");
           System.out.println("a - Output players above a rating");
           System.out.println("r - Replace player");
           System.out.println("o - Output roster");
           System.out.println("q - Quit");
           System.out.println();
           System.out.println("Choose an option:");
           choice = in2.next().charAt(0);
           //end loop menu
           //start update player rating
           if(choice == 'u') {
             System.out.println("Enter a jersey number:");
             currJersey = in.nextInt();
             //start jersey array search
             for(i = 0; i <= 4; i++) {
               // start rating update
               if(pJerseys[i] == currJersey) {
                 System.out.println("Enter a new rating for player:");
                 pRatings[i] = in.nextInt();
                 break;
               }
               //end rating update
             }
             //end jersey array search
           }
           //end update player rating
           //start above rating
           else if(choice == 'a') {
             System.out.println("Enter a rating:");
             currRating = in.nextInt();
             System.out.println();
             System.out.println("ABOVE " + currRating);
             //start rating array search
             for(i = 0; i <= 4; i++) {
                //start rating check
                if(pRatings[i] >= currRating) {
                  System.out.println("Player " + (i+1) + " -- Jersey number: " + pJerseys[i] + ", Rating: " + pRatings[i]);
                }
                //end rating check
             }
             //end rating array search
           }
           //end above rating
           //start replace player
           else if(choice == 'r') {
             System.out.println("Enter a jersey number:");
             currJersey = in.nextInt();
             //start jersey array search
             for(i = 0; i <= 4; i++) {
               //start replacement
               if(pJerseys[i] == currJersey) {
                 System.out.println("Enter a new jersey number:");
                 pJerseys[i] = in.nextInt();
                 System.out.println("Enter a rating for the new player:");
                 pRatings[i] = in.nextInt();
                 break;
               }
               //end replacement
             }
             //end jersey array search
           }
           //end replace player
           //start roster print
           else if(choice == 'o') {
             System.out.println("ROSTER");
             //start print loop
             for(i = 0; i <= 4; i++) {
                System.out.println("Player " + (i+1) + " -- Jersey number: " + pJerseys[i] + ", Rating: " + pRatings[i]);
             }
             //end print loop
           }
           //end roster print
        }
        //end main loop
      }
      //end main loop check
   }
   //end main method
}
//end PlayerRoster class
