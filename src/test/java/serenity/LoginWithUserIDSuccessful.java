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
 * hpe on 11/05/2016.
 */
@RunWith(SerenityRunner.class)
public class LoginWithUserIDSuccessful {

    @Managed(driver = "Firefox")
    WebDriver driver;

    @Steps
    loginPageScenarioSteps user;

    @Test()
    @Title("User login denied without a registered device and a risk recommendation of Deny -(#HPLBS-9)")
    public void userLoginDeniedWithRiskDeny(){

        String userName = "007";

        //login
        user.enterUsername(userName);
        user.clickLoginButton();

        //detailValidation page
        user.enterSurname("bond");
        user.enterDOB("01/01/1900");
        user.enterDetailValidationAnswer1();
        user.enterDetailValidationAnswer2();
        user.enterDetailValidationAnswer3();
        user.clickOnTheSubmitButtonForDetailValidation();

        //gluu page should appear
        user.isGluuPageOpen();

    }
}
