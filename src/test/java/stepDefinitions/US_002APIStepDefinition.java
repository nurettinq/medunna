package stepDefinitions;

import API.baseUrl.MedunnaBaseUrl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Test;


import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static utilities.Authentication.generateToken;

public class US_002APIStepDefinition extends MedunnaBaseUrl {
  Response response;
  //"https://medunna.com/api/user?ssn=234-56-3478"


  @Test
  public void name() {
    response=given().headers("Authorization", "Bearer " + generateToken()).when().get("https://medunna.com/api/user?ssn=234-56-3478");
response.prettyPrint();
  }

  @Given("YE User Medunna")
    public void yeUserMedunna() {
    //  spec.pathParam("first","user").queryParams("firstname","ssn","lastname","234-56-3478");
      response=given().headers("Authorization", "Bearer " + generateToken()).when().get("https://medunna.com/api/user?ssn=234-56-3478");
      //response=given().spec(spec).headers("Authorization", "Bearer " + generateToken()).when().get("/{first}");
    }

    @When("YE User send Get request")
    public void yeUserSendGetRequest() {
      response.prettyPrint();

    }

    @Then("YE Status code is {int}")
    public void yeStatusCodeIs(int statusCode) {
      response.then().assertThat().statusCode(statusCode);

    }

    @And("YE Verifies that valid username is also api")
    public void yeVerifiesThatValidUsernameIsAlsoApi() {
      response.then().assertThat().body("login",equalTo("ylz"));
    }

    @And("YE Verifies that valid email is also api")
    public void yeVerifiesThatValidEmailIsAlsoApi() {
      response.then().assertThat().body("email",equalTo("ylz1234@gmail.com"));

    }  @And("YE Kullanici gecersiz  {string} Girer")
  public void yeKullaniciGecersizGirer(String email) {
      //page.eMail.sendKeys(email);
  }
/*
{
    "id": 327883,
    "login": "ylz",
    "firstName": "Ylz",
    "lastName": "Ylz",
    "ssn": "234-56-3478",
    "email": "ylz1234@gmail.com",
    "imageUrl": null,
    "activated": false,
    "langKey": null,
    "createdBy": null,
    "createdDate": null,
    "lastModifiedBy": null,
    "lastModifiedDate": null,
    "authorities": null
}
 */
}
