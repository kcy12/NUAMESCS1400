import java.io.*;
import java.util.*;

public class ReadWrite{//this contains the final 14 points needed for 100%
	public static String read(Scanner file)
   {
      String returnString = "";//create a string to hold the message and get the first line from the file
      returnString = file.nextLine();
      while(file.hasNextLine())//while the file has a next line
      {//How do you know what the message string is 
         returnString += "\r";/*carriage return escape sequence*/
         returnString += "\n";/*newline escape sequence*/
         returnString += file.nextLine();/*next line from the file*/
      }
      returnString += "\r";
      returnString += "\n";
      /*if(Character.isDigit(returnString.charAt(7)))
      {
         returnString += "\r";
         returnString += "\n";//this is cheating
         System.out.println(returnString);
      }*/
      file.close();
		return returnString;
   }//end read
	
	public static Scanner open_file(String	file_name, Scanner input) 
   {
      try
      {//try
         File fileO = new File(file_name);//create a File object based on file_name
         input = new Scanner(fileO);//change the Scanner input to read from the File object
      }
      catch(FileNotFoundException e)
      {//catch if the file isn't found
         System.out.println("Couldn't find file");//Display appropriate error message
      }   
      
		return input;
	}//end open_file
   
   public static void write(String file_name, String message)
   {
      try
      {
      //try
         PrintWriter toFile =	new PrintWriter(file_name);//create a PrintWriter object based on file_name
         toFile.write(message);//print the message to the PrintWriter object
         toFile.close();//close the PrintWriter object 
      }
      catch(FileNotFoundException e)
      {
      //catch if the file is not found - eventhough java is making a file, so it doesn't need to be there first --stupid java
        System.out.println("Cannot find file");//display appropriate error message
      }   
   }//end write method
}// end class File
