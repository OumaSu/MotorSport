package utils;

import org.openqa.selenium.support.ui.ExpectedCondition;

public interface IWaiterUtils {
    void waitUntil(boolean condition);
    void waitWithCondition(ExpectedCondition condition);
}
