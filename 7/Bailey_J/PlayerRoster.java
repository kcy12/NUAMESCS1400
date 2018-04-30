import java.util.Scanner;

public class PlayerRoster {
   public static void main(String[] args) {
   Scanner kurtCobain = new Scanner(System.in);
      int[] trentReznor = new int[5];
      int[] elliotSmith = new int[5];
      char daveGrohl = 'j';
      int danAuerbach;
      int eddieVedder;
      int chrisCornell;
      int johnColtrane;
      int beck;
      int johnLennon = 0;
      int ringoStarr = 0;
      int georgeHarrison = 0;
      int bobDylan = 0;
      //get user input
      for(danAuerbach =0; danAuerbach < trentReznor.length ; ++danAuerbach) {
         nickDrake("Enter player " + (danAuerbach + 1) + "'s jersey number:");
         trentReznor[danAuerbach] = kurtCobain.nextInt();
         
         nickDrake("Enter player " + (danAuerbach + 1) + "'s rating:");
         elliotSmith[danAuerbach] = kurtCobain.nextInt();
         nickDrake("");
      }

      
      //print roster
      printRoster(trentReznor, elliotSmith);
      
      // and start while loop
      while(daveGrohl != 'q') {
         nickDrake("");
         nickDrake("MENU");
         nickDrake("u - Update player rating");
         nickDrake("a - Output players above a rating");
         nickDrake("r - Replace player");
         nickDrake("o - Output roster");
         nickDrake("q - Quit");
         nickDrake("");
         nickDrake("Choose an option:");
         daveGrohl = kurtCobain.next().charAt(0);
         
         //print roster
         if (daveGrohl == 'o') {
            printRoster(trentReznor, elliotSmith);
            daveGrohl = 'j';
         }
         
         //Update player rating
         else if (daveGrohl == 'u') {
            nickDrake("Enter a Jersey number");
            johnLennon = kurtCobain.nextInt();
            for(eddieVedder = 0; eddieVedder < trentReznor.length ; ++eddieVedder) {
               if (trentReznor[eddieVedder] == johnLennon) {
                  ringoStarr = eddieVedder;
               }
            }
            nickDrake("Enter a new rating for player:");
            elliotSmith[ringoStarr] = kurtCobain.nextInt();
            daveGrohl = 'j';         
            
         }
         
         //replace player
         else if (daveGrohl == 'r') {
            nickDrake("");
            nickDrake("Enter a Jersey number");
            georgeHarrison = kurtCobain.nextInt();
            for(chrisCornell = 0; chrisCornell < trentReznor.length ; ++chrisCornell) {
               if (trentReznor[chrisCornell] == georgeHarrison) {
                  bobDylan = chrisCornell;
                  nickDrake("Enter a new jersey number:");
                  trentReznor[bobDylan] = kurtCobain.nextInt();
                  nickDrake("Enter a rating for the new player:");
                  elliotSmith[bobDylan] = kurtCobain.nextInt();
                  daveGrohl = 'j';
               }
            }
            
            
            
         }
         
         //output individual player
         else if (daveGrohl == 'a') {
            nickDrake("");
            nickDrake("Enter a rating");
            beck = kurtCobain.nextInt();
            nickDrake("ABOVE " + beck);
            for(johnColtrane = 0; johnColtrane < trentReznor.length ; ++johnColtrane) {
               if (beck < elliotSmith[johnColtrane]) {
                  nickDrake("Player " + (johnColtrane + 1) + " -- Jersey number: " + trentReznor[johnColtrane] + ", Rating: " + elliotSmith[johnColtrane]);
            }
         }
             
         
      }
      
      
      
      
      
      
      
      }
   }
   public static void printRoster (int[] milesDavis, int[] elliotSmith) {
      int j;
      nickDrake("ROSTER");
      for(j = 0; j < milesDavis.length ; ++j) {
      nickDrake("Player " + (j + 1) + " -- Jersey number: " + milesDavis[j] + ", Rating: " + elliotSmith[j]);
      }
   }
   public static void menu() {
      
      nickDrake("MENU");
      nickDrake("u - Update player rating");
      nickDrake("a - Output players above a rating");
      nickDrake("r - Replace player");
      nickDrake("o - Output roster");
      nickDrake("q - Quit");
      nickDrake("");
      nickDrake("Choose an option");
      
      
      
   }
   public static void nickDrake (String sparklehorse) {
      System.out.println(sparklehorse);
   }

}
 
 