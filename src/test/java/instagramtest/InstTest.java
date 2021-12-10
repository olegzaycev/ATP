package instagramtest;

import Action.FollowUser;
import Action.LoginPage;
import Action.SearchPeople;
import Action.SendMessage;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import dataconfig.Data;


public class InstTest {

    public static LoginPage ActLogPage;
    public static SearchPeople searchPeople;
    public static FollowUser followUser;
    public static SendMessage sendMessage;






    @BeforeClass
    public static void SetUp()
    {
        System.setProperty("webdriver.chrome.driver", Data.getProperty("chromepath"));
        WebDriver driver = new ChromeDriver();
        ActLogPage = new LoginPage(driver);
        searchPeople = new SearchPeople(driver);
        followUser = new FollowUser(driver);
        sendMessage = new SendMessage(driver);


        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(Data.getProperty("webapplication"));
        driver.manage().window().maximize();





    }
    @Test
    public void Scene(){
        ActLogPage.ActionInputLogin(Data.getProperty("login"));
        ActLogPage.ActionInputPassword(Data.getProperty("password"));
        ActLogPage.ActionPressLogButton();
        searchPeople.InputTextToSearch(Data.getProperty("usersearch"));
        searchPeople.ClickOnUser();
        followUser.Follow();
        sendMessage.ClickOnMail();
        sendMessage.SendMessagetoUser("Hello World!!!");
    }
    @Test
    public void End()
    {


    }

}
