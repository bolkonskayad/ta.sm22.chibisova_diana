package src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import src.foundation.RobotCustomLibrary;

public class RegistrationLibrary extends RobotCustomLibrary {
    public static final String ROBOT_LIBRARY_SCOPE = "GLOBAL";

    private static final By usernameInRegistrationTf = By.id("registerForm:username");
    private static final By passwordInRegistrationTf = By.id("registerForm:password");
    private static final By confirmPasswordInRegistrationTf = By.id("registerForm:confirmPassword");
    private static final By emailInRegistrationTf = By.id("registerForm:email");
    private static final By roleInRegistrationCB = By.id("registerForm:role");
    private static final By hideInRegistrationCB = By.id("registerForm:hide");
    private static final By usernameInRegistrationSpan = By.xpath("//*[@id=\"registerForm\"]/table/tbody/tr[1]/td[3]/span");
    private static final By passwordInRegistrationSpan = By.cssSelector("#registerForm > table > tbody > tr:nth-child(2) > td:nth-child(3) > span");
    private static final By emailInRegistrationSpan = By.cssSelector("#registerForm > table > tbody > tr:nth-child(5) > td:nth-child(3) > span");
    private static final By messageOfSuccessRegistration = By.xpath("//div[2]//div");
    private static final By registrationButton = By.name("registerForm:j_idt26");

    public RegistrationLibrary(WebDriver driver) {
        this.driver = driver;
    }

    public void inputUsernameInRegistrationTf(String username) {
        String number = String.valueOf(0 + (int)(Math.random() * 2000));
        username = username + number;
        sendKeysAndClick(usernameInRegistrationTf, username);
    }

    public void inputNonUniqUsernameInRegistrationTf(String username) {
        sendKeysAndClick(usernameInRegistrationTf, username);
    }

    public void inputPasswordInRegistrationTf(String password) {
        sendKeysAndClick(passwordInRegistrationTf, password);
        driver.findElement(hideInRegistrationCB).click();
    }
    public void inputConfirmPasswordInRegistrationTf(String confirmPassword) {
        sendKeysAndClick(confirmPasswordInRegistrationTf, confirmPassword);
    }

    public void selectRoleInRegistrationCB(String role) {
        (new Select(driver.findElement(roleInRegistrationCB))).selectByValue(role);
    }

    public void inputEmailInRegistrationTf(String email) {
        sendKeysAndClick(emailInRegistrationTf, email);
    }

    public void clickRegisterButton() {
        driver.findElement(registrationButton).click();
    }

    public void getMessageOfSuccessRegistration(String span) {
        checkActualSpanWithExpectedResult(span, messageOfSuccessRegistration);
    }

    public void getUsernameSpan(String span) {
        checkActualSpanWithExpectedResult(span, usernameInRegistrationSpan);
    }

    public void getPasswordSpan(String span) {
        checkActualSpanWithExpectedResult(span, passwordInRegistrationSpan);
    }

    public void getEmailSpan(String span) {
        checkActualSpanWithExpectedResult(span, emailInRegistrationSpan);
    }
}
