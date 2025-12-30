package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapActivity {
    public static void main(String[] args) {
        // map creation
        Map<Integer, String> colours = new HashMap<>();

        // adding values to the map
        colours.put(1, "Green");
        colours.put(2, "Pink");
        colours.put(3, "Purple");
        colours.put(4, "Black");
        colours.put(5, "White");

        // Lambda Expression
        colours.keySet().forEach((key) -> { System.out.println(key); });

        // removing element
        colours.remove(3);

        // CHecking whther green is present or not
        if(colours.containsValue("Green")) {
            System.out.println("Green is present");
        } else {
            System.out.println("Green not present");
        }
        
        // Printing size and map
        System.out.println("Size: " + colours.size());
        System.out.println("Map: " + colours);
    }
}
