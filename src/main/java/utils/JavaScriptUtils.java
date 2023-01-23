package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtils {
    public static void runScript(WebDriver driver, String script) {
        JavascriptExecutor js =((JavascriptExecutor) driver);
        js.executeScript(script);
    }

    public static void runScript(WebDriver driver, String script, WebElement element) {
        JavascriptExecutor js =((JavascriptExecutor) driver);
        js.executeScript(script, element);
    }

    public static void scrollToElement(WebDriver driver, WebElement element) {
        runScript(driver, "arguments[0].scrollIntoView(true);", element);
    }

    public static void clickOnElement(WebDriver driver, WebElement element) {
        runScript(driver, "arguments[0].click();", element);
    }


}
