import org.testng.annotations.Test;

public class TestSQLBase {

    @Test(description = "Test1", priority = 1)
    public void BaseSQLQuerryTest(){
        String sqlQuerrytest = "select * from Masterdata.cub.People where peopleLastName LIKE 'Русанов';";

        SQLQuerry sqlQuerry = new SQLQuerry();
        String resultQuerry = sqlQuerry.SQLQuerryExecuted(sqlQuerrytest,1);
        System.out.println(resultQuerry);
    }

}

