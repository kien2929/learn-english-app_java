
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

    public static final String DB_USERNAME = "root";
    public static final String DB_PASSWORD = "kienkien1234";
    public static final String DB_URL = "jdbc:mysql://localhost/oopbtldb";
    public static final String TABLE_NAME = "words";

    private static Connection connection = null;

    static {
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return connection;
    }
}
