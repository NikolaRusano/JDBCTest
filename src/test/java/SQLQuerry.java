import resources.People;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SQLQuerry extends ConnectionDB {

    String connectionUrl;
    Statement statement;
    String resultValue = "";
    ResultSet rs;

    People tempPerson;
    List<People> peopleList = new ArrayList<People>();

    public String SQLQuerryExecuted(String sqlQuerry) {

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

    public List<People> SQLQuerryExecutionForListData(String sqlQuerry) {

        try {
            ConnectionDB connectionDB = new ConnectionDB();
            statement = connection.createStatement();
            rs = statement.executeQuery(sqlQuerry);
            try {
                while (rs.next()) {
                    tempPerson = new People(rs.getString("peopleINN"),rs.getString("peopleLastName"),rs.getString("peopleFirstName"),
                    rs.getString("peopleMiddleName"),rs.getString("peopleFullName"),rs.getString("peopleBirthday"),rs.getShort("peopleGender"),
                    rs.getString("peopleLogin"),rs.getString("peopleEmail"),rs.getString("peopleDomain"),rs.getString("peopleCity"),rs.getString("peopleAddress"),
                     rs.getString("peopleInnerPhone"),rs.getString("peopleWorkPhone"),rs.getString("peopleMobilePhone"),rs.getShort("peopleRefusedFromInn"),
                    rs.getString("peopleFullLogin"),rs.getString("globalUserId"),rs.getString("dateWorkExperience"),rs.getString("nonResident"));

                    peopleList.add(tempPerson);
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
        return peopleList;
    }
}

