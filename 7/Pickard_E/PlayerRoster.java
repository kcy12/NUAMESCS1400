/**********************
* Ethan Pickard
* player roster program
* Last Edited: 3/9/18
***********************/
import java.util.Scanner;

public class PlayerRoster {
   public static void main(String[] args) {
      //init vars etc
      Scanner input = new Scanner(System.in);
      int[] jerseyNums = new int[5];
      int[] playerRatings = new int[5];
      int inputJerseyNum = 0;
      int inputPlayerRating = 0;
      char selectionChar = 'k';
      int arrLength = jerseyNums.length;
      
      //input jerseynums and playerratings
      for (int i = 0; i < jerseyNums.length; i++) {
         System.out.print("Enter player " + (i + 1) + "'s jersey number: ");
         jerseyNums[i] = input.nextInt();
         
         System.out.println();
         
         System.out.print("Enter player " + (i + 1) + "'s rating: ");
         playerRatings[i] = input.nextInt();
         System.out.println();
         System.out.println();
      }  
      
      //print roster
      
      printRoster(arrLength, jerseyNums, playerRatings);
      
      //menu
      while (selectionChar != 'q') {
         System.out.println("MENU");
         System.out.println("u - Update player rating");
         System.out.println("a - Output players above a rating");
         System.out.println("r - Replace player");
         System.out.println("o - Output roster");
         System.out.println("q - Quit");
         System.out.println();
         System.out.print("Choose an option:");
         
         //get input
         selectionChar = input.next().charAt(0);
         
         //if for different options
         if (selectionChar == 'u') {
            
            int updateNumJersey;
            int updatePlayerRating;
            int failCounter = 0;
            
            System.out.println();
            System.out.print("Select a player's jersey number: ");
            updateNumJersey = input.nextInt();
            
            //for checking for jersey number
            for (int i = 0; i < jerseyNums.length; i++) {
               if (updateNumJersey == jerseyNums[i]) {
                  System.out.print("Enter a new rating for that player: ");
                  
                  updatePlayerRating = input.nextInt();
                  
                  playerRatings[i] = updatePlayerRating;
                  break;
               }
               
               if ((failCounter == 4) && (updateNumJersey != jerseyNums[i])) {
                  System.out.println("That is not a valid player's jersey number!");
                  break;
               } 
               failCounter += 1;
               
            }
            System.out.println();
            
         }//end u 
         else if (selectionChar == 'a') {
            int aboveNum;
            
            System.out.print("Enter a rating: ");
            aboveNum = input.nextInt();
            
            System.out.println();
            
            System.out.println("ABOVE " + aboveNum);
            
            for (int i = 0; i < playerRatings.length; i++) {
               if (playerRatings[i] > aboveNum) {
                  System.out.println("Player " + (i + 1) + " -- Jersey number: " + jerseyNums[i] + ", Rating: " + playerRatings[i]);
               }
            }
            System.out.println();
            
         }//end a
         else if (selectionChar == 'r') {
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
               }
               if ((failCounter == 4) && (jerseyNumReplace != jerseyNums[i])) {
                  System.out.println("That is not a valid player's jersey number!");
                  break;
               } 
               failCounter += 1;
            }
            
         }//end r
         else if (selectionChar == 'o') {
            
            System.out.println();
            printRoster(arrLength, jerseyNums, playerRatings);
            
         }//end o 
         else if (selectionChar == 'q') {
            
            System.out.println("Goodbye!");
            
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
   
}//end class