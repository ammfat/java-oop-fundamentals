package meet7;

import java.util.Scanner;

/**
 *
 * @author ammfat
 */
public class ArrayDemoApp {
    public static void main(String[] args) {
        // Declare
        String[] studentNames;
        
        // Allocate memory
        studentNames = new String[3];
        
        // Initialize
        // Remember to start from 0
        studentNames[0] = "Ahmad";
        studentNames[1] = "Maul";
        studentNames[2] = "Ana Malik";
        
        System.out.println(studentNames[0]);
        System.out.println(studentNames[1]);
        System.out.println(studentNames[2]);
        
        // --------------------------------------
        
        var input = new Scanner(System.in);
        
        // Declare and Allocate memory
        String[] cities = new String[3];
        
        for (int i = 0; i < cities.length; i++) {
            System.out.print("City " + (i+1) + " : ");
            cities[i] = input.nextLine();
        }
        
        // for each
        /* Python similar form:
        for city in cities:
          print(city)
        */
        
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
