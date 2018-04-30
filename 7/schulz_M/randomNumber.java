/*********************
Mason Schulz
randomNumber
Last Edited: 2/15
**********************/
import java.util.Random;
import java.util.Scanner;

public class randomNumber{
   public static void main(String[] args){
   
   Scanner input = new Scanner(System.in);
   
   int starter;
   int ender;
   int seeder = 3;
   int uNum;
   int randNum;
   int tries = 5;
   int complete = 0;

   
   System.out.println("Start?");
   starter = input.nextInt();
   System.out.println("End?");
   ender = input.nextInt();
   
   randNum = genRandNum(starter, ender, seeder);
   
   System.out.println();
   System.out.print("Okay, what's your guess? "); 
   uNum = input.nextInt();
   String highLow = (hiLow(uNum, randNum));
   while (tries > 0){

      if(highLow != "That's my number!"){
         System.out.println(highLow);
         uNum = input.nextInt();
         tries -=1;
         System.out.println(tries + " tries left hunn");
      }//end if
      else{
           break;
      }//end else
    }
      if(highLow == "That's my number!"){
       System.out.println(highLow);
       System.out.println("You're done bud! Congrats. My number was " + randNum + ", but you already knew that, right?");
      }
      else{
         System.out.println("You're done bud! But you lost. My number was " + randNum + ".");
   }
  
        
   }//main\\

// genRandNum(start, end, seed)
   public static int genRandNum(int start, int end, int seed){
      Random r = new Random();
      int startN = start;
      int endN = end;
      int seedN = seed;
      int randNum;
      
      r.setSeed(seedN);      
      randNum = r.nextInt(end) + start;
      
      return randNum;

   
   }//genRandNum\\
   

// hiLow(correct number, user guess)
   public static String hiLow(int randNum, int userNum){
   //if correct
      if (userNum  == randNum){
         return "That's my number!";}
   //if guess is low
      else if (userNum < randNum){
         return "Higher...";}
   //if guess is high
      else{
         return "Lower...";}
   }//end hiLow


}//end randomNumber class\\