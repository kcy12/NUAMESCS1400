/*******************************************************************************
* Harrison Fackrell
* Hello World
*
* Last Edited: 1/19/18
*******************************************************************************/
import java.util.*;

public class CarSalesman {
    public static void main(String[] args) {
      Scanner inputScanner = new Scanner(System.in);
      System.out.println("What is the base cost of your car?");
      HashMap <String, Double> charges = new HashMap<String, Double>();
      charges.put("Base Cost", Double.parseDouble(inputScanner.nextLine()));
      charges.put("Lunch", 50.0);
      charges.put("Insurance", 1000.0);
      charges.put("Tax", charges.get("Base Cost") * 0.10);
      charges.put("License", charges.get("Base Cost") * 0.05);
      double total = 0.0;
      for (double value : charges.values()) {
        total += value;
      }
      for (String key : charges.keySet()) {
        System.out.println(key + ": $" + charges.get(key));
      }
      System.out.println("Total: $" + total);
    }
}
