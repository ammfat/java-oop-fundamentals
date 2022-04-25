package meet10.application;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import ___
import ___
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ___.ConnectionUtil;

/**
 *
 * @author ammfat
 */
public class LibraryApp {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    
    static ___ ___;
    static ___ ___;
    static ___ ___;
    static ___ ___;
    
    public static void main(String[] args) {
        try {
            connection = ConnectionUtil.getConnection();
            statement = ___.createStatement();

            while(!connection.isClosed()) {
                showMenu();
            }

            statement.close();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
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
        } catch (___) {
            System.out.println("[!!] Input only a number 0/1/2/3/4!");
        }
    }
    
    static void showData() throws ___ {
        System.out.println("+---------------------+");
        System.out.println("|    LIST OF BOOKS    |");
        System.out.println("+---------------------+");
        
        int i = 0;
        String sql = ___;
        rs = statement.___(sql);

        while (rs.next()) {
            ___ id = rs.___("id");
            ___ title = rs.___("title");
            ___ author = rs.___("author");

            System.out.println(String.format("%d. [%d] %s by %s", (i+1), id, title, author));

            ___;
        }
    }
    
    static void insertData() {
        try {
            // Get user input
            System.out.print("Title\t: ");
            String title = input.readLine().trim();

            System.out.print("Author\t: ");
            String author = ___

            // Save to database
            String sql = ___

            ___ = connection.___(sql);
            ___.setString(___, ___);
            ___.setString(___, ___);

            int affectedRows = ___

            System.out.println("Data inserted successfully.");
            System.out.println(affectedRows + " data affected.");
    
        } catch (IOException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    static void updateData() {
        // update data on db
    }
    
    static void deleteData() {
        // delete data on db
    }
}
