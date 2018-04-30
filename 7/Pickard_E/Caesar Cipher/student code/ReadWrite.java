import java.io.*;
import java.util.Scanner;

public class ReadWrite{
	public static String read(Scanner file){
      //create a string to hold the message
      String returnString;
      //get the first line from the file
      returnString = file.nextLine();
      //while the file has a next line
      while (file != null) {
         returnString += "\r"; //carriage escape sequence
         returnString += "\n"; //newline escape sequcne
         returnString += file.nextLine(); /*next line from the file*/
         //that could all be done in one line but takes longer to write out
      }   
      
      file.close();
		return returnString;
	}//end read
	
	public static Scanner open_file(String	file_name, Scanner input) {
      try {
         //create a File object based on file_name
         File file = new File(file_name);
         //change the Scanner input to read from the File object 
         input = new Scanner(file)
      }

      catch(FileNotFoundException e) {
         System.out.println("We cannot find the file you are looking for.");
      } 
         
		return input;
	}//end open_file
   
   public static void write(String file_name, String message){
      try {
         //create a PrintWriter object based on file_name
         PrintWriter toFile = new PrintWriter(file_name);
         //print the message to the PrintWriter object
         toFile.write(message);
         //close the PrintWriter object
         toFile.close;
      } 
      catch(FileNotFoundException e) { /*if the file is not found - eventhough java is making a file, so it doesn't need to be there first --stupid java*/
        System.out.println("You'll never see this bitch");
      }
   }//end write method
}// end class File