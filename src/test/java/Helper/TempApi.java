package Helper;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TempApi {

    RequestSpecification httpRequest;
    Response response;
    private final String url = "http://localhost:3000/";

        public void prettyPrint(Response response){
            response.prettyPrint();
        }

        @Test
        public void startSession() {
        RestAssured.baseURI = url;
        httpRequest = RestAssured.given().auth().preemptive().basic("admin","admin");

        // Get Request
        response = httpRequest.get("api/teams/search?perpage=50&page=1");

        // Post + Put Request
            JSONObject params = new JSONObject();

            response = httpRequest.get("api/teams/search?perpage=50&page=1");

            params.put("name","Ateam");
            params.put("email","Ateam@gmail.com");

            httpRequest.header("Content-Type","application/json");
//            httpRequest.body("{'name':'Ateam','email':'Ateam@gmail.com'}");

            httpRequest.body(params.toJSONString());
            response = httpRequest.post("/api/teams");

//            response = httpRequest.put("/api/teams/3")
//            response = httpRequest.delete("/api/teams/3")


            prettyPrint(response);
        }
}
