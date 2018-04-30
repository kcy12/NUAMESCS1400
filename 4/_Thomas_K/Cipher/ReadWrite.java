import java.io.*;
import java.util.Scanner;

public class ReadWrite{
	public static String read(Scanner file){
      //create a string to hold the message
			String toRead = "";
      //get the first line from the file
			toRead = file.nextLine();
      //while the file has a next line
			while(file.hasNextLine()) {
         toRead += "\r";/*carriage return escape sequence*/
         toRead += "\n";/*newline escape sequence*/
         toRead += file.nextLine();/*next line from the file*/
			}
         //that could all be done in one line but takes longer to write out
      file.close();
		return toRead;
	}//end read

	public static Scanner open_file(String	file_name, Scanner input) {
      //try
			try {
         //create a File object based on file_name
				 File file = new File(file_name);
         //change the Scanner input to read from the File object
				 input = new Scanner(file);
			}
      //catch if the file isn't found
			catch(FileNotFoundException e) {
         //Display appropriate error message
				 System.out.println("Error: File not found.");
				 System.out.println(e.getMessage());
			}
		return input;
	}//end open_file

   public static void write(String file_name, String message){
      //try
			try {
         //create a PrintWriter object based on file_name
				 PrintWriter toDo = new PrintWriter(file_name);
         //print the message to the PrintWriter object
				 toDo.write(message);
         //close the PrintWriter object
				 toDo.close();
			}
      //catch if the file is not found - eventhough java is making a file, so it doesn't need to be there first --stupid java
			catch(FileNotFoundException e) {
				System.out.println("Error: File not found.");
				System.out.println(e.getMessage());
			}
   }//end write method
}// end class File
