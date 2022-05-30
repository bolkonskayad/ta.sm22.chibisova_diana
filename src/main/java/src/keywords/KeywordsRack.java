package src.keywords;

import com.github.markusbernhardt.selenium2library.Selenium2Library;
import org.openqa.selenium.WebDriver;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;
import src.RackLibrary;

import javax.script.ScriptException;

@RobotKeywords
public class KeywordsRack {

    private static WebDriver driver;
    private RackLibrary objRackLibrary;

    @RobotKeyword("I am at the rack form")
    public void iAmAtTheRackForm() throws ScriptException {
        driver = Selenium2Library.getLibraryInstance().getBrowserManagement().getCurrentWebDriver();
        objRackLibrary = new RackLibrary(driver);
        maximizeBrowser();
    }

    public void maximizeBrowser() {
        driver.manage().window().maximize();
    }

    @RobotKeyword("Input name in rack form")
    @ArgumentNames({"NAME"})
    public void inputNameInRackForm(String name) {
        objRackLibrary.inputNameTf(name);
    }

    @RobotKeyword("Input height in rack form")
    @ArgumentNames({"HEIGHT"})
    public void inputHeightInRackForm(String height) {
        objRackLibrary.inputHeightTf(height);
    }

    @RobotKeyword("Input length in rack form")
    @ArgumentNames({"LENGTH"})
    public void inputLengthInRackForm(String length) {
        objRackLibrary.inputLengthTf(length);
    }

    @RobotKeyword("Input width in rack form")
    @ArgumentNames({"WIDTH"})
    public void inputWidthInRackForm(String width) {
        objRackLibrary.inputWidthTf(width);
    }

    @RobotKeyword("Select physical status in rack form")
    @ArgumentNames({"STATUS"})
    public void selectPhysicalStatusInRackForm(String status) {
        objRackLibrary.selectPhysicalStatus(status);
    }

    @RobotKeyword("Check for error after invalid rack name")
    @ArgumentNames({"ERR_NAME"})
    public void checkForErrorAfterInvalidRackName(String span) {
        objRackLibrary.getMessageOfErrorName(span);
    }

    @RobotKeyword("Check for error after invalid rack length")
    @ArgumentNames({"ERR_LENGTH"})
    public void checkForErrorAfterInvalidRackLength(String span) {
        objRackLibrary.getMessageOfErrorLength(span);
    }

    @RobotKeyword("Check for error after invalid rack height")
    @ArgumentNames({"ERR_HEIGHT"})
    public void checkForErrorAfterInvalidRackHeight(String span) {
        objRackLibrary.getMessageOfErrorHeight(span);
    }

    @RobotKeyword("Check for error after invalid rack width")
    @ArgumentNames({"ERR_WIDTH"})
    public void checkForErrorAfterInvalidRackWidth(String span) {
        objRackLibrary.getMessageOfErrorWidth(span);
    }


    @RobotKeyword("Save rack")
    public void saveRack() {
        objRackLibrary.clickSaveButton();
    }

    @RobotKeyword("Delete rack")
    public void deleteRack() {
        objRackLibrary.clickDeleteButton();
    }

    @RobotKeyword("Create rack")
    public void createRack() {
        objRackLibrary.clickCreateButton();
    }


    @RobotKeyword("Edit rack")
    public void editRack() {
        objRackLibrary.clickEditButton();
    }

    @RobotKeyword("Click parameters rack")
    public void clickParametersRack() {
        objRackLibrary.clickParametersButton();
    }

    @RobotKeyword("Select second rack")
    public void selectSecondRack() {
        objRackLibrary.clickElementCheckbox();
    }

    @RobotKeyword("Click second rack")
    public void clickSecondRack() {
        objRackLibrary.clickElementLink();
    }
}
