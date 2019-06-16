package pages;

import org.openqa.selenium.By;

public abstract class AbstractModal extends AbstractWebElement {
    public AbstractModal(By by){
        super(by);
    }

    public abstract void check();
}
