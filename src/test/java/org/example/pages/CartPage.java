package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {

    private WebDriver driver;

    public CartPage (WebDriver driver) {
        this.driver = driver;
    }

    public static final By removeButton = By.id("remove-test.allthethings()-t-shirt-(red)");
    public static final By checkoutButton = By.id("checkout");
    public static final By continueShoppingButton = By.id("continue-shopping");
    public static final By addedProduct = By.cssSelector("div[data-test=\"inventory-item-name\"]");

    public void removeProduct() {
        driver.findElement(removeButton).click();
    }

    public void goToCheckout() {
        driver.findElement(checkoutButton).click();
    }

    public String getAddedProductName() {
        return driver.findElement(addedProduct).getText();
    }

    public boolean isProductInCart(String expectedProductName) {
        String xpath = "//div[@data-test='inventory-item-name' and text()='" + expectedProductName + "']";
        WebElement product = driver.findElement(By.xpath(xpath));
        return product.isDisplayed();
    }


}
