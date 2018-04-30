import java.util.Scanner;
import java.io.PrintWriter;
import Java.io.FileNotFoundException;
public class Trivia{

   public static void main(String[] args){
      //file names
      String trivia_file = "trivia.txt";
      String score_file = "highscores.txt";
      int score = 0;
      Scanner input = new Scanner(System.in);
      input = ReadWrite.open_file(trivia_file, input);

      /*DONE:
      first line of tirvia file is the title
      use the welcome method from ReadWrite to display the title*/
      ReadWrite.welcome("An Episode You Can't Refuse!");

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
      

      input = new Scanner(System.in);
      if(hs){
         System.out.println("You made it on the high score list!");
         //save initials
         String name = name3(input);
         /*TODO:
            Send initals and score to sortNSave
         */
      }
      else{
         System.out.println("You didn't make it on the high score list, better luck next time.");
      }
      System.out.pritnln(hscores(high));
   }//end main

      /*TODO:
         create a String name3 method that has a scanner for the paramater
         prompt the user for their initials (3 characters)
         while length of user input != 3
            ask again
         return their initials in all caps
      */


      /*TODO:
         craete a String hscore method
         iterate through the high score 2D array
            create a string representation that looks liek the following when printed
            ABC: 5 points
            DEF: 4 points
         return the string representation
      */


   public static String[][] bubble(String[][] high){
      /*TODO:
       write a bubble sort algorithm
       sort with decending values (highest first, lowest last)
       You'll need to parseInt in order to sort them correctly
      */
      return high;
   }//end bubble

	public static String[][] load_high_score(String	file_name, Scanner input){
		/*TODO
         Finish this method that loads the highscores from a txt file to a 2D array called high
         you'll want to use open_file() and next_line()
      */
 		return high;
	}//end high_score
	public static String[][] sortNsave(String[][] high, String name, int	score, String score_file){
		/*TODO:replace last	entry	since	we	already know we beat	it
		   score
         name*/

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
				}
			}
         //TODO: save the file
		}
		return high;
	}//end sortNSave
}//end Trivia class
