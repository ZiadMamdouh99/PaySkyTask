package pages;

import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.Locators;
import utils.*;
import utils.jasonutills;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;




public class LoginPage extends SeleniumBase {

    // Method to log in with username and password
    public static void login() throws InterruptedException {
        JSONObject jsonData = jasonutills.readJSONFile("testData.json");
        String email = jsonData.getJSONObject("registration").getString("email");
        String password = jsonData.getJSONObject("registration").getString("password");
        waitForPageToLoad(Locators.LOGIN_EMAIL);

        // Enter the username
        Thread.sleep(2000);
        clickOnElement(Locators.LOGIN_EMAIL);
        sendKeysToElement(Locators.LOGIN_EMAIL, email);

        // Enter the password
        clickOnElement(Locators.LOGIN_PASSWORD);
        sendKeysToElement(Locators.LOGIN_PASSWORD, password);

        // Click the login button

        clickOnElement(Locators.LOGIN_SUBMIT);
        Thread.sleep(2000);



    }


}
