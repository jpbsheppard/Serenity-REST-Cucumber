package pageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * hpe on 11/05/2016.
 */
public class UserDetailValidationPage {

    private WebDriver driver;

    //Surname Entry Field
    @FindBy(id = "userDetailValidationForm:surname")
    WebElement surnameEntryField;

    //Surname Label
    @FindBy(xpath = "//*[@id=\"userDetailValidationForm\"]/div[1]/div[2]/div[1]/table/tbody/tr[1]/td[1]/label")
    WebElement surnameLabel;

    //DOB entry field
    @FindBy(id = "userDetailValidationForm:dob")
    WebElement dobEntryField;

    //DOB label
    @FindBy(xpath = "//*[@id=\"userDetailValidationForm\"]/div[1]/div[2]/div[1]/table/tbody/tr[2]/td[1]")
    WebElement dobLabel;

    //Detail Validation field 1
    @FindBy(id = "userDetailValidationForm:answer1")
    WebElement userDetailValidationFormAnswer1;

    //Detail Validation field 2
    @FindBy(id = "userDetailValidationForm:answer2")
    WebElement userDetailValidationFormAnswer2;

    //Detail Validation field 3
    @FindBy(id = "userDetailValidationForm:answer3")
    WebElement userDetailValidationFormAnswer3;

    //Detail Validation label1
    @FindBy(xpath = "//*[@id=\"userDetailValidationForm\"]/div[1]/div[2]/div[2]/table/tbody/tr[1]/td[1]/label")
    WebElement userDetailValidationFormLabel1;

    //Detail Validation label2
    @FindBy(xpath = "//*[@id=\"userDetailValidationForm\"]/div[1]/div[2]/div[2]/table/tbody/tr[2]/td[1]/label")
    WebElement userDetailValidationFormlabel2;

    //Detail Validation label3
    @FindBy(xpath = "//*[@id=\"userDetailValidationForm\"]/div[1]/div[2]/div[2]/table/tbody/tr[3]/td[1]/label")
    WebElement userDetailValidationFormlabel3;

    //Detail Validation form Submit Button
    @FindBy(id = "userDetailValidationForm:loginButton")
    WebElement userDetailValidationSubmitButton;
}

