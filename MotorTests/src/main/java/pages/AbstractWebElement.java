package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Utils;

public abstract class AbstractWebElement {
    private WebDriver driver;
    private WebElement element;

    public AbstractWebElement(){
        driver = Utils.driver.getDriver();
    }

    public AbstractWebElement(By by){
        driver = Utils.driver.getDriver();
        element = driver.findElement(by);
    }

    public WebElement getElement(){
        return element;
    }

    public WebElement findNestedElement(By by){
        return element.findElement(by);
    }

    public WebElement findElementOnPage(By by){
        return driver.findElement(by);
    }
}
