package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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
        ReusableMethods.waitFor(2);
    }

    @And("SSN kutusuna ucuncu ve besinci karakterden sonra \\(-) iceren dokuz rakamlı bir {string} girilir")
    public void ssnKutusunaUcuncuVeBesinciKarakterdenSonraIcerenDokuzRakamliBirGirilir(String ssn) {
        medunnaPage.ssnBox.click();
        JSUtils.clickElementByJS(medunnaPage.ssnBox);
        actions.sendKeys(medunnaPage.ssnBox,ssn).perform();
        }

    @And("Gecersiz bir {string} girilir")
    public void gecersizBirGirilir(String ssn) {
        JSUtils.clickElementByJS(medunnaPage.ssnBox);
        actions.sendKeys(medunnaPage.ssnBox,ssn).sendKeys(Keys.TAB).perform();
    }

    @And("SSN box a tiklanir ve hic birsey  girilmez")
    public void ssnBoxATiklanirVeHicBirseyGirilmez() {
        actions.click(medunnaPage.ssnBox).sendKeys(Keys.TAB).perform();
    }

    @And("firstname boxa gecerli {string} girilir")
    public void firstnameBoxaGecerliGirilir(String text) {
        JSUtils.clickElementByJS(medunnaPage.firstNameBox);
        actions.sendKeys(medunnaPage.firstNameBox,text).sendKeys(Keys.TAB).perform();

    }
    @And("{int} saniye bekler")
    public void saniyeBekler(int bekleme) {
        ReusableMethods.waitFor(bekleme);
    }

    @Then("Your SSN is invalid yazısının gorunmedigini doğrular")
    public void yourSSNIsInvalidYazisininGorunmediginiDogrular() {
        assertTrue(medunnaPage.validSSN.isDisplayed());
    }

    @And("firstname boxa tiklanir ve hic birsey girilmez")
    public void firstnameBoxaTiklanirVeHicBirseyGirilmez() {
        actions.click(medunnaPage.firstNameBox).sendKeys(Keys.TAB).perform();
    }

    @Then("gecerli bir firstName girilebildigini dogrulanir")
    public void gecerliBirFirstNameGirilebildiginiDogrulanir() {
        assertTrue(medunnaPage.validFirstName.isDisplayed());
    }

    @Then("{string} yazisinin gorundugunu dogrular")
    public void yazisininGorundugunuDogrular(String text) {
        assertEquals(text,medunnaPage.ssnInvalidFeedback.getText());
    }

    @Then("gecerli bir lastName girilebildigini dogrulanir")
    public void gecerliBirLastNameGirilebildiginiDogrulanir() {
      assertTrue(medunnaPage.validLastName.isDisplayed());
    }

    @And("lastName boxa gecerli {string} girilir")
    public void lastnameBoxaGecerliGirilir(String text) {
        JSUtils.clickElementByJS(medunnaPage.lastNameBox);
        actions.sendKeys(medunnaPage.lastNameBox,text).sendKeys(Keys.TAB).perform();
    }

    @And("lastName boxa tiklanir ve hic birsey girilmez")
    public void lastnameBoxaTiklanirVeHicBirseyGirilmez() {
        actions.click(medunnaPage.lastNameBox).sendKeys(Keys.TAB).perform();
    }

    @Then("{string} feedback yazisinin gorundugunu dogrular")
    public void feedbackYazisininGorundugunuDogrular(String text) {
        assertEquals(text,medunnaPage.firstInvalidFeedback.getText());
    }

    @Then("{string} lastname feedback yazisinin gorundugunu dogrular")
    public void lastnameFeedbackYazisininGorundugunuDogrular(String text) {
        assertEquals(text,medunnaPage.lastInvalidFeedback.getText());

    }
}
