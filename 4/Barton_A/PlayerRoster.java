import java.util.Scanner;

public class PlayerRoster {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] jerseyNumber = new int[5];
      int[] playerRating = new int[5];
      char choice = z;
      int i;
      int k;
      int j;
      int l;
      int f;
      int newRating;
      int replacePlayer;
      int newJersey;
      System.out.println("Enter player 1's jersey number:");
      jerseyNumber[0] = scnr.nextInt();
      System.out.println("Enter player 1's rating:");
      playerRating[0] = scnr.nextInt();
      System.out.println("\nEnter player 2's jersey number:");
      jerseyNumber[1] = scnr.nextInt();
      System.out.println("Enter player 2's rating:");
      playerRating[1] = scnr.nextInt();
      System.out.println("\nEnter player 3's jersey number:");
      jerseyNumber[2] = scnr.nextInt();
      System.out.println("Enter player 3's rating:");
      playerRating[2] = scnr.nextInt();
      System.out.println("\nEnter player 4's jersey number:");
      jerseyNumber[3] = scnr.nextInt();
      System.out.println("Enter player 4's rating:");
      playerRating[3] = scnr.nextInt();
      System.out.println("\nEnter player 5's jersey number:");
      jerseyNumber[4] = scnr.nextInt();
      System.out.println("Enter player 5's rating:");
      playerRating[4] = scnr.nextInt();
      System.out.println("Roster");
      System.out.println("Player 1 -- Jersey number: " + jerseyNumber[0] + ", Rating: " + playerRatin[0]);
      System.out.println("Player 1 -- Jersey number: " + jerseyNumber[1] + ", Rating: " + playerRatin[1]);
      System.out.println("Player 1 -- Jersey number: " + jerseyNumber[2] + ", Rating: " + playerRatin[2]);
      System.out.println("Player 1 -- Jersey number: " + jerseyNumber[3] + ", Rating: " + playerRatin[3]);
      System.out.println("Player 1 -- Jersey number: " + jerseyNumber[4] + ", Rating: " + playerRatin[4]);
      //MENU
      //u - Update player rating
      //a - Output players above a rating
      //r - Replace player
      //o - Output roster
      //q - Quit
   
      //Choose an option:
      while(choice != 'q'){
         if(choice == 'u'){
            System.out.println("Enter a jersey number:");
            j = scnr.nextInt();
            for(i = 0; i < jerseyNumber.length; ++i){
               if(jerseyNumber[i] == j){
                  k = i;
                  }//end if loop
               }//end for loop
            playerRating[k] = scnr.nextInt();
            }//end update rating
         else if(choice == 'a'){
            System.out.println("Enter a rating:");
            newRating = scnr.nextInt();
            System.out.println("\nABOVE " + newRating);
            for(l = 0; l < playerRating.lenght; ++l){
               if(playerRating[l] > newRating){
                  System.out.println("Player " + (l + 1) + "-- Jersey number: " jerseyNumber[l] + ", Rating: " + playerRating[l]);
                  }//end for loop
               }//end for loop
            }//end output above a rating
         else if(choice == 'r'){
            System.out.println("Enter a jersey number:");
            replacePlayer = scnr.nextInt();
            for(f = 0; f < jerseyNumber.length; ++f){
               if(jerseyNumber[f] == replacePlayer){
                  System.out.println("Enter a new jersey number:");
                  newJersey = scnr.nextInt();
                  jerseyNumber[f] = newJersey;
                  System.out.println("Enter a rating for the new player:");
                  playerRating[f] = scnr.nextInt();
                  }//end if loop
               }//end for loop
            }//end replace player
         else if(choice == 'o'){
            
            }//end output roster
         }//end choice

   }
}