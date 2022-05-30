package src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import src.foundation.RobotCustomLibrary;

public class LoginLibrary extends RobotCustomLibrary {

    private static final By usernameInRegistrationTf = By.name("j_username");
    private static final By passwordInRegistrationTf = By.name("j_password");
    private static final By messageOfErrorLogin = By.xpath("//*[@id=\"content\"]/div");
    private static final By loginButton = By.xpath("//*[@id=\"content\"]/form/table/tbody/tr[3]/td[2]/input");

    public LoginLibrary(WebDriver driver) {
        this.driver = driver;
    }

    public void inputPasswordInLoginTf(String password) {
        driver.findElement(passwordInRegistrationTf).sendKeys(password);
    }

    public void inputUsernameInLoginTf(String username) {
        driver.findElement(usernameInRegistrationTf).sendKeys(username);
    }

    public void getMessageOfErrorLogin(String span) {
        checkActualSpanWithExpectedResult(span, messageOfErrorLogin);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

}
