package base;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import utils.Utils;

import java.io.File;

public class TestBase {
    private static RunProperties properties;

    @BeforeClass
    public static void setUp(){
        properties = new RunProperties();
        Utils.driver.createDriver(getDriverPath());
        Utils.driver.openUrl(getMainUrl());
    }

    @AfterClass
    public static void cleanUp(){
       Utils.driver.closeDriver();
    }

    private static String getMainUrl(){
        return properties.getMainUrl() + properties.getLocale();
    }

    private static String getDriverPath(){
        File currentDirFile = new File(".");
        String path = currentDirFile.getAbsolutePath();
        path = path.substring(0, path.length() - 1);
        return path + properties.getDriver();
    }
}
