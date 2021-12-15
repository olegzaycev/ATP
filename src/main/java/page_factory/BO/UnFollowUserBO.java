package page_factory.BO;

import io.qameta.allure.Step;
import page_factory.PO.HomePagePO;

public class UnFollowUserBO {
    @Step("Unfollow")
    public HomePagePO UnFollow()
    {
        HomePagePO homePagePO = new HomePagePO();
        return homePagePO.Timer(8000).UnFollow().Timer(2500).ClickUnFollow();
    }
}
