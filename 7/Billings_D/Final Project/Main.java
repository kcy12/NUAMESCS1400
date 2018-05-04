import java.io.*;
import java.util.*;

public class Main{
   public static void main(String[] args){
      Scanner scnr = new Scanner(System.in);
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
      menu += "Option 3: Encrypt a Text File\n";
      menu += "Option 4: Decrypt a Text File\n";
      menu += "Other Functions\n";
      menu += "Option 5: Letter Distribution Analysis\n";
      menu += "Option 0: Exit Program\n";
      
      while(userChoice == 0){
         if(again.equalsIgnoreCase("yes")||again.equalsIgnoreCase("y")){
            System.out.print(menu);
         }
         System.out.print("What is your choice?: ");
         try{
            userChoice = scnr.nextInt();
         }
         catch (InputMismatchException e){
            System.out.println("Input was not a number.");
            scnr.nextLine();
            userChoice = -1;
         }
         switch(userChoice){
            case 1:
               System.out.println("Enter your short message: ");
               message = scnr.nextLine();
               cipher = get_num(scnr);
               System.out.println(Caesar.encrypt(message, cipher));
               break;
            case 2:
               System.out.println("Enter your short message: ");
               message = scnr.nextLine();
               cipher = get_num(scnr);
               System.out.println(Caesar.decrypt(message, cipher));
               break;
            case 3:
               file = get_name(scnr);
               if(file.equals("n")){
                  break;
               }
               else{
                  cipher = get_num(scnr);
                  message = ReadWrite.read(ReadWrite.open_file(file, scnr));
                  ReadWrite.write("Encrypted.txt", Caesar.encrypt(message, cipher));
                  System.out.println("Encrypted message saved to Encrypted.txt");
               }
               break;
            case 4:
               file = get_name(scnr);
               if (file.equals("n")){
                  break;
               }
               else{
                  cipher = get_num(scnr);
                  message = ReadWrite.read(ReadWrite.open_file(file, scnr));
                  ReadWrite.write("Decrypted.txt", Caesar.decrypt(message, cipher));
                  System.out.println("Decrypted message saved to Decrypted.txt");
               }
               break;
            case 5:
               String temp = "a";
               while(!temp.equalsIgnoreCase("y") && !temp.equalsIgnoreCase("n")){
                  System.out.print("Is the message in a file (y/n)?: ");
                  temp = scnr.nextLine();
               }
               if(temp.equalsIgnoreCase("n")){
                  System.out.println("Enter your encrypted message: ");
                  message = scnr.nextLine();
               }
               else{
                  file = get_name(scnr);
                  if(file.equals("n")){
                     break;
                  }
                  else{
                     message = ReadWrite.read(ReadWrite.open_file(file, scnr));
                  }
               }
               Caesar.printDistr(Caesar.letterDistr(message));
               break;
            case 0:
               System.out.println("Thank you for using the utility and goodbye~");
               userChoice = -1;
               break;
            default:
               System.out.println("That wasn't a valid menu option.");
               break;
         }
         if(userChoice != -1){
            System.out.print("Would you like to see the menu again?: ");
            again = scnr.nextLine();
            if(again.equalsIgnoreCase("yes")||again.equalsIgnoreCase("y")){
               userChoice = 0;
            }
            if(again.equalsIgnoreCase("no")||again.equalsIgnoreCase("n")){
               userChoice = 0;
            }
         }
      }
      scnr.close();
   }
   
   public static int get_num(Scanner scnr){
      int num = 0;
      while(num <2 || num > 26){
         try{
            System.out.print("What is the cipher?: ");
            num = scnr.nextInt();
            scnr.nextLine();
         }
         catch(InputMismatchException e){
            System.out.println("You need to use a number for the cipher. Try again.");
         }
         if(num < 2 || num > 26){
            System.out.println("Cipher must be between 2 and 26 inclusive.");
         }
      }
      return num;
   }
   
   public static String get_name(Scanner scnr){
      String file;
      String temp;
      String response;
      System.out.print("enter the name of the text file: ");
      file = scnr.nextLine();
      String ext = file.substring(file.length() - 4);
      boolean txt = ext.equals(".txt");
      if(!txt){
         temp = file + ".txt";
         System.out.print("Entered file name doesn't end with \'.txt\' "
         +"attempting to ammend file extension.\n"
         +"New File name: "+temp+"\n"
         +"Is this correct? ");
         response = scnr.nextLine();
         if(response.equalsIgnoreCase("yes")||response.equalsIgnoreCase("y")){
            return temp;
         }
         else{
            System.out.println("Program can only use txt files. Try again.");
            return "n";
         }
      }
      else{
         return file;
      }
   }
}