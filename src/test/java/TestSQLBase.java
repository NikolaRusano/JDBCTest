import org.testng.annotations.Test;
import resources.People;

import java.util.ArrayList;
import java.util.List;

public class TestSQLBase {

    @Test(description = "Test1", priority = 1)
    public void BaseSQLQuerryTest(){
        String sqlQuerrytest = "select * from Masterdata.cub.People where peopleLastName LIKE 'Русанов';";

        SQLQuerry sqlQuerry = new SQLQuerry();
        String resultQuerry = sqlQuerry.SQLQuerryExecuted(sqlQuerrytest);
        System.out.println(resultQuerry);
    }

    @Test(description = "Test2", priority = 2)
    public void SQLQuerryTestGetAllTable(){
        String sqlQuerrytest = "select * from Masterdata.cub.People where peopleLastName LIKE 'Русанов';";

        SQLQuerry sqlQuerry = new SQLQuerry();
        List<People> resultQuerry = new ArrayList<People>();
        resultQuerry.addAll(sqlQuerry.SQLQuerryExecutionForListData(sqlQuerrytest));
        resultQuerry.forEach(item -> System.out.println(item.toString() + "\n\n"));
    }

}

