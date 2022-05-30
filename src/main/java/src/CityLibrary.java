package src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import src.foundation.RobotCustomLibrary;

public class CityLibrary extends RobotCustomLibrary {
    private static final By nameCityTb = By.id("j_idt74:name");
    private static final By isRegionalCenterCitySelect = By.id("j_idt74:isRegionalCenter");
    private static final By populationCityTb = By.id("j_idt74:population");
    private static final By messageOfErrorName = By.xpath("//*[@id=\"table_data\"]/table/tbody/tr[1]/td/span");
    private static final By messageOfErrorPopulation = By.xpath("//*[@id=\"table_data\"]/table/tbody/tr[2]/td/span");

    public CityLibrary(WebDriver driver) {
        this.driver = driver;
        createButton = By.partialLinkText("Create city");
        deleteButton = By.xpath("//*[@id=\"table_header\"]/table/tbody/tr/td[2]/input");
        elementLink = By.xpath("//*[@id=\"j_idt76:tabView:j_idt109_data\"]/tr[1]/td[1]/a");
        elementCheckbox = By.xpath("//*[@id=\"j_idt76:tabView:j_idt109_data\"]/tr[2]/td[1]/input");
    }

    public void inputNameTf(String name) {
        clearAndSendKeys(nameCityTb, name);
    }

    public void selectIsRegionalCenterCity(String regionCenter) {
        (new Select(driver.findElement(isRegionalCenterCitySelect))).selectByValue(regionCenter);
    }

    public void inputPopulationTf(String population) {
        clearAndSendKeys(populationCityTb, population);
    }

    public void getMessageOfErrorName(String span) {
        checkActualSpanWithExpectedResult(span, messageOfErrorName);
    }

    public void getMessageOfErrorPopulation(String span) {
        checkActualSpanWithExpectedResult(span, messageOfErrorPopulation);
    }
}