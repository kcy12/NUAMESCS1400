import java.util.Scanner;
import java.io.PrintWriter;
import Java.io.*;
public class Trivia extends ReadWrite{
   
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
      ReadWrite.welcome(trivia_file);
      
      while (input.hasNextLine()) {
         score = ReadWrite.block(input, score);
      }
      
      System.out.println("That was the last question!");
      System.out.println("Your final score is " + score);
      
      boolean hs = false;
      
      /*TODO:
         load_high_score
         check to see if user score is >= lowest score
            change hs to true
         You'll need to convert the low score from string to int
      */ 
         high = load_high_score(score_file, input);
         for(int i = 0; i <5; i++){
            try {
               String Stringtemp = high[i][0];/
               int intTemp = Integer.valueOf(Stringtemp);
            }
            catch(NumberFormatException e) {
               System.out.println("This is not a parsable string(not an int)");
            }
         }          
         for(int i = 0; i<5; i++) {
            if(lowTest[i] <= score){//no need to iterate if we pre-sort. not sure if we do after we implement more methods
               hs = true;
            }
         }
      input = new Scanner(System.in);
      if(hs = true){
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
      public static String name3(Scanner input){
         String userInput = "";
         System.out.println("What are your initials?");
         userInput = Scanner.nextline();
         int userInt = userinput.length();
         while (userInt != 3){
            System.out.println("Make sure you entered three intials without spaces. please enter your intials again");
            userInput = input.nextLine();
            inputInt = userInput.lenth();
         } 
         userInput = userInput.toUpperCase();
         return userInput;
      }//end name3
      
      public static String hscore(String[][] high){
         for(int i = 0; i <4; i++){
	 	      String returnString = (high[I][1]+": " + high[I][0] + " points");
	      }
	      return returnString;
      }

   public static String[][] bubble(String[][] high){
      /*TODO:
       write a bubble sort algorithm
       sort with decending values (highest first, lowest last)
       You'll need to parseInt in order to sort them correctly
      */
      int tempInt = i ++;
		String swapString1;
		String swapstring2;
      int swapInt;
      int[] lowTest = new int[5];
      for(int i = 0; i < 5; i++){
         try {//this try can probably be condensed into 1-2 lines
               String Stringtemp = high[i][0]//reads all the scores into a string
               int intTemp = Integer.valueOf(Stringtemp); //makes string into int lowTest[i] = Integer.valueOf(Stringtemp); maybe do it this way??
               lowTest[i] = intTemp;//makes an array of the scores to test for the number
            }
         catch(NumberFormatException e){ //learned this exception from https://www.mkyong.com/java/java-convert-string-to-int/
            System.out.println("this is not a parsable string (not an integer)");//no fucking clue if i used try catch right
         }
      }//makes an array of ints for sorting purposes	   
      for(int i =0; i < 4; i++){
         for(int j = 0; j < 4; j++){
            if(tempInt == 5){
               break;
            }
         
      return high;
   }//end bubble
   
	public static String[][] load_high_score(String	file_name, Scanner input){
		   input = open_file(highscores, input);
         String[][] high = new String[5][2];
      for (int i = 0; i <5; i++){
         for (int j = 0; j<2; j++){
            String tempstring = next_line(input);
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