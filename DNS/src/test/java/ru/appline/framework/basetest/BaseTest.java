package ru.appline.framework.basetest;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import ru.appline.framework.managers.InitManager;
import ru.appline.framework.managers.PagesManager;
import ru.appline.framework.managers.TestPropManager;

import static ru.appline.framework.managers.DriverManager.getDriver;
import static ru.appline.framework.utils.PropConst.APP_URL;

public class BaseTest {

    protected PagesManager app = PagesManager.getPagesManager();

    @BeforeClass
    public static void doBefore() {
        InitManager.initFramework();
    }

    @Before
    public void beforeEach() {
        getDriver().get(TestPropManager.getTestPropManager().getProperty(APP_URL));
    }

    @AfterClass
    public static void doAfter() {
        InitManager.quitFramework();
    }
}
