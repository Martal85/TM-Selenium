package pages;

import component.Checkbox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ISelect;

public class LoginPage extends BasePage{
    WebDriver driver;

    By radioButtonType = By.id("register_account_type_education_form_input");
    By coutryDropdownMenu = By.name("country");
    By firstNameField = By.name("first_name");
    By lastNameField = By.name("last_name");
    By emailField = By.name("email");
    By mobilePhoneCodeField = By.name("__pin_mobile_number_international_dialing_code");
    By mobilePhoneField = By.name("__pin_mobile_number_mobile_phone");
    By termsOfUserAgree = By.cssSelector("#register_terms_of_use_agree_form_input > .check-radio-label");
    By newsletterAndPrivacyPolicyAgreeField = By.cssSelector(".check-radio-label:nth-child(2)");
    By captchaText = By.name("__calc_captcha_text");
    By submitButton = By.id("button_subscribe");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void checkEducationAccounttypeCheckBox() {
        Checkbox.check(radioButtonType, driver);
    }

    public void enterFirstName(String name) {
        enterText(firstNameField, name, driver);
    }

    public void enterLastName(String name) {
        enterText(lastNameField, name, driver);
    }

    public void enterUserEmail(String email) {
        enterText(emailField, email, driver);
    }

    public void enterMobilePhone(String phoneNumber) {
        enterText(mobilePhoneField, phoneNumber, driver);
    }

    public void checkTermsAgree() { submit(termsOfUserAgree, driver);}

    public void checkNewsletterAgree() { submit(newsletterAndPrivacyPolicyAgreeField, driver); }

    public void enterCaptchaText(String nubmer) {
        enterText(captchaText, nubmer, driver);
    }

    public void clickSubmitButton() { submit(submitButton, driver); }

    public String getCountrytext() {
        return getText(coutryDropdownMenu, driver);
    }

    public String getFirstNameText() { return getValue(firstNameField, driver);}

    public String getLastNameText() { return getValue(lastNameField, driver);}

    public String getEmailText() { return getValue(emailField, driver);}

    public String getMobilePhoneCodeText() { return getText(mobilePhoneCodeField, driver);}

    public String getMobilePhoneText() { return getValue(mobilePhoneField, driver);}

    public RegistrationVerificationPage goToRegistrationVerificationPage() {
        return new RegistrationVerificationPage(driver);
    }

}
