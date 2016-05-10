package serenity.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

/**
 * hpe on 07/05/2016.
 */
public class GluuPage extends PageObject{

    @FindBy(tagName = "h1")
    public
    WebElement heading;
}
