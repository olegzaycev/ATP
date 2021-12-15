package page_factory.BO;
import LoadData.LoadConfigData;
import io.qameta.allure.Step;
import page_factory.PO.LoginPO;

public class LoginBO {

    @Step("ChoosePhotoAndLike")
    public LoginPO Login()
    {
        LoginPO loginPO = new LoginPO().OpenPage();
        return loginPO.Timer(5000)._inputLogin(LoadConfigData.getProperty("login_inst"))._inputPassword(LoadConfigData.getProperty("pass_inst")).PressLoginBtn();
    }

}
