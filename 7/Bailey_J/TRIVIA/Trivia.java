import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
public class Trivia extends ReadWrite{
   
   public static void main(String[] args){
      //file names
      String trivia_file = "trivia.txt";
      String score_file = "highscoress.txt";
      int score = 0;
      String[][] highScore = new String[5][2];
      int[] integers  = new int[5];
      Scanner input = new Scanner(System.in);
      input = open_file(trivia_file, input);
      String title = next_line(input);
      
      /*TODO: 
      first line of tirvia file is the title
      use the welcome method from ReadWrite to display the title*/
      title = input.nextLine();
      welcome(title);
      
      while (input.hasNextLine()) {
         score = ReadWrite.block(input, score);
      }
         
      System.out.println("You're Score is " + score);
   
   
      System.out.println("That was the last question!");
      System.out.println("Your final score is " + score);
      
      boolean hs = false;
      
      Scanner in = new Scanner(System.in);
      //in = ReadWrite.open_file(score_file, in);
      
      /*TODO:
         load high scores
         check to see if user score is >= lowest score
            change hs to true
         You'll need to convert the low score from string to int
      */ 
      highScore = load_high_score(score_file, input);
      for(int i = 0; i < 5; ++i) {
         String temp = highScore [i][0];
         int intTemp = Integer.valueOf(temp);
         integers[i] = intTemp;
     }
      for(int i = 0; i < 5; ++i) {
         if (integers[i] <= score) {
            hs = true;
         }
      }
      
       
      
      //input = new Scanner(System.in);
      if(hs == true){
         System.out.println("You made it on the high score list!");
         //save initials
         String name = name3(in);
         sortNsave(highScore, name, score, score_file);
         
         /*TODO:
            Send initals and score to sortNSave
         */
      }
      else{
         System.out.println("You didn't make it on the high score list, better luck next time.");
      }
      System.out.println(hscores(highScore));
      
   }//end main

      /*TODO:
         create a String name3 method that has a scanner for the paramater
         prompt the user for their initials (3 characters)
         while length of user input != 3
            ask again
         return their initials in all caps
      */
   public static String name3(Scanner input){
      String initials;
      System.out.println("GIVE ME YOUR INITICIALS, FUCKER, 3 LETTERS");//////////////////////////FUCKER REMOVE FUCK
      initials = input.nextLine();
      int inputInt = initials.length();
      while (initials.length() != 3) {
         System.out.println("FUCKER GET IT RIGHT"); 
         initials = input.nextLine(); 
         inputInt = initials.length();
      }
      
      initials = initials.toUpperCase();
      return initials;
  }
      
      /*TODO:
         craete a String hscores method
         iterate through the high score 2D array
            create a string representation that looks liek the following when printed
            ABC: 5 points
            DEF: 4 points
         return the string representation
      */
   public static String hscores(String[][] high) {
      String returnString = "";
      for (int i = 0; i < 5; ++i) {
         returnString = (high[i][1] + ": " + high[i][0] + " points");
      }
      return returnString;
   }
   public static String[][] bubble(String[][] high){
      int[] integers  = new int[5];
      int[] integers2  = new int[5];
      
      String swapString1 = "";
      String swapString2 = "";
      int swapInt;
         
      /*TODO:
       write a bubble sort algorithm
       sort with decending values (highest first, lowest last)
       You'll need to parseInt in order to sort them correctly
      */
      for(int i = 0; i < 5; ++i) {
         String stringTemp = high[i][0];
         int intTemp = Integer.valueOf(stringTemp);
         integers[i] = intTemp;
      }
      for(int i = 0; i < 4; ++i) {
         for(int j = 0; j < 4; j++) {
            int tempInt = i +1;
            if (tempInt == 5) {
               break;
            }
            if(integers[i] < integers[tempInt]) {
               swapString1 = high[i][0]; //0 is pointed for number row 1 is pointer for intital row
   	      	   	System.out.println(hscores(high));
                     swapString1 = high[i][0]; //0 is pointed for number row 1 is pointer for intital row
                     swapString2 = high[i][1];
                     high[i][0] = high[tempInt][0];//this block swaps the positions(prob a better way to do this)
                     high[i][1] = high[tempInt][1];
                     high[tempInt][0] = swapString1;
                     high[tempInt][1] = swapString2;
                     //end string swaps
                     swapInt = integers[i];
                     integers[i] = integers[tempInt];
                     integers[tempInt] = swapInt;
                                 }
         }
      }
      return high;
   }//end bubble
   
	public static String[][] load_high_score(String	file_name, Scanner input){
      String[][] highScore = new String[5][2];
		Scanner in = open_file(file_name, input);
      for (int i = 0; i < 5; ++i) {
         for (int j = 0; j < 2; ++j) {
            String tempString = next_line(in);
            highScore[i][j] = tempString;
         }
      }
      
      /*TODO
         Finish this method that loads the highscoress from a txt file to a 2D array called high
         you'll want to use open_file() and next_line()
      */
 		return highScore;
	}//end high_score
	public static String[][] sortNsave(String[][] high, String name, int	score, String score_file){
		/*TODO:replace last	entry	since	we	already know we beat	it
		   score
         name*/
         
		//sort the array
      Scanner input = new Scanner(System.in);
      String scoreString = String.valueOf(score);
      high[4][0] = scoreString;
      high[4][1] = name;
		high = bubble(high);
		//save new array back to file
		boolean open =	false;
      input = open_file(score_file, input);
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
               toFile.write(high[i][j]);
               toFile.flush();
				}
			}
         //TODO: save the file
         toFile.close();
         input.close();
		}
		return high;
	}//end sortNSave
}//end Trivia class