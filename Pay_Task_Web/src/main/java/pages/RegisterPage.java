package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Locators;
import utils.SeleniumBase;
import utils.jasonutills;
import org.json.JSONObject;

import java.time.Duration;


public class RegisterPage extends SeleniumBase {


    // Method to complete the registration process
    public static void Registration() throws InterruptedException {
        // Read the test data from the JSON file
        JSONObject jsonData = jasonutills.readJSONFile("testData.json");

        // Extract registration details from JSON
        String firstName = jsonData.getJSONObject("registration").getString("firstName");
        String lastName = jsonData.getJSONObject("registration").getString("lastName");
        String email = jsonData.getJSONObject("registration").getString("email");
        String password = jsonData.getJSONObject("registration").getString("password");
        String dob = jsonData.getJSONObject("registration").getString("dob");
        String address = jsonData.getJSONObject("registration").getString("address");
        String postcode = jsonData.getJSONObject("registration").getString("postcode");
        String city = jsonData.getJSONObject("registration").getString("city");
        String state = jsonData.getJSONObject("registration").getString("state");
        String country = jsonData.getJSONObject("registration").getString("country");
        String phone = jsonData.getJSONObject("registration").getString("phone");

      SeleniumBase.clickOnElement(Locators.SIGN_IN_NAV);

        SeleniumBase.clickOnElement(Locators.REGISTER_LINK);


// Fill out the registration form
        clickOnElement(Locators.REGISTRATION_FIRST_NAME);
        sendKeysToElement(Locators.REGISTRATION_FIRST_NAME, firstName);

        clickOnElement(Locators.REGISTRATION_LAST_NAME);
        sendKeysToElement(Locators.REGISTRATION_LAST_NAME, lastName);

        clickOnElement(Locators.REGISTRATION_EMAIL);
        sendKeysToElement(Locators.REGISTRATION_EMAIL, email);

        clickOnElement(Locators.REGISTRATION_PASSWORD);
        sendKeysToElement(Locators.REGISTRATION_PASSWORD, password);

        clickOnElement(Locators.REGISTRATION_DOB);
        sendKeysToElement(Locators.REGISTRATION_DOB, dob);

        clickOnElement(Locators.REGISTRATION_ADDRESS);
        sendKeysToElement(Locators.REGISTRATION_ADDRESS, address);

        clickOnElement(Locators.REGISTRATION_POSTCODE);
        sendKeysToElement(Locators.REGISTRATION_POSTCODE, postcode);

        clickOnElement(Locators.REGISTRATION_CITY);
        sendKeysToElement(Locators.REGISTRATION_CITY, city);

        clickOnElement(Locators.REGISTRATION_STATE);
        sendKeysToElement(Locators.REGISTRATION_STATE, state);

// Select the country from the dropdown (use XPath if needed)
        clickOnElement(Locators.REGISTRATION_COUNTRY);
        sendKeysToElement(Locators.REGISTRATION_COUNTRY,"e");
        sendKeysToElement(Locators.REGISTRATION_COUNTRY,"e");

        Keys enter =Keys.ENTER;


        clickOnElement(Locators.REGISTRATION_PHONE);
        sendKeysToElement(Locators.REGISTRATION_PHONE, phone);

// Submit the registration form (by clicking the register button)
        Thread.sleep(2000);
        clickOnElement(Locators.REGISTRATION_SUBMIT);
        Thread.sleep(2000);

    }
}
