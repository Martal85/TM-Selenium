package component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButton {
    public static void select(By by, WebDriver driver) {
        WebElement option = driver.findElement(by);
        if (!option.isSelected()) {
            option.click();
        }
        //TODO: log message that the checkbox is already checked
    }

    public static void unselect(By by, WebDriver driver) {
        WebElement option = driver.findElement(by);
        if (option.isSelected()) {
            option.click();
        }
        //TODO: log message that the checkbox is already unchecked
    }
}
