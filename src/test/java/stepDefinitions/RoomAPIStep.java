package stepDefinitions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.Country;

import java.util.HashMap;

import static API.baseUrl.MedunnaBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;
import static utilities.Authentication.generateToken;

public class RoomAPIStep {

    Response response;
    Country country=new Country();
    @Given("user sends a post request for room")
    public void userSendsAPostRequestForRoom() {
        int id=380516;
     spec.pathParams("bir","api","iki","countries");
     country.setName("Siri Kankam");
     country.setId(id);
     response=given().headers("Authorization", "Bearer " + generateToken(),
    "Content-Type", ContentType.JSON,"Accept",ContentType.JSON).spec(spec).when().body(country).put("/{bir}/{iki}");
    }

    @And("user gets the room and validation")
    public void userGetsTheRoomAndValidation() throws JsonProcessingException {
        response.prettyPrint();
        response.then().assertThat().statusCode(200);
        //validation 1 matcher
        response.then().assertThat().body("name",equalTo(country.getName()));
        //validation 2 JsonPath
        JsonPath jsonPath=response.jsonPath();
        assertEquals(country.getName(),jsonPath.getString("name"));
        //validation 3 HashMap
        HashMap<String,Object> actualMap=response.as(HashMap.class);
        assertEquals(country.getName(),actualMap.get("name"));
        //validation 4 pojo
        Country actualPojo=response.as(Country.class);
        assertEquals(country.getName(),actualPojo.getName());
        //validation 5 objectMapper
        ObjectMapper obj=new ObjectMapper();
        Country actualObjectMapper=obj.readValue(response.asString(),Country.class);
        assertEquals(country.getName(), actualObjectMapper.getName());
        //validation 6 gson
        Gson gson=new Gson();
        Country actualGson=gson.fromJson(response.asString(),Country.class);
        assertEquals(country.getName(), actualGson.getName());
        assertEquals(country.getId(), actualGson.getId());
    }
}
