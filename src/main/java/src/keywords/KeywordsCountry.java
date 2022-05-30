package src.keywords;

import com.github.markusbernhardt.selenium2library.Selenium2Library;
import org.openqa.selenium.WebDriver;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;
import src.CountryLibrary;

import javax.script.ScriptException;

@RobotKeywords
public class KeywordsCountry {

    private static WebDriver driver;
    private CountryLibrary objCountryLibrary;

    @RobotKeyword("I am at the country form")
    public void iAmAtTheCountryForm() throws ScriptException {
        driver = Selenium2Library.getLibraryInstance().getBrowserManagement().getCurrentWebDriver();
        objCountryLibrary = new CountryLibrary(driver);
        objCountryLibrary.clickInventory();
        maximizeBrowser();
    }

    public void maximizeBrowser() {
        driver.manage().window().maximize();
    }

    @RobotKeyword("Input name in country form")
    @ArgumentNames({"NAME"})
    public void inputNameInCountryForm(String name) {
        objCountryLibrary.inputNameTf(name);
    }

    @RobotKeyword("Input language in country form")
    @ArgumentNames({"LANGUAGE"})
    public void inputLanguageInCountryForm(String password) {
        objCountryLibrary.inputLanguageTf(password);
    }

    @RobotKeyword("Select continent in country form")
    @ArgumentNames({"CONTINENT"})
    public void selectContinentInCountryForm(String continent) {
        objCountryLibrary.selectContinentTf(continent);
    }

    @RobotKeyword("Check for error after invalid country name")
    @ArgumentNames({"ERR_NAME"})
    public void checkForErrorAfterInvalidCountryName(String span) {
        objCountryLibrary.getMessageOfErrorName(span);
    }

    @RobotKeyword("Check for error after invalid country language")
    @ArgumentNames({"ERR_LANGUAGE"})
    public void checkForErrorAfterInvalidCountryLanguage(String span) {
        objCountryLibrary.getMessageOfErrorLanguage(span);
    }

    @RobotKeyword("Save country")
    public void saveCountry() {
        objCountryLibrary.clickSaveButton();
    }

    @RobotKeyword("Delete country")
    public void deleteCountry() {
        objCountryLibrary.clickDeleteButton();
    }

    @RobotKeyword("Create country")
    public void createCountry() {
        objCountryLibrary.clickCreateButton();
    }


    @RobotKeyword("Edit country")
    public void editCountry() {
        objCountryLibrary.clickEditButton();
    }

    @RobotKeyword("Click parameters")
    public void clickParameters() {
        objCountryLibrary.clickParametersButton();
    }

    @RobotKeyword("Select second country")
    public void selectSecondCountry() {
        objCountryLibrary.clickElementCheckbox();
    }

    @RobotKeyword("Click second country")
    public void clickSecondCountry() {
        objCountryLibrary.clickElementLink();
    }

}
