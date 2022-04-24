package meet10.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ammfat
 */
public class LibraryApp {
    
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) {
        while(true) {
            showMenu();
        }
    }
    
    static void showMenu() {
        System.out.println("\n========= MAIN MENU =========");
        System.out.println("[1] Show Data");
        System.out.println("[2] Insert Data");
        System.out.println("[3] Edit Data");
        System.out.println("[4] Delete Data");
        System.out.println("[0] Exit");
        System.out.println("");
        System.out.print("Choose Menu> ");
        
        try {
            int choice = Integer.parseInt(input.readLine());

            switch (choice) {
                case 0 -> System.exit(0);
                case 1 -> showData();
                case 2 -> insertData();
                case 3 -> updateData();
                case 4 -> deleteData();
                default -> System.out.println("[!!] Wrong choice!");
            }
        } catch (Exception e) {
            System.out.println("[!!] Input only a number 0/1/2/3/4!");
        }
    }
    
    static void showData() {
        System.out.println("+---------------------+");
        System.out.println("|    LIST OF BOOKS    |");
        System.out.println("+---------------------+");
    }
    
    static void insertData() {
        // insert data to db
    }
    
    static void updateData() {
        // update data on db
    }
    
    static void deleteData() {
        // delete data on db
    }
}
