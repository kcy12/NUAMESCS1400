import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
public class Trivia extends ReadWrite{
   
   public static void main(String[] args){
      //file names
      String trivia_file = "trivia.txt";
      String score_file = "highscores.txt";
      int score = 0;
      Scanner input = new Scanner(System.in);
      Scanner in = new Scanner(System.in);
      input = open_file(trivia_file, input);
      String [][] high = new String[5][2];
      int [] lowTest = new int[5];
      String userInput = "";
      String title = "";
      input = open_file(trivia_file, input);
      title = next_line(input);
      
      
      /*TODO: 
      first line of tirvia file is the title
      use the welcome method from ReadWrite to display the title*/
      welcome(title);
      
      while (input.hasNextLine()) {
         score = block(input, score);
      }
      
      System.out.println("That was the last question!");
      System.out.println("Your final score is " + score);
      
      boolean hs = false;
      
      high = load_high_score(score_file, input);
      for(int i = 0; i < 5; ++i){
         try{
            String Stringtemp = high[i][0];
            int intTemp = Integer.valueOf(Stringtemp);
            lowTest[i] = intTemp;
         }
         catch(NumberFormatException e){
            System.out.println("this is not a parsable string (not an integer)");
         }
      }
      for(int i = 0; i < 5; ++i){
         if(score >= lowTest[i]){
            hs = true;
         }
      }
      /*TODO:
         load high scores
         check to see if user score is >= lowest score
            change hs to true
         You'll need to convert the low score from string to int
      */ 
      
      
      input = new Scanner(System.in);
      if(hs = true){
         System.out.println("You made it on the high score list!");
         //save initials
         String name = name3(input);
         sortNsave(high, name, score, score_file);
         /*TODO:
            Send initals and score to sortNSave
         */
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
      public static String name3(Scanner input){
         String userInpt = "";
         System.out.println("What are your initials? Please use the FirstMiddleLast format: ");
         userInpt = input.nextLine();
         while(userInpt.length() != 3){
            System.out.println("Please input 3 letters for your initials: ");
            userInpt = input.nextLine();
         }
         userInpt = userInpt.toUpperCase();
         return userInpt;
      }
         
      public static String hscores(String[][] high){
         String returnString = "";
         for(int i = 0; i <5; i++)
         {
	 	      returnString = (returnString + high[i][1]+": " + high[i][0] + " points\n");
		   }
	   
	      return returnString;
      }
      /*TODO:
         craete a String hscore method
         iterate through the high score 2D array
            create a string representation that looks liek the following when printed
            ABC: 5 points
            DEF: 4 points
         return the string representation
      */


public static String[][] bubble(String[][] high)
   {
	      String swapString1 = "";
	      String swapString2 = "";
         int swapInt;
         int[] lowTest = new int[5];
         for(int i = 0; i <5; i++){  
            try{
               String Stringtemp = high[i][0];
               int intTemp = Integer.valueOf(Stringtemp);
               lowTest[i] = intTemp;
            }
            catch(NumberFormatException e){
               System.out.println("this is not a parsable string (not an integer)");
            }
         }
      for(int i = 0; i<4; i++){	   
	      for(int j = 0; j <4; j++){
            int tempint = i ++;
	      	if(tempint == 5){
	      		break;
	      	}
	      	if(lowTest[i]<lowTest[tempint]){
               swapString1 = high[i][0];
	      	   swapString2 = high[i][1];
	      	   high[i][0] = high[tempint][0];
	      	   high[i][1] = high[tempint][1];
	           	high[tempint][0] = swapString1;
	      	   high[tempint][1] = swapString2;
               swapInt = lowTest[i];
               lowTest[i] = lowTest[tempint];
               lowTest[tempint] = swapInt;  
	           }
	      }
      }
      return high;
   }//end bubble
   
	public static String[][] load_high_score(String	file_name, Scanner input){
      Scanner in;
      in = open_file(file_name, input);
      String[][] high = new String[5][2];
      for(int i = 0; i <5; i++)
      {
         for(int j = 0; j<2; j++)
         {
            String tempString = next_line(in);//Implemented at home 
            high[i][j] = tempString;//this array interation SHOULD work
         }
      }
 		return high;
		/*TODO
         Finish this method that loads the highscores from a txt file to a 2D array called high
         you'll want to use open_file() and next_line()
      */
	}//end high_score
	public static String[][] sortNsave(String[][] high, String name, int	score, String score_file){
      Scanner input = new Scanner(System.in);
      String scoreString = String.valueOf(score);
      high[4][0] = scoreString;
      high[4][1] = name;
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
					toFile.write(high[i][j] + "\n");
            	toFile.flush();
               //TODO: write a line of text using the created PrintWriter
				}
			}
         toFile.close();
         
         //TODO: save the file
		}
		return high;
	}//end sortNSave
}//end Trivia class