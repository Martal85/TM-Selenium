package component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checkbox {

    public static void check(By by, WebDriver driver) {
        WebElement option = driver.findElement(by);
        if (!option.isSelected()) {
            option.click();
        }
        //TODO: log message that the checkbox is already checked
    }

    public static void uncheck(By by, WebDriver driver) {
        WebElement option = driver.findElement(by);
        if (option.isSelected()) {
            option.click();
        }
        //TODO: log message that the checkbox is already unchecked
    }

}
