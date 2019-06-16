package pages.mainPage;

import models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.AbstractPage;
import pages.mainPage.popups.PromoModal;
import pages.mainPage.popups.SignInModal;
import utils.Utils;

public class UnloggedMainPage extends AbstractPage {
    public UnloggedMainPage(){
        super();
    }
    private WebElement authButton = findElementOnPage(By.className("_2NcB4"));

    public void authorize(User user){
        authButton.click();
        SignInModal signInPopup = new SignInModal();
        Utils.waiter.waitUntil(signInPopup.getElement().isDisplayed());
        signInPopup.fillUserFields(user);
        signInPopup.signIn();
    }

    public void closePromo(){
        new PromoModal().close();
    }
}
