import java.io.*;
import java.util.*;
public class Main{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      System.out.println("Welcome to the Caesar Cipher!\nThis utility will let you encrypt and decrypt a message from a file you provide.");
      int userChoice = 0;
      int cipher = 0;
      String file;
      String again = "yes";
      String message = "";
      String menu = "\n";
      menu += "Short messages\n";
      menu += "Option 1: Encrypt a Message\n";
      menu += "Option 2: Decrypt a Message\n";
      menu += "Long messages\n";
      menu += "Option 3: Encrypt a Text File\n";//Could've been done in one line. looks easier to read this way imo
      menu += "Option 4: Decrypt a Text File\n";
      menu += "Other Functions\n";
      menu += "Option 5: Letter Distribution Analysis\n";
      menu += "Option 0: Exit Program\n";

		
	 while (userChoice == 0) {
         if(again.equalsIgnoreCase("yes")||again.equalsIgnoreCase("y")){
            System.out.print(menu);
         }
         System.out.print("What is your choice?: ");
			try {
				userChoice = in.nextInt();
				in.nextLine();
			}
			catch (InputMismatchException e) {
				System.out.println("Input was not a number.");
            in.nextLine();
            userChoice = -1;
			}
         switch(userChoice){//make a switch case for the menu
				
               //encrypt message
			case 1:
               System.out.println("Enter your short message: ");
					message = in.nextLine();
					cipher = get_num(in);
					System.out.println(Caesar.encrypt(message,cipher));
			break;
   			   //decrypt message
			case 2:
               System.out.println("Enter your short message: ");
				   message = in.nextLine();
					cipher = get_num(in);
					System.out.println(Caesar.decrypt(message, cipher));
			break;
			case 3:
               //encrypt text file
               file = get_name(in);
               if(file.equals("n")){
                  break;
               }
               else{
                  cipher = get_num(in);
                  message = ReadWrite.read(ReadWrite.open_file(file,in));
                  ReadWrite.write("Encrypted.txt", Caesar.encrypt(message, cipher));
                  System.out.println("Encrypted message saved to Encrypted.txt");
               }
			break;
			case 4:
               //decrypt text file
               file = get_name(in);
               if(file.equals("n")){
                  break;
               }
               else{
                  cipher = get_num(in);
                  message = ReadWrite.read(ReadWrite.open_file(file,in));
                  ReadWrite.write("Decrypted.txt", Caesar.decrypt(message, cipher));
                  System.out.println("Decrypted message saved to Decrypted.txt");
               }
         break;
			case 5:
               //letter distribution
               String temp = "a";
               while(!temp.equalsIgnoreCase("y") && !temp.equalsIgnoreCase("n")){
                  System.out.print("Is the message in a file (y/n)?: ");
                  temp = in.nextLine();
               }
               if(temp.equalsIgnoreCase("n"))
               {
                  System.out.println("Enter your encrypted message: ");
					   message = in.nextLine();
               //end enter message
               }
               else
               {
                  file = get_name(in);
                  if(file.equals("n")){
                     break;
                  }
                  else{
                     message = ReadWrite.read(ReadWrite.open_file(file,in));
                  }
               }   
               //end file message
               Caesar.printDistr(Caesar.letterDistr(message));
         break;
			case 0:
               //exit message
               System.out.println("Thank you for using the utility and goodbye~");
			break;
			default:
				   //invalid input
			System.out.println("That wasn't a valid menu option.");
			break;

		}//end switch
    if (userChoice != 0)
	 {
            System.out.print("Would you like to see the menu again?: ");
            again = in.nextLine();
	    if(again.equalsIgnoreCase("yes")||again.equalsIgnoreCase("y"))
	    {
		    userChoice = 0;//this lets it enter the loop again
	    }
    }
    }//end while loop menu
    in.close();
}//end main method
   
   public static int get_num(Scanner in){
  	   int num = 0;
      while (num < 2 || num > 26){
     try 
	 {
            System.out.print("What is the cipher?: ");
   	   	num = in.nextInt();
   			in.nextLine();
	 }
    catch (InputMismatchException e) {
    System.out.println("You need to use a number for the cipher. Try again.");
    }
    if(num < 2 || num > 26){
         System.out.println("Cipher must be between 2 and 26 inclusive.");
    }
         //} I think this is unnecessary it ends the while loop
    }
      return num;
   }//end get_num method
   public static String get_name(Scanner in){
      String file;
      String temp;
      String response;
      System.out.print("Enter the name of the text file: ");
      file = in.nextLine();
      String ext = file.substring(file.length-4);
      boolean txt = ext.equals(".txt");
      if (!txt){
  			temp = file+".txt";
			System.out.print("Entered file name doesn't end with \'.txt\' "
            +"attempting to ammend file extension.\n"
            +"New File name: "+temp+"\n"
            +"Is this correct? ");
         response = in.nextLine();
         if(response.equalsIgnoreCase("yes")||response.equalsIgnoreCase("y")){
            return temp;
         }
         else{
            System.out.println("Program can only use txt files. Try again.");
            return "n";
         }
		}
      else{
          //file;//wtf
      }
   }//end get_name method
}//end Main
