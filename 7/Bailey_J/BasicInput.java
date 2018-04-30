import java.util.Scanner;

public class BasicInput {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      //variables
      int userInt;
      double userDouble;
      char userChar;
      String userString;
      
      //Get user inputs      
      System.out.println("Enter integer:");
      userInt = scnr.nextInt();
      
      // FIXME (1): Finish reading other items into variables, then output the four values on a single line separated by a space
      System.out.println("Enter double:");
      userDouble = scnr.nextDouble();
      System.out.println("Enter Character:");
      userChar = scnr.next().charAt(0);
      System.out.println("Enter String:");
      userString = scnr.next();
      
      
      //Print outputs
      System.out.println(userInt + " " + userDouble + " " + userChar + " " + userString);

      //Print in reverse
      System.out.println(userString + " " + userChar + " " + userDouble + " " + userInt);
      
      //Cast the double into a integer
      System.out.println(userDouble + " cast to an integer is " + (int)(userDouble));
   }
}