package page_factory.PO;

import LoadData.LoadConfigData;
import decorator.ButtonDec;
import decorator.CustomElement;
import decorator.InputDec;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import web_driver.Browsers;

public class UserProfilePO {


    //@FindBy(xpath = "//*[@id=\"react-root\"]/div/div/section/main/div/header/section/div[1]/div[2]/div/div[1]/button")
    //private ButtonDec ClickMail;
    @FindBy(xpath = "//*[@id=\"react-root\"]/div/div/section/div/div[2]/div/div/div[2]/div[2]/div/div[2]/div/div/div[2]/textarea")
    private InputDec TextMessage;
    @FindBy(xpath = "//*[@id=\"react-root\"]/div/div/section/div/div[2]/div/div/div[2]/div[2]/div/div[2]/div/div/div[3]/button")
    private ButtonDec ButtonSendMessage;


  public UserProfilePO ClickPost()
    {
        Browsers.getDriver().navigate().to("https://www.instagram.com/p/CXedGEhr4Qj/");
        return this;
    }
    public UserProfilePO ClickLike()
    {
       Browsers.getDriver().findElement(By.xpath("//div/section/span[@class=\'_15y0l\']/button[@class=\'wpO6b  \']")).click();
        return this;
    }
    public UserProfilePO ClickMessage()
    {
       Browsers.getDriver().findElement(By.xpath("//*[@id=\"react-root\"]/div/div/section/main/div/header/section/div[1]/div[2]/div/div[1]/button")).click();
        return this;
    }
    public UserProfilePO InputTextMessage(String message)
    {
        TextMessage.sendKeys(message);
        return this;
    }
    public UserProfilePO ButtonSendMessage()
    {
        ButtonSendMessage.click();
        return this;
    }

    public UserProfilePO Timer(int time)
    {
        try {
            Thread.sleep(time);
        } catch(InterruptedException e) {
            System.out.println("got interrupted!");
        }
        return this;
    }

}
