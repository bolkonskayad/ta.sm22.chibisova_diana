package src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import src.foundation.RobotCustomLibrary;

public class PostTerminalLibrary extends RobotCustomLibrary {
    private static final By locatedInSelect = By.xpath("/html/body/form/div/div[2]/div/ul/li[1]/span/span[3]/a");
    private static final By locatedInOk = By.xpath("/html/body/form/div/div[2]/button[1]");
    private static final By postTerminalButton = By.xpath("//*[@id=\"j_idt76:tabView\"]/ul/li[6]/a");
    private static final By namePostTerminalTf = By.xpath("//*[@id=\"j_idt74:name\"]");
    private static final By widthPostTerminalTf = By.xpath("//*[@id=\"j_idt74:width\"]");
    private static final By lengthPostTerminalTf = By.xpath("//*[@id=\"j_idt74:length\"]");
    private static final By heightPostTerminalTf = By.xpath("//*[@id=\"j_idt74:height\"]");
    private static final By physicalStatusPostTerminalSelect = By.xpath("//*[@id=\"j_idt74:physicalStatus\"]");
    private static final By locatedInPostTerminal = By.xpath("/html/body/div/div[3]/form/div/div[2]/table/tbody/tr[6]/td/a[1]");
    private static final By messageOfErrorName = By.xpath("//*[@id=\"table_data\"]/table/tbody/tr[1]/td/span");
    private static final By messageOfErrorLocatedIn = By.xpath("//*[@id=\"table_data\"]/table/tbody/tr[6]/td/span");
    private static final By messageOfErrorWidth = By.xpath("//*[@id=\"table_data\"]/table/tbody/tr[2]/td/span");
    private static final By messageOfErrorLength = By.xpath("//*[@id=\"table_data\"]/table/tbody/tr[3]/td/span");
    private static final By messageOfErrorHeight = By.xpath("//*[@id=\"table_data\"]/table/tbody/tr[4]/td/span");
    private static final By messageOfErrorPhysicalStatus = By.xpath("//*[@id=\"table_data\"]/table/tbody/tr[5]/td/span");

    public PostTerminalLibrary(WebDriver driver) {
        this.driver = driver;
        elementCheckbox = By.xpath("//*[@id=\"j_idt76:tabView:j_idt173_data\"]/tr[2]/td[1]/input");
        elementLink = By.xpath("//*[@id=\"j_idt76:tabView:j_idt173_data\"]/tr[1]/td[1]/a");
        createButton = By.partialLinkText("Create Post Terminal");
        deleteButton = By.name("j_idt76:tabView:j_idt171");
    }

    public void findPostTerminal() {
        driver.findElement(postTerminalButton).click();
    }

    public void inputNameTf(String name) {
        clearAndSendKeys(namePostTerminalTf, name);
    }

    public void inputWidthTf(String width) {
        clearAndSendKeys(widthPostTerminalTf, width);
    }

    public void inputLengthTf(String length) {
        clearAndSendKeys(lengthPostTerminalTf, length);
    }

    public void inputHeightTf(String height) {
        clearAndSendKeys(heightPostTerminalTf, height);
    }

    public void selectLocatedIn() {
        driver.findElement(locatedInPostTerminal).click();
    }

    public void selectLocatedInNewWindow() {
        waitWhenElementIsClickable(locatedInSelect, locatedInOk);
    }

    public void selectPhysicalStatus(String status) {
        (new Select(driver.findElement(physicalStatusPostTerminalSelect))).selectByValue(status);
    }

    public void getMessageOfErrorName(String span) {
        checkActualSpanWithExpectedResult(span, messageOfErrorName);
    }

    public void getMessageOfErrorLocation(String span) {
        checkActualSpanWithExpectedResult(span, messageOfErrorLocatedIn);
    }

    public void getMessageOfErrorWidth(String span) {
        checkActualSpanWithExpectedResult(span, messageOfErrorWidth);
    }

    public void getMessageOfErrorLength(String span) {
        checkActualSpanWithExpectedResult(span, messageOfErrorLength);
    }

    public void getMessageOfErrorHeight(String span) {
        checkActualSpanWithExpectedResult(span, messageOfErrorHeight);
    }

    public void getMessageOfErrorPhysicalStatus(String span) {
        checkActualSpanWithExpectedResult(span, messageOfErrorPhysicalStatus);
    }
}
