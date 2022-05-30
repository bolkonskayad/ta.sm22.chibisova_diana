package src.keywords;

import com.github.markusbernhardt.selenium2library.Selenium2Library;
import org.openqa.selenium.WebDriver;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;
import src.RoomLibrary;

import javax.script.ScriptException;

@RobotKeywords
public class KeywordsRoom {
    private static WebDriver driver;
    private RoomLibrary objRoomLibrary;

    @RobotKeyword("I am at the room form")
    public void iAmAtTheRoomForm() throws ScriptException {
        driver = Selenium2Library.getLibraryInstance().getBrowserManagement().getCurrentWebDriver();
        objRoomLibrary = new RoomLibrary(driver);
        maximizeBrowser();
    }

    public void maximizeBrowser() {
        driver.manage().window().maximize();
    }

    @RobotKeyword("Input name in room form")
    @ArgumentNames({"NAME"})
    public void inputNameInRoomForm(String name) {
        objRoomLibrary.inputNameTf(name);
    }

    @RobotKeyword("Input square in room form")
    @ArgumentNames({"SQUARE"})
    public void inputSquareInRoomForm(String square) {
        objRoomLibrary.inputSquareTf(square);
    }

    @RobotKeyword("Check for error after invalid room square")
    @ArgumentNames({"ERR_SQUARE"})
    public void checkForErrorAfterInvalidRoomSquare(String span) {
        objRoomLibrary.getMessageOfErrorSquare(span);
    }

    @RobotKeyword("Check for error after invalid room name")
    @ArgumentNames({"ERR_NAME"})
    public void checkForErrorAfterInvalidRoomName(String span) {
        objRoomLibrary.getMessageOfErrorName(span);
    }


    @RobotKeyword("Save room")
    public void saveRoom() {
        objRoomLibrary.clickSaveButton();
    }

    @RobotKeyword("Delete room")
    public void deleteRoom() {
        objRoomLibrary.clickDeleteButton();
    }

    @RobotKeyword("Create room")
    public void createRoom() {
        objRoomLibrary.clickCreateButton();
    }


    @RobotKeyword("Edit room")
    public void editRoom() {
        objRoomLibrary.clickEditButton();
    }

    @RobotKeyword("Click parameters room")
    public void clickParametersRoom() {
        objRoomLibrary.clickParametersButton();
    }

    @RobotKeyword("Select second room")
    public void selectSecondRoom() {
        objRoomLibrary.clickElementCheckbox();
    }

    @RobotKeyword("Click second room")
    public void clickSecondRoom() {
        objRoomLibrary.clickElementLink();
    }
}
