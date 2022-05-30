package src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import src.foundation.RobotCustomLibrary;

public class ATMLibrary extends RobotCustomLibrary {
    private static final By ATMButton = By.xpath("//*[@id=\"j_idt76:tabView\"]/ul/li[4]/a");
    private static final By nameATMTf = By.xpath("//*[@id=\"j_idt74:name\"]");
    private static final By connectionTypeATMTf = By.xpath("//*[@id=\"j_idt74:connectionType\"]");
    private static final By extraSecurityATMTf = By.xpath("//*[@id=\"j_idt74:extraSecurity\"]");
    private static final By physicalStatusATMSelect = By.xpath("//*[@id=\"j_idt74:physicalStatus\"]");
    private static final By locatedInATM = By.xpath("//*[@id=\"table_data\"]/table/tbody/tr[5]/td/a[1]");
    private static final By locatedInATMSelect = By.xpath("/html/body/form/div/div[2]/div/ul/li[1]/span/span[3]/a");
    private static final By locatedInATMOk = By.xpath("/html/body/form/div/div[2]/button[1]");
    private static final By messageOfErrorName = By.xpath("//*[@id=\"table_data\"]/table/tbody/tr[1]/td/span");
    private static final By messageOfErrorLocatedIn = By.xpath("//*[@id=\"table_data\"]/table/tbody/tr[5]/td/span");

    public ATMLibrary(WebDriver driver) {
        elementCheckbox = By.xpath("//*[@id=\"j_idt76:tabView:j_idt143_data\"]/tr[2]/td[1]/input");
        elementLink = By.xpath("//*[@id=\"j_idt76:tabView:j_idt143_data\"]/tr[1]/td[1]/a");
        createButton = By.partialLinkText("Create ATM");
        deleteButton = By.name("j_idt76:tabView:j_idt141");
        this.driver = driver;
    }

    public void inputNameTf(String name) {
        clearAndSendKeys(nameATMTf, name);
    }

    public void inputConnectionTypeTf(String connection) {
        clearAndSendKeys(connectionTypeATMTf, connection);
    }

    public void inputExtraSecurityTf(String security) {
        clearAndSendKeys(extraSecurityATMTf, security);
    }

    public void selectLocatedIn() {
        waitWhenElementIsClickable(locatedInATM);
        driver.findElement(locatedInATM).click();
    }

    public void selectLocatedInNewWindow() {
        waitWhenElementIsClickable(locatedInATMSelect, locatedInATMOk);
    }

    public void selectPhysicalStatus(String status) {
        (new Select(driver.findElement(physicalStatusATMSelect))).selectByValue(status);
    }

    public void getMessageOfErrorName(String span) {
        checkActualSpanWithExpectedResult(span, messageOfErrorName);
    }

    public void getMessageOfErrorLocation(String span) {
        checkActualSpanWithExpectedResult(span, messageOfErrorLocatedIn);
    }

    public void findATM() {
        driver.findElement(ATMButton).click();
    }
}