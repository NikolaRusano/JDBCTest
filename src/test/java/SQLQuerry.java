import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLQuerry extends ConnectionDB {

    String connectionUrl;
    Statement statement;
    String resultValue = "";
    ResultSet rs;

    public String SQLQuerryExecuted(String sqlQuerry, int column) {

        try {
            ConnectionDB connectionDB = new ConnectionDB();
            statement = connection.createStatement();
            rs = statement.executeQuery(sqlQuerry);
            try {
                while (rs.next()) {
                    resultValue = rs.getString("peopleINN");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (NullPointerException err) {
                System.out.println("No Records obtained for this specific query");
                err.printStackTrace();
            }
            connection.close();
        } catch (
                SQLException sqlEx) {
            System.out.println("SQL Exception:" + sqlEx.getMessage());
        }
        return resultValue;
    }
}

