package serenity;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
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
public class passwordRetryPolicy {

    @Managed(driver = "PhantomJS")
    WebDriver driver;

    @Steps
    ScenarioStepDefinitions user;

    @Test()
    @Title("Username and password do not match Error message shown when password incorrect")
    public void usernamePasswordDoNotMatchError(){
        String userName = "Cameron";

        //Given
        user.enterUsername(userName);
        user.clickLoginButton();
        //When
        user.enterIncorrectPassword("5", "password");
        //Then
        user.assertErrorMessage("password", "The username and password do not match.");

    }

    @Test()
    @Title("Error thrown when validating users with incorrect memorable questions")
    public void memorableQuestionsErrorWhenIncorrect(){
        String userName = "Cameron";

        //Given
        user.enterUsername(userName);
        user.clickLoginButton();
        //When
        user.enterPassword();
        user.enterIncorrectPassword("5", "memorableQuestionsPage1");
        user.enterIncorrectPassword("5", "memorableQuestionsPage2");
        //Then
        user.assertErrorMessage("password", "Your answers do not match with our records. Authentication Failed.");
    }

    @Test()
    @Title("User successfully logs in after answering second set of memorable questions")
    public void successfulLoginOnSecondAttemptMemorableQuestions(){
        String userName = "Cameron";

        //Given
        user.enterUsername(userName);
        user.clickLoginButton();
        //When
        user.enterPassword();
        user.enterIncorrectPassword("5", "memorableQuestionsPage1");
        user.enterMemorablePage2Answer1();
        user.enterMemorablePage2Answer2();
        user.clickMemorableQuesionPage2SubmitButton();
        //Then
        user.isGluuPageOpen();
    }

    //Cannot unlock users so tests cannot be run currently in an automated fashion
    @Pending
    @Test()
    @Title("Registered user fails retry policy on password page results in account lock")
    public void registeredUserFailsRetryPolicyGetsAccountLocked(){
        String userName = "Cameron";

        //Given
        user.enterUsername(userName);
        user.clickLoginButton();

        //When
        for (int i=0;i<3;i++){
            user.enterIncorrectPassword("4", "password");
        }
        //Then
        user.assertErrorMessage("password", "Too many failed attempts. Your account has been locked.");
    }

    @Pending
    @Test()
    @Title("User is denied login with a locked account")
    public void userIsDeniedLoginWithALockedAccount(){
        String userName = "Cameron";

        //Given
        user.enterUsername(userName);

        //When
        user.clickLoginButton();

        //Then
        user.assertErrorMessage("loginPage", "User account is locked. Please contact customer services.");
    }

}
