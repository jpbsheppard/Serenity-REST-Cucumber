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

    @Managed(driver = "Firefox")
    WebDriver driver;

    @Steps
    ScenarioStepDefinitions user;

    @Pending
    @Test()
    @Title("Registered user fails retry policy on password page results in account lock")
    public void registeredUserFailsRetryPolicyGetsAccountLocked(){
        int retryTimes = 3;
        String userName = "Cameron";

        //login

        user.enterUsername(userName);
        user.clickLoginButton();

        for (int i=0;i<=3;i++){
            user.setPasswordFormEntry1();
            user.setPasswordFormEntry2();
            user.setPasswordFormEntry3();
            user.clickSubmitButton();
            i = i +1;
        }
    }

}
