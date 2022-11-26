package stepDefinitions;


import io.restassured.http.ContentType;
import io.restassured.response.Response;

import org.testng.annotations.Test;
import pojos.UserNQ;
import utilities.Authentication;
;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class Api09StepDefinitions extends Authentication {


    Response response;
  /*  @Then("US9 GET request gonderir")
    public void usGETRequestGonderir(int arg0) {

      //  response=given().headers("Authorization", "Bearer " + generateToken()).when().get("https://medunna.com/api/user?ssn=234-56-3478");

    }

    @And("US{int} status kodunun {int} oldugu gorulur")
    public void usStatusKodununOlduguGorulur(int arg0, int arg1) {
       // response.then().statusCode(200);
    }

    @And("US{int} tum hasta bilgilerini API response ile alir")
    public void usTumHastaBilgileriniAPIResponseIleAlir(int arg0) {

      //  response.prettyPrint();*/


    //  Patient patient = new Patient();

    @Test
    public void name() {
        response = given().headers("Authorization", "Bearer " + generateToken()).when().get("https://medunna.com/api/patients/55902");
        response.prettyPrint();

       /* Patient actualData = response.as(Patient.class);
        System.out.println(actualData);

        assertEquals("anonymousUser", actualData.getCreatedBy());
        assertEquals(55902, actualData.getId());
        assertEquals("Wuckert", actualData.getUser().getLastName());
        assertEquals(null, actualData.getAppointments());
        assertEquals(null, actualData.getCountry()); */
    }

    @Test
    public void name1() {
        UserNQ expectedData = new UserNQ(null, "urettinq", null, "nur", "ettin", "n@elo.com", null, null, null, null, null, null);

        response = given().headers("Authorization", "Bearer " + generateToken()).when().contentType(ContentType.JSON).body(expectedData).post("https://medunna.com/api/users");

        response.prettyPrint();
        UserNQ actualData =response.as(UserNQ.class);
        assertEquals(expectedData.getLogin(),actualData.getLogin());


    }

    @Test
    public void testName2() {
        response = given().headers("Authorization", "Bearer " + generateToken()).when().get("https://medunna.com/api/user?ssn=607-69-5698");

        response.prettyPrint();

        UserNQ actualData=response.as(UserNQ.class);

        assertEquals("nurettinq",actualData.getLogin());


    }
}
