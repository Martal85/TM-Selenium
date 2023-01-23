package transfermate_tests;
import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.RegistrationVerificationPage;
import utils.FakerUtils;


public class LoginPageTests extends BaseTest {
    FakerUtils fakerUtils = new FakerUtils();
    String firstName = fakerUtils.getFirstName();
    String lastName = fakerUtils.getLastName();
    String userEmail = fakerUtils.getUserEmail();
    String userEmail2 = fakerUtils.getUserEmail2();
    String phoneNumber = fakerUtils.getPhoneNumber();
    String country = "Bulgaria";
    String countryCode = "Bulgaria +359";

    @Test
    public void fillAllFieldsAndCreateAccount() {
        LoginPage loginPage = new LoginPage(startNewDriver());

        loginPage.checkEducationAccounttypeCheckBox();
        loginPage.enterFirstName(firstName);
        loginPage.enterLastName(lastName);
        loginPage.enterUserEmail(userEmail);
        loginPage.enterMobilePhone(phoneNumber);
        loginPage.checkTermsAgree();
        loginPage.checkNewsletterAgree();
        //loginPage.enterCaptchaText("3");

        Assert.assertTrue(loginPage.getCountrytext().contains(country));
        Assert.assertTrue(loginPage.getFirstNameText().contains(firstName));
        Assert.assertTrue(loginPage.getLastNameText().contains(lastName));
        Assert.assertTrue(loginPage.getEmailText().contains(userEmail));
        Assert.assertTrue(loginPage.getMobilePhoneCodeText().contains(countryCode));
        Assert.assertTrue(loginPage.getMobilePhoneText().contains(phoneNumber));

        loginPage.clickSubmitButton();

        RegistrationVerificationPage registrationVerificationPage = loginPage.goToRegistrationVerificationPage();
        Assert.assertTrue(registrationVerificationPage.getCheckEmailtext().contains("Check your mail"));

    }

}
