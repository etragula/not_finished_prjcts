package ru.appline.framework.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.appline.framework.managers.PagesManager;


import static ru.appline.framework.managers.DriverManager.getDriver;

public class BasePage {

    protected PagesManager app = PagesManager.getPagesManager();

    protected JavascriptExecutor js = (JavascriptExecutor) getDriver();

    protected Actions action = new Actions(getDriver());

    protected WebDriverWait wait = new WebDriverWait(getDriver(), 40, 1000);

    public BasePage() {
        PageFactory.initElements(getDriver(), this);
    }

    protected void scrollElementsJs(WebElement element) {
        js.executeScript("arguments[0].scrollIntoView(true)", element);
    }

    protected WebElement waitUntilElementToBeClickable(WebElement element) {
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    protected void fillInputField(WebElement element, String value) {
        scrollElementsJs(element);
        waitUntilElementToBeClickable(element).click();
        element.sendKeys(value);
    }

}
