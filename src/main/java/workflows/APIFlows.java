package workflows;

import extensions.APIActions;
import io.qameta.allure.Step;
import utilities.CommonOps;

public class APIFlows extends CommonOps {

    @Step("Business Flow : Get Team Property")
    public static String getTeamProperty(String jPath){
        response = APIActions.get("api/teams/search");
        return APIActions.extractFromJson(response, jPath);
    }

}
