package src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import src.foundation.RobotCustomLibrary;

public class RoomLibrary extends RobotCustomLibrary {

    private final By nameRoomTf = By.id("j_idt74:name");
    private final By squareRoomTf = By.id("j_idt74:square");
    private final By messageOfErrorSquare = By.xpath("//*[@id=\"table_data\"]/table/tbody/tr[2]/td/span");
    private final By messageOfErrorNumber = By.xpath("//*[@id=\"table_data\"]/table/tbody/tr[1]/td/span");

    public RoomLibrary(WebDriver driver) {
        this.driver = driver;
        elementCheckbox = By.xpath("//*[@id=\"j_idt76:tabView:j_idt109_data\"]/tr[2]/td[1]/input");
        elementLink = By.xpath("//*[@id=\"j_idt76:tabView:j_idt109_data\"]/tr[1]/td[1]/a");
        createButton = By.partialLinkText("Create room");
        deleteButton = By.xpath("//*[@id=\"table_header\"]/table/tbody/tr[1]/td[2]/input");
    }

    public void inputNameTf(String name) {
        clearAndSendKeys(nameRoomTf, name);
    }

    public void inputSquareTf(String square) {
        clearAndSendKeys(squareRoomTf, square);
    }

    public void getMessageOfErrorSquare(String span) {
        checkActualSpanWithExpectedResult(span, messageOfErrorSquare);
    }

    public void getMessageOfErrorName(String span) {
        checkActualSpanWithExpectedResult(span, messageOfErrorNumber);
    }

}
