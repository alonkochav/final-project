package sanity;

import extensions.Verifications;
import io.qameta.allure.Description;

import org.apache.log4j.Logger;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.APIFlows;


@Listeners(utilities.Listeners.class)
public class TestGrafanaAPI extends CommonOps {
    protected static int lastID;

    // READ
    @Test (priority = 0 ,description = "Test 01 - Get Team From Grafana")
    @Description("This Test verifies the properties of the team")
    public void test01_verifyTeam() {
        int teamCount = APIFlows.getAllTeamsAsArray("teams.id").length;

        if (teamCount < 1)
            APIFlows.postTeam("000000","0team@gmail.com");
            Logger.getLogger("Default team added - logger");
        Verifications.verifyCount(teamCount,1);
    }
//
//    // CREATE
//    @Test (description = "Test 02 - Create New Team in Grafana")
//    @Description("This Test creates a new team")
//    public void test02_createTeamAndVerify() {
//        String[] user = APIFlows.getRandomUser();
//        String name = user[0];
//        String email = user[1];
//        Logger.getLogger("Name: "+ name + " = Email: "+ email);
//        APIFlows.postTeam(name,email);
//        Verifications.verifyText(APIFlows.getTeamProperty("teams[0].name"), "000000");
//    }
//
//    // UPDATE
//    @Test (description = "Test 03 - Update Team in Grafana")
//    @Description("This Test Updates the Selected Team and Verifies it")
//    public void test03_updateTeam() {
//        lastID = APIFlows.getLastTeamID("teams.id");
//        APIFlows.updateTeam("111111", "1team@gmail.com", lastID);
//        Verifications.verifyText(APIFlows.getTeamProperty("teams[1].name"), "111111");
////        Verifications.verifyText(APIFlows.getTeamProperty("teams[1].name"), "435435435");  //  FAIL TEST
//    }
//
//    @Test (description = "Test 04 - Updates the Team Back To Default Values in Grafana")
//    @Description("This Test Updates the Selected Team using ID Back to Default Values and Verifies it")
//    public void test04_updateTeamName() {
//        Logger.getLogger(APIFlows.getTeamProperty("teams[0].id"));
//        APIFlows.updateTeamName( "222222", lastID);
//        Verifications.verifyText(APIFlows.getTeamProperty("teams[0].name"), "000000");
//    }5
//
//    @Test (description = "Test 05 - Updates the Team Back To Default Values in Grafana")
//    @Description("This Test Updates the Selected Team using ID Back to Default Values and Verifies it")
//    public void test05_updateTeamEmail() {
//        Logger.getLogger(APIFlows.getTeamProperty("teams[0].id"));
//        APIFlows.updateTeamEmail( "2team@gmail.com", lastID);
//        Verifications.verifyText(APIFlows.getTeamProperty("teams[2].email"), "2team@gmail.com");
//    }
//
//    //DELETE
//    @Test (description = "Test 06 - Delete Team in Grafana")
//    @Description("This Test deletes the selected team and verifies deletion.")
//    public void test06_deleteTeam() {
//        lastID = APIFlows.getLastTeamID("teams.id");
//        APIFlows.deleteTeam(lastID);
//        Verifications.verifyText(APIFlows.getTeamProperty("totalCount"), "1");
//    }
}
