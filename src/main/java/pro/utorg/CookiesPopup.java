package pro.utorg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CookiesPopup {
    private WebDriver driver;

    public CookiesPopup(WebDriver driver){
        this.driver = driver;
    }

    private By cookiesPopup = By.xpath("//div[@class='gdprPopup']");
    private By cookiesPopupButton = By.xpath("//button[text()='Acknowledged']");

    public void checkCookiesPopupVibility() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(cookiesPopup).isDisplayed();
    }

    public CookiesPopup clickCloseCookiesPopup() throws InterruptedException {
        driver.findElement(cookiesPopupButton).click();
        Thread.sleep(3000);
        return this;
    }

    public CookiesPopup closeCookiesPopup() throws InterruptedException {
        this.checkCookiesPopupVibility();
        this.clickCloseCookiesPopup();
        return this;
    }
}
