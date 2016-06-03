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

    @Managed(driver = "PhantomJS")
    WebDriver driver;

    @Steps
    ScenarioStepDefinitions user;

    @Test()
    @Title("User logs in successfully without a registered device with a risk recommendation of Allow -(#HPLBS-9)")
    public void userLogsInSuccessfullyWithoutARegisteredDeviceRiskAllow(){

        String userName = "blair";

        //Given
        user.enterUsername(userName);
        user.clickLoginButton();

        //When
        user.enterPassword();
        user.enterMemorableAnswers();

        //Then
        user.isGluuPageOpen();
    }

    @Test()
    @Title("User logs in successfully without a registered device with a risk recommendation of Review -(#HPLBS-9)")
    public void userLogsInSuccessfullyWithoutARegisteredDeviceRiskReview(){

        String userName = "cameron";

        //Given
        user.enterUsername(userName);
        user.clickLoginButton();

        //When
        user.enterPassword();
        user.enterMemorableAnswers();

        //Then
        user.isGluuPageOpen();
    }
}
