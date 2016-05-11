package serenity.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * hpe on 11/05/2016.
 */
public class UserDetailValidationPage extends PageObject{

    private WebDriver driver;

    //Surname Entry Field
    @FindBy(id = "userDetailValidationForm:surname")
    public WebElement surnameEntryField;

    //Surname Label
    @FindBy(xpath = "//*[@id=\"userDetailValidationForm\"]/div[1]/div[2]/div[1]/table/tbody/tr[1]/td[1]/label")
    public WebElement surnameLabel;

    //DOB entry field
    @FindBy(id = "userDetailValidationForm:dob")
    public WebElement dobEntryField;

    //DOB label
    @FindBy(xpath = "//*[@id=\"userDetailValidationForm\"]/div[1]/div[2]/div[1]/table/tbody/tr[2]/td[1]")
    public WebElement dobLabel;

    //Detail Validation field 1
    @FindBy(id = "userDetailValidationForm:answer1")
    public WebElement userDetailValidationFormAnswer1;

    //Detail Validation field 2
    @FindBy(id = "userDetailValidationForm:answer2")
    public WebElement userDetailValidationFormAnswer2;

    //Detail Validation field 3
    @FindBy(id = "userDetailValidationForm:answer3")
    public WebElement userDetailValidationFormAnswer3;

    //Detail Validation label1
    @FindBy(xpath = "//*[@id=\"userDetailValidationForm\"]/div[1]/div[2]/div[2]/table/tbody/tr[1]/td[1]/label")
    public WebElement userDetailValidationFormLabel1;

    //Detail Validation label2
    @FindBy(xpath = "//*[@id=\"userDetailValidationForm\"]/div[1]/div[2]/div[2]/table/tbody/tr[2]/td[1]/label")
    public WebElement userDetailValidationFormlabel2;

    //Detail Validation label3
    @FindBy(xpath = "//*[@id=\"userDetailValidationForm\"]/div[1]/div[2]/div[2]/table/tbody/tr[3]/td[1]/label")
    public WebElement userDetailValidationFormlabel3;

    //Detail Validation form Submit Button
    @FindBy(id = "userDetailValidationForm:loginButton")
    public WebElement userDetailValidationSubmitButton;
}

