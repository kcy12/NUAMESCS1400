/*********************
*Nick Lee
*Triva 17.12
*
*Last Edited:
*********************/

import java.io.*;
import java.util.Scanner;

public class ReadWrite{
	public static void welcome(String title) {
		System.out.println("\t\tWelcome to Trivia Challenge!");
		System.out.println("\t\t" + title);
	}//end welcome
	
	public static int block(Scanner	file, int score)	{
		Scanner in = new Scanner (System.in);
	
		String category =	next_line(file);
		String question =	next_line(file);
		
		String[]	answers = new String[4];
		for (int	i = 0; i	<=	3;	i++) {
			answers[i] = next_line(file);
		}
		
		int correct	= Integer.parseInt(next_line(file));
		int points = Integer.parseInt(next_line(file));
		
		String explanation =	next_line(file);
		
		System.out.println(category);
		System.out.println(question);
		
		for (int	i = 1; i	<=	4;	i++) {
			System.out.println("\t"	+ i +	" - "	+ answers[i	- 1]);
		}
		
		System.out.print("What's your answer?: ");
		int answer = in.nextInt();
		//flush
		in.nextLine();
		if	(answer == correct) {
			System.out.println("Right!");
			score	+=	points;
		}
		else {
			System.out.println("Wrong.");
		}
		System.out.println(explanation);
		System.out.println("Score: " + score);
      return score;
	}//end block
	
	//TODO:
	//create a String method called next_Line that takes a Scanner file as it's paramater
   public static String next_line (Scanner file){
      //grab the next line from the scanner
      String newLine = file.nextLine();
	   //replace all "/" with "\n"
      newLine.replaceAll("/", "\n");
	   //return the line of text
      return newLine;
   }//end next_Line
	
	public static Scanner open_file(String	file_name, Scanner input) {
		/*TODO: set up a try catch to open a file
		try
		   create file object
		   create scanner for file
	   catch for not finding the file exception
	      System.out.println("We've run into a problem :(");
		   System.out.println("Can't open file " + file_name + " for reading.");
      return file scanner*/
      try{
         File file = new File(file_name);
         input = new Scanner(file);
      } catch (Exception excpt) {
         System.out.println("We've run into a problem :(");
         System.out.println("Can't open file " + file_name + " for reading.");
      }
      return input;
	}//end open_file
}// end class ReadWrite