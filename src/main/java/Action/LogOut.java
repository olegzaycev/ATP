package Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut {
    public WebDriver driver;
    public LogOut(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }


    @FindBy(xpath = "//*[@id=\"react-root\"]/div/div/section/nav/div[2]/div/div/div[3]/div/div[6]/span")
    private WebElement ClickToIcon;
    @FindBy(xpath = "//*[@id=\"react-root\"]/div/div/section/nav/div[2]/div/div/div[3]/div/div[6]/div[2]/div[2]/div[2]/div[2]")
    private WebElement ClickExit;




    public void ClickIcon(){ClickToIcon.click();}
    public void ClickToExit(){ClickExit.click();}



}
