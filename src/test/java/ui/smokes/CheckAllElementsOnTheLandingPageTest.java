package ui.smokes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pro.utorg.CookiesPopup;
import pro.utorg.LandingPageObject;

import java.time.Duration;

public class CheckAllElementsOnTheLandingPageTest {
    private ChromeOptions options = new ChromeOptions().addArguments("--headless=new", "--incognito");
    private Dimension webScreen = new Dimension(1250, 940);
    private WebDriver driver = new ChromeDriver(options);
    private LandingPageObject landingPageObject = new LandingPageObject(driver);
    private CookiesPopup cookiesPopup = new CookiesPopup(driver);

    @Before
    public void before() throws InterruptedException {
        System.out.println("The 'Check All Elements On The Landing Page Tests' run starts");
        driver.manage().window().setSize(webScreen);
        driver.get("https://utorg.pro");
        cookiesPopup.closeCookiesPopup();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }

    @Test
    public void test1_checkAllElementsOnTheLandingPage() {
        /*String landingTitle = landingPageObject.getLandingTitle();
        Assert.assertEquals("Buy Bitcoin with card", landingTitle);*/
        landingPageObject.checkLandingPageElements();

    }

    @After
    public void after() {
        if (driver != null) {
            driver.quit();
        }
    }
}
