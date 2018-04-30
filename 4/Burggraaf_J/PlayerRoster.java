import java.util.Scanner;

public class PlayerRoster {
   public static void main(String[] args) {
      //1. Prompt the user to input a player's jersey number and the player's rating.
      //Store the jersey numbers in one int array and the ratings in another int array.
      //Output these arrays (i.e., output the roster).
      Scanner input = new Scanner(System.in);
      int[] jerseyNums = new int[5];
      int[] playerRatings = new int[5];
      int inputJerseyNum = 0;
      int inputPlayerRating = 0;
      char userSelection = 'k';
      int arrLength = jerseyNums.length;
      
      System.out.println("Enter player 1's jersey number:");
      jerseyNums[0] = input.nextInt();
      
      System.out.println("Enter player 1's rating:");
      playerRatings[0] = input.nextInt();
      System.out.println();
      
      System.out.println("Enter player 2's jersey number:");
      jerseyNums[1] = input.nextInt();
      
      System.out.println("Enter player 2's rating:");
      playerRatings[1] = input.nextInt();
      System.out.println();
      
      System.out.println("Enter player 3's jersey number:");
      jerseyNums[2] = input.nextInt();
      
      System.out.println("Enter player 3's rating:");
      playerRatings[2] = input.nextInt();
      System.out.println();
      
      System.out.println("Enter player 4's jersey number:");
      jerseyNums[3] = input.nextInt();
      
      System.out.println("Enter player 4's rating:");
      playerRatings[3] = input.nextInt();
      System.out.println();
      
      System.out.println("Enter player 5's jersey number:");
      jerseyNums[4] = input.nextInt();
      
      System.out.println("Enter player 5's rating:");
      playerRatings[4] = input.nextInt();
      System.out.println();
      
      System.out.println("ROSTER");
      System.out.println("Player 1 -- Jersey number: " + jerseyNums[0] + ", Rating: " + playerRatings[0]);
      System.out.println("Player 2 -- Jersey number: " + jerseyNums[1] + ", Rating: " + playerRatings[1]);
      System.out.println("Player 3 -- Jersey number: " + jerseyNums[2] + ", Rating: " + playerRatings[2]);
      System.out.println("Player 4 -- Jersey number: " + jerseyNums[3] + ", Rating: " + playerRatings[3]);
      System.out.println("Player 5 -- Jersey number: " + jerseyNums[4] + ", Rating: " + playerRatings[4]);
      System.out.println();
      //(2) Implement a menu of options for a user to modify the roster.
      //Each option is represented by a single character.
      //The program initially outputs the menu, and outputs the menu after a user chooses an option.
      //The program ends when the user chooses the option to Quit. For this step, the other options do nothing.
      
      
      
      while (userSelection != 'q') {
         System.out.println("MENU");
         System.out.println("u - Update player rating");
         System.out.println("a - Output players above a rating");
         System.out.println("r - Replace player");
         System.out.println("o - Output roster");
         System.out.println("q - Quit");
         System.out.println();
         System.out.print("Choose an option:");
         
         
         userSelection = input.next().charAt(0);
         
         //(4) Implement the "Update player rating" menu option. Prompt the user for a player's jersey number.
         //Prompt again for a new rating for the player, and then change that player's rating.
         
         //start u
         if (userSelection == 'u') {
            int updateJerseyNum;
            int updatePlayerRating;
            int errorCounter = 0;
            System.out.println();
            System.out.print("Select a player's jersey number: ");
            updateJerseyNum = input.nextInt();
            //start for
            for (int i = 0; i < jerseyNums.length; i++) {
               if (updateJerseyNum == jerseyNums[i]) {
                  System.out.print("Enter a new rating for that player: ");
                  
                  updatePlayerRating = input.nextInt();
                  
                  playerRatings[i] = updatePlayerRating;
                  break;
               }//end if
               
               if ((errorCounter == 4) && (updateJerseyNum != jerseyNums[i])) {
                  System.out.println("That is not a valid player's jersey number!");
                  break;
               }//end if 
               errorCounter += 1;
               
            }//end for
            System.out.println();
            
         }//end u
         //(5) Implement the "Output players above a rating" menu option. Prompt the user for a rating.
         //Print the jersey number and rating for all players with ratings above the entered value.
         
         //start a
         else if (userSelection == 'a') {
            int aboveNum;
            
            System.out.print("Enter a rating: ");
            aboveNum = input.nextInt();
            
            System.out.println();
            
            System.out.println("ABOVE " + aboveNum);
            
            for (int i = 0; i < playerRatings.length; i++) {
               if (playerRatings[i] > aboveNum) {
                  System.out.println("Player " + (i + 1) + " -- Jersey number: " + jerseyNums[i] + ", Rating: " + playerRatings[i]);
               }//end if
            }//end for
            System.out.println();
            
         }//end a
         //(6) Implement the "Replace player" menu option. 
         //Prompt the user for the jersey number of the player to replace. 
         //If the player is in the roster, then prompt again for a new jersey number and rating.
         //Update the replaced player's jersey number and rating.
         
         //start r
         else if (userSelection == 'r') {
            int jerseyNumReplace;
            int newJerseyNum;
            int newPlayerRating;
            int failCounter = 0;
            
            System.out.println();
            System.out.print("Enter a jersey number: ");
            jerseyNumReplace = input.nextInt();
            System.out.println();
            
            for (int i = 0; i < jerseyNums.length; i++) {
               if (jerseyNumReplace == jerseyNums[i]) {
                  System.out.print("Enter a new jersey number: ");
                  newJerseyNum = input.nextInt();
                  jerseyNums[i] = newJerseyNum;
                  System.out.println();
                  
                  System.out.print("Enter a rating for the new player: ");
                  newPlayerRating = input.nextInt();
                  playerRatings[i] = newPlayerRating;
                  System.out.println();
                  break;
               }//end if
               if ((failCounter == 4) && (jerseyNumReplace != jerseyNums[i])) {
                  System.out.println("That is not a valid player's jersey number!");
                  break;
               }//end if 
               failCounter += 1;
            }//end for
            
         }//end r
         //(3) Implement the "Output roster" menu option.
         else if (userSelection == 'o') {
            
            System.out.println();
            printRoster(arrLength, jerseyNums, playerRatings);
            
         }//end o 
         else if (userSelection == 'q') {
            
            System.out.println();
            
         }//end q
         
      }//end while loop   

   }//end main method
   
   
   public static void printRoster(int arrLength, int[] jerseyNums, int[] playerRatings) {
      
      System.out.println("ROSTER");
      for (int i = 0; i < arrLength; i++) {
         System.out.println("Player " + (i + 1) + " -- Jersey number: " + jerseyNums[i] + ", Rating: " + playerRatings[i]);
      }
      
      System.out.println();
       
   }//end printRoster method
}//end PlayerRoster