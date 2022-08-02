package sanity;

import extensions.Verifications;
import io.qameta.allure.Description;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.APIFlows;

@Listeners(utilities.Listeners.class)
public class TestGrafanaAPI extends CommonOps {
    protected static int lastID;

    // READ
    @Test (description = "Test 01 - Get Team From Grafana")
    @Description("This Test verifies the properties of the team")
    public void test01_verifyTeam() {
        lastID = APIFlows.getLastTeamID("teams.id");
        System.out.println("id array length = " + APIFlows.getAllTeamsAsArray("teams.id").length);
        Verifications.verifyText(APIFlows.getTeamProperty("teams[0].name"), "000000");
    }

    // CREATE
    @Test (description = "Test 02 - Create New Team in Grafana")
    @Description("This Test creates a new team")
    public void test02_createTeamAndVerify() {
        String[] user = APIFlows.getRandomUser();
        String name = user[0];
        String email = user[1];
        APIFlows.postTeam(name,email);
        Verifications.verifyText(APIFlows.getTeamProperty("teams[1].name"), name);
    }

    // UPDATE
    @Test (description = "Test 03 - Update Team in Grafana")
    @Description("This Test Updates the Selected Team and Verifies it")
    public void test03_updateTeam() {
        lastID = APIFlows.getLastTeamID("teams.id");
        APIFlows.updateTeam("111111", "1team@gmail.com", lastID);
        Verifications.verifyText(APIFlows.getTeamProperty("teams[0].id"), "1");

    }

    @Test (description = "Test 04 - Updates the Team Back To Default Values in Grafana")
    @Description("This Test Updates the Selected Team Back to Default Values and Verifies it")
    public void test04_updateTeamEmail() {
        System.out.println(APIFlows.getTeamProperty("teams[0].id"));
        APIFlows.updateTeamEmail( "0team@gmail.com", 117);
//        Verifications.verifyText(APIFlows.getTeamProperty("teams[0].email"), "0team@gmail.com");
    }

    //DELETE
    @Test (description = "Test 05 - Delete Team in Grafana")
    @Description("This Test deletes the selected team and verifies deletion.")
    public void test05_deleteTeam() {
        lastID = APIFlows.getLastTeamID("teams.id");
        APIFlows.deleteTeam(lastID);
        Verifications.verifyText(APIFlows.getTeamProperty("totalCount"), "1");
    }
}
