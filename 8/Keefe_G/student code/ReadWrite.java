import java.io.*;
import java.util.Scanner;

public class ReadWrite{
	public static String read(Scanner file){
      //create a string to hold the message
      String message = "";
      //get the first line from the file
      message += file.nextLine();
      //while the file has a next line
      while(file.hasNextLine()){
         /*message string += carriage return escape sequence*/
         message += "\r";
         /*message string += newline escape sequence*/
         message += "\n";
         /*message string += next line from the file*/
         message += file.nextLine();
         //that could all be done in one line but takes longer to write out
      }
      file.close();
		return message;
	}//end read
	
	public static Scanner open_file(String	file_name, Scanner input) {
      //try
      try {
		   File file = new File(file_name);
         input = new Scanner(file);
      }
      catch (FileNotFoundException exception){
         System.out.println("We've run into a problem :(");
			System.out.println("Can't open file "+file_name+" for reading.");
      }

         //create a File object based on file_name
         //change the Scanner input to read from the File object
      //catch if the file isn't found
         //Display appropriate error message
		return input;
	}//end open_file
   
   public static void write(String file_name, String message){
      //try
      try{
         //create a PrintWriter object based on file_name
         write = new PrintWriter(file_name);
         //print the message to the PrintWriter object
         write.println(message);
         //close the PrintWriter object
         write.close();
      }
      catch(FileNotFoundException e){ 
      //catch if the file is not found - eventhough java is making a file, so it doesn't need to be there first --stupid java
        //display appropriate error message
   }//end write method
}// end class File