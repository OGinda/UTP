package ui.smokes;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import pro.utorg.CookiesPopup;
import pro.utorg.LandingPageObject;
import pro.utorg.signIn.EmailPageObject;
import pro.utorg.signIn.OtpPageObject;

import java.io.IOException;
import java.time.Duration;
import java.util.Collections;

public class AuthorizationFlow_RegistrationNewUserTest {

    /*private ChromeOptions opt = new ChromeOptions()
            //.addArguments("--headless=new")
            .addArguments("--disable-extensions")
            .addArguments("--profile-directory=Default")
            .addArguments("--incognito")
            .addArguments("--disable-plugins-discovery")
            .addArguments("--start-maximized")
            .setExperimentalOption(
                    "useAutomationExtension", null);*/
    //private ChromeOptions options = new ChromeOptions().addArguments("--headless=new", "--incognito");
    private Dimension webScreen = new Dimension(1250, 940);

    private WebDriver driver = new ChromeDriver();
    private CookiesPopup cookiesPopup = new CookiesPopup(driver);
    private LandingPageObject landingPageObject = new LandingPageObject(driver);
    private EmailPageObject emailPageObject = new EmailPageObject(driver);
    private OtpPageObject otpPageObject = new OtpPageObject(driver);
    private String email = "test@gmail.com";

    @Before
    public void before() throws InterruptedException {
        System.out.println("The 'Check All Elements On The Landing Page Tests' run starts");
        driver.manage().window().setSize(webScreen);
        driver.get("https://utorg.pro");
        //driver.get("https://app.utpay.io/account/login");
        //Thread.sleep(8000);
        cookiesPopup.closeCookiesPopup();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }

    @Test
    public void test1() {
        landingPageObject.loginButtonClick();
        String emailPageTitle = emailPageObject.getEmailPageTitle();
        Assert.assertEquals("Sign in", emailPageTitle);
        emailPageObject.typeEmailStep(email);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @After
    public void after() {
        if (driver != null) {
            driver.quit();
        }
    }
}
