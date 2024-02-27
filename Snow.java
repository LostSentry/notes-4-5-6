import java.util.HashMap;
import java.util.Map;
import input.utils

public class Snow {
    public static void main(String[] args) {

        Map<String, Double> snowfall = new HashMap<>();
        snowfall.put("January",  3.1);
        snowfall.put("February", 10.8);
        snowfall.put("December", 3.1);

        snowfall.put("March", 4.1);
        snowfall.put("April", 0.0);

        for (String month: snowfall.keySet()) {
            double snow = snowfall.get(month);
            //System.out.println("The snow in " + month + " was " + snow + " inches");
            System.out.printf("The snow in %s was %.2f inches\n", month, snow);
        }

        System.out.println(snowfall);

        System.out.println("The snow in january is "+ snowfall.get("January") + " Inches");

        System.out.println("the snow in july is " +snowfall.get("July") + " inches");

        if (snowfall.containsKey("July")) {
            System.out.println("There was snow in july");
        }else {
            System.out.println("There was no snow in july");
        }

        String newMonth = stringInput("Enter name of month");
    }
}
