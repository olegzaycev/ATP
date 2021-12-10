package Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class LoginPage {
    public WebDriver driver;
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(xpath = "//*[@id=\"loginForm\"]/div/div[1]/div/label/input")
    private WebElement InputLogin;

    @FindBy(xpath = "//*[@id=\"loginForm\"]/div/div[2]/div/label/input" )
    private WebElement InputPassword;

    @FindBy(xpath = "//*[@id=\"loginForm\"]/div/div[3]/button/div")
    private WebElement ButtonLogIn;

    public void ActionInputLogin(String login)
    {
        InputLogin.sendKeys(login);
    }
    public void ActionInputPassword(String password)
    {
        InputPassword.sendKeys(password);
    }
    public void ActionPressLogButton()
    {
        ButtonLogIn.click();
    }

}
