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
public class DemoSQLInjection {

    static Connection connection;
    static Statement statement;
    static ResultSet rs;

    public static void main(String[] args) {
        try {
            connection = ConnectionUtil.getConnection();
            statement = connection.createStatement();

            // String username = "'=''OR'";     // Expected to be failed
            String username = "admin' #";       // Expected to be failed
            // String username = "admin";       // Expected to be successed
            String password = "password";

            String sql = "SELECT * FROM admin WHERE username = '" + username
                    + "' # AND password = '" + password + "'";

            System.out.println(sql);

            // execute the query
            rs = statement.executeQuery(sql);

            if (rs.next()) {
                System.out.println("Login success");
            } else {
                System.out.println("Login FAILED");
            }

            statement.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
