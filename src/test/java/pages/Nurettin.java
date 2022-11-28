package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Nurettin {
    public Nurettin() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//*[@class='svg-inline--fa fa-user fa-w-14 ']")
    public WebElement userIkon;

    @FindBy(xpath = "//*[text()='Register']")
    public WebElement register;

    @FindBy(xpath = "//*[@name='ssn']")
    public WebElement ssnBox;
    @FindBy(xpath = "//*[@class='is-touched is-dirty av-valid form-control' and @name='ssn']")
    public WebElement validSSN;
    @FindBy(xpath = "//*[@class='is-touched is-dirty av-valid form-control' and @name='firstName']")
    public WebElement validFirstName;
    @FindBy(xpath = "//*[@class='is-touched is-dirty av-valid form-control' and @name='lastName']")
    public WebElement validLastName;
    @FindBy(xpath = "//*[@placeholder='Last Name']")
    public WebElement lastNameBox;
    @FindBy(xpath = "(//*[@class='invalid-feedback'])[1]")
    public WebElement yourSSSNisInvalidText;
    @FindBy(xpath = "//label[@for='ssn']")
    public WebElement forSSN;
    @FindBy(xpath = "//*[@name='firstName']")
    public WebElement firstNameBox;
    @FindBy(xpath = "//*[text()='Your FirstName is required.']")
    public WebElement yourFristNameIsRequired;
    @FindBy(xpath = "//input[@name='firstName']//following-sibling::div")
    public WebElement firstInvalidFeedback;
    @FindBy(xpath = "//input[@name='lastName']//following-sibling::div")
    public WebElement lastInvalidFeedback;
    @FindBy(xpath = "//input[@name='ssn']//following-sibling::div")
    public WebElement ssnInvalidFeedback;


}
