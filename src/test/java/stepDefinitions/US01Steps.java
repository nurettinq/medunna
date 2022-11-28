package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.Nurettin;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

import static org.junit.Assert.*;

public class US01Steps {
    static Nurettin nurettin =new Nurettin();
    static Actions actions=new Actions(Driver.getDriver());

    @Given("Belirtilen Url ye gidilir.")
    public void belirtilenUrlYeGidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("User ikonuna tıklanır")
    public void userIkonunaTiklanir() {
        nurettin.userIkon.click();
    }
    @And("Register butonuna tıklanır")
    public void registerButonunaTiklanir() {
        nurettin.register.click();
        ReusableMethods.waitFor(2);
    }

    @And("SSN kutusuna ucuncu ve besinci karakterden sonra \\(-) iceren dokuz rakamlı bir {string} girilir")
    public void ssnKutusunaUcuncuVeBesinciKarakterdenSonraIcerenDokuzRakamliBirGirilir(String ssn) {
        nurettin.ssnBox.click();
        JSUtils.clickElementByJS(nurettin.ssnBox);
        actions.sendKeys(nurettin.ssnBox,ssn).perform();
        }

    @And("Gecersiz bir {string} girilir")
    public void gecersizBirGirilir(String ssn) {
        JSUtils.clickElementByJS(nurettin.ssnBox);
        actions.sendKeys(nurettin.ssnBox,ssn).sendKeys(Keys.TAB).perform();
    }

    @And("SSN box a tiklanir ve hic birsey  girilmez")
    public void ssnBoxATiklanirVeHicBirseyGirilmez() {
        actions.click(nurettin.ssnBox).sendKeys(Keys.TAB).perform();
    }

    @And("firstname boxa gecerli {string} girilir")
    public void firstnameBoxaGecerliGirilir(String text) {
        JSUtils.clickElementByJS(nurettin.firstNameBox);
        actions.sendKeys(nurettin.firstNameBox,text).sendKeys(Keys.TAB).perform();

    }
    @And("{int} saniye bekler")
    public void saniyeBekler(int bekleme) {
        ReusableMethods.waitFor(bekleme);
    }

    @Then("Your SSN is invalid yazısının gorunmedigini doğrular")
    public void yourSSNIsInvalidYazisininGorunmediginiDogrular() {
        assertTrue(nurettin.validSSN.isDisplayed());
    }

    @And("firstname boxa tiklanir ve hic birsey girilmez")
    public void firstnameBoxaTiklanirVeHicBirseyGirilmez() {
        actions.click(nurettin.firstNameBox).sendKeys(Keys.TAB).perform();
    }

    @Then("gecerli bir firstName girilebildigini dogrulanir")
    public void gecerliBirFirstNameGirilebildiginiDogrulanir() {
        assertTrue(nurettin.validFirstName.isDisplayed());
    }

    @Then("{string} yazisinin gorundugunu dogrular")
    public void yazisininGorundugunuDogrular(String text) {
        assertEquals(text, nurettin.ssnInvalidFeedback.getText());
    }

    @Then("gecerli bir lastName girilebildigini dogrulanir")
    public void gecerliBirLastNameGirilebildiginiDogrulanir() {
      assertTrue(nurettin.validLastName.isDisplayed());
    }

    @And("lastName boxa gecerli {string} girilir")
    public void lastnameBoxaGecerliGirilir(String text) {
        JSUtils.clickElementByJS(nurettin.lastNameBox);
        actions.sendKeys(nurettin.lastNameBox,text).sendKeys(Keys.TAB).perform();
    }

    @And("lastName boxa tiklanir ve hic birsey girilmez")
    public void lastnameBoxaTiklanirVeHicBirseyGirilmez() {
        actions.click(nurettin.lastNameBox).sendKeys(Keys.TAB).perform();
    }

    @Then("{string} feedback yazisinin gorundugunu dogrular")
    public void feedbackYazisininGorundugunuDogrular(String text) {
        assertEquals(text, nurettin.firstInvalidFeedback.getText());
    }

    @Then("{string} lastname feedback yazisinin gorundugunu dogrular")
    public void lastnameFeedbackYazisininGorundugunuDogrular(String text) {
        assertEquals(text, nurettin.lastInvalidFeedback.getText());
    }
}
