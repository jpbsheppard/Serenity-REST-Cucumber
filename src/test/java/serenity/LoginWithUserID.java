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
public class LoginWithUserID {

    @Managed(driver = "PhantomJS")
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

    @Test()
    @Title("User login with userID is Unsuccessful -(#HPLBS-9)")
    public void loginWithUserIDUnsuccessful(){

        String userName = "006";

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
        user.assertErrorMessage("detailValidation", "The details provided do not match with our records. Please try again.");
    }
}
