package src.foundation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.NoSuchElementException;

public abstract class RobotCustomLibrary {
    protected String actualResult = null;
    protected String expectedResult = null;
    protected WebDriver driver;
    protected static By createButton = By.xpath("/html/body/div[1]/div[3]/form/div/div/div[4]/div/div[1]/table/tbody/tr/td[1]/a");
    protected static By deleteButton;
    protected static final By saveButton = By.name("j_idt74:j_idt76");
    protected static final By editButton = By.partialLinkText("Edit");

    protected static By elementCheckbox;
    protected static By elementLink;
    protected static final By parametersButton = By.xpath(" //*[@id=\"j_idt76:tabView\"]/ul/li[1]/a");

    public void clickParametersButton() {
        driver.findElement(parametersButton).click();
    }

    public void clickElementLink() {
        driver.findElement(elementLink).click();
    }

    public void clickElementCheckbox() {
        WebDriverWait wait = new WebDriverWait(driver, 10L);
        wait.until(ExpectedConditions.elementToBeClickable(elementCheckbox));
        driver.findElement(elementCheckbox).click();
    }

    public void clickEditButton() {
        driver.findElement(editButton).click();
    }

    public void clickSaveButton() {
        driver.findElement(saveButton).click();
    }

    public void clickDeleteButton() {
        driver.findElement(deleteButton).click();
    }

    public void clickCreateButton() {
        driver.findElement(createButton).click();
    }

    protected void checkActualSpanWithExpectedResult(String span, By element) {
        expectedResult = span;
        WebDriverWait wait = new WebDriverWait(driver, 10L);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        actualResult = checkSpanOrMessage(element);
        Assert.assertEquals(actualResult, expectedResult);
    }

    protected void clearAndSendKeys(By itemId, String data){
        driver.findElement(itemId).clear();
        driver.findElement(itemId).sendKeys(data);
    }

    protected void sendKeysAndClick(By itemId, String data) {
        WebDriverWait wait = new WebDriverWait(driver, 10L);
        wait.until(ExpectedConditions.elementToBeClickable(itemId));
        driver.findElement(itemId).sendKeys(data);
        driver.findElement(itemId).click();
    }

    protected void waitWhenElementIsClickable(By ...items){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        for (By item : items) {
            wait.until(ExpectedConditions.elementToBeClickable(item));
            driver.findElement(item).click();
        }
    }

    protected String checkSpanOrMessage(By span) {
        try {
            return driver.findElement(span).getText();
        } catch (NoSuchElementException var3) {
            return null;
        }
    }
}
