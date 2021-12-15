package web_driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Browsers {

    private final static ThreadLocal<WebDriver> INSTANCE =new InheritableThreadLocal<>();

    public static WebDriver getDriver(){
        if(INSTANCE.get()==null){
            throw new RuntimeException("init driver first");
        }
        return INSTANCE.get();
    }
    public static void initDriver(String browserName){
        switch (browserName) {
            case "Chrome" -> {
                System.setProperty("webdriver.chrome.driver", "/Users/a111/IdeaProjects/AutomationTest/src/main/resources/drivers/chromedriver");
                INSTANCE.set(new ChromeDriver());
            }
            case "Firefox" ->{
                System.setProperty("webdriver.gecko.driver", "/Users/a111/IdeaProjects/AutomationTest/src/main/resources/drivers/geckodriver");
                INSTANCE.set(new FirefoxDriver());
            }
            default -> throw new RuntimeException("Error:" + browserName);
        }
    }
}
