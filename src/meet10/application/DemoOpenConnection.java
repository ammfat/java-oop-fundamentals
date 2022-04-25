package meet10.application;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author ammfat
 */
public class DemoOpenConnection {

    // jdbc:databaseserver://databaseURL:portdatabase/namadatabase
    static final String JDBC_URL = "jdbc:mysql://localhost:3306/library";
    static final String USER = "root";
    static final String PASSWORD = "";

    static Connection connection;

    public static void main(String[] args) {
        try {
            connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);

            // YOUR SQL CODE
            // GOES HERE...
            // ...
            System.out.println(connection.isClosed());

            connection.close();

            System.out.println(connection.isClosed());
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    static void test() {
        // We DON'T HAVE to do this:
        // System system = new System();

        System.out.println("Just testing");
    }
}
