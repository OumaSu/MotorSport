package pages.mainPage.popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.AbstractModal;
import utils.Utils;

public class PromoModal extends AbstractModal {
    public PromoModal(){
        super(By.xpath(".//div[@class='fancybox-skin']"));
    }

    private WebElement closeBtn = findNestedElement(By.xpath(".//a[@class='fancybox-item fancybox-close']"));

    public void close(){
        Utils.waiter.waitWithCondition(ExpectedConditions.visibilityOfAllElements(this.getElement()));
        closeBtn.click();
    }

    @Override
    public void check() {
    }
}
