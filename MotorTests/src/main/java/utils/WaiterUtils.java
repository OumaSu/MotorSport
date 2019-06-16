package utils;

import constants.TimeoutConstants;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

class WaiterUtils implements IWaiterUtils {
    public void waitUntil(boolean condition){
        WebDriverWait driverWait = new WebDriverWait(Utils.driver.getDriver(), TimeoutConstants.defaultWaitTime);
        driverWait.until((driver)->condition);
    }

    public void waitWithCondition(ExpectedCondition condition){
        WebDriverWait driverWait = new WebDriverWait(Utils.driver.getDriver(), TimeoutConstants.defaultWaitTime);
        driverWait.until((driver)->condition);
    }
}
