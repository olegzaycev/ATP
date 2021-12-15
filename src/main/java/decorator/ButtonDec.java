package decorator;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

public class ButtonDec extends CustomElement{



    public ButtonDec(WebElement webElement) {
        super(webElement);
    }

    public void click() {
        getWebElement().click();
    }



}
