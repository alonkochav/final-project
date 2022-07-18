package workflows;

import extensions.APIActions;
import utilities.CommonOps;

public class APIFlows extends CommonOps {

    public static String getTeamProperty(String jPath){
        response = APIActions.get("api/teams/search");
        return APIActions.extractFromJson(response, jPath);
    }

}
