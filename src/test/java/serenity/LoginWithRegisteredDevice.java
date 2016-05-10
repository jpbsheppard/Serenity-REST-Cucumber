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
public class LoginWithRegisteredDevice {

    @Managed(driver = "Firefox")
    WebDriver driver;

    @Steps
    loginPageScenarioSteps user;

    //Happy Path
    @Test()
    @Title("User logs in successfully with a registered device -(#HPLBS-9)")
    public void userLogsInSuccessfullyWithARegisteredDevice(){

        String userName = "churchill";

        //login
        user.enterUsername(userName);
        user.clickLoginButton();

        //password page
        user.setPasswordFormEntry1();
        user.setPasswordFormEntry2();
        user.setPasswordFormEntry3();
        user.clickSubmitButton();

        //AssertSuccess
        user.isGluuPageOpen();
    }
}
