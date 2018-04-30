/**************************
*Kacie Gardepy
*Soccer Team Roster program
*Last Edited: 03/09/2018
**************************/
import java.util.Scanner;

public class PlayerRoster {
   public static void main(String[] args) {
      //new scanner
      Scanner input = new Scanner(System.in);
      //Variables
      int i;
      int jersey[] = new int[5];
      int rating[] = new int[5];
      String choose = "";
      int rate = 0.0;
      
      //asking for jerseys and ratings
      System.out.println("Enter player 1's  jersey number: ");
      jersey[0] = input.nextInt();
      System.out.println("Enter player 1's rating: ");
      rating[0] = input.nextInt();
      System.out.println("");
      System.out.println("Enter player 2's jersey number: ");
      jersey[1] = input.nextInt();
      System.out.println("Enter player 2's rating: ");
      rating[1] = input.nextInt();
      System.out.println("");
      System.out.println("Enter player 3's jersey number: ");
      jersey[2] = input.nextInt();
      System.out.println("Enter player 3's rating: ");
      rating[2] = input.nextInt();
      System.out.println("");
      System.out.println("Enter player 4's jersey number: ");
      jersey[3] = input.nextInt();
      System.out.println("Enter player 4's rating: ");
      rating[3] = input.nextInt();
      System.out.println("");
      System.out.println("Enter player 5's jersey number: ");
      jersey[4] = input.nextInt();
      System.out.println("Enter player 5's jersey number: ");
      System.out.println("");
      
      //Outputting the roster
      System.out.println("ROSTER");
      System.out.println("Player 1 -- Jersey number: "+jersey[0]+", Rating: "+rating[0]);
      System.out.println("Player 2 -- Jersey number: "+jersey[1]+", Rating: "+rating[1]);
      System.out.println("Player 3 -- Jersey number: "+jersey[2]+", Rating: "+rating[2]);
      System.out.println("Player 4 -- Jersey number: "+jersey[3]+", Rating: "+rating[3]);
      System.out.println("Player 5 -- Jersey number: "+jersey[4]+", Rating: "+rating[4]);
      
      //Menu
      System.out.println("MENU");
      System.out.println("u - Update player rating");
      System.out.println("a - Output players above a rating");
      System.out.println("r - Replace player");
      System.out.println("o - Ouput roster");
      System.out.println("q - Quit");
      System.out.println("");
      System.out.println("Choose an option: ");
      choose = input.nextLine();
      
      //if statements:
      if (choose = u){
         System.out.println("Enter a jersey number: ");
         //FIX STATEMENT
      }//end if statement
      else if (choose = a){
         System.out.println("Enter a rating: ");
         rate = input.nextInt();
         System.out.println("");
         System.out.println("ABOVVE "+rate);
         //FIX STATEMENT
      }//end else if statement
      else if (choose = r){
         System.out.println("Enter a jersey number: ");
         //FIX STATEMENT
      }//end else if statement
      else if (choose = o){
         System.out.println("ROSTER");
         System.out.println("Player 1 -- Jersey number: "+jersey[0]+", Rating: "+rating[0]);
         System.out.println("Player 2 -- Jersey number: "+jersey[1]+", Rating: "+rating[1]);
         System.out.println("Player 3 -- Jersey number: "+jersey[2]+", Rating: "+rating[2]);
         System.out.println("Player 4 -- Jersey number: "+jersey[3]+", Rating: "+rating[3]);
         System.out.println("Player 5 -- Jersey number: "+jersey[4]+", Rating: "+rating[4]);
     }//end else if statement
     else if (choose = q){
     //FIX STATEMENT
     }//end else if statement
     else{
      System.out.print("ERROR");
      }//end else

         

   }
}