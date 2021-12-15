package page_factory.PO;

import web_driver.Browsers;
import decorator.Custom_decorator;
import org.openqa.selenium.support.PageFactory;
//import web_driver.initWebDriver;

public class MainPO {
    public MainPO()
    {
        PageFactory.initElements(new Custom_decorator(Browsers.getDriver()),this);
    }
    boolean LoginAct(){return true;}
    boolean SearchUserAct(){return true;}
    boolean FollowAct(){return true;}
    boolean LikePhotoAct(){return true;}
    boolean SendMessageAct(){return true;}
}
