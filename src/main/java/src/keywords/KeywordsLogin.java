package src.keywords;

import com.github.markusbernhardt.selenium2library.Selenium2Library;
import org.openqa.selenium.WebDriver;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;
import src.LoginLibrary;

import javax.script.ScriptException;

@RobotKeywords
public class KeywordsLogin {

    private static WebDriver driver;
    private LoginLibrary objLoginLibrary;

    @RobotKeyword("I am at the login form")
    public void iAmAtTheLoginForm() throws ScriptException {
        driver = Selenium2Library.getLibraryInstance().getBrowserManagement().getCurrentWebDriver();
        objLoginLibrary = new LoginLibrary(driver);
        maximizeBrowser();
    }

    public void maximizeBrowser() {
        driver.manage().window().maximize();
    }

    @RobotKeyword("Input username in login form")
    @ArgumentNames({"USERNAME"})
    public void inputUsernameInLoginForm(String username) {
        objLoginLibrary.inputUsernameInLoginTf(username);
    }

    @RobotKeyword("Input password in login form")
    @ArgumentNames({"PASSWORD"})
    public void inputPasswordInLoginForm(String password) {
        objLoginLibrary.inputPasswordInLoginTf(password);
    }

    @RobotKeyword("Check for error after invalid login")
    @ArgumentNames({"ERR_LOGIN"})
    public void checkForErrorAfterInvalidLogin(String span) {
        objLoginLibrary.getMessageOfErrorLogin(span);
    }

    @RobotKeyword("Click login button")
    public void clickLoginButton() {
        objLoginLibrary.clickLoginButton();
    }


}
