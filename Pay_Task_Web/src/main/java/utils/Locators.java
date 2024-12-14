package utils;

import org.openqa.selenium.By;

public class Locators {

    // Login Page Locators
    public static final By LOGIN_EMAIL = By.xpath("//*[@data-test='email']");
    public static final By LOGIN_PASSWORD = By.xpath("//*[@data-test='password']");
    public static final By LOGIN_SUBMIT = By.xpath("//*[@data-test='login-submit']");

    // Registration Page Locators
    public static final By REGISTER_LINK = By.xpath("//*[@data-test='register-link']");

    public static final By REGISTRATION_EMAIL = By.xpath("//*[@data-test='email']");
    public static final By REGISTRATION_FIRST_NAME = By.xpath("//*[@data-test='first-name']");
    public static final By REGISTRATION_LAST_NAME = By.xpath("//*[@data-test='last-name']");
    public static final By REGISTRATION_DOB = By.xpath("//*[@data-test='dob']");
    public static final By REGISTRATION_ADDRESS = By.xpath("//*[@data-test='address']");
    public static final By REGISTRATION_POSTCODE = By.xpath("//*[@data-test='postcode']");
    public static final By REGISTRATION_CITY = By.xpath("//*[@data-test='city']");
    public static final By REGISTRATION_STATE = By.xpath("//*[@data-test='state']");
    public static final By REGISTRATION_COUNTRY = By.xpath("//*[@data-test='country']");
    public static final By REGISTRATION_PHONE = By.xpath("//*[@data-test='phone']");
    public static final By REGISTRATION_PASSWORD = By.xpath("//*[@data-test='password']");
    public static final By REGISTRATION_SUBMIT = By.xpath("//*[@data-test='register-submit']");

    // Checkout Page Locators
    public static final By CHECKOUT_PROCEED_1 = By.xpath("//*[@data-test='proceed-1']");
    public static final By CHECKOUT_PROCEED_2 = By.xpath("//*[@data-test='proceed-2']");
    public static final By CHECKOUT_ADDRESS = By.xpath("//app-address//*[@class='col-md-6']");
    public static final By CHECKOUT_CITY = By.xpath("//*[@data-test='city']");
    public static final By CHECKOUT_STATE = By.xpath("//*[@data-test='state']");
    public static final By CHECKOUT_COUNTRY = By.xpath("//*[@data-test='country']");
    public static final By CHECKOUT_POSTCODE = By.xpath("//*[@data-test='postcode']");
    public static final By CHECKOUT_PROCEED_3 = By.xpath("//*[@data-test='proceed-3']");
    public static final By CHECKOUT_PAYMENT_METHOD = By.xpath("//*[@data-test='payment-method']");
    public static final By CHECKOUT_FINISH = By.xpath("//*[@data-test='finish']");
    public static final By ORDER_CONFIRMATION = By.xpath("//*[@id='order-confirmation']");

    // Product Page Locators
    public static final By PRODUCT_NAME = By.xpath("//div[@class='card-img-wrapper']//img[@alt='Pliers']");

    public static final By ADD_TO_CART = By.xpath("//*[@data-test='add-to-cart']");
    public static final By SUCCESS_MESSAGE = By.xpath("//div[contains(@class, 'toast-success')]//div[@role='alert']");

    public static final By CART_ICON = By.id("lblCartCount");

    // Home Page Locators
    public static By homeLink = By.xpath("//*[@data-test='nav-home']");

    public static By SIGN_IN_NAV = By.xpath("//a[@routerlink='/auth/login']");
    public static final By SIGN_OUT_NAV = By.xpath("//*[@data-test='nav-sign-out']");
    public static final By SEARCH_BAR = By.xpath("//*[@data-test='search-bar']");
}
