package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.DatabaseUtility;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class DataBaseSteps extends DatabaseUtility {


    Map<String,Object> actualData;

    @Given("nq Connect to database")
    public void nqConnectToDatabase() {
        createConnection();
    }

    @When("nq According to the SSN value in the table, the user receives all information")
    public void nqAccordingToTheSSNValueInTheTableTheUserReceivesAllInformation() {
        String query="Select * from jhi_user where ssn='565-66-6666'";
        System.out.println(getRowMap(query));
        actualData=getRowMap(query);
    }

    @Then("nq Verify  query result")
    public void nqVerifyQueryResult() {
        assertEquals("did not match","hasta",actualData.get("first_name"));
        assertEquals("did not match","memat",actualData.get("last_name"));
        assertEquals("did not match","memat@m.gmail.com",actualData.get("email"));
        assertEquals("did not match","hastamemat",actualData.get("login"));
    }
}
