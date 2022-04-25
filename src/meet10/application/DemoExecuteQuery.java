package meet10.application;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

import meet10.util.ConnectionUtil;

/**
 *
 * @author ammfat
 */
public class DemoExecuteQuery {

    static Connection connection;
    static Statement statement;
    static ResultSet rs;

    public static void main(String[] args) {
        try {
            // open connection
            connection = ConnectionUtil.getConnection();

            // create statement
            statement = connection.createStatement();

            // define the SQL query
            String sql = "SELECT * FROM books";

            // execute the query
            rs = statement.executeQuery(sql);

            while (rs.next()) {
                // rs.getXxx("tablename")
                System.out.println("ID\t\t: " + rs.getInt("id"));
                System.out.println("Title\t\t: " + rs.getString("title"));
                System.out.println("Author\t\t: " + rs.getString("author"));
                System.out.println("--------------------------------------");
            }

            sql = "SELECT * FROM books WHERE author LIKE \"%knaflic%\"";
            rs = statement.executeQuery(sql);

            while (rs.next()) {
                // rs.getXxx("tablename")
                System.out.println("ID\t\t: " + rs.getInt("id"));
                System.out.println("Title\t\t: " + rs.getString("title"));
                System.out.println("Author\t\t: " + rs.getString("author"));
                System.out.println("--------------------------------------");
            }

            sql = """
                  INSERT INTO books (title, author)
                  VALUES ('Dunia Sophie', 'Jostein Gaarder')
                  """;

            int affectedRows = statement.executeUpdate(sql);

            System.out.println("Insert success.");
            System.out.println(affectedRows + " rows affected");

            statement.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
