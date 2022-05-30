package src.keywords;

import com.github.markusbernhardt.selenium2library.Selenium2Library;
import org.openqa.selenium.WebDriver;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;
import src.CityLibrary;

import javax.script.ScriptException;

@RobotKeywords
public class KeywordsCity {

    private static WebDriver driver;
    private CityLibrary objCityLibrary;

    @RobotKeyword("I am at the city form")
    public void iAmAtTheCityForm() throws ScriptException {
        driver = Selenium2Library.getLibraryInstance().getBrowserManagement().getCurrentWebDriver();
        objCityLibrary = new CityLibrary(driver);
        maximizeBrowser();
    }

    public void maximizeBrowser() {
        driver.manage().window().maximize();
    }

    @RobotKeyword("Input name in city form")
    @ArgumentNames({"NAME"})
    public void inputNameInCityForm(String name) {
        objCityLibrary.inputNameTf(name);
    }

    @RobotKeyword("Input population in city form")
    @ArgumentNames({"POPULATION"})
    public void inputPopulationInCityForm(String population) {
        objCityLibrary.inputPopulationTf(population);
    }

    @RobotKeyword("Select center in city form")
    @ArgumentNames({"CENTER"})
    public void selectCenterInCityForm(String center) {
        objCityLibrary.selectIsRegionalCenterCity(center);
    }

    @RobotKeyword("Check for error after invalid city name")
    @ArgumentNames({"ERR_NAME"})
    public void checkForErrorAfterInvalidCityName(String span) {
        objCityLibrary.getMessageOfErrorName(span);
    }

    @RobotKeyword("Check for error after invalid city population")
    @ArgumentNames({"ERR_POPULATION"})
    public void checkForErrorAfterInvalidCityPopulation(String span) {
        objCityLibrary.getMessageOfErrorPopulation(span);
    }

    @RobotKeyword("Save city")
    public void saveCity() {
        objCityLibrary.clickSaveButton();
    }

    @RobotKeyword("Delete city")
    public void deleteCity() {
        objCityLibrary.clickDeleteButton();
    }

    @RobotKeyword("Create city")
    public void createCity() {
        objCityLibrary.clickCreateButton();
    }


    @RobotKeyword("Edit city")
    public void editCity() {
        objCityLibrary.clickEditButton();
    }

    @RobotKeyword("Click parameters city")
    public void clickParametersCity() {
        objCityLibrary.clickParametersButton();
    }

    @RobotKeyword("Select second city")
    public void selectSecondCity() {
        objCityLibrary.clickElementCheckbox();
    }

    @RobotKeyword("Click second city")
    public void clickSecondCity() {
        objCityLibrary.clickElementLink();
    }

}
