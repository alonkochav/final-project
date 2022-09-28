package extensions;

import io.qameta.allure.Step;
import utilities.CommonOps;
import utilities.Log;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class DBActions extends CommonOps {

    @Step("Get Credentials from Database")
    public static List<String> getCredentials (String query){
        List<String> credentials = new ArrayList<>();
        try {
            rs = stmt.executeQuery(query);
            rs.next();
            credentials.add(rs.getString(1));
            credentials.add(rs.getString(2));
        } catch (SQLException e) {
            Logger.getLogger("Error occurred While Printing Table Data See details: "+ e);
        }

        for (String cred:credentials)
        {
            Log.info(cred);
        }
        return credentials;
    }
}