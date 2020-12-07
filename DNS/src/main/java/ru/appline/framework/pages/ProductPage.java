package ru.appline.framework.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static ru.appline.framework.managers.DriverManager.getDriver;

public class ProductPage extends BasePage {

    @FindBy(xpath = "//span[@class='product-card-price__current'")
    private WebElement price;

    @FindBy(xpath = "")
    private WebElement extraWarrantyPeriod;

    private int initialPrice;

    public int setInitialPrice() {
        return Integer.parseInt(price.getText());
    }

    public ProductPage chooseExtraWarrantyForProduct(int howManyYears) {
        if (!getDriver().findElement(By.xpath("//div[contains(@class, 'warranty')]")).isDisplayed()) {
            Assert.fail("Услуга \"Дополнительной гарантии\" не доступна для данного продукта.");
        }
        switch (howManyYears) {
            case 1:

                break;
            case 2:
                break;
            default:
        }


    }
}
