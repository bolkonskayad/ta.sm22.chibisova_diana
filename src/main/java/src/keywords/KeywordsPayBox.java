package src.keywords;

import com.github.markusbernhardt.selenium2library.Selenium2Library;
import org.openqa.selenium.WebDriver;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;
import src.PayBoxLibrary;

import javax.script.ScriptException;

@RobotKeywords
public class KeywordsPayBox {

    private static WebDriver driver;
    private PayBoxLibrary objPayBoxLibrary;

    @RobotKeyword("I am at the Pay Box form")
    public void iAmAtThePayBoxForm() throws ScriptException {
        driver = Selenium2Library.getLibraryInstance().getBrowserManagement().getCurrentWebDriver();
        objPayBoxLibrary = new PayBoxLibrary(driver);
        objPayBoxLibrary.findPayBox();
        maximizeBrowser();
    }

    public void maximizeBrowser() {
        driver.manage().window().maximize();
    }

    @RobotKeyword("Input name in Pay Box form")
    @ArgumentNames({"NAME"})
    public void inputNameInPayBoxForm(String name) {
        objPayBoxLibrary.inputNameTf(name);
    }

    @RobotKeyword("Input display size in Pay Box form")
    @ArgumentNames({"DISPLAY"})
    public void inputDisplaySizeInPayBoxForm(String security) {
        objPayBoxLibrary.inputDisplaySizeTf(security);
    }

    @RobotKeyword("Input secure protocol in Pay Box form")
    @ArgumentNames({"PROTOCOL"})
    public void inputSecureProtocolInPayBoxForm(String protocol) {
        objPayBoxLibrary.inputSecureProtocolTf(protocol);
    }

    @RobotKeyword("Select location in Pay Box form")
    public void selectLocationInPayBoxForm() {
        objPayBoxLibrary.selectLocatedIn();
        String winHandleBefore = driver.getWindowHandle();

        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        objPayBoxLibrary.selectLocatedInNewWindow();
        driver.switchTo().window(winHandleBefore);
    }

    @RobotKeyword("Select physical status in Pay Box form")
    @ArgumentNames({"STATUS"})
    public void selectPhysicalStatusInPayBoxForm(String status) {
        objPayBoxLibrary.selectPhysicalStatus(status);
    }

    @RobotKeyword("Check for error after invalid Pay Box location")
    @ArgumentNames({"ERR_LOCATION"})
    public void checkForErrorAfterInvalidPayBoxLocation(String span) {
        objPayBoxLibrary.getMessageOfErrorLocation(span);
    }

    @RobotKeyword("Check for error after invalid Pay Box name")
    @ArgumentNames({"ERR_NAME"})
    public void checkForErrorAfterInvalidPayBoxName(String span) {
        objPayBoxLibrary.getMessageOfErrorName(span);
    }

    @RobotKeyword("Check for error after invalid Pay Box display size")
    @ArgumentNames({"ERR_DISPLAY"})
    public void checkForErrorAfterInvalidPayBoxDisplaySize(String span) {
        objPayBoxLibrary.getMessageOfErrorDisplay(span);
    }


    @RobotKeyword("Save Pay Box")
    public void savePayBox() {
        objPayBoxLibrary.clickSaveButton();
    }

    @RobotKeyword("Delete Pay Box")
    public void deletePayBox() {
        objPayBoxLibrary.clickDeleteButton();
    }

    @RobotKeyword("Create Pay Box")
    public void createPayBox() {
        objPayBoxLibrary.clickCreateButton();
    }


    @RobotKeyword("Edit Pay Box")
    public void editPayBox() {
        objPayBoxLibrary.clickEditButton();
    }

    @RobotKeyword("Click parameters Pay Box")
    public void clickParametersPayBox() {
        objPayBoxLibrary.clickParametersButton();
    }

    @RobotKeyword("Select second Pay Box")
    public void selectSecondPayBox() {
        objPayBoxLibrary.clickElementCheckbox();
    }

    @RobotKeyword("Click second Pay Box")
    public void clickSecondPayBox() {
        objPayBoxLibrary.clickElementLink();
    }
}
