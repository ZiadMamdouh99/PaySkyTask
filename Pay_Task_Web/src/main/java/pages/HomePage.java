package pages;

import org.openqa.selenium.WebDriver;
import utils.Locators;
import utils.SeleniumBase;



public class HomePage extends SeleniumBase {
    private WebDriver driver;

    public HomePage() {
        this.driver = driver;
    }

    public static void home() {
        // Wait for the home page to load completely
        clickOnElement(Locators.homeLink);
    }
}
