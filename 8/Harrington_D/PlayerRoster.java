import java.util.Scanner;
import java.util.ArrayList;

public class PlayerRoster {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      ArrayList <Integer> playerJersey = new ArrayList <Integer>();
      ArrayList <Integer> playerRatings = new ArrayList <Integer>();
      System.out.println("Enter player 1's jersey number:");
      int p1Jersey = scan.nextInt();
      playerJersey.add(p1Jersey);
      System.out.println("Enter player 1's rating:");
      int p1rate = scan.nextInt();
      playerRatings.add(p1rate);
      System.out.println();
      System.out.println("Enter player 2's jersey number:");
      int p2Jersey = scan.nextInt();
      playerJersey.add(p2Jersey);
      System.out.println("Enter player 2's rating:");
      int p2rate = scan.nextInt();
      playerRatings.add(p2rate);
      System.out.println();
      System.out.println("Enter player 3's jersey number:");
      int p3Jersey = scan.nextInt();
      playerJersey.add(p3Jersey);
      System.out.println("Enter player 3's rating:");
      int p3rate = scan.nextInt();
      playerRatings.add(p3rate);
      System.out.println();
      System.out.println("Enter player 4's jersey number:");
      int p4Jersey = scan.nextInt();
      playerJersey.add(p4Jersey);
      System.out.println("Enter player 4's rating:");
      int p4rate = scan.nextInt();
      playerRatings.add(p4rate);
      System.out.println();
      System.out.println("Enter player 5's jersey number:");
      int p5Jersey = scan.nextInt();
      playerJersey.add(p5Jersey);
      System.out.println("Enter player 5's rating:");
      int p5rate = scan.nextInt();
      playerRatings.add(p5rate);
      System.out.println();
      printRoster(playerJersey, playerRatings);
      char userChoice = 'n';
      while(userChoice != 'q'){
         System.out.println("MENU");
         System.out.println("u - Update player rating");
         System.out.println("a - Output players above a rating");
         System.out.println("r - Replace player");
         System.out.println("o - Output roster");
         System.out.println("q - Quit");
         System.out.println();
         System.out.println("Choose an option:");
         userChoice = scan.next().charAt(0);
         if(userChoice == 'q'){
            break;
         }
         if(userChoice == 'u'){
            System.out.println("Enter a jersey number:");
            int userInputu = scan.nextInt();
            for(int i = 0; i <= 4; ++i){
               int pJ = playerJersey.get(i);
               if(userInputu == pJ){
                  System.out.println("Enter a new rating for player:");
                  int userInput2 = scan.nextInt();
                  playerRatings.set(i, userInput2);
               }
            }
         }
         if(userChoice == 'a'){
            System.out.println("Enter a rating:");
            int userInputa = scan.nextInt();
            System.out.println("ABOVE " + userInputa);
            for(int j = 0; j <= 4; ++j){
               if(userInputa < playerRatings.get(j)){
                  System.out.println("Player " + (j+1) + " -- Jersey number: " + playerJersey.get(j) + ", Rating: " + playerRatings.get(j));
               }
            }
            System.out.println();
         }
         if(userChoice == 'r'){
            System.out.println("Enter a jersey number:");
            int userInputr = scan.nextInt();
            for(int k = 0; k <= 4; ++k){
               int pJ = playerJersey.get(k);
               if(userInputr == pJ){
                  System.out.println("Enter a new jersey number:");
                  int userInput3 = scan.nextInt();
                  playerJersey.set(k, userInput3);
                  System.out.println("Enter a rating for the new player:");
                  int userInput4 = scan.nextInt();
                  playerRatings.set(k, userInput4);
               }
            }
         }
         if(userChoice == 'o'){
            printRoster(playerJersey, playerRatings);
         }
      }
   }
      
   public static void printRoster(ArrayList playerJersey, ArrayList playerRatings){
      System.out.println("ROSTER");
      System.out.println("Player 1 -- Jersey number: " + playerJersey.get(0) + ", Rating: " + playerRatings.get(0));
      System.out.println("Player 2 -- Jersey number: " + playerJersey.get(1) + ", Rating: " + playerRatings.get(1));
      System.out.println("Player 3 -- Jersey number: " + playerJersey.get(2) + ", Rating: " + playerRatings.get(2));
      System.out.println("Player 4 -- Jersey number: " + playerJersey.get(3) + ", Rating: " + playerRatings.get(3));
      System.out.println("Player 5 -- Jersey number: " + playerJersey.get(4) + ", Rating: " + playerRatings.get(4));
      System.out.println();
   }   
}