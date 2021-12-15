package page_factory.PO;


import LoadData.LoadConfigData;
import decorator.ButtonDec;
import decorator.InputDec;
import org.openqa.selenium.support.FindBy;
import web_driver.Browsers;

public class HomePagePO extends MainPO {

    @FindBy(xpath = "//*[@id=\"react-root\"]/div/div/section/nav/div[2]/div/div/div[2]/input")
    private InputDec InputSearch;
    @FindBy(xpath = "//*[@id=\"react-root\"]/div/div/section/nav/div[2]/div/div/div[2]/div[3]/div/div[2]/div/div[1]/a")
    private ButtonDec ClickUser;
    @FindBy(xpath = "//*[@id=\"react-root\"]/div/div/section/main/div/header/section/div[1]/div[2]/div/div/div/span/span[1]/button")
    private ButtonDec ClickFollow;
    @FindBy(xpath = "/html/body/div[6]/div/div/div/div[3]/button[1]")
    private ButtonDec ClickUnfollow;

    public HomePagePO SearchUser(String UserName)
    {
        InputSearch.sendKeys(UserName);
        return this;
    }
    public HomePagePO ChooseUser()
    {
        ClickUser.click();
        return this;
    }
    public HomePagePO Follow()
    {
        ClickFollow.click();
        return this;
    }
    public HomePagePO UnFollow()
    {
        ClickFollow.click();
        return this;
    }
    public HomePagePO ClickUnFollow()
    {
        ClickUnfollow.click();
        return this;
    }

    public HomePagePO Timer(int time)
    {
        try {
            Thread.sleep(time);
        } catch(InterruptedException e) {
            System.out.println("got interrupted!");
        }
        return this;
    }




}
