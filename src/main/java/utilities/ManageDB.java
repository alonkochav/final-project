package utilities;

import java.sql.DriverManager;
import java.sql.SQLException;
import org.apache.log4j.Logger;

public class ManageDB extends CommonOps
{
    public static void openConnection(String dbURL, String user, String pass){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(dbURL,user,pass);
            stmt = con.createStatement();
        } catch (ClassNotFoundException e) {
            Log.info("Error occurred while connecting to the DB. See details: "+ e);
        } catch (SQLException e) {
            Log.info("Error occurred while fetching data from DB. See details: "+ e);
        }
    }

    public static void closeConnection(){
        try {
            con.close();
        } catch (Exception e) {
            Log.info("Error Occurred While Closing DB. See details: "+ e);
        }
    }


}
