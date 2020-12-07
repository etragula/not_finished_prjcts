package ru.appline.framework.managers;

import ru.appline.framework.pages.ListOfResultsPage;
import ru.appline.framework.pages.ProductPage;
import ru.appline.framework.pages.StartPage;

public class PagesManager {

    private static PagesManager pagesManager;

    private StartPage startPage;
    private ListOfResultsPage listOfResultsPage;
    private ProductPage productPage;

    private PagesManager() {
    }

    public static PagesManager getPagesManager() {
        if (pagesManager == null) {
            pagesManager = new PagesManager();
        }
        return pagesManager;
    }

    public StartPage getStartPage() {
        if (startPage == null) {
            startPage = new StartPage();
        }
        return startPage;
    }

    public ListOfResultsPage getListOfResultsPage() {
        if (listOfResultsPage == null) {
            listOfResultsPage = new ListOfResultsPage();
        }
        return listOfResultsPage;
    }

    public ProductPage getProductPage() {
        if (productPage == null) {
            productPage = new ProductPage();
        }
        return productPage;
    }
}
