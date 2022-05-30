package src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import src.foundation.RobotCustomLibrary;

public class FloorLibrary extends RobotCustomLibrary {

    private static final By numberFloorTf = By.id("j_idt74:number");
    private static final By squareFloorTf = By.id("j_idt74:square");
    private static final By messageOfErrorSquare = By.xpath("/html/body/div/div[3]/form/div/div[2]/table/tbody/tr[3]/td/span");
    private static final By messageOfErrorNumber = By.xpath("//*[@id=\"table_data\"]/table/tbody/tr[2]/td/span");

    public FloorLibrary(WebDriver driver) {
        this.driver = driver;
        elementCheckbox = By.xpath("//*[@id=\"j_idt76:tabView:j_idt113_data\"]/tr/td[1]/input");
        elementLink = By.xpath("//*[@id=\"j_idt76:tabView:j_idt113_data\"]/tr[1]/td[1]/a");
        createButton = By.partialLinkText("Create floor");
        deleteButton = By.xpath("//*[@id=\"table_header\"]/table/tbody/tr/td[2]/input");
    }

    public void inputNumberTf(String number) {
        clearAndSendKeys(numberFloorTf, number);
    }

    public void inputSquareTf(String square) {
        clearAndSendKeys(squareFloorTf, square);
    }

    public void getMessageOfErrorSquare(String span) {
        checkActualSpanWithExpectedResult(span, messageOfErrorSquare);
    }

    public void getMessageOfErrorNumber(String span) {
        checkActualSpanWithExpectedResult(span, messageOfErrorNumber);
    }
}
