package ru.appline.framework.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ListOfResultsPage extends BasePage {

    @FindBy(xpath = "//div[@class='product-info__title-link']//a[contains(text(), '')]")
    private List<WebElement> foundListOfProducts;

    public ProductPage selectProductFromTheList(String nameOfProduct) {
        if (!nameOfProduct.equals("")) {
            Assert.fail("Вы ввели пустую строку.");
        }
        for (WebElement product : foundListOfProducts) {
            if (product.getText().toLowerCase().contains(nameOfProduct.toLowerCase())) {
                waitUntilElementToBeClickable(product);
                product.click();
                return app.getProductPage();
            }
        }
        Assert.fail("Продукт " + nameOfProduct + " не был найден.");
        return app.getProductPage();
    }
}
