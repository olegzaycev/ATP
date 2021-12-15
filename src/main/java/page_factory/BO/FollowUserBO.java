package page_factory.BO;

import io.qameta.allure.Step;
import page_factory.PO.HomePagePO;

public class FollowUserBO {

    @Step("FollowUser")
    public HomePagePO Follow()
    {
        HomePagePO homePagePO = new HomePagePO();
        return homePagePO.Timer(8000).Follow();
    }

}
