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
      
      /*TODO: done
      first line of tirvia file is the title
      use the welcome method from ReadWrite to display the title*/
      ReadWrite.welcome(input.nextLine());
      
      while (input.hasNextLine()) {
         score = ReadWrite.block(input, score);
      }
      
      System.out.println("That was the last question!");
      System.out.println("Your final score is " + score);
      
      boolean hs = false;
      
      /*TODO: done
         load high scores
         check to see if user score is >= lowest score
            change hs to true
         You'll need to convert the low score from string to int
      */ 
      String[] hslist = new String[10];
      String Ln;
      input = ReadWrite.open_file(score_file, input);
      for (int i = 0; input.hasNextLine(); i++) {
         String temp = input.nextLine();
         hslist[i] = temp;
      }
      int lscore = Integer.parseInt(hslist[8]);
      if (score >= lscore) {
         hs = true;
      }
      input = new Scanner(System.in);
      String[][] high = load_high_score(score_file, input);
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
      System.out.println(hscores(high));
   }//end main

      /*TODO: done
         create a String name3 method that has a scanner for the paramater
         prompt the user for their initials (3 characters)
         while length of user input != 3
            ask again
         return their initials in all caps
      */
   public static String name3(Scanner scn) {
      String initials = scn.nextLine();
      while (initials.length() != 3) {
         initials = scn.nextLine();
      }
      return initials.toUpperCase();
   }
         
      
      /*TODO: done
         craete a String hscore method
         iterate through the high score 2D array
            create a string representation that looks liek the following when printed
            ABC: 5 points
            DEF: 4 points
         return the string representation
      */
   public static String hscores(String[][] htlist) {
//       String[] hslist = new String[10];
//       String Ln;
//       Scanner input = new Scanner(System.in);
//       input = ReadWrite.open_file("highscores.txt", input);
//       for (int i = 0; input.hasNextLine(); i++) {
//          String temp = input.nextLine();
//          hslist[i] = temp;
//       }
      int so = Integer.parseInt(htlist[0][0]);
      String no = htlist[0][1];
      int st = Integer.parseInt(htlist[1][0]);
      String nt = htlist[1][1];
      int sth = Integer.parseInt(htlist[2][0]);
      String nth = htlist[2][1];
      int sf = Integer.parseInt(htlist[3][0]);
      String nf = htlist[3][1];
      int sfi = Integer.parseInt(htlist[4][0]);
      String nfi = htlist[4][1];
      return no + ": " + so + " points\n" + nt + ": " + st + " points\n" + nth + ": " + sth + " points\n" + nf + ": " + sf + " points\n" + nfi + ": " + sfi + " points\n";
   }


   public static String[][] bubble(String[][] high){
      /*TODO:
       write a bubble sort algorithm
       sort with decending values (highest first, lowest last)
       You'll need to parseInt in order to sort them correctly
      */
      String[][] nhigh = new String[5][2];
      nhigh[0][0] = high[4][0];
      nhigh[0][1] = high[4][1];
      nhigh[1][0] = high[3][0];
      nhigh[1][1] = high[3][1];
      nhigh[2][0] = high[2][0];
      nhigh[2][1] = high[2][1];
      nhigh[3][0] = high[1][0];
      nhigh[3][1] = high[1][1];
      nhigh[4][0] = high[0][0];
      nhigh[4][1] = high[0][1];
      return nhigh;
   }//end bubble
   
	public static String[][] load_high_score(String	file_name, Scanner input){
		/*TODO done
         Finish this method that loads the highscores from a txt file to a 2D array called high
         you'll want to use open_file() and next_line()
      */
      String[] hslist = new String[10];
      input = ReadWrite.open_file(file_name, input);
      for (int i = 0; input.hasNextLine(); i++) {
         String temp = input.nextLine();
         hslist[i] = temp;
      }
      String[][] high = new String[5][2];
      high[0][0] = hslist[0];
      high[0][1] = hslist[1];
      high[1][0] = hslist[2];
      high[1][1] = hslist[3];
      high[2][0] = hslist[4];
      high[2][1] = hslist[5];
      high[3][0] = hslist[6];
      high[3][1] = hslist[7];
      high[4][0] = hslist[8];
      high[4][1] = hslist[9];
 		return high;
	}//end high_score
	public static String[][] sortNsave(String[][] high, String name, int	score, String score_file){
		/*TODO: done
      replace last	entry	since	we	already know we beat	it
		   score
         name*/
      high[4][0] = "" + score;
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
					toFile.println(i + "\n" + j);   
				}
			}
         toFile.close();
		}
		return high;
	}//end sortNSave
}//end Trivia class