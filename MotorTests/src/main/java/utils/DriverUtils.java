package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

class DriverUtils implements IDriverUtils {
    private static WebDriver driver;

    public WebDriver createDriver(String driverPath) {
        System.setProperty("webdriver.chrome.driver", driverPath);
        ChromeOptions options = new ChromeOptions();
        driver =  new ChromeDriver(options);
        return driver;
    }

    //можно всю работу с драйвером выносить сюда
    //пока оставлю для скорости
    public WebDriver getDriver() {
        return driver;
    }

    public void closeDriver() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }

    public void openUrl(String url) {
        driver.navigate().to(url);
    }
}
