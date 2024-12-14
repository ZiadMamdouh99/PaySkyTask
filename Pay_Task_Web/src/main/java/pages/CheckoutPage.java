package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import utils.Locators;
import utils.SeleniumBase;
import org.testng.Assert;




public class CheckoutPage extends SeleniumBase {



    public static void Checkout() throws InterruptedException {
        clickOnElement(Locators.CHECKOUT_PROCEED_1);
        clickOnElement(Locators.CHECKOUT_PROCEED_2);
        clickOnElement(Locators.CHECKOUT_PROCEED_3);
        sendKeysToElement(Locators.CHECKOUT_PAYMENT_METHOD,"c");

        Keys enter =Keys.ENTER;
        clickOnElement(Locators.CHECKOUT_FINISH);
        Thread.sleep(500);
        clickOnElement(Locators.CHECKOUT_FINISH);



    }
}
