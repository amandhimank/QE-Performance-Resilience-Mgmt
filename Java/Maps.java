package Collections;

import java.util.HashMap;
import java.util.Map;

/*
    -> use iterators to traverse through the collections -> as it works similar on every collection so no need to change the code again and again
*/ 

public class Maps {
    public static void main(String[] args) {
        Map<String, Integer> hmap = new HashMap<>();
        hmap.put("A", 1);
        hmap.put("C", 3);
        hmap.put("Z", 26);

        System.out.println(hmap.keySet());
        System.out.println(hmap.values());
        System.out.println(hmap.entrySet());
        System.out.println(hmap);

    }
}
