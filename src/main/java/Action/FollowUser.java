package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FollowUser {
    public WebDriver driver;
    public FollowUser(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(xpath = "//*[@id=\"react-root\"]/div/div/section/main/div/header/section/div[1]/div[2]/div/div/div/span/span[1]/button")
    private WebElement ButtonFollowUser;

    public void Follow()
    {
        ButtonFollowUser.click();
    }
}
