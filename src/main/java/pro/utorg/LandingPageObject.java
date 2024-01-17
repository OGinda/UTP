package pro.utorg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPageObject {
    private WebDriver driver;

    public LandingPageObject(WebDriver driver) {
        this.driver = driver;
    }

    private By utaBanner = By.xpath("//div[@class='banner']");
    private By headerLogo = By.xpath("//a[@class='header_logo']");
    private By headerMenu = By.xpath("//div[@class='header_menu']");
    private By widgetTitle = By.xpath("//div[@class='widgetTitle']");
    private By widget = By.xpath("//div[@class='widget']");
    private By landingTitle = By.xpath("//h1");
    private By advantages = By.xpath("//div[@class='advantages']");
    private By pricingTitle = By.xpath("//h2[@class='pricingTitle']");
    private By pricingText = By.xpath("//div[@class='pricingText']");
    private By limitsTitle = By.xpath("//h2[@class='title'][contains(text(), 'High limits')]");
    private By cardsCarusel = By.xpath("//div[@class='cards']");
    private By howToBuyTitle = By.xpath("//div[@id='howto1']");
    private By articles = By.xpath("//div[@id='article-0']");
    private By guide = By.xpath("//div[@id='guide']");
    private By blog = By.xpath("//div[contains(@class, 'blog')]");
    private By questionsTitle = By.xpath("//h2[contains(text(), 'Frequently asked questions')]");
    private By questionsGuide = By.xpath("//div[@id='faq']//div[@class='guide']");
    private By desktopSupport = By.xpath("//div[contains(@class, 'desktopView')]/div[@class='support']");
    private By desktopInfoFooter = By.xpath("//footer[contains(@class, 'desktop')]//div[@class='info']");
    private By footerMenu = By.xpath("//footer[contains(@class, 'desktop')]//div[@class='menu']");
    private By promoLinks = By.xpath("//footer[contains(@class, 'desktop')]//div[@class='promoLinks']");

    public LandingPageObject bannerVisibility() {
        // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", utaBanner);
        driver.findElement(utaBanner).isDisplayed();
        return this;
    }

    public LandingPageObject headerLogoVisibility() {
        driver.findElement(headerLogo).isDisplayed();
        return this;
    }

    public LandingPageObject headerMenuVisibility() {
        driver.findElement(headerMenu).isDisplayed();
        return this;
    }

    public LandingPageObject widgetTitleVisibility() {
        driver.findElement(widgetTitle).isDisplayed();
        return this;
    }

    public LandingPageObject widgetVisibility() {
        driver.findElement(widget).isDisplayed();
        return this;
    }

    public String getLandingTitle() {
        return driver.findElement(landingTitle).getText();
    }

    public LandingPageObject advantagesVisibility() {
        driver.findElement(advantages).isDisplayed();
        return this;
    }

    public LandingPageObject pricingTitleVisibility() {
        driver.findElement(pricingTitle).isDisplayed();
        return this;
    }

    public LandingPageObject pricingTextVisibility() {
        driver.findElement(pricingText).isDisplayed();
        return this;
    }

    public LandingPageObject limitsTitle() {
        driver.findElement(limitsTitle).isDisplayed();
        return this;
    }

    public LandingPageObject cardsCaruselVisibility() {
        driver.findElement(cardsCarusel).isDisplayed();
        return this;
    }

    public LandingPageObject howToBuyTitle() {
        driver.findElement(howToBuyTitle).isDisplayed();
        return this;
    }

    public LandingPageObject articlesVisibility() {
        driver.findElement(articles).isDisplayed();
        return this;
    }

    public LandingPageObject guideVisibility() {
        driver.findElement(guide).isDisplayed();
        return this;
    }

    public LandingPageObject blogVisibility() {
        driver.findElement(blog).isDisplayed();
        return this;
    }

    public LandingPageObject questionsTitle() {
        driver.findElement(questionsTitle).isDisplayed();
        return this;
    }

    public LandingPageObject questionsGuideVisibility() {
        driver.findElement(questionsGuide).isDisplayed();
        return this;
    }

    public LandingPageObject desktopSupportVisibility() {
        driver.findElement(desktopSupport).isDisplayed();
        return this;
    }

    public LandingPageObject desktopInfoFooterVisibility() {
        driver.findElement(desktopInfoFooter).isDisplayed();
        return this;
    }

    public LandingPageObject footerMenuVisibility() {
        driver.findElement(footerMenu).isDisplayed();
        return this;
    }

    public LandingPageObject promoLinksVisibility() {
        driver.findElement(promoLinks).isDisplayed();
        return this;
    }

    public LandingPageObject checkLandingPageElements() {
        this.bannerVisibility();
        this.headerLogoVisibility();
        this.headerMenuVisibility();
        this.widgetVisibility();
        this.advantagesVisibility();
        this.pricingTitleVisibility();
        this.pricingTextVisibility();
        this.limitsTitle();
        this.cardsCaruselVisibility();
        this.howToBuyTitle();
        this.articlesVisibility();
        this.guideVisibility();
        this.blogVisibility();
        this.questionsTitle();
        this.questionsGuideVisibility();
        this.desktopSupportVisibility();
        this.desktopInfoFooterVisibility();
        this.footerMenuVisibility();
        this.promoLinksVisibility();
        this.widgetTitleVisibility();
        return this;
    }
}
