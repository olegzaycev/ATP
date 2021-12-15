import page_factory.BO.*;
import web_driver.Browsers;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//import web_driver.initWebDriver;

@Test
public class InstagramTest {

    @DataProvider(name = "BrowserProvider", parallel = true)
    public Object[][] getBrowserName(){
            Object BrowserName[][] =
                    {
                            {
                                "Chrome"
                            },
                            {
                                "Firefox"
                            }
                    };

            return BrowserName;

    }

    @Test(dataProvider = "BrowserProvider", priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    public void Login(String browser_name)
    {
        LoginBO loginBO = new LoginBO();

        Browsers.initDriver(browser_name);
        loginBO.Login();

    }
    @Test(priority = 2)
    @Severity(SeverityLevel.CRITICAL)
    public void SearchAndFollow()
    {
        Browsers.initDriver("Chrome");

        LoginBO loginBO = new LoginBO();
        SearchUserBO searchUserBO = new SearchUserBO();
        FollowUserBO followUserBO = new FollowUserBO();



        loginBO.Login();
        searchUserBO.Search();
        followUserBO.Follow();
    }
    @Test(priority = 3)
    @Severity(SeverityLevel.CRITICAL)
    public void ChoosePhotoAndLike()
    {
        Browsers.initDriver("Chrome");

        LoginBO loginBO = new LoginBO();
        SearchUserBO searchUserBO = new SearchUserBO();
        LikeAndCommentBO likeAndCommentBO = new LikeAndCommentBO();

        loginBO.Login();
        searchUserBO.Search();
        likeAndCommentBO.ChoosePhotoAndLike();

    }
    @Test(priority = 4)
    @Severity(SeverityLevel.CRITICAL)
    public void SendMessage()
    {
        Browsers.initDriver("Chrome");

        LoginBO loginBO = new LoginBO();
        SearchUserBO searchUserBO = new SearchUserBO();
        SendMessageBO sendMessageBO = new SendMessageBO();
        loginBO.Login();
        searchUserBO.Search();
        sendMessageBO.SendMessage();


    }
    @Test(priority = 5)
    @Severity(SeverityLevel.CRITICAL)
    public void UnFollow()
    {
        Browsers.initDriver("Chrome");

        LoginBO loginBO = new LoginBO();
        SearchUserBO searchUserBO = new SearchUserBO();
        UnFollowUserBO unFollowUserBO = new UnFollowUserBO();


        loginBO.Login();
        searchUserBO.Search();
        unFollowUserBO.UnFollow();
    }

}



