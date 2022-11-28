package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.DatabaseUtility;

import java.util.Map;

import static org.junit.Assert.assertEquals;

public class US01DBStep extends DatabaseUtility {


    Map<String,Object> actualData;

    @Given("nq Connect to database")
    public void nqConnectToDatabase() {
        createConnection();
    }

    @When("nq According to the SSN value in the table, the user receives all information")
    public void nqAccordingToTheSSNValueInTheTableTheUserReceivesAllInformation() throws Exception {
       // String query="Select * from jhi_user where ssn='565-66-6666'";
        String query=" Select * from public.appointment";
        //System.out.println("888888888888888888888888888888888888888888888888888888888"+getRowMap(query));
      //System.out.println("list1111111111111111111111111111111111111111111111111111111"+getRowList(query));
    System.out.println("222222222222222222222222222222222222222222222222222"+getQueryResultMap(query));
        actualData=getRowMap(query);
        getRowCount();
        System.out.println("55555555555555555555555555555555555           "+getQueryResultMap(query).size());
        System.out.println("55555555555555555555555555555555555           "+getQueryResultMap(query));
    }

    @Then("nq Verify  query result")
    public void nqVerifyQueryResult() {
        assertEquals("did not match","hasta",actualData.get("first_name"));
        assertEquals("did not match","memat",actualData.get("last_name"));
        assertEquals("did not match","memat@m.gmail.com",actualData.get("email"));
        assertEquals("did not match","hastamemat",actualData.get("login"));
    }
}
