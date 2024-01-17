package pro.utorg.signIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class EmailPageObject {
    private WebDriver driver;

    public EmailPageObject(WebDriver driver) {
        this.driver = driver;
    }

    private By emailPageTitle = By.xpath("//h4");
    private By emailInput = By.xpath("//input[@name='login']");
    private By submitButton = By.xpath("//button[@type='submit']");

    public String getEmailPageTitle() {
        return driver.findElement(emailPageTitle).getText();
    }

    public EmailPageObject typeEmail(String email) {
        driver.findElement(emailInput).sendKeys(email);
        return this;
    }

    public OtpPageObject submitButtonClick() {
        driver.findElement(submitButton).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        return new OtpPageObject(driver);
    }

    public OtpPageObject typeEmailStep(String email){
        this.typeEmail(email);
        this.submitButtonClick();
        return new OtpPageObject(driver);
    }
}
