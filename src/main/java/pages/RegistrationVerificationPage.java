package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationVerificationPage extends BasePage{
    WebDriver driver;

    By checkEmailtext = By.id("pages_content_252");

    public RegistrationVerificationPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isYourEmailTextDisplayed() {return driver.findElement(checkEmailtext).isDisplayed();}

    public String getCheckEmailtext() { return getText(checkEmailtext, driver);}

}
