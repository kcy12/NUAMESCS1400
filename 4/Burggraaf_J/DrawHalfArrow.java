import java.util.Scanner; 

public class DrawHalfArrow {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int arrowBaseHeight;
      int arrowBaseWidth;
      int arrowHeadWidth;
      int arrowHeadWidth2;
      int i;
      int j;
      int k;
      int l;
      
      System.out.println("Enter arrow base height:");
      arrowBaseHeight = scnr.nextInt();
      
      System.out.println("Enter arrow base width:");
      arrowBaseWidth = scnr.nextInt();
      
      System.out.print("Enter arrow head width:");
      arrowHeadWidth = scnr.nextInt();
      System.out.println("");
      
      while (arrowHeadWidth <= arrowBaseWidth) {
         System.out.println("Enter arrow head width:");
         arrowHeadWidth = scnr.nextInt();
      }//end while
      System.out.println("");
      for(i = 0; i < arrowBaseHeight; ++i) {
         
         for(j = 0; j < arrowBaseWidth; ++j) {
            System.out.print("*");
         }//end inside for
         System.out.println();
      }//end for statement
      arrowHeadWidth2 = arrowHeadWidth;
      for (k = 0; k < arrowHeadWidth; ++k) {
         for (l = 0; l < arrowHeadWidth2; ++l) { 
            System.out.print("*");
         }//end inside for
      System.out.println();
         arrowHeadWidth2 -= 1;
            
      }//end for statement
   }//end main
}//end DrawHalfArrow