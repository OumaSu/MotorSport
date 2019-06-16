package pages.mainPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.AbstractPage;
import utils.Utils;

public class LoggedMainPage extends AbstractPage {
    public LoggedMainPage(){
        super();
    }

    private WebElement userLink = findElementOnPage(By.className("_2qU5u"));

    public void checkLogin(){
        Utils.waiter.waitUntil(userLink.isDisplayed());
    }
}
