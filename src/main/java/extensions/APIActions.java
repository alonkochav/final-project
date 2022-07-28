package extensions;

import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import utilities.CommonOps;

public class APIActions extends CommonOps {


    @Step("Extract Value From JSON Format")
    public static String extractFromJson(Response response, String path){
        jp = response.jsonPath();
        return jp.get(path).toString();
    }

    // READ   ( C _R_ UD  )
    @Step("Get Data From Server")
    public static Response get(String paramValues){
        response = httpRequest.get(paramValues);
        return response;
    }

    // CREATE   ( _C_ RUD  )
    @Step("Post Data to Server")
    public static void post(JSONObject params, String resource){
        httpRequest.header("Content-Type","application/json");
        httpRequest.body(params.toJSONString());
        response = httpRequest.post(resource);
        System.out.println("STATUS CODE : " + response.getStatusCode());
        response.prettyPrint();
     }

    // UPDATE   ( CR _U_ D  )
    @Step("Put (update) Data to Server")
    public static void put(JSONObject params, String resource){
        httpRequest.header("Content-Type","application/json");
        httpRequest.body(params.toJSONString());
        response = httpRequest.put(resource);
        response.prettyPrint();
    }

    // UPDATE   ( CR _U_ D  )
    @Step("Put (update) Data to Server")
    public static void patch(JSONObject params, String resource){
        httpRequest.header("Content-Type","application/json");
        httpRequest.body(params.toJSONString());
        response = httpRequest.patch(resource);
        response.prettyPrint();
    }

    // DELETE   ( CRU _D_  )
    @Step("Delete Data to Server")
    public static void delete(String resource){
        response = httpRequest.delete(resource);
        response.prettyPrint();
    }

}
