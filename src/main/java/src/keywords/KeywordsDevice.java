package src.keywords;

import com.github.markusbernhardt.selenium2library.Selenium2Library;
import org.openqa.selenium.WebDriver;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;
import src.DeviceLibrary;

import javax.script.ScriptException;

@RobotKeywords
public class KeywordsDevice {

    private static WebDriver driver;
    private DeviceLibrary objDeviceLibrary;

    @RobotKeyword("I am at the device form")
    public void iAmAtTheDeviceForm() throws ScriptException {
        driver = Selenium2Library.getLibraryInstance().getBrowserManagement().getCurrentWebDriver();
        objDeviceLibrary = new DeviceLibrary(driver);
        objDeviceLibrary.findDevice();
        maximizeBrowser();
    }

    public void maximizeBrowser() {
        driver.manage().window().maximize();
    }

    @RobotKeyword("Input name in device form")
    @ArgumentNames({"NAME"})
    public void inputNameInDeviceForm(String name) {
        objDeviceLibrary.inputNameTf(name);
    }

    @RobotKeyword("Input ip address in device form")
    @ArgumentNames({"IP"})
    public void inputIpAddressInDeviceForm(String ip) {
        objDeviceLibrary.inputIpAddressTf(ip);
    }

    @RobotKeyword("Input mac address in device form")
    @ArgumentNames({"MAC"})
    public void inputMacAddressInDeviceForm(String mac) {
        objDeviceLibrary.inputMacAddressTf(mac);
    }

    @RobotKeyword("Input cpu in device form")
    @ArgumentNames({"CPU"})
    public void inputCpuInDeviceForm(String cpu) {
        objDeviceLibrary.inputCpuDevicesTf(cpu);
    }

    @RobotKeyword("Input ram in device form")
    @ArgumentNames({"RAM"})
    public void inputRamInDeviceForm(String ram) {
        objDeviceLibrary.inputRamDevicesTf(ram);
    }

    @RobotKeyword("Input height in device form")
    @ArgumentNames({"HEIGHT"})
    public void inputHeightInDeviceForm(String height) {
        objDeviceLibrary.inputHeightTf(height);
    }

    @RobotKeyword("Input length in device form")
    @ArgumentNames({"LENGTH"})
    public void inputLengthInDeviceForm(String length) {
        objDeviceLibrary.inputLengthTf(length);
    }

    @RobotKeyword("Input width in device form")
    @ArgumentNames({"WIDTH"})
    public void inputWidthInDeviceForm(String width) {
        objDeviceLibrary.inputWidthTf(width);
    }

    @RobotKeyword("Select location in device form")
    public void selectLocationInDeviceForm() {
        objDeviceLibrary.selectLocatedIn();
        String winHandleBefore = driver.getWindowHandle();

        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
        objDeviceLibrary.selectLocatedInNewWindow();
        driver.switchTo().window(winHandleBefore);
    }

    @RobotKeyword("Select physical status in device form")
    @ArgumentNames({"STATUS"})
    public void selectPhysicalStatusInDeviceForm(String status) {
        objDeviceLibrary.selectPhysicalStatus(status);
    }

    @RobotKeyword("Select network element in device form")
    public void selectNetworkElementInDeviceForm() {
        objDeviceLibrary.selectNetworkElement();
        String winHandleBefore = driver.getWindowHandle();

        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
        objDeviceLibrary.selectLocatedInNewWindow();
        driver.switchTo().window(winHandleBefore);
    }

    @RobotKeyword("Check for error after invalid device location")
    @ArgumentNames({"ERR_LOCATION"})
    public void checkForErrorAfterInvalidDeviceLocation(String span) {
        objDeviceLibrary.getMessageOfErrorLocation(span);
    }

    @RobotKeyword("Check for error after invalid device Ram")
    @ArgumentNames({"ERR_RAM"})
    public void checkForErrorAfterInvalidDeviceRam(String span) {
        objDeviceLibrary.getMessageOfErrorRam(span);
    }

    @RobotKeyword("Check for error after invalid device Ip address")
    @ArgumentNames({"ERR_IP"})
    public void checkForErrorAfterInvalidDeviceIpAddress(String span) {
        objDeviceLibrary.getMessageOfErrorIp(span);
    }

    @RobotKeyword("Check for error after invalid device mac address")
    @ArgumentNames({"ERR_ADDRESS"})
    public void checkForErrorAfterInvalidDeviceMacAddress(String span) {
        objDeviceLibrary.getMessageOfErrorMac(span);
    }

    @RobotKeyword("Check for error after invalid device network element")
    @ArgumentNames({"ERR_ELEMENT"})
    public void checkForErrorAfterInvalidDeviceNetworkElement(String span) {
        objDeviceLibrary.getMessageOfErrorNetworkElement(span);
    }

    @RobotKeyword("Check for error after invalid device name")
    @ArgumentNames({"ERR_NAME"})
    public void checkForErrorAfterInvalidDeviceName(String span) {
        objDeviceLibrary.getMessageOfErrorName(span);
    }

    @RobotKeyword("Check for error after invalid device length")
    @ArgumentNames({"ERR_LENGTH"})
    public void checkForErrorAfterInvalidDeviceLength(String span) {
        objDeviceLibrary.getMessageOfErrorLength(span);
    }

    @RobotKeyword("Check for error after invalid device height")
    @ArgumentNames({"ERR_HEIGHT"})
    public void checkForErrorAfterInvalidDeviceHeight(String span) {
        objDeviceLibrary.getMessageOfErrorHeight(span);
    }

    @RobotKeyword("Check for error after invalid device width")
    @ArgumentNames({"ERR_WIDTH"})
    public void checkForErrorAfterInvalidDeviceWidth(String span) {
        objDeviceLibrary.getMessageOfErrorWidth(span);
    }


    @RobotKeyword("Save device")
    public void saveDevice() {
        objDeviceLibrary.clickSaveButton();
    }

    @RobotKeyword("Delete device")
    public void deleteDevice() {
        objDeviceLibrary.clickDeleteButton();
    }

    @RobotKeyword("Create device")
    public void createDevice() {
        objDeviceLibrary.clickCreateButton();
    }


    @RobotKeyword("Edit device")
    public void editDevice() {
        objDeviceLibrary.clickEditButton();
    }

    @RobotKeyword("Click parameters device")
    public void clickParametersDevice() {
        objDeviceLibrary.clickParametersButton();
    }

    @RobotKeyword("Select second device")
    public void selectSecondDevice() {
        objDeviceLibrary.clickElementCheckbox();
    }

    @RobotKeyword("Click second device")
    public void clickSecondDevice() {
        objDeviceLibrary.clickElementLink();
    }

}
