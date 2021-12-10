package Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPeople {

    public WebDriver driver;
    public SearchPeople(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(xpath = "//*[@id=\"react-root\"]/div/div/section/nav/div[2]/div/div/div[2]/input")
    private WebElement InputSearch;
    @FindBy(xpath = "//*[@id=\"react-root\"]/div/div/section/nav/div[2]/div/div/div[2]/div[3]/div/div[2]/div/div[1]/a")
    private WebElement ClickUser;

    public void InputTextToSearch(String user)
    {
        InputSearch.sendKeys(user);
    }
    public void ClickOnUser()
    {
        ClickUser.click();
    }



}
