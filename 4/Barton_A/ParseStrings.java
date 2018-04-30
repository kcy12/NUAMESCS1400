import java.util.Scanner;

public class ParseStrings {
   public static void main(String[] args) {
      String userInput = "";
      Scanner scnr = new Scanner(System.in);
      String output1 = "";
      String output2 = "";
      int yesOrNo;
      int noOrYes;
      int i;
      int j;
      int k;
      
         System.out.println("Enter input string:");
         userInput = scnr.nextLine();
      
         while(userInput.indexOf(',') == -1){
            System.out.println("Error: No comma in string.\n");
            System.out.println("Enter input string:");
            userInput = scnr.nextLine();
            }
          if(userInput.indexOf(' ') == -1){
            yesOrNo = 2;
           }
          else if(userInput.indexOf(' ') < userInput.indexOf(',')){
            yesOrNo = 1;
          }
          else{
            yesOrNo = 3;
          }
          if(userInput.indexOf(' ') == -1){
            noOrYes = 2;
          }
          else if(userInput.lastIndexOf(' ') > userInput.indexOf(',')){
            noOrYes = 1;
          }
          else{
            noOrYes = 3;
          }
      for(i = 0; i < 2; ++i){
         if(i == 0){
            if(yesOrNo == 1){
               for(j = 0; j < userInput.indexOf(',') - 1; ++j){
                  output1 += userInput.charAt(j);
               }
            }
            else if(yesOrNo == 2){
               for(j = 0; j < userInput.indexOf(','); ++j){
                  output1 += userInput.charAt(j);
               }
            }
            else{
              for(j = 0; j < userInput.indexOf(' ') - 1; ++j){
                  output1 += userInput.charAt(j);
             }
            }//end of if
            }
          else{
            if(noOrYes == 1){
               for(k = userInput.lastIndexOf(' ') + 1; k < userInput.length(); ++k){
                  userInput.replaceAll("\\s","");
                  output2 += userInput.charAt(k);
               }
             }
            else if(noOrYes == 2){
               for(k = userInput.indexOf(',') + 1; k < userInput.length(); ++k){
               userInput.replaceAll("//s","");
                  output2 += userInput.charAt(k);
               }//end of for
            }// end of else if
            else{
               for(k = userInput.indexOf(',') + 1; k < userInput.length(); ++k){
                  userInput.replaceAll("\\s","");
                  output2 += userInput.charAt(k);
               }
            }
               
            }//end of else
         
         }//end of for
       System.out.println("First word: " + output1);
       System.out.println("Second word: " + output2);
       while(userInput.equals("q") == false){
         output1 = "";
         output2 = "";
         System.out.println("\nEnter input string:");
         userInput = scnr.nextLine();
         if(userInput.equals("q")){
            break;
         }
         if(userInput.equals("q") == false){
            while(userInput.indexOf(',') == -1){
               System.out.println("Error: No comma in string.\n");
               System.out.println("Enter input string:");
               userInput = scnr.nextLine();
               }//end of while
         }
          if(userInput.indexOf(' ') == -1){
            yesOrNo = 2;
           }
          else if(userInput.indexOf(' ') < userInput.indexOf(',')){
            yesOrNo = 1;
          }
          else{
            yesOrNo = 3;
          }
          if(userInput.indexOf(' ') == -1){
            noOrYes = 2;
          }
          else if(userInput.lastIndexOf(' ') > userInput.indexOf(',')){
            noOrYes = 1;
          }
          else{
            noOrYes = 3;
          }
      for(i = 0; i < 2; ++i){
         if(i == 0){
            if(yesOrNo == 1){
               for(j = 0; j < userInput.indexOf(',') - 1; ++j){
                  output1 += userInput.charAt(j);
               }
            }
            else if(yesOrNo == 2){
               for(j = 0; j < userInput.indexOf(','); ++j){
                  output1 += userInput.charAt(j);
               }
            }
            else{
              for(j = 0; j < userInput.indexOf(' ') - 1; ++j){
                  output1 += userInput.charAt(j);
             }
            }//end of if
            }
          else{
            if(noOrYes == 1){
               for(k = userInput.lastIndexOf(' ') + 1; k < userInput.length(); ++k){
                  userInput.replaceAll("\\s","");
                  output2 += userInput.charAt(k);
               }
             }
            else if(noOrYes == 2){
               for(k = userInput.indexOf(',') + 1; k < userInput.length(); ++k){
               userInput.replaceAll("//s","");
                  output2 += userInput.charAt(k);
               }//end of for
            }// end of else if
            else{
               for(k = userInput.indexOf(',') + 1; k < userInput.length(); ++k){
                  userInput.replaceAll("\\s","");
                  output2 += userInput.charAt(k);
               }
            }
               
            }//end of else
         
         }//end of for
       System.out.println("First word: " + output1);
       System.out.println("Second word: " + output2);
       }
      
   }//end of main
}//end of ParseStrings