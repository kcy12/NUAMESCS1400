/*************************
*Grant Arave
*Zylabs 16.10
*Last Edited: 2/26/18
*************************/

import java.util.Scanner; 

public class DrawHalfArrow {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int arrowBaseHeight;
      int arrowBaseWidth;
      int arrowHeadWidth;
      int i = 0;
      
      System.out.println("Enter arrow base height:");
      arrowBaseHeight = scnr.nextInt();
      
      System.out.println("Enter arrow base width:");
      arrowBaseWidth = scnr.nextInt();
      
      System.out.println("Enter arrow head width:");
      arrowHeadWidth = scnr.nextInt();
      if(arrowHeadWidth >= arrowBaseWidth)
      {
         System.out.println("");
      }
      
      while(arrowHeadWidth <= arrowBaseWidth)
      {
         System.out.println("Enter arrow head width:");
         arrowHeadWidth = scnr.nextInt();
         
         System.out.println("Enter arrow head width:");
         arrowHeadWidth = scnr.nextInt();
         System.out.println("");
         break;
      }
      
      String ast = "";
      
      for (int x = 1; x <= arrowBaseWidth; ++x)
      {// Draw arrow base (height = 3, width = 2)
         ast += "*";
      }
      
      for (i = 0; i < arrowBaseHeight; ++i)
      {
         System.out.println(ast);
      }
      
      int tempHeadWidth = arrowHeadWidth;
      
      for (int y = 1; y <= arrowHeadWidth; ++y)
      {// Draw arrow head (width = 4)
         for (int z = tempHeadWidth; z > 0; z--)
         {
            System.out.print("*");
         }
         
         tempHeadWidth -= 1;
         
         System.out.println();
      }
   }
}