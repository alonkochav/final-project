package utilities;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

public class ManageDB extends CommonOps
{
    public static void openConnection(String dbURL, String user, String pass){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(dbURL,user,pass);
            stmt = con.createStatement();
        } catch (ClassNotFoundException e) {
            Logger.getLogger("Error occurred while connecting to the DB. See details: "+ e);
        } catch (SQLException e) {
            Logger.getLogger("Error occurred while fetching data from DB. See details: "+ e);
        }
    }

    public static void closeConnection(){
        try {
            con.close();
        } catch (Exception e) {
            Logger.getLogger("Error Occurred While Closing DB. See details: "+ e);
        }
    }


}
