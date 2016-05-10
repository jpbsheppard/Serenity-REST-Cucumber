package serenity.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * hpe on 07/05/2016.
 */
public class MemorableQuestionsPage2 extends PageObject{

    private WebDriver driver;

    //locators

    //Memorable Question1 field
    @FindBy(id = "memorableQuestionsForm:memorableQuestionAnswer1")
    public WebElement memQuestionField1;

    //Memorable Question2 field
    @FindBy(id = "memorableQuestionsForm:memorableQuestionAnswer2")
    public WebElement memQuestionField2;

    //Memorable Question submit button
    @FindBy(id = "memorableQuestionsForm:loginButton")
    public WebElement memQuestionSubmitButton;

    //error message
    @FindBy(className = "errormsg")
    public WebElement errorMessage;
}
