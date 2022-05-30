package src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import src.foundation.RobotCustomLibrary;

public class DeviceLibrary extends RobotCustomLibrary {
    private static final By locatedInSelect = By.xpath("/html/body/form/div/div[2]/div/ul/li[1]/span/span[3]/a");
    private static final By locatedInOk = By.xpath("/html/body/form/div/div[2]/button[1]");
    private static final By deviceButton = By.xpath("//*[@id=\"j_idt76:tabView\"]/ul/li[3]/a");
    private static final By nameDevicesTf = By.xpath("//*[@id=\"j_idt74:name\"]");
    private static final By widthDevicesTf = By.xpath("//*[@id=\"j_idt74:width\"]");
    private static final By lengthDevicesTf = By.xpath("//*[@id=\"j_idt74:length\"]");
    private static final By heightDevicesTf = By.xpath("//*[@id=\"j_idt74:height\"]");
    private static final By macAddressDevicesTf = By.xpath("//*[@id=\"j_idt74:macAddress\"]");
    private static final By ramDevicesTf = By.xpath("//*[@id=\"j_idt74:ram\"]");
    private static final By cpuDevicesTf = By.xpath("//*[@id=\"j_idt74:cpu\"]");
    private static final By ipAddressDevicesTf = By.xpath("//*[@id=\"j_idt74:ipAddress\"]");
    private static final By physicalStatusDevicesSelect = By.xpath("//*[@id=\"j_idt74:physicalStatus\"]");
    private static final By locatedInDevices = By.xpath("//*[@id=\"table_data\"]/table/tbody/tr[10]/td/a[1]");
    private static final By networkElementDevices = By.xpath("//*[@id=\"table_data\"]/table/tbody/tr[11]/td/a[1]");
    private static final By messageOfErrorName = By.xpath("//*[@id=\"table_data\"]/table/tbody/tr[1]/td/span");
    private static final By messageOfErrorMacAddress = By.xpath("//*[@id=\"table_data\"]/table/tbody/tr[2]/td/span");
    private static final By messageOfErrorRam = By.xpath("//*[@id=\"table_data\"]/table/tbody/tr[3]/td/span");
    private static final By messageOfErrorIpAddress = By.xpath("//*[@id=\"table_data\"]/table/tbody/tr[5]/td/span");
    private static final By messageOfErrorLocatedIn = By.xpath("//*[@id=\"table_data\"]/table/tbody/tr[10]/td/span");
    private static final By messageOfErrorNetworkElement = By.xpath("//*[@id=\"table_data\"]/table/tbody/tr[11]/td/span");
    private static final By messageOfErrorWidth = By.xpath("//*[@id=\"table_data\"]/table/tbody/tr[7]/td/span");
    private static final By messageOfErrorLength = By.xpath("//*[@id=\"table_data\"]/table/tbody/tr[8]/td/span");
    private static final By messageOfErrorHeight = By.xpath("//*[@id=\"table_data\"]/table/tbody/tr[9]/td/span");

    public DeviceLibrary(WebDriver driver) {
        this.driver = driver;
        elementCheckbox = By.xpath("//*[@id=\"j_idt76:tabView:j_idt128_data\"]/tr[2]/td[1]/input");
        elementLink = By.xpath(" //*[@id=\"j_idt76:tabView:j_idt128_data\"]/tr[1]/td[1]/a");
        createButton = By.partialLinkText("Create device");
        deleteButton = By.name("j_idt76:tabView:j_idt126");
    }

    public void inputNameTf(String name) {
        clearAndSendKeys(nameDevicesTf, name);
    }

    public void inputMacAddressTf(String mac) {
        clearAndSendKeys(macAddressDevicesTf, mac);
    }

    public void inputIpAddressTf(String ip) {
        clearAndSendKeys(ipAddressDevicesTf, ip);
    }

    public void inputRamDevicesTf(String ram) {
        clearAndSendKeys(ramDevicesTf, ram);
    }

    public void inputCpuDevicesTf(String cpu) {
        clearAndSendKeys(cpuDevicesTf, cpu);
    }

    public void inputWidthTf(String width) {
        clearAndSendKeys(widthDevicesTf, width);
    }

    public void inputLengthTf(String length) {
        clearAndSendKeys(lengthDevicesTf, length);
    }

    public void inputHeightTf(String height) {
        clearAndSendKeys(heightDevicesTf, height);
    }

    public void selectLocatedInNewWindow() {
        waitWhenElementIsClickable(locatedInSelect, locatedInOk);
    }

    public void selectLocatedIn() {
        driver.findElement(locatedInDevices).click();
    }

    public void selectPhysicalStatus(String status) {
        (new Select(driver.findElement(physicalStatusDevicesSelect))).selectByValue(status);
    }

    public void selectNetworkElement() {
        driver.findElement(networkElementDevices).click();
    }

    public void getMessageOfErrorMac(String span) {
        checkActualSpanWithExpectedResult(span, messageOfErrorMacAddress);
    }

    public void getMessageOfErrorRam(String span) {
        checkActualSpanWithExpectedResult(span, messageOfErrorRam);
    }

    public void getMessageOfErrorIp(String span) {
        checkActualSpanWithExpectedResult(span, messageOfErrorIpAddress);
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

    public void getMessageOfErrorNetworkElement(String span) {
        checkActualSpanWithExpectedResult(span, messageOfErrorNetworkElement);
    }

    public void findDevice() {
        driver.findElement(deviceButton).click();
    }
}
