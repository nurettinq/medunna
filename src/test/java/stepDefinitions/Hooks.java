package stepDefinitions;

import API.baseUrl.MedunnaBaseUrl;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.ConfigReader;
import utilities.DatabaseUtility;
import utilities.Driver;

import java.io.IOException;



public class Hooks {
//    What is hooks class in cucumber?
//    hooks has Before and After annotations.
//    hooks will run Before and After each Scenario
//    What is in your After in the hooks?
//    -In cucumber hooks I use reports and I take screenshot
//    -I designed my hooks. It takes screenshot when a test scenario fails.

    @Before(order=2, value="@UIlogin")
    public void beforeScenario() {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
    }

    @Before(order=3, value="@UIregistration")
    public void beforeRegistration() {

        Driver.getDriver().get("https://medunna.com/account/register");
    }

    @Before(order=3, value="@UIAppointment")
    public void appointment() {

        Driver.getDriver().get("https://medunna.com");
    }

    @Before(order=4, value="@apicountry")
    public void beforeApi() {

       MedunnaBaseUrl.setup();

    }


    @Before(value ="@RoomGet" )
    public void beforeRoomApi() {

        MedunnaBaseUrl.setup();

    }

    @Before(value ="@EndTOEnd" )
    public void setUpDatabaseConnection() {

       DatabaseUtility.createConnection();


    }

    @Before(order=4, value="@DBtesting" )
    public void beforeDatabase() {

        DatabaseUtility.createConnection();

    }


    @After(order=3, value="@UIregistration")
    public void tearDown(Scenario scenario) throws IOException {
        System.out.println();
//////        System.out.println("This is hooks after method");
//////        Getting the screenshot: getScreenshotAs method takes the screenshot
//        final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
////       Attaching the screenshot to the scenarios in the default-cucumber-reports.html
//
//        if (scenario.isFailed()) {
//            scenario.attach(screenshot, "image/png", "Screenshot");
//        }

    }
}
