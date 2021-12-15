package page_factory.BO;

import io.qameta.allure.Step;
import page_factory.PO.HomePagePO;

public class SearchUserBO {
    @Step("SearchUser")
    public HomePagePO Search()
    {
        HomePagePO homePagePO = new HomePagePO();
        return homePagePO.Timer(8000).SearchUser("instasamka").Timer(8000).ChooseUser();
    }
}
