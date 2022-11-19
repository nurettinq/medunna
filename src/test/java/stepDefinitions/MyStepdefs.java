package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.MedunnaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

import static org.junit.Assert.*;

public class MyStepdefs {
    static MedunnaPage medunnaPage=new MedunnaPage();
    static Actions actions=new Actions(Driver.getDriver());
    @Given("Belirtilen Url ye gidilir.")
    public void belirtilenUrlYeGidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("User ikonuna tıklanır")
    public void userIkonunaTiklanir() {
        medunnaPage.userIkon.click();

    }

    @And("Register butonuna tıklanır")
    public void registerButonunaTiklanir() {
        medunnaPage.register.click();

    }

    @Then("Your SSN is invalid yazısının görünmediğini doğrular")
    public void yourSSNIsInvalidYazısınınGörünmediğiniDoğrular() {
        assertFalse(medunnaPage.yourSSSNisInvalidText.isDisplayed());
    }


    @And("SSN kutusuna ucuncu ve besinci karakterden sonra \\(-) iceren dokuz rakamlı bir SSN girilir")
    public void ssnKutusunaUcuncuVeBesinciKarakterdenSonraIcerenDokuzRakamlıBirSSNGirilir() {

    }

    @And("SSN kutusuna ucuncu ve besinci karakterden sonra \\(-) iceren dokuz rakamlı bir {string} girilir")
    public void ssnKutusunaUcuncuVeBesinciKarakterdenSonraIcerenDokuzRakamlıBirGirilir(String ssn) {

        medunnaPage.ssnBox.click();
        JSUtils.clickElementByJS(medunnaPage.ssnBox);
        actions.sendKeys(medunnaPage.ssnBox,ssn).perform();
        //JavascriptExecutor jse = (JavascriptExecutor)Driver.getDriver();
        //jse.executeScript("arguments[0].value='"+ssn+"';", medunnaPage.ssnBox);
        medunnaPage.forSSN.click();   }

    @And("Gecersiz bir {string} girilir")
    public void gecersizBirGirilir(String ssn) {
        JSUtils.clickElementByJS(medunnaPage.ssnBox);
        actions.sendKeys(medunnaPage.ssnBox,ssn).sendKeys(Keys.TAB).perform();
    }

    @Then("Your SSN is invalid yazisinin gorundugunu dogrular")
    public void yourSSNIsInvalidYazisininGorundugunuDogrular() {
        assertTrue(medunnaPage.yourSSSNisInvalidText.isDisplayed());
    }

    @And("SSN box a tiklanir ve hic birsey  girilmez")
    public void ssnBoxATiklanirVeHicBirseyGirilmez() {
        actions.click(medunnaPage.ssnBox).sendKeys(Keys.TAB).perform();
    }

    @Then("{string} yazisinin gorundugunu dogrular")
    public void yazisininGorundugunuDogrular(String text) {
        assertEquals(text,medunnaPage.yourSSSNisInvalidText.getText());
    }
}
