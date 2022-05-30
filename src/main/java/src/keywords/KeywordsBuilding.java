package src.keywords;

import com.github.markusbernhardt.selenium2library.Selenium2Library;
import org.openqa.selenium.WebDriver;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;
import src.BuildingLibrary;

import javax.script.ScriptException;

@RobotKeywords
public class KeywordsBuilding {

    private static WebDriver driver;
    private BuildingLibrary objBuildingLibrary;

    @RobotKeyword("I am at the building form")
    public void iAmAtTheBuildingForm() throws ScriptException {
        driver = Selenium2Library.getLibraryInstance().getBrowserManagement().getCurrentWebDriver();
        objBuildingLibrary = new BuildingLibrary(driver);
        maximizeBrowser();
    }

    public void maximizeBrowser() {
        driver.manage().window().maximize();
    }

    @RobotKeyword("Input name in building form")
    @ArgumentNames({"NAME"})
    public void inputNameInBuildingForm(String name) {
        objBuildingLibrary.inputNameTf(name);
    }

    @RobotKeyword("Input street name in building form")
    @ArgumentNames({"STREET"})
    public void inputStreetNameInBuildingForm(String street) {
        objBuildingLibrary.inputStreetNameTf(street);
    }

    @RobotKeyword("Select is connected in building form")
    @ArgumentNames({"CENTER"})
    public void selectIsConnectedInBuildingForm(String connected) {
        objBuildingLibrary.selectIsConnectedBuilding(connected);
    }

    @RobotKeyword("Input number in building form")
    @ArgumentNames({"NUMBER"})
    public void inputNumberInBuildingForm(String number) {
        objBuildingLibrary.inputNumberTf(number);
    }

    @RobotKeyword("Input square in building form")
    @ArgumentNames({"SQUARE"})
    public void inputSquareInBuildingForm(String square) {
        objBuildingLibrary.inputSquareTf(square);
    }
    
    @RobotKeyword("Check for error after invalid building name")
    @ArgumentNames({"ERR_NAME"})
    public void checkForErrorAfterInvalidBuildingName(String span) {
        objBuildingLibrary.getMessageOfErrorName(span);
    }

    @RobotKeyword("Check for error after invalid building connect")
    @ArgumentNames({"ERR_CONNECT"})
    public void checkForErrorAfterInvalidBuildingConnect(String span) {
        objBuildingLibrary.getMessageOfErrorIsConnectedBuilding(span);
    }

    @RobotKeyword("Check for error after invalid building square")
    @ArgumentNames({"ERR_SQUARE"})
    public void checkForErrorAfterInvalidBuildingSquare(String span) {
        objBuildingLibrary.getMessageOfErrorSquare(span);
    }

    @RobotKeyword("Check for error after invalid building number")
    @ArgumentNames({"ERR_NUMBER"})
    public void checkForErrorAfterInvalidBuildingNumber(String span) {
        objBuildingLibrary.getMessageOfErrorNumber(span);
    }

    @RobotKeyword("Save building")
    public void saveBuilding() {
        objBuildingLibrary.clickSaveButton();
    }

    @RobotKeyword("Delete building")
    public void deleteBuilding() {
        objBuildingLibrary.clickDeleteButton();
    }

    @RobotKeyword("Create building")
    public void createBuilding() {
        objBuildingLibrary.clickCreateButton();
    }


    @RobotKeyword("Edit building")
    public void editBuilding() {
        objBuildingLibrary.clickEditButton();
    }

    @RobotKeyword("Click parameters building")
    public void clickParametersBuilding() {
        objBuildingLibrary.clickParametersButton();
    }

    @RobotKeyword("Select second building")
    public void selectSecondBuilding() {
        objBuildingLibrary.clickElementCheckbox();
    }

    @RobotKeyword("Click second building")
    public void clickSecondBuilding() {
        objBuildingLibrary.clickElementLink();
    }
}
