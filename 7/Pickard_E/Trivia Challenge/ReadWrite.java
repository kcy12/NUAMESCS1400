import java.io.*;
import java.util.Scanner;

public class ReadWrite{
	public static void welcome(String title) {
		System.out.println("\t\tWelcome to Trivia Challenge!");
		System.out.println("\t\t" + title);
	}//end welcome
	
	public static int block(Scanner	file, int score)	
	{
		Scanner in = new Scanner (System.in);
		
		String category =	next_line(file);
		String question =	next_line(file);
		
		String[]	answers = new String[4];
		for (int	i = 0; i	<=	3;	i++) 
		{
			answers[i] = next_line(file);
		}
		
		int correct	= Integer.parseInt(next_line(file));
		int points = Integer.parseInt(next_line(file));
		
		String explanation =	next_line(file);
		
		System.out.println(category);
		System.out.println(question);
		
		for (int	i = 1; i	<=	4;	i++) 
		{
			System.out.println("\t"	+ i +	" - "	+ answers[i	- 1]);//next_line has some significant changes. 
		}
		
		System.out.print("What's your answer?: ");
		int answer = in.nextInt();
		//flush
		in.nextLine();
		if	(answer == correct) {
			System.out.println("Right!");
			score	+=	points;
		}
		else 
      		{
			System.out.println("Wrong.");
		}
		System.out.println(explanation);
		System.out.println("Score: " + score);
      		return score;
	}//end block
	public static String next_line(Scanner input)
   	{
      	//how does it know what file object to use???//nvm i'm dumb knows from trivia pass
      	String file_text = input.nextLine();
      	if(file_text.contains("/"))
      	{
        	file_text = file_text.replace("/", "\n");//Swap these to "" '' char sequence doesn't work
      	}
      	return file_text;
   	}
	public static Scanner open_file(String	trivia_file, Scanner inFS) 
	{
		try
      {
        File file = new File(trivia_file);
        inFS = new Scanner(file);
      }
      catch(FileNotFoundException e)
      {
       System.out.println("test");
        System.out.println("We cannot find the file you are looking for.");
      }
      return inFS;//inFS scanner variable not defined as an error? WTF defined line 62?? only error left on this file
	}//end open_file
}// end class ReadWrite
