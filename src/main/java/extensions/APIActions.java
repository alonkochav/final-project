package extensions;

import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.Assert;
import utilities.CommonOps;

import org.apache.log4j.Logger;

import static org.testng.Assert.fail;

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
        try {
            httpRequest.header("Content-Type","application/json");
            httpRequest.body(params.toJSONString());
            response = httpRequest.post(resource);

            //        response.prettyPrint();
        } catch (Exception e){
            //            e.printStackTrace();
            Logger.getLogger("There was an error updating the email. See details + "+e.getMessage());
        }
     }

    // UPDATE   ( CR _U_ D  )
    @Step("Put (update) Data to Server")
    public static void put(JSONObject params, String resource){
        try {

        httpRequest.header("Content-Type","application/json");
        httpRequest.body(params.toJSONString());
        response = httpRequest.put(resource);
        response.prettyPrint();

    } catch (Exception e){
            Logger.getLogger("There was an error updating the email. See details + "+e.getMessage());
    } catch (AssertionError error){
            Logger.getLogger("The values of the actual vs expected do not match. See details + "+error.getMessage());
            fail("The program failed to assert that the values tested match.");
        }
    }

    // UPDATE   ( CR _U_ D  )
    @Step("Put (update) Data to Server")
    public static void patch(JSONObject params, String resource){
        httpRequest.header("Content-Type","application/json");
        httpRequest.body(params.toJSONString());
//        response = httpRequest.patch(resource);      PATCH doesn't work on grafana api so - update with put instead
        response = httpRequest.put(resource);
        response.prettyPrint();
    }

    // DELETE   ( CRU _D_  )
    @Step("Delete Data to Server")
    public static void delete(String resource){
        response = httpRequest.delete(resource);
        response.prettyPrint();
    }
}
