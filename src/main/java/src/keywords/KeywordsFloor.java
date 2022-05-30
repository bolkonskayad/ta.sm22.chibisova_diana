package src.keywords;

import com.github.markusbernhardt.selenium2library.Selenium2Library;
import org.openqa.selenium.WebDriver;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;
import src.FloorLibrary;

import javax.script.ScriptException;

@RobotKeywords
public class KeywordsFloor {

    private static WebDriver driver;
    private FloorLibrary objFloorLibrary;

    @RobotKeyword("I am at the floor form")
    public void iAmAtTheFloorForm() throws ScriptException {
        driver = Selenium2Library.getLibraryInstance().getBrowserManagement().getCurrentWebDriver();
        objFloorLibrary = new FloorLibrary(driver);
        maximizeBrowser();
    }

    public void maximizeBrowser() {
        driver.manage().window().maximize();
    }

    @RobotKeyword("Input number in floor form")
    @ArgumentNames({"NUMBER"})
    public void inputNumberInFloorForm(String number) {
        objFloorLibrary.inputNumberTf(number);
    }

    @RobotKeyword("Input square in floor form")
    @ArgumentNames({"SQUARE"})
    public void inputSquareInFloorForm(String square) {
        objFloorLibrary.inputSquareTf(square);
    }


    @RobotKeyword("Check for error after invalid floor square")
    @ArgumentNames({"ERR_SQUARE"})
    public void checkForErrorAfterInvalidFloorSquare(String span) {
        objFloorLibrary.getMessageOfErrorSquare(span);
    }

    @RobotKeyword("Check for error after invalid floor number")
    @ArgumentNames({"ERR_NUMBER"})
    public void checkForErrorAfterInvalidFloorNumber(String span) {
        objFloorLibrary.getMessageOfErrorNumber(span);
    }


    @RobotKeyword("Save floor")
    public void saveFloor() {
        objFloorLibrary.clickSaveButton();
    }

    @RobotKeyword("Delete floor")
    public void deleteFloor() {
        objFloorLibrary.clickDeleteButton();
    }

    @RobotKeyword("Create floor")
    public void createFloor() {
        objFloorLibrary.clickCreateButton();
    }


    @RobotKeyword("Edit floor")
    public void editFloor() {
        objFloorLibrary.clickEditButton();
    }

    @RobotKeyword("Click parameters floor")
    public void clickParametersFloor() {
        objFloorLibrary.clickParametersButton();
    }

    @RobotKeyword("Select second floor")
    public void selectSecondFloor() {
        objFloorLibrary.clickElementCheckbox();
    }

    @RobotKeyword("Click second floor")
    public void clickSecondFloor() {
        objFloorLibrary.clickElementLink();
    }
}
