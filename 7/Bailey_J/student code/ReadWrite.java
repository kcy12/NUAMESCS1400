import java.io.*;
import java.util.Scanner;

public class ReadWrite{
	public static String read(Scanner file){
      //create a string to hold the message
      String returnString = "";
      returnString = file.nextLine();
      //get the first line from the file
      //while the file has a next line
      while (file.hasNextLine()){
         returnString += "\r";
         returnString += "\n";
         returnString += file.nextLine();
      }

         
      file.close();
		return returnString;

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
         System.out.println("Find file not here bad");
      }
		return input;
	}//end open_file
   
   public static void write(String file_name, String message){
      //try
      try {
         PrintWriter toFile = new PrintWriter(file_name);
         toFile.write(message);
         toFile.close();
      }
         //create a PrintWriter object based on file_name
         //print the message to the PrintWriter object
         //close the PrintWriter object 
      //catch if the file is not found - eventhough java is making a file, so it doesn't need to be there first --stupid java
      catch(FileNotFoundException e) {
        //display appropriate error message
        System.out.println("If you're seeing this, Fuck");
      }
   }//end write method
}// end class File