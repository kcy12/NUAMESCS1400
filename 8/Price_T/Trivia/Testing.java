import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
public class Testing{
   public static void main(String[] args){
      //TESTING READWRITE
      String trivia_file = "trivia.txt";
      Scanner input = new Scanner(System.in);
      System.out.println("Opening File");
      input = ReadWrite.open_file(trivia_file, input);
      System.out.println("Printing welcome");
      ReadWrite.welcome(ReadWrite.next_line(input));
      
      //TESTING TRIVIA.MAIN & TRIVIA.LOADHIGHSCORES
      String score_file = "highscores.txt";
      int score = 20;
      
      boolean hs = false;
      
      input = new Scanner(System.in);
      String[][] high = new String[5][2];
      int i;
      int j;
      
      input = ReadWrite.open_file(score_file, input);
      for (i = 0; i < 5; ++i) {
         for (j = 0; j<2; ++j) {
            high[i][j] = ReadWrite.next_line(input);
         }
      }
      for (i = 0; i < 5; ++i) {
         for (j = 0; j<2; ++j) {
            System.out.println(high[i][j]);
         }
      }
      
      
      int tempInt = Integer.parseInt(high[4][0]);
      
      if(score >= tempInt) {
         hs = true;
         System.out.println("ITS A HIGH SCORE BOY!");
      }
      
      //TESTING TRIVIA.HSCORES
      String printedOut = "";
      for (i = 0; i < 5; ++i) {
         printedOut += high[i][1];
         printedOut += ": ";
         printedOut += high[i][0];
         printedOut += " points\n";
      }
      System.out.println(printedOut);
      
      //TESTING TRIVIA.NAME3
      input = new Scanner(System.in);
      
      String name = "";
      System.out.println("What is the first character in your name?");
      name += input.next().substring(0,1);
      input.nextLine();
      while(name.length() < 3) {
         System.out.print("NAME: " + name + "\t\t");
         System.out.println("What is the next character in your name?");
         name += input.next().substring(0,1);
         input.nextLine();
      }
      name = name.substring(0,3);
      System.out.println(name);
      
      //TESTING TRIVIA.SORTNSAVE
      high[4][0] = String.valueOf(score);
      high[4][1] = name;
      
      printedOut = "";
      for (i = 0; i < 5; ++i) {
         printedOut += high[i][1];
         printedOut += ": ";
         printedOut += high[i][0];
         printedOut += " points\n";
      }
      System.out.println(printedOut);
      
      //TESTING TRIVIA.BUBBLE
      System.out.println("Starting Sort");
      int[] scores = new int[5];
      int tempScore;
      String tempNum;
      String tempPlace;
      boolean inOrder = false;
      for (i = 0; i < 5; ++i) {
         scores[i] = Integer.parseInt(high[i][0]);
      }
      System.out.println("OK, now I'm Really starting to sort");
      while(!inOrder){
         for (i = 4; i > 0; --i) {
            if (scores[i] > scores[i - 1]) {
               tempScore = scores[i];
               tempNum = high[i][0];
               tempPlace = high[i][1];
               scores[i] = scores[i - 1];
               high[i][0] = high[i - 1][0];
               high[i][1] = high[i - 1][1];
               scores[i - 1] = tempScore;
               high[i - 1][0] = tempNum;
               high[i - 1][1] = tempPlace;
               System.out.println(Trivia.hscores(high));
            }
         }
         
         for (i = 0; i < 5; ++i) {
            System.out.println("Score " + (i + 1) + ": " + scores[i]);
         }
         
         if((scores[0]>=scores[1])&&(scores[1]>=scores[2])&&(scores[2]>=scores[3])&&(scores[3]>=scores[4])){
            inOrder = true;
         }
      }
      
      System.out.println(Trivia.hscores(high));
   }
}