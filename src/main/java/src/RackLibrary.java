package src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import src.foundation.RobotCustomLibrary;

public class RackLibrary extends RobotCustomLibrary {
    private static final By nameRackTf = By.id("j_idt74:name");
    private static final By widthNameRackTf = By.id("j_idt74:width");
    private static final By lengthRackTf = By.id("j_idt74:length");
    private static final By heightRackTf = By.id("j_idt74:height");
    private static final By physicalStatusRackSelect = By.id("j_idt74:physicalStatus");
    private static final By messageOfErrorName = By.xpath("//*[@id=\"table_data\"]/table/tbody/tr[1]/td/span");
    private static final By messageOfErrorWidth = By.xpath("//*[@id=\"table_data\"]/table/tbody/tr[2]/td/span");
    private static final By messageOfErrorLength = By.xpath("//*[@id=\"table_data\"]/table/tbody/tr[3]/td/span");
    private static final By messageOfErrorHeight = By.xpath("//*[@id=\"table_data\"]/table/tbody/tr[4]/td/span");

    public RackLibrary(WebDriver driver) {
        this.driver = driver;
        elementCheckbox = By.xpath("//*[@id=\"j_idt76:tabView:j_idt107_data\"]/tr[2]/td[1]/input");
        elementLink = By.xpath("//*[@id=\"j_idt76:tabView:j_idt107_data\"]/tr[1]/td[1]/a");
        createButton = By.partialLinkText("Create rack");
        deleteButton = By.xpath("//*[@id=\"table_header\"]/table/tbody/tr/td[2]/input");
    }

    public void inputNameTf(String name) {
        clearAndSendKeys(nameRackTf, name);
    }

    public void inputWidthTf(String width) {
        clearAndSendKeys(widthNameRackTf, width);
    }

    public void inputLengthTf(String length) {
        clearAndSendKeys(lengthRackTf, length);
    }

    public void inputHeightTf(String height) {
        clearAndSendKeys(heightRackTf, height);
    }

    public void selectPhysicalStatus(String status) {
        driver.findElement(physicalStatusRackSelect).sendKeys(status);
    }

    public void getMessageOfErrorName(String span) {
        checkActualSpanWithExpectedResult(span, messageOfErrorName);
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
}
