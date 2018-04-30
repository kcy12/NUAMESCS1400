import java.util.Scanner;

public class BasicInput {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userInt;
      double userDouble;
      String userString;
      char userChar;
      // FIXME Define char and string variables similarly
      
      System.out.println("Enter integer:");
      userInt = scnr.nextInt();
      
      System.out.println("Enter double:");
      userDouble = scnr.nextDouble();
      
      System.out.print("Enter string:");
      userString = scnr.next();
      
      System.out.print("Enter character")
      userChar = scnr.next().charAt(0);
      int integer = (int)userDouble;
      
      System.out.println(userInt + " " + userDouble + " " + userChar + " " + userString);
      System.out.println(userString + " " + userChar + " " + userDouble + " " + userInt);
      System.out.println(userDouble + " cast to an integer is " + integer);
      // FIXME (1): Finish reading other items into variables, then output the four values on a single line separated by a space
   
      // FIXME (2): Output the four values in reverse
      
      // FIXME (3): Cast the double to an integer, and output that integer
   }
}


      
      System.out.println("Enter character");
      userChar = scnr.next().charAt(0);
      int integer = (int)userDouble;
      
            System.out.println("Enter string:");
      userString = scnr.next();
