import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDB {

    private static final String serverName = "s-kv-center-x62";
    private static final String dataBase = "Masterdata";
    private static final String USER = "as-m.rusanov";
    private static final String PASSWORD = "Nick2022Rus";
    private boolean integratedSecurity = true;
    private static final String databaseURL = "jdbc:jtds:sqlserver://" + serverName + ";databaseName=" + dataBase + ";domain=OFFICEKIEV;useNTLMv2=true;";
    Connection connection;

    public ConnectionDB() {


        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            connection = (Connection) DriverManager.getConnection(databaseURL, USER, PASSWORD);

        } catch (SQLException sqlEx) {
            System.out.println("SQL Exception:" + sqlEx.getMessage());
        }



    }
}
