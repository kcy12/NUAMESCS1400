import java.io.*;
import java.util.Scanner;

public class ReadWrite{
	public static String read(Scanner file){
      //create a string to hold the message
      //get the first line from the file
      //while the file has a next line
         /*message string += carriage return escape sequence*/
         /*message string += newline escape sequence*/
         /*message string += next line from the file*/
         //that could all be done in one line but takes longer to write out
      //DONE
      String message = "";
      message = file.nextLine();
      while (file.hasNextLine()){
         message += "\r";
         message += "\n";
         message += file.nextLine();
      }
      file.close();
		return message;
	}//end read
	
	public static Scanner open_file(String	file_name, Scanner input) {
      //try
         //create a File object based on file_name
         //change the Scanner input to read from the File object
      //catch if the file isn't found
         //Display appropriate error message
         
      //THIS CODE WAS COPIED AND PASTED FROM THE PREVIOUS CODE.  IT SHOULD BE COMPLETE
      FileInputStream fileStream = null;
      try{
         fileStream = new FileInputStream(file_name);
         input = new Scanner(fileStream);
      }
      catch(Exception excpt){
         System.out.println("We've run into a problem :");
			System.out.println("Can't open file "+file_name+" for reading.");
      }
		return input;
	}//end open_file
   
   public static void write(String file_name, String message){
      //try
         //create a PrintWriter object based on file_name
         //print the message to the PrintWriter object
         //close the PrintWriter object 
      //catch if the file is not found - eventhough java is making a file, so it doesn't need to be there first --stupid java
        //display appropriate error message
      try {
         PrintWriter	toFile =	null;
   		try{
   			toFile =	new PrintWriter(file_name);
            toFile.println(message);
   		}
   		catch	(FileNotFoundException e) {
   			System.out.println("We've run into a problem :(");
   			System.out.println("Can't open file"+file_name+" for saving.");
   			System.out.println(e);
   		}
      }
      catch (Exception asdf){
         System.out.println("According to the notes, this should never be read.  If it is, congratulatoins!");
         System.out.println("You must have tried really hard to break something this badly.");
      }
   }//end write method
}// end class File