package pages;

import pages.mainPage.LoggedMainPage;
import pages.mainPage.UnloggedMainPage;

public class PageFactory {
    public static LoggedMainPage LoggedMainPage(){
        return new LoggedMainPage();
    }

    public static UnloggedMainPage UnloggedMainPage(){
        return new UnloggedMainPage();
    }
}
