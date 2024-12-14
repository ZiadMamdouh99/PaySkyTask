package Tests;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;
import utils.*;

public class CheckoutTest {

    private SeleniumBase seleniumBase;

    @BeforeTest
    public void setup() throws InterruptedException {
        // Initialize SeleniumBase and open the website
        seleniumBase = new SeleniumBase();
        seleniumBase.setUp();  // Set up WebDriver from SeleniumBase class
        seleniumBase.navigateToWebsite("https://www.practicesoftwaretesting.com/");  // Navigate to the website

    }




    @Test
    public void Register() throws InterruptedException {



        RegisterPage.Registration();

    }
    @Test(dependsOnMethods = "Register")
    public void Login() throws InterruptedException {


        LoginPage.login();
        HomePage.home();


    }
    @Test(dependsOnMethods = "Login")
    public void product () throws InterruptedException {
        ProductPage.ProductSelection();

    }
    @Test(dependsOnMethods = "product")
    public void checkout() throws InterruptedException {
        CheckoutPage.Checkout();
    }

    @AfterTest
    public void tearDown() {
        // Close the browser after tests
        seleniumBase.tearDown();
    }
}

