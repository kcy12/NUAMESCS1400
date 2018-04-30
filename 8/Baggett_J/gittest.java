/************************
 * Jacob Baggett
 * Guess My Number
 * Last Edited: 03/22/2018
 ************************/
import java.util.Scanner;
import java.util.Random;

public class Main{
    
    public static void main(String[] args){
        
        //init vars
        Scanner input = new Scanner(System.in);
        int low = 0;
        int high = 0;
        int seed = 0;
        int secretNum = 0;
        int guesses = 6;
        int userGuess = 0;
        boolean correct = false;
        //greet
        System.out.println("Welcome to Guess My Number!");
        System.out.println("I'll pick a number in a range and you have 6 tries to guess it.");
        
        //get boundaries and guesses
        System.out.println("Input lower boundary: ");
        low = input.nextInt();
        System.out.println("Input upper boundary: ");
        high = input.nextInt();
        
        //generate secret number
        
        secretNum = genRandNum(low, high, seed);
        
        //Guessing loop
        while(guesses > 0 && correct == false){
            if(guesses == 1){
                System.out.println("Last guess! What's my number?");
            }
            else{
                System.out.println("You have "+guesses+" remaining.");
            }
            System.out.println("Input guess: ");
            userGuess = input.nextInt();
            
            System.out.println(hiLow(secretNum,userGuess));
            
            if(secretNum == userGuess){
            correct = true;
            }
            guesses --;
            
        }//end while
        
        if(correct == true){
            System.out.print("");
        }
        
        else{
            System.out.println("Sorry, that's not right. My number was "+secretNum);
        }
        System.out.print("Thanks for playing!");
        
        
    }//end main
    
    public static int genRandNum(int low,int high,int seed){
    int secretNum;
    Random rand = new Random();
    rand.setSeed(seed);
    
    
    
    //Critical point, fix later
    secretNum = rand.nextInt(high - low +1) - low;
    
    
    
    
    return secretNum;
    }//end genRandNum
    
    public static String hiLow(int secretNum,int userGuess){
     
     if(userGuess > secretNum){
     return "Lower...";
     }
     else if(userGuess < secretNum){
     return "Higher...";
     }
     else if(userGuess == secretNum){
     return "That's my number!";
     }
     else{
     return "error";
     }
     }//end
    
}
