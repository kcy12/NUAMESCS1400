import java.util.*;
import java.io.*;
public class Trivia {

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
      ReadWrite.welcome(input.nextLine());

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

      input = ReadWrite.open_file(score_file, input);
      String[][] high = load_high_score(score_file, input);
      high = bubble(high);
      if (score >= Integer.parseInt(high[4][0])) {
        hs = true;
      }
      if (hs) {
         System.out.println("You made it on the high score list!");
         //save initials
         String name = name3(input);
         /*TODO:
            Send initals and score to sortNSave
         */
         sortNsave(high, name, score, score_file);
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
      public static String name3(Scanner in) {
        String name = "";
        while (name.length() != 3) {
          System.out.println("Enter your initials:");
          name = in.nextLine();
        }
        return name.toUpperCase();
      }

      /*TODO:
         craete a String hscore method
         iterate through the high score 2D array
            create a string representation that looks liek the following when printed
            ABC: 5 points
            DEF: 4 points
         return the string representation
      */
      public static String hscores(String[][] high) {
        String representation = "";
        for (int i = 0; i < high.length; i++) {
          representation += high[i][1] + ": " + high[i][0] + " points\n";
        }
        return representation;
      }

   public static String[][] bubble(String[][] high){
      /*TODO:
       write a bubble sort algorithm
       sort with decending values (highest first, lowest last)
       You'll need to parseInt in order to sort them correctly
      */
      //Who needs a bubble sort when you can have a lambda?
      Arrays.sort(high, (String[] first, String[] second) ->
        Integer.parseInt(second[0]) - Integer.parseInt(first[0]));
      return high;
   }//end bubble

	public static String[][] load_high_score(String	file_name, Scanner input){
		/*TODO
         Finish this method that loads the highscores from a txt file to a 2D array called high
         you'll want to use open_file() and next_line()
      */
    input = ReadWrite.open_file(file_name, input);
    String[][] high = new String[5][2];
    int index = 0;
    while (input.hasNextLine()) {
      high[index][0] = ReadWrite.next_line(input);
      high[index][1] = ReadWrite.next_line(input);
      index++;
    }
 		return high;
	}//end high_score
	public static String[][] sortNsave(String[][] high, String name, int	score, String score_file){
		/*TODO:replace last	entry	since	we	already know we beat	it
		   score
         name*/
    high[4][0] = Integer.toString(score);
    high[4][1] = name;
		//sort the array
		high = bubble(high);
		//save new array back to file
		boolean open =	false;
		PrintWriter	toFile =	null;
		try {
			toFile = new PrintWriter(score_file);
			open = true;
		}
		catch	(FileNotFoundException e) {
			System.out.println("We've run into a problem :(");
			System.out.println("Can't open file" + score_file + " for saving.");
			System.out.println(e);
		}
		if (open) {
			for (int i = 0; i < high.length; i++) {
				for (int j = 0; j < 2; j++) {
					toFile.println(high[i][j]);
				}
			}
         //TODO: save the file
      toFile.close();
		}
		return high;
	}//end sortNSave
}//end Trivia class
