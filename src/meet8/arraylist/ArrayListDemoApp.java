package meet8.arraylist;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author ammfat
 */
public class ArrayListDemoApp {

    public static void main(String[] args) {
        String[] namesArr = new String[100];
        System.out.println(namesArr);

        // Declare (no need to allocate memory)
        ArrayList names = new ArrayList();
        
        /*
        Create ArrayList with specific type
        ArrayList<String> names = new ArrayList<>();
         */
        
        System.out.println(names);

        // Add item/element
        names.add("Armin"); // index 0
        names.add("Beni");
        names.add("Charlie");
        names.add("Andini"); // index 3
        System.out.println(names);
        System.out.println(names.size());

        // Access specific item
        System.out.println("index 1\t: " + names.get(1));
        System.out.println("index 2\t: " + names.get(2));

        // Remove specific item
        names.remove(0);
        System.out.println(names);

        // Add another item to specific position
        names.add(0, "Arminded");
        System.out.println(names);

        // Below one would cause an Exception: java.lang.IndexOutOfBoundsException
        // names.add(10, "Reiner");

        // Sorting
        // BE CAREFUL! Since it would change the order 'in place'
        names.sort(Comparator.naturalOrder());
        System.out.println(names);
        System.out.println(names.get(0));

        names.sort(Comparator.reverseOrder());
        System.out.println(names);
        System.out.println(names.get(0));

        // Let's make it a little messy!
        names.add(true);
        names.add(0.123);
        names.add(-1);

        String tmp = "lorem ipsum";
        names.add(0, tmp);

        System.out.println(names);
        System.out.println(names.get(5));
        
        // Now, the sort won't work anymore.
        // names.sort(Comparator.naturalOrder());
        // System.out.println(names);
        
        // Search the index of given element
        System.out.println(names.indexOf("Arminded"));

        // This one would return `-1` since we have not `Reiner` in our list
        System.out.println(names.indexOf("Reiner"));        
        
        // Check if the list is empty
        System.out.println(names.isEmpty());
        
        // Clear the whole list
        names.clear();
        System.out.println(names);
        
        // Check if the list is empty
        System.out.println(names.isEmpty());
    }
}
