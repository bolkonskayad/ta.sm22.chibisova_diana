package src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import src.foundation.RobotCustomLibrary;

public class PayBoxLibrary extends RobotCustomLibrary {
    private static final By locatedInSelect = By.xpath("/html/body/form/div/div[2]/div/ul/li[1]/span/span[3]/a");
    private static final By locatedInATMOk = By.xpath("/html/body/form/div/div[2]/button[1]");
    private static final By payBoxButton = By.xpath("//*[@id=\"j_idt76:tabView\"]/ul/li[5]/a");
    private static final By namePayBoxTf = By.xpath("//*[@id=\"j_idt74:name\"]");
    private static final By secureProtocolPayBoxTf = By.xpath("//*[@id=\"j_idt74:secureProtocol\"]");
    private static final By displaySizePayBoxTf = By.xpath("//*[@id=\"j_idt74:displaySize\"]");
    private static final By physicalStatusPayBoxSelect = By.xpath("//*[@id=\"j_idt74:physicalStatus\"]");
    private static final By locatedInPayBox = By.xpath("//*[@id=\"table_data\"]/table/tbody/tr[5]/td/a[1]");
    private static final By messageOfErrorName = By.xpath("//*[@id=\"table_data\"]/table/tbody/tr[1]/td/span");
    private static final By messageOfErrorLocatedIn = By.xpath("//*[@id=\"table_data\"]/table/tbody/tr[5]/td/span");
    private static final By messageOfErrorDisplaySize = By.xpath("//*[@id=\"table_data\"]/table/tbody/tr[3]/td/span");

    public PayBoxLibrary(WebDriver driver) {
        this.driver = driver;
        elementCheckbox = By.xpath("//*[@id=\"j_idt76:tabView:j_idt158_data\"]/tr[2]/td[1]/input");
        elementLink = By.xpath("//*[@id=\"j_idt76:tabView:j_idt158_data\"]/tr[1]/td[1]/a");
        createButton = By.partialLinkText("Create Pay Box");
        deleteButton = By.name("j_idt76:tabView:j_idt156");
    }

    public void findPayBox() {
        driver.findElement(payBoxButton).click();
    }

    public void inputNameTf(String name) {
        clearAndSendKeys(namePayBoxTf, name);
    }

    public void inputDisplaySizeTf(String size) {
        clearAndSendKeys(displaySizePayBoxTf, size);
    }

    public void inputSecureProtocolTf(String protocol) {
        clearAndSendKeys(secureProtocolPayBoxTf, protocol);
    }

    public void selectLocatedIn() {
        driver.findElement(locatedInPayBox).click();
    }

    public void selectLocatedInNewWindow() {
        waitWhenElementIsClickable(locatedInSelect, locatedInATMOk);
    }

    public void selectPhysicalStatus(String status) {
        (new Select(driver.findElement(physicalStatusPayBoxSelect))).selectByValue(status);
    }

    public void getMessageOfErrorName(String span) {
        checkActualSpanWithExpectedResult(span, messageOfErrorName);
    }

    public void getMessageOfErrorLocation(String span) {
        checkActualSpanWithExpectedResult(span, messageOfErrorLocatedIn);
    }

    public void getMessageOfErrorDisplay(String span) {
        checkActualSpanWithExpectedResult(span, messageOfErrorDisplaySize);
    }
}
