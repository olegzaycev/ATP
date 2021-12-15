package decorator;

import org.openqa.selenium.WebElement;

public class InputDec  extends CustomElement{

    public InputDec(WebElement webElement) {
        super(webElement);
    }

    public void sendKeys(String dataText)
    {
        getWebElement().sendKeys(dataText);
    }

}
