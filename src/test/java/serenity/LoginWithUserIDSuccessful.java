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
 * hpe on 11/05/2016.
 */
@RunWith(SerenityRunner.class)
public class LoginWithUserIDSuccessful {

    @Managed(driver = "Firefox")
    WebDriver driver;

    @Steps
    ScenarioStepDefinitions user;

    @Test()
    @Title("User login with userID is successful -(#HPLBS-9)")
    public void loginWithUserIDSuccessful(){

        String userName = "007";

        //Given
        user.enterUsername(userName);
        user.clickLoginButton();

        //When
        user.enterSurname("bond");
        user.enterDOB("1900/01/01");
        user.enterDetailValidationAnswer1();
        user.enterDetailValidationAnswer2();
        user.enterDetailValidationAnswer3();
        user.clickOnTheSubmitButtonForDetailValidation();

        //Then
        user.isGluuPageOpen();
    }
}
