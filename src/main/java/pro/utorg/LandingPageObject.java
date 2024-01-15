package pro.utorg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPageObject {
    private WebDriver driver;

    public LandingPageObject(WebDriver driver){
        this.driver = driver;
    }

    private By widgetTitle = By.xpath("//div[@class='widgetTitle']");

    public String getWidgetTitle(){
        return driver.findElement(widgetTitle).getText();
    }

    public LandingPageObject(){
        this.getWidgetTitle();
    }
}
