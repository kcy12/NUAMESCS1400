/******
For this assignment, we will be creating a Rock, Paper, Scissors program using Object- Oriented Programming. You will be working with Simonsen and the TAs on a “team” to build the program.

We have already written our part of the program, and the RPSGameGUI.java file is attached. Your task will be to write a RockPaperScissors class that contains the following methods:

getUserChoice: Has the user choose Rock, Paper, or Scissors. After validating the input, the method returns a String containing the user choice.

getCPUChoice: Randomly selects Rock, Paper, or Scissors for the computer, and returns a String containing the computer choice.

pickWinner: Is passed two Strings containing the user choice and the computer choice. Compares the two choices and selects a winner. Returns a String containing “User”, “Computer”, or “Tie” to indicate the winner.

Your class should interact with our class to make the game function correctly.
***/
import java.util.Scanner;
import java.util.Random;
public class Game
{

	public static void main (String[] args)
	{
		Scanner in = new Scanner (System.in);
		RockPaperScissors rps = new RockPaperScissors ();  //***Your class
				
		int numGames = 0;
		String userChoice = "";
		String cpuChoice = "";
		String winner = "";
		int userWins = 0;
		int cpuWins = 0;
		Random r = new Random(5);

		
		System.out.println("Welcome to Rock, Paper, Scissors!\n");
		
		//Get odd number of games
		System.out.println("How many rounds would you like to play?");
		numGames = in.nextInt();
		
		while (numGames % 2 == 0) //Even number
		{
			System.out.println("Sorry, number of games must be odd.  Please try again:");
			numGames = in.nextInt();
		}
		
		//Flush the buffer
		in.nextLine();
		
		//Play the game for the number of rounds the user entered
		for (int i = 1; i <= numGames; i++)
		{
			//Get the user and computer choices
			userChoice = rps.getUserChoice(in);  //***Your method
			cpuChoice = rps.getCPUChoice(r);   //***Your method
			
			System.out.println("Computer chooses " + cpuChoice);
			
			//Pick winner
			winner = rps.pickWinner(userChoice, cpuChoice);  //***Your method
			
			if (winner.equalsIgnoreCase("Tie"))
			{
				System.out.println("It's a tie!  Play again.");
				numGames++;
			}
			else
			{
				if (winner.equalsIgnoreCase("User"))
				{
					userWins++;
				}
				else if (winner.equalsIgnoreCase("Computer"))
				{
					cpuWins++;
				}
				else
				{
					System.out.println("Error in picking winner");
				}
				
				System.out.println(winner + " wins!");
			}
			
		} //end for
		
		//Print results
		System.out.println("\nUser wins: " + userWins);
		System.out.println("Computer wins: " + cpuWins);
		
		if (userWins > cpuWins)
		{
			System.out.println("\nThe user won!");
		}
		if (cpuWins > userWins)
		{
			System.out.println("The computer won!");
		}
		
		//Close game
		System.out.println("\nThank you for playing!");
		
	} //end main

} //end class