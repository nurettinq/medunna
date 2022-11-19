package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaPage {
    public MedunnaPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//*[@class='svg-inline--fa fa-user fa-w-14 ']")
    public WebElement userIkon;

    @FindBy(xpath = "//*[text()='Register']")
    public WebElement register;

    @FindBy(xpath = "//*[@name='ssn']")
    public WebElement ssnBox;

    @FindBy(xpath = "//*[@placeholder='First Name']")
    public WebElement firstNameBox;

    @FindBy(xpath = "//*[@placeholder='Last Name']")
    public WebElement lastNameBox;
    @FindBy(xpath = "(//*[@class='invalid-feedback'])[1]")
    public WebElement yourSSSNisInvalidText;
    @FindBy(xpath = "//label[@for='ssn']")
    public WebElement forSSN;

}
