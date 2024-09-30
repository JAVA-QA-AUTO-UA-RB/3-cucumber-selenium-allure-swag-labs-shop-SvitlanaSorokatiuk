package org.example.steps;

import io.cucumber.java.en.*;
import org.example.helpers.SingletonBrowserProvider;
import org.example.pages.CartPage;
import org.example.pages.LoginPage;
import org.example.pages.ProductsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SwagLabsCatalogSteps {

    private WebDriver driver;

    @When("the user adds product {string} to the shopping cart")
    public void theUserAddsProductToTheShoppingCart(String productName) {
        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.addToCart(productName);
    }

    @And("the user goes to the product cart")
    public void theUserGoesToTheProductCart() {
        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.goToShoppingCard();
    }

    @Then("the added product {string} is displayed in the shopping cart page")
    public void theAddedProductIsDisplayedInTheShoppingCartPage(String expectedProductName) {
        CartPage cartPage = new CartPage(driver);
        String actualProductName = cartPage.getAddedProductName();
        Assert.assertTrue(cartPage.isProductInCart(expectedProductName));
    }

    }
