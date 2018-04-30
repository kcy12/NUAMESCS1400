/***************************
* Cally Dessenberger
* Counter
*Last Edited:1/25/18
***************************/
//for( inti= S;i<=E;+=C){
import java.util.Scanner;
public class Counter{
   public static void main(String[] args){
      //init vars
      int cStart = 0;
      int count = 0; 
      Scanner scan = new Scanner(System.in);
      int cBy = 0;
      int cEnd = 0;
      //greet the user
      System.out.println("Hello user!");
      //prompt for input x3
      System.out.println();
      System.out.println("start? ");
         cStart = scan.nextInt();
      System.out.println();
      System.out.println(" by? ");
         cBy = scan.nextInt();
      System.out.println();
      System.out.println(" end? ");
         cEnd = scan.nextInt();
      //save input x3
          
          counter(cStart,cBy,cEnd);

}//end main
      //call counter method
      public static void counter(int cStart, int cBy, int cEnd){

     
   //counter
      //for
               for( int i= cStart; i <= cEnd; i += cBy){
         //show count
            System.out.println(i);
            }//end for
}//end class
}