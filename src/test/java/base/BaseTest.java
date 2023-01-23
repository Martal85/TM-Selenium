package base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import manager.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import utils.ConfigFileReader;

public class BaseTest {
    public Map<String, List<WebDriver>> webDriverMap;
    private final ConfigFileReader configFileReader = new ConfigFileReader();

    public BaseTest() {
        webDriverMap = new HashMap<>();
    }


    public WebDriver startNewDriver() {
        ITestNGMethod method = Reporter.getCurrentTestResult().getMethod();
        String key = method.getId();

        WebDriver driver = DriverManager.createWebDriver();
        driver.manage().window().maximize();
        driver.get(configFileReader.getApplicationUrl());

        if (webDriverMap.containsKey(key)) {
            webDriverMap.get(key).add(driver);
        } else {
            List<WebDriver> drivers = new ArrayList<>();
            drivers.add(driver);
            webDriverMap.put(key, drivers);
        }
        return driver;
    }

    @AfterMethod
    public void tearDown(ITestResult testResult) {
        String key = testResult.getMethod().getId();
        webDriverMap.get(key).forEach(WebDriver::quit);
        webDriverMap.remove(key);
    }


}
