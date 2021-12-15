package page_factory.PO;

import LoadData.LoadConfigData;
import io.qameta.allure.Step;
import web_driver.Browsers;
import decorator.ButtonDec;
import decorator.InputDec;
import org.openqa.selenium.support.FindBy;
//import web_driver.initWebDriver;

public class LoginPO extends MainPO {



    @FindBy(xpath = "//*[@id=\"loginForm\"]/div/div[1]/div/label/input")
    private InputDec InputLogin;
    @FindBy(xpath = "//*[@id=\"loginForm\"]/div/div[2]/div/label/input" )
    private InputDec InputPassword;
    @FindBy(xpath = "//*[@id=\"loginForm\"]/div/div[3]/button/div")
    private ButtonDec ButtonLogIn;


    @Step("OpenPage")
    public LoginPO OpenPage()
    {
        Browsers.getDriver().navigate().to(LoadConfigData.getProperty("mainWebApp"));
        return this;
    }
    public LoginPO _inputLogin(String login)
    {
        InputLogin.sendKeys(login);
        return this;
    }
    public LoginPO _inputPassword(String password)
    {
        InputPassword.sendKeys(password);
        return this;
    }
    public LoginPO PressLoginBtn()
    {
        ButtonLogIn.click();
        return this;
    }
    public LoginPO Timer(int time)
    {
        try {
            Thread.sleep(time);
        } catch(InterruptedException e) {
            System.out.println("got interrupted!");
        }
        return this;
    }



}
