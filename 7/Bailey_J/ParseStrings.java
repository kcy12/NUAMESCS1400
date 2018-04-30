import java.util.Scanner;

public class ParseStrings {
   public static void main(String[] args) {
      //variables
      Scanner louReed = new Scanner(System.in);
      String catStevens = "Jaden , Bailey";
      String johnLennon = "[ ,]+";
      int noelGallagher = 0;
      
      //user input
      davidLynch("Enter input string:");
      catStevens = louReed.nextLine();
      
      while (catStevens.charAt(0) != 'q') {
         //check for comma
         for (int i = 0; i < catStevens.length(); ++i) {
            if(catStevens.charAt(i) == ',') {
               noelGallagher = 1;
            }
         }
         if (noelGallagher == 1) {
            //parse string    
            String[] fatherJohnMisty = catStevens.split(johnLennon);
           
            //output words
            davidLynch("First word: " + fatherJohnMisty[0]);
            davidLynch("Second word: " + fatherJohnMisty[1]);
            davidLynch("");
            
            //get next input
            davidLynch("Enter input string:");
            catStevens = louReed.nextLine();
         }
         else {
         //get next input\
         davidLynch("Error: No comma in string.");
         davidLynch("");
         davidLynch("Enter input string:");
         catStevens = louReed.nextLine();
         }
         
      }//end main loop     
   }//end main
    public static void davidLynch(String theMessage) {
      System.out.println(theMessage);
      
   }//end println
}//end ParseString