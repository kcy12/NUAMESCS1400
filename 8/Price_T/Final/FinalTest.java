import java.io.*;
import java.util.Scanner;
import java.util.InputMismatchException;

public class FinalTest{
   public static void main(String[] args) {
      int i;
      char j = 'a';
      String k = "";
      i = j;
      System.out.println(i);
      i += 2;
      System.out.println(i);
      j = (char)i;
      System.out.println(j);
      j += 5;
      System.out.println(j);
      k += j;
      System.out.println(k);
      
      Caesar.letterDistr("Sphinx of black quartz, judge my vow!");
      
   }//End main Method
}//End Class FinalTest