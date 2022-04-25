package meet10.application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import meet10.util.ConnectionUtil;

/**
 *
 * @author ammfat
 */
public class DemoPreparedStatement {

    static Connection connection;
    static PreparedStatement preparedStatement;
    static ResultSet rs;

    public static void main(String[] args) {
        try {
            connection = ConnectionUtil.getConnection();

            // String username = "admin '#";    // Expected to fail
            String username = "'=''OR'";        // Expected to fail
            // String username = 'admin';       // Expected to success
            String password = "password";

            String sql = "SELECT * FROM admin WHERE username = ? AND password = ?";

            // statement = connection.createStatement();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            System.out.println(sql);

            // execute the query
            rs = preparedStatement.executeQuery();

            if (rs.next()) {
                System.out.println("Login success");
            } else {
                System.out.println("Login FAILED");
            }

            String newUser = "superuser";
            String newUserPass = "it is a password";

            sql = "INSERT INTO admin (username, password) VALUE (?, ?)";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, newUser);
            preparedStatement.setString(2, newUserPass);

            int affectedRows = preparedStatement.executeUpdate();

            System.out.println("Insert success.");
            System.out.println(affectedRows + " rows affected");

            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
