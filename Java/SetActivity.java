package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetActivity {
    public static void main(String[] args) {
        // set creation
        Set<Integer> hs = new HashSet<>();

        // adding values to the set
        hs.add(10);
        hs.add(10);
        hs.add(99);
        hs.add(9);
        hs.add(86);
        hs.add(45);
        hs.add(4);
        hs.add(9);

        // size
        System.out.println("Size: " + hs.size());

        // remove
        boolean isRemoved = hs.remove(4);
        System.out.println("Is removed? " + isRemoved);
        
        // removing element that is not present
        boolean removed = hs.remove(4);
        System.out.println("Is removed(element not present)? " + removed);

        // checking if element is present or not
        boolean isPresent = hs.contains(9);
        System.out.println("Is present? " + isPresent);

        boolean isPresent1 = hs.contains(4);
        System.out.println("Is present?(element not present) " + isPresent1);

        // Printing set
        System.out.println("Set: " + hs);

        Iterator<Integer> it = hs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

