package ru.appline.framework.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class StartPage extends BasePage{

    @FindBy(xpath = "//nav//input")
    private WebElement finderInput;

    @FindBy(xpath = "//nav//span[contains(@class, 'icon_search')]")
    private WebElement finderButton;

    public StartPage fillFinder(String whatToSearch) {
        if (whatToSearch.equals("")) {
            Assert.fail("Вы ввели пустую строку.");
        }
        wait.until(ExpectedConditions.elementToBeClickable(finderInput));
        finderInput.click();
        finderInput.sendKeys(whatToSearch);
        return this;
    }

    public ListOfResultsPage clickFindButton() {
        wait.until(ExpectedConditions.elementToBeClickable(finderButton));
        finderButton.click();
        return app.getListOfResultsPage();
    }
}
