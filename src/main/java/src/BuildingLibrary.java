package src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import src.foundation.RobotCustomLibrary;

public class BuildingLibrary extends RobotCustomLibrary {
    private static final By nameBuildingTf = By.xpath("//*[@id=\"j_idt74:name\"]");
    private static final By streetNameBuildingTf = By.xpath("//*[@id=\"j_idt74:streetName\"]");
    private static final By numberBuildingTf = By.xpath("//*[@id=\"j_idt74:number\"]");
    private static final By squareBuildingTf = By.xpath("//*[@id=\"j_idt74:square\"]");
    private static final By isConnectedBuildingSelect = By.xpath("//*[@id=\"j_idt74:isconnected\"]");
    private static final By messageOfErrorName = By.xpath("//*[@id=\"table_data\"]/table/tbody/tr[1]/td/span");
    private static final By messageOfErrorNumber = By.xpath("//*[@id=\"table_data\"]/table/tbody/tr[3]/td/span");
    private static final By messageOfErrorSquare = By.xpath("//*[@id=\"table_data\"]/table/tbody/tr[4]/td/span");
    private static final By messageOfErrorIsConnected = By.xpath("//*[@id=\"table_data\"]/table/tbody/tr[5]/td/span");

    public BuildingLibrary(WebDriver driver) {
        this.driver = driver;
        elementCheckbox = By.xpath("//*[@id=\"j_idt76:tabView:j_idt109_data\"]/tr[2]/td[1]/input");
        elementLink = By.xpath(" //*[@id=\"j_idt76:tabView:j_idt109_data\"]/tr[1]/td[1]/a");
        createButton = By.partialLinkText("Create building");
        deleteButton = By.xpath("//*[@id=\"table_header\"]/table/tbody/tr/td[2]/input");
    }

    public void inputNameTf(String name) {
        waitWhenElementIsClickable(nameBuildingTf);
        clearAndSendKeys(nameBuildingTf, name);
    }

    public void inputStreetNameTf(String streetName) {
        clearAndSendKeys(streetNameBuildingTf, streetName);
    }

    public void selectIsConnectedBuilding(String connected) {
        (new Select(driver.findElement(isConnectedBuildingSelect))).selectByValue(connected);
    }

    public void inputNumberTf(String number) {
        clearAndSendKeys(numberBuildingTf, number);
    }

    public void inputSquareTf(String square) {
        clearAndSendKeys(squareBuildingTf, square);
    }

    public void getMessageOfErrorName(String span) {
        checkActualSpanWithExpectedResult(span, messageOfErrorName);
    }

    public void getMessageOfErrorIsConnectedBuilding(String span) {
        checkActualSpanWithExpectedResult(span, messageOfErrorIsConnected);
    }

    public void getMessageOfErrorNumber(String span) {
        checkActualSpanWithExpectedResult(span, messageOfErrorNumber);
    }

    public void getMessageOfErrorSquare(String span) {
        checkActualSpanWithExpectedResult(span, messageOfErrorSquare);
    }
}