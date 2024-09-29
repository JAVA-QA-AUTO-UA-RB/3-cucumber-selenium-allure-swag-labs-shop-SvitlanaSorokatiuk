package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    private WebDriver driver;

    public CartPage (WebDriver driver) {
        this.driver = driver;
    }

    public static final By removeButton = By.id("remove-test.allthethings()-t-shirt-(red)");
    public static final By checkoutButton = By.id("checkout");
    public static final By continueShoppingButton = By.id("continue-shopping");

    public void removeProduct() {
        driver.findElement(removeButton).click();
    }

    public void goToCheckout() {
        driver.findElement(checkoutButton).click();
    }

}
