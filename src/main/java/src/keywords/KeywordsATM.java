package src.keywords;

import com.github.markusbernhardt.selenium2library.Selenium2Library;
import org.openqa.selenium.WebDriver;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;
import src.ATMLibrary;

import javax.script.ScriptException;

@RobotKeywords
public class KeywordsATM {

    private static WebDriver driver;
    private ATMLibrary objATMLibrary;

    @RobotKeyword("I am at the ATM form")
    public void iAmAtTheATMForm() throws ScriptException {
        driver = Selenium2Library.getLibraryInstance().getBrowserManagement().getCurrentWebDriver();
        objATMLibrary = new ATMLibrary(driver);
        objATMLibrary.findATM();
        maximizeBrowser();
    }
    public void maximizeBrowser() {
        driver.manage().window().maximize();
    }

    @RobotKeyword("Input name in ATM form")
    @ArgumentNames({"NAME"})
    public void inputNameInATMForm(String name) {
        objATMLibrary.inputNameTf(name);
    }

    @RobotKeyword("Input extra security in ATM form")
    @ArgumentNames({"SECURITY"})
    public void inputExtraSecurityInATMForm(String security) {
        objATMLibrary.inputExtraSecurityTf(security);
    }

    @RobotKeyword("Input connection type in ATM form")
    @ArgumentNames({"CONNECTION"})
    public void inputConnectionTypeInATMForm(String connection) {
        objATMLibrary.inputConnectionTypeTf(connection);
    }

    @RobotKeyword("Select location in ATM form")
    public void selectLocationInATMForm() {
        objATMLibrary.selectLocatedIn();
        String winHandleBefore = driver.getWindowHandle();

        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
        objATMLibrary.selectLocatedInNewWindow();
        driver.switchTo().window(winHandleBefore);
    }

    @RobotKeyword("Select physical status in ATM form")
    @ArgumentNames({"STATUS"})
    public void selectPhysicalStatusInATMForm(String status) {
        objATMLibrary.selectPhysicalStatus(status);
    }

    @RobotKeyword("Check for error after invalid ATM location")
    @ArgumentNames({"ERR_LOCATION"})
    public void checkForErrorAfterInvalidATMLocation(String span) {
        objATMLibrary.getMessageOfErrorLocation(span);
    }

    @RobotKeyword("Check for error after invalid ATM name")
    @ArgumentNames({"ERR_NAME"})
    public void checkForErrorAfterInvalidATMName(String span) {
        objATMLibrary.getMessageOfErrorName(span);
    }

    @RobotKeyword("Save ATM")
    public void saveATM() {
        objATMLibrary.clickSaveButton();
    }

    @RobotKeyword("Delete ATM")
    public void deleteATM() {
        objATMLibrary.clickDeleteButton();
    }

    @RobotKeyword("Create ATM")
    public void createATM() {
        objATMLibrary.clickCreateButton();
    }


    @RobotKeyword("Edit ATM")
    public void editATM() {
        objATMLibrary.clickEditButton();
    }

    @RobotKeyword("Click parameters ATM")
    public void clickParametersATM() {
        objATMLibrary.clickParametersButton();
    }

    @RobotKeyword("Select second ATM")
    public void selectSecondATM() {
        objATMLibrary.clickElementCheckbox();
    }

    @RobotKeyword("Click second ATM")
    public void clickSecondATM() {
        objATMLibrary.clickElementLink();
    }
}
