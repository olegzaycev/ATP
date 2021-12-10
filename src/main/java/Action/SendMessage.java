package Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SendMessage {


    public WebDriver driver;
    public SendMessage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(xpath = "//*[@id=\"react-root\"]/div/div/section/main/div/header/section/div[1]/div[2]/div/div[1]/button")
    private WebElement ClickMail;
    @FindBy(xpath = "//*[@id=\"react-root\"]/div/div/section/div/div[2]/div/div/div[2]/div[2]/div/div[2]/div/div/div[2]/textarea")
    private WebElement TextMessage;



    public void ClickOnMail()
    {
        ClickMail.click();
    }
    public void SendMessagetoUser(String text)
    {
        TextMessage.sendKeys(text);
    }

}
