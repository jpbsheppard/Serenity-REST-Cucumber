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
public class LoginWithRegisteredDevice {

    @Managed(driver = "Firefox")
    WebDriver driver;

    @Steps
    ScenarioStepDefinitions user;

    //Happy Path
    @Test()
    @Title("User logs in successfully with a registered device -(#HPLBS-9)")
    public void userLogsInSuccessfullyWithARegisteredDevice(){

        String userName = "churchill";

        //Given
        user.enterUsername(userName);
        user.clickLoginButton();

        //When
        user.enterPassword();

        //Then
        user.isGluuPageOpen();
    }
}
