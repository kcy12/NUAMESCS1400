/******************
Saxxon Whitaker
Half an Arrow
2/22/2018
******************/

import java.util.*;

public class DrawHalfArrow {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int arrowBaseHeight;
      int arrowBaseWidth = 1;
      int arrowHeadWidth = 0;
      
      System.out.println("Enter arrow base height:");
      arrowBaseHeight = scnr.nextInt();
      
      System.out.println("Enter arrow base width:");
      arrowBaseWidth = scnr.nextInt();
      
      System.out.println("Enter arrow head width:");
      arrowHeadWidth = scnr.nextInt();
      
      while (arrowHeadWidth <= arrowBaseWidth){ 
         System.out.println("Enter arrow head width:");
         arrowHeadWidth = scnr.nextInt();
      }
      
      System.out.println("");
      
      
      int loopNum = arrowHeadWidth; 
      
      for (int i = arrowBaseHeight; i > 0; i--){
         for (int j = arrowBaseWidth; j > 0; j--) {
            System.out.print("*");
         } 
         System.out.println();
      }   
      
      for (int k = arrowHeadWidth; k > 0; k--){
         for (int l = loopNum; l > 0; l--){
            System.out.print('*');
         }   
         loopNum -= 1;
         System.out.println();
      }   
      
   }
}