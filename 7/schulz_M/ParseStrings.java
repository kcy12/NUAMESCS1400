import java.util.Scanner;
public class ParseStrings {
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      String userInput;
      int strIndex = 0;
      String name1;
      String name2;
      boolean stay = true;
      println("Enter input string:");
      userInput = s.nextLine();
      while(stay==true){
        if (userInput.indexOf(",")!=-1){
          strIndex = userInput.indexOf(",");
          name1 = userInput.substring(0,strIndex);
          name2 = userInput.substring(strIndex);
          name1 = name1.replaceAll(" ","");
          name2 = name2.replaceAll(" ","");
          name1 = name1.replaceAll(",","");
          name2 = name2.replaceAll(",","");
          println("First word: " + name1);
          println("Second word: " + name2);
          println("");
          println("Enter input string:");
          userInput = s.nextLine();
        }
        else if(userInput.equals("q")){
          stay = false;
        }
        else{
          println("Error: No comma in string.");
          println("");
          println("Enter input string:");
          userInput = s.nextLine();
        }
      }
  }
   public static void print(String x){
     System.out.print(x);
   }
   public static void println(String x){
     System.out.println(x);
   }
 }
