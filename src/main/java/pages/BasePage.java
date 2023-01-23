package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class BasePage {

    public void click(By by, WebDriver driver) {
        driver.findElement(by).click();
    }

    public void enterText(By by, String text, WebDriver driver) {
        driver.findElement(by).sendKeys(text);
    }

    public void submit(By by, WebDriver driver) {
        driver.findElement(by).submit();
    }

    public String getText(By by, WebDriver driver) {
        return driver.findElement(by).getText();
    }

    public String getValue(By by, WebDriver driver) {
        return driver.findElement(by).getAttribute("value");
    }

    public void clearText(By by, WebDriver driver) {
        driver.findElement(by).clear();
    }

    public void moveToElement(By by, WebDriver driver) {
        Actions actions = new Actions(driver);
        actions
                .moveToElement(driver.findElement(by))
                .build()
                .perform();
    }

    public void rightClick(By by, WebDriver driver) {
        Actions actions = new Actions(driver);
        actions
                .moveToElement(driver.findElement(by))
                .contextClick()
                .build()
                .perform();
    }

    public void switchToFrame(By by, WebDriver driver) {
        driver.switchTo().frame(driver.findElement(by));
    }


}
