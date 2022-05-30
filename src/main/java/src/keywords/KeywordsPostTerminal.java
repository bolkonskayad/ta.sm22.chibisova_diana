package src.keywords;


import com.github.markusbernhardt.selenium2library.Selenium2Library;
import org.openqa.selenium.WebDriver;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;
import src.PostTerminalLibrary;

import javax.script.ScriptException;

@RobotKeywords
public class KeywordsPostTerminal {

    private static WebDriver driver;
    private PostTerminalLibrary objPostTerminalLibrary;

    @RobotKeyword("I am at the Post Terminal form")
    public void iAmAtThePostTerminalForm() throws ScriptException {
        driver = Selenium2Library.getLibraryInstance().getBrowserManagement().getCurrentWebDriver();
        objPostTerminalLibrary = new PostTerminalLibrary(driver);
        objPostTerminalLibrary.findPostTerminal();
        maximizeBrowser();
    }

    public void maximizeBrowser() {
        driver.manage().window().maximize();
    }


    @RobotKeyword("Input name in Post Terminal form")
    @ArgumentNames({"NAME"})
    public void inputNameInPostTerminalForm(String name) {
        objPostTerminalLibrary.inputNameTf(name);
    }

    @RobotKeyword("Input height in Post Terminal form")
    @ArgumentNames({"HEIGHT"})
    public void inputHeightInPostTerminalForm(String security) {
        objPostTerminalLibrary.inputHeightTf(security);
    }

    @RobotKeyword("Input length in Post Terminal form")
    @ArgumentNames({"LENGTH"})
    public void inputLengthInPostTerminalForm(String protocol) {
        objPostTerminalLibrary.inputLengthTf(protocol);
    }

    @RobotKeyword("Input width in Post Terminal form")
    @ArgumentNames({"WIDTH"})
    public void inputWidthInPostTerminalForm(String protocol) {
        objPostTerminalLibrary.inputWidthTf(protocol);
    }

    @RobotKeyword("Select location in Post Terminal form")
    public void selectLocationInPostTerminalForm() {
        objPostTerminalLibrary.selectLocatedIn();
        String winHandleBefore = driver.getWindowHandle();

        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
        objPostTerminalLibrary.selectLocatedInNewWindow();
        driver.switchTo().window(winHandleBefore);
    }

    @RobotKeyword("Select physical status in Post Terminal form")
    @ArgumentNames({"STATUS"})
    public void selectPhysicalStatusInPostTerminalForm(String status) {
        objPostTerminalLibrary.selectPhysicalStatus(status);
    }

    @RobotKeyword("Check for error after invalid Post Terminal location")
    @ArgumentNames({"ERR_LOCATION"})
    public void checkForErrorAfterInvalidPostTerminalLocation(String span) {
        objPostTerminalLibrary.getMessageOfErrorLocation(span);
    }

    @RobotKeyword("Check for error after invalid Post Terminal physical status")
    @ArgumentNames({"ERR_STATUS"})
    public void checkForErrorAfterInvalidPostTerminalPhysicalStatus(String span) {
        objPostTerminalLibrary.getMessageOfErrorPhysicalStatus(span);
    }

    @RobotKeyword("Check for error after invalid Post Terminal name")
    @ArgumentNames({"ERR_NAME"})
    public void checkForErrorAfterInvalidPostTerminalName(String span) {
        objPostTerminalLibrary.getMessageOfErrorName(span);
    }

    @RobotKeyword("Check for error after invalid Post Terminal length")
    @ArgumentNames({"ERR_LENGTH"})
    public void checkForErrorAfterInvalidPostTerminalLength(String span) {
        objPostTerminalLibrary.getMessageOfErrorLength(span);
    }

    @RobotKeyword("Check for error after invalid Post Terminal height")
    @ArgumentNames({"ERR_HEIGHT"})
    public void checkForErrorAfterInvalidPostTerminalHeight(String span) {
        objPostTerminalLibrary.getMessageOfErrorHeight(span);
    }

    @RobotKeyword("Check for error after invalid Post Terminal width")
    @ArgumentNames({"ERR_WIDTH"})
    public void checkForErrorAfterInvalidPostTerminalWidth(String span) {
        objPostTerminalLibrary.getMessageOfErrorWidth(span);
    }


    @RobotKeyword("Save Post Terminal")
    public void savePostTerminal() {
        objPostTerminalLibrary.clickSaveButton();
    }

    @RobotKeyword("Delete post terminal")
    public void deletePostTerminal() {
        objPostTerminalLibrary.clickDeleteButton();
    }

    @RobotKeyword("Create Post Terminal")
    public void createPostTerminal() {
        objPostTerminalLibrary.clickCreateButton();
    }


    @RobotKeyword("Edit Post Terminal")
    public void editPostTerminal() {
        objPostTerminalLibrary.clickEditButton();
    }

    @RobotKeyword("Click parameters Post Terminal")
    public void clickParametersPostTerminal() {
        objPostTerminalLibrary.clickParametersButton();
    }

    @RobotKeyword("Select second Post Terminal")
    public void selectSecondPostTerminal() {
        objPostTerminalLibrary.clickElementCheckbox();
    }

    @RobotKeyword("Click second Post Terminal")
    public void clickSecondPostTerminal() {
        objPostTerminalLibrary.clickElementLink();
    }
}
