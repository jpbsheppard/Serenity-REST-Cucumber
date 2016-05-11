package serenity.sceneriosteps;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import serenity.pageobjects.*;

/**
 * hpe on 08/05/2016.
 */
public class loginPageScenarioSteps extends ScenarioSteps {

    LoginPage login;
    PasswordPage pp;
    MemorableQuestionsPage1 mqp1;
    MemorableQuestionsPage2 mqp2;
    GluuPage gluu;
    UserDetailValidationPage udvp;

    @Managed(driver = "Firefox")
    WebDriver driver;

    //login page
    @Step("When the user has clicked the login button")
    public void clickLoginButton(){
        login.loginButton.click();
    }

    @Step("Given the user has entered {0} as the username")
    public void enterUsername(String username){
        login.usernameField.clear();
        login.usernameField.sendKeys(username);
    }

    //password page
    @Step("Given that the password page has opened")
    public void waitForPasswordPage(){
        WebDriverWait waitForPasswordCharField = new WebDriverWait(driver, 2);
        waitForPasswordCharField.until(ExpectedConditions.elementToBeClickable(pp.passwordFormEntry1));
    }

    @Step("Given that the user has entered the first password character")
    public void setPasswordFormEntry1(){
        String C1 = pp.passwordPageLabel1.getText();
        pp.passwordFormEntry1.clear();
        pp.passwordFormEntry1.sendKeys(C1);
    }

    @Step("Given that the user has entered the second password character")
    public void setPasswordFormEntry2() {
        String C2 = pp.passwordPageLabel2.getText();
        pp.passwordFormEntry2.clear();
        pp.passwordFormEntry2.sendKeys(C2);
    }

    @Step("Given that the user has entered the third password character")
    public void setPasswordFormEntry3() {
        String C3 = pp.passwordPageLabel3.getText();
        pp.passwordFormEntry3.clear();
        pp.passwordFormEntry3.sendKeys(C3);
    }

    @Step("When the user has clicked submit on the password page")
    public void clickSubmitButton(){
        pp.passwordPageSubmitButton.click();
    }

    //memorable questions page 1

    @Step("Given the user has got to the memorable questions page" )
    public void waitForMemorableQuestion1Page(){
        WebDriverWait waitForPasswordCharField2 = new WebDriverWait(driver, 2);
        waitForPasswordCharField2.until(ExpectedConditions.elementToBeClickable(mqp1.memQuestionField1));
    }

    @Step("Given the user has entered a correct memorable answer in the first box")
    public void enterMemorableAnswer1(){
        String memorableAnswer1Text = mqp1.memQuestionLabel1.getText();
        String memorableAnswer1 = memorableAnswer1Text.substring(memorableAnswer1Text.indexOf('(')+1,memorableAnswer1Text.indexOf(')'));
        mqp1.memQuestionField1.sendKeys(memorableAnswer1);
    }

    @Step("Given the user has entered a correct memorable answer in the second box")
    public void enterMemorableAnswer2(){
        String memorableAnswer2Text = mqp1.memQuestionLabel2.getText();
        String memorableAnswer2 = memorableAnswer2Text.substring(memorableAnswer2Text.indexOf('(')+1,memorableAnswer2Text.indexOf(')'));
        mqp1.memQuestionField2.sendKeys(memorableAnswer2);
    }

    @Step("Given the user has clicked submit on the memorable answers form")
    public void clickMemorableQuestionSubmitButton(){
        mqp1.memQuestionSubmitButton.click();
    }

    @Step("Then the user should see the error message")
    public boolean isErrorMsgDisplayed(){
        return mqp1.memErrorMessage.isDisplayed();
    }

    //memorable questions page 2
    @Step("Given that the second memorable questions page has loaded")
    public void waitForMemorableQuestion2Page(){
        WebDriverWait waitForPasswordCharField2 = new WebDriverWait(driver, 2);
        waitForPasswordCharField2.until(ExpectedConditions.elementToBeClickable(mqp2.memQuestionField1));
    }

    @Step("Given the user has entered a correct memorable answer in the first box for the second set of questions")
    public void enterMemorablePage2Answer1(){
        String memorableAnswer1Text = mqp2.memQuestionAnswerLabel1.getText();
        String memorableAnswer1 = memorableAnswer1Text.substring(memorableAnswer1Text.indexOf('(')+1,memorableAnswer1Text.indexOf(')'));
        mqp2.memQuestionField1.sendKeys(memorableAnswer1);
    }

    @Step("Given the user has entered a correct memorable answer in the second box for the second set of questions")
    public void enterMemorablePage2Answer2(){
        String memorableAnswer2Text = mqp2.memQuestionAnswerlabel2.getText();
        String memorableAnswer2 = memorableAnswer2Text.substring(memorableAnswer2Text.indexOf('(')+1,memorableAnswer2Text.indexOf(')'));
        mqp2.memQuestionField2.sendKeys(memorableAnswer2);
    }

    @Step("Given the user has submitted the answers on the second memorable questions page")
    public void clickMemorableQuesionPage2SubmitButton(){
        mqp2.memQuestionSubmitButton.click();
    }

    @Step("Then the user should see the {0} error message")
    public String getErrorMsg(WebElement errorMessage){
        String error = errorMessage.getText().toString();
        return error;
    }

    //gluu page

    @Step("Check if GLuu page to open")
    public boolean isGluuPageOpen(){
        //Assertion
        return gluu.heading.getText().toString().contains("Welcome to your Gluu Identity Appliance!");
    }

    @Step("Then the Gluu page to open")
    public void waitForGluuPageToLoad(){
        WebDriverWait waitUntilGluuPageLoads = new WebDriverWait(driver, 5);
        waitUntilGluuPageLoads.until(ExpectedConditions.titleIs("Gluu"));
    }

    //User Detail Validation Page
    @Step("Given the user entered a surname")
    public void enterSurname(String surname){
        udvp.surnameEntryField.sendKeys(surname);
    }

    @Step("Given the user entered a date of birth")
    public void enterDOB(String dob){
        udvp.dobEntryField.sendKeys(dob);
    }

    @Step("Given the user has entered a first password answer")
    public void enterDetailValidationAnswer1(){
        String memorableAnswerText = udvp.userDetailValidationFormLabel1.getText();
        String memorableAnswer = memorableAnswerText.substring(memorableAnswerText.indexOf('(')+1,memorableAnswerText.indexOf(')'));
        udvp.userDetailValidationFormAnswer1.sendKeys(memorableAnswer);
    }

    @Step("Given the user has entered a second password answer")
    public void enterDetailValidationAnswer2(){
        String memorableAnswerText = udvp.userDetailValidationFormlabel2.getText();
        String memorableAnswer = memorableAnswerText.substring(memorableAnswerText.indexOf('(')+1,memorableAnswerText.indexOf(')'));
        udvp.userDetailValidationFormAnswer2.sendKeys(memorableAnswer);
    }

    @Step("Given the user has entered a third password answer")
    public void enterDetailValidationAnswer3(){
        String memorableAnswerText = udvp.userDetailValidationFormlabel3.getText();
        String memorableAnswer = memorableAnswerText.substring(memorableAnswerText.indexOf('(')+1,memorableAnswerText.indexOf(')'));
        udvp.userDetailValidationFormAnswer3.sendKeys(memorableAnswer);
    }

    @Step("When the user clicks submit on the Detail Validation Page")
    public void clickOnTheSubmitButtonForDetailValidation(){udvp.userDetailValidationSubmitButton.click();}
}
