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

    //question 1 label
    @FindBy(xpath = "WebElement memorableAnswer1LabelText = driver.findElement(By.xpath(\".//*[@id='memorableQuestionsForm']/div[1]/div[2]/div[1]/table/tbody/tr[1]/td[1]/label\"));")
    public WebElement memQuestionAnswerLabel1;

    //Memorable Question2 field
    @FindBy(id = "memorableQuestionsForm:memorableQuestionAnswer2")
    public WebElement memQuestionField2;

    //question 2 label
    @FindBy(xpath = "WebElement memorableAnswer2LabelText = driver.findElement(By.xpath(\".//*[@id='memorableQuestionsForm']/div[1]/div[2]/div[1]/table/tbody/tr[2]/td[1]/label\"));")
    public WebElement memQuestionAnswerlabel2;

    //Memorable Question submit button
    @FindBy(id = "memorableQuestionsForm:loginButton")
    public WebElement memQuestionSubmitButton;

    //error message
    @FindBy(className = "errormsg")
    public WebElement errorMessage;
}
