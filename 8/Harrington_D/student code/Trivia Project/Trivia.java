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
      Scanner input1 = new Scanner(System.in);
      input = ReadWrite.open_file(trivia_file, input);
      
      /*TODO: 
      first line of tirvia file is the title
      use the welcome method from ReadWrite to display the title*/
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
      String [][] high = new String[5][2];
      high = load_high_score(score_file, input1);
      String x = high[4][0];
      int y = Integer.parseInt(x);
      if(y <= score){
         hs = true;
         }

      input = ReadWrite.open_file(score_file, input);
      
      input = new Scanner(System.in);
      if(hs){
         System.out.println("You made it on the high score list!");
         //save initials
         String name = name3(input);
         /*TODO:
            Send initals and score to sortNSave
         */
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
      public static String name3 (Scanner input){
         String x = "";
         while(x.length() != 3){
            x = input.next();
            if(x.length() < 3){
               System.out.println("Not good enough");
               x = input.next();
            }
            if(x.length() > 3){
               System.out.println("Too much"); 
               x = input.next();
            }
         }
         x = x.toUpperCase();
         return x;
      }
      
        
      
      /*TODO:
         create a String hscore method
         iterate through the high score 2D array
            create a string representation that looks like the following when printed
            ABC: 5 points
            DEF: 4 points
         return the string representation
      */
      public static String hscores(String [][] high){
         String x = "";
         for(int i=0; i<5; i++){
               x += high[i][1] + ": " + high[i][0] + " points\n";
         } 
         return x;    
      }


   public static String[][] bubble(String[][] high){
      String n;

      String x = high[0][0];
      String y = high[1][0];
      String z = high[2][0];
      String a = high[3][0];
      String b = high[4][0];
      int c = Integer.parseInt(x);
      int d = Integer.parseInt(y);
      int e = Integer.parseInt(z);
      int f = Integer.parseInt(a);
      int g = Integer.parseInt(b);
      while(g > f || f > e || e > d || d > c){
         if (g > f){
            int l = g;
            g = f;
            f = l;
            n = high[4][1];
            high[4][1] = high[3][1];
            high[3][1] = n;
         }
         if(f > e){
            int l = f;
            f = e;
            e = l;
            n = high[3][1];
            high[3][1] = high[2][1];
            high[2][1] = n;
         }
         if(e > d){
           int l = e;
           e = d;
           d = l;
           n = high[2][1];
           high[2][1] = high[1][1];
           high[1][1] = n;
         }
         if(d > c){
            int l = d;
            d = c;
            c = l;
            n = high[1][1];
            high[1][1] = high[0][1];
            high[0][1] = n;
         } 
      }
      x = Integer.toString(c);
      high[0][0] = x;
      y = Integer.toString(d);
      high[1][0] = y;
      z = Integer.toString(e);
      high[2][0] = z;
      a = Integer.toString(f);
      high[3][0] = a;
      b = Integer.toString(g);
      high[4][0] = b;
      
          
      return high;
   }//end bubble
   
   
	public static String[][] load_high_score(String	file_name, Scanner input){
      String[][] high = new String[5][2];
      input = ReadWrite.open_file(file_name, input);
      high[0][0] = ReadWrite.next_line(input);
      high[0][1] = ReadWrite.next_line(input);
      high[1][0] = ReadWrite.next_line(input);
      high[1][1] = ReadWrite.next_line(input);
      high[2][0] = ReadWrite.next_line(input);
      high[2][1] = ReadWrite.next_line(input);   
      high[3][0] = ReadWrite.next_line(input);
      high[3][1] = ReadWrite.next_line(input);
      high[4][0] = ReadWrite.next_line(input);   
      high[4][1] = ReadWrite.next_line(input); 
       
         
      return high;
	}//end high_score
   
   
	public static String[][] sortNsave(String[][] high, String name, int	score, String score_file){
		/*TODO:replace last	entry	since	we	already know we beat	it
		   score
         name*/
      String x = Integer.toString(score);
      high[4][0] = x;
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
               toFile.println(high[i][j]);
				}
			}
         //TODO: save the file
         toFile.close();
		}
		return high;
	}//end sortNSave
}//end Trivia class