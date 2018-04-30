import java.io.*;
import java.util.*;

public class ReadWrite{
	public static String read(Scanner file){
      //create a string to hold the message and get the first line from the file
			String message = "";
      //while the file has a next line
			while (file.hasNextLine()) {
         message += "\r";
         message += "\n";
         message += file.nextLine();
         //that could all be done in one line but takes longer to write out
			 }
      file.close();
		return message;
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
			catch (FileNotFoundException e) {
				//Display appropriate error message
				System.out.println("appropriate error message");
			}
		return input;
	}//end open_file
  public static void write(String file_name, String message){
		//try
		try {
    	//create a PrintWriter object based on file_name
			PrintWriter writer = new PrintWriter(file_name);
    	//print the message to the PrintWriter object
			writer.print(message);
      //close the PrintWriter object
			writer.close();
		}
    //catch if the file is not found - eventhough java is making a file, so it doesn't need to be there first --stupid java
		catch (FileNotFoundException e) {
      //display appropriate error message
			System.out.println("appropriate error message");
		}
	}//end write method
}// end class File
