package workflows;

import extensions.APIActions;
import io.qameta.allure.Step;
import utilities.CommonOps;

import java.util.Arrays;
import java.util.logging.Logger;


public class APIFlows extends CommonOps {

    public static String allTeamsPath = "api/teams/";
    public static String[] strArray = null;
    public static int[] intArray = null;
    public static int max = Integer.MIN_VALUE;

    @Step("Business Flow : Trim first and last character from String")
    public static String removeFirstAndLastChar(String str) {
        str = str.substring(1, str.length() - 1);
        return str;
    }

    @Step("Business Flow : Find Max of 2 numbers")
    public static int findMax(int num1, int num2){
        max = Math.max(num1, num2);
        return max;
    }

    @Step("Business Flow : Get all Team IDs as String")
    public static String getAllTeams(String jPath){
        response = APIActions.get(allTeamsPath+"search");
        String arrStr = APIActions.extractFromJson(response, jPath);
        return removeFirstAndLastChar(arrStr);
    }

    @Step("Business Flow :Get all Team IDs  as Array")
    public static int[] getAllTeamsAsArray(String jPath){
        String commaSeparatedStr = getAllTeams(jPath);
        strArray = commaSeparatedStr.split(", ");
        intArray = new int[strArray.length];

        return intArray;
    }

    @Step("Business Flow : Get Last Team ID")
    public static int getLastTeamID(String jPath){
        int[] intArray = getAllTeamsAsArray(jPath);
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = Integer.parseInt(strArray[i]);
            max = findMax(intArray[i],max);
        }
//        Logger.getLogger("arrTeams length = " + arrTeams.length);
//         Logger.getLogger("the last id is: " + max);
        String oldName = APIFlows.getTeamByID(max, "name");
        Logger.getLogger("last id's name was : "+oldName + ", id:" + max);
        return max;
    }

    @Step("Business Flow : Get Team Property")
    public static String getTeamProperty(String jPath){
        response = APIActions.get(allTeamsPath+"search");
        return APIActions.extractFromJson(response, jPath);
    }

    @Step("Business Flow : Get Team Property")
    public static String getTeamByID(int id, String jPath){
        response = APIActions.get(allTeamsPath+id);
        return APIActions.extractFromJson(response, jPath);
    }

    @Step("Business Flow : Get params from Json Property")
    public static String[] getRandomUser(){
        final String randomUserUrl = "https://random-data-api.com/api/users/random_user";
        try {
            response = httpRequest.get(randomUserUrl);
        } catch (Exception e){
            response.getBody();
            Logger.getLogger("Message");
        }
        String fname = APIActions.extractFromJson(response,"first_name");
        String lname = APIActions.extractFromJson(response,"last_name");
        String email = APIActions.extractFromJson(response,"email");

        String[] userParams =  new String[3];
        String   name = userParams[0] = fname + " " + lname;
        userParams[1] = email;
        Logger.getLogger("New Random user created  '"+name+"' with email '"+email+"' Created!");

        return userParams;
    }

    @Step("Business Flow : Create new Team in Grafana")
    public static void postTeam(String name, String email){
        params.put("name",name);
        params.put("email",email);
        Logger.getLogger("New Team '"+name+"' with email '"+email+"' Created!");

        APIActions.post(params,"/api/teams");
    }

    @Step("Business Flow : Update Existing Team in Grafana")
    public static void updateTeam(String newName, String newEmail, int id){
        params.put("name",newName);
        params.put("email",newEmail);
        APIActions.put(params,"/api/teams/" + id);
    }

    @Step("Business Flow : Update Existing Team Name in Grafana")
    public static void updateTeamName(String newName, int id){
        params.put("name",newName);
        params.put("email","0team@email.com");
        APIActions.patch(params,"/api/teams/" + id);

    }

    @Step("Business Flow : Update Existing Team Email in Grafana")
    public static void updateTeamEmail(String newEmail, int id){
        params.put("name","111111");
        params.put("email",newEmail);
        APIActions.patch(params,"/api/teams/" + id);

    }

    @Step("Business Flow : Create new Team in Grafana")
    public static void deleteTeam(int id){

        if (id != 81)
            APIActions.delete("/api/teams/"+id);

    }
}
