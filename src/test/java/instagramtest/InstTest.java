package instagramtest;

import Action.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import dataconfig.Data;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class InstTest {

    public static LoginPage ActLogPage;
    public static SearchPeople searchPeople;
    public static FollowUser followUser;
    public static SendMessage sendMessage;
    public static LogOut logOut;
    public static WebDriver driver;


    @DataProvider(name = "LoginToInstProvider")
    public Object[][] getData() {
        Object data [][] =
                {
                    {
                        Data.getProperty("login"),
                        Data.getProperty("password"),
                        Data.getProperty("fisrtusersearch")
                    },
                    {
                        Data.getProperty("login"),
                        Data.getProperty("password"),
                        Data.getProperty("secondusersearch")
                    }


                };
        return data;
    }

    @BeforeClass
    public static void SetUp()
    {
        System.setProperty("webdriver.chrome.driver", Data.getProperty("chromepath"));
        driver = new ChromeDriver();
        ActLogPage = new LoginPage(driver);
        searchPeople = new SearchPeople(driver);
        followUser = new FollowUser(driver);
        sendMessage = new SendMessage(driver);
        logOut = new LogOut(driver);

        driver.get(Data.getProperty("webapplication"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);








    }

    @Test(dataProvider = "LoginToInstProvider")
    public void Scene(String login, String password, String search)
    {
        ActLogPage.ActionInputLogin(login);
        ActLogPage.ActionInputPassword(password);
        ActLogPage.ActionPressLogButton();
        searchPeople.InputTextToSearch(search);
        searchPeople.ClickOnUser();
        followUser.Follow();
        sendMessage.ClickOnMail();
        sendMessage.SendMessagetoUser("Hello World!!!");
        //sendMessage.ClickOnSend();
        //logOut.ClickIcon();
        //logOut.ClickToExit();
        //driver.quit();
    }
    @AfterClass
    public void End()
    {
    driver.quit();

    }

}
