/*******************************************************************************
* Harrison Fackrell
* Hello World
*
* Last Edited: 1/17/18
*******************************************************************************/
import java.util.*;
public class Counter {
    public static void main(String[] args) {
      Scanner inputScanner = new Scanner(System.in);
      System.out.println("Welcome to the Counter Program");
      System.out.println("What number should I start at?");
      int start = Integer.valueOf(inputScanner.nextLine());
      System.out.println("What number should I end at?");
      int endpoint = Integer.valueOf(inputScanner.nextLine());
      System.out.println("What should I count by?");
      int increment = Integer.valueOf(inputScanner.nextLine());
      counting(start, endpoint, increment);
    }
    public static void counting(int start, int endpoint, int increment) {
      for (int i = start; i <= endpoint; i += increment) {
        System.out.print(String.valueOf(i) + " ");
      }
    }
}
