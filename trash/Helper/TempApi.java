package Helper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TempApi {

    RequestSpecification httpRequest;
    Response response;
    public final String url = "http://localhost:3000/";

        public void prettyPrint(Response response){
            response.prettyPrint();
        }

        @Test
        public void startSession() {
        RestAssured.baseURI = utilities.CommonOps.getData("urlAPI");
        httpRequest = RestAssured.given().auth().preemptive().basic("admin","admin");

        // Get Request
        response = httpRequest.get("api/teams/search");

        // Post + Put Request
//            JSONObject params = new JSONObject();
//
//            response = httpRequest.get("https://random-data-api.com/api/name/random_name");
//
//            params.put("name","Ateam");
//            params.put("email","Ateam@gmail.com");
//
//            httpRequest.header("Content-Type","application/json");
////            httpRequest.body("{'name':'Ateam','email':'Ateam@gmail.com'}");
//
//            httpRequest.body(params.toJSONString());
//            response = httpRequest.post("/api/teams");
//
////            response = httpRequest.put("/api/teams/3")
////            response = httpRequest.delete("/api/teams/3")


            prettyPrint(response);
        }
}
