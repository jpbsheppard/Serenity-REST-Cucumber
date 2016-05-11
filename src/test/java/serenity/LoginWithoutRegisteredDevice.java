package serenity;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import serenity.sceneriosteps.ScenarioStepDefinitions;

/**
 * hpe on 06/05/2016.
 */
@RunWith(SerenityRunner.class)
public class LoginWithoutRegisteredDevice {

    @Managed(driver = "Firefox")
    WebDriver driver;

    @Steps
    ScenarioStepDefinitions user;

    @Test()
    @Title("User logs in successfully without a registered device with a risk recommendation of Allow -(#HPLBS-9)")
    public void userLogsInSuccessfullyWithoutARegisteredDeviceRiskAllow(){

        String userName = "blair";

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

        //AssertSuccess
        user.isGluuPageOpen();
    }

    @Test()
    @Title("User logs in successfully without a registered device with a risk recommendation of Review -(#HPLBS-9)")
    public void userLogsInSuccessfullyWithoutARegisteredDeviceRiskReview(){

        String userName = "cameron";

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

        //AssertSuccess
        user.isGluuPageOpen();
    }
}
