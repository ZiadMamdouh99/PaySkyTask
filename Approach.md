Approach
This project is structured using the Page Object Model (POM) and data-driven testing principles to ensure modularity, reusability, and scalability:

Page Object Model (POM):

Each web page (or functionality) is represented by a dedicated class, encapsulating the elements and interactions specific to that page.
Classes: ProductPage, CartPage, and CheckoutPage handle the interactions with respective web pages, improving test readability and maintainability.
Data-Driven Testing:

Test data is externalized into a JSON file (testData.json) to allow flexibility in testing with different datasets without changing the code.
The TestDataLoader class reads and parses JSON files to dynamically provide input to the tests.
Utility Classes:

SeleniumBase: Encapsulates WebDriver setup and configuration, ensuring clean and centralized Selenium setup logic.
Locators: Centralizes all locators into a single class to avoid hardcoding them across multiple classes. This makes it easier to maintain when locators change.
Main Execution (NopCommerceCheckout):

The main class coordinates the user flow:
Product selection and addition to the cart.
Proceeding to checkout.
Filling in billing/shipping details.
Completing the order.
