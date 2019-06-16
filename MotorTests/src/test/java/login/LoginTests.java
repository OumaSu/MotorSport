package login;

import base.TestBase;
import models.User;
import models.UserFactory;
import org.junit.Before;
import org.junit.Test;
import pages.PageFactory;
import pages.mainPage.LoggedMainPage;
import pages.mainPage.UnloggedMainPage;

public class LoginTests extends TestBase {
    private User user;

    @Before
    public void init(){
        user = UserFactory.createRandom();
        user.setMail("nuver@mail.ru");
        user.setPassword("2208aeg");
    }

    @Test
    public void SuccessfulLoginTest(){
        UnloggedMainPage unloggedMainPage = PageFactory.UnloggedMainPage();
        unloggedMainPage.closePromo();
        unloggedMainPage.authorize(user);
        LoggedMainPage loggedMainPage = PageFactory.LoggedMainPage();
        loggedMainPage.checkLogin();
    }
}
