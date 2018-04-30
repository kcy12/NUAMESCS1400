import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;//package is inherited by default. not sure why simonsen imported the package. 
public class Trivia extends ReadWrite{
   
   public static void main(String[] args){
      //file names
      String trivia_file = "trivia.txt";
      String score_file = "highscores.txt";
      int score = 0;
      String[][] high = new String[5][2];
      int[] lowTest = new int[5];
      Scanner input = new Scanner(System.in);
      Scanner in = new Scanner(System.in);
      String userInput = "";
      String title = "";
      input = open_file(trivia_file, input);
      title = next_line(input);
      welcome(title);
   
      while (input.hasNextLine())
      {
         score = block(input, score);
      }
      System.out.println("That was the last question!");
      System.out.println("Your final score is " + score);
      
      boolean hs = false;
      
      //TODO:
      high = load_high_score(score_file, input);//load high scores
      for(int i = 0; i <5; i++)
      {
         try//this try can probably be condensed into 1-2 lines
         {
            String Stringtemp = high[i][0];//reads all the scores into a string
            int intTemp = Integer.valueOf(Stringtemp); //makes string into int lowTest[i] = Integer.valueOf(Stringtemp); maybe do it this way??
            lowTest[i] = intTemp;//makes an array of the scores to test for the number
         }
         catch(NumberFormatException e)//learned this exception from https://www.mkyong.com/java/java-convert-string-to-int/
         {
            System.out.println("this is not a parsable string (not an integer)");
         }
      }
                 
      for(int i = 0; i<5; i++)    //check to see if user score is >= lowest score
      {
         if(lowTest[i] <= score)//no need to iterate if we pre-sort. not sure if we do after we implement more methods
         {
            hs = true;
         }
      }
   
      if(hs = true)
      {//added true
         System.out.println("You made it on the high score list!");
         //save initials
         String name = name3(in);
         sortNsave(high, name, score, score_file);
      }
      else
      {
         System.out.println("You didn't make it on the high score list, better luck next time.");
      }
      System.out.println(hscores(high));
   }//end main
   public static String name3(Scanner input) 
   {
      String userInput = "";
      System.out.println("What is your Intials? Please use the FirstMiddleLast format");
      userInput = input.nextLine();
      int inputInt = userInput.length();
      while(inputInt != 3)
      {
         System.out.println("Make sure you entered three intials without spaces. please enter your intials again");//Implemented name3 at home
         userInput = input.nextLine();
         inputInt = userInput.length(); 
      }
      userInput = userInput.toUpperCase();
      return userInput;
         
   }
   public static String hscores(String[][] high)
   {
      String returnString = "";
      for(int i = 0; i <5; i++)
      {
         returnString = (returnString + high[i][1]+": " + high[i][0] + " points\n");
      }
      
      return returnString;
   }

   public static String[][] bubble(String[][] high)
   {
      String swapString1 = "";
      String swapString2 = "";
      int swapInt;
      int[] lowTest = new int[5];
      for(int i = 0; i <5; i++)//this loop is probably unnecessary but duplicated to ensure that the correct integer array is created.
      {  
         try//this try can probably be condensed into 1-2 lines
         {
            String Stringtemp = high[i][0];//reads all the scores into a string
            int intTemp = Integer.valueOf(Stringtemp); //makes string into int lowTest[i] = Integer.valueOf(Stringtemp); maybe do it this way??
            lowTest[i] = intTemp;//makes an array of the scores to test for the number
         }
         catch(NumberFormatException e)//learned this exception from https://www.mkyong.com/java/java-convert-string-to-int/
         {
            System.out.println("this is not a parsable string (not an integer)");//no fucking clue if i used try catch right
         }
      }//makes an array of ints for sorting purposes
   for(int j = 0; j<4; j++)
   {      
      for(int i = 0; i<4; i++)
      {	   
            int tempint = i + 1;
            if(tempint == 5)
            {
               break;
            }
            while(lowTest[i]<lowTest[tempint])//Sorts both integer and string aray
            {
               System.out.println(hscores(high));
               swapString1 = high[i][0]; //0 is pointed for number row 1 is pointer for intital row
               swapString2 = high[i][1];
               high[i][0] = high[tempint][0];//this block swaps the positions(prob a better way to do this)
               high[i][1] = high[tempint][1];
               high[tempint][0] = swapString1;
               high[tempint][1] = swapString2;
                  //end string swaps
               swapInt = lowTest[i];
               lowTest[i] = lowTest[tempint];
               lowTest[tempint] = swapInt;
                  //end int swaps
                    
            
            }//This *should* bubble sort them
         }
      }
      return high;
   }//end bubble
   
   public static String[][] load_high_score(String	file_name, Scanner input)
   {  
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
   }//end high_score
   public static String[][] sortNsave(String[][] high, String name, int	score, String score_file)
   {
      Scanner input = new Scanner(System.in);
      String scoreString = String.valueOf(score);
      high = bubble(high);
      high[4][0] = scoreString;
      high[4][1] = name;
     //sort the array
      high = bubble(high);
     //save new array back to file
      boolean open =	false;
      input = open_file(score_file, input);
     
      PrintWriter	toFile =	null;
      try
      {
         toFile =	new PrintWriter(score_file);
         open = true;
      }
      catch(FileNotFoundException e) 
      {
         System.out.println("We've run into a problem :(");
         System.out.println("Can't open file"+score_file+" for saving.");
         System.out.println(e);
      }
      if(open)
      {
         for(int i=0;i<high.length;i++)
         {
            for(int j=0;j<2;j++)
            {
               toFile.write(high[i][j] + "\n");
               toFile.flush();
            }
         }
         toFile.close();//TODO: save the file
         input.close();
      }
      return high;
   }//end sortNSave
}//end Trivia class
