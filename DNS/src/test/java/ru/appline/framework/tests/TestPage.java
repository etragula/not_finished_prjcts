package ru.appline.framework.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.appline.framework.basetest.BaseTest;
import ru.appline.framework.pages.ListOfResultsPage;
import ru.appline.framework.pages.StartPage;

import java.util.concurrent.TimeUnit;
public class TestPage extends BaseTest {

    @Test
    public void testScenario() {
        app.getStartPage()
                .fillFinder("")
                .clickFindButton()
                .selectProductFromTheList("PlayStation 4 Slim Black");
    }
}
