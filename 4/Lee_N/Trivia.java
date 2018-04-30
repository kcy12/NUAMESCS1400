/*********************
*Nick Lee
*
*Trivia 17.12
*Last Edited:
*********************/

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
public class Trivia{
   
   public static void main(String[] args){
      //file names
      String trivia_file = "trivia.txt";
      String score_file = "highscores.txt";
      int score = 0;
      int i;
      Scanner input = new Scanner(System.in);
      Scanner file = new Scanner(System.in);
      input = ReadWrite.open_file(trivia_file, input);
      String[][] high = new String[5][2];
      
      /*TODO: 
      first line of tirvia file is the title
      use the welcome method from ReadWrite to display the title*/
      ReadWrite.welcome(ReadWrite.next_line(input));
      
      while (input.hasNextLine()) {
         score = ReadWrite.block(input, score);
      }
      
      System.out.println("That was the last question!");
      System.out.println("Your final score is " + score);
      
      boolean hs = false;
      
      /*TODO:
         load high scores
         check to see if user score is >= lowest score
            change hs to true
         You'll need to convert the low score from string to int
      */
      file = ReadWrite.open_file(score_file, input);
      high = load_high_score(score_file, input);
      //parse last value to int
      i = Integer.parseInt(ReadWrite.next_line(file));
      if(score >= i){
         hs = true;
      }
      
      input = new Scanner(System.in);
      if(hs){
         System.out.println("You made it on the high score list!");
         //save initials
         String name = name3(input);
         /*TODO:
            Send initals and score to sortNSave
         */
         high = sortNsave(high, name, score, score_file);
      }
      else{
         System.out.println("You didn't make it on the high score list, better luck next time.");
      }
      System.out.println(hscores(high));
   }//end main

      /*TODO:
         create a String name3 method that has a scanner for the paramater
         prompt the user for their initials (3 characters)
         while length of user input != 3
            ask again
         return their initials in all caps
      */
   public static String name3 (Scanner input){
      //Scanner nameIn = new Scanner(System.in);
      String name = "";
      
      System.out.println("What three initials do you want to be know by?");
      name = input.next();
      while(name.length() != 3 && input.hasNext()){
         System.out.println("Use 3 characters");
         System.out.println("What three initials do you want to be know by??");
         name = input.next();
      }
      name = name.toUpperCase();
      return name;
   }//end name3
      
      /*TODO:
         create a String hscore method
         iterate through the high score 2D array
            create a string representation that looks liek the following when printed
            ABC: 5 points
            DEF: 4 points
         return the string representation
      */
   public static String hscores (String[][] high){
      String scoreboard = "";
      for(int i = 0; i <= 4; i++){
         scoreboard = scoreboard + high[i][1] + ": "  + high[i][0] + " points\n";
      }
      return scoreboard;
   }//end hscore


   public static String[][] bubble(String[][] high){
      /*TODO:
       write a bubble sort algorithm
       sort with decending values (highest first, lowest last)
       You'll need to parseInt in order to sort them correctly
      */
      String hold1 = "";
      String hold2 = "";
      int temp;
      int temp1;
      int temp2 = 0;
      for(int i = 0; i <= 4; i++){
         for(int e = 0; e < 4 - i; e++){
            temp1 = Integer.valueOf(high[e][0]);//take first number
            temp2 = Integer.valueOf(high[e+1][0]);//take second number
            //System.out.println(e + " " + i + " " + temp1 + " " + temp2);
            if(temp1 < temp2){//if the first one is lower than the second one
               hold1 = high[e][0];
               hold2 = high[e][1];
               high[e][0] = high[e+1][0];
               high[e][1] = high[e+1][1];
               high[e+1][0] = hold1;
               high[e+1][1] = hold2;
               //System.out.println(hscores(high));
            }//end if
         }//second for
      }//first for
      return high;
   }//end bubble
   
	public static String[][] load_high_score(String	file_name, Scanner input){
		/*TODO
         Finish this method that loads the highscores from a txt file to a 2D array called high
         you'll want to use open_file() and next_line()
      */
      String[][] high = new String[5][2];
      input = ReadWrite.open_file(file_name, input);
      String hold = "";
      int i = 0;
      
      //write clomun for high[][]
      for (i = 0; i <= 4; i ++){
         //write row
         for(int e = 0; e <= 1; e++){
            hold = ReadWrite.next_line(input);
            high[i][e] = hold;
         }
      }
 		return high;
	}//end high_score

   
	public static String[][] sortNsave(String[][] high, String name, int	score, String score_file){
		/*TODO:replace last	entry	since	we	already know we beat	it
		   score
         name*/
      String hold = "";
      hold = String.valueOf(score);
      high[4][0] = hold;
      high[4][1] = name;
         
		//sort the array
		high = bubble(high);
		//save new array back to file
		boolean open =	false;
		PrintWriter	toFile =	null;
		try{
			toFile =	new PrintWriter(score_file);
			open = true;
		}
		catch	(FileNotFoundException e) {
			System.out.println("We've run into a problem :(");
			System.out.println("Can't open file"+score_file+" for saving.");
			System.out.println(e);
		}
		if(open){
			for(int i=0;i<high.length;i++){
				for(int j=0;j<2;j++){
					//TODO: write a line of text using the created PrintWriter
               toFile.println(high[i][j]);
				}
			}
         //TODO: save the file
         toFile.close();
		}
		return high;
	}//end sortNSave
}//end Trivia class