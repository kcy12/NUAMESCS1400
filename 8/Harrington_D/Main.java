import java.util.Scanner;
import java.util.Random;
// main
public class Main{
   public static void main(String [] args){
      Scanner police_scanner = new Scanner(System.in);
      //initialize variables
      int start;
      int end; 
      int seed = 0;
      int tries = 6;
      int Uguess;
      int correct_num;
      String response;          
      //low number first
      System.out.print("What is the minimum value? ");
      start = police_scanner.nextInt(); 
      //high number second
      System.out.print("What is the maximum value? ");
      end = police_scanner.nextInt();
      correct_num = genRandNum(seed,end,start);
      //first guess
      System.out.print("what is your first guess? ");
      Uguess = police_scanner.nextInt();
      response = hiLow(Uguess, correct_num);
      System.out.println(response);
      tries -= 1;
      //while loop
      while(tries > 0){
         tries -= 1;
         System.out.println(" you have " + tries + " tries remaining ");
         Uguess = police_scanner.nextInt();
         System.out.println(response);
         if(response.equals("That's my number!"))
         break;   
      }
      if(Uguess == correct_num){
         System.out.println("you win, and it only took you " + tries + " tries");
         }
      else{
         System.out.println("you lose, the number was " + correct_num);
         }
      }       
   // genRandNum(start, end, seed)
   public static int genRandNum(int start, int end, int seed){
   Random rand = new Random();
      rand.setSeed(seed);
      //init secondary vars
      int correct_num;
      int range = end - start + 1; 
      correct_num = rand.nextInt(range);
      return correct_num;
      }
   // hiLow output(User guess, correct number
   public static String hiLow(int Uguess, int correct_num){
      // if guess is equal to
        if(Uguess == correct_num){
            return "That's my number!";
            }
      //if guess is low
        else if(Uguess < correct_num){ 
            return "higher...";
            }
      //if guess is high
        else{
            return "lower...";
            }
        }
}