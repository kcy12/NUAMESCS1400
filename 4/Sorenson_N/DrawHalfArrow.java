import java.util.Scanner; 

public class DrawHalfArrow {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int arrowBaseHeight;
      int arrowBaseWidth;
      int arrowHeadWidth;
      
      System.out.println("Enter arrow base height:");
      arrowBaseHeight = in.nextInt();
      
      System.out.println("Enter arrow base width:");
      arrowBaseWidth = in.nextInt();
      
      System.out.println("Enter arrow head width:");
      arrowHeadWidth = in.nextInt();
      System.out.println("");
      
      arrowBaseConstructor(arrowBaseHeight, arrowBaseWidth);
      arrowheadConstructor(arrowHeadWidth);
      
      while (arrowHeadWidth <= arrowBaseWidth) {
         System.out.println("Please use valid Arrowhead Width. Arrowhead width must be greater than arrow base width.");
         System.out.println("Enter arrow base height:");
         arrowBaseHeight = in.nextInt();
      
         System.out.println("Enter arrow base width:");
         arrowBaseWidth = in.nextInt();
         
         System.out.println("Enter arrow head width:");
         arrowHeadWidth = in.nextInt();
         System.out.println("");
      
      }//end while loop
   }//end main
   public static void arrowBaseConstructor (int arrowBaseHeight, int arrowBaseWidth){
      for (int i = 0; i < arrowBaseHeight; i++){
         for (int j = 0; j < arrowBaseWidth; j++){
            System.out.print("*");
         }// end num of times i print *
         System.out.println("");
      }//end main for
   }// end arrowBaseConstructor
   
   public static void arrowheadConstructor (int arrowHeadWidth){
      for (int i = 0; i < arrowHeadWidth; i++){
         int numToPrint = arrowHeadWidth - i;
         for (int j = 0; j < numToPrint; j++) {
            System.out.print("*");
         }//end numtoprint for loop
         System.out.println("");
      }//end main for
   }//end arrowheadConstructor
}//end DrawHalfArrow