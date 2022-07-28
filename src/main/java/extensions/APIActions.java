package extensions;

import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import utilities.CommonOps;

public class APIActions extends CommonOps {

    // GET   ( C _R_ UD  )

    @Step("Get Data From Server")
    public static Response get(String paramValues){
        response = httpRequest.get(paramValues);
//        response.prettyPrint();
        return response;
    }

    @Step("Extract Value From JSON Format")
    public static String extractFromJson(Response response, String path){
        jp = response.jsonPath();
        return jp.get(path).toString();
    }

}
