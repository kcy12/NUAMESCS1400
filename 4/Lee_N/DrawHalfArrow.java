/***********************
*Nick Lee
*Draw a half arrow
*
*Last Edited: 3-12-2018
***********************/

import java.util.Scanner; 

public class DrawHalfArrow {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int arrowBaseHeight;
      int arrowBaseWidth;
      int arrowHeadWidth;
      
      int height;
      int width;
      int headWidth;
      int head;
      
      System.out.println("Enter arrow base height:");
      arrowBaseHeight = scnr.nextInt();
      
      System.out.println("Enter arrow base width:");
      arrowBaseWidth = scnr.nextInt();
      
      System.out.println("Enter arrow head width:");
      arrowHeadWidth = scnr.nextInt();
      
      while (arrowHeadWidth <= arrowBaseWidth){
         System.out.println("Enter arrow head width:");
         arrowHeadWidth = scnr.nextInt();
      }//end while loop promting for a valid number
      
      System.out.println("");
      
      //make placeholders
      height = arrowBaseHeight;
      width = arrowBaseWidth;
      headWidth = arrowHeadWidth;
      head = arrowHeadWidth;
      
      //print base width and height
      while (height > 0){
         if (width > 0){
            System.out.print("*");
            width --;
         }//end if for one line
         else{
            System.out.println("");
            width = arrowBaseWidth;
            height --;
         }//end else for new line
      }//end while loop for arrow base
      
      //print head
      while(headWidth > 0){
         if(head > 0){
            System.out.print("*");
            head --;
         }//end drawing head
         else {
            System.out.println("");
            headWidth --;
            head = headWidth;
         }//end new line
      }//end head drawing
      
      //Draw arrow base (height = 3, width = 2)
      //System.out.println("**");
      //System.out.println("**");
      //System.out.println("**");
      
      // Draw arrow head (width = 4)
      //System.out.println("****");
      //System.out.println("***");
      //System.out.println("**");
      //System.out.println("*");
   }
}