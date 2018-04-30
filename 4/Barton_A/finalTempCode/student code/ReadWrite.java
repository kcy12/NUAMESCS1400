import java.io.*;
import java.util.Scanner;

public class ReadWrite{
	public static String read(Scanner file){
      String returnMessage = "";//create a string to hold the message
      returnMessage = file.nextLine();//get the first line from the file
      while(file.hasNextLine()){//while the file has a next line
         returnMessage += "\r"/*carriage return escape sequence*/
         returnMessage += "\n"/*newline escape sequence*/
         returnMessage += file.nextLine();/*next line from the file*/
         //that could all be done in one line but takes longer to write out
      }
      file.close();
		return returnMessage;
	}//end read
	
	public static Scanner open_file(String	file_name, Scanner input) {
      //try
      try{
         File file = new File(file_name);//create a File object based on file_name
         input = new Scanner(file);//change the Scanner input to read from the File object
      }
      catch(FileNotFoundException e)//catch if the file isn't found
         System.out.println("Couldn't find file");//Display appropriate error message
		return input;
	}//end open_file
   
   public static void write(String file_name, String message){
      //try
      try{
         PrintWriter toFile = new PrintWriter(file_name);//create a PrintWriter object based on file_name
         toFile.write(message);//print the message to the PrintWriter object
         toFile.close;//close the PrintWriter object 
      }
      catch(FileNotFoundException e){//catch if the file is not found - eventhough java is making a file, so it doesn't need to be there first --stupid java
        System.out.println("Cannot find file");//display appropriate error message
      }
   }//end write method
}// end class File