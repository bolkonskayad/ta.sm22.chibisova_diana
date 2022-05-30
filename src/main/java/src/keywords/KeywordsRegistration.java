package src.keywords;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;
import org.testng.Assert;
import src.RegistrationLibrary;

@RobotKeywords
public class KeywordsRegistration {

    private WebDriver driver;
    private RegistrationLibrary objRegistrationLibrary;

    @RobotKeyword("Set Up")
    public void setUp() {
        driver = new ChromeDriver();
        objRegistrationLibrary = new RegistrationLibrary(driver);
    }

    @RobotKeyword("I am at the registration form")
    @ArgumentNames({"URL"})
    public void iAmAtTheRegistrationForm(String url) {
        driver.get(url);
        Assert.assertTrue(driver.getCurrentUrl().contains(url));
        maximizeBrowser();
    }

    public void maximizeBrowser() {
        driver.manage().window().maximize();
    }

    @RobotKeyword("Input username in registration form")
    @ArgumentNames({"USERNAME"})
    public void inputUsernameInRegistrationForm(String username) {
        objRegistrationLibrary.inputUsernameInRegistrationTf(username);
    }

    @RobotKeyword("Input non uniq username in registration form")
    @ArgumentNames({"USERNAME"})
    public void inputNonUniqUsernameInRegistrationForm(String username) {
        objRegistrationLibrary.inputNonUniqUsernameInRegistrationTf(username);
    }

    @RobotKeyword("Input password in registration form")
    @ArgumentNames({"PASSWORD"})
    public void inputPasswordInRegistrationForm(String password) {
        objRegistrationLibrary.inputPasswordInRegistrationTf(password);
    }

    @RobotKeyword("Input confirm in registration form")
    @ArgumentNames({"CONFIRM_PASSWORD"})
    public void inputConfirmInRegistrationForm(String confirm) {
        objRegistrationLibrary.inputConfirmPasswordInRegistrationTf(confirm);
    }

    @RobotKeyword("Input email in registration form")
    @ArgumentNames({"EMAIL"})
    public void inputEmailInRegistrationForm(String email) {
        objRegistrationLibrary.inputEmailInRegistrationTf(email);
    }

    @RobotKeyword("Select role in registration form")
    @ArgumentNames({"ROLE"})
    public void selectRoleInRegistrationForm(String role) {
        objRegistrationLibrary.selectRoleInRegistrationCB(role);
    }

    @RobotKeyword("Check for message of success registration")
    @ArgumentNames({"SUCCESS"})
    public void checkForMessageOfSuccessRegistration(String message) {
        objRegistrationLibrary.getMessageOfSuccessRegistration(message);
    }

    @RobotKeyword("Check for error after invalid username")
    @ArgumentNames({"ERR_USERNAME"})
    public void checkForErrorAfterInvalidUsername(String span) {
        objRegistrationLibrary.getUsernameSpan(span);
    }

    @RobotKeyword("Check for error after invalid password")
    @ArgumentNames({"ERR_PASSWORD"})
    public void checkForErrorAfterInvalidPassword(String span) {
        objRegistrationLibrary.getPasswordSpan(span);
    }

    @RobotKeyword("Check for error after invalid email")
    @ArgumentNames({"ERR_EMAIL"})
    public void checkForErrorAfterInvalidEmail(String span) {
        objRegistrationLibrary.getEmailSpan(span);
    }

    @RobotKeyword("Click register button")
    public void clickRegisterButton() {
        objRegistrationLibrary.clickRegisterButton();
    }

    @RobotKeyword("Tear Down")
    public void tearDown() {
        driver.quit();
    }

}