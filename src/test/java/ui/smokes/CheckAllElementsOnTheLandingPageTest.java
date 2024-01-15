package ui.smokes;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pro.utorg.CookiesPopup;
import pro.utorg.LandingPageObject;

public class CheckAllElementsOnTheLandingPageTest {
    private ChromeOptions options = new ChromeOptions().addArguments("--headless=new");
    private Dimension webScreen = new Dimension(1250, 940);
    private WebDriver driver = new ChromeDriver(options);
    private LandingPageObject landingPageObject = new LandingPageObject(driver);
    private CookiesPopup cookiesPopup = new CookiesPopup(driver);

    @Before
    public void before() {
        driver.manage().window().setSize(webScreen);
        driver.get("https://utorg.pro");
    }

    @Test
    public void test1_checkAllElementsOnTheLandingPage() throws InterruptedException {
        cookiesPopup.closeCookiesPopup();
        String widgetTitle = landingPageObject.getWidgetTitle();
        Assert.assertEquals("Instantly buy BTC", widgetTitle);
    }

    @After
    public void after() {
        if (driver != null) {
            driver.quit();
        }
    }
}
