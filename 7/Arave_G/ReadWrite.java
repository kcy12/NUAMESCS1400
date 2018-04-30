import java.io.*;
import java.util.Scanner;

public class ReadWrite{
	public static String read(Scanner file){
      //create a string to hold the message
      String messageHolder = "";
      //get the first line from the file
      //while the file has a next line
         /*message string*/ += /*carriage return escape sequence*/
         /*message string*/ += /*newline escape sequence*/
         /*message string*/ += /*next line from the file*/
         //that could all be done in one line but takes longer to write out
      file.close();
		return /*message string*/;
	}//end read
	
	public static Scanner open_file(String	file_name, Scanner input) {
      //try
         //create a File object based on file_name
         //change the Scanner input to read from the File object
      //catch if the file isn't found
         //Display appropriate error message
		return input;
	}//end open_file
   
   public static void write(String file_name, String message){
      //try
         //create a PrintWriter object based on file_name
         //print the message to the PrintWriter object
         //close the PrintWriter object 
      //catch if the file is not found - eventhough java is making a file, so it doesn't need to be there first --stupid java
        //display appropriate error message
   }//end write method
}// end class File