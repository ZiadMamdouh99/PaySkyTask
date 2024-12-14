package pages;

import org.openqa.selenium.WebDriver;
import utils.Locators;
import utils.SeleniumBase;


public class ProductPage extends SeleniumBase {




    // Perform all steps: select product, add to cart, verify success message, and navigate to cart
    public static void ProductSelection() throws InterruptedException {
        // Step 1: Click on the specified product
        waitForPageToLoad(Locators.PRODUCT_NAME);
        clickOnElement(Locators.PRODUCT_NAME);

        // Step 2: Wait for the "Add to Cart" button to be visible and click it
        clickOnElement(Locators.ADD_TO_CART);

        // Step 3: Verify the success message appears
        boolean isSuccessMessageDisplayed = isElementVisible(Locators.SUCCESS_MESSAGE);
        if (isSuccessMessageDisplayed) {
            System.out.println("Success Message: Product added to shopping cart.");
        } else {
            throw new AssertionError("Success message not displayed.");
        }

        // Step 4: Click the cart icon to navigate to the cart page
        HomePage.home();
        clickOnElement(Locators.CART_ICON);
    }
}
