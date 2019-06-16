package utils;

import org.openqa.selenium.WebDriver;

public interface IDriverUtils {
    WebDriver createDriver(String driverPath);
    WebDriver getDriver();
    void closeDriver();
    void openUrl(String url);
}
