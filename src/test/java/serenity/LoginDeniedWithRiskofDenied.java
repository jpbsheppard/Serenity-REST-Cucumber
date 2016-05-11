package serenity;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import serenity.sceneriosteps.loginPageScenarioSteps;

/**
 * hpe on 06/05/2016.
 */
@RunWith(SerenityRunner.class)
public class LoginDeniedWithRiskofDenied {

    @Managed(driver = "Firefox")
    WebDriver driver;

    @Steps
    loginPageScenarioSteps user;

    @Test()
    @Title("User login denied without a registered device and a risk recommendation of Deny -(#HPLBS-9)")
    public void userLoginDeniedWithRiskDeny(){

        String userName = "thatcher";

        //login
        user.enterUsername(userName);
        user.clickLoginButton();

        //password page
        user.setPasswordFormEntry1();
        user.setPasswordFormEntry2();
        user.setPasswordFormEntry3();
        user.clickSubmitButton();

        //memorable questions
        user.enterMemorableAnswer1();
        user.enterMemorableAnswer2();
        user.clickMemorableQuestionSubmitButton();
        user.isErrorMsgDisplayed();
    }
}
