package ru.appline.framework.managers;

import org.junit.Before;

import java.util.concurrent.TimeUnit;

import static ru.appline.framework.managers.DriverManager.getDriver;
import static ru.appline.framework.managers.DriverManager.quitDriver;
import static ru.appline.framework.utils.PropConst.*;

public class InitManager {

    protected static TestPropManager prop = TestPropManager.getTestPropManager();

    public static void initFramework() {
        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().pageLoadTimeout(Integer.parseInt(prop.getProperty(PAGE_LOAD_TIMEOUT)), TimeUnit.SECONDS);
        getDriver().manage().timeouts().implicitlyWait(Integer.parseInt(prop.getProperty(IMPICITY_WAIT)), TimeUnit.SECONDS);
    }

    public static void quitFramework() {
//        quitDriver();
    }
}
