package pages.mainPage.popups;

import models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.AbstractModal;
import utils.Utils;

public class SignInModal extends AbstractModal {
    public SignInModal(){
        super(By.xpath(".//div[@class='styles_modal__gNwvD _25cv5']"));
    }

    private WebElement header = findNestedElement(By.xpath(".//*[@class='_2b5VM']"));
    private WebElement login = findNestedElement(By.xpath(".//input[@type ='mail']"));
    private WebElement password = findNestedElement(By.xpath(".//input[@type ='password']"));
    private WebElement loginBtn = findNestedElement(By.xpath(".//*[@class='_2YoBv _1MfvL']"));

    public void fillUserFields(User user){
        login.sendKeys(user.getMail());
        password.sendKeys(user.getPassword());
    }

    public void signIn(){
        loginBtn.click();
        Utils.waiter.waitWithCondition(ExpectedConditions.invisibilityOfAllElements(header));
    }

    public void check() {
        //проверка попапа
    }
}
