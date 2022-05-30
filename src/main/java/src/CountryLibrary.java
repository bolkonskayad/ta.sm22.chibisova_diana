package src;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import src.foundation.RobotCustomLibrary;

public class CountryLibrary extends RobotCustomLibrary {

    private static final By nameCountryTf = By.id("j_idt74:name");
    private static final By continentCountrySelect = By.id("j_idt74:continent");
    private static final By languageCountryTf = By.id("j_idt74:language");
    protected static final By inventory = By.xpath("/html/body/div/div[3]/div[1]/a");
    private static final By messageOfErrorName = By.xpath("//*[@id=\"table_data\"]/table/tbody/tr[1]/td/span");
    private static final By messageOfErrorLanguage = By.xpath("//*[@id=\"table_data\"]/table/tbody/tr[3]/td/span");

    public CountryLibrary(WebDriver driver) {
        this.driver = driver;
        createButton = By.partialLinkText("Create country");
        deleteButton = By.name("j_idt76:tabView:j_idt87");
        elementLink = By.xpath("//*[@id=\"j_idt76:tabView:j_idt89_data\"]/tr[1]/td[1]/a");
        elementCheckbox = By.name("j_idt76:tabView:j_idt89:1:j_idt91");
    }

    public void inputNameTf(String name) {
        clearAndSendKeys(nameCountryTf, name);
    }

    public void clickInventory() {
        driver.findElement(inventory).click();
    }

    public void selectContinentTf(String continent) {
        new Select(driver.findElement(continentCountrySelect)).selectByValue(continent);;
    }

    public void inputLanguageTf(String language) {
        clearAndSendKeys(languageCountryTf, language);
    }

    public void getMessageOfErrorName(String span) {
        checkActualSpanWithExpectedResult(span, messageOfErrorName);
    }

    public void getMessageOfErrorLanguage(String span) {
        checkActualSpanWithExpectedResult(span, messageOfErrorLanguage);
    }
}
