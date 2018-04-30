import java.io.*;
import java.util.Scanner;

public class ReadWrite{
	public static String read(Scanner file){
      //create a string to hold the message and get the first line from the file
      String returnString = "";
      returnString = file.nextLine();
      //while the file has a next line
      while(file != null){ 
         returnString += "\r";
         returnString += "\n";
         returnString += file.nextLine();
         //that could all be done in one line but takes longer to write out
      }   
      file.close();
		return returnString;
   }//end read
	
	public static Scanner open_file(String	file_name, Scanner input){
      //try
      try{
         //create a File object based on file_name
         File fileO = new File(file_name);
         //change the Scanner input to read from the File object
         input = new Scanner(fileO);
      }
      //catch if the file isn't found
      catch(FileNotFoundException e){
         //Display appropriate error message
         System.out.println("Couldn't find file");
      }   
      
		return input;
	}//end open_file
   
   public static void write(String file_name, String message){
      //try
      try{
         //create a PrintWriter object based on file_name
         PrintWriter toFile =	new PrintWriter(file_name);
         //print the message to the PrintWriter object
         toFile.write(message);
         //close the PrintWriter object
         toFile.close; 
      }
      //catch if the file is not found - eventhough java is making a file, so it doesn't need to be there first --stupid java
      catch(FileNotFoundException e){
        //display appropriate error message
        System.out.println("Cannot find file");
      }   
   }//end write method
}// end class File