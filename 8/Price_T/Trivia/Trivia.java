import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
public class Trivia{
   
   public static void main(String[] args){
      //file names
      String trivia_file = "trivia.txt";
      String score_file = "highscores.txt";
      int score = 0;
      Scanner input = new Scanner(System.in);
      input = ReadWrite.open_file(trivia_file, input);
      
      /*TODO: 
      first line of tirvia file is the title
      use the welcome method from ReadWrite to display the title*/
      
      //DONE
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
      
      //DONE
      input = new Scanner(System.in);
      String[][] high = new String[5][2];
      high = load_high_score(score_file, input);
      
      int tempInt = Integer.parseInt(high[4][0]);
      
      if(score >= tempInt) {
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
         
         //DONE
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
      
      //DONE
   public static String name3(Scanner input){
      String name = "";
      System.out.println("What is your name?");
      name = input.next();
      input.nextLine();
      while(name.length() != 3){
         System.out.println("Invalid input.  What is your name?");
         name = input.next();
         input.nextLine();
      }
      name = name.substring(0,3);
      name = name.toUpperCase();
      
      return name;
   }//end name3
         
      
      /*TODO:
         craete a String hscore method
         iterate through the high score 2D array
            create a string representation that looks liek the following when printed
            ABC: 5 points
            DEF: 4 points
         return the string representation
      */
      
      //DONE
    public static String hscores(String[][] high) {
      String printedOut = "";
      int i;
      for (i = 0; i < 5; ++i) {
         printedOut += high[i][1];
         printedOut += ": ";
         printedOut += high[i][0];
         printedOut += " points\n";
      }
      return printedOut;
    }


   public static String[][] bubble(String[][] high){
      /*TODO:
       write a bubble sort algorithm
       sort with decending values (highest first, lowest last)
       You'll need to parseInt in order to sort them correctly
      */
      
      //DONE
      int[] scores = new int[5];
      int i;
      int tempScore;
      String tempNum;
      String tempPlace;
      boolean inOrder = false;
      for (i = 0; i < 5; ++i) {
         scores[i] = Integer.parseInt(high[i][0]);
      }
      while(!inOrder){
         for (i = 4; i > 0; --i) {
            if (scores[i] > scores[i - 1]) {
               tempScore = scores[i];
               tempNum = high[i][0];
               tempPlace = high[i][1];
               scores[i] = scores[i - 1];
               high[i][0] = high[i - 1][0];
               high[i][1] = high[i - 1][1];
               scores[i - 1] = tempScore;
               high[i - 1][0] = tempNum;
               high[i - 1][1] = tempPlace;
            }
         }
         
         if((scores[0]>=scores[1])&&(scores[1]>=scores[2])&&(scores[2]>=scores[3])&&(scores[3]>=scores[4])){
            inOrder = true;
         }
      }
      
      
      return high;
   }//end bubble
   
	public static String[][] load_high_score(String	file_name, Scanner input){
		/*TODO
         Finish this method that loads the highscores from a txt file to a 2D array called high
         you'll want to use open_file() and next_line()
      */
      
      //DONE
      String[][] high = new String[5][2];
      int i;
      int j;
      
      input = ReadWrite.open_file(file_name, input);
      for (i = 0; i < 5; ++i) {
         for (j = 0; j<2; ++j) {
            high[i][j] = ReadWrite.next_line(input);
         }
      }
      
 		return high;
	}//end high_score
	public static String[][] sortNsave(String[][] high, String name, int	score, String score_file){
		/*TODO:replace last	entry	since	we	already know we beat	it
		   score
         name*/
         
      //DONE
      high[4][0] = String.valueOf(score);
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
				}
			}
         //TODO: save the file
		}
		return high;
	}//end sortNSave
}//end Trivia class