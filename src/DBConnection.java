import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String JDBC_URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USER_NAME = "postgres";
    private static final String USER_PASSWORD = "K!ran@6199";
    
    public static java.sql.Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, USER_NAME, USER_PASSWORD);
    }
}
